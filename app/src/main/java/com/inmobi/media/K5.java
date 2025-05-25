package com.inmobi.media;

/* loaded from: classes2.dex */
public final class K5 {

    /* renamed from: a  reason: collision with root package name */
    public final String f14394a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f14395b;

    public K5(String trigger, boolean z10) {
        kotlin.jvm.internal.g.e(trigger, "trigger");
        this.f14394a = trigger;
        this.f14395b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K5)) {
            return false;
        }
        K5 k52 = (K5) obj;
        if (kotlin.jvm.internal.g.a(this.f14394a, k52.f14394a) && this.f14395b == k52.f14395b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f14394a.hashCode() * 31;
        boolean z10 = this.f14395b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "LandingPageTelemetryControlInfo(trigger=" + this.f14394a + ", enableLPTelemetry=" + this.f14395b + ')';
    }
}
