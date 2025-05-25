package com.bytedance.sdk.component.Tgh.Qhi.Qhi.cJ;

import com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: EventMemoryCacheManager.java */
/* loaded from: classes.dex */
public abstract class fl<T extends com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> {
    private String CJ;
    private com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private Queue<String> f8075ac;
    private Queue<T> cJ = new ConcurrentLinkedQueue();

    public fl(com.bytedance.sdk.component.Tgh.Qhi.CJ.cJ.ac acVar, Queue<String> queue, String str) {
        this.Qhi = acVar;
        this.f8075ac = queue;
        this.CJ = str;
    }

    public void Qhi(T t4) {
        Queue<T> queue = this.cJ;
        if (queue == null || t4 == null) {
            return;
        }
        queue.offer(t4);
    }

    public synchronized boolean cJ(int i10, int i11) {
        int size = this.cJ.size();
        int Qhi = this.Qhi.Qhi();
        if (i10 != 2 && i10 != 1) {
            if (size < Qhi) {
                return false;
            }
            return true;
        } else if (com.bytedance.sdk.component.Tgh.Qhi.ac.Qhi.ac()) {
            if (size <= 0) {
                return false;
            }
            return true;
        } else if (size < Qhi) {
            return false;
        } else {
            return true;
        }
    }

    public synchronized List<com.bytedance.sdk.component.Tgh.Qhi.CJ.Tgh> Qhi(int i10, int i11) {
        if (cJ(i10, i11)) {
            ArrayList arrayList = new ArrayList(this.Qhi.Qhi());
            do {
                T poll = this.cJ.poll();
                if (poll == null) {
                    break;
                }
                arrayList.add(poll);
            } while (arrayList.size() != this.Qhi.cJ());
            return arrayList;
        }
        return null;
    }

    public synchronized void Qhi(int i10, List<T> list) {
        if (i10 != -1 && i10 != 200 && i10 != 509) {
            this.cJ.addAll(list);
        } else {
            this.cJ.size();
        }
    }
}
