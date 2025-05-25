package c4;

import android.graphics.Bitmap;

/* compiled from: BitmapResource.java */
/* loaded from: classes.dex */
public final class c implements v3.l<Bitmap>, v3.i {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f5523a;

    /* renamed from: b  reason: collision with root package name */
    public final w3.c f5524b;

    public c(Bitmap bitmap, w3.c cVar) {
        if (bitmap != null) {
            this.f5523a = bitmap;
            if (cVar != null) {
                this.f5524b = cVar;
                return;
            }
            throw new NullPointerException("BitmapPool must not be null");
        }
        throw new NullPointerException("Bitmap must not be null");
    }

    public static c b(Bitmap bitmap, w3.c cVar) {
        if (bitmap == null) {
            return null;
        }
        return new c(bitmap, cVar);
    }

    @Override // v3.l
    public final void a() {
        this.f5524b.d(this.f5523a);
    }

    @Override // v3.l
    public final Class<Bitmap> c() {
        return Bitmap.class;
    }

    @Override // v3.l
    public final Bitmap get() {
        return this.f5523a;
    }

    @Override // v3.l
    public final int getSize() {
        return p4.j.c(this.f5523a);
    }

    @Override // v3.i
    public final void initialize() {
        this.f5523a.prepareToDraw();
    }
}
