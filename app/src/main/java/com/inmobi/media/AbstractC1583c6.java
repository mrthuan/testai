package com.inmobi.media;

import com.inmobi.media.AbstractC1583c6;
import com.inmobi.media.R5;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import kotlin.Result;

/* renamed from: com.inmobi.media.c6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1583c6 {
    public static void a(final R5 dao, final long j10, final int i10) {
        kotlin.jvm.internal.g.e(dao, "dao");
        if (AbstractC1597d6.f15016d.getAndSet(true)) {
            return;
        }
        Vb.f14759a.schedule(new Runnable() { // from class: qb.l0
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC1583c6.b(R5.this, j10, i10);
            }
        }, 10000L, TimeUnit.MILLISECONDS);
    }

    public static final void b(R5 dao, long j10, int i10) {
        kotlin.jvm.internal.g.e(dao, "$dao");
        for (Q5 q5 : AbstractC1860x1.a(dao, "id NOT IN (SELECT id FROM ( SELECT id FROM logs_v2 WHERE saveTimestamp > " + j10 + " ORDER BY saveTimestamp DESC LIMIT " + i10 + ") AS foo);", null, null, null, null, null, 62)) {
            if (q5 != null) {
                AbstractC1611e6.a(q5.f14592a);
                dao.a(q5);
            }
        }
        AbstractC1597d6.f15016d.set(false);
    }

    public static Object a(cg.a run) {
        Semaphore semaphore;
        kotlin.jvm.internal.g.e(run, "run");
        try {
            try {
                semaphore = AbstractC1597d6.c;
                semaphore.acquire();
                run.invoke();
            } catch (Throwable th2) {
                return Result.m13constructorimpl(androidx.activity.s.v(th2));
            }
        } catch (Exception e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(new J1(e10));
            semaphore = AbstractC1597d6.c;
        }
        semaphore.release();
        return Result.m13constructorimpl(tf.d.f30009a);
    }
}
