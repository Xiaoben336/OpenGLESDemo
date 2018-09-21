package com.example.zjf.openglesdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

public class SquareActivity extends Activity {
    private SquareGLSurfaceView squareGLSurfaceView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        squareGLSurfaceView = new SquareGLSurfaceView(this);
        setContentView(squareGLSurfaceView);
    }
}
