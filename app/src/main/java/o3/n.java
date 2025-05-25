package o3;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.ref.WeakReference;
import lib.zj.pdfeditor.Annotation;
import p3.g;

/* compiled from: KeyframeParser.java */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    public static y.j<WeakReference<Interpolator>> f22720b;

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f22719a = new LinearInterpolator();
    public static final JsonReader.a c = JsonReader.a.a("t", "s", Annotation.KEY_E, "o", OperatorName.SET_FLATNESS, "h", "to", "ti");

    public static <T> q3.a<T> a(JsonReader jsonReader, e3.e eVar, float f10, d0<T> d0Var, boolean z10) {
        LinearInterpolator linearInterpolator;
        T t4;
        int i10;
        WeakReference weakReference;
        Interpolator linearInterpolator2;
        if (z10) {
            jsonReader.b();
            LinearInterpolator linearInterpolator3 = null;
            PointF pointF = null;
            PointF pointF2 = null;
            T t10 = null;
            PointF pointF3 = null;
            PointF pointF4 = null;
            T t11 = null;
            float f11 = 0.0f;
            while (true) {
                boolean z11 = false;
                float f12 = f11;
                T t12 = t10;
                while (jsonReader.h()) {
                    switch (jsonReader.o(c)) {
                        case 0:
                            f12 = (float) jsonReader.j();
                        case 1:
                            t12 = d0Var.g(jsonReader, f10);
                        case 2:
                            t11 = d0Var.g(jsonReader, f10);
                        case 3:
                            pointF3 = m.b(jsonReader, f10);
                        case 4:
                            pointF4 = m.b(jsonReader, f10);
                        case 5:
                            z11 = true;
                            if (jsonReader.k() == 1) {
                            }
                            break;
                        case 6:
                            pointF2 = m.b(jsonReader, f10);
                        case 7:
                            pointF = m.b(jsonReader, f10);
                        default:
                            jsonReader.q();
                    }
                }
                jsonReader.d();
                if (z11) {
                    linearInterpolator = f22719a;
                    t4 = t12;
                } else {
                    if (pointF3 != null && pointF4 != null) {
                        float f13 = -f10;
                        pointF3.x = p3.f.b(pointF3.x, f13, f10);
                        pointF3.y = p3.f.b(pointF3.y, -100.0f, 100.0f);
                        pointF4.x = p3.f.b(pointF4.x, f13, f10);
                        float b10 = p3.f.b(pointF4.y, -100.0f, 100.0f);
                        pointF4.y = b10;
                        float f14 = pointF3.x;
                        float f15 = pointF3.y;
                        float f16 = pointF4.x;
                        g.a aVar = p3.g.f23679a;
                        if (f14 != 0.0f) {
                            i10 = (int) (527 * f14);
                        } else {
                            i10 = 17;
                        }
                        if (f15 != 0.0f) {
                            i10 = (int) (i10 * 31 * f15);
                        }
                        if (f16 != 0.0f) {
                            i10 = (int) (i10 * 31 * f16);
                        }
                        if (b10 != 0.0f) {
                            i10 = (int) (i10 * 31 * b10);
                        }
                        synchronized (n.class) {
                            if (f22720b == null) {
                                f22720b = new y.j<>();
                            }
                            weakReference = (WeakReference) f22720b.d(i10, null);
                        }
                        if (weakReference != null) {
                            linearInterpolator3 = (Interpolator) weakReference.get();
                        }
                        if (weakReference == null || linearInterpolator3 == null) {
                            pointF3.x /= f10;
                            pointF3.y /= f10;
                            float f17 = pointF4.x / f10;
                            pointF4.x = f17;
                            float f18 = pointF4.y / f10;
                            pointF4.y = f18;
                            try {
                                linearInterpolator2 = z0.a.b(pointF3.x, pointF3.y, f17, f18);
                            } catch (IllegalArgumentException e10) {
                                if (e10.getMessage().equals("The Path cannot loop back on itself.")) {
                                    linearInterpolator2 = z0.a.b(Math.min(pointF3.x, 1.0f), pointF3.y, Math.max(pointF4.x, 0.0f), pointF4.y);
                                } else {
                                    linearInterpolator2 = new LinearInterpolator();
                                }
                            }
                            linearInterpolator3 = linearInterpolator2;
                            try {
                                b(i10, new WeakReference(linearInterpolator3));
                            } catch (ArrayIndexOutOfBoundsException unused) {
                            }
                        }
                    } else {
                        linearInterpolator3 = f22719a;
                    }
                    linearInterpolator = linearInterpolator3;
                    t4 = t11;
                }
                q3.a<T> aVar2 = new q3.a<>(eVar, t12, t4, linearInterpolator, f12, null);
                aVar2.f29075m = pointF2;
                aVar2.f29076n = pointF;
                return aVar2;
                t10 = t12;
                f11 = f12;
            }
        } else {
            return new q3.a<>(d0Var.g(jsonReader, f10));
        }
    }

    public static void b(int i10, WeakReference<Interpolator> weakReference) {
        synchronized (n.class) {
            f22720b.e(i10, weakReference);
        }
    }
}
