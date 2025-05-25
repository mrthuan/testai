package com.bytedance.adsdk.lottie.ac.cJ;

import android.graphics.PointF;

/* compiled from: PolystarShape.java */
/* loaded from: classes.dex */
public class Gm implements ac {
    private final com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> CJ;
    private final boolean Gm;
    private final String Qhi;
    private final com.bytedance.adsdk.lottie.ac.Qhi.cJ ROR;
    private final com.bytedance.adsdk.lottie.ac.Qhi.cJ Sf;
    private final com.bytedance.adsdk.lottie.ac.Qhi.cJ Tgh;
    private final boolean WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.ac.Qhi.cJ f7811ac;
    private final Qhi cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.ac.Qhi.cJ f7812fl;

    /* renamed from: hm  reason: collision with root package name */
    private final com.bytedance.adsdk.lottie.ac.Qhi.cJ f7813hm;

    /* compiled from: PolystarShape.java */
    /* loaded from: classes.dex */
    public enum Qhi {
        STAR(1),
        POLYGON(2);
        

        /* renamed from: ac  reason: collision with root package name */
        private final int f7814ac;

        Qhi(int i10) {
            this.f7814ac = i10;
        }

        public static Qhi Qhi(int i10) {
            Qhi[] values;
            for (Qhi qhi : values()) {
                if (qhi.f7814ac == i10) {
                    return qhi;
                }
            }
            return null;
        }
    }

    public Gm(String str, Qhi qhi, com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar, com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> imk, com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar2, com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar3, com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar4, com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar5, com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar6, boolean z10, boolean z11) {
        this.Qhi = str;
        this.cJ = qhi;
        this.f7811ac = cJVar;
        this.CJ = imk;
        this.f7812fl = cJVar2;
        this.Tgh = cJVar3;
        this.ROR = cJVar4;
        this.Sf = cJVar5;
        this.f7813hm = cJVar6;
        this.WAv = z10;
        this.Gm = z11;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.iMK<PointF, PointF> CJ() {
        return this.CJ;
    }

    public boolean Gm() {
        return this.Gm;
    }

    public String Qhi() {
        return this.Qhi;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.cJ ROR() {
        return this.ROR;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.cJ Sf() {
        return this.Sf;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.cJ Tgh() {
        return this.Tgh;
    }

    public boolean WAv() {
        return this.WAv;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.cJ ac() {
        return this.f7811ac;
    }

    public Qhi cJ() {
        return this.cJ;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.cJ fl() {
        return this.f7812fl;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.cJ hm() {
        return this.f7813hm;
    }

    @Override // com.bytedance.adsdk.lottie.ac.cJ.ac
    public com.bytedance.adsdk.lottie.Qhi.Qhi.ac Qhi(com.bytedance.adsdk.lottie.hm hmVar, com.bytedance.adsdk.lottie.ROR ror, com.bytedance.adsdk.lottie.ac.ac.Qhi qhi) {
        return new com.bytedance.adsdk.lottie.Qhi.Qhi.pA(hmVar, qhi, this);
    }
}
