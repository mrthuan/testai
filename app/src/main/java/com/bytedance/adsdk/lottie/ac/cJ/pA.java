package com.bytedance.adsdk.lottie.ac.cJ;

import android.graphics.PointF;
import com.bytedance.component.sdk.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeData.java */
/* loaded from: classes.dex */
public class pA {
    private final List<com.bytedance.adsdk.lottie.ac.Qhi> Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private boolean f7839ac;
    private PointF cJ;

    public pA(PointF pointF, boolean z10, List<com.bytedance.adsdk.lottie.ac.Qhi> list) {
        this.cJ = pointF;
        this.f7839ac = z10;
        this.Qhi = new ArrayList(list);
    }

    public void Qhi(float f10, float f11) {
        if (this.cJ == null) {
            this.cJ = new PointF();
        }
        this.cJ.set(f10, f11);
    }

    public List<com.bytedance.adsdk.lottie.ac.Qhi> ac() {
        return this.Qhi;
    }

    public boolean cJ() {
        return this.f7839ac;
    }

    public String toString() {
        return "ShapeData{numCurves=" + this.Qhi.size() + "closed=" + this.f7839ac + '}';
    }

    public PointF Qhi() {
        return this.cJ;
    }

    public pA() {
        this.Qhi = new ArrayList();
    }

    public void Qhi(boolean z10) {
        this.f7839ac = z10;
    }

    public void Qhi(pA pAVar, pA pAVar2, @FloatRange(from = 0.0d, to = 1.0d) float f10) {
        if (this.cJ == null) {
            this.cJ = new PointF();
        }
        this.f7839ac = pAVar.cJ() || pAVar2.cJ();
        if (pAVar.ac().size() != pAVar2.ac().size()) {
            pAVar.ac().size();
            pAVar2.ac().size();
        }
        int min = Math.min(pAVar.ac().size(), pAVar2.ac().size());
        if (this.Qhi.size() < min) {
            for (int size = this.Qhi.size(); size < min; size++) {
                this.Qhi.add(new com.bytedance.adsdk.lottie.ac.Qhi());
            }
        } else if (this.Qhi.size() > min) {
            for (int size2 = this.Qhi.size() - 1; size2 >= min; size2--) {
                List<com.bytedance.adsdk.lottie.ac.Qhi> list = this.Qhi;
                list.remove(list.size() - 1);
            }
        }
        PointF Qhi = pAVar.Qhi();
        PointF Qhi2 = pAVar2.Qhi();
        Qhi(com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi(Qhi.x, Qhi2.x, f10), com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi(Qhi.y, Qhi2.y, f10));
        for (int size3 = this.Qhi.size() - 1; size3 >= 0; size3--) {
            com.bytedance.adsdk.lottie.ac.Qhi qhi = pAVar.ac().get(size3);
            com.bytedance.adsdk.lottie.ac.Qhi qhi2 = pAVar2.ac().get(size3);
            PointF Qhi3 = qhi.Qhi();
            PointF cJ = qhi.cJ();
            PointF ac2 = qhi.ac();
            PointF Qhi4 = qhi2.Qhi();
            PointF cJ2 = qhi2.cJ();
            PointF ac3 = qhi2.ac();
            this.Qhi.get(size3).Qhi(com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi(Qhi3.x, Qhi4.x, f10), com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi(Qhi3.y, Qhi4.y, f10));
            this.Qhi.get(size3).cJ(com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi(cJ.x, cJ2.x, f10), com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi(cJ.y, cJ2.y, f10));
            this.Qhi.get(size3).ac(com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi(ac2.x, ac3.x, f10), com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi(ac2.y, ac3.y, f10));
        }
    }
}
