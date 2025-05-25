package com.inmobi.media;

import com.inmobi.commons.core.configs.SignalsConfig;

/* loaded from: classes2.dex */
public final class P8 {

    /* renamed from: a  reason: collision with root package name */
    public final String f14581a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14582b;
    public final SignalsConfig.NovatiqConfig c;

    public P8(String hyperId, String spHost, SignalsConfig.NovatiqConfig novatiqConfig) {
        kotlin.jvm.internal.g.e(hyperId, "hyperId");
        kotlin.jvm.internal.g.e(spHost, "spHost");
        kotlin.jvm.internal.g.e(novatiqConfig, "novatiqConfig");
        this.f14581a = hyperId;
        this.f14582b = spHost;
        this.c = novatiqConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P8)) {
            return false;
        }
        P8 p82 = (P8) obj;
        if (kotlin.jvm.internal.g.a(this.f14581a, p82.f14581a) && kotlin.jvm.internal.g.a("i6i", "i6i") && kotlin.jvm.internal.g.a(this.f14582b, p82.f14582b) && kotlin.jvm.internal.g.a("inmobi", "inmobi") && kotlin.jvm.internal.g.a(this.c, p82.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f14582b.hashCode();
        return this.c.hashCode() + ((((hashCode + (((this.f14581a.hashCode() * 31) + 102684) * 31)) * 31) - 1183962098) * 31);
    }

    public final String toString() {
        return "NovatiqData(hyperId=" + this.f14581a + ", sspId=i6i, spHost=" + this.f14582b + ", pubId=inmobi, novatiqConfig=" + this.c + ')';
    }
}
