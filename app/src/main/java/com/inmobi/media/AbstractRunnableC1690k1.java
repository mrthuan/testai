package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.Queue;

/* renamed from: com.inmobi.media.k1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC1690k1 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    public final WeakReference f15248b;

    /* renamed from: a  reason: collision with root package name */
    public final String f15247a = "k1";
    public final Handler c = new Handler(Looper.getMainLooper());

    public AbstractRunnableC1690k1(Object obj) {
        this.f15248b = new WeakReference(obj);
    }

    public static final void a(AbstractRunnableC1690k1 this$0) {
        kotlin.jvm.internal.g.e(this$0, "this$0");
        Object obj = this$0.f15248b.get();
        if (obj != null) {
            C1819u c1819u = C1819u.f15483a;
            int hashCode = obj.hashCode();
            try {
                SparseArray sparseArray = C1819u.f15484b;
                Queue queue = (Queue) sparseArray.get(hashCode);
                if (queue != null) {
                    queue.poll();
                    AbstractRunnableC1690k1 abstractRunnableC1690k1 = (AbstractRunnableC1690k1) queue.peek();
                    if (queue.size() > 0 && abstractRunnableC1690k1 != null) {
                        try {
                            C1819u.c.execute(abstractRunnableC1690k1);
                        } catch (OutOfMemoryError unused) {
                            abstractRunnableC1690k1.c();
                        }
                    }
                    if (queue.size() == 0) {
                        sparseArray.remove(hashCode);
                    }
                }
            } catch (Exception e10) {
                Q4 q42 = Q4.f14590a;
                Q4.c.a(AbstractC1863x4.a(e10, "event"));
            }
        }
    }

    public abstract void a();

    public final void b() {
        this.c.post(new b1.e(this, 7));
    }

    public void c() {
        String TAG = this.f15247a;
        kotlin.jvm.internal.g.d(TAG, "TAG");
        Z5.a((byte) 1, TAG, "Could not execute runnable due to OutOfMemory.");
        Object obj = this.f15248b.get();
        if (obj != null) {
            C1819u c1819u = C1819u.f15483a;
            int hashCode = obj.hashCode();
            SparseArray sparseArray = C1819u.f15484b;
            sparseArray.remove(hashCode);
            sparseArray.size();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        a();
        b();
    }
}
