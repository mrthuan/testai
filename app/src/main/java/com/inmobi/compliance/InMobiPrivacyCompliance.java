package com.inmobi.compliance;

import com.inmobi.media.AbstractC1607e2;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.HashMap;
import kotlin.jvm.internal.g;

/* loaded from: classes2.dex */
public final class InMobiPrivacyCompliance {
    public static final InMobiPrivacyCompliance INSTANCE = new InMobiPrivacyCompliance();

    public static final void setDoNotSell(boolean z10) {
        String str;
        HashMap hashMap = AbstractC1607e2.f15024a;
        if (z10) {
            str = "1";
        } else {
            str = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        }
        hashMap.put("do_not_sell", str);
    }

    public static final void setUSPrivacyString(String privacyString) {
        g.e(privacyString, "privacyString");
        AbstractC1607e2.f15024a.put("us_privacy", privacyString);
    }
}
