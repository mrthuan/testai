package com.inmobi.media;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: com.inmobi.media.ia  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1671ia {

    /* renamed from: a  reason: collision with root package name */
    public static final Set f15193a;

    static {
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        kotlin.jvm.internal.g.d(newSetFromMap, "newSetFromMap(...)");
        f15193a = newSetFromMap;
    }

    public static void a(C1643ga c1643ga, long j10) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        int ordinal = c1643ga.f15105f.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) G3.f14268b.getValue();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) G3.c.getValue();
        }
        scheduledThreadPoolExecutor.schedule(new RunnableC1685ja(c1643ga, C1657ha.f15138a), j10, TimeUnit.MILLISECONDS);
    }
}
