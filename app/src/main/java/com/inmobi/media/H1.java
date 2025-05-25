package com.inmobi.media;

import java.util.Map;

/* loaded from: classes2.dex */
public final class H1 {

    /* renamed from: a  reason: collision with root package name */
    public final int f14310a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14311b;
    public final Map c;

    public H1(int i10, int i11, String str) {
        str = (i11 & 2) != 0 ? null : str;
        this.f14310a = i10;
        this.f14311b = str;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H1)) {
            return false;
        }
        H1 h12 = (H1) obj;
        if (this.f14310a == h12.f14310a && kotlin.jvm.internal.g.a(this.f14311b, h12.f14311b) && kotlin.jvm.internal.g.a(this.c, h12.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = this.f14310a * 31;
        String str = this.f14311b;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (i10 + hashCode) * 31;
        Map map = this.c;
        if (map != null) {
            i11 = map.hashCode();
        }
        return i12 + i11;
    }

    public final String toString() {
        return "BusEvent(eventId=" + this.f14310a + ", eventMessage=" + this.f14311b + ", eventData=" + this.c + ')';
    }

    public H1(int i10, String str, Map map) {
        this.f14310a = i10;
        this.f14311b = str;
        this.c = map;
    }
}
