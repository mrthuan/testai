package com.inmobi.media;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.inmobi.commons.core.configs.AdConfig;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.inmobi.media.cc  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1589cc {

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f15004f = kotlin.collections.q.z0(new Pair("Error", "error"), new Pair("Impression", "Impression"), new Pair("ClickTracking", C1646h.CLICK_BEACON), new Pair("creativeView", "creativeView"), new Pair("start", "start"), new Pair("firstQuartile", "firstQuartile"), new Pair("midpoint", "midpoint"), new Pair("thirdQuartile", "thirdQuartile"), new Pair("complete", "complete"), new Pair("mute", "mute"), new Pair("unmute", "unmute"), new Pair("pause", "pause"), new Pair("resume", "resume"), new Pair("fullscreen", "fullscreen"), new Pair("exitFullscreen", "exitFullscreen"), new Pair("closeEndCard", "closeEndCard"));

    /* renamed from: a  reason: collision with root package name */
    public final AdConfig.VastVideoConfig f15005a;

    /* renamed from: b  reason: collision with root package name */
    public final A4 f15006b;
    public final C1659hc c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15007d;

    /* renamed from: e  reason: collision with root package name */
    public int f15008e;

    public C1589cc(AdConfig.VastVideoConfig mVastVideoConfig, A4 a42) {
        kotlin.jvm.internal.g.e(mVastVideoConfig, "mVastVideoConfig");
        this.f15005a = mVastVideoConfig;
        this.f15006b = a42;
        this.c = new C1659hc(EmptyList.INSTANCE, mVastVideoConfig);
    }

    public static boolean b(int i10) {
        return i10 == 3;
    }

    public final C1659hc a(String str) {
        A4 a42 = this.f15006b;
        if (a42 != null) {
            ((B4) a42).c("cc", AbstractC1890z5.a("cc", "TAG", "vastXML = ", str));
        }
        try {
        } catch (XmlPullParserException e10) {
            c(100);
            Q4 q42 = Q4.f14590a;
            Q4.c.a(new J1(e10));
        } catch (Exception e11) {
            c(OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK);
            Q4 q43 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e11, "event"));
        }
        if (TextUtils.isEmpty(str)) {
            c(303);
            return this.c;
        }
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(new StringReader(str));
        String[] strArr = {"Wrapper", "InLine"};
        a(newPullParser, "VAST");
        if (kotlin.jvm.internal.g.a("VAST", newPullParser.getName())) {
            a(newPullParser, "Ad");
            if (kotlin.jvm.internal.g.a("Ad", newPullParser.getName())) {
                a(newPullParser, strArr);
                if (kotlin.jvm.internal.g.a("InLine", newPullParser.getName())) {
                    c(newPullParser);
                } else if (kotlin.jvm.internal.g.a("Wrapper", newPullParser.getName())) {
                    f(newPullParser);
                } else {
                    A4 a43 = this.f15006b;
                    if (a43 != null) {
                        ((B4) a43).b("cc", "VAST Schema validation error: InLine node or Wrapper node at appropriate hierarchy not found");
                    }
                    c(101);
                }
            } else {
                A4 a44 = this.f15006b;
                if (a44 != null) {
                    ((B4) a44).b("cc", "VAST Schema validation error: Ad node at appropriate hierarchy not found");
                }
                c(303);
            }
        } else {
            A4 a45 = this.f15006b;
            if (a45 != null) {
                ((B4) a45).b("cc", "VAST Schema validation error: VAST node at appropriate hierarchy not found");
            }
            c(101);
        }
        return this.c;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:121:0x01ea
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void c(org.xmlpull.v1.XmlPullParser r28) {
        /*
            Method dump skipped, instructions count: 2318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1589cc.c(org.xmlpull.v1.XmlPullParser):void");
    }

    public final int d(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (IOException unused) {
            A4 a42 = this.f15006b;
            if (a42 != null) {
                ((B4) a42).b("cc", "Parsing failed.");
                return -1;
            }
            return -1;
        } catch (XmlPullParserException unused2) {
            A4 a43 = this.f15006b;
            if (a43 != null) {
                ((B4) a43).b("cc", "VAST Schema validation error: VAST node at appropriate hierarchy not found.");
                return -1;
            }
            return -1;
        }
    }

    public final void e(XmlPullParser xmlPullParser) {
        int d10 = d(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && kotlin.jvm.internal.g.a(xmlPullParser.getName(), "TrackingEvents") && b(d10)) {
                return;
            }
            if (xmlPullParser.getName() != null && kotlin.jvm.internal.g.a("Tracking", xmlPullParser.getName()) && !b(d10)) {
                int attributeCount = xmlPullParser.getAttributeCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= attributeCount) {
                        break;
                    } else if (kotlin.jvm.internal.g.a(xmlPullParser.getAttributeName(i10), "event")) {
                        String attributeValue = xmlPullParser.getAttributeValue(i10);
                        if (d(xmlPullParser) == 4) {
                            HashMap hashMap = f15004f;
                            if (hashMap.containsKey(attributeValue)) {
                                Object obj = hashMap.get(attributeValue);
                                kotlin.jvm.internal.g.b(obj);
                                String text = xmlPullParser.getText();
                                kotlin.jvm.internal.g.d(text, "getText(...)");
                                a((String) obj, text);
                            }
                        }
                    } else {
                        i10++;
                    }
                }
            }
            d10 = d(xmlPullParser);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x019d, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(org.xmlpull.v1.XmlPullParser r12) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1589cc.f(org.xmlpull.v1.XmlPullParser):void");
    }

    public final void b(XmlPullParser xmlPullParser) {
        int d10 = d(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && kotlin.jvm.internal.g.a(xmlPullParser.getName(), "Extensions") && b(d10)) {
                return;
            }
            if (xmlPullParser.getName() != null && !b(d10)) {
                String name = xmlPullParser.getName();
                if (kotlin.jvm.internal.g.a(name, "CompanionAdTracking")) {
                    int d11 = d(xmlPullParser);
                    while (true) {
                        if (xmlPullParser.getName() == null || !kotlin.jvm.internal.g.a(xmlPullParser.getName(), "CompanionAdTracking") || !b(d11)) {
                            if (xmlPullParser.getName() != null && !b(d11) && kotlin.jvm.internal.g.a("TrackingEvents", xmlPullParser.getName())) {
                                e(xmlPullParser);
                            }
                            d11 = d(xmlPullParser);
                        }
                    }
                } else if (kotlin.jvm.internal.g.a(name, "Extension") && kotlin.jvm.internal.g.a(xmlPullParser.getAttributeValue(null, "type"), "AdVerifications")) {
                    a(xmlPullParser);
                }
            }
            d10 = d(xmlPullParser);
        }
    }

    public final void a(XmlPullParser xmlPullParser, String str) {
        A4 a42 = this.f15006b;
        if (a42 != null) {
            ((B4) a42).c("cc", "name=".concat(str));
        }
        int i10 = 0;
        while (true) {
            try {
                i10 = xmlPullParser.next();
            } catch (IOException e10) {
                A4 a43 = this.f15006b;
                if (a43 != null) {
                    StringBuilder a10 = A5.a("cc", "TAG", "Parsing failed. ");
                    a10.append(Arrays.toString(e10.getStackTrace()));
                    ((B4) a43).b("cc", a10.toString());
                }
            } catch (XmlPullParserException e11) {
                A4 a44 = this.f15006b;
                if (a44 != null) {
                    StringBuilder a11 = A5.a("cc", "TAG", "VAST Schema validation error: VAST node at appropriate hierarchy not found. ");
                    a11.append(Arrays.toString(e11.getStackTrace()));
                    ((B4) a44).b("cc", a11.toString());
                }
            }
            if (i10 == 1) {
                return;
            }
            if (xmlPullParser.getName() != null && kotlin.jvm.internal.g.a(xmlPullParser.getName(), str)) {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0040, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(org.xmlpull.v1.XmlPullParser r10, java.lang.String[] r11) {
        /*
            r9 = this;
            java.lang.String r0 = "cc"
            r1 = 0
            r2 = r1
            r3 = r2
        L5:
            int r2 = r10.next()     // Catch: org.xmlpull.v1.XmlPullParserException -> La java.io.IOException -> L16
            goto L21
        La:
            com.inmobi.media.A4 r4 = r9.f15006b
            if (r4 == 0) goto L21
            com.inmobi.media.B4 r4 = (com.inmobi.media.B4) r4
            java.lang.String r5 = "VAST Schema validation error: VAST node at appropriate hierarchy not found."
            r4.b(r0, r5)
            goto L21
        L16:
            com.inmobi.media.A4 r4 = r9.f15006b
            if (r4 == 0) goto L21
            com.inmobi.media.B4 r4 = (com.inmobi.media.B4) r4
            java.lang.String r5 = "Parsing failed."
            r4.b(r0, r5)
        L21:
            r4 = 1
            if (r2 != r4) goto L25
            goto L42
        L25:
            java.lang.String r5 = r10.getName()
            if (r5 == 0) goto L40
            int r5 = r11.length
            r6 = r1
        L2d:
            if (r6 >= r5) goto L40
            r7 = r11[r6]
            java.lang.String r8 = r10.getName()
            boolean r7 = kotlin.jvm.internal.g.a(r8, r7)
            if (r7 == 0) goto L3d
            r3 = r4
            goto L40
        L3d:
            int r6 = r6 + 1
            goto L2d
        L40:
            if (r3 == 0) goto L5
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1589cc.a(org.xmlpull.v1.XmlPullParser, java.lang.String[]):void");
    }

    public final void a(XmlPullParser xmlPullParser, boolean z10) {
        String str;
        int d10 = d(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && kotlin.jvm.internal.g.a(xmlPullParser.getName(), "VideoClicks") && b(d10)) {
                return;
            }
            if (xmlPullParser.getName() != null && !b(d10)) {
                String name = xmlPullParser.getName();
                if (kotlin.jvm.internal.g.a(name, "ClickThrough")) {
                    if (!z10) {
                        return;
                    }
                    if (d(xmlPullParser) == 4) {
                        String text = xmlPullParser.getText();
                        if (text == null || text.length() == 0) {
                            str = null;
                        } else {
                            int length = text.length() - 1;
                            int i10 = 0;
                            boolean z11 = false;
                            while (i10 <= length) {
                                boolean z12 = kotlin.jvm.internal.g.f(text.charAt(!z11 ? i10 : length), 32) <= 0;
                                if (z11) {
                                    if (!z12) {
                                        break;
                                    }
                                    length--;
                                } else if (z12) {
                                    i10++;
                                } else {
                                    z11 = true;
                                }
                            }
                            str = C6.a(length, 1, text, i10);
                        }
                        this.c.f15151h = str;
                    }
                } else if (kotlin.jvm.internal.g.a(name, "ClickTracking") && d(xmlPullParser) == 4) {
                    String text2 = xmlPullParser.getText();
                    kotlin.jvm.internal.g.d(text2, "getText(...)");
                    a(C1646h.CLICK_BEACON, text2);
                }
            }
            d10 = d(xmlPullParser);
        }
    }

    public final void a(XmlPullParser xmlPullParser) {
        String attributeValue;
        int d10;
        int d11 = d(xmlPullParser);
        while (true) {
            if (xmlPullParser.getName() != null && kotlin.jvm.internal.g.a(xmlPullParser.getName(), "AdVerifications") && b(d11)) {
                return;
            }
            if (xmlPullParser.getName() != null && !b(d11) && kotlin.jvm.internal.g.a(xmlPullParser.getName(), "Verification") && (attributeValue = xmlPullParser.getAttributeValue(null, "vendor")) != null) {
                int d12 = d(xmlPullParser);
                String str = null;
                String str2 = null;
                while (true) {
                    if (xmlPullParser.getName() != null && kotlin.jvm.internal.g.a(xmlPullParser.getName(), "Verification") && b(d12)) {
                        break;
                    }
                    if (xmlPullParser.getName() != null && !b(d12)) {
                        String name = xmlPullParser.getName();
                        if (kotlin.jvm.internal.g.a(name, "JavaScriptResource")) {
                            String attributeValue2 = xmlPullParser.getAttributeValue(null, "apiFramework");
                            if (attributeValue2 != null && kotlin.text.j.M(attributeValue2, "omid", false) && d(xmlPullParser) == 4) {
                                String text = xmlPullParser.getText();
                                if (text == null || text.length() == 0) {
                                    str = null;
                                } else {
                                    int length = text.length() - 1;
                                    int i10 = 0;
                                    boolean z10 = false;
                                    while (i10 <= length) {
                                        boolean z11 = kotlin.jvm.internal.g.f(text.charAt(!z10 ? i10 : length), 32) <= 0;
                                        if (z10) {
                                            if (!z11) {
                                                break;
                                            }
                                            length--;
                                        } else if (z11) {
                                            i10++;
                                        } else {
                                            z10 = true;
                                        }
                                    }
                                    str = C6.a(length, 1, text, i10);
                                }
                            }
                        } else if (kotlin.jvm.internal.g.a(name, "VerificationParameters") && ((d10 = d(xmlPullParser)) == 4 || d10 == 5)) {
                            String text2 = xmlPullParser.getText();
                            if (text2 == null || text2.length() == 0) {
                                str2 = null;
                            } else {
                                String text3 = xmlPullParser.getText();
                                kotlin.jvm.internal.g.d(text3, "getText(...)");
                                str2 = kotlin.text.k.n0(text3).toString();
                            }
                        }
                    }
                    d12 = d(xmlPullParser);
                }
                if (URLUtil.isValidUrl(str)) {
                    kotlin.jvm.internal.g.b(str);
                    U8 u82 = new U8(attributeValue, str2, str, null);
                    C1659hc c1659hc = this.c;
                    c1659hc.getClass();
                    c1659hc.f15148e.add(u82);
                    A4 a42 = this.f15006b;
                    if (a42 != null) {
                        ((B4) a42).b("cc", "Omid JavaScript URL found inside VAST : ".concat(str));
                    }
                }
            }
            d11 = d(xmlPullParser);
        }
    }

    public final void a(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("[ERRORCODE]", String.valueOf(i10));
        Iterator it = this.c.f15148e.iterator();
        while (it.hasNext()) {
            P7 p72 = (P7) it.next();
            if (kotlin.jvm.internal.g.a("error", p72.c)) {
                Y1.f14860a.a(K8.a(p72.f14579e, hashMap), p72.f14578d, true, null, EnumC1765p9.c, this.f15006b);
            }
        }
    }

    public final void a(String str, String str2) {
        String a10;
        if (str2.length() == 0) {
            a10 = null;
        } else {
            int length = str2.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = kotlin.jvm.internal.g.f(str2.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    }
                    length--;
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            a10 = C6.a(length, 1, str2, i10);
        }
        if (!URLUtil.isValidUrl(a10)) {
            A4 a42 = this.f15006b;
            if (a42 != null) {
                ((B4) a42).b("cc", a6.h.d("Malformed URL ", a10, " Discarding this tracker"));
            }
            kotlin.jvm.internal.g.a(str, "Impression");
            return;
        }
        kotlin.jvm.internal.g.b(a10);
        P7 p72 = new P7(a10, 0, str, null);
        C1659hc c1659hc = this.c;
        c1659hc.getClass();
        c1659hc.f15148e.add(p72);
    }

    public final void c(int i10) {
        this.c.f15152i = i10;
        a(i10);
    }
}
