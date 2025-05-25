package com.bytedance.adsdk.lottie.Tgh;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import com.bytedance.adsdk.lottie.Qhi.Qhi.EBS;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
public final class ROR {
    private static final ThreadLocal<PathMeasure> Qhi = new ThreadLocal<PathMeasure>() { // from class: com.bytedance.adsdk.lottie.Tgh.ROR.1
        @Override // java.lang.ThreadLocal
        /* renamed from: Qhi */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    };
    private static final ThreadLocal<Path> cJ = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.lottie.Tgh.ROR.2
        @Override // java.lang.ThreadLocal
        /* renamed from: Qhi */
        public Path initialValue() {
            return new Path();
        }
    };

    /* renamed from: ac  reason: collision with root package name */
    private static final ThreadLocal<Path> f7770ac = new ThreadLocal<Path>() { // from class: com.bytedance.adsdk.lottie.Tgh.ROR.3
        @Override // java.lang.ThreadLocal
        /* renamed from: Qhi */
        public Path initialValue() {
            return new Path();
        }
    };
    private static final ThreadLocal<float[]> CJ = new ThreadLocal<float[]>() { // from class: com.bytedance.adsdk.lottie.Tgh.ROR.4
        @Override // java.lang.ThreadLocal
        /* renamed from: Qhi */
        public float[] initialValue() {
            return new float[4];
        }
    };

    /* renamed from: fl  reason: collision with root package name */
    private static final float f7771fl = (float) (Math.sqrt(2.0d) / 2.0d);

    public static int Qhi(float f10, float f11, float f12, float f13) {
        int i10 = f10 != 0.0f ? (int) (f10 * 527.0f) : 17;
        if (f11 != 0.0f) {
            i10 = (int) (i10 * 31 * f11);
        }
        if (f12 != 0.0f) {
            i10 = (int) (i10 * 31 * f12);
        }
        return f13 != 0.0f ? (int) (i10 * 31 * f13) : i10;
    }

    public static boolean cJ(Matrix matrix) {
        float[] fArr = CJ.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] != fArr[2] && fArr[1] != fArr[3]) {
            return false;
        }
        return true;
    }

    public static boolean Qhi(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i10 < i13) {
            return false;
        }
        if (i10 > i13) {
            return true;
        }
        if (i11 < i14) {
            return false;
        }
        return i11 > i14 || i12 >= i15;
    }

    public static Path Qhi(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            float f10 = pointF.x;
            float f11 = pointF2.x;
            float f12 = pointF2.y;
            path.cubicTo(pointF3.x + f10, pointF.y + pointF3.y, f11 + pointF4.x, f12 + pointF4.y, f11, f12);
        } else {
            path.lineTo(pointF2.x, pointF2.y);
        }
        return path;
    }

    public static void Qhi(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static float Qhi(Matrix matrix) {
        float[] fArr = CJ.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f10 = f7771fl;
        fArr[2] = f10;
        fArr[3] = f10;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static void Qhi(Path path, EBS ebs) {
        if (ebs == null || ebs.Tgh()) {
            return;
        }
        Qhi(path, ((com.bytedance.adsdk.lottie.Qhi.cJ.fl) ebs.ac()).hm() / 100.0f, ((com.bytedance.adsdk.lottie.Qhi.cJ.fl) ebs.CJ()).hm() / 100.0f, ((com.bytedance.adsdk.lottie.Qhi.cJ.fl) ebs.fl()).hm() / 360.0f);
    }

    public static void Qhi(Path path, float f10, float f11, float f12) {
        com.bytedance.adsdk.lottie.Tgh.Qhi("applyTrimPathIfNeeded");
        PathMeasure pathMeasure = Qhi.get();
        Path path2 = cJ.get();
        Path path3 = f7770ac.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f10 == 1.0f && f11 == 0.0f) {
            com.bytedance.adsdk.lottie.Tgh.cJ("applyTrimPathIfNeeded");
        } else if (length >= 1.0f && Math.abs((f11 - f10) - 1.0f) >= 0.01d) {
            float f13 = f10 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float min = Math.min(f13, f14) + f15;
            float max = Math.max(f13, f14) + f15;
            if (min >= length && max >= length) {
                min = Tgh.Qhi(min, length);
                max = Tgh.Qhi(max, length);
            }
            if (min < 0.0f) {
                min = Tgh.Qhi(min, length);
            }
            if (max < 0.0f) {
                max = Tgh.Qhi(max, length);
            }
            int i10 = (min > max ? 1 : (min == max ? 0 : -1));
            if (i10 == 0) {
                path.reset();
                com.bytedance.adsdk.lottie.Tgh.cJ("applyTrimPathIfNeeded");
                return;
            }
            if (i10 >= 0) {
                min -= length;
            }
            path2.reset();
            pathMeasure.getSegment(min, max, path2, true);
            if (max > length) {
                path3.reset();
                pathMeasure.getSegment(0.0f, max % length, path3, true);
                path2.addPath(path3);
            } else if (min < 0.0f) {
                path3.reset();
                pathMeasure.getSegment(min + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
            com.bytedance.adsdk.lottie.Tgh.cJ("applyTrimPathIfNeeded");
        } else {
            com.bytedance.adsdk.lottie.Tgh.cJ("applyTrimPathIfNeeded");
        }
    }

    public static float Qhi() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float Qhi(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static Bitmap Qhi(Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static boolean Qhi(Throwable th2) {
        return (th2 instanceof SocketException) || (th2 instanceof ClosedChannelException) || (th2 instanceof InterruptedIOException) || (th2 instanceof ProtocolException) || (th2 instanceof SSLException) || (th2 instanceof UnknownHostException) || (th2 instanceof UnknownServiceException);
    }

    public static void Qhi(Canvas canvas, RectF rectF, Paint paint) {
        Qhi(canvas, rectF, paint, 31);
    }

    public static void Qhi(Canvas canvas, RectF rectF, Paint paint, int i10) {
        com.bytedance.adsdk.lottie.Tgh.Qhi("Utils#saveLayer");
        canvas.saveLayer(rectF, paint);
        com.bytedance.adsdk.lottie.Tgh.cJ("Utils#saveLayer");
    }
}
