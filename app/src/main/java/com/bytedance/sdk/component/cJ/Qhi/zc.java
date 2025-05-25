package com.bytedance.sdk.component.cJ.Qhi;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: OkHttpClient.java */
/* loaded from: classes.dex */
public abstract class zc implements Cloneable {
    public long CJ;
    public List<hm> Qhi;
    public TimeUnit ROR;
    public long Tgh;

    /* renamed from: ac  reason: collision with root package name */
    public TimeUnit f8363ac;
    public long cJ;

    /* renamed from: fl  reason: collision with root package name */
    public TimeUnit f8364fl;

    public zc(Qhi qhi) {
        this.cJ = qhi.cJ;
        this.CJ = qhi.CJ;
        this.Tgh = qhi.Tgh;
        List<hm> list = qhi.Qhi;
        this.f8363ac = qhi.f8365ac;
        this.f8364fl = qhi.f8366fl;
        this.ROR = qhi.ROR;
        this.Qhi = list;
    }

    public abstract cJ Qhi(iMK imk);

    public abstract fl Qhi();

    public Qhi cJ() {
        return new Qhi(this);
    }

    /* compiled from: OkHttpClient.java */
    /* loaded from: classes.dex */
    public static final class Qhi {
        public long CJ;
        public final List<hm> Qhi;
        public TimeUnit ROR;
        public long Tgh;

        /* renamed from: ac  reason: collision with root package name */
        public TimeUnit f8365ac;
        public long cJ;

        /* renamed from: fl  reason: collision with root package name */
        public TimeUnit f8366fl;

        public Qhi() {
            this.Qhi = new ArrayList();
            this.cJ = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f8365ac = timeUnit;
            this.CJ = 10000L;
            this.f8366fl = timeUnit;
            this.Tgh = 10000L;
            this.ROR = timeUnit;
        }

        public Qhi Qhi(long j10, TimeUnit timeUnit) {
            this.cJ = j10;
            this.f8365ac = timeUnit;
            return this;
        }

        public Qhi ac(long j10, TimeUnit timeUnit) {
            this.Tgh = j10;
            this.ROR = timeUnit;
            return this;
        }

        public Qhi cJ(long j10, TimeUnit timeUnit) {
            this.CJ = j10;
            this.f8366fl = timeUnit;
            return this;
        }

        public Qhi Qhi(hm hmVar) {
            this.Qhi.add(hmVar);
            return this;
        }

        public zc Qhi() {
            return com.bytedance.sdk.component.cJ.Qhi.Qhi.Qhi.Qhi(this);
        }

        public Qhi(String str) {
            this.Qhi = new ArrayList();
            this.cJ = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f8365ac = timeUnit;
            this.CJ = 10000L;
            this.f8366fl = timeUnit;
            this.Tgh = 10000L;
            this.ROR = timeUnit;
        }

        public Qhi(zc zcVar) {
            this.Qhi = new ArrayList();
            this.cJ = 10000L;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f8365ac = timeUnit;
            this.CJ = 10000L;
            this.f8366fl = timeUnit;
            this.Tgh = 10000L;
            this.ROR = timeUnit;
            this.cJ = zcVar.cJ;
            this.f8365ac = zcVar.f8363ac;
            this.CJ = zcVar.CJ;
            this.f8366fl = zcVar.f8364fl;
            this.Tgh = zcVar.Tgh;
            this.ROR = zcVar.ROR;
        }
    }
}
