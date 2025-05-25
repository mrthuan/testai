package com.bytedance.sdk.openadsdk.Gm.Qhi;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* compiled from: ArbitrageLogModel.java */
/* loaded from: classes.dex */
public class Qhi {
    float ABk;
    float CJ;
    float Gm;
    int HzH;
    String Qhi;
    float ROR;
    float Sf;
    int Tgh;
    int WAv;

    /* renamed from: ac  reason: collision with root package name */
    float f8476ac;
    int cJ;

    /* renamed from: fl  reason: collision with root package name */
    float f8477fl;

    /* renamed from: hm  reason: collision with root package name */
    float f8478hm;
    float hpZ;
    int iMK;
    String pA;

    /* renamed from: zc  reason: collision with root package name */
    float f8479zc;
    int kYc = -1;
    String tP = "";

    /* compiled from: ArbitrageLogModel.java */
    /* renamed from: com.bytedance.sdk.openadsdk.Gm.Qhi.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0102Qhi {
        Qhi Qhi = new Qhi();

        public C0102Qhi CJ(float f10) {
            this.Qhi.CJ(f10);
            return this;
        }

        public C0102Qhi Qhi(String str) {
            this.Qhi.cJ(str);
            return this;
        }

        public C0102Qhi ROR(float f10) {
            this.Qhi.ROR(f10);
            return this;
        }

        public C0102Qhi Sf(float f10) {
            this.Qhi.Sf(f10);
            return this;
        }

        public C0102Qhi Tgh(float f10) {
            this.Qhi.Tgh(f10);
            return this;
        }

        public C0102Qhi WAv(float f10) {
            this.Qhi.WAv(f10);
            return this;
        }

        public C0102Qhi ac(float f10) {
            this.Qhi.ac(f10);
            return this;
        }

        public C0102Qhi cJ(float f10) {
            this.Qhi.cJ(f10);
            return this;
        }

        public C0102Qhi fl(float f10) {
            this.Qhi.fl(f10);
            return this;
        }

        public C0102Qhi hm(float f10) {
            this.Qhi.hm(f10);
            return this;
        }

        public C0102Qhi Qhi(int i10) {
            this.Qhi.cJ(i10);
            return this;
        }

        public C0102Qhi ac(int i10) {
            this.Qhi.Tgh(i10);
            return this;
        }

        public C0102Qhi cJ(int i10) {
            this.Qhi.fl(i10);
            return this;
        }

        public C0102Qhi Qhi(float f10) {
            this.Qhi.Qhi(f10);
            return this;
        }

        public C0102Qhi cJ(String str) {
            this.Qhi.ac(str);
            return this;
        }

        public Qhi Qhi() {
            return this.Qhi;
        }
    }

    public float ABk() {
        return this.Gm;
    }

    public int CJ() {
        return this.cJ;
    }

    public float Gm() {
        return this.f8478hm;
    }

    public String HzH() {
        return this.pA;
    }

    public int Qhi() {
        return this.kYc;
    }

    public float ROR() {
        return this.f8477fl;
    }

    public int Sf() {
        return this.Tgh;
    }

    public float Tgh() {
        return this.CJ;
    }

    public float WAv() {
        return this.Sf;
    }

    public String ac() {
        return this.Qhi;
    }

    public String cJ() {
        return this.tP;
    }

    public float fl() {
        return this.f8476ac;
    }

    public float hm() {
        return this.ROR;
    }

    public int hpZ() {
        return this.iMK;
    }

    public float iMK() {
        return this.f8479zc;
    }

    public float kYc() {
        return this.hpZ;
    }

    public BigDecimal pA() {
        return new BigDecimal(this.ABk).setScale(3, RoundingMode.HALF_UP);
    }

    public int tP() {
        return this.HzH;
    }

    public int zc() {
        return this.WAv;
    }

    public void CJ(float f10) {
        this.ROR = f10;
    }

    public void Qhi(int i10) {
        this.kYc = i10;
    }

    public void ROR(float f10) {
        this.Gm = f10;
    }

    public void Sf(float f10) {
        this.f8479zc = f10;
    }

    public void Tgh(float f10) {
        this.f8478hm = f10;
    }

    public void WAv(float f10) {
        this.hpZ = f10;
    }

    public void ac(float f10) {
        this.f8477fl = f10;
    }

    public void cJ(String str) {
        this.Qhi = str;
    }

    public void fl(float f10) {
        this.Sf = f10;
    }

    public void hm(float f10) {
        this.ABk = f10;
    }

    public void CJ(int i10) {
        this.WAv = i10;
    }

    public void Qhi(String str) {
        this.tP = str;
    }

    public void Tgh(int i10) {
        this.HzH = i10;
    }

    public void ac(int i10) {
        this.Tgh = i10;
    }

    public void cJ(int i10) {
        this.cJ = i10;
    }

    public void fl(int i10) {
        this.iMK = i10;
    }

    public void Qhi(float f10) {
        this.f8476ac = f10;
    }

    public void ac(String str) {
        this.pA = str;
    }

    public void cJ(float f10) {
        this.CJ = f10;
    }
}
