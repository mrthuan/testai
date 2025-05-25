package com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi;

import android.content.Context;
import android.text.TextUtils;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: InLineParser.java */
/* loaded from: classes.dex */
public class cJ {
    public static com.bytedance.sdk.openadsdk.core.ROR.Qhi Qhi(Context context, XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.ROR.cJ.ac> list, int i10, double d10) {
        xmlPullParser.require(2, Tgh.ROR, "InLine");
        com.bytedance.sdk.openadsdk.core.ROR.Qhi qhi = new com.bytedance.sdk.openadsdk.core.ROR.Qhi();
        while (true) {
            if (xmlPullParser.next() == 3 && "InLine".equals(xmlPullParser.getName())) {
                qhi.Qhi().WAv(list);
                return qhi;
            } else if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                char c = 65535;
                switch (name.hashCode()) {
                    case -2077435339:
                        if (name.equals("AdVerifications")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1692490108:
                        if (name.equals("Creatives")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -56677412:
                        if (name.equals("Description")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 67232232:
                        if (name.equals("Error")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 184043572:
                        if (name.equals("Extensions")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 501930965:
                        if (name.equals("AdTitle")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 2114088489:
                        if (name.equals("Impression")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        qhi.Qhi(fl.Qhi(xmlPullParser));
                        break;
                    case 1:
                        if (!TextUtils.isEmpty(qhi.ROR()) && qhi.ac() != null) {
                            Tgh.Qhi(xmlPullParser);
                            break;
                        } else {
                            while (xmlPullParser.next() != 3) {
                                if (xmlPullParser.getEventType() == 2) {
                                    if ("Creative".equals(xmlPullParser.getName())) {
                                        Qhi(context, xmlPullParser, qhi, i10, d10);
                                    } else {
                                        Tgh.Qhi(xmlPullParser);
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    case 2:
                        qhi.cJ(Tgh.cJ(xmlPullParser, name));
                        break;
                    case 3:
                        list.addAll(Tgh.Qhi(xmlPullParser, name));
                        break;
                    case 4:
                        while (true) {
                            if (xmlPullParser.getEventType() != 3 || !"Extensions".equals(xmlPullParser.getName())) {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                    qhi.Qhi(fl.Qhi(xmlPullParser));
                                }
                            }
                        }
                        break;
                    case 5:
                        qhi.Qhi(Tgh.cJ(xmlPullParser, name));
                        break;
                    case 6:
                        qhi.Qhi().Qhi(Tgh.Qhi(xmlPullParser, name));
                        break;
                    default:
                        Tgh.Qhi(xmlPullParser);
                        break;
                }
            }
        }
    }

    public static void Qhi(Context context, XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.ROR.Qhi qhi, int i10, double d10) {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(qhi.ROR())) {
                    ac.Qhi(xmlPullParser, qhi, i10, d10);
                } else if ("CompanionAds".equals(xmlPullParser.getName()) && qhi.ac() == null) {
                    qhi.Qhi(Qhi.Qhi(context, xmlPullParser));
                } else {
                    Tgh.Qhi(xmlPullParser);
                }
            }
        }
    }
}
