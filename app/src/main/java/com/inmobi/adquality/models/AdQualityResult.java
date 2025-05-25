package com.inmobi.adquality.models;

import androidx.activity.f;
import androidx.activity.r;
import androidx.annotation.Keep;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.g;

@Keep
/* loaded from: classes2.dex */
public final class AdQualityResult {
    private final String beaconUrl;
    private String extras;
    private String imageLocation;
    private String sdkModelResult;

    public AdQualityResult(String imageLocation, String str, String beaconUrl, String str2) {
        g.e(imageLocation, "imageLocation");
        g.e(beaconUrl, "beaconUrl");
        this.imageLocation = imageLocation;
        this.sdkModelResult = str;
        this.beaconUrl = beaconUrl;
        this.extras = str2;
    }

    public static /* synthetic */ AdQualityResult copy$default(AdQualityResult adQualityResult, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = adQualityResult.imageLocation;
        }
        if ((i10 & 2) != 0) {
            str2 = adQualityResult.sdkModelResult;
        }
        if ((i10 & 4) != 0) {
            str3 = adQualityResult.beaconUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = adQualityResult.extras;
        }
        return adQualityResult.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.imageLocation;
    }

    public final String component2() {
        return this.sdkModelResult;
    }

    public final String component3() {
        return this.beaconUrl;
    }

    public final String component4() {
        return this.extras;
    }

    public final AdQualityResult copy(String imageLocation, String str, String beaconUrl, String str2) {
        g.e(imageLocation, "imageLocation");
        g.e(beaconUrl, "beaconUrl");
        return new AdQualityResult(imageLocation, str, beaconUrl, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdQualityResult)) {
            return false;
        }
        AdQualityResult adQualityResult = (AdQualityResult) obj;
        if (g.a(this.imageLocation, adQualityResult.imageLocation) && g.a(this.sdkModelResult, adQualityResult.sdkModelResult) && g.a(this.beaconUrl, adQualityResult.beaconUrl) && g.a(this.extras, adQualityResult.extras)) {
            return true;
        }
        return false;
    }

    public final String getBeaconUrl() {
        return this.beaconUrl;
    }

    public final String getExtras() {
        return this.extras;
    }

    public final String getImageLocation() {
        return this.imageLocation;
    }

    public final String getSdkModelResult() {
        return this.sdkModelResult;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.imageLocation.hashCode() * 31;
        String str = this.sdkModelResult;
        int i10 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int h10 = f.h(this.beaconUrl, (hashCode2 + hashCode) * 31, 31);
        String str2 = this.extras;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return h10 + i10;
    }

    public final void setExtras(String str) {
        this.extras = str;
    }

    public final void setImageLocation(String str) {
        g.e(str, "<set-?>");
        this.imageLocation = str;
    }

    public final void setSdkModelResult(String str) {
        this.sdkModelResult = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdQualityResult(imageLocation=");
        sb2.append(this.imageLocation);
        sb2.append(", sdkModelResult=");
        sb2.append(this.sdkModelResult);
        sb2.append(", beaconUrl=");
        sb2.append(this.beaconUrl);
        sb2.append(", extras=");
        return r.f(sb2, this.extras, ')');
    }

    public /* synthetic */ AdQualityResult(String str, String str2, String str3, String str4, int i10, d dVar) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : str4);
    }
}
