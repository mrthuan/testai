package c4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: DrawableTransformation.java */
/* loaded from: classes.dex */
public final class k implements t3.h<Drawable> {

    /* renamed from: b  reason: collision with root package name */
    public final t3.h<Bitmap> f5529b;
    public final boolean c;

    public k(t3.h<Bitmap> hVar, boolean z10) {
        this.f5529b = hVar;
        this.c = z10;
    }

    @Override // t3.b
    public final void a(MessageDigest messageDigest) {
        this.f5529b.a(messageDigest);
    }

    @Override // t3.h
    public final v3.l b(com.bumptech.glide.d dVar, v3.l lVar, int i10, int i11) {
        w3.c cVar = com.bumptech.glide.b.b(dVar).f6833a;
        Drawable drawable = (Drawable) lVar.get();
        c a10 = j.a(cVar, drawable, i10, i11);
        if (a10 == null) {
            if (!this.c) {
                return lVar;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        v3.l b10 = this.f5529b.b(dVar, a10, i10, i11);
        if (b10.equals(a10)) {
            b10.a();
            return lVar;
        }
        return new p(dVar.getResources(), b10);
    }

    @Override // t3.b
    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f5529b.equals(((k) obj).f5529b);
        }
        return false;
    }

    @Override // t3.b
    public final int hashCode() {
        return this.f5529b.hashCode();
    }
}
