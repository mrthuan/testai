package com.bytedance.sdk.component.Tgh.Qhi.fl;

import java.util.UUID;

/* compiled from: TTRunnable.java */
/* loaded from: classes.dex */
public abstract class Tgh implements Comparable<Tgh>, Runnable {

    /* renamed from: ac  reason: collision with root package name */
    private String f8110ac;
    private int Qhi = 5;
    private String cJ = UUID.randomUUID().toString() + "-" + String.valueOf(System.nanoTime());

    public Tgh(String str) {
        this.f8110ac = str;
    }

    public void Qhi(int i10) {
        this.Qhi = i10;
    }

    public int Qhi() {
        return this.Qhi;
    }

    @Override // java.lang.Comparable
    /* renamed from: Qhi */
    public int compareTo(Tgh tgh) {
        if (Qhi() < tgh.Qhi()) {
            return 1;
        }
        return Qhi() >= tgh.Qhi() ? -1 : 0;
    }
}
