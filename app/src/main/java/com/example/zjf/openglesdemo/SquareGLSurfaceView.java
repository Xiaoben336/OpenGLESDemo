package com.example.zjf.openglesdemo;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class SquareGLSurfaceView extends GLSurfaceView {
    private final SquareRenderer squareRenderer;
    public SquareGLSurfaceView(Context context) {
        super(context);
        // 创建OpenGL ES 2.0的上下文
        setEGLContextClientVersion(2);
        squareRenderer = new SquareRenderer();
        //设置Renderer用于绘图
        setRenderer(squareRenderer);
        //只有在绘制数据改变时才绘制view，可以防止GLSurfaceView帧重绘
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
