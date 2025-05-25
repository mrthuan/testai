package q3;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import e3.e;

/* compiled from: Keyframe.java */
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final e f29064a;

    /* renamed from: b  reason: collision with root package name */
    public final T f29065b;
    public T c;

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f29066d;

    /* renamed from: e  reason: collision with root package name */
    public final float f29067e;

    /* renamed from: f  reason: collision with root package name */
    public Float f29068f;

    /* renamed from: g  reason: collision with root package name */
    public float f29069g;

    /* renamed from: h  reason: collision with root package name */
    public float f29070h;

    /* renamed from: i  reason: collision with root package name */
    public int f29071i;

    /* renamed from: j  reason: collision with root package name */
    public int f29072j;

    /* renamed from: k  reason: collision with root package name */
    public float f29073k;

    /* renamed from: l  reason: collision with root package name */
    public float f29074l;

    /* renamed from: m  reason: collision with root package name */
    public PointF f29075m;

    /* renamed from: n  reason: collision with root package name */
    public PointF f29076n;

    public a(e eVar, T t4, T t10, Interpolator interpolator, float f10, Float f11) {
        this.f29069g = -3987645.8f;
        this.f29070h = -3987645.8f;
        this.f29071i = 784923401;
        this.f29072j = 784923401;
        this.f29073k = Float.MIN_VALUE;
        this.f29074l = Float.MIN_VALUE;
        this.f29075m = null;
        this.f29076n = null;
        this.f29064a = eVar;
        this.f29065b = t4;
        this.c = t10;
        this.f29066d = interpolator;
        this.f29067e = f10;
        this.f29068f = f11;
    }

    public final float a() {
        e eVar = this.f29064a;
        if (eVar == null) {
            return 1.0f;
        }
        if (this.f29074l == Float.MIN_VALUE) {
            if (this.f29068f == null) {
                this.f29074l = 1.0f;
            } else {
                this.f29074l = ((this.f29068f.floatValue() - this.f29067e) / (eVar.f16351l - eVar.f16350k)) + b();
            }
        }
        return this.f29074l;
    }

    public final float b() {
        e eVar = this.f29064a;
        if (eVar == null) {
            return 0.0f;
        }
        if (this.f29073k == Float.MIN_VALUE) {
            float f10 = eVar.f16350k;
            this.f29073k = (this.f29067e - f10) / (eVar.f16351l - f10);
        }
        return this.f29073k;
    }

    public final boolean c() {
        if (this.f29066d == null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "Keyframe{startValue=" + this.f29065b + ", endValue=" + this.c + ", startFrame=" + this.f29067e + ", endFrame=" + this.f29068f + ", interpolator=" + this.f29066d + '}';
    }

    public a(T t4) {
        this.f29069g = -3987645.8f;
        this.f29070h = -3987645.8f;
        this.f29071i = 784923401;
        this.f29072j = 784923401;
        this.f29073k = Float.MIN_VALUE;
        this.f29074l = Float.MIN_VALUE;
        this.f29075m = null;
        this.f29076n = null;
        this.f29064a = null;
        this.f29065b = t4;
        this.c = t4;
        this.f29066d = null;
        this.f29067e = Float.MIN_VALUE;
        this.f29068f = Float.valueOf(Float.MAX_VALUE);
    }
}
