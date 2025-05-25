package com.bytedance.sdk.component.Sf;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: TTFutureTask.java */
/* loaded from: classes.dex */
public class Sf<V> extends FutureTask<V> implements Comparable<Sf<V>> {
    private int Qhi;
    private int cJ;

    public Sf(Callable<V> callable, int i10, int i11) {
        super(callable);
        this.Qhi = i10 == -1 ? 5 : i10;
        this.cJ = i11;
    }

    @Override // java.lang.Comparable
    /* renamed from: Qhi */
    public int compareTo(Sf sf2) {
        if (Qhi() < sf2.Qhi()) {
            return 1;
        }
        return Qhi() > sf2.Qhi() ? -1 : 0;
    }

    public int Qhi() {
        return this.Qhi;
    }

    public Sf(Runnable runnable, V v10, int i10, int i11) {
        super(runnable, v10);
        this.Qhi = i10 == -1 ? 5 : i10;
        this.cJ = i11;
    }
}
