package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.internal.client.zzej;
import com.inmobi.compliance.InMobiPrivacyCompliance;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.HashMap;

/* loaded from: classes.dex */
public class InMobiExtrasBuilder {
    public static final String COPPA = "coppa";
    public static final String THIRD_PARTY_KEY = "tp";
    public static final String THIRD_PARTY_VERSION = "tp-ver";

    public static InMobiExtras build(Context context, Bundle bundle, String str) {
        VersionInfo versionInfo;
        HashMap hashMap = new HashMap();
        if (bundle != null && bundle.keySet() != null) {
            for (String str2 : bundle.keySet()) {
                if (!str2.contains(InMobiNetworkKeys.IAB_US_PRIVACY_STRING)) {
                    hashMap.put(str2, bundle.getString(str2));
                }
            }
        }
        String string = context.getSharedPreferences("NonNullPackage", 0).getString(InMobiNetworkKeys.IAB_US_PRIVACY_STRING, null);
        if (string != null) {
            InMobiPrivacyCompliance.setUSPrivacyString(string);
        }
        hashMap.put("tp", str);
        zzej.b();
        String[] split = TextUtils.split("23.3.0", "\\.");
        if (split.length != 3) {
            versionInfo = new VersionInfo(0, 0, 0);
        } else {
            try {
                versionInfo = new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
            } catch (NumberFormatException unused) {
                versionInfo = new VersionInfo(0, 0, 0);
            }
        }
        hashMap.put("tp-ver", versionInfo.toString());
        if (zzej.b().f10175h.f10040a == 1) {
            hashMap.put("coppa", "1");
        } else {
            hashMap.put("coppa", PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES);
        }
        return new InMobiExtras(hashMap, "");
    }
}
