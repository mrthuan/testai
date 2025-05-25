package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.inmobi.media.z3  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1888z3 {

    /* renamed from: a  reason: collision with root package name */
    public final List f15699a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15700b;

    public C1888z3(ArrayList eventIDs, String payload) {
        kotlin.jvm.internal.g.e(eventIDs, "eventIDs");
        kotlin.jvm.internal.g.e(payload, "payload");
        this.f15699a = eventIDs;
        this.f15700b = payload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1888z3)) {
            return false;
        }
        C1888z3 c1888z3 = (C1888z3) obj;
        if (kotlin.jvm.internal.g.a(this.f15699a, c1888z3.f15699a) && kotlin.jvm.internal.g.a(this.f15700b, c1888z3.f15700b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return androidx.activity.f.h(this.f15700b, this.f15699a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventPayload(eventIDs=");
        sb2.append(this.f15699a);
        sb2.append(", payload=");
        return androidx.activity.r.g(sb2, this.f15700b, ", shouldFlushOnFailure=false)");
    }
}
