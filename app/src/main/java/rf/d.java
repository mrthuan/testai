package rf;

import android.opengl.GLES20;

/* compiled from: GPUImageFilter.java */
/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29513a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f29514b;
    public final /* synthetic */ e c;

    public d(e eVar, int i10, float f10) {
        this.c = eVar;
        this.f29513a = i10;
        this.f29514b = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.e();
        GLES20.glUniform1f(this.f29513a, this.f29514b);
    }
}
