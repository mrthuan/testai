package com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi;
import com.bytedance.sdk.openadsdk.core.ROR.cJ.ac;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import lib.zj.office.fc.hslf.record.SlideAtom;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: LinearParser.java */
/* loaded from: classes.dex */
public class ac {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
        if (r2.equals("Icons") == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void Qhi(org.xmlpull.v1.XmlPullParser r8, com.bytedance.sdk.openadsdk.core.ROR.Qhi r9, int r10, double r11) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r8.next()
            r3 = 3
            if (r2 != r3) goto L17
            java.lang.String r2 = r8.getName()
            java.lang.String r4 = "Linear"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L16
            goto L17
        L16:
            return
        L17:
            int r2 = r8.getEventType()
            r4 = 2
            if (r2 != r4) goto L2
            if (r1 == 0) goto L2d
            java.lang.String r2 = r9.ROR()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L2d
            com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi.Tgh.Qhi(r8)
        L2d:
            java.lang.String r2 = r8.getName()
            r2.getClass()
            int r5 = r2.hashCode()
            r6 = 1
            r7 = -1
            switch(r5) {
                case -2049897434: goto L69;
                case -1927368268: goto L5e;
                case -385055469: goto L53;
                case 70476538: goto L4a;
                case 611554000: goto L3f;
                default: goto L3d;
            }
        L3d:
            r3 = r7
            goto L73
        L3f:
            java.lang.String r3 = "TrackingEvents"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L48
            goto L3d
        L48:
            r3 = 4
            goto L73
        L4a:
            java.lang.String r4 = "Icons"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L73
            goto L3d
        L53:
            java.lang.String r3 = "MediaFiles"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5c
            goto L3d
        L5c:
            r3 = r4
            goto L73
        L5e:
            java.lang.String r3 = "Duration"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L67
            goto L3d
        L67:
            r3 = r6
            goto L73
        L69:
            java.lang.String r3 = "VideoClicks"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L72
            goto L3d
        L72:
            r3 = r0
        L73:
            switch(r3) {
                case 0: goto La2;
                case 1: goto L99;
                case 2: goto L93;
                case 3: goto L82;
                case 4: goto L7a;
                default: goto L76;
            }
        L76:
            com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi.Tgh.Qhi(r8)
            goto L2
        L7a:
            com.bytedance.sdk.openadsdk.core.ROR.fl r2 = r9.Qhi()
            Qhi(r8, r2)
            goto L2
        L82:
            com.bytedance.sdk.openadsdk.core.ROR.cJ r2 = Qhi(r8)
            if (r2 == 0) goto L2
            com.bytedance.sdk.openadsdk.core.ROR.cJ r3 = r9.cJ()
            if (r3 != 0) goto L2
            r9.Qhi(r2)
            goto L2
        L93:
            Qhi(r8, r10, r11, r9)
            r1 = r6
            goto L2
        L99:
            double r2 = cJ(r8)
            r9.Qhi(r2)
            goto L2
        La2:
            Qhi(r8, r9)
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi.ac.Qhi(org.xmlpull.v1.XmlPullParser, com.bytedance.sdk.openadsdk.core.ROR.Qhi, int, double):void");
    }

    private static List<com.bytedance.sdk.openadsdk.core.ROR.cJ.ac> ac(XmlPullParser xmlPullParser) {
        return Tgh.Qhi(xmlPullParser, "Tracking");
    }

    public static double cJ(XmlPullParser xmlPullParser) {
        String[] split = Tgh.cJ(xmlPullParser, "Duration").split(":");
        if (split.length == 3) {
            try {
                return (Integer.parseInt(split[1].trim()) * 60) + (Integer.parseInt(split[0].trim()) * 60 * 60) + Float.parseFloat(split[2].trim());
            } catch (Exception unused) {
                return 0.0d;
            }
        }
        return 0.0d;
    }

    private static String Qhi(XmlPullParser xmlPullParser, int i10, double d10, com.bytedance.sdk.openadsdk.core.ROR.Qhi qhi) {
        double d11 = Double.NEGATIVE_INFINITY;
        String str = null;
        int i11 = SlideAtom.USES_MASTER_SLIDE_ID;
        int i12 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                break;
            } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String str2 = Tgh.ROR;
                String attributeValue = xmlPullParser.getAttributeValue(str2, "type");
                int cJ = Tgh.cJ(xmlPullParser.getAttributeValue(str2, InMobiNetworkValues.WIDTH));
                int cJ2 = Tgh.cJ(xmlPullParser.getAttributeValue(str2, InMobiNetworkValues.HEIGHT));
                int cJ3 = Tgh.cJ(xmlPullParser.getAttributeValue(str2, "bitrate"));
                String cJ4 = Tgh.cJ(xmlPullParser, "MediaFile");
                if (cJ > 0 && cJ2 > 0 && com.bytedance.sdk.openadsdk.core.ROR.ac.fl.Qhi.contains(attributeValue) && !TextUtils.isEmpty(cJ4)) {
                    double Qhi = com.bytedance.sdk.openadsdk.core.ROR.ac.fl.Qhi(i10, d10, cJ, cJ2, cJ3, attributeValue);
                    if (Qhi > d11) {
                        str = cJ4;
                        d11 = Qhi;
                        i11 = cJ;
                        i12 = cJ2;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            qhi.CJ(str);
            qhi.Qhi(i11);
            qhi.cJ(i12);
        }
        return str;
    }

    public static com.bytedance.sdk.openadsdk.core.ROR.cJ Qhi(XmlPullParser xmlPullParser) {
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        int i13;
        Qhi.EnumC0113Qhi enumC0113Qhi;
        ArrayList arrayList2;
        com.bytedance.sdk.openadsdk.core.ROR.cJ cJVar = null;
        while (true) {
            int i14 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("Icons")) {
                return cJVar;
            }
            xmlPullParser.next();
            int i15 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Icon")) {
                String str = Tgh.ROR;
                int cJ = Tgh.cJ(xmlPullParser.getAttributeValue(str, InMobiNetworkValues.WIDTH));
                int cJ2 = Tgh.cJ(xmlPullParser.getAttributeValue(str, InMobiNetworkValues.HEIGHT));
                if (cJ > 0 && cJ <= 300 && cJ2 > 0 && cJ2 <= 300) {
                    int Qhi = com.bytedance.sdk.openadsdk.core.ROR.cJ.Qhi.Qhi(xmlPullParser.getAttributeValue(str, "offset"));
                    int Qhi2 = com.bytedance.sdk.openadsdk.core.ROR.cJ.Qhi.Qhi(xmlPullParser.getAttributeValue(str, "duration"));
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    Tgh.Qhi qhi = null;
                    String str2 = null;
                    while (true) {
                        if (xmlPullParser.next() == i14 && xmlPullParser.getName().equals("Icon")) {
                            if (qhi != null && (cJVar == null || TextUtils.isEmpty(cJVar.Tgh()))) {
                                cJVar = new com.bytedance.sdk.openadsdk.core.ROR.cJ(cJ, cJ2, Qhi, Qhi2, qhi.cJ, qhi.f8948ac, qhi.Qhi, arrayList3, arrayList4, str2);
                                Tgh.Qhi(xmlPullParser, "Icons", i14);
                            }
                        } else {
                            ArrayList arrayList5 = arrayList3;
                            ArrayList arrayList6 = arrayList4;
                            if (xmlPullParser.getEventType() == i15) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                char c = 65535;
                                switch (name.hashCode()) {
                                    case -1044238411:
                                        if (name.equals("IconViewTracking")) {
                                            c = 0;
                                            break;
                                        }
                                        break;
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            c = 1;
                                            break;
                                        }
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            c = 2;
                                            break;
                                        }
                                        break;
                                    case 1030746596:
                                        if (name.equals("IconClicks")) {
                                            c = 3;
                                            break;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals("HTMLResource")) {
                                            c = 4;
                                            break;
                                        }
                                        break;
                                }
                                switch (c) {
                                    case 0:
                                        arrayList3 = arrayList5;
                                        i10 = 3;
                                        i11 = 2;
                                        arrayList = arrayList6;
                                        arrayList.add(new ac.Qhi(Tgh.cJ(xmlPullParser, "IconViewTracking")).Qhi());
                                        break;
                                    case 1:
                                        arrayList3 = arrayList5;
                                        i12 = 3;
                                        i13 = 2;
                                        if (qhi == null) {
                                            qhi = new Tgh.Qhi(Tgh.cJ(xmlPullParser, "IFrameResource"), Qhi.EnumC0113Qhi.NONE, Qhi.cJ.IFRAME_RESOURCE);
                                            i14 = i12;
                                            i15 = i13;
                                            arrayList4 = arrayList6;
                                            break;
                                        }
                                        Tgh.Qhi(xmlPullParser);
                                        i14 = i12;
                                        i15 = i13;
                                        arrayList4 = arrayList6;
                                    case 2:
                                        arrayList3 = arrayList5;
                                        i12 = 3;
                                        i13 = 2;
                                        Qhi.EnumC0113Qhi enumC0113Qhi2 = Qhi.EnumC0113Qhi.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(Tgh.ROR, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi.Qhi;
                                        String cJ3 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi.cJ.contains(lowerCase)) ? Tgh.cJ(xmlPullParser, "StaticResource") : null;
                                        if (set.contains(lowerCase)) {
                                            enumC0113Qhi = Qhi.EnumC0113Qhi.IMAGE;
                                        } else {
                                            enumC0113Qhi = Qhi.EnumC0113Qhi.JAVASCRIPT;
                                        }
                                        qhi = new Tgh.Qhi(cJ3, enumC0113Qhi, Qhi.cJ.STATIC_RESOURCE);
                                        i14 = i12;
                                        i15 = i13;
                                        arrayList4 = arrayList6;
                                        break;
                                    case 3:
                                        while (true) {
                                            i12 = 3;
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("IconClicks")) {
                                                arrayList3 = arrayList5;
                                                i13 = 2;
                                                i14 = i12;
                                                i15 = i13;
                                                arrayList4 = arrayList6;
                                                break;
                                            } else {
                                                if (xmlPullParser.getEventType() == 2) {
                                                    if (xmlPullParser.getName().equals("IconClickThrough")) {
                                                        str2 = Tgh.cJ(xmlPullParser, "IconClickThrough");
                                                    } else if (xmlPullParser.getName().equals("IconClickTracking")) {
                                                        arrayList2 = arrayList5;
                                                        arrayList2.add(new ac.Qhi(Tgh.cJ(xmlPullParser, "IconClickTracking")).Qhi());
                                                        arrayList5 = arrayList2;
                                                    }
                                                }
                                                arrayList2 = arrayList5;
                                                arrayList5 = arrayList2;
                                            }
                                        }
                                        break;
                                    case 4:
                                        if (qhi == null || qhi.f8948ac == Qhi.cJ.IFRAME_RESOURCE) {
                                            qhi = new Tgh.Qhi(Tgh.cJ(xmlPullParser, "HTMLResource"), Qhi.EnumC0113Qhi.NONE, Qhi.cJ.HTML_RESOURCE);
                                            arrayList3 = arrayList5;
                                            arrayList4 = arrayList6;
                                            i14 = 3;
                                            i15 = 2;
                                            break;
                                        } else {
                                            arrayList3 = arrayList5;
                                            i12 = 3;
                                            i13 = 2;
                                            Tgh.Qhi(xmlPullParser);
                                            i14 = i12;
                                            i15 = i13;
                                            arrayList4 = arrayList6;
                                            break;
                                        }
                                    default:
                                        arrayList3 = arrayList5;
                                        i12 = 3;
                                        i13 = 2;
                                        Tgh.Qhi(xmlPullParser);
                                        i14 = i12;
                                        i15 = i13;
                                        arrayList4 = arrayList6;
                                        break;
                                }
                            } else {
                                i10 = i14;
                                i11 = i15;
                                arrayList3 = arrayList5;
                                arrayList = arrayList6;
                            }
                            arrayList4 = arrayList;
                            i14 = i10;
                            i15 = i11;
                        }
                    }
                } else {
                    Tgh.Qhi(xmlPullParser);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        if (r0.equals("unmute") == false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void Qhi(org.xmlpull.v1.XmlPullParser r7, com.bytedance.sdk.openadsdk.core.ROR.fl r8) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi.ac.Qhi(org.xmlpull.v1.XmlPullParser, com.bytedance.sdk.openadsdk.core.ROR.fl):void");
    }

    private static void Qhi(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.ROR.Qhi qhi) {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (name.equals("ClickThrough")) {
                    qhi.ac(Tgh.cJ(xmlPullParser, "ClickThrough"));
                } else if (!name.equals("ClickTracking")) {
                    Tgh.Qhi(xmlPullParser);
                } else {
                    qhi.Qhi().ROR(Tgh.Qhi(xmlPullParser, "ClickTracking"));
                }
            }
        }
    }
}
