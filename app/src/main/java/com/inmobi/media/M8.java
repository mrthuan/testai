package com.inmobi.media;

import java.util.Map;

/* loaded from: classes2.dex */
public final class M8 {

    /* renamed from: a  reason: collision with root package name */
    public final Map f14486a;

    public M8(Map requestParams) {
        kotlin.jvm.internal.g.e(requestParams, "requestParams");
        this.f14486a = requestParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof M8) && kotlin.jvm.internal.g.a(this.f14486a, ((M8) obj).f14486a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14486a.hashCode();
    }

    public final String toString() {
        return "NovatiqAdData(requestParams=" + this.f14486a + ')';
    }
}
