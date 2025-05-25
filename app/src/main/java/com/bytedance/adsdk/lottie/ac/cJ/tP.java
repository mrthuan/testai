package com.bytedance.adsdk.lottie.ac.cJ;

import android.graphics.Paint;
import com.bytedance.adsdk.lottie.Qhi.Qhi.qMt;
import java.util.List;

/* compiled from: ShapeStroke.java */
/* loaded from: classes.dex */
public class tP implements ac {
    private final com.bytedance.adsdk.lottie.ac.Qhi.Qhi CJ;
    private final String Qhi;
    private final Qhi ROR;
    private final cJ Sf;
    private final com.bytedance.adsdk.lottie.ac.Qhi.cJ Tgh;
    private final boolean WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final List<com.bytedance.adsdk.lottie.ac.Qhi.cJ> f7840ac;
    private final com.bytedance.adsdk.lottie.ac.Qhi.cJ cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.ac.Qhi.fl f7841fl;

    /* renamed from: hm  reason: collision with root package name */
    private final float f7842hm;

    /* compiled from: ShapeStroke.java */
    /* renamed from: com.bytedance.adsdk.lottie.ac.cJ.tP$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Qhi;
        static final /* synthetic */ int[] cJ;

        static {
            int[] iArr = new int[cJ.values().length];
            cJ = iArr;
            try {
                iArr[cJ.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                cJ[cJ.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                cJ[cJ.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Qhi.values().length];
            Qhi = iArr2;
            try {
                iArr2[Qhi.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Qhi[Qhi.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Qhi[Qhi.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: ShapeStroke.java */
    /* loaded from: classes.dex */
    public enum Qhi {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap Qhi() {
            int i10 = AnonymousClass1.Qhi[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* compiled from: ShapeStroke.java */
    /* loaded from: classes.dex */
    public enum cJ {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join Qhi() {
            int i10 = AnonymousClass1.cJ[ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    public tP(String str, com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar, List<com.bytedance.adsdk.lottie.ac.Qhi.cJ> list, com.bytedance.adsdk.lottie.ac.Qhi.Qhi qhi, com.bytedance.adsdk.lottie.ac.Qhi.fl flVar, com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar2, Qhi qhi2, cJ cJVar3, float f10, boolean z10) {
        this.Qhi = str;
        this.cJ = cJVar;
        this.f7840ac = list;
        this.CJ = qhi;
        this.f7841fl = flVar;
        this.Tgh = cJVar2;
        this.ROR = qhi2;
        this.Sf = cJVar3;
        this.f7842hm = f10;
        this.WAv = z10;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.cJ CJ() {
        return this.Tgh;
    }

    @Override // com.bytedance.adsdk.lottie.ac.cJ.ac
    public com.bytedance.adsdk.lottie.Qhi.Qhi.ac Qhi(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ROR ror, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi) {
        return new qMt(hmVar, qhi, this);
    }

    public Qhi ROR() {
        return this.ROR;
    }

    public cJ Sf() {
        return this.Sf;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.cJ Tgh() {
        return this.cJ;
    }

    public boolean WAv() {
        return this.WAv;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.fl ac() {
        return this.f7841fl;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.Qhi cJ() {
        return this.CJ;
    }

    public List<com.bytedance.adsdk.lottie.ac.Qhi.cJ> fl() {
        return this.f7840ac;
    }

    public float hm() {
        return this.f7842hm;
    }

    public String Qhi() {
        return this.Qhi;
    }
}
