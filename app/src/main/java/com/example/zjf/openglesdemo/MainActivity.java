package com.example.zjf.openglesdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnTriangle;
    private Button btnSquare;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSquare = (Button) findViewById(R.id.btnSquare);
        btnTriangle = (Button) findViewById(R.id.btnTrangle);

        btnTriangle.setOnClickListener(this);
        btnSquare.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()){
            case R.id.btnTrangle:
                intent.setClass(MainActivity.this,TriangleActivity.class);
                startActivity(intent);
                break;
            case R.id.btnSquare:
                intent.setClass(MainActivity.this,SquareActivity.class);
                startActivity(intent);
                break;
                default:
                    break;
        }
    }
}
