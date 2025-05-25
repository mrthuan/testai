package com.bytedance.sdk.component.Sf;

/* compiled from: TTRunnable.java */
/* loaded from: classes.dex */
public abstract class hm implements Comparable<hm>, Runnable {
    private int Qhi;
    private String cJ;

    public hm(String str, int i10) {
        this.Qhi = 0;
        this.Qhi = i10 == 0 ? 5 : i10;
        this.cJ = str;
    }

    public String getName() {
        return this.cJ;
    }

    public int getPriority() {
        return this.Qhi;
    }

    public void setPriority(int i10) {
        this.Qhi = i10;
    }

    @Override // java.lang.Comparable
    public int compareTo(hm hmVar) {
        if (getPriority() < hmVar.getPriority()) {
            return 1;
        }
        return getPriority() >= hmVar.getPriority() ? -1 : 0;
    }

    public hm(String str) {
        this.Qhi = 5;
        this.cJ = str;
    }
}
