package c4;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* compiled from: CenterCrop.java */
/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f5526b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(t3.b.f29917a);

    @Override // t3.b
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f5526b);
    }

    @Override // c4.d
    public final Bitmap c(w3.c cVar, Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        Bitmap.Config config;
        Paint paint = v.f5551a;
        if (bitmap.getWidth() != i10 || bitmap.getHeight() != i11) {
            Matrix matrix = new Matrix();
            float f10 = 0.0f;
            if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
                width = i11 / bitmap.getHeight();
                f10 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
                height = 0.0f;
            } else {
                width = i10 / bitmap.getWidth();
                height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
            }
            matrix.setScale(width, width);
            matrix.postTranslate((int) (f10 + 0.5f), (int) (height + 0.5f));
            if (bitmap.getConfig() != null) {
                config = bitmap.getConfig();
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap e10 = cVar.e(i10, i11, config);
            e10.setHasAlpha(bitmap.hasAlpha());
            v.a(bitmap, e10, matrix);
            return e10;
        }
        return bitmap;
    }

    @Override // t3.b
    public final boolean equals(Object obj) {
        return obj instanceof f;
    }

    @Override // t3.b
    public final int hashCode() {
        return -599754482;
    }
}
