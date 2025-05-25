package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a6.h;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
/* loaded from: classes.dex */
public final class b extends SchedulerConfig.a {

    /* renamed from: a  reason: collision with root package name */
    public final long f9928a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9929b;
    public final Set<SchedulerConfig.Flag> c;

    /* compiled from: AutoValue_SchedulerConfig_ConfigValue.java */
    /* loaded from: classes.dex */
    public static final class a extends SchedulerConfig.a.AbstractC0154a {

        /* renamed from: a  reason: collision with root package name */
        public Long f9930a;

        /* renamed from: b  reason: collision with root package name */
        public Long f9931b;
        public Set<SchedulerConfig.Flag> c;

        public final b a() {
            String str;
            if (this.f9930a == null) {
                str = " delta";
            } else {
                str = "";
            }
            if (this.f9931b == null) {
                str = str.concat(" maxAllowedDelay");
            }
            if (this.c == null) {
                str = h.c(str, " flags");
            }
            if (str.isEmpty()) {
                return new b(this.f9930a.longValue(), this.f9931b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:".concat(str));
        }
    }

    public b(long j10, long j11, Set set) {
        this.f9928a = j10;
        this.f9929b = j11;
        this.c = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a
    public final long a() {
        return this.f9928a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a
    public final Set<SchedulerConfig.Flag> b() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.a
    public final long c() {
        return this.f9929b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.a)) {
            return false;
        }
        SchedulerConfig.a aVar = (SchedulerConfig.a) obj;
        if (this.f9928a == aVar.a() && this.f9929b == aVar.c() && this.c.equals(aVar.b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f9928a;
        long j11 = this.f9929b;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f9928a + ", maxAllowedDelay=" + this.f9929b + ", flags=" + this.c + "}";
    }
}
