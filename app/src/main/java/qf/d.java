package qf;

import android.opengl.GLES20;

/* compiled from: GPUImageRenderer.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ rf.e f29321a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ jp.co.cyberagent.android.gpuimage.a f29322b;

    public d(jp.co.cyberagent.android.gpuimage.a aVar, rf.e eVar) {
        this.f29322b = aVar;
        this.f29321a = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jp.co.cyberagent.android.gpuimage.a aVar = this.f29322b;
        rf.e eVar = aVar.f19411a;
        aVar.f19411a = this.f29321a;
        if (eVar != null) {
            eVar.d();
        }
        aVar.f19411a.e();
        GLES20.glUseProgram(aVar.f19411a.f29517d);
        aVar.f19411a.k(aVar.f19417h, aVar.f19418i);
    }
}
