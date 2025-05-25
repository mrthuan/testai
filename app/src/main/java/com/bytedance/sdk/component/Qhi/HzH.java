package com.bytedance.sdk.component.Qhi;

import android.text.TextUtils;
import androidx.activity.r;

/* compiled from: Js2JavaCall.java */
/* loaded from: classes.dex */
public class HzH {
    public final String CJ;
    public final int Qhi;
    public final String ROR;
    public final String Sf;
    public final String Tgh;

    /* renamed from: ac  reason: collision with root package name */
    public final String f7980ac;
    public final String cJ;

    /* renamed from: fl  reason: collision with root package name */
    public final String f7981fl;

    /* compiled from: Js2JavaCall.java */
    /* loaded from: classes.dex */
    public static final class Qhi {
        private String CJ;
        private String Qhi;
        private String ROR;
        private String Tgh;

        /* renamed from: ac  reason: collision with root package name */
        private String f7982ac;
        private String cJ;

        /* renamed from: fl  reason: collision with root package name */
        private String f7983fl;

        private Qhi() {
        }

        public Qhi CJ(String str) {
            this.CJ = str;
            return this;
        }

        public Qhi Qhi(String str) {
            this.Qhi = str;
            return this;
        }

        public Qhi ROR(String str) {
            this.ROR = str;
            return this;
        }

        public Qhi Tgh(String str) {
            this.Tgh = str;
            return this;
        }

        public Qhi ac(String str) {
            this.f7982ac = str;
            return this;
        }

        public Qhi cJ(String str) {
            this.cJ = str;
            return this;
        }

        public Qhi fl(String str) {
            this.f7983fl = str;
            return this;
        }

        public HzH Qhi() {
            return new HzH(this);
        }
    }

    public static Qhi Qhi() {
        return new Qhi();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("methodName: ");
        sb2.append(this.CJ);
        sb2.append(", params: ");
        sb2.append(this.f7981fl);
        sb2.append(", callbackId: ");
        sb2.append(this.Tgh);
        sb2.append(", type: ");
        sb2.append(this.f7980ac);
        sb2.append(", version: ");
        return r.g(sb2, this.cJ, ", ");
    }

    private HzH(String str, int i10) {
        this.cJ = null;
        this.f7980ac = null;
        this.CJ = null;
        this.f7981fl = null;
        this.Tgh = str;
        this.ROR = null;
        this.Qhi = i10;
        this.Sf = null;
    }

    public static HzH Qhi(String str, int i10) {
        return new HzH(str, i10);
    }

    public static boolean Qhi(HzH hzH) {
        return hzH == null || hzH.Qhi != 1 || TextUtils.isEmpty(hzH.CJ) || TextUtils.isEmpty(hzH.f7981fl);
    }

    private HzH(Qhi qhi) {
        this.cJ = qhi.Qhi;
        this.f7980ac = qhi.cJ;
        this.CJ = qhi.f7982ac;
        this.f7981fl = qhi.CJ;
        this.Tgh = qhi.f7983fl;
        this.ROR = qhi.Tgh;
        this.Qhi = 1;
        this.Sf = qhi.ROR;
    }
}
