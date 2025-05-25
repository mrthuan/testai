package com.inmobi.media;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class Z1 {

    /* renamed from: a  reason: collision with root package name */
    public static final C1778q9 f14900a;

    static {
        int i10 = C1778q9.f15392a;
        f14900a = new C1778q9(TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new I4("ClickManagerExecutor", true));
    }

    public static void a(Runnable runnable, EnumC1765p9 enumC1765p9) {
        try {
            C1778q9 c1778q9 = f14900a;
            c1778q9.getClass();
            kotlin.jvm.internal.g.b(enumC1765p9);
            c1778q9.execute(new C1593d2(runnable, enumC1765p9));
        } catch (RejectedExecutionException unused) {
        }
    }
}
