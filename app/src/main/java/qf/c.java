package qf;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLES20;
import java.io.IOException;

/* compiled from: GPUImageRenderer.java */
/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Camera f29319a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ jp.co.cyberagent.android.gpuimage.a f29320b;

    public c(jp.co.cyberagent.android.gpuimage.a aVar, Camera camera) {
        this.f29320b = aVar;
        this.f29319a = camera;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Camera camera = this.f29319a;
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
        jp.co.cyberagent.android.gpuimage.a aVar = this.f29320b;
        aVar.f19413d = surfaceTexture;
        try {
            camera.setPreviewTexture(aVar.f19413d);
            camera.setPreviewCallback(aVar);
            camera.startPreview();
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }
}
