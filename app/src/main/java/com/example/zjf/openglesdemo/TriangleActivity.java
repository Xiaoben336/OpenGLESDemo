package com.example.zjf.openglesdemo;

import android.app.Activity;
import android.os.Bundle;

public class TriangleActivity extends Activity{
    private MyGLSurfaceView myGLSurfaceView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myGLSurfaceView = new MyGLSurfaceView(this);
        setContentView(myGLSurfaceView);
    }
}
