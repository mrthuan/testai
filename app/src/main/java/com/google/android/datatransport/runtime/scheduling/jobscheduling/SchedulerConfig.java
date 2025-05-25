package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.auto.value.AutoValue;
import java.util.Map;
import java.util.Set;

@AutoValue
/* loaded from: classes.dex */
public abstract class SchedulerConfig {

    /* loaded from: classes.dex */
    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    @AutoValue
    /* loaded from: classes.dex */
    public static abstract class a {

        @AutoValue.Builder
        /* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static abstract class AbstractC0154a {
        }

        public abstract long a();

        public abstract Set<Flag> b();

        public abstract long c();
    }

    public abstract e7.a a();

    public final long b(Priority priority, long j10, int i10) {
        long j11;
        long a10 = j10 - a().a();
        a aVar = c().get(priority);
        long a11 = aVar.a();
        int i11 = i10 - 1;
        if (a11 > 1) {
            j11 = a11;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i11) * a11 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j11 * i11))), a10), aVar.c());
    }

    public abstract Map<Priority, a> c();
}
