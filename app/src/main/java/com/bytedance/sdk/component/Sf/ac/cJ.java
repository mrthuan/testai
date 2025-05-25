package com.bytedance.sdk.component.Sf.ac;

/* compiled from: PagRunnable.java */
/* loaded from: classes.dex */
public abstract class cJ implements Comparable<cJ>, Runnable {
    private long CJ;
    private int Qhi;
    private long Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private Runnable f8043ac;
    private String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private long f8044fl;

    public cJ(String str) {
        this.Qhi = 5;
        this.cJ = str;
    }

    public long CJ() {
        return this.f8044fl;
    }

    public void Qhi(int i10) {
        this.Qhi = i10;
    }

    public long ROR() {
        return this.Tgh - this.f8044fl;
    }

    public Runnable Sf() {
        return this.f8043ac;
    }

    public long Tgh() {
        return this.f8044fl - this.CJ;
    }

    public long ac() {
        return this.CJ;
    }

    public String cJ() {
        return this.cJ;
    }

    public long fl() {
        return this.Tgh;
    }

    public int Qhi() {
        return this.Qhi;
    }

    public void ac(long j10) {
        this.Tgh = j10;
    }

    public void cJ(long j10) {
        this.f8044fl = j10;
    }

    @Override // java.lang.Comparable
    /* renamed from: Qhi */
    public int compareTo(cJ cJVar) {
        if (Qhi() < cJVar.Qhi()) {
            return 1;
        }
        return Qhi() >= cJVar.Qhi() ? -1 : 0;
    }

    public cJ(int i10, String str) {
        this.Qhi = i10;
        this.cJ = str;
    }

    public void Qhi(long j10) {
        this.CJ = j10;
    }

    public cJ(String str, Runnable runnable) {
        this.Qhi = 5;
        this.cJ = str;
        this.f8043ac = runnable;
    }
}
