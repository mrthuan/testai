package ge;

import android.app.Activity;
import android.graphics.Bitmap;

/* compiled from: BitmapUtils.java */
/* loaded from: classes.dex */
public final class d {

    /* compiled from: BitmapUtils.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(Bitmap bitmap);

        void b();
    }

    public static void a(Activity activity, a aVar) {
        if (activity != null && aVar != null) {
            activity.runOnUiThread(new c(aVar));
        }
    }

    public static void b(Activity activity, a aVar, String str, boolean z10) {
        new Thread(new b(activity, aVar, str, z10)).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(android.graphics.Bitmap r7) {
        /*
            int r0 = r7.getWidth()
            int r1 = r7.getHeight()
            float r1 = (float) r1
            r2 = 1058642330(0x3f19999a, float:0.6)
            float r1 = r1 * r2
            int r1 = (int) r1
            r2 = 1
            r3 = 0
            r4 = 0
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.NullPointerException -> L1e
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r0, r1, r5)     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.NullPointerException -> L1e
            r6 = r3
            goto L24
        L19:
            r5 = move-exception
            r5.printStackTrace()
            goto L22
        L1e:
            r5 = move-exception
            r5.printStackTrace()
        L22:
            r6 = r2
            r5 = r4
        L24:
            if (r5 == 0) goto L28
            if (r6 == 0) goto L3e
        L28:
            java.lang.System.gc()
            java.lang.System.gc()
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.NullPointerException -> L3a
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r0, r1, r6)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.NullPointerException -> L3a
            goto L3e
        L35:
            r0 = move-exception
            r0.printStackTrace()
            goto L3e
        L3a:
            r0 = move-exception
            r0.printStackTrace()
        L3e:
            if (r5 != 0) goto L41
            return r4
        L41:
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r5)
            android.graphics.PaintFlagsDrawFilter r4 = new android.graphics.PaintFlagsDrawFilter
            r6 = 3
            r4.<init>(r3, r6)
            r0.setDrawFilter(r4)
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            int r4 = r7.getHeight()
            int r4 = r4 - r1
            int r1 = -r4
            float r1 = (float) r1
            r4 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r4
            r4 = 0
            r3.postTranslate(r4, r1)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r1.setAntiAlias(r2)
            r1.setFilterBitmap(r2)
            r0.drawBitmap(r7, r3, r1)
            r7.recycle()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.d.c(android.graphics.Bitmap):android.graphics.Bitmap");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap d(android.graphics.Bitmap r7, float r8, float r9) {
        /*
            int r0 = r7.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r8
            int r0 = (int) r0
            int r1 = r7.getHeight()
            float r1 = (float) r1
            float r1 = r1 * r9
            int r1 = (int) r1
            r2 = 1
            r3 = 0
            r4 = 0
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.NullPointerException -> L1e
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r0, r1, r5)     // Catch: java.lang.IllegalArgumentException -> L19 java.lang.NullPointerException -> L1e
            r6 = r3
            goto L24
        L19:
            r5 = move-exception
            r5.printStackTrace()
            goto L22
        L1e:
            r5 = move-exception
            r5.printStackTrace()
        L22:
            r6 = r2
            r5 = r4
        L24:
            if (r5 == 0) goto L28
            if (r6 == 0) goto L3e
        L28:
            java.lang.System.gc()
            java.lang.System.gc()
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.NullPointerException -> L3a
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r0, r1, r6)     // Catch: java.lang.IllegalArgumentException -> L35 java.lang.NullPointerException -> L3a
            goto L3e
        L35:
            r0 = move-exception
            r0.printStackTrace()
            goto L3e
        L3a:
            r0 = move-exception
            r0.printStackTrace()
        L3e:
            if (r5 != 0) goto L41
            return r4
        L41:
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r5)
            android.graphics.PaintFlagsDrawFilter r1 = new android.graphics.PaintFlagsDrawFilter
            r4 = 3
            r1.<init>(r3, r4)
            r0.setDrawFilter(r1)
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r1.postScale(r8, r9)
            android.graphics.Paint r8 = new android.graphics.Paint
            r8.<init>()
            r8.setAntiAlias(r2)
            r8.setFilterBitmap(r2)
            r0.drawBitmap(r7, r1, r8)
            r7.recycle()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.d.d(android.graphics.Bitmap, float, float):android.graphics.Bitmap");
    }
}
