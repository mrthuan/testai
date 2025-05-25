package c4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: TransformationUtils.java */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final Paint f5551a = new Paint(6);

    /* renamed from: b  reason: collision with root package name */
    public static final Lock f5552b;

    /* compiled from: TransformationUtils.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(Canvas canvas, RectF rectF, Paint paint);
    }

    /* compiled from: TransformationUtils.java */
    /* loaded from: classes.dex */
    public static final class b implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public final Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public final boolean tryLock(long j10, TimeUnit timeUnit) {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public final void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final void lockInterruptibly() {
        }

        @Override // java.util.concurrent.locks.Lock
        public final void unlock() {
        }
    }

    static {
        Lock bVar;
        new Paint(7);
        if (new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL)) {
            bVar = new ReentrantLock();
        } else {
            bVar = new b();
        }
        f5552b = bVar;
        new Paint(7).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = f5552b;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f5551a);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap b(w3.c cVar, Bitmap bitmap, int i10, int i11) {
        Bitmap.Config config;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float min = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        int width = (int) (bitmap.getWidth() * min);
        int height = (int) (bitmap.getHeight() * min);
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap e10 = cVar.e(width, height, config);
        e10.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            e10.getWidth();
            e10.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, e10, matrix);
        return e10;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(w3.c r9, android.graphics.Bitmap r10, c4.v.a r11) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L19
            android.graphics.Bitmap$Config r2 = bb.j.i()
            android.graphics.Bitmap$Config r3 = r10.getConfig()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L19
            android.graphics.Bitmap$Config r2 = bb.j.i()
            goto L1b
        L19:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L1b:
            if (r0 < r1) goto L30
            android.graphics.Bitmap$Config r0 = bb.j.i()
            android.graphics.Bitmap$Config r1 = r10.getConfig()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L30
            android.graphics.Bitmap$Config r0 = bb.j.i()
            goto L32
        L30:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
        L32:
            android.graphics.Bitmap$Config r1 = r10.getConfig()
            boolean r1 = r0.equals(r1)
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L40
            r0 = r10
            goto L54
        L40:
            int r1 = r10.getWidth()
            int r5 = r10.getHeight()
            android.graphics.Bitmap r0 = r9.e(r1, r5, r0)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            r1.drawBitmap(r10, r4, r4, r3)
        L54:
            int r1 = r0.getWidth()
            int r5 = r0.getHeight()
            android.graphics.Bitmap r1 = r9.e(r1, r5, r2)
            r2 = 1
            r1.setHasAlpha(r2)
            android.graphics.BitmapShader r5 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r6 = android.graphics.Shader.TileMode.CLAMP
            r5.<init>(r0, r6, r6)
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>()
            r6.setAntiAlias(r2)
            r6.setShader(r5)
            android.graphics.RectF r2 = new android.graphics.RectF
            int r5 = r1.getWidth()
            float r5 = (float) r5
            int r7 = r1.getHeight()
            float r7 = (float) r7
            r2.<init>(r4, r4, r5, r7)
            java.util.concurrent.locks.Lock r4 = c4.v.f5552b
            r4.lock()
            android.graphics.Canvas r5 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> La8
            r5.<init>(r1)     // Catch: java.lang.Throwable -> La8
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.CLEAR     // Catch: java.lang.Throwable -> La8
            r8 = 0
            r5.drawColor(r8, r7)     // Catch: java.lang.Throwable -> La8
            r11.a(r5, r2, r6)     // Catch: java.lang.Throwable -> La8
            r5.setBitmap(r3)     // Catch: java.lang.Throwable -> La8
            r4.unlock()
            boolean r10 = r0.equals(r10)
            if (r10 != 0) goto La7
            r9.d(r0)
        La7:
            return r1
        La8:
            r9 = move-exception
            r4.unlock()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.v.c(w3.c, android.graphics.Bitmap, c4.v$a):android.graphics.Bitmap");
    }
}
