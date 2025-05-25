package com.inmobi.media;

/* loaded from: classes2.dex */
public final class L5 {

    /* renamed from: a  reason: collision with root package name */
    public final long f14425a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14426b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14427d;

    /* renamed from: e  reason: collision with root package name */
    public final String f14428e;

    /* renamed from: f  reason: collision with root package name */
    public final String f14429f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f14430g;

    /* renamed from: h  reason: collision with root package name */
    public long f14431h;

    public L5(long j10, String placementType, String adType, String markupType, String creativeType, String metaDataBlob, boolean z10, long j11) {
        kotlin.jvm.internal.g.e(placementType, "placementType");
        kotlin.jvm.internal.g.e(adType, "adType");
        kotlin.jvm.internal.g.e(markupType, "markupType");
        kotlin.jvm.internal.g.e(creativeType, "creativeType");
        kotlin.jvm.internal.g.e(metaDataBlob, "metaDataBlob");
        this.f14425a = j10;
        this.f14426b = placementType;
        this.c = adType;
        this.f14427d = markupType;
        this.f14428e = creativeType;
        this.f14429f = metaDataBlob;
        this.f14430g = z10;
        this.f14431h = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L5)) {
            return false;
        }
        L5 l52 = (L5) obj;
        if (this.f14425a == l52.f14425a && kotlin.jvm.internal.g.a(this.f14426b, l52.f14426b) && kotlin.jvm.internal.g.a(this.c, l52.c) && kotlin.jvm.internal.g.a(this.f14427d, l52.f14427d) && kotlin.jvm.internal.g.a(this.f14428e, l52.f14428e) && kotlin.jvm.internal.g.a(this.f14429f, l52.f14429f) && this.f14430g == l52.f14430g && this.f14431h == l52.f14431h) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        long j10 = this.f14425a;
        int h10 = androidx.activity.f.h(this.f14429f, androidx.activity.f.h(this.f14428e, androidx.activity.f.h(this.f14427d, androidx.activity.f.h(this.c, androidx.activity.f.h(this.f14426b, ((int) (j10 ^ (j10 >>> 32))) * 31, 31), 31), 31), 31), 31);
        boolean z10 = this.f14430g;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        long j11 = this.f14431h;
        return ((int) ((j11 >>> 32) ^ j11)) + ((h10 + i10) * 31);
    }

    public final String toString() {
        return "LandingPageTelemetryMetaData(placementId=" + this.f14425a + ", placementType=" + this.f14426b + ", adType=" + this.c + ", markupType=" + this.f14427d + ", creativeType=" + this.f14428e + ", metaDataBlob=" + this.f14429f + ", isRewarded=" + this.f14430g + ", startTime=" + this.f14431h + ')';
    }
}
