package com.bytedance.adsdk.lottie.ac;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import com.bytedance.component.sdk.annotation.RestrictTo;

/* compiled from: CubicCurveData.java */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public class Qhi {
    private final PointF Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final PointF f7777ac;
    private final PointF cJ;

    public Qhi() {
        this.Qhi = new PointF();
        this.cJ = new PointF();
        this.f7777ac = new PointF();
    }

    public void Qhi(float f10, float f11) {
        this.Qhi.set(f10, f11);
    }

    public void ac(float f10, float f11) {
        this.f7777ac.set(f10, f11);
    }

    public void cJ(float f10, float f11) {
        this.cJ.set(f10, f11);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f7777ac.x), Float.valueOf(this.f7777ac.y), Float.valueOf(this.Qhi.x), Float.valueOf(this.Qhi.y), Float.valueOf(this.cJ.x), Float.valueOf(this.cJ.y));
    }

    public PointF Qhi() {
        return this.Qhi;
    }

    public PointF ac() {
        return this.f7777ac;
    }

    public PointF cJ() {
        return this.cJ;
    }

    public Qhi(PointF pointF, PointF pointF2, PointF pointF3) {
        this.Qhi = pointF;
        this.cJ = pointF2;
        this.f7777ac = pointF3;
    }
}
