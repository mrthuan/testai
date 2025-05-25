package com.inmobi.media;

/* loaded from: classes2.dex */
public final class V9 {

    /* renamed from: a  reason: collision with root package name */
    public final J f14749a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14750b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14751d;

    /* renamed from: e  reason: collision with root package name */
    public final String f14752e;

    /* renamed from: f  reason: collision with root package name */
    public final String f14753f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f14754g;

    /* renamed from: h  reason: collision with root package name */
    public final int f14755h;

    /* renamed from: i  reason: collision with root package name */
    public final C1859x0 f14756i;

    /* renamed from: j  reason: collision with root package name */
    public final Y9 f14757j;

    public V9(J placement, String markupType, String telemetryMetadataBlob, int i10, String creativeType, String creativeId, boolean z10, int i11, C1859x0 adUnitTelemetryData, Y9 renderViewTelemetryData) {
        kotlin.jvm.internal.g.e(placement, "placement");
        kotlin.jvm.internal.g.e(markupType, "markupType");
        kotlin.jvm.internal.g.e(telemetryMetadataBlob, "telemetryMetadataBlob");
        kotlin.jvm.internal.g.e(creativeType, "creativeType");
        kotlin.jvm.internal.g.e(creativeId, "creativeId");
        kotlin.jvm.internal.g.e(adUnitTelemetryData, "adUnitTelemetryData");
        kotlin.jvm.internal.g.e(renderViewTelemetryData, "renderViewTelemetryData");
        this.f14749a = placement;
        this.f14750b = markupType;
        this.c = telemetryMetadataBlob;
        this.f14751d = i10;
        this.f14752e = creativeType;
        this.f14753f = creativeId;
        this.f14754g = z10;
        this.f14755h = i11;
        this.f14756i = adUnitTelemetryData;
        this.f14757j = renderViewTelemetryData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V9)) {
            return false;
        }
        V9 v92 = (V9) obj;
        if (kotlin.jvm.internal.g.a(this.f14749a, v92.f14749a) && kotlin.jvm.internal.g.a(this.f14750b, v92.f14750b) && kotlin.jvm.internal.g.a(this.c, v92.c) && this.f14751d == v92.f14751d && kotlin.jvm.internal.g.a(this.f14752e, v92.f14752e) && kotlin.jvm.internal.g.a(this.f14753f, v92.f14753f) && this.f14754g == v92.f14754g && this.f14755h == v92.f14755h && kotlin.jvm.internal.g.a(this.f14756i, v92.f14756i) && kotlin.jvm.internal.g.a(this.f14757j, v92.f14757j)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int h10 = androidx.activity.f.h(this.c, androidx.activity.f.h(this.f14750b, this.f14749a.hashCode() * 31, 31), 31);
        int h11 = androidx.activity.f.h(this.f14753f, androidx.activity.f.h(this.f14752e, (this.f14751d + h10) * 31, 31), 31);
        boolean z10 = this.f14754g;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = this.f14755h;
        int hashCode = this.f14756i.hashCode();
        return this.f14757j.f14889a + ((hashCode + ((i11 + ((h11 + i10) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RenderViewMetaData(placement=" + this.f14749a + ", markupType=" + this.f14750b + ", telemetryMetadataBlob=" + this.c + ", internetAvailabilityAdRetryCount=" + this.f14751d + ", creativeType=" + this.f14752e + ", creativeId=" + this.f14753f + ", isRewarded=" + this.f14754g + ", adIndex=" + this.f14755h + ", adUnitTelemetryData=" + this.f14756i + ", renderViewTelemetryData=" + this.f14757j + ')';
    }
}
