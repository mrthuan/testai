package c4;

import android.graphics.Bitmap;
import com.bumptech.glide.load.EncodeStrategy;

/* compiled from: BitmapEncoder.java */
/* loaded from: classes.dex */
public final class b implements t3.g<Bitmap> {

    /* renamed from: b  reason: collision with root package name */
    public static final t3.d<Integer> f5521b = t3.d.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final t3.d<Bitmap.CompressFormat> c = new t3.d<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, t3.d.f29919e);

    /* renamed from: a  reason: collision with root package name */
    public final w3.b f5522a;

    public b(w3.b bVar) {
        this.f5522a = bVar;
    }

    @Override // t3.g
    public final EncodeStrategy a(t3.e eVar) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.FileOutputStream] */
    @Override // t3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.Object r7, java.io.File r8, t3.e r9) {
        /*
            r6 = this;
            v3.l r7 = (v3.l) r7
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r7 = r7.get()
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            t3.d<android.graphics.Bitmap$CompressFormat> r1 = c4.b.c
            java.lang.Object r2 = r9.c(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L15
            goto L20
        L15:
            boolean r2 = r7.hasAlpha()
            if (r2 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r7.getWidth()
            r7.getHeight()
            int r3 = p4.f.f23697a
            android.os.SystemClock.elapsedRealtimeNanos()
            t3.d<java.lang.Integer> r3 = c4.b.f5521b
            java.lang.Object r3 = r9.c(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            w3.b r8 = r6.f5522a
            if (r8 == 0) goto L4b
            com.bumptech.glide.load.data.c r4 = new com.bumptech.glide.load.data.c     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            r4.<init>(r5, r8)     // Catch: java.lang.Throwable -> L47 java.io.IOException -> L49
            goto L4c
        L47:
            r7 = move-exception
            goto L82
        L49:
            r4 = r5
            goto L59
        L4b:
            r4 = r5
        L4c:
            r7.compress(r2, r3, r4)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r4.close()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59
            r4.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L63
        L55:
            r8 = 1
            goto L66
        L57:
            r7 = move-exception
            goto L81
        L59:
            r8 = 3
            android.util.Log.isLoggable(r0, r8)     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L65
            r4.close()     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L65
            goto L65
        L63:
            r7 = move-exception
            goto L88
        L65:
            r8 = 0
        L66:
            r3 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r3)
            if (r0 == 0) goto L80
            java.util.Objects.toString(r2)
            p4.j.c(r7)
            android.os.SystemClock.elapsedRealtimeNanos()
            java.lang.Object r9 = r9.c(r1)
            java.util.Objects.toString(r9)
            r7.hasAlpha()
        L80:
            return r8
        L81:
            r5 = r4
        L82:
            if (r5 == 0) goto L89
            r5.close()     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L89
            goto L89
        L88:
            throw r7
        L89:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.b.d(java.lang.Object, java.io.File, t3.e):boolean");
    }
}
