package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.core.cJ.ac;
import org.json.JSONObject;

/* compiled from: DynamicClickInfo.java */
/* loaded from: classes.dex */
public class pA implements com.bytedance.sdk.component.adexpress.ac {
    public JSONObject ABk;
    public final float CJ;
    public final String Gm;
    public JSONObject HzH;
    public final float Qhi;
    public final int ROR;
    public final int Sf;
    public final long Tgh;
    public final int WAv;

    /* renamed from: ac  reason: collision with root package name */
    public final float f9102ac;
    public final float cJ;

    /* renamed from: fl  reason: collision with root package name */
    public final long f9103fl;

    /* renamed from: hm  reason: collision with root package name */
    public final int f9104hm;
    public int hpZ;
    public SparseArray<ac.Qhi> iMK;
    public boolean kYc;
    public final boolean pA;

    /* renamed from: zc  reason: collision with root package name */
    public int f9105zc;

    /* compiled from: DynamicClickInfo.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private int ABk;
        private float CJ;
        private int Gm;
        private boolean HzH = false;
        protected SparseArray<ac.Qhi> Qhi = new SparseArray<>();
        private float ROR;
        private int Sf;
        private float Tgh;
        private int WAv;

        /* renamed from: ac  reason: collision with root package name */
        private long f9106ac;
        private long cJ;

        /* renamed from: fl  reason: collision with root package name */
        private float f9107fl;

        /* renamed from: hm  reason: collision with root package name */
        private int f9108hm;
        private JSONObject hpZ;
        private JSONObject iMK;
        private boolean kYc;
        private int pA;

        /* renamed from: zc  reason: collision with root package name */
        private String f9109zc;

        public Qhi CJ(float f10) {
            this.ROR = f10;
            return this;
        }

        public Qhi Qhi(int i10) {
            this.pA = i10;
            return this;
        }

        public Qhi Tgh(int i10) {
            this.Gm = i10;
            return this;
        }

        public Qhi ac(float f10) {
            this.Tgh = f10;
            return this;
        }

        public Qhi cJ(int i10) {
            this.ABk = i10;
            return this;
        }

        public Qhi fl(int i10) {
            this.WAv = i10;
            return this;
        }

        public Qhi CJ(int i10) {
            this.f9108hm = i10;
            return this;
        }

        public Qhi Qhi(JSONObject jSONObject) {
            this.iMK = jSONObject;
            return this;
        }

        public Qhi ac(int i10) {
            this.Sf = i10;
            return this;
        }

        public Qhi cJ(long j10) {
            this.f9106ac = j10;
            return this;
        }

        public Qhi Qhi(boolean z10) {
            this.kYc = z10;
            return this;
        }

        public Qhi cJ(float f10) {
            this.f9107fl = f10;
            return this;
        }

        public Qhi Qhi(long j10) {
            this.cJ = j10;
            return this;
        }

        public Qhi cJ(JSONObject jSONObject) {
            this.hpZ = jSONObject;
            return this;
        }

        public Qhi Qhi(float f10) {
            this.CJ = f10;
            return this;
        }

        public Qhi cJ(boolean z10) {
            this.HzH = z10;
            return this;
        }

        public Qhi Qhi(String str) {
            this.f9109zc = str;
            return this;
        }

        public Qhi Qhi(SparseArray<ac.Qhi> sparseArray) {
            this.Qhi = sparseArray;
            return this;
        }

        public pA Qhi() {
            return new pA(this);
        }
    }

    private pA(Qhi qhi) {
        this.kYc = false;
        this.Qhi = qhi.ROR;
        this.cJ = qhi.Tgh;
        this.f9102ac = qhi.f9107fl;
        this.CJ = qhi.CJ;
        this.f9103fl = qhi.f9106ac;
        this.Tgh = qhi.cJ;
        this.ROR = qhi.Sf;
        this.Sf = qhi.f9108hm;
        this.f9104hm = qhi.WAv;
        this.WAv = qhi.Gm;
        this.Gm = qhi.f9109zc;
        this.iMK = qhi.Qhi;
        this.pA = qhi.kYc;
        this.f9105zc = qhi.ABk;
        this.ABk = qhi.iMK;
        this.hpZ = qhi.pA;
        this.HzH = qhi.hpZ;
        this.kYc = qhi.HzH;
    }
}
