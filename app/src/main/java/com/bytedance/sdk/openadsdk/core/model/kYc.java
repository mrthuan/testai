package com.bytedance.sdk.openadsdk.core.model;

/* compiled from: LoadingInfo.java */
/* loaded from: classes.dex */
public class kYc {
    private long Qhi = 10000;
    private long cJ = 10000;

    /* renamed from: ac  reason: collision with root package name */
    private long f9100ac = 10;
    private long CJ = 20;

    /* renamed from: fl  reason: collision with root package name */
    private String f9101fl = "";

    public long CJ() {
        return this.CJ;
    }

    public long Qhi() {
        return this.Qhi;
    }

    public long ac() {
        return this.f9100ac;
    }

    public long cJ() {
        return this.cJ;
    }

    public String fl() {
        return this.f9101fl;
    }

    public void CJ(long j10) {
        if (j10 < 0) {
            this.CJ = 20L;
        } else {
            this.CJ = j10;
        }
    }

    public void Qhi(long j10) {
        if (j10 <= 0) {
            this.Qhi = 10L;
        } else {
            this.Qhi = j10;
        }
    }

    public void ac(long j10) {
        if (j10 <= 0) {
            this.f9100ac = 10L;
        } else {
            this.f9100ac = j10;
        }
    }

    public void cJ(long j10) {
        if (j10 < 0) {
            this.cJ = 20L;
        } else {
            this.cJ = j10;
        }
    }

    public void Qhi(String str) {
        this.f9101fl = str;
    }
}
