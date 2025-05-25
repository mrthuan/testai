package rf;

import android.graphics.Bitmap;
import android.opengl.GLES20;

/* compiled from: GPUImageAlphaBlendFilter.java */
/* loaded from: classes.dex */
public class a extends i {

    /* renamed from: n  reason: collision with root package name */
    public int f29507n;

    /* renamed from: o  reason: collision with root package name */
    public float f29508o = 0.5f;

    @Override // rf.i, rf.e
    public final void i() {
        super.i();
        this.f29507n = GLES20.glGetUniformLocation(this.f29517d, "mixturePercent");
    }

    @Override // rf.e
    public final void j() {
        Bitmap bitmap;
        Bitmap bitmap2 = this.f29539m;
        if (bitmap2 != null && !bitmap2.isRecycled() && ((bitmap = this.f29539m) == null || !bitmap.isRecycled())) {
            this.f29539m = bitmap;
            if (bitmap != null) {
                h hVar = new h(this, bitmap);
                synchronized (this.f29515a) {
                    this.f29515a.addLast(hVar);
                }
            }
        }
        float f10 = this.f29508o;
        this.f29508o = f10;
        l(f10, this.f29507n);
    }
}
