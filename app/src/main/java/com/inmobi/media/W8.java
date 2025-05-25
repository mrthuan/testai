package com.inmobi.media;

import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ImpressionType;

/* loaded from: classes2.dex */
public abstract class W8 {
    public static T8 a(String creativeType, S9 s92, boolean z10, String str, byte b10, String str2) {
        AdSessionContext adSessionContext;
        ImpressionType impressionType;
        kotlin.jvm.internal.g.e(creativeType, "creativeType");
        if (s92 != null) {
            C1572b9 c1572b9 = AbstractC1558a9.f14936a;
            c1572b9.getClass();
            adSessionContext = AdSessionContext.createHtmlAdSessionContext(c1572b9.f14968b, s92, str, str2);
            kotlin.jvm.internal.g.d(adSessionContext, "createHtmlAdSessionContext(...)");
        } else {
            adSessionContext = null;
        }
        if (b10 == 1) {
            impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
        } else if (b10 == 2) {
            impressionType = ImpressionType.UNSPECIFIED;
        } else if (b10 == 3) {
            impressionType = ImpressionType.LOADED;
        } else if (b10 == 4) {
            impressionType = ImpressionType.BEGIN_TO_RENDER;
        } else if (b10 == 5) {
            impressionType = ImpressionType.ONE_PIXEL;
        } else if (b10 == 6) {
            impressionType = ImpressionType.VIEWABLE;
        } else if (b10 == 7) {
            impressionType = ImpressionType.AUDIBLE;
        } else if (b10 == 0) {
            impressionType = ImpressionType.OTHER;
        } else {
            impressionType = ImpressionType.OTHER;
        }
        int hashCode = creativeType.hashCode();
        if (hashCode != -284840886) {
            if (hashCode != 93166550) {
                if (hashCode != 112202875) {
                    if (hashCode != 1425678798 || !creativeType.equals("nonvideo")) {
                        return null;
                    }
                    return new T8("html_display_ad", impressionType, adSessionContext, false);
                } else if (!creativeType.equals("video")) {
                    return null;
                } else {
                    return new T8("html_video_ad", impressionType, adSessionContext, z10);
                }
            } else if (!creativeType.equals("audio")) {
                return null;
            } else {
                return new T8("html_audio_ad", impressionType, adSessionContext, z10);
            }
        }
        creativeType.equals("unknown");
        return null;
    }
}
