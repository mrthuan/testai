package com.bytedance.adsdk.lottie.ac.ac;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.lottie.Qhi.cJ.hpZ;
import com.bytedance.adsdk.lottie.ac.Qhi.zc;
import com.bytedance.adsdk.lottie.ac.cJ;
import com.bytedance.adsdk.lottie.ac.cJ.HzH;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lib.zj.office.fc.hssf.formula.eval.FunctionEval;

/* compiled from: TextLayer.java */
/* loaded from: classes.dex */
public class hm extends com.bytedance.adsdk.lottie.ac.ac.Qhi {
    private final LongSparseArray<String> ABk;
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> CQU;
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Dww;
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> EBS;
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Typeface, Typeface> Eh;
    private final Paint Gm;
    private final com.bytedance.adsdk.lottie.ROR HzH;
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> MQ;
    private final StringBuilder ROR;
    private final RectF Sf;
    private final Paint WAv;
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> bxS;

    /* renamed from: hm  reason: collision with root package name */
    private final Matrix f7803hm;
    private final com.bytedance.adsdk.lottie.hm hpZ;
    private final List<Qhi> iMK;
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> kYc;
    private final hpZ pA;
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> pM;
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> qMt;
    private com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> tP;

    /* renamed from: zc  reason: collision with root package name */
    private final Map<com.bytedance.adsdk.lottie.ac.fl, List<com.bytedance.adsdk.lottie.Qhi.Qhi.fl>> f7804zc;

    /* compiled from: TextLayer.java */
    /* renamed from: com.bytedance.adsdk.lottie.ac.ac.hm$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] Qhi;

        static {
            int[] iArr = new int[cJ.Qhi.values().length];
            Qhi = iArr;
            try {
                iArr[cJ.Qhi.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Qhi[cJ.Qhi.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Qhi[cJ.Qhi.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: TextLayer.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private String Qhi;
        private float cJ;

        private Qhi() {
            this.Qhi = "";
            this.cJ = 0.0f;
        }

        public void Qhi(String str, float f10) {
            this.Qhi = str;
            this.cJ = f10;
        }
    }

    public hm(com.bytedance.adsdk.lottie.hm hmVar, fl flVar) {
        super(hmVar, flVar);
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar;
        com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar2;
        com.bytedance.adsdk.lottie.ac.Qhi.Qhi qhi;
        com.bytedance.adsdk.lottie.ac.Qhi.Qhi qhi2;
        this.ROR = new StringBuilder(2);
        this.Sf = new RectF();
        this.f7803hm = new Matrix();
        this.WAv = new Paint(1) { // from class: com.bytedance.adsdk.lottie.ac.ac.hm.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.Gm = new Paint(1) { // from class: com.bytedance.adsdk.lottie.ac.ac.hm.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.f7804zc = new HashMap();
        this.ABk = new LongSparseArray<>();
        this.iMK = new ArrayList();
        this.hpZ = hmVar;
        this.HzH = flVar.Qhi();
        hpZ Qhi2 = flVar.tP().Qhi();
        this.pA = Qhi2;
        Qhi2.Qhi(this);
        Qhi(Qhi2);
        zc MQ = flVar.MQ();
        if (MQ != null && (qhi2 = MQ.Qhi) != null) {
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> Qhi3 = qhi2.Qhi();
            this.kYc = Qhi3;
            Qhi3.Qhi(this);
            Qhi(this.kYc);
        }
        if (MQ != null && (qhi = MQ.cJ) != null) {
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> Qhi4 = qhi.Qhi();
            this.MQ = Qhi4;
            Qhi4.Qhi(this);
            Qhi(this.MQ);
        }
        if (MQ != null && (cJVar2 = MQ.f7781ac) != null) {
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Qhi5 = cJVar2.Qhi();
            this.EBS = Qhi5;
            Qhi5.Qhi(this);
            Qhi(this.EBS);
        }
        if (MQ != null && (cJVar = MQ.CJ) != null) {
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> Qhi6 = cJVar.Qhi();
            this.Dww = Qhi6;
            Qhi6.Qhi(this);
            Qhi(this.Dww);
        }
    }

    @Override // com.bytedance.adsdk.lottie.ac.ac.Qhi, com.bytedance.adsdk.lottie.Qhi.Qhi.Tgh
    public void Qhi(RectF rectF, Matrix matrix, boolean z10) {
        super.Qhi(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.HzH.CJ().width(), this.HzH.CJ().height());
    }

    @Override // com.bytedance.adsdk.lottie.ac.ac.Qhi
    public void cJ(Canvas canvas, Matrix matrix, int i10) {
        com.bytedance.adsdk.lottie.ac.cJ ROR = this.pA.ROR();
        com.bytedance.adsdk.lottie.ac.ac acVar = this.HzH.Gm().get(ROR.cJ);
        if (acVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        Qhi(ROR, matrix);
        if (this.hpZ.qMt()) {
            Qhi(ROR, matrix, acVar, canvas);
        } else {
            Qhi(ROR, acVar, canvas);
        }
        canvas.restore();
    }

    private void Qhi(com.bytedance.adsdk.lottie.ac.cJ cJVar, Matrix matrix) {
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> qhi = this.tP;
        if (qhi != null) {
            this.WAv.setColor(qhi.ROR().intValue());
        } else {
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> qhi2 = this.kYc;
            if (qhi2 != null) {
                this.WAv.setColor(qhi2.ROR().intValue());
            } else {
                this.WAv.setColor(cJVar.Sf);
            }
        }
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> qhi3 = this.qMt;
        if (qhi3 != null) {
            this.Gm.setColor(qhi3.ROR().intValue());
        } else {
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Integer, Integer> qhi4 = this.MQ;
            if (qhi4 != null) {
                this.Gm.setColor(qhi4.ROR().intValue());
            } else {
                this.Gm.setColor(cJVar.f7807hm);
            }
        }
        int intValue = ((this.CJ.Qhi() == null ? 100 : this.CJ.Qhi().ROR().intValue()) * FunctionEval.FunctionID.EXTERNAL_FUNC) / 100;
        this.WAv.setAlpha(intValue);
        this.Gm.setAlpha(intValue);
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> qhi5 = this.bxS;
        if (qhi5 != null) {
            this.Gm.setStrokeWidth(qhi5.ROR().floatValue());
            return;
        }
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Float, Float> qhi6 = this.EBS;
        if (qhi6 != null) {
            this.Gm.setStrokeWidth(qhi6.ROR().floatValue());
        } else {
            this.Gm.setStrokeWidth(com.bytedance.adsdk.lottie.Tgh.ROR.Qhi() * cJVar.WAv);
        }
    }

    private boolean cJ(int i10) {
        return Character.getType(i10) == 16 || Character.getType(i10) == 27 || Character.getType(i10) == 6 || Character.getType(i10) == 28 || Character.getType(i10) == 8 || Character.getType(i10) == 19;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Qhi(com.bytedance.adsdk.lottie.ac.cJ r21, android.graphics.Matrix r22, com.bytedance.adsdk.lottie.ac.ac r23, android.graphics.Canvas r24) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<java.lang.Float, java.lang.Float> r0 = r8.pM
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.ROR()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L15
        L13:
            float r0 = r9.f7805ac
        L15:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r10 = r0 / r1
            float r11 = com.bytedance.adsdk.lottie.Tgh.ROR.Qhi(r22)
            java.lang.String r0 = r9.Qhi
            java.util.List r12 = r8.Qhi(r0)
            int r13 = r12.size()
            int r0 = r9.f7806fl
            float r0 = (float) r0
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r1
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<java.lang.Float, java.lang.Float> r1 = r8.CQU
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r1.ROR()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
        L3b:
            float r0 = r0 + r1
            goto L4c
        L3d:
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<java.lang.Float, java.lang.Float> r1 = r8.Dww
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r1.ROR()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L3b
        L4c:
            r14 = r0
            r15 = 0
            r0 = -1
            r7 = r0
            r6 = r15
        L51:
            if (r6 >= r13) goto Lb1
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r9.ABk
            if (r0 != 0) goto L60
            r0 = 0
            goto L62
        L60:
            float r0 = r0.x
        L62:
            r2 = r0
            r16 = 1
            r0 = r20
            r3 = r23
            r4 = r10
            r5 = r14
            r17 = r6
            r6 = r16
            java.util.List r6 = r0.Qhi(r1, r2, r3, r4, r5, r6)
            r5 = r15
        L74:
            int r0 = r6.size()
            if (r5 >= r0) goto Lae
            java.lang.Object r0 = r6.get(r5)
            com.bytedance.adsdk.lottie.ac.ac.hm$Qhi r0 = (com.bytedance.adsdk.lottie.ac.ac.hm.Qhi) r0
            int r7 = r7 + 1
            r24.save()
            float r1 = com.bytedance.adsdk.lottie.ac.ac.hm.Qhi.Qhi(r0)
            r4 = r24
            r8.Qhi(r4, r9, r7, r1)
            java.lang.String r1 = com.bytedance.adsdk.lottie.ac.ac.hm.Qhi.cJ(r0)
            r0 = r20
            r2 = r21
            r3 = r23
            r16 = r5
            r5 = r11
            r18 = r6
            r6 = r10
            r19 = r7
            r7 = r14
            r0.Qhi(r1, r2, r3, r4, r5, r6, r7)
            r24.restore()
            int r5 = r16 + 1
            r6 = r18
            r7 = r19
            goto L74
        Lae:
            int r6 = r17 + 1
            goto L51
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.ac.ac.hm.Qhi(com.bytedance.adsdk.lottie.ac.cJ, android.graphics.Matrix, com.bytedance.adsdk.lottie.ac.ac, android.graphics.Canvas):void");
    }

    private void Qhi(String str, com.bytedance.adsdk.lottie.ac.cJ cJVar, com.bytedance.adsdk.lottie.ac.ac acVar, Canvas canvas, float f10, float f11, float f12) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            com.bytedance.adsdk.lottie.ac.fl flVar = this.HzH.WAv().get(com.bytedance.adsdk.lottie.ac.fl.Qhi(str.charAt(i10), acVar.Qhi(), acVar.ac()));
            if (flVar != null) {
                Qhi(flVar, f11, cJVar, canvas);
                canvas.translate((com.bytedance.adsdk.lottie.Tgh.ROR.Qhi() * ((float) flVar.cJ()) * f11) + f12, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void Qhi(com.bytedance.adsdk.lottie.ac.cJ r19, com.bytedance.adsdk.lottie.ac.ac r20, android.graphics.Canvas r21) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            android.graphics.Typeface r0 = r7.Qhi(r9)
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r1 = r8.Qhi
            com.bytedance.adsdk.lottie.hm r2 = r7.hpZ
            com.bytedance.adsdk.lottie.MQ r2 = r2.MQ()
            if (r2 == 0) goto L21
            java.lang.String r3 = r18.fl()
            java.lang.String r1 = r2.cJ(r3, r1)
        L21:
            android.graphics.Paint r2 = r7.WAv
            r2.setTypeface(r0)
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<java.lang.Float, java.lang.Float> r0 = r7.pM
            if (r0 == 0) goto L35
            java.lang.Object r0 = r0.ROR()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L37
        L35:
            float r0 = r8.f7805ac
        L37:
            android.graphics.Paint r2 = r7.WAv
            float r3 = com.bytedance.adsdk.lottie.Tgh.ROR.Qhi()
            float r3 = r3 * r0
            r2.setTextSize(r3)
            android.graphics.Paint r2 = r7.Gm
            android.graphics.Paint r3 = r7.WAv
            android.graphics.Typeface r3 = r3.getTypeface()
            r2.setTypeface(r3)
            android.graphics.Paint r2 = r7.Gm
            android.graphics.Paint r3 = r7.WAv
            float r3 = r3.getTextSize()
            r2.setTextSize(r3)
            int r2 = r8.f7806fl
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<java.lang.Float, java.lang.Float> r3 = r7.CQU
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r3.ROR()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L6b:
            float r2 = r2 + r3
            goto L7c
        L6d:
            com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<java.lang.Float, java.lang.Float> r3 = r7.Dww
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r3.ROR()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L6b
        L7c:
            float r3 = com.bytedance.adsdk.lottie.Tgh.ROR.Qhi()
            float r3 = r3 * r2
            float r3 = r3 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r11 = r3 / r0
            java.util.List r12 = r7.Qhi(r1)
            int r13 = r12.size()
            r14 = 0
            r0 = -1
            r15 = r0
            r6 = r14
        L92:
            if (r6 >= r13) goto Ldd
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r8.ABk
            if (r0 != 0) goto La1
            r0 = 0
            goto La3
        La1:
            float r0 = r0.x
        La3:
            r2 = r0
            r4 = 0
            r16 = 0
            r0 = r18
            r3 = r20
            r5 = r11
            r17 = r6
            r6 = r16
            java.util.List r0 = r0.Qhi(r1, r2, r3, r4, r5, r6)
            r1 = r14
        Lb5:
            int r2 = r0.size()
            if (r1 >= r2) goto Lda
            java.lang.Object r2 = r0.get(r1)
            com.bytedance.adsdk.lottie.ac.ac.hm$Qhi r2 = (com.bytedance.adsdk.lottie.ac.ac.hm.Qhi) r2
            int r15 = r15 + 1
            r21.save()
            float r3 = com.bytedance.adsdk.lottie.ac.ac.hm.Qhi.Qhi(r2)
            r7.Qhi(r10, r8, r15, r3)
            java.lang.String r2 = com.bytedance.adsdk.lottie.ac.ac.hm.Qhi.cJ(r2)
            r7.Qhi(r2, r8, r10, r11)
            r21.restore()
            int r1 = r1 + 1
            goto Lb5
        Lda:
            int r6 = r17 + 1
            goto L92
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.lottie.ac.ac.hm.Qhi(com.bytedance.adsdk.lottie.ac.cJ, com.bytedance.adsdk.lottie.ac.ac, android.graphics.Canvas):void");
    }

    private void Qhi(Canvas canvas, com.bytedance.adsdk.lottie.ac.cJ cJVar, int i10, float f10) {
        PointF pointF = cJVar.f7808zc;
        PointF pointF2 = cJVar.ABk;
        float Qhi2 = com.bytedance.adsdk.lottie.Tgh.ROR.Qhi();
        float f11 = (i10 * cJVar.Tgh * Qhi2) + (pointF == null ? 0.0f : (cJVar.Tgh * 0.6f * Qhi2) + pointF.y);
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = AnonymousClass3.Qhi[cJVar.CJ.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else if (i11 != 3) {
        } else {
            canvas.translate(((f13 / 2.0f) + f12) - (f10 / 2.0f), f11);
        }
    }

    private Typeface Qhi(com.bytedance.adsdk.lottie.ac.ac acVar) {
        Typeface ROR;
        com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<Typeface, Typeface> qhi = this.Eh;
        if (qhi == null || (ROR = qhi.ROR()) == null) {
            Typeface Qhi2 = this.hpZ.Qhi(acVar);
            return Qhi2 != null ? Qhi2 : acVar.CJ();
        }
        return ROR;
    }

    private List<String> Qhi(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void Qhi(String str, com.bytedance.adsdk.lottie.ac.cJ cJVar, Canvas canvas, float f10) {
        int i10 = 0;
        while (i10 < str.length()) {
            String Qhi2 = Qhi(str, i10);
            i10 += Qhi2.length();
            Qhi(Qhi2, cJVar, canvas);
            canvas.translate(this.WAv.measureText(Qhi2) + f10, 0.0f);
        }
    }

    private List<Qhi> Qhi(String str, float f10, com.bytedance.adsdk.lottie.ac.ac acVar, float f11, float f12, boolean z10) {
        float measureText;
        String substring;
        String trim;
        String substring2;
        String trim2;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char charAt = str.charAt(i13);
            if (z10) {
                com.bytedance.adsdk.lottie.ac.fl flVar = this.HzH.WAv().get(com.bytedance.adsdk.lottie.ac.fl.Qhi(charAt, acVar.Qhi(), acVar.ac()));
                if (flVar != null) {
                    measureText = (com.bytedance.adsdk.lottie.Tgh.ROR.Qhi() * ((float) flVar.cJ()) * f11) + f12;
                }
            } else {
                measureText = this.WAv.measureText(str.substring(i13, i13 + 1)) + f12;
            }
            if (charAt == ' ') {
                z11 = true;
                f15 = measureText;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = measureText;
            } else {
                f14 += measureText;
            }
            f13 += measureText;
            if (f10 > 0.0f && f13 >= f10 && charAt != ' ') {
                i10++;
                Qhi Qhi2 = Qhi(i10);
                if (i12 == i11) {
                    Qhi2.Qhi(str.substring(i11, i13).trim(), (f13 - measureText) - ((trim2.length() - substring2.length()) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = measureText;
                    f14 = f13;
                } else {
                    Qhi2.Qhi(str.substring(i11, i12 - 1).trim(), ((f13 - f14) - ((substring.length() - trim.length()) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            Qhi(i10).Qhi(str.substring(i11), f13);
        }
        return this.iMK.subList(0, i10);
    }

    private Qhi Qhi(int i10) {
        for (int size = this.iMK.size(); size < i10; size++) {
            this.iMK.add(new Qhi());
        }
        return this.iMK.get(i10 - 1);
    }

    private void Qhi(com.bytedance.adsdk.lottie.ac.fl flVar, float f10, com.bytedance.adsdk.lottie.ac.cJ cJVar, Canvas canvas) {
        List<com.bytedance.adsdk.lottie.Qhi.Qhi.fl> Qhi2 = Qhi(flVar);
        for (int i10 = 0; i10 < Qhi2.size(); i10++) {
            Path CJ = Qhi2.get(i10).CJ();
            CJ.computeBounds(this.Sf, false);
            this.f7803hm.reset();
            this.f7803hm.preTranslate(0.0f, com.bytedance.adsdk.lottie.Tgh.ROR.Qhi() * (-cJVar.ROR));
            this.f7803hm.preScale(f10, f10);
            CJ.transform(this.f7803hm);
            if (cJVar.Gm) {
                Qhi(CJ, this.WAv, canvas);
                Qhi(CJ, this.Gm, canvas);
            } else {
                Qhi(CJ, this.Gm, canvas);
                Qhi(CJ, this.WAv, canvas);
            }
        }
    }

    private void Qhi(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void Qhi(String str, com.bytedance.adsdk.lottie.ac.cJ cJVar, Canvas canvas) {
        if (cJVar.Gm) {
            Qhi(str, this.WAv, canvas);
            Qhi(str, this.Gm, canvas);
            return;
        }
        Qhi(str, this.Gm, canvas);
        Qhi(str, this.WAv, canvas);
    }

    private void Qhi(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    private List<com.bytedance.adsdk.lottie.Qhi.Qhi.fl> Qhi(com.bytedance.adsdk.lottie.ac.fl flVar) {
        if (this.f7804zc.containsKey(flVar)) {
            return this.f7804zc.get(flVar);
        }
        List<HzH> Qhi2 = flVar.Qhi();
        int size = Qhi2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new com.bytedance.adsdk.lottie.Qhi.Qhi.fl(this.hpZ, this, Qhi2.get(i10), this.HzH));
        }
        this.f7804zc.put(flVar, arrayList);
        return arrayList;
    }

    private String Qhi(String str, int i10) {
        int codePointAt = str.codePointAt(i10);
        int charCount = Character.charCount(codePointAt) + i10;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!cJ(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j10 = codePointAt;
        if (this.ABk.indexOfKey(j10) >= 0) {
            return this.ABk.get(j10);
        }
        this.ROR.setLength(0);
        while (i10 < charCount) {
            int codePointAt3 = str.codePointAt(i10);
            this.ROR.appendCodePoint(codePointAt3);
            i10 += Character.charCount(codePointAt3);
        }
        String sb2 = this.ROR.toString();
        this.ABk.put(j10, sb2);
        return sb2;
    }
}
