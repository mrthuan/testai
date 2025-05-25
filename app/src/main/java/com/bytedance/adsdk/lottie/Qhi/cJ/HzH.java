package com.bytedance.adsdk.lottie.Qhi.cJ;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.bytedance.adsdk.lottie.Qhi.cJ.Qhi;

/* compiled from: TransformKeyframeAnimation.java */
/* loaded from: classes.dex */
public class HzH {
    private Qhi<?, Float> ABk;
    private final Matrix CJ;
    private fl Gm;
    private final Matrix Qhi = new Matrix();
    private Qhi<?, PointF> ROR;
    private Qhi<com.bytedance.adsdk.lottie.ROR.ac, com.bytedance.adsdk.lottie.ROR.ac> Sf;
    private Qhi<PointF, PointF> Tgh;
    private Qhi<Integer, Integer> WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final Matrix f7740ac;
    private final Matrix cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final float[] f7741fl;

    /* renamed from: hm  reason: collision with root package name */
    private Qhi<Float, Float> f7742hm;
    private Qhi<?, Float> iMK;

    /* renamed from: zc  reason: collision with root package name */
    private fl f7743zc;

    public HzH(com.bytedance.adsdk.lottie.ac.Qhi.ABk aBk) {
        Qhi<PointF, PointF> Qhi;
        Qhi<PointF, PointF> Qhi2;
        Qhi<com.bytedance.adsdk.lottie.ROR.ac, com.bytedance.adsdk.lottie.ROR.ac> Qhi3;
        Qhi<Float, Float> Qhi4;
        fl flVar;
        fl flVar2;
        if (aBk.Qhi() == null) {
            Qhi = null;
        } else {
            Qhi = aBk.Qhi().Qhi();
        }
        this.Tgh = Qhi;
        if (aBk.cJ() == null) {
            Qhi2 = null;
        } else {
            Qhi2 = aBk.cJ().Qhi();
        }
        this.ROR = Qhi2;
        if (aBk.ac() == null) {
            Qhi3 = null;
        } else {
            Qhi3 = aBk.ac().Qhi();
        }
        this.Sf = Qhi3;
        if (aBk.CJ() == null) {
            Qhi4 = null;
        } else {
            Qhi4 = aBk.CJ().Qhi();
        }
        this.f7742hm = Qhi4;
        if (aBk.Sf() == null) {
            flVar = null;
        } else {
            flVar = (fl) aBk.Sf().Qhi();
        }
        this.Gm = flVar;
        if (flVar != null) {
            this.cJ = new Matrix();
            this.f7740ac = new Matrix();
            this.CJ = new Matrix();
            this.f7741fl = new float[9];
        } else {
            this.cJ = null;
            this.f7740ac = null;
            this.CJ = null;
            this.f7741fl = null;
        }
        if (aBk.hm() == null) {
            flVar2 = null;
        } else {
            flVar2 = (fl) aBk.hm().Qhi();
        }
        this.f7743zc = flVar2;
        if (aBk.fl() != null) {
            this.WAv = aBk.fl().Qhi();
        }
        if (aBk.Tgh() != null) {
            this.ABk = aBk.Tgh().Qhi();
        } else {
            this.ABk = null;
        }
        if (aBk.ROR() != null) {
            this.iMK = aBk.ROR().Qhi();
        } else {
            this.iMK = null;
        }
    }

    private void fl() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f7741fl[i10] = 0.0f;
        }
    }

    public Matrix CJ() {
        fl flVar;
        PointF ROR;
        fl flVar2;
        float cos;
        fl flVar3;
        float sin;
        float hm2;
        PointF ROR2;
        this.Qhi.reset();
        Qhi<?, PointF> qhi = this.ROR;
        if (qhi != null && (ROR2 = qhi.ROR()) != null) {
            float f10 = ROR2.x;
            if (f10 != 0.0f || ROR2.y != 0.0f) {
                this.Qhi.preTranslate(f10, ROR2.y);
            }
        }
        Qhi<Float, Float> qhi2 = this.f7742hm;
        if (qhi2 != null) {
            if (qhi2 instanceof kYc) {
                hm2 = qhi2.ROR().floatValue();
            } else {
                hm2 = ((fl) qhi2).hm();
            }
            if (hm2 != 0.0f) {
                this.Qhi.preRotate(hm2);
            }
        }
        if (this.Gm != null) {
            if (this.f7743zc == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-flVar2.hm()) + 90.0f));
            }
            if (this.f7743zc == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-flVar3.hm()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(flVar.hm()));
            fl();
            float[] fArr = this.f7741fl;
            fArr[0] = cos;
            fArr[1] = sin;
            float f11 = -sin;
            fArr[3] = f11;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.cJ.setValues(fArr);
            fl();
            float[] fArr2 = this.f7741fl;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f7740ac.setValues(fArr2);
            fl();
            float[] fArr3 = this.f7741fl;
            fArr3[0] = cos;
            fArr3[1] = f11;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.CJ.setValues(fArr3);
            this.f7740ac.preConcat(this.cJ);
            this.CJ.preConcat(this.f7740ac);
            this.Qhi.preConcat(this.CJ);
        }
        Qhi<com.bytedance.adsdk.lottie.ROR.ac, com.bytedance.adsdk.lottie.ROR.ac> qhi3 = this.Sf;
        if (qhi3 != null) {
            com.bytedance.adsdk.lottie.ROR.ac ROR3 = qhi3.ROR();
            if (ROR3.Qhi() != 1.0f || ROR3.cJ() != 1.0f) {
                this.Qhi.preScale(ROR3.Qhi(), ROR3.cJ());
            }
        }
        Qhi<PointF, PointF> qhi4 = this.Tgh;
        if (qhi4 != null && (((ROR = qhi4.ROR()) != null && ROR.x != 0.0f) || ROR.y != 0.0f)) {
            this.Qhi.preTranslate(-ROR.x, -ROR.y);
        }
        return this.Qhi;
    }

    public void Qhi(com.bytedance.adsdk.lottie.ac.ac.Qhi qhi) {
        qhi.Qhi(this.WAv);
        qhi.Qhi(this.ABk);
        qhi.Qhi(this.iMK);
        qhi.Qhi(this.Tgh);
        qhi.Qhi(this.ROR);
        qhi.Qhi(this.Sf);
        qhi.Qhi(this.f7742hm);
        qhi.Qhi(this.Gm);
        qhi.Qhi(this.f7743zc);
    }

    public Qhi<?, Float> ac() {
        return this.iMK;
    }

    public Qhi<?, Float> cJ() {
        return this.ABk;
    }

    public Matrix cJ(float f10) {
        Qhi<?, PointF> qhi = this.ROR;
        PointF ROR = qhi == null ? null : qhi.ROR();
        Qhi<com.bytedance.adsdk.lottie.ROR.ac, com.bytedance.adsdk.lottie.ROR.ac> qhi2 = this.Sf;
        com.bytedance.adsdk.lottie.ROR.ac ROR2 = qhi2 == null ? null : qhi2.ROR();
        this.Qhi.reset();
        if (ROR != null) {
            this.Qhi.preTranslate(ROR.x * f10, ROR.y * f10);
        }
        if (ROR2 != null) {
            double d10 = f10;
            this.Qhi.preScale((float) Math.pow(ROR2.Qhi(), d10), (float) Math.pow(ROR2.cJ(), d10));
        }
        Qhi<Float, Float> qhi3 = this.f7742hm;
        if (qhi3 != null) {
            float floatValue = qhi3.ROR().floatValue();
            Qhi<PointF, PointF> qhi4 = this.Tgh;
            PointF ROR3 = qhi4 != null ? qhi4.ROR() : null;
            this.Qhi.preRotate(floatValue * f10, ROR3 == null ? 0.0f : ROR3.x, ROR3 != null ? ROR3.y : 0.0f);
        }
        return this.Qhi;
    }

    public void Qhi(Qhi.InterfaceC0071Qhi interfaceC0071Qhi) {
        Qhi<Integer, Integer> qhi = this.WAv;
        if (qhi != null) {
            qhi.Qhi(interfaceC0071Qhi);
        }
        Qhi<?, Float> qhi2 = this.ABk;
        if (qhi2 != null) {
            qhi2.Qhi(interfaceC0071Qhi);
        }
        Qhi<?, Float> qhi3 = this.iMK;
        if (qhi3 != null) {
            qhi3.Qhi(interfaceC0071Qhi);
        }
        Qhi<PointF, PointF> qhi4 = this.Tgh;
        if (qhi4 != null) {
            qhi4.Qhi(interfaceC0071Qhi);
        }
        Qhi<?, PointF> qhi5 = this.ROR;
        if (qhi5 != null) {
            qhi5.Qhi(interfaceC0071Qhi);
        }
        Qhi<com.bytedance.adsdk.lottie.ROR.ac, com.bytedance.adsdk.lottie.ROR.ac> qhi6 = this.Sf;
        if (qhi6 != null) {
            qhi6.Qhi(interfaceC0071Qhi);
        }
        Qhi<Float, Float> qhi7 = this.f7742hm;
        if (qhi7 != null) {
            qhi7.Qhi(interfaceC0071Qhi);
        }
        fl flVar = this.Gm;
        if (flVar != null) {
            flVar.Qhi(interfaceC0071Qhi);
        }
        fl flVar2 = this.f7743zc;
        if (flVar2 != null) {
            flVar2.Qhi(interfaceC0071Qhi);
        }
    }

    public void Qhi(float f10) {
        Qhi<Integer, Integer> qhi = this.WAv;
        if (qhi != null) {
            qhi.Qhi(f10);
        }
        Qhi<?, Float> qhi2 = this.ABk;
        if (qhi2 != null) {
            qhi2.Qhi(f10);
        }
        Qhi<?, Float> qhi3 = this.iMK;
        if (qhi3 != null) {
            qhi3.Qhi(f10);
        }
        Qhi<PointF, PointF> qhi4 = this.Tgh;
        if (qhi4 != null) {
            qhi4.Qhi(f10);
        }
        Qhi<?, PointF> qhi5 = this.ROR;
        if (qhi5 != null) {
            qhi5.Qhi(f10);
        }
        Qhi<com.bytedance.adsdk.lottie.ROR.ac, com.bytedance.adsdk.lottie.ROR.ac> qhi6 = this.Sf;
        if (qhi6 != null) {
            qhi6.Qhi(f10);
        }
        Qhi<Float, Float> qhi7 = this.f7742hm;
        if (qhi7 != null) {
            qhi7.Qhi(f10);
        }
        fl flVar = this.Gm;
        if (flVar != null) {
            flVar.Qhi(f10);
        }
        fl flVar2 = this.f7743zc;
        if (flVar2 != null) {
            flVar2.Qhi(f10);
        }
    }

    public Qhi<?, Integer> Qhi() {
        return this.WAv;
    }
}
