package c4;

import android.graphics.Bitmap;

/* compiled from: BitmapTransformation.java */
/* loaded from: classes.dex */
public abstract class d implements t3.h<Bitmap> {
    @Override // t3.h
    public final v3.l b(com.bumptech.glide.d dVar, v3.l lVar, int i10, int i11) {
        if (p4.j.g(i10, i11)) {
            w3.c cVar = com.bumptech.glide.b.b(dVar).f6833a;
            Bitmap bitmap = (Bitmap) lVar.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap c = c(cVar, bitmap, i10, i11);
            if (!bitmap.equals(c)) {
                return c.b(c, cVar);
            }
            return lVar;
        }
        throw new IllegalArgumentException(androidx.activity.f.k("Cannot apply transformation on width: ", i10, " or height: ", i11, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
    }

    public abstract Bitmap c(w3.c cVar, Bitmap bitmap, int i10, int i11);
}
