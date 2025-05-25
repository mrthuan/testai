package com.bytedance.adsdk.lottie.ac.ac;

import a0.a;
import com.bytedance.adsdk.lottie.ac.Qhi.ABk;
import com.bytedance.adsdk.lottie.ac.Qhi.zc;
import com.bytedance.adsdk.lottie.fl.Gm;
import java.util.List;
import java.util.Locale;

/* compiled from: Layer.java */
/* loaded from: classes.dex */
public class fl {
    private final float ABk;
    private final long CJ;
    private final Gm Dww;
    private final boolean EBS;
    private final int Gm;
    private final com.bytedance.adsdk.lottie.ac.Qhi.Gm HzH;
    private final List<com.bytedance.adsdk.lottie.ROR.Qhi<Float>> MQ;
    private final List<com.bytedance.adsdk.lottie.ac.cJ.ac> Qhi;
    private final String ROR;
    private final List<com.bytedance.adsdk.lottie.ac.cJ.hm> Sf;
    private final long Tgh;
    private final int WAv;

    /* renamed from: ac  reason: collision with root package name */
    private final String f7795ac;
    private final com.bytedance.adsdk.lottie.ac.cJ.Qhi bxS;
    private final com.bytedance.adsdk.lottie.ROR cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final Qhi f7796fl;

    /* renamed from: hm  reason: collision with root package name */
    private final ABk f7797hm;
    private final float hpZ;
    private final float iMK;
    private final zc kYc;
    private final float pA;
    private final cJ qMt;
    private final com.bytedance.adsdk.lottie.ac.Qhi.cJ tP;

    /* renamed from: zc  reason: collision with root package name */
    private final int f7798zc;

    /* compiled from: Layer.java */
    /* loaded from: classes.dex */
    public enum Qhi {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* compiled from: Layer.java */
    /* loaded from: classes.dex */
    public enum cJ {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public fl(List<com.bytedance.adsdk.lottie.ac.cJ.ac> list, com.bytedance.adsdk.lottie.ROR ror, String str, long j10, Qhi qhi, long j11, String str2, List<com.bytedance.adsdk.lottie.ac.cJ.hm> list2, ABk aBk, int i10, int i11, int i12, float f10, float f11, float f12, float f13, com.bytedance.adsdk.lottie.ac.Qhi.Gm gm2, zc zcVar, List<com.bytedance.adsdk.lottie.ROR.Qhi<Float>> list3, cJ cJVar, com.bytedance.adsdk.lottie.ac.Qhi.cJ cJVar2, boolean z10, com.bytedance.adsdk.lottie.ac.cJ.Qhi qhi2, Gm gm3) {
        this.Qhi = list;
        this.cJ = ror;
        this.f7795ac = str;
        this.CJ = j10;
        this.f7796fl = qhi;
        this.Tgh = j11;
        this.ROR = str2;
        this.Sf = list2;
        this.f7797hm = aBk;
        this.WAv = i10;
        this.Gm = i11;
        this.f7798zc = i12;
        this.ABk = f10;
        this.iMK = f11;
        this.pA = f12;
        this.hpZ = f13;
        this.HzH = gm2;
        this.kYc = zcVar;
        this.MQ = list3;
        this.qMt = cJVar;
        this.tP = cJVar2;
        this.EBS = z10;
        this.bxS = qhi2;
        this.Dww = gm3;
    }

    public long ABk() {
        return this.Tgh;
    }

    public List<com.bytedance.adsdk.lottie.ROR.Qhi<Float>> CJ() {
        return this.MQ;
    }

    public Gm Dww() {
        return this.Dww;
    }

    public boolean EBS() {
        return this.EBS;
    }

    public Qhi Gm() {
        return this.f7796fl;
    }

    public int HzH() {
        return this.Gm;
    }

    public zc MQ() {
        return this.kYc;
    }

    public String Qhi(String str) {
        StringBuilder k10 = a.k(str);
        k10.append(Tgh());
        k10.append("\n");
        fl Qhi2 = this.cJ.Qhi(ABk());
        if (Qhi2 != null) {
            k10.append("\t\tParents: ");
            k10.append(Qhi2.Tgh());
            fl Qhi3 = this.cJ.Qhi(Qhi2.ABk());
            while (Qhi3 != null) {
                k10.append("->");
                k10.append(Qhi3.Tgh());
                Qhi3 = this.cJ.Qhi(Qhi3.ABk());
            }
            k10.append(str);
            k10.append("\n");
        }
        if (!WAv().isEmpty()) {
            k10.append(str);
            k10.append("\tMasks: ");
            k10.append(WAv().size());
            k10.append("\n");
        }
        if (kYc() != 0 && HzH() != 0) {
            k10.append(str);
            k10.append("\tBackground: ");
            k10.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(kYc()), Integer.valueOf(HzH()), Integer.valueOf(hpZ())));
        }
        if (!this.Qhi.isEmpty()) {
            k10.append(str);
            k10.append("\tShapes:\n");
            for (com.bytedance.adsdk.lottie.ac.cJ.ac acVar : this.Qhi) {
                k10.append(str);
                k10.append("\t\t");
                k10.append(acVar);
                k10.append("\n");
            }
        }
        return k10.toString();
    }

    public String ROR() {
        return this.ROR;
    }

    public float Sf() {
        return this.pA;
    }

    public String Tgh() {
        return this.f7795ac;
    }

    public List<com.bytedance.adsdk.lottie.ac.cJ.hm> WAv() {
        return this.Sf;
    }

    public float ac() {
        return this.iMK / this.cJ.ABk();
    }

    public com.bytedance.adsdk.lottie.ac.cJ.Qhi bxS() {
        return this.bxS;
    }

    public float cJ() {
        return this.ABk;
    }

    public long fl() {
        return this.CJ;
    }

    public float hm() {
        return this.hpZ;
    }

    public int hpZ() {
        return this.f7798zc;
    }

    public List<com.bytedance.adsdk.lottie.ac.cJ.ac> iMK() {
        return this.Qhi;
    }

    public int kYc() {
        return this.WAv;
    }

    public ABk pA() {
        return this.f7797hm;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.cJ qMt() {
        return this.tP;
    }

    public com.bytedance.adsdk.lottie.ac.Qhi.Gm tP() {
        return this.HzH;
    }

    public String toString() {
        return Qhi("");
    }

    public cJ zc() {
        return this.qMt;
    }

    public com.bytedance.adsdk.lottie.ROR Qhi() {
        return this.cJ;
    }
}
