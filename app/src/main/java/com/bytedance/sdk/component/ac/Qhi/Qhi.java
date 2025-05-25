package com.bytedance.sdk.component.ac.Qhi;

import android.os.SystemClock;

/* compiled from: RequestHttpTime.java */
/* loaded from: classes.dex */
public class Qhi {
    long CJ;
    long Qhi = SystemClock.elapsedRealtime();
    long ROR;
    long Sf;
    long Tgh;

    /* renamed from: ac  reason: collision with root package name */
    long f8116ac;
    long cJ;

    /* renamed from: fl  reason: collision with root package name */
    long f8117fl;

    public void ABk() {
        this.Sf = SystemClock.elapsedRealtime();
    }

    public long CJ() {
        return this.Qhi;
    }

    public void Gm() {
        this.ROR = SystemClock.elapsedRealtime();
    }

    public void Qhi() {
        this.f8116ac = SystemClock.elapsedRealtime();
    }

    public long ROR() {
        return this.f8116ac;
    }

    public long Sf() {
        return this.CJ;
    }

    public long Tgh() {
        return this.Tgh;
    }

    public long WAv() {
        return this.ROR;
    }

    public void ac() {
        this.f8117fl = SystemClock.elapsedRealtime();
    }

    public void cJ() {
        this.CJ = SystemClock.elapsedRealtime();
    }

    public void fl() {
        this.Tgh = SystemClock.elapsedRealtime();
    }

    public long hm() {
        return this.f8117fl;
    }

    public long iMK() {
        return this.cJ;
    }

    public void pA() {
        this.cJ = SystemClock.elapsedRealtime();
    }

    public String toString() {
        return "RequestHttpTime{requestBuildTs=" + this.Qhi + ", asyncCallExecTs=" + this.cJ + ", requestStartExecTs=" + this.f8116ac + ", requestConnectStartTs=" + this.CJ + ", requestConnectFinishTs=" + this.f8117fl + ", reqCallServerStartTs=" + this.ROR + ", reqCallServerFinishTs=" + this.Sf + '}';
    }

    public long zc() {
        return this.Sf;
    }
}
