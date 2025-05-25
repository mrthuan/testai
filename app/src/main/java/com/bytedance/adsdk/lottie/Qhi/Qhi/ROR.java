package com.bytedance.adsdk.lottie.Qhi.Qhi;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.lottie.Qhi.cJ.Qhi;
import com.bytedance.adsdk.lottie.ac.cJ.MQ;
import java.util.List;

/* compiled from: EllipseContent.java */
/* loaded from: classes.dex */
public class ROR implements iMK, zc, Qhi.InterfaceC0071Qhi {
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, PointF> CJ;
    private final Path Qhi = new Path();
    private final cJ ROR = new cJ();
    private boolean Sf;
    private final com.bytedance.adsdk.lottie.ac.cJ.cJ Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.hm f7712ac;
    private final String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, PointF> f7713fl;

    public ROR(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi, com.bytedance.adsdk.lottie.ac.cJ.cJ cJVar) {
        this.cJ = cJVar.Qhi();
        this.f7712ac = hmVar;
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<PointF, PointF> Qhi = cJVar.ac().Qhi();
        this.CJ = Qhi;
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<PointF, PointF> Qhi2 = cJVar.cJ().Qhi();
        this.f7713fl = Qhi2;
        this.Tgh = cJVar;
        qhi.Qhi(Qhi);
        qhi.Qhi(Qhi2);
        Qhi.Qhi(this);
        Qhi2.Qhi(this);
    }

    private void cJ() {
        this.Sf = false;
        this.f7712ac.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.iMK
    public Path CJ() {
        if (this.Sf) {
            return this.Qhi;
        }
        this.Qhi.reset();
        if (this.Tgh.fl()) {
            this.Sf = true;
            return this.Qhi;
        }
        PointF ROR = this.CJ.ROR();
        float f10 = ROR.x / 2.0f;
        float f11 = ROR.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.Qhi.reset();
        if (this.Tgh.CJ()) {
            float f14 = -f11;
            this.Qhi.moveTo(0.0f, f14);
            float f15 = 0.0f - f12;
            float f16 = -f10;
            float f17 = 0.0f - f13;
            this.Qhi.cubicTo(f15, f14, f16, f17, f16, 0.0f);
            float f18 = f13 + 0.0f;
            this.Qhi.cubicTo(f16, f18, f15, f11, 0.0f, f11);
            float f19 = f12 + 0.0f;
            this.Qhi.cubicTo(f19, f11, f10, f18, f10, 0.0f);
            this.Qhi.cubicTo(f10, f17, f19, f14, 0.0f, f14);
        } else {
            float f20 = -f11;
            this.Qhi.moveTo(0.0f, f20);
            float f21 = f12 + 0.0f;
            float f22 = 0.0f - f13;
            this.Qhi.cubicTo(f21, f20, f10, f22, f10, 0.0f);
            float f23 = f13 + 0.0f;
            this.Qhi.cubicTo(f10, f23, f21, f11, 0.0f, f11);
            float f24 = 0.0f - f12;
            float f25 = -f10;
            this.Qhi.cubicTo(f24, f11, f25, f23, f25, 0.0f);
            this.Qhi.cubicTo(f25, f22, f24, f20, 0.0f, f20);
        }
        PointF ROR2 = this.f7713fl.ROR();
        this.Qhi.offset(ROR2.x, ROR2.y);
        this.Qhi.close();
        this.ROR.Qhi(this.Qhi);
        this.Sf = true;
        return this.Qhi;
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.InterfaceC0071Qhi
    public void Qhi() {
        cJ();
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.ac
    public void Qhi(List<ac> list, List<ac> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            ac acVar = list.get(i10);
            if (acVar instanceof EBS) {
                EBS ebs = (EBS) acVar;
                if (ebs.cJ() == MQ.Qhi.SIMULTANEOUSLY) {
                    this.ROR.Qhi(ebs);
                    ebs.Qhi(this);
                }
            }
        }
    }
}
