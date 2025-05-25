package g4;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import v3.l;

/* compiled from: GifDrawableTransformation.java */
/* loaded from: classes.dex */
public final class e implements t3.h<c> {

    /* renamed from: b  reason: collision with root package name */
    public final t3.h<Bitmap> f17640b;

    public e(t3.h<Bitmap> hVar) {
        com.google.android.play.core.assetpacks.c.l(hVar);
        this.f17640b = hVar;
    }

    @Override // t3.b
    public final void a(MessageDigest messageDigest) {
        this.f17640b.a(messageDigest);
    }

    @Override // t3.h
    public final l b(com.bumptech.glide.d dVar, l lVar, int i10, int i11) {
        c cVar = (c) lVar.get();
        c4.c cVar2 = new c4.c(cVar.f17630a.f17639a.f17651l, com.bumptech.glide.b.b(dVar).f6833a);
        t3.h<Bitmap> hVar = this.f17640b;
        l b10 = hVar.b(dVar, cVar2, i10, i11);
        if (!cVar2.equals(b10)) {
            cVar2.a();
        }
        cVar.f17630a.f17639a.c(hVar, (Bitmap) b10.get());
        return lVar;
    }

    @Override // t3.b
    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f17640b.equals(((e) obj).f17640b);
        }
        return false;
    }

    @Override // t3.b
    public final int hashCode() {
        return this.f17640b.hashCode();
    }
}
