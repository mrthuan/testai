package com.bytedance.sdk.component.fl.ac;

import android.content.Context;
import com.bytedance.sdk.component.fl.ABk;
import com.bytedance.sdk.component.fl.EBS;
import com.bytedance.sdk.component.fl.MQ;
import com.bytedance.sdk.component.fl.iMK;
import com.bytedance.sdk.component.fl.kYc;
import com.bytedance.sdk.component.fl.tP;
import java.util.concurrent.ExecutorService;

/* compiled from: LoadConfig.java */
/* loaded from: classes.dex */
public class Tgh implements iMK {
    private tP CJ;
    private ABk Qhi;
    private kYc ROR;
    private com.bytedance.sdk.component.fl.cJ Sf;
    private com.bytedance.sdk.component.fl.ac Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private com.bytedance.sdk.component.fl.fl f8396ac;
    private ExecutorService cJ;

    /* renamed from: fl  reason: collision with root package name */
    private MQ f8397fl;

    /* renamed from: hm  reason: collision with root package name */
    private EBS f8398hm;

    /* compiled from: LoadConfig.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        private tP CJ;
        private ABk Qhi;
        private kYc ROR;
        private com.bytedance.sdk.component.fl.cJ Sf;
        private com.bytedance.sdk.component.fl.ac Tgh;

        /* renamed from: ac  reason: collision with root package name */
        private com.bytedance.sdk.component.fl.fl f8399ac;
        private ExecutorService cJ;

        /* renamed from: fl  reason: collision with root package name */
        private MQ f8400fl;

        /* renamed from: hm  reason: collision with root package name */
        private EBS f8401hm;

        public Qhi Qhi(com.bytedance.sdk.component.fl.cJ cJVar) {
            this.Sf = cJVar;
            return this;
        }

        public Qhi Qhi(EBS ebs) {
            this.f8401hm = ebs;
            return this;
        }

        public Qhi Qhi(com.bytedance.sdk.component.fl.fl flVar) {
            this.f8399ac = flVar;
            return this;
        }

        public Tgh Qhi() {
            return new Tgh(this);
        }
    }

    @Override // com.bytedance.sdk.component.fl.iMK
    public com.bytedance.sdk.component.fl.fl CJ() {
        return this.f8396ac;
    }

    @Override // com.bytedance.sdk.component.fl.iMK
    public ABk Qhi() {
        return this.Qhi;
    }

    @Override // com.bytedance.sdk.component.fl.iMK
    public com.bytedance.sdk.component.fl.ac ROR() {
        return this.Tgh;
    }

    @Override // com.bytedance.sdk.component.fl.iMK
    public kYc Sf() {
        return this.ROR;
    }

    @Override // com.bytedance.sdk.component.fl.iMK
    public MQ Tgh() {
        return this.f8397fl;
    }

    @Override // com.bytedance.sdk.component.fl.iMK
    public EBS ac() {
        return this.f8398hm;
    }

    @Override // com.bytedance.sdk.component.fl.iMK
    public ExecutorService cJ() {
        return this.cJ;
    }

    @Override // com.bytedance.sdk.component.fl.iMK
    public tP fl() {
        return this.CJ;
    }

    @Override // com.bytedance.sdk.component.fl.iMK
    public com.bytedance.sdk.component.fl.cJ hm() {
        return this.Sf;
    }

    private Tgh(Qhi qhi) {
        this.Qhi = qhi.Qhi;
        this.cJ = qhi.cJ;
        this.f8396ac = qhi.f8399ac;
        this.CJ = qhi.CJ;
        this.f8397fl = qhi.f8400fl;
        this.Tgh = qhi.Tgh;
        this.Sf = qhi.Sf;
        this.ROR = qhi.ROR;
        this.f8398hm = qhi.f8401hm;
    }

    public static Tgh Qhi(Context context) {
        return new Qhi().Qhi();
    }
}
