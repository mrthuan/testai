package com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.ROR.Qhi.cJ;
import com.bytedance.sdk.openadsdk.core.ROR.ac.Qhi;
import com.bytedance.sdk.openadsdk.core.ROR.cJ.ac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.hslf.record.SlideAtom;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: VastXmlPullParser.java */
/* loaded from: classes.dex */
public class Tgh extends com.bytedance.sdk.openadsdk.core.ROR.Qhi.cJ {
    public static final String ROR = null;

    public Tgh(Context context, int i10, int i11) {
        super(context, i10, i11);
    }

    private static List<com.bytedance.sdk.openadsdk.core.ROR.cJ.ac> CJ(String str) {
        return Qhi(str, false);
    }

    private void ac(String str) {
        com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi qhi;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        List singletonList = Collections.singletonList(new ac.Qhi(str).Qhi());
        if (this.Qhi > 0) {
            qhi = com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi.NO_ADS_VAST_RESPONSE;
        } else {
            qhi = com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi.UNDEFINED_ERROR;
        }
        com.bytedance.sdk.openadsdk.core.ROR.cJ.ac.Qhi(com.bytedance.sdk.openadsdk.core.ROR.cJ.ac.Qhi(singletonList, qhi, -1L, null), (ac.cJ) null);
    }

    public static int cJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return SlideAtom.USES_MASTER_SLIDE_ID;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return SlideAtom.USES_MASTER_SLIDE_ID;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.bytedance.sdk.openadsdk.core.ROR.Qhi.cJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.openadsdk.core.ROR.Qhi Qhi(java.lang.String r6, java.util.List<com.bytedance.sdk.openadsdk.core.ROR.cJ.ac> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "UTF-8"
            r1 = 0
            r5.f8951fl = r1
            android.content.Context r2 = r5.cJ
            r3 = 0
            if (r2 != 0) goto Le
            r6 = -1
            r5.f8951fl = r6
            return r3
        Le:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L18
            r6 = -2
            r5.f8951fl = r6
            return r3
        L18:
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            byte[] r6 = r6.getBytes(r0)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            org.xmlpull.v1.XmlPullParser r6 = android.util.Xml.newPullParser()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            java.lang.String r4 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r6.setFeature(r4, r1)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            r6.setInput(r2, r0)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            r6.nextTag()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            com.bytedance.sdk.openadsdk.core.ROR.Qhi r6 = r5.Qhi(r6, r7)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            r5.Qhi(r6)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L4a
            r2.close()     // Catch: java.io.IOException -> L3a
        L3a:
            return r6
        L3b:
            r6 = move-exception
            goto L4c
        L3d:
            r2 = r3
        L3e:
            r6 = -3
            r5.f8951fl = r6     // Catch: java.lang.Throwable -> L4a
            r5.Qhi(r3)     // Catch: java.lang.Throwable -> L4a
            if (r2 == 0) goto L49
            r2.close()     // Catch: java.io.IOException -> L49
        L49:
            return r3
        L4a:
            r6 = move-exception
            r3 = r2
        L4c:
            if (r3 == 0) goto L51
            r3.close()     // Catch: java.io.IOException -> L51
        L51:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi.Tgh.Qhi(java.lang.String, java.util.List):com.bytedance.sdk.openadsdk.core.ROR.Qhi");
    }

    /* compiled from: VastXmlPullParser.java */
    /* loaded from: classes.dex */
    public static class Qhi {
        String CJ;
        String Qhi;

        /* renamed from: ac  reason: collision with root package name */
        Qhi.cJ f8948ac;
        Qhi.EnumC0113Qhi cJ;

        /* renamed from: fl  reason: collision with root package name */
        final List<com.bytedance.sdk.openadsdk.core.ROR.cJ.ac> f8949fl = new ArrayList();
        final List<com.bytedance.sdk.openadsdk.core.ROR.cJ.ac> Tgh = new ArrayList();
        float ROR = Float.MIN_VALUE;

        public Qhi() {
        }

        public void Qhi(String str, Qhi.EnumC0113Qhi enumC0113Qhi, Qhi.cJ cJVar) {
            this.Qhi = str;
            this.cJ = enumC0113Qhi;
            this.f8948ac = cJVar;
        }

        public void cJ(String str) {
            this.Tgh.add(new ac.Qhi(str).Qhi());
        }

        public void Qhi(String str) {
            this.f8949fl.add(new ac.Qhi(str).Qhi());
        }

        public Qhi(String str, Qhi.EnumC0113Qhi enumC0113Qhi, Qhi.cJ cJVar) {
            Qhi(str, enumC0113Qhi, cJVar);
        }
    }

    public static String cJ(XmlPullParser xmlPullParser, String str) {
        String str2;
        String str3 = ROR;
        xmlPullParser.require(2, str3, str);
        if (xmlPullParser.next() == 4) {
            str2 = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            str2 = "";
        }
        xmlPullParser.require(3, str3, str);
        return str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r8.equals("TrackingEvents") == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0017, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.sdk.openadsdk.core.ROR.Qhi cJ(org.xmlpull.v1.XmlPullParser r18, java.util.List<com.bytedance.sdk.openadsdk.core.ROR.cJ.ac> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r0.Qhi
            r4 = 0
            r5 = 5
            if (r3 < r5) goto L10
            Qhi(r18)
            return r4
        L10:
            com.bytedance.sdk.openadsdk.core.ROR.fl r3 = new com.bytedance.sdk.openadsdk.core.ROR.fl
            r3.<init>(r4)
            r6 = r4
            r7 = r6
        L17:
            int r8 = r18.getEventType()
            java.lang.String r9 = "Wrapper"
            r10 = 3
            if (r8 != r10) goto L42
            java.lang.String r8 = r18.getName()
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L2b
            goto L42
        L2b:
            com.bytedance.sdk.openadsdk.core.ROR.Qhi r1 = r0.Qhi(r6, r2)
            if (r1 == 0) goto L41
            com.bytedance.sdk.openadsdk.core.ROR.ac r2 = r1.ac()
            if (r2 != 0) goto L3a
            r1.Qhi(r7)
        L3a:
            com.bytedance.sdk.openadsdk.core.ROR.fl r2 = r1.Qhi()
            r2.Qhi(r3)
        L41:
            return r1
        L42:
            r18.next()
            int r8 = r18.getEventType()
            r11 = 2
            if (r8 != r11) goto L17
            java.lang.String r8 = r18.getName()
            r8.getClass()
            int r12 = r8.hashCode()
            java.lang.String r13 = "ClickTracking"
            java.lang.String r14 = "Error"
            java.lang.String r15 = "VASTAdTagURI"
            r16 = -1
            switch(r12) {
                case -587420703: goto L96;
                case 67232232: goto L8d;
                case 611554000: goto L84;
                case 1150879268: goto L79;
                case 2107600959: goto L70;
                case 2114088489: goto L65;
                default: goto L62;
            }
        L62:
            r11 = r16
            goto L9e
        L65:
            java.lang.String r11 = "Impression"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L6e
            goto L62
        L6e:
            r11 = r5
            goto L9e
        L70:
            boolean r11 = r8.equals(r13)
            if (r11 != 0) goto L77
            goto L62
        L77:
            r11 = 4
            goto L9e
        L79:
            java.lang.String r11 = "CompanionAds"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L82
            goto L62
        L82:
            r11 = r10
            goto L9e
        L84:
            java.lang.String r12 = "TrackingEvents"
            boolean r12 = r8.equals(r12)
            if (r12 != 0) goto L9e
            goto L62
        L8d:
            boolean r11 = r8.equals(r14)
            if (r11 != 0) goto L94
            goto L62
        L94:
            r11 = 1
            goto L9e
        L96:
            boolean r11 = r8.equals(r15)
            if (r11 != 0) goto L9d
            goto L62
        L9d:
            r11 = 0
        L9e:
            switch(r11) {
                case 0: goto Ld4;
                case 1: goto Lc2;
                case 2: goto Lbd;
                case 3: goto Lb5;
                case 4: goto Lac;
                case 5: goto La3;
                default: goto La1;
            }
        La1:
            goto L17
        La3:
            java.util.List r8 = Qhi(r1, r8)
            r3.Qhi(r8)
            goto L17
        Lac:
            java.util.List r8 = Qhi(r1, r13)
            r3.ROR(r8)
            goto L17
        Lb5:
            android.content.Context r7 = r0.cJ
            com.bytedance.sdk.openadsdk.core.ROR.ac r7 = com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi.Qhi.Qhi(r7, r1)
            goto L17
        Lbd:
            com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi.ac.Qhi(r1, r3)
            goto L17
        Lc2:
            com.bytedance.sdk.openadsdk.core.ROR.cJ.ac$Qhi r8 = new com.bytedance.sdk.openadsdk.core.ROR.cJ.ac$Qhi
            java.lang.String r9 = cJ(r1, r14)
            r8.<init>(r9)
            com.bytedance.sdk.openadsdk.core.ROR.cJ.ac r8 = r8.Qhi()
            r2.add(r8)
            goto L17
        Ld4:
            java.lang.String r6 = cJ(r1, r15)
            java.lang.String r6 = r0.cJ(r6, r2)
            boolean r8 = android.text.TextUtils.isEmpty(r6)
            if (r8 == 0) goto L17
            Qhi(r1, r9, r10)
            r1 = -2
            r0.f8951fl = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.ROR.Qhi.Qhi.Tgh.cJ(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.ROR.Qhi");
    }

    private void Qhi(com.bytedance.sdk.openadsdk.core.ROR.Qhi qhi) {
        if (this.Tgh == null) {
            this.Tgh = new cJ.Qhi();
        }
        cJ.Qhi qhi2 = this.Tgh;
        qhi2.Qhi = this.f8951fl;
        qhi2.cJ = this.Qhi;
        if (qhi != null) {
            qhi2.f8952ac = qhi.Qhi().cJ.size() <= 0;
        }
    }

    private com.bytedance.sdk.openadsdk.core.ROR.Qhi Qhi(XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.ROR.cJ.ac> list) {
        xmlPullParser.require(2, ROR, "VAST");
        boolean z10 = false;
        String str = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if ("Error".equals(name)) {
                    str = cJ(xmlPullParser, name);
                } else if ("Ad".equals(name)) {
                    if (Qhi(xmlPullParser.getAttributeValue(ROR, "sequence"))) {
                        while (true) {
                            if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                break;
                            } else if (xmlPullParser.getEventType() == 2) {
                                String name2 = xmlPullParser.getName();
                                if ("InLine".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.ROR.Qhi Qhi2 = cJ.Qhi(this.cJ, xmlPullParser, list, this.f8950ac, this.CJ);
                                    if (Qhi2 != null) {
                                        if (TextUtils.isEmpty(Qhi2.ROR())) {
                                            this.f8951fl = -6;
                                            return null;
                                        }
                                        return Qhi2;
                                    }
                                } else if ("Wrapper".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.ROR.Qhi cJ = cJ(xmlPullParser, list);
                                    if (cJ != null) {
                                        return cJ;
                                    }
                                } else {
                                    Qhi(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        Qhi(xmlPullParser);
                    }
                    z10 = true;
                } else {
                    Qhi(xmlPullParser);
                }
            }
        }
        if (!z10) {
            this.f8951fl = -4;
            ac(str);
        }
        if (this.f8951fl == 0) {
            this.f8951fl = -5;
        }
        return null;
    }

    public static List<com.bytedance.sdk.openadsdk.core.ROR.cJ.ac> Qhi(XmlPullParser xmlPullParser, String str) {
        return CJ(cJ(xmlPullParser, str));
    }

    public static void Qhi(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    public static void Qhi(XmlPullParser xmlPullParser, String str, int i10) {
        while (xmlPullParser.getEventType() != 1) {
            if (str.equals(xmlPullParser.getName()) && xmlPullParser.getEventType() == i10) {
                return;
            }
            xmlPullParser.next();
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.ROR.cJ.ac> Qhi(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new ac.Qhi(str).Qhi(z10).Qhi());
    }
}
