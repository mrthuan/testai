package com.bytedance.adsdk.lottie.Qhi.Qhi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import androidx.activity.r;
import com.bytedance.adsdk.lottie.Qhi.cJ.Qhi;
import com.bytedance.adsdk.lottie.ac.cJ.MQ;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: BaseStrokeContent.java */
/* loaded from: classes.dex */
public abstract class Qhi implements Tgh, zc, Qhi.InterfaceC0071Qhi {
    private final List<com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float>> ABk;
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> Gm;
    private com.bytedance.adsdk.lottie.Qhi.cJ.ac HzH;
    protected final com.bytedance.adsdk.lottie.ac.ac.Qhi Qhi;
    private final com.bytedance.adsdk.lottie.hm Sf;
    private final float[] WAv;

    /* renamed from: ac  reason: collision with root package name */
    float f7708ac;
    final Paint cJ;
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> hpZ;
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> iMK;
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<ColorFilter, ColorFilter> pA;

    /* renamed from: zc  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Integer> f7711zc;
    private final PathMeasure CJ = new PathMeasure();

    /* renamed from: fl  reason: collision with root package name */
    private final Path f7709fl = new Path();
    private final Path Tgh = new Path();
    private final RectF ROR = new RectF();

    /* renamed from: hm  reason: collision with root package name */
    private final List<C0070Qhi> f7710hm = new ArrayList();

    /* compiled from: BaseStrokeContent.java */
    /* renamed from: com.bytedance.adsdk.lottie.Qhi.Qhi.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0070Qhi {
        private final List<iMK> Qhi;
        private final EBS cJ;

        private C0070Qhi(EBS ebs) {
            this.Qhi = new ArrayList();
            this.cJ = ebs;
        }
    }

    public Qhi(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi, Paint.Cap cap, Paint.Join join, float f10, com.bytedance.adsdk.lottie.ac.Qhi.fl flVar, com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar, List<com.bytedance.adsdk.lottie.ac.Qhi.cJ> list, com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar2) {
        com.bytedance.adsdk.lottie.Qhi.Qhi qhi2 = new com.bytedance.adsdk.lottie.Qhi.Qhi(1);
        this.cJ = qhi2;
        this.f7708ac = 0.0f;
        this.Sf = hmVar;
        this.Qhi = qhi;
        qhi2.setStyle(Paint.Style.STROKE);
        qhi2.setStrokeCap(cap);
        qhi2.setStrokeJoin(join);
        qhi2.setStrokeMiter(f10);
        this.f7711zc = flVar.Qhi();
        this.Gm = cJVar.Qhi();
        if (cJVar2 == null) {
            this.iMK = null;
        } else {
            this.iMK = cJVar2.Qhi();
        }
        this.ABk = new ArrayList(list.size());
        this.WAv = new float[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.ABk.add(list.get(i10).Qhi());
        }
        qhi.Qhi(this.f7711zc);
        qhi.Qhi(this.Gm);
        for (int i11 = 0; i11 < this.ABk.size(); i11++) {
            qhi.Qhi(this.ABk.get(i11));
        }
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> qhi3 = this.iMK;
        if (qhi3 != null) {
            qhi.Qhi(qhi3);
        }
        this.f7711zc.Qhi(this);
        this.Gm.Qhi(this);
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.ABk.get(i12).Qhi(this);
        }
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> qhi4 = this.iMK;
        if (qhi4 != null) {
            qhi4.Qhi(this);
        }
        if (qhi.Tgh() != null) {
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Qhi = qhi.Tgh().Qhi().Qhi();
            this.hpZ = Qhi;
            Qhi.Qhi(this);
            qhi.Qhi(this.hpZ);
        }
        if (qhi.ROR() != null) {
            this.HzH = new com.bytedance.adsdk.lottie.Qhi.cJ.ac(this, qhi, qhi.ROR());
        }
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.InterfaceC0071Qhi
    public void Qhi() {
        this.Sf.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.ac
    public void Qhi(List<ac> list, List<ac> list2) {
        EBS ebs = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            ac acVar = list.get(size);
            if (acVar instanceof EBS) {
                EBS ebs2 = (EBS) acVar;
                if (ebs2.cJ() == MQ.Qhi.INDIVIDUALLY) {
                    ebs = ebs2;
                }
            }
        }
        if (ebs != null) {
            ebs.Qhi(this);
        }
        C0070Qhi c0070Qhi = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            ac acVar2 = list2.get(size2);
            if (acVar2 instanceof EBS) {
                EBS ebs3 = (EBS) acVar2;
                if (ebs3.cJ() == MQ.Qhi.INDIVIDUALLY) {
                    if (c0070Qhi != null) {
                        this.f7710hm.add(c0070Qhi);
                    }
                    c0070Qhi = new C0070Qhi(ebs3);
                    ebs3.Qhi(this);
                }
            }
            if (acVar2 instanceof iMK) {
                if (c0070Qhi == null) {
                    c0070Qhi = new C0070Qhi(ebs);
                }
                c0070Qhi.Qhi.add((iMK) acVar2);
            }
        }
        if (c0070Qhi != null) {
            this.f7710hm.add(c0070Qhi);
        }
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.Tgh
    public void Qhi(Canvas canvas, Matrix matrix, int i10) {
        com.bytedance.adsdk.lottie.Tgh.Qhi("StrokeContent#draw");
        if (com.bytedance.adsdk.lottie.Tgh.ROR.cJ(matrix)) {
            com.bytedance.adsdk.lottie.Tgh.cJ("StrokeContent#draw");
            return;
        }
        this.cJ.setAlpha(com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi((int) r.b(i10 / 255.0f, ((com.bytedance.adsdk.lottie.Qhi.cJ.ROR) this.f7711zc).hm(), 100.0f, 255.0f), 0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC));
        this.cJ.setStrokeWidth(com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(matrix) * ((com.bytedance.adsdk.lottie.Qhi.cJ.fl) this.Gm).hm());
        if (this.cJ.getStrokeWidth() <= 0.0f) {
            com.bytedance.adsdk.lottie.Tgh.cJ("StrokeContent#draw");
            return;
        }
        Qhi(matrix);
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<ColorFilter, ColorFilter> qhi = this.pA;
        if (qhi != null) {
            this.cJ.setColorFilter(qhi.ROR());
        }
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> qhi2 = this.hpZ;
        if (qhi2 != null) {
            float floatValue = qhi2.ROR().floatValue();
            if (floatValue == 0.0f) {
                this.cJ.setMaskFilter(null);
            } else if (floatValue != this.f7708ac) {
                this.cJ.setMaskFilter(this.Qhi.cJ(floatValue));
            }
            this.f7708ac = floatValue;
        }
        com.bytedance.adsdk.lottie.Qhi.cJ.ac acVar = this.HzH;
        if (acVar != null) {
            acVar.Qhi(this.cJ);
        }
        for (int i11 = 0; i11 < this.f7710hm.size(); i11++) {
            C0070Qhi c0070Qhi = this.f7710hm.get(i11);
            if (c0070Qhi.cJ != null) {
                Qhi(canvas, c0070Qhi, matrix);
            } else {
                com.bytedance.adsdk.lottie.Tgh.Qhi("StrokeContent#buildPath");
                this.f7709fl.reset();
                int size = c0070Qhi.Qhi.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f7709fl.addPath(((iMK) c0070Qhi.Qhi.get(size)).CJ(), matrix);
                }
                com.bytedance.adsdk.lottie.Tgh.cJ("StrokeContent#buildPath");
                com.bytedance.adsdk.lottie.Tgh.Qhi("StrokeContent#drawPath");
                canvas.drawPath(this.f7709fl, this.cJ);
                com.bytedance.adsdk.lottie.Tgh.cJ("StrokeContent#drawPath");
            }
        }
        com.bytedance.adsdk.lottie.Tgh.cJ("StrokeContent#draw");
    }

    private void Qhi(Canvas canvas, C0070Qhi c0070Qhi, Matrix matrix) {
        float f10;
        float f11;
        com.bytedance.adsdk.lottie.Tgh.Qhi("StrokeContent#applyTrimPath");
        if (c0070Qhi.cJ == null) {
            com.bytedance.adsdk.lottie.Tgh.cJ("StrokeContent#applyTrimPath");
            return;
        }
        this.f7709fl.reset();
        for (int size = c0070Qhi.Qhi.size() - 1; size >= 0; size--) {
            this.f7709fl.addPath(((iMK) c0070Qhi.Qhi.get(size)).CJ(), matrix);
        }
        float floatValue = c0070Qhi.cJ.ac().ROR().floatValue() / 100.0f;
        float floatValue2 = c0070Qhi.cJ.CJ().ROR().floatValue() / 100.0f;
        float floatValue3 = c0070Qhi.cJ.fl().ROR().floatValue() / 360.0f;
        if (floatValue < 0.01f && floatValue2 > 0.99f) {
            canvas.drawPath(this.f7709fl, this.cJ);
            com.bytedance.adsdk.lottie.Tgh.cJ("StrokeContent#applyTrimPath");
            return;
        }
        this.CJ.setPath(this.f7709fl, false);
        float length = this.CJ.getLength();
        while (this.CJ.nextContour()) {
            length += this.CJ.getLength();
        }
        float f12 = floatValue3 * length;
        float f13 = (floatValue * length) + f12;
        float min = Math.min((floatValue2 * length) + f12, (f13 + length) - 1.0f);
        float f14 = 0.0f;
        for (int size2 = c0070Qhi.Qhi.size() - 1; size2 >= 0; size2--) {
            this.Tgh.set(((iMK) c0070Qhi.Qhi.get(size2)).CJ());
            this.Tgh.transform(matrix);
            this.CJ.setPath(this.Tgh, false);
            float length2 = this.CJ.getLength();
            if (min > length) {
                float f15 = min - length;
                if (f15 < f14 + length2 && f14 < f15) {
                    f10 = f13 > length ? (f13 - length) / length2 : 0.0f;
                    f11 = Math.min(f15 / length2, 1.0f);
                    com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(this.Tgh, f10, f11, 0.0f);
                    canvas.drawPath(this.Tgh, this.cJ);
                    f14 += length2;
                }
            }
            float f16 = f14 + length2;
            if (f16 >= f13 && f14 <= min) {
                if (f16 <= min && f13 < f14) {
                    canvas.drawPath(this.Tgh, this.cJ);
                } else {
                    f10 = f13 < f14 ? 0.0f : (f13 - f14) / length2;
                    f11 = min > f16 ? 1.0f : (min - f14) / length2;
                    com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(this.Tgh, f10, f11, 0.0f);
                    canvas.drawPath(this.Tgh, this.cJ);
                }
            }
            f14 += length2;
        }
        com.bytedance.adsdk.lottie.Tgh.cJ("StrokeContent#applyTrimPath");
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.Tgh
    public void Qhi(RectF rectF, Matrix matrix, boolean z10) {
        com.bytedance.adsdk.lottie.Tgh.Qhi("StrokeContent#getBounds");
        this.f7709fl.reset();
        for (int i10 = 0; i10 < this.f7710hm.size(); i10++) {
            C0070Qhi c0070Qhi = this.f7710hm.get(i10);
            for (int i11 = 0; i11 < c0070Qhi.Qhi.size(); i11++) {
                this.f7709fl.addPath(((iMK) c0070Qhi.Qhi.get(i11)).CJ(), matrix);
            }
        }
        this.f7709fl.computeBounds(this.ROR, false);
        float hm2 = ((com.bytedance.adsdk.lottie.Qhi.cJ.fl) this.Gm).hm();
        RectF rectF2 = this.ROR;
        float f10 = hm2 / 2.0f;
        rectF2.set(rectF2.left - f10, rectF2.top - f10, rectF2.right + f10, rectF2.bottom + f10);
        rectF.set(this.ROR);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        com.bytedance.adsdk.lottie.Tgh.cJ("StrokeContent#getBounds");
    }

    private void Qhi(Matrix matrix) {
        com.bytedance.adsdk.lottie.Tgh.Qhi("StrokeContent#applyDashPattern");
        if (this.ABk.isEmpty()) {
            com.bytedance.adsdk.lottie.Tgh.cJ("StrokeContent#applyDashPattern");
            return;
        }
        float Qhi = com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(matrix);
        for (int i10 = 0; i10 < this.ABk.size(); i10++) {
            this.WAv[i10] = this.ABk.get(i10).ROR().floatValue();
            if (i10 % 2 == 0) {
                float[] fArr = this.WAv;
                if (fArr[i10] < 1.0f) {
                    fArr[i10] = 1.0f;
                }
            } else {
                float[] fArr2 = this.WAv;
                if (fArr2[i10] < 0.1f) {
                    fArr2[i10] = 0.1f;
                }
            }
            float[] fArr3 = this.WAv;
            fArr3[i10] = fArr3[i10] * Qhi;
        }
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Float> qhi = this.iMK;
        this.cJ.setPathEffect(new DashPathEffect(this.WAv, qhi == null ? 0.0f : Qhi * qhi.ROR().floatValue()));
        com.bytedance.adsdk.lottie.Tgh.cJ("StrokeContent#applyDashPattern");
    }
}
