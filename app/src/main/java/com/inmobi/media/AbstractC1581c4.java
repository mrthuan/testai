package com.inmobi.media;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.Calendar;
import java.util.HashMap;

/* renamed from: com.inmobi.media.c4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1581c4 {
    public static HashMap a() {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("mk-version", Ia.a());
            Boolean c = Hb.f14332a.c();
            if (c != null) {
                if (c.booleanValue()) {
                    str2 = "1";
                } else {
                    str2 = PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
                }
                hashMap.put("u-id-adt", str2);
            }
            hashMap.put("ts", String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar calendar = Calendar.getInstance();
            hashMap.put("tz", String.valueOf(calendar.get(16) + calendar.get(15)));
            Ma.f14488a.getClass();
            HashMap hashMap2 = new HashMap();
            if (Ma.f14491e && (str = Ma.f14490d) != null) {
                hashMap2.put("u-s-id", str);
            }
            hashMap.putAll(hashMap2);
        } catch (Exception unused) {
        }
        return hashMap;
    }
}
