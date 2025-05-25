package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.utils.Jma;

/* compiled from: TTAppOpenAdReportModel.java */
/* loaded from: classes.dex */
public class CQU {
    private int Gm;
    public boolean Qhi;
    private long ROR;
    private long Sf;
    private long Tgh;
    private long WAv;
    public long cJ;

    /* renamed from: fl  reason: collision with root package name */
    private long f9052fl;

    /* renamed from: hm  reason: collision with root package name */
    private long f9053hm;

    /* renamed from: ac  reason: collision with root package name */
    private Jma f9051ac = Jma.cJ();
    private Jma CJ = Jma.cJ();

    public long CJ() {
        return this.ROR;
    }

    public void Qhi(Jma jma, Jma jma2, int i10, Jma jma3) {
        this.f9052fl = jma.Qhi(this.f9051ac);
        this.Tgh = jma2.Qhi(jma);
        this.ROR = i10;
        this.Sf = jma3.Qhi(jma2);
    }

    public long ROR() {
        return this.WAv;
    }

    public int Sf() {
        return this.Gm;
    }

    public long Tgh() {
        return this.f9053hm;
    }

    public long ac() {
        return this.Tgh;
    }

    public void cJ(Jma jma) {
        this.CJ = jma;
        this.f9053hm = jma.Qhi(this.f9051ac);
    }

    public long fl() {
        return this.Sf;
    }

    public long cJ() {
        return this.f9052fl;
    }

    public void Qhi(Jma jma) {
        this.f9051ac = jma;
    }

    public Jma Qhi() {
        return this.f9051ac;
    }

    public void Qhi(long j10) {
        this.WAv = j10;
    }

    public void Qhi(int i10) {
        this.Gm = i10;
    }
}
