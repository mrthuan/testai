package w3;

import android.graphics.Bitmap;

/* compiled from: BitmapPoolAdapter.java */
/* loaded from: classes.dex */
public class d implements c {
    @Override // w3.c
    public final Bitmap c(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // w3.c
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // w3.c
    public final Bitmap e(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // w3.c
    public final void b() {
    }

    @Override // w3.c
    public final void a(int i10) {
    }
}
