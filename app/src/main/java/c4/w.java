package c4;

import android.graphics.Bitmap;

/* compiled from: UnitBitmapDecoder.java */
/* loaded from: classes.dex */
public final class w implements t3.f<Bitmap, Bitmap> {
    @Override // t3.f
    public final /* bridge */ /* synthetic */ boolean a(Bitmap bitmap, t3.e eVar) {
        return true;
    }

    @Override // t3.f
    public final v3.l<Bitmap> b(Bitmap bitmap, int i10, int i11, t3.e eVar) {
        return new a(bitmap);
    }

    /* compiled from: UnitBitmapDecoder.java */
    /* loaded from: classes.dex */
    public static final class a implements v3.l<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f5553a;

        public a(Bitmap bitmap) {
            this.f5553a = bitmap;
        }

        @Override // v3.l
        public final Class<Bitmap> c() {
            return Bitmap.class;
        }

        @Override // v3.l
        public final Bitmap get() {
            return this.f5553a;
        }

        @Override // v3.l
        public final int getSize() {
            return p4.j.c(this.f5553a);
        }

        @Override // v3.l
        public final void a() {
        }
    }
}
