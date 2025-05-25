package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Map;

/* compiled from: AutoValue_SchedulerConfig.java */
/* loaded from: classes.dex */
public final class a extends SchedulerConfig {

    /* renamed from: a  reason: collision with root package name */
    public final e7.a f9926a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Priority, SchedulerConfig.a> f9927b;

    public a(e7.a aVar, Map<Priority, SchedulerConfig.a> map) {
        if (aVar != null) {
            this.f9926a = aVar;
            if (map != null) {
                this.f9927b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final e7.a a() {
        return this.f9926a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Map<Priority, SchedulerConfig.a> c() {
        return this.f9927b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        if (this.f9926a.equals(schedulerConfig.a()) && this.f9927b.equals(schedulerConfig.c())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f9926a.hashCode() ^ 1000003) * 1000003) ^ this.f9927b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f9926a + ", values=" + this.f9927b + "}";
    }
}
