package com.bytedance.sdk.component.Sf.Qhi;

import com.bytedance.sdk.component.Sf.Qhi.ac;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: RecyclePool.java */
/* loaded from: classes.dex */
public class fl<T extends ac> {
    private int Qhi;
    private BlockingQueue<T> cJ = new LinkedBlockingQueue();

    private fl(int i10) {
        this.Qhi = i10;
    }

    public static fl Qhi(int i10) {
        return new fl(i10);
    }

    public T Qhi() {
        return this.cJ.poll();
    }

    public boolean Qhi(T t4) {
        if (t4 == null) {
            return false;
        }
        t4.Qhi();
        if (this.cJ.size() >= this.Qhi) {
            return false;
        }
        return this.cJ.offer(t4);
    }
}
