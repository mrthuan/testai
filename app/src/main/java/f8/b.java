package f8;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.activity.r;

/* compiled from: AnimationUtils.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final LinearInterpolator f17141a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final m1.b f17142b = new m1.b();
    public static final m1.a c = new m1.a();

    /* renamed from: d  reason: collision with root package name */
    public static final m1.c f17143d = new m1.c();

    /* renamed from: e  reason: collision with root package name */
    public static final DecelerateInterpolator f17144e = new DecelerateInterpolator();

    public static float a(float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= f12) {
            return f10;
        }
        if (f14 >= f13) {
            return f11;
        }
        return r.l(f11, f10, (f14 - f12) / (f13 - f12), f10);
    }

    public static int b(float f10, int i10, int i11) {
        return Math.round(f10 * (i11 - i10)) + i10;
    }
}
