package com.inmobi.media;

import java.util.List;

/* renamed from: com.inmobi.media.hb  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1658hb {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15139a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15140b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f15141d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f15142e;

    /* renamed from: f  reason: collision with root package name */
    public final List f15143f;

    /* renamed from: g  reason: collision with root package name */
    public final double f15144g;

    public C1658hb(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, List priorityEventsList, double d10) {
        kotlin.jvm.internal.g.e(priorityEventsList, "priorityEventsList");
        this.f15139a = z10;
        this.f15140b = z11;
        this.c = z12;
        this.f15141d = z13;
        this.f15142e = z14;
        this.f15143f = priorityEventsList;
        this.f15144g = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1658hb)) {
            return false;
        }
        C1658hb c1658hb = (C1658hb) obj;
        if (this.f15139a == c1658hb.f15139a && this.f15140b == c1658hb.f15140b && this.c == c1658hb.c && this.f15141d == c1658hb.f15141d && this.f15142e == c1658hb.f15142e && kotlin.jvm.internal.g.a(this.f15143f, c1658hb.f15143f) && Double.compare(this.f15144g, c1658hb.f15144g) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public final int hashCode() {
        boolean z10 = this.f15139a;
        int i10 = 1;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        ?? r22 = this.f15140b;
        int i12 = r22;
        if (r22 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        ?? r23 = this.c;
        int i14 = r23;
        if (r23 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        ?? r24 = this.f15141d;
        int i16 = r24;
        if (r24 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z11 = this.f15142e;
        if (!z11) {
            i10 = z11 ? 1 : 0;
        }
        int hashCode = this.f15143f.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.f15144g);
        return ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + ((hashCode + ((i17 + i10) * 31)) * 31);
    }

    public final String toString() {
        return "TelemetryConfigMetaData(isTelemetryEnabled=" + this.f15139a + ", isImageEnabled=" + this.f15140b + ", isGIFEnabled=" + this.c + ", isVideoEnabled=" + this.f15141d + ", isGeneralEventsDisabled=" + this.f15142e + ", priorityEventsList=" + this.f15143f + ", samplingFactor=" + this.f15144g + ')';
    }
}
