package com.bytedance.adsdk.lottie.ac.ac;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.activity.r;
import com.bytedance.adsdk.lottie.Qhi.cJ.HzH;
import com.bytedance.adsdk.lottie.Qhi.cJ.Qhi;
import com.bytedance.adsdk.lottie.ac.ac.fl;
import com.bytedance.adsdk.lottie.ac.cJ.hm;
import com.bytedance.adsdk.lottie.ac.cJ.pA;
import com.bytedance.adsdk.lottie.fl.Gm;
import com.bytedance.component.sdk.annotation.FloatRange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: BaseLayer.java */
/* loaded from: classes.dex */
public abstract class Qhi implements com.bytedance.adsdk.lottie.Qhi.Qhi.Tgh, Qhi.InterfaceC0071Qhi {
    private final Paint ABk;
    final HzH CJ;
    private List<Qhi> CQU;
    private Qhi Dww;
    private com.bytedance.adsdk.lottie.Qhi.cJ.fl EBS;
    private boolean Eh;
    private final RectF HzH;
    private final String MQ;
    private Paint NFd;
    final Matrix Qhi;
    BlurMaskFilter Tgh;
    private boolean aP;

    /* renamed from: ac  reason: collision with root package name */
    final fl f7785ac;
    private Qhi bxS;
    final com.bytedance.adsdk.lottie.hm cJ;

    /* renamed from: fl  reason: collision with root package name */
    float f7786fl;
    private final RectF hpZ;
    private final Paint iMK;
    private final RectF kYc;
    private final RectF pA;
    private final List<com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, ?>> pM;
    private com.bytedance.adsdk.lottie.Qhi.cJ.hm qMt;
    private final RectF tP;
    private final Path ROR = new Path();
    private final Matrix Sf = new Matrix();

    /* renamed from: hm  reason: collision with root package name */
    private final Matrix f7787hm = new Matrix();
    private final Paint WAv = new com.bytedance.adsdk.lottie.Qhi.Qhi(1);
    private final Paint Gm = new com.bytedance.adsdk.lottie.Qhi.Qhi(1, PorterDuff.Mode.DST_IN);

    /* renamed from: zc  reason: collision with root package name */
    private final Paint f7788zc = new com.bytedance.adsdk.lottie.Qhi.Qhi(1, PorterDuff.Mode.DST_OUT);

    /* compiled from: BaseLayer.java */
    /* renamed from: com.bytedance.adsdk.lottie.ac.ac.Qhi$2  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] Qhi;
        static final /* synthetic */ int[] cJ;

        static {
            int[] iArr = new int[hm.Qhi.values().length];
            cJ = iArr;
            try {
                iArr[hm.Qhi.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                cJ[hm.Qhi.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                cJ[hm.Qhi.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                cJ[hm.Qhi.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[fl.Qhi.values().length];
            Qhi = iArr2;
            try {
                iArr2[fl.Qhi.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Qhi[fl.Qhi.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Qhi[fl.Qhi.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Qhi[fl.Qhi.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Qhi[fl.Qhi.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Qhi[fl.Qhi.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Qhi[fl.Qhi.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public Qhi(com.bytedance.adsdk.lottie.hm hmVar, fl flVar) {
        com.bytedance.adsdk.lottie.Qhi.Qhi qhi = new com.bytedance.adsdk.lottie.Qhi.Qhi(1);
        this.ABk = qhi;
        this.iMK = new com.bytedance.adsdk.lottie.Qhi.Qhi(PorterDuff.Mode.CLEAR);
        this.pA = new RectF();
        this.hpZ = new RectF();
        this.HzH = new RectF();
        this.kYc = new RectF();
        this.tP = new RectF();
        this.Qhi = new Matrix();
        this.pM = new ArrayList();
        this.Eh = true;
        this.f7786fl = 0.0f;
        this.cJ = hmVar;
        this.f7785ac = flVar;
        this.MQ = flVar.Tgh() + "#draw";
        if (flVar.zc() == fl.cJ.INVERT) {
            qhi.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            qhi.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        HzH WAv = flVar.pA().WAv();
        this.CJ = WAv;
        WAv.Qhi((Qhi.InterfaceC0071Qhi) this);
        if (flVar.WAv() != null && !flVar.WAv().isEmpty()) {
            com.bytedance.adsdk.lottie.Qhi.cJ.hm hmVar2 = new com.bytedance.adsdk.lottie.Qhi.cJ.hm(flVar.WAv());
            this.qMt = hmVar2;
            for (com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<pA, Path> qhi2 : hmVar2.cJ()) {
                qhi2.Qhi(this);
            }
            for (com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> qhi3 : this.qMt.ac()) {
                Qhi(qhi3);
                qhi3.Qhi(this);
            }
        }
        Sf();
    }

    private void CJ(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<pA, Path> qhi, com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> qhi2) {
        com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(canvas, this.pA, this.Gm);
        this.ROR.set(qhi.ROR());
        this.ROR.transform(matrix);
        this.WAv.setAlpha((int) (qhi2.ROR().intValue() * 2.55f));
        canvas.drawPath(this.ROR, this.WAv);
        canvas.restore();
    }

    private void Gm() {
        if (this.CQU != null) {
            return;
        }
        if (this.Dww == null) {
            this.CQU = Collections.emptyList();
            return;
        }
        this.CQU = new ArrayList();
        for (Qhi qhi = this.Dww; qhi != null; qhi = qhi.Dww) {
            this.CQU.add(qhi);
        }
    }

    private void Sf() {
        boolean z10 = true;
        if (!this.f7785ac.CJ().isEmpty()) {
            com.bytedance.adsdk.lottie.Qhi.cJ.fl flVar = new com.bytedance.adsdk.lottie.Qhi.cJ.fl(this.f7785ac.CJ());
            this.EBS = flVar;
            flVar.Qhi();
            this.EBS.Qhi(new Qhi.InterfaceC0071Qhi() { // from class: com.bytedance.adsdk.lottie.ac.ac.Qhi.1
                @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.InterfaceC0071Qhi
                public void Qhi() {
                    boolean z11;
                    Qhi qhi = Qhi.this;
                    if (qhi.EBS.hm() == 1.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    qhi.cJ(z11);
                }
            });
            if (this.EBS.ROR().floatValue() != 1.0f) {
                z10 = false;
            }
            cJ(z10);
            Qhi(this.EBS);
            return;
        }
        cJ(true);
    }

    private boolean WAv() {
        if (this.qMt.cJ().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.qMt.Qhi().size(); i10++) {
            if (this.qMt.Qhi().get(i10).Qhi() != hm.Qhi.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void fl(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<pA, Path> qhi, com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> qhi2) {
        com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(canvas, this.pA, this.Gm);
        canvas.drawRect(this.pA, this.WAv);
        this.f7788zc.setAlpha((int) (qhi2.ROR().intValue() * 2.55f));
        this.ROR.set(qhi.ROR());
        this.ROR.transform(matrix);
        canvas.drawPath(this.ROR, this.f7788zc);
        canvas.restore();
    }

    private void hm() {
        this.cJ.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.ac
    public void Qhi(List<com.bytedance.adsdk.lottie.Qhi.Qhi.ac> list, List<com.bytedance.adsdk.lottie.Qhi.Qhi.ac> list2) {
    }

    public Gm ROR() {
        return this.f7785ac.Dww();
    }

    public com.bytedance.adsdk.lottie.ac.cJ.Qhi Tgh() {
        return this.f7785ac.bxS();
    }

    public fl cJ() {
        return this.f7785ac;
    }

    public abstract void cJ(Canvas canvas, Matrix matrix, int i10);

    public boolean ac() {
        return this.bxS != null;
    }

    public void cJ(Qhi qhi) {
        this.Dww = qhi;
    }

    public static Qhi Qhi(cJ cJVar, fl flVar, com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ROR ror) {
        switch (AnonymousClass2.Qhi[flVar.Gm().ordinal()]) {
            case 1:
                return new ROR(hmVar, flVar, cJVar, ror);
            case 2:
                return new cJ(hmVar, flVar, ror.cJ(flVar.ROR()), ror);
            case 3:
                return new Sf(hmVar, flVar);
            case 4:
                return new ac(hmVar, flVar);
            case 5:
                return new Tgh(hmVar, flVar);
            case 6:
                return new hm(hmVar, flVar);
            default:
                Objects.toString(flVar.Gm());
                return null;
        }
    }

    private void ac(float f10) {
        this.cJ.EBS().ac().Qhi(this.f7785ac.Tgh(), f10);
    }

    private void cJ(RectF rectF, Matrix matrix) {
        if (ac() && this.f7785ac.zc() != fl.cJ.INVERT) {
            this.kYc.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.bxS.Qhi(this.kYc, matrix, true);
            if (rectF.intersect(this.kYc)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void ac(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<pA, Path> qhi, com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> qhi2) {
        com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(canvas, this.pA, this.f7788zc);
        canvas.drawRect(this.pA, this.WAv);
        this.f7788zc.setAlpha((int) (qhi2.ROR().intValue() * 2.55f));
        this.ROR.set(qhi.ROR());
        this.ROR.transform(matrix);
        canvas.drawPath(this.ROR, this.f7788zc);
        canvas.restore();
    }

    public boolean CJ() {
        com.bytedance.adsdk.lottie.Qhi.cJ.hm hmVar = this.qMt;
        return (hmVar == null || hmVar.cJ().isEmpty()) ? false : true;
    }

    private void cJ(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<pA, Path> qhi, com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> qhi2) {
        com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(canvas, this.pA, this.WAv);
        canvas.drawRect(this.pA, this.WAv);
        this.ROR.set(qhi.ROR());
        this.ROR.transform(matrix);
        this.WAv.setAlpha((int) (qhi2.ROR().intValue() * 2.55f));
        canvas.drawPath(this.ROR, this.f7788zc);
        canvas.restore();
    }

    public String fl() {
        return this.f7785ac.Tgh();
    }

    public void Qhi(boolean z10) {
        if (z10 && this.NFd == null) {
            this.NFd = new com.bytedance.adsdk.lottie.Qhi.Qhi();
        }
        this.aP = z10;
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.cJ.Qhi.InterfaceC0071Qhi
    public void Qhi() {
        hm();
    }

    public void Qhi(Qhi qhi) {
        this.bxS = qhi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cJ(boolean z10) {
        if (z10 != this.Eh) {
            this.Eh = z10;
            hm();
        }
    }

    public void Qhi(com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, ?> qhi) {
        if (qhi == null) {
            return;
        }
        this.pM.add(qhi);
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.Tgh
    public void Qhi(RectF rectF, Matrix matrix, boolean z10) {
        this.pA.set(0.0f, 0.0f, 0.0f, 0.0f);
        Gm();
        this.Qhi.set(matrix);
        if (z10) {
            List<Qhi> list = this.CQU;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.Qhi.preConcat(this.CQU.get(size).CJ.CJ());
                }
            } else {
                Qhi qhi = this.Dww;
                if (qhi != null) {
                    this.Qhi.preConcat(qhi.CJ.CJ());
                }
            }
        }
        this.Qhi.preConcat(this.CJ.CJ());
    }

    public BlurMaskFilter cJ(float f10) {
        if (this.f7786fl == f10) {
            return this.Tgh;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.Tgh = blurMaskFilter;
        this.f7786fl = f10;
        return blurMaskFilter;
    }

    @Override // com.bytedance.adsdk.lottie.Qhi.Qhi.Tgh
    public void Qhi(Canvas canvas, Matrix matrix, int i10) {
        Paint paint;
        Integer ROR;
        com.bytedance.adsdk.lottie.Tgh.Qhi(this.MQ);
        if (this.Eh && !this.f7785ac.EBS()) {
            Gm();
            com.bytedance.adsdk.lottie.Tgh.Qhi("Layer#parentMatrix");
            this.Sf.reset();
            this.Sf.set(matrix);
            int size = this.CQU.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                this.Sf.preConcat(this.CQU.get(size).CJ.CJ());
            }
            com.bytedance.adsdk.lottie.Tgh.cJ("Layer#parentMatrix");
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<?, Integer> Qhi = this.CJ.Qhi();
            int b10 = (int) r.b(i10 / 255.0f, (Qhi == null || (ROR = Qhi.ROR()) == null) ? 100 : ROR.intValue(), 100.0f, 255.0f);
            if (!ac() && !CJ()) {
                this.Sf.preConcat(this.CJ.CJ());
                com.bytedance.adsdk.lottie.Tgh.Qhi("Layer#drawLayer");
                cJ(canvas, this.Sf, b10);
                com.bytedance.adsdk.lottie.Tgh.cJ("Layer#drawLayer");
                ac(com.bytedance.adsdk.lottie.Tgh.cJ(this.MQ));
                return;
            }
            com.bytedance.adsdk.lottie.Tgh.Qhi("Layer#computeBounds");
            Qhi(this.pA, this.Sf, false);
            cJ(this.pA, matrix);
            this.Sf.preConcat(this.CJ.CJ());
            Qhi(this.pA, this.Sf);
            this.hpZ.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.f7787hm);
            if (!this.f7787hm.isIdentity()) {
                Matrix matrix2 = this.f7787hm;
                matrix2.invert(matrix2);
                this.f7787hm.mapRect(this.hpZ);
            }
            if (!this.pA.intersect(this.hpZ)) {
                this.pA.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            com.bytedance.adsdk.lottie.Tgh.cJ("Layer#computeBounds");
            if (this.pA.width() >= 1.0f && this.pA.height() >= 1.0f) {
                com.bytedance.adsdk.lottie.Tgh.Qhi("Layer#saveLayer");
                this.WAv.setAlpha(FunctionEval.FunctionID.EXTERNAL_FUNC);
                com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(canvas, this.pA, this.WAv);
                com.bytedance.adsdk.lottie.Tgh.cJ("Layer#saveLayer");
                Qhi(canvas);
                com.bytedance.adsdk.lottie.Tgh.Qhi("Layer#drawLayer");
                cJ(canvas, this.Sf, b10);
                com.bytedance.adsdk.lottie.Tgh.cJ("Layer#drawLayer");
                if (CJ()) {
                    Qhi(canvas, this.Sf);
                }
                if (ac()) {
                    com.bytedance.adsdk.lottie.Tgh.Qhi("Layer#drawMatte");
                    com.bytedance.adsdk.lottie.Tgh.Qhi("Layer#saveLayer");
                    com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(canvas, this.pA, this.ABk, 19);
                    com.bytedance.adsdk.lottie.Tgh.cJ("Layer#saveLayer");
                    Qhi(canvas);
                    this.bxS.Qhi(canvas, matrix, b10);
                    com.bytedance.adsdk.lottie.Tgh.Qhi("Layer#restoreLayer");
                    canvas.restore();
                    com.bytedance.adsdk.lottie.Tgh.cJ("Layer#restoreLayer");
                    com.bytedance.adsdk.lottie.Tgh.cJ("Layer#drawMatte");
                }
                com.bytedance.adsdk.lottie.Tgh.Qhi("Layer#restoreLayer");
                canvas.restore();
                com.bytedance.adsdk.lottie.Tgh.cJ("Layer#restoreLayer");
            }
            if (this.aP && (paint = this.NFd) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.NFd.setColor(-251901);
                this.NFd.setStrokeWidth(4.0f);
                canvas.drawRect(this.pA, this.NFd);
                this.NFd.setStyle(Paint.Style.FILL);
                this.NFd.setColor(1357638635);
                canvas.drawRect(this.pA, this.NFd);
            }
            ac(com.bytedance.adsdk.lottie.Tgh.cJ(this.MQ));
            return;
        }
        com.bytedance.adsdk.lottie.Tgh.cJ(this.MQ);
    }

    private void Qhi(Canvas canvas) {
        com.bytedance.adsdk.lottie.Tgh.Qhi("Layer#clearLayer");
        RectF rectF = this.pA;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.iMK);
        com.bytedance.adsdk.lottie.Tgh.cJ("Layer#clearLayer");
    }

    private void Qhi(RectF rectF, Matrix matrix) {
        this.HzH.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (CJ()) {
            int size = this.qMt.Qhi().size();
            for (int i10 = 0; i10 < size; i10++) {
                com.bytedance.adsdk.lottie.ac.cJ.hm hmVar = this.qMt.Qhi().get(i10);
                Path ROR = this.qMt.cJ().get(i10).ROR();
                if (ROR != null) {
                    this.ROR.set(ROR);
                    this.ROR.transform(matrix);
                    int i11 = AnonymousClass2.cJ[hmVar.Qhi().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && hmVar.CJ()) {
                        return;
                    }
                    this.ROR.computeBounds(this.tP, false);
                    if (i10 == 0) {
                        this.HzH.set(this.tP);
                    } else {
                        RectF rectF2 = this.HzH;
                        rectF2.set(Math.min(rectF2.left, this.tP.left), Math.min(this.HzH.top, this.tP.top), Math.max(this.HzH.right, this.tP.right), Math.max(this.HzH.bottom, this.tP.bottom));
                    }
                }
            }
            if (rectF.intersect(this.HzH)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void Qhi(Canvas canvas, Matrix matrix) {
        com.bytedance.adsdk.lottie.Tgh.Qhi("Layer#saveLayer");
        com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(canvas, this.pA, this.Gm, 19);
        if (Build.VERSION.SDK_INT < 28) {
            Qhi(canvas);
        }
        com.bytedance.adsdk.lottie.Tgh.cJ("Layer#saveLayer");
        for (int i10 = 0; i10 < this.qMt.Qhi().size(); i10++) {
            com.bytedance.adsdk.lottie.ac.cJ.hm hmVar = this.qMt.Qhi().get(i10);
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<pA, Path> qhi = this.qMt.cJ().get(i10);
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> qhi2 = this.qMt.ac().get(i10);
            int i11 = AnonymousClass2.cJ[hmVar.Qhi().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.WAv.setColor(-16777216);
                        this.WAv.setAlpha(FunctionEval.FunctionID.EXTERNAL_FUNC);
                        canvas.drawRect(this.pA, this.WAv);
                    }
                    if (hmVar.CJ()) {
                        ac(canvas, matrix, qhi, qhi2);
                    } else {
                        Qhi(canvas, matrix, qhi);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (hmVar.CJ()) {
                            cJ(canvas, matrix, qhi, qhi2);
                        } else {
                            Qhi(canvas, matrix, qhi, qhi2);
                        }
                    }
                } else if (hmVar.CJ()) {
                    fl(canvas, matrix, qhi, qhi2);
                } else {
                    CJ(canvas, matrix, qhi, qhi2);
                }
            } else if (WAv()) {
                this.WAv.setAlpha(FunctionEval.FunctionID.EXTERNAL_FUNC);
                canvas.drawRect(this.pA, this.WAv);
            }
        }
        com.bytedance.adsdk.lottie.Tgh.Qhi("Layer#restoreLayer");
        canvas.restore();
        com.bytedance.adsdk.lottie.Tgh.cJ("Layer#restoreLayer");
    }

    private void Qhi(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<pA, Path> qhi, com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> qhi2) {
        this.ROR.set(qhi.ROR());
        this.ROR.transform(matrix);
        this.WAv.setAlpha((int) (qhi2.ROR().intValue() * 2.55f));
        canvas.drawPath(this.ROR, this.WAv);
    }

    private void Qhi(Canvas canvas, Matrix matrix, com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<pA, Path> qhi) {
        this.ROR.set(qhi.ROR());
        this.ROR.transform(matrix);
        canvas.drawPath(this.ROR, this.f7788zc);
    }

    public void Qhi(@FloatRange(from = 0.0d, to = 1.0d) float f10) {
        this.CJ.Qhi(f10);
        if (this.qMt != null) {
            for (int i10 = 0; i10 < this.qMt.cJ().size(); i10++) {
                this.qMt.cJ().get(i10).Qhi(f10);
            }
        }
        com.bytedance.adsdk.lottie.Qhi.cJ.fl flVar = this.EBS;
        if (flVar != null) {
            flVar.Qhi(f10);
        }
        Qhi qhi = this.bxS;
        if (qhi != null) {
            qhi.Qhi(f10);
        }
        for (int i11 = 0; i11 < this.pM.size(); i11++) {
            this.pM.get(i11).Qhi(f10);
        }
    }
}
