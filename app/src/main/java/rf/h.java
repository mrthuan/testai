package rf;

import android.graphics.Bitmap;
import android.opengl.GLES20;

/* compiled from: GPUImageTwoInputFilter.java */
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bitmap f29533a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f29534b;

    public h(i iVar, Bitmap bitmap) {
        this.f29534b = iVar;
        this.f29533a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        i iVar = this.f29534b;
        if (iVar.f29537k == -1 && (bitmap = this.f29533a) != null && !bitmap.isRecycled()) {
            GLES20.glActiveTexture(33987);
            iVar.f29537k = sf.a.b(bitmap, -1, false);
        }
    }
}
