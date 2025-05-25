package com.bytedance.adsdk.lottie.Qhi.Qhi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.LongSparseArray;

/* compiled from: GradientStrokeContent.java */
/* loaded from: classes.dex */
public class WAv extends Qhi {
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<PointF, PointF> ABk;
    private final String CJ;
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<com.bytedance.adsdk.lottie.ac.cJ.fl, com.bytedance.adsdk.lottie.ac.cJ.fl> Gm;
    private final LongSparseArray<RadialGradient> ROR;
    private final RectF Sf;
    private final LongSparseArray<LinearGradient> Tgh;
    private final int WAv;

    /* renamed from: fl  reason: collision with root package name */
    private final boolean f7718fl;

    /* renamed from: hm  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.ac.cJ.Sf f7719hm;
    private com.bytedance.adsdk.lottie.Qhi.cJ.kYc iMK;

    /* renamed from: zc  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<PointF, PointF> f7720zc;

    public WAv(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi, com.bytedance.adsdk.lottie.ac.cJ.ROR ror) {
        super(hmVar, qhi, ror.Sf().Qhi(), ror.hm().Qhi(), ror.zc(), ror.CJ(), ror.ROR(), ror.WAv(), ror.Gm());
        this.Tgh = new LongSparseArray<>();
        this.ROR = new LongSparseArray<>();
        this.Sf = new RectF();
        this.CJ = ror.Qhi();
        this.f7719hm = ror.cJ();
        this.f7718fl = ror.ABk();
        this.WAv = (int) (hmVar.EBS().fl() / 32.0f);
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<com.bytedance.adsdk.lottie.ac.cJ.fl, com.bytedance.adsdk.lottie.ac.cJ.fl> Qhi = ror.ac().Qhi();
        this.Gm = Qhi;
        Qhi.Qhi(this);
        qhi.Qhi(Qhi);
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<PointF, PointF> Qhi2 = ror.fl().Qhi();
        this.f7720zc = Qhi2;
        Qhi2.Qhi(this);
        qhi.Qhi(Qhi2);
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<PointF, PointF> Qhi3 = ror.Tgh().Qhi();
        this.ABk = Qhi3;
        Qhi3.Qhi(this);
        qhi.Qhi(Qhi3);
    }

    private int CJ() {
        int i10;
        int round = Math.round(this.f7720zc.Sf() * this.WAv);
        int round2 = Math.round(this.ABk.Sf() * this.WAv);
        int round3 = Math.round(this.Gm.Sf() * this.WAv);
        if (round != 0) {
            i10 = round * 527;
        } else {
            i10 = 17;
        }
        if (round2 != 0) {
            i10 = i10 * 31 * round2;
        }
        if (round3 != 0) {
            return i10 * 31 * round3;
        }
        return i10;
    }

    private RadialGradient ac() {
        float f10;
        float f11;
        long CJ = CJ();
        RadialGradient radialGradient = this.ROR.get(CJ);
        if (radialGradient != null) {
            return radialGradient;
        }
        PointF ROR = this.f7720zc.ROR();
        PointF ROR2 = this.ABk.ROR();
        com.bytedance.adsdk.lottie.ac.cJ.fl ROR3 = this.Gm.ROR();
        int[] Qhi = Qhi(ROR3.cJ());
        float[] Qhi2 = ROR3.Qhi();
        RadialGradient radialGradient2 = new RadialGradient(ROR.x, ROR.y, (float) Math.hypot(ROR2.x - f10, ROR2.y - f11), Qhi, Qhi2, Shader.TileMode.CLAMP);
        this.ROR.put(CJ, radialGradient2);
        return radialGradient2;
    }

    private LinearGradient cJ() {
        long CJ = CJ();
        LinearGradient linearGradient = this.Tgh.get(CJ);
        if (linearGradient != null) {
            return linearGradient;
        }
        PointF ROR = this.f7720zc.ROR();
        PointF ROR2 = this.ABk.ROR();
        com.bytedance.adsdk.lottie.ac.cJ.fl ROR3 = this.Gm.ROR();
        LinearGradient linearGradient2 = new LinearGradient(ROR.x, ROR.y, ROR2.x, ROR2.y, Qhi(ROR3.cJ()), ROR3.Qhi(), Shader.TileMode.CLAMP);
        this.Tgh.put(CJ, linearGradient2);
        return linearGradient2;
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.Qhi, com.bytedance.adsdk.lottie.Qhi.Qhi.Tgh
    public void Qhi(Canvas canvas, Matrix matrix, int i10) {
        Shader ac2;
        if (this.f7718fl) {
            return;
        }
        Qhi(this.Sf, matrix, false);
        if (this.f7719hm == com.bytedance.adsdk.lottie.ac.cJ.Sf.LINEAR) {
            ac2 = cJ();
        } else {
            ac2 = ac();
        }
        ac2.setLocalMatrix(matrix);
        this.cJ.setShader(ac2);
        super.Qhi(canvas, matrix, i10);
    }

    private int[] Qhi(int[] iArr) {
        if (this.iMK == null) {
            return iArr;
        }
        throw null;
    }
}
