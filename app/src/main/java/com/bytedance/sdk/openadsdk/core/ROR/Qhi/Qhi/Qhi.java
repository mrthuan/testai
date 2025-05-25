package com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: CompanionAdsParser.java */
/* loaded from: classes.dex */
public class Qhi {
    public static com.bytedance.sdk.openadsdk.core.ROR.ac Qhi(Context context, XmlPullParser xmlPullParser) {
        int i10;
        com.bytedance.sdk.openadsdk.core.ROR.ac acVar;
        int i11;
        Tgh.Qhi qhi;
        int i12;
        int i13;
        Qhi.EnumC0113Qhi enumC0113Qhi;
        String cJ;
        int i14;
        char c;
        if (context == null) {
            Tgh.Qhi(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i15 = displayMetrics.widthPixels;
        int i16 = displayMetrics.heightPixels;
        float f10 = displayMetrics.density;
        int i17 = (int) (i15 / f10);
        int i18 = (int) (i16 / f10);
        float f11 = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.ROR.ac acVar2 = null;
        while (true) {
            int i19 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return acVar2;
            }
            xmlPullParser.next();
            int i20 = 2;
            if (xmlPullParser.getEventType() == 2) {
                String str = "Companion";
                if (xmlPullParser.getName().equals("Companion")) {
                    String str2 = Tgh.ROR;
                    int cJ2 = Tgh.cJ(xmlPullParser.getAttributeValue(str2, InMobiNetworkValues.WIDTH));
                    int cJ3 = Tgh.cJ(xmlPullParser.getAttributeValue(str2, InMobiNetworkValues.HEIGHT));
                    if (cJ2 >= 300 && cJ3 >= 250) {
                        Tgh.Qhi qhi2 = new Tgh.Qhi();
                        while (true) {
                            if (xmlPullParser.getEventType() == i19 && xmlPullParser.getName().equals(str)) {
                                if (!TextUtils.isEmpty(qhi2.Qhi) && qhi2.ROR >= f11) {
                                    acVar2 = new com.bytedance.sdk.openadsdk.core.ROR.ac(cJ2, cJ3, qhi2.cJ, qhi2.f8948ac, qhi2.Qhi, qhi2.f8949fl, qhi2.Tgh, qhi2.CJ);
                                    f11 = qhi2.ROR;
                                }
                            } else {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == i20) {
                                    String name = xmlPullParser.getName();
                                    name.getClass();
                                    com.bytedance.sdk.openadsdk.core.ROR.ac acVar3 = acVar2;
                                    String str3 = str;
                                    char c10 = 65535;
                                    switch (name.hashCode()) {
                                        case -375340334:
                                            if (name.equals("IFrameResource")) {
                                                c = 0;
                                                c10 = c;
                                                break;
                                            }
                                            break;
                                        case -348198615:
                                            if (name.equals("CompanionClickThrough")) {
                                                c = 1;
                                                c10 = c;
                                                break;
                                            }
                                            break;
                                        case 611554000:
                                            if (name.equals("TrackingEvents")) {
                                                c10 = 2;
                                                break;
                                            }
                                            break;
                                        case 676623548:
                                            if (name.equals("StaticResource")) {
                                                c10 = 3;
                                                break;
                                            }
                                            break;
                                        case 1877773523:
                                            if (name.equals("CompanionClickTracking")) {
                                                c = 4;
                                                c10 = c;
                                                break;
                                            }
                                            break;
                                        case 1928285401:
                                            if (name.equals("HTMLResource")) {
                                                c = 5;
                                                c10 = c;
                                                break;
                                            }
                                            break;
                                    }
                                    switch (c10) {
                                        case 0:
                                            i11 = i18;
                                            Tgh.Qhi qhi3 = qhi2;
                                            int i21 = cJ3;
                                            int i22 = cJ2;
                                            Point Qhi = com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi.Qhi(context, i22, i21, Qhi.cJ.HTML_RESOURCE);
                                            int i23 = Qhi.x;
                                            int i24 = Qhi.y;
                                            Qhi.cJ cJVar = Qhi.cJ.IFRAME_RESOURCE;
                                            Qhi.EnumC0113Qhi enumC0113Qhi2 = Qhi.EnumC0113Qhi.NONE;
                                            float Qhi2 = com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi(i17, i11, i23, i24, cJVar, enumC0113Qhi2);
                                            String cJ4 = Tgh.cJ(xmlPullParser, "IFrameResource");
                                            if (!TextUtils.isEmpty(cJ4) && Qhi2 > qhi3.ROR && Qhi2 > f11) {
                                                qhi3.ROR = Qhi2;
                                                qhi3.Qhi(cJ4, enumC0113Qhi2, cJVar);
                                                qhi2 = qhi3;
                                                cJ2 = i22;
                                                cJ3 = i21;
                                                i20 = 2;
                                                acVar2 = acVar3;
                                                str = str3;
                                                i18 = i11;
                                                i19 = 3;
                                                break;
                                            } else {
                                                i14 = 3;
                                                Tgh.Qhi(xmlPullParser, "IFrameResource", 3);
                                                qhi2 = qhi3;
                                                cJ2 = i22;
                                                cJ3 = i21;
                                                i20 = 2;
                                                acVar2 = acVar3;
                                                str = str3;
                                                i19 = i14;
                                                break;
                                            }
                                            break;
                                        case 1:
                                            qhi2.CJ = Tgh.cJ(xmlPullParser, "CompanionClickThrough");
                                            i20 = 2;
                                            cJ2 = cJ2;
                                            acVar2 = acVar3;
                                            str = str3;
                                            i19 = 3;
                                            break;
                                        case 2:
                                            i11 = i18;
                                            qhi = qhi2;
                                            i12 = cJ3;
                                            i13 = cJ2;
                                            while (true) {
                                                if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                    cJ2 = i13;
                                                    cJ3 = i12;
                                                    qhi2 = qhi;
                                                    acVar2 = acVar3;
                                                    str = str3;
                                                    i18 = i11;
                                                    i19 = 3;
                                                    i20 = 2;
                                                    break;
                                                } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                    qhi.cJ(Tgh.cJ(xmlPullParser, "Tracking"));
                                                }
                                            }
                                            break;
                                        case 3:
                                            qhi = qhi2;
                                            i12 = cJ3;
                                            i13 = cJ2;
                                            Qhi.EnumC0113Qhi enumC0113Qhi3 = Qhi.EnumC0113Qhi.NONE;
                                            String lowerCase = xmlPullParser.getAttributeValue(Tgh.ROR, "creativeType").toLowerCase();
                                            Set<String> set = com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi.Qhi;
                                            if (set.contains(lowerCase)) {
                                                enumC0113Qhi = Qhi.EnumC0113Qhi.IMAGE;
                                            } else {
                                                enumC0113Qhi = Qhi.EnumC0113Qhi.JAVASCRIPT;
                                            }
                                            Qhi.EnumC0113Qhi enumC0113Qhi4 = enumC0113Qhi;
                                            Qhi.cJ cJVar2 = Qhi.cJ.STATIC_RESOURCE;
                                            Point Qhi3 = com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi.Qhi(context, i13, i12, cJVar2);
                                            i11 = i18;
                                            float Qhi4 = com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi(i17, i18, Qhi3.x, Qhi3.y, cJVar2, enumC0113Qhi4);
                                            if (!set.contains(lowerCase) && !com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi.cJ.contains(lowerCase)) {
                                                cJ = null;
                                            } else {
                                                cJ = Tgh.cJ(xmlPullParser, "StaticResource");
                                            }
                                            if (Qhi4 >= qhi.ROR && Qhi4 > f11 && !TextUtils.isEmpty(cJ)) {
                                                qhi.ROR = Qhi4;
                                                qhi.Qhi(cJ, enumC0113Qhi4, cJVar2);
                                                cJ2 = i13;
                                                cJ3 = i12;
                                                qhi2 = qhi;
                                                acVar2 = acVar3;
                                                str = str3;
                                                i18 = i11;
                                                i19 = 3;
                                                i20 = 2;
                                                break;
                                            } else {
                                                i14 = 3;
                                                Tgh.Qhi(xmlPullParser, "StaticResource", 3);
                                                cJ2 = i13;
                                                cJ3 = i12;
                                                qhi2 = qhi;
                                                acVar2 = acVar3;
                                                str = str3;
                                                i20 = 2;
                                                i19 = i14;
                                                break;
                                            }
                                            break;
                                        case 4:
                                            qhi2.Qhi(Tgh.cJ(xmlPullParser, "CompanionClickTracking"));
                                            acVar2 = acVar3;
                                            str = str3;
                                            i19 = 3;
                                            i20 = 2;
                                            break;
                                        case 5:
                                            Qhi.cJ cJVar3 = Qhi.cJ.HTML_RESOURCE;
                                            Point Qhi5 = com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi.Qhi(context, cJ2, cJ3, cJVar3);
                                            int i25 = Qhi5.x;
                                            int i26 = Qhi5.y;
                                            Qhi.EnumC0113Qhi enumC0113Qhi5 = Qhi.EnumC0113Qhi.NONE;
                                            Tgh.Qhi qhi4 = qhi2;
                                            int i27 = cJ3;
                                            int i28 = cJ2;
                                            float Qhi6 = com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi(i17, i18, i25, i26, cJVar3, enumC0113Qhi5);
                                            String cJ5 = Tgh.cJ(xmlPullParser, "HTMLResource");
                                            if (!TextUtils.isEmpty(cJ5) && Qhi6 > qhi4.ROR && Qhi6 > f11) {
                                                qhi4.ROR = Qhi6;
                                                qhi4.Qhi(cJ5, enumC0113Qhi5, cJVar3);
                                                cJ2 = i28;
                                                qhi2 = qhi4;
                                                acVar2 = acVar3;
                                                str = str3;
                                                cJ3 = i27;
                                                i19 = 3;
                                                i20 = 2;
                                            } else {
                                                Tgh.Qhi(xmlPullParser, "HTMLResource", 3);
                                                i19 = 3;
                                                cJ2 = i28;
                                                qhi2 = qhi4;
                                                acVar2 = acVar3;
                                                str = str3;
                                                cJ3 = i27;
                                                i20 = 2;
                                                break;
                                            }
                                            break;
                                        default:
                                            Tgh.Qhi(xmlPullParser);
                                            i11 = i18;
                                            qhi = qhi2;
                                            i12 = cJ3;
                                            i13 = cJ2;
                                            cJ2 = i13;
                                            cJ3 = i12;
                                            qhi2 = qhi;
                                            acVar2 = acVar3;
                                            str = str3;
                                            i18 = i11;
                                            i19 = 3;
                                            i20 = 2;
                                            break;
                                    }
                                } else {
                                    i11 = i18;
                                }
                                i18 = i11;
                            }
                        }
                    } else {
                        i10 = i18;
                        acVar = acVar2;
                        Tgh.Qhi(xmlPullParser);
                        acVar2 = acVar;
                        i18 = i10;
                    }
                }
            }
            i10 = i18;
            acVar = acVar2;
            acVar2 = acVar;
            i18 = i10;
        }
    }
}
