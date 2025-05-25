package com.inmobi.media;

import android.os.Looper;
import android.util.SparseArray;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1819u {

    /* renamed from: a  reason: collision with root package name */
    public static final C1819u f15483a = new C1819u();

    /* renamed from: b  reason: collision with root package name */
    public static final SparseArray f15484b = new SparseArray();
    public static final ThreadPoolExecutor c;

    static {
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        AdConfig adConfig = (AdConfig) AbstractC1773q4.a("ads", "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(adConfig.getMaxPoolSize(), adConfig.getMaxPoolSize(), 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new I4("u".concat("-AD")));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        c = threadPoolExecutor;
    }

    public static void a(int i10, AbstractRunnableC1690k1 task) {
        kotlin.jvm.internal.g.e(task, "task");
        if (kotlin.jvm.internal.g.a(Looper.myLooper(), Looper.getMainLooper())) {
            c(i10, task);
            return;
        }
        ExecutorC1639g6 executorC1639g6 = (ExecutorC1639g6) G3.f14269d.getValue();
        qb.g1 g1Var = new qb.g1(i10, task);
        executorC1639g6.getClass();
        executorC1639g6.f15096a.post(g1Var);
    }

    public static final void b(int i10, AbstractRunnableC1690k1 task) {
        kotlin.jvm.internal.g.e(task, "$task");
        c(i10, task);
    }

    public static void c(int i10, AbstractRunnableC1690k1 abstractRunnableC1690k1) {
        try {
            SparseArray sparseArray = f15484b;
            Queue queue = (Queue) sparseArray.get(i10);
            if (queue == null) {
                queue = new LinkedList();
                sparseArray.put(i10, queue);
            }
            queue.add(abstractRunnableC1690k1);
            AbstractRunnableC1690k1 abstractRunnableC1690k12 = (AbstractRunnableC1690k1) queue.peek();
            if (queue.size() == 1 && abstractRunnableC1690k12 != null) {
                try {
                    c.execute(abstractRunnableC1690k12);
                } catch (OutOfMemoryError unused) {
                    abstractRunnableC1690k12.c();
                }
            }
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
    }
}
