package com.example.zjf.openglesdemo;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class MyGLSurfaceView extends GLSurfaceView {
    private final TriggerRenderer triggerRender;
    public MyGLSurfaceView(Context context) {
        super(context);
        // 创建OpenGL ES 2.0的上下文
        setEGLContextClientVersion(2);
        triggerRender = new TriggerRenderer();
        //设置Renderer用于绘图
        setRenderer(triggerRender);
        //只有在绘制数据改变时才绘制view，可以防止GLSurfaceView帧重绘
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
