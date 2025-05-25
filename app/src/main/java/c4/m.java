package c4;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: FitCenter.java */
/* loaded from: classes.dex */
public final class m extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5530b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(t3.b.f29917a);

    @Override // t3.b
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f5530b);
    }

    @Override // c4.d
    public final Bitmap c(w3.c cVar, Bitmap bitmap, int i10, int i11) {
        return v.b(cVar, bitmap, i10, i11);
    }

    @Override // t3.b
    public final boolean equals(Object obj) {
        return obj instanceof m;
    }

    @Override // t3.b
    public final int hashCode() {
        return 1572326941;
    }
}
