package com.bytedance.adsdk.lottie.ROR;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import com.bytedance.adsdk.lottie.ROR;
import com.bytedance.component.sdk.annotation.FloatRange;

/* compiled from: Keyframe.java */
/* loaded from: classes.dex */
public class Qhi<T> {
    private int ABk;
    public final Interpolator CJ;
    private float Gm;
    public final T Qhi;
    public Float ROR;
    public PointF Sf;
    public final float Tgh;
    private final ROR WAv;

    /* renamed from: ac  reason: collision with root package name */
    public final Interpolator f7757ac;
    public T cJ;

    /* renamed from: fl  reason: collision with root package name */
    public final Interpolator f7758fl;

    /* renamed from: hm  reason: collision with root package name */
    public PointF f7759hm;
    private float hpZ;
    private int iMK;
    private float pA;

    /* renamed from: zc  reason: collision with root package name */
    private float f7760zc;

    public Qhi(ROR ror, T t4, T t10, Interpolator interpolator, float f10, Float f11) {
        this.Gm = -3987645.8f;
        this.f7760zc = -3987645.8f;
        this.ABk = 784923401;
        this.iMK = 784923401;
        this.pA = Float.MIN_VALUE;
        this.hpZ = Float.MIN_VALUE;
        this.Sf = null;
        this.f7759hm = null;
        this.WAv = ror;
        this.Qhi = t4;
        this.cJ = t10;
        this.f7757ac = interpolator;
        this.CJ = null;
        this.f7758fl = null;
        this.Tgh = f10;
        this.ROR = f11;
    }

    public float CJ() {
        if (this.WAv == null) {
            return 1.0f;
        }
        if (this.hpZ == Float.MIN_VALUE) {
            if (this.ROR == null) {
                this.hpZ = 1.0f;
            } else {
                this.hpZ = ((this.ROR.floatValue() - this.Tgh) / this.WAv.ABk()) + ac();
            }
        }
        return this.hpZ;
    }

    public Qhi<T> Qhi(T t4, T t10) {
        return new Qhi<>(t4, t10);
    }

    public float ROR() {
        if (this.f7760zc == -3987645.8f) {
            this.f7760zc = ((Float) this.cJ).floatValue();
        }
        return this.f7760zc;
    }

    public int Sf() {
        if (this.ABk == 784923401) {
            this.ABk = ((Integer) this.Qhi).intValue();
        }
        return this.ABk;
    }

    public float Tgh() {
        if (this.Gm == -3987645.8f) {
            this.Gm = ((Float) this.Qhi).floatValue();
        }
        return this.Gm;
    }

    public float ac() {
        ROR ror = this.WAv;
        if (ror == null) {
            return 0.0f;
        }
        if (this.pA == Float.MIN_VALUE) {
            this.pA = (this.Tgh - ror.Tgh()) / this.WAv.ABk();
        }
        return this.pA;
    }

    public boolean fl() {
        if (this.f7757ac == null && this.CJ == null && this.f7758fl == null) {
            return true;
        }
        return false;
    }

    public int hm() {
        if (this.iMK == 784923401) {
            this.iMK = ((Integer) this.cJ).intValue();
        }
        return this.iMK;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.Qhi + ", endValue=" + this.cJ + ", startFrame=" + this.Tgh + ", endFrame=" + this.ROR + ", interpolator=" + this.f7757ac + '}';
    }

    public boolean Qhi(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        return f10 >= ac() && f10 < CJ();
    }

    public Qhi(ROR ror, T t4, T t10, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.Gm = -3987645.8f;
        this.f7760zc = -3987645.8f;
        this.ABk = 784923401;
        this.iMK = 784923401;
        this.pA = Float.MIN_VALUE;
        this.hpZ = Float.MIN_VALUE;
        this.Sf = null;
        this.f7759hm = null;
        this.WAv = ror;
        this.Qhi = t4;
        this.cJ = t10;
        this.f7757ac = null;
        this.CJ = interpolator;
        this.f7758fl = interpolator2;
        this.Tgh = f10;
        this.ROR = f11;
    }

    public Qhi(ROR ror, T t4, T t10, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.Gm = -3987645.8f;
        this.f7760zc = -3987645.8f;
        this.ABk = 784923401;
        this.iMK = 784923401;
        this.pA = Float.MIN_VALUE;
        this.hpZ = Float.MIN_VALUE;
        this.Sf = null;
        this.f7759hm = null;
        this.WAv = ror;
        this.Qhi = t4;
        this.cJ = t10;
        this.f7757ac = interpolator;
        this.CJ = interpolator2;
        this.f7758fl = interpolator3;
        this.Tgh = f10;
        this.ROR = f11;
    }

    public Qhi(T t4) {
        this.Gm = -3987645.8f;
        this.f7760zc = -3987645.8f;
        this.ABk = 784923401;
        this.iMK = 784923401;
        this.pA = Float.MIN_VALUE;
        this.hpZ = Float.MIN_VALUE;
        this.Sf = null;
        this.f7759hm = null;
        this.WAv = null;
        this.Qhi = t4;
        this.cJ = t4;
        this.f7757ac = null;
        this.CJ = null;
        this.f7758fl = null;
        this.Tgh = Float.MIN_VALUE;
        this.ROR = Float.valueOf(Float.MAX_VALUE);
    }

    private Qhi(T t4, T t10) {
        this.Gm = -3987645.8f;
        this.f7760zc = -3987645.8f;
        this.ABk = 784923401;
        this.iMK = 784923401;
        this.pA = Float.MIN_VALUE;
        this.hpZ = Float.MIN_VALUE;
        this.Sf = null;
        this.f7759hm = null;
        this.WAv = null;
        this.Qhi = t4;
        this.cJ = t10;
        this.f7757ac = null;
        this.CJ = null;
        this.f7758fl = null;
        this.Tgh = Float.MIN_VALUE;
        this.ROR = Float.valueOf(Float.MAX_VALUE);
    }
}
