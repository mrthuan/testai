package com.bytedance.adsdk.lottie.Qhi.Qhi;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.Qhi.cJ.Qhi;
import com.bytedance.adsdk.lottie.ac.cJ.MQ;
import java.util.List;

/* compiled from: RectangleContent.java */
/* loaded from: classes.dex */
public class hpZ implements iMK, zc, Qhi.InterfaceC0071Qhi {
    private final boolean CJ;
    private boolean Gm;
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, PointF> ROR;
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> Sf;
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, PointF> Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final String f7728ac;

    /* renamed from: fl  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.hm f7729fl;
    private final Path Qhi = new Path();
    private final RectF cJ = new RectF();

    /* renamed from: hm  reason: collision with root package name */
    private final cJ f7730hm = new cJ();
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> WAv = null;

    public hpZ(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi, com.bytedance.adsdk.lottie.ac.cJ.zc zcVar) {
        this.f7728ac = zcVar.Qhi();
        this.CJ = zcVar.fl();
        this.f7729fl = hmVar;
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<PointF, PointF> Qhi = zcVar.CJ().Qhi();
        this.Tgh = Qhi;
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<PointF, PointF> Qhi2 = zcVar.ac().Qhi();
        this.ROR = Qhi2;
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Qhi3 = zcVar.cJ().Qhi();
        this.Sf = Qhi3;
        qhi.Qhi(Qhi);
        qhi.Qhi(Qhi2);
        qhi.Qhi(Qhi3);
        Qhi.Qhi(this);
        Qhi2.Qhi(this);
        Qhi3.Qhi(this);
    }

    private void cJ() {
        this.Gm = false;
        this.f7729fl.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.iMK
    public Path CJ() {
        float hm2;
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> qhi;
        if (this.Gm) {
            return this.Qhi;
        }
        this.Qhi.reset();
        if (this.CJ) {
            this.Gm = true;
            return this.Qhi;
        }
        PointF ROR = this.ROR.ROR();
        float f10 = ROR.x / 2.0f;
        float f11 = ROR.y / 2.0f;
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> qhi2 = this.Sf;
        if (qhi2 == null) {
            hm2 = 0.0f;
        } else {
            hm2 = ((com.bytedance.adsdk.lottie.Qhi.cJ.fl) qhi2).hm();
        }
        if (hm2 == 0.0f && (qhi = this.WAv) != null) {
            hm2 = Math.min(qhi.ROR().floatValue(), Math.min(f10, f11));
        }
        float min = Math.min(f10, f11);
        if (hm2 > min) {
            hm2 = min;
        }
        PointF ROR2 = this.Tgh.ROR();
        this.Qhi.moveTo(ROR2.x + f10, (ROR2.y - f11) + hm2);
        this.Qhi.lineTo(ROR2.x + f10, (ROR2.y + f11) - hm2);
        int i10 = (hm2 > 0.0f ? 1 : (hm2 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            RectF rectF = this.cJ;
            float f12 = ROR2.x;
            float f13 = hm2 * 2.0f;
            float f14 = ROR2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.Qhi.arcTo(this.cJ, 0.0f, 90.0f, false);
        }
        this.Qhi.lineTo((ROR2.x - f10) + hm2, ROR2.y + f11);
        if (i10 > 0) {
            RectF rectF2 = this.cJ;
            float f15 = ROR2.x;
            float f16 = ROR2.y;
            float f17 = hm2 * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.Qhi.arcTo(this.cJ, 90.0f, 90.0f, false);
        }
        this.Qhi.lineTo(ROR2.x - f10, (ROR2.y - f11) + hm2);
        if (i10 > 0) {
            RectF rectF3 = this.cJ;
            float f18 = ROR2.x;
            float f19 = ROR2.y;
            float f20 = hm2 * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.Qhi.arcTo(this.cJ, 180.0f, 90.0f, false);
        }
        this.Qhi.lineTo((ROR2.x + f10) - hm2, ROR2.y - f11);
        if (i10 > 0) {
            RectF rectF4 = this.cJ;
            float f21 = ROR2.x;
            float f22 = hm2 * 2.0f;
            float f23 = ROR2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.Qhi.arcTo(this.cJ, 270.0f, 90.0f, false);
        }
        this.Qhi.close();
        this.f7730hm.Qhi(this.Qhi);
        this.Gm = true;
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
                    this.f7730hm.Qhi(ebs);
                    ebs.Qhi(this);
                }
            }
            if (acVar instanceof kYc) {
                this.WAv = ((kYc) acVar).cJ();
            }
        }
    }
}
