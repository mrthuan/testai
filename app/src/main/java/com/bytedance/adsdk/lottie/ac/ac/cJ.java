package com.bytedance.adsdk.lottie.ac.ac;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.LongSparseArray;
import com.bytedance.adsdk.lottie.ac.ac.fl;
import com.bytedance.component.sdk.annotation.FloatRange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CompositionLayer.java */
/* loaded from: classes.dex */
public class cJ extends Qhi {
    private final Paint Gm;
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> ROR;
    private final List<Qhi> Sf;
    private final RectF WAv;

    /* renamed from: hm  reason: collision with root package name */
    private final RectF f7793hm;

    /* renamed from: zc  reason: collision with root package name */
    private boolean f7794zc;

    /* compiled from: CompositionLayer.java */
    /* renamed from: com.bytedance.adsdk.lottie.ac.ac.cJ$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Qhi;

        static {
            int[] iArr = new int[fl.cJ.values().length];
            Qhi = iArr;
            try {
                iArr[fl.cJ.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Qhi[fl.cJ.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public cJ(com.bytedance.adsdk.lottie.hm hmVar, fl flVar, List<fl> list, com.bytedance.adsdk.lottie.ROR ror) {
        super(hmVar, flVar);
        int i10;
        Qhi qhi;
        fl.cJ zc2;
        int i11;
        this.Sf = new ArrayList();
        this.f7793hm = new RectF();
        this.WAv = new RectF();
        this.Gm = new Paint();
        this.f7794zc = true;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ qMt = flVar.qMt();
        if (qMt != null) {
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Qhi = qMt.Qhi();
            this.ROR = Qhi;
            Qhi(Qhi);
            this.ROR.Qhi(this);
        } else {
            this.ROR = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(ror.hm().size());
        int size = list.size() - 1;
        Qhi qhi2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            fl flVar2 = list.get(size);
            Qhi Qhi2 = Qhi.Qhi(this, flVar2, hmVar, ror);
            if (Qhi2 != null) {
                longSparseArray.put(Qhi2.cJ().fl(), Qhi2);
                if (qhi2 != null) {
                    qhi2.Qhi(Qhi2);
                    qhi2 = null;
                } else {
                    this.Sf.add(0, Qhi2);
                    if (flVar2 != null && (zc2 = flVar2.zc()) != null && ((i11 = AnonymousClass1.Qhi[zc2.ordinal()]) == 1 || i11 == 2)) {
                        qhi2 = Qhi2;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < longSparseArray.size(); i10++) {
            Qhi qhi3 = (Qhi) longSparseArray.get(longSparseArray.keyAt(i10));
            if (qhi3 != null && (qhi = (Qhi) longSparseArray.get(qhi3.cJ().ABk())) != null) {
                qhi3.cJ(qhi);
            }
        }
    }

    @Override // com.bytedance.adsdk.lottie.ac.ac.Qhi
    public void Qhi(boolean z10) {
        super.Qhi(z10);
        for (Qhi qhi : this.Sf) {
            qhi.Qhi(z10);
        }
    }

    public void cJ(boolean z10) {
        this.f7794zc = z10;
    }

    @Override // com.bytedance.adsdk.lottie.ac.ac.Qhi
    public void cJ(Canvas canvas, Matrix matrix, int i10) {
        com.bytedance.adsdk.lottie.Tgh.Qhi("CompositionLayer#draw");
        this.WAv.set(0.0f, 0.0f, this.f7785ac.Sf(), this.f7785ac.hm());
        matrix.mapRect(this.WAv);
        boolean z10 = this.cJ.ROR() && this.Sf.size() > 1 && i10 != 255;
        if (z10) {
            this.Gm.setAlpha(i10);
            com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(canvas, this.WAv, this.Gm);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.Sf.size() - 1; size >= 0; size--) {
            if (((!this.f7794zc && "__container".equals(this.f7785ac.Tgh())) || this.WAv.isEmpty()) ? true : canvas.clipRect(this.WAv)) {
                this.Sf.get(size).Qhi(canvas, matrix, i10);
            }
        }
        canvas.restore();
        com.bytedance.adsdk.lottie.Tgh.cJ("CompositionLayer#draw");
    }

    @Override // com.bytedance.adsdk.lottie.ac.ac.Qhi, com.bytedance.adsdk.lottie.Qhi.Qhi.Tgh
    public void Qhi(RectF rectF, Matrix matrix, boolean z10) {
        super.Qhi(rectF, matrix, z10);
        for (int size = this.Sf.size() - 1; size >= 0; size--) {
            this.f7793hm.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.Sf.get(size).Qhi(this.f7793hm, this.Qhi, true);
            rectF.union(this.f7793hm);
        }
    }

    @Override // com.bytedance.adsdk.lottie.ac.ac.Qhi
    public void Qhi(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        super.Qhi(f10);
        if (this.ROR != null) {
            f10 = ((this.f7785ac.Qhi().Sf() * this.ROR.ROR().floatValue()) - this.f7785ac.Qhi().Tgh()) / (this.cJ.EBS().ABk() + 0.01f);
        }
        if (this.ROR == null) {
            f10 -= this.f7785ac.ac();
        }
        if (this.f7785ac.cJ() != 0.0f && !"__container".equals(this.f7785ac.Tgh())) {
            f10 /= this.f7785ac.cJ();
        }
        for (int size = this.Sf.size() - 1; size >= 0; size--) {
            this.Sf.get(size).Qhi(f10);
        }
    }
}
