package com.bytedance.adsdk.lottie.ac.cJ;

import com.bytedance.adsdk.lottie.Qhi.Qhi.EBS;

/* compiled from: ShapeTrimPath.java */
/* loaded from: classes.dex */
public class MQ implements ac {
    private final com.bytedance.adsdk.lottie.ac.Qhi.cJ CJ;
    private final String Qhi;
    private final boolean Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.ac.Qhi.cJ f7816ac;
    private final Qhi cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.ac.Qhi.cJ f7817fl;

    /* compiled from: ShapeTrimPath.java */
    /* loaded from: classes.dex */
    public enum Qhi {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static Qhi Qhi(int i10) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i10)));
            }
            return SIMULTANEOUSLY;
        }
    }

    public MQ(String str, Qhi qhi, com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar, com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar2, com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar3, boolean z10) {
        this.Qhi = str;
        this.cJ = qhi;
        this.f7816ac = cJVar;
        this.CJ = cJVar2;
        this.f7817fl = cJVar3;
        this.Tgh = z10;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.cJ CJ() {
        return this.f7816ac;
    }

    public String Qhi() {
        return this.Qhi;
    }

    public boolean Tgh() {
        return this.Tgh;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.cJ ac() {
        return this.CJ;
    }

    public Qhi cJ() {
        return this.cJ;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.cJ fl() {
        return this.f7817fl;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f7816ac + ", end: " + this.CJ + ", offset: " + this.f7817fl + "}";
    }

    @Override // com.bytedance.adsdk.lottie.ac.cJ.ac
    public com.bytedance.adsdk.lottie.Qhi.Qhi.ac Qhi(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ROR ror, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi) {
        return new EBS(qhi, this);
    }
}
