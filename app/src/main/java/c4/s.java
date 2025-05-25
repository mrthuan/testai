package c4;

import android.graphics.Bitmap;
import android.graphics.Paint;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: RoundedCorners.java */
/* loaded from: classes.dex */
public final class s extends d {
    public static final byte[] c = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(t3.b.f29917a);

    /* renamed from: b  reason: collision with root package name */
    public final int f5546b;

    public s(int i10) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.google.android.play.core.assetpacks.c.k("roundingRadius must be greater than 0.", z10);
        this.f5546b = i10;
    }

    @Override // t3.b
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(c);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f5546b).array());
    }

    @Override // c4.d
    public final Bitmap c(w3.c cVar, Bitmap bitmap, int i10, int i11) {
        boolean z10;
        Paint paint = v.f5551a;
        int i12 = this.f5546b;
        if (i12 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.google.android.play.core.assetpacks.c.k("roundingRadius must be greater than 0.", z10);
        return v.c(cVar, bitmap, new t(i12));
    }

    @Override // t3.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof s) || this.f5546b != ((s) obj).f5546b) {
            return false;
        }
        return true;
    }

    @Override // t3.b
    public final int hashCode() {
        char[] cArr = p4.j.f23703a;
        return ((this.f5546b + 527) * 31) - 569625254;
    }
}
