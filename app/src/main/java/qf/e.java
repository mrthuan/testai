package qf;

import android.opengl.GLES20;

/* compiled from: GPUImageRenderer.java */
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ jp.co.cyberagent.android.gpuimage.a f29323a;

    public e(jp.co.cyberagent.android.gpuimage.a aVar) {
        this.f29323a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jp.co.cyberagent.android.gpuimage.a aVar = this.f29323a;
        GLES20.glDeleteTextures(1, new int[]{aVar.c}, 0);
        aVar.c = -1;
    }
}
