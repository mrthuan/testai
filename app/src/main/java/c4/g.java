package c4;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* compiled from: CenterInside.java */
/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5527b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(t3.b.f29917a);

    @Override // t3.b
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f5527b);
    }

    @Override // c4.d
    public final Bitmap c(w3.c cVar, Bitmap bitmap, int i10, int i11) {
        Paint paint = v.f5551a;
        if (bitmap.getWidth() <= i10 && bitmap.getHeight() <= i11) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Log.isLoggable("TransformationUtils", 2);
        return v.b(cVar, bitmap, i10, i11);
    }

    @Override // t3.b
    public final boolean equals(Object obj) {
        return obj instanceof g;
    }

    @Override // t3.b
    public final int hashCode() {
        return -670243078;
    }
}
