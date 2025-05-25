package com.inmobi.media;

/* loaded from: classes2.dex */
public final class G {

    /* renamed from: a  reason: collision with root package name */
    public final C1872y0 f14259a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14260b;
    public final Boolean c;

    /* renamed from: d  reason: collision with root package name */
    public final String f14261d;

    /* renamed from: e  reason: collision with root package name */
    public final byte f14262e;

    public G(C1872y0 adUnitTelemetry, String str, Boolean bool, String str2, byte b10) {
        kotlin.jvm.internal.g.e(adUnitTelemetry, "adUnitTelemetry");
        this.f14259a = adUnitTelemetry;
        this.f14260b = str;
        this.c = bool;
        this.f14261d = str2;
        this.f14262e = b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        if (kotlin.jvm.internal.g.a(this.f14259a, g10.f14259a) && kotlin.jvm.internal.g.a(this.f14260b, g10.f14260b) && kotlin.jvm.internal.g.a(this.c, g10.c) && kotlin.jvm.internal.g.a(this.f14261d, g10.f14261d) && this.f14262e == g10.f14262e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f14259a.hashCode() * 31;
        String str = this.f14260b;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = (hashCode3 + hashCode) * 31;
        Boolean bool = this.c;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i12 = (i11 + hashCode2) * 31;
        String str2 = this.f14261d;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return this.f14262e + ((i12 + i10) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdNotReadyMetadata(adUnitTelemetry=");
        sb2.append(this.f14259a);
        sb2.append(", creativeType=");
        sb2.append(this.f14260b);
        sb2.append(", isRewarded=");
        sb2.append(this.c);
        sb2.append(", markupType=");
        sb2.append(this.f14261d);
        sb2.append(", adState=");
        return androidx.activity.f.n(sb2, this.f14262e, ')');
    }
}
