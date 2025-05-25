package com.pgl.ssdk;

import com.pgl.ssdk.O;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: RecyclePool.java */
/* loaded from: classes2.dex */
public class P<T extends O> {

    /* renamed from: a  reason: collision with root package name */
    private BlockingQueue<T> f15787a = new LinkedBlockingQueue();

    private P(int i10) {
    }

    public static P a(int i10) {
        return new P(i10);
    }

    public T a() {
        return this.f15787a.poll();
    }
}
