package c4;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: GranularRoundedCorners.java */
/* loaded from: classes.dex */
public final class n extends d {

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f5531f = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners".getBytes(t3.b.f29917a);

    /* renamed from: b  reason: collision with root package name */
    public final float f5532b;
    public final float c;

    /* renamed from: d  reason: collision with root package name */
    public final float f5533d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public final float f5534e = 0.0f;

    public n(float f10, float f11) {
        this.f5532b = f10;
        this.c = f11;
    }

    @Override // t3.b
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f5531f);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f5532b).putFloat(this.c).putFloat(this.f5533d).putFloat(this.f5534e).array());
    }

    @Override // c4.d
    public final Bitmap c(w3.c cVar, Bitmap bitmap, int i10, int i11) {
        return v.c(cVar, bitmap, new u(this.f5532b, this.c, this.f5533d, this.f5534e));
    }

    @Override // t3.b
    public final boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f5532b != nVar.f5532b || this.c != nVar.c || this.f5533d != nVar.f5533d || this.f5534e != nVar.f5534e) {
            return false;
        }
        return true;
    }

    @Override // t3.b
    public final int hashCode() {
        char[] cArr = p4.j.f23703a;
        return ((((((((Float.floatToIntBits(this.f5532b) + 527) * 31) - 2013597734) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.f5533d)) * 31) + Float.floatToIntBits(this.f5534e);
    }
}
