package com.bytedance.adsdk.lottie.Qhi.Qhi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.activity.r;
import com.bytedance.adsdk.lottie.Qhi.cJ.Qhi;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: FillContent.java */
/* loaded from: classes.dex */
public class Sf implements Tgh, zc, Qhi.InterfaceC0071Qhi {
    private com.bytedance.adsdk.lottie.Qhi.cJ.ac ABk;
    private final com.bytedance.adsdk.lottie.ac.ac.Qhi CJ;
    private final com.bytedance.adsdk.lottie.hm Gm;
    float Qhi;
    private final List<iMK> ROR;
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> Sf;
    private final boolean Tgh;
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<ColorFilter, ColorFilter> WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final Paint f7714ac;
    private final Path cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final String f7715fl;

    /* renamed from: hm  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> f7716hm;

    /* renamed from: zc  reason: collision with root package name */
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> f7717zc;

    public Sf(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi, com.bytedance.adsdk.lottie.ac.cJ.hpZ hpz) {
        Path path = new Path();
        this.cJ = path;
        this.f7714ac = new com.bytedance.adsdk.lottie.Qhi.Qhi(1);
        this.ROR = new ArrayList();
        this.CJ = qhi;
        this.f7715fl = hpz.Qhi();
        this.Tgh = hpz.fl();
        this.Gm = hmVar;
        if (qhi.Tgh() != null) {
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Qhi = qhi.Tgh().Qhi().Qhi();
            this.f7717zc = Qhi;
            Qhi.Qhi(this);
            qhi.Qhi(this.f7717zc);
        }
        if (qhi.ROR() != null) {
            this.ABk = new com.bytedance.adsdk.lottie.Qhi.cJ.ac(this, qhi, qhi.ROR());
        }
        if (hpz.cJ() != null && hpz.ac() != null) {
            path.setFillType(hpz.CJ());
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> Qhi2 = hpz.cJ().Qhi();
            this.Sf = Qhi2;
            Qhi2.Qhi(this);
            qhi.Qhi(Qhi2);
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> Qhi3 = hpz.ac().Qhi();
            this.f7716hm = Qhi3;
            Qhi3.Qhi(this);
            qhi.Qhi(Qhi3);
            return;
        }
        this.Sf = null;
        this.f7716hm = null;
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.InterfaceC0071Qhi
    public void Qhi() {
        this.Gm.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.ac
    public void Qhi(List<ac> list, List<ac> list2) {
        for (int i10 = 0; i10 < list2.size(); i10++) {
            ac acVar = list2.get(i10);
            if (acVar instanceof iMK) {
                this.ROR.add((iMK) acVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.Tgh
    public void Qhi(Canvas canvas, Matrix matrix, int i10) {
        if (this.Tgh) {
            return;
        }
        com.bytedance.adsdk.lottie.Tgh.Qhi("FillContent#draw");
        this.f7714ac.setColor((com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi((int) r.b(i10 / 255.0f, this.f7716hm.ROR().intValue(), 100.0f, 255.0f), 0, (int) FunctionEval.FunctionID.EXTERNAL_FUNC) << 24) | (((com.bytedance.adsdk.lottie.Qhi.cJ.cJ) this.Sf).hm() & 16777215));
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<ColorFilter, ColorFilter> qhi = this.WAv;
        if (qhi != null) {
            this.f7714ac.setColorFilter(qhi.ROR());
        }
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> qhi2 = this.f7717zc;
        if (qhi2 != null) {
            float floatValue = qhi2.ROR().floatValue();
            if (floatValue == 0.0f) {
                this.f7714ac.setMaskFilter(null);
            } else if (floatValue != this.Qhi) {
                this.f7714ac.setMaskFilter(this.CJ.cJ(floatValue));
            }
            this.Qhi = floatValue;
        }
        com.bytedance.adsdk.lottie.Qhi.cJ.ac acVar = this.ABk;
        if (acVar != null) {
            acVar.Qhi(this.f7714ac);
        }
        this.cJ.reset();
        for (int i11 = 0; i11 < this.ROR.size(); i11++) {
            this.cJ.addPath(this.ROR.get(i11).CJ(), matrix);
        }
        canvas.drawPath(this.cJ, this.f7714ac);
        com.bytedance.adsdk.lottie.Tgh.cJ("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.Tgh
    public void Qhi(RectF rectF, Matrix matrix, boolean z10) {
        this.cJ.reset();
        for (int i10 = 0; i10 < this.ROR.size(); i10++) {
            this.cJ.addPath(this.ROR.get(i10).CJ(), matrix);
        }
        this.cJ.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}
