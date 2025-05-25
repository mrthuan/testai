package qf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: GPUImageRenderer.java */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bitmap f29324a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f29325b = false;
    public final /* synthetic */ jp.co.cyberagent.android.gpuimage.a c;

    public f(jp.co.cyberagent.android.gpuimage.a aVar, Bitmap bitmap) {
        this.c = aVar;
        this.f29324a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap bitmap;
        Bitmap bitmap2 = this.f29324a;
        int width = bitmap2.getWidth() % 2;
        jp.co.cyberagent.android.gpuimage.a aVar = this.c;
        Bitmap bitmap3 = null;
        if (width == 1) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap2.getWidth() + 1, bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
            createBitmap.setDensity(bitmap2.getDensity());
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawARGB(0, 0, 0, 0);
            canvas.drawBitmap(bitmap2, 0.0f, 0.0f, (Paint) null);
            aVar.getClass();
            bitmap3 = createBitmap;
        } else {
            aVar.getClass();
        }
        if (bitmap3 != null) {
            bitmap = bitmap3;
        } else {
            bitmap = bitmap2;
        }
        aVar.c = sf.a.b(bitmap, aVar.c, this.f29325b);
        if (bitmap3 != null) {
            bitmap3.recycle();
        }
        aVar.f19419j = bitmap2.getWidth();
        aVar.f19420k = bitmap2.getHeight();
        aVar.b();
    }
}
