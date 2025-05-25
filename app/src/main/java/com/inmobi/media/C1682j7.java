package com.inmobi.media;

import android.graphics.Point;
import android.webkit.URLUtil;
import com.adjust.sdk.Constants;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.j7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1682j7 {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f15215v = 0;

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f15216a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f15217b;
    public final boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15218d;

    /* renamed from: e  reason: collision with root package name */
    public final JSONObject f15219e;

    /* renamed from: f  reason: collision with root package name */
    public final C1570b7 f15220f;

    /* renamed from: g  reason: collision with root package name */
    public final JSONArray f15221g;

    /* renamed from: h  reason: collision with root package name */
    public C1682j7 f15222h;

    /* renamed from: i  reason: collision with root package name */
    public final HashMap f15223i;

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f15224j;

    /* renamed from: k  reason: collision with root package name */
    public final HashMap f15225k;

    /* renamed from: l  reason: collision with root package name */
    public final HashMap f15226l;

    /* renamed from: m  reason: collision with root package name */
    public C1659hc f15227m;

    /* renamed from: n  reason: collision with root package name */
    public final AdConfig f15228n;

    /* renamed from: o  reason: collision with root package name */
    public final A4 f15229o;

    /* renamed from: p  reason: collision with root package name */
    public final int f15230p;

    /* renamed from: q  reason: collision with root package name */
    public final C1668i7 f15231q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f15232r;

    /* renamed from: s  reason: collision with root package name */
    public C1893z8 f15233s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f15234t;

    /* renamed from: u  reason: collision with root package name */
    public final Map f15235u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1682j7(int i10, JSONObject pubContent, AdConfig adConfig, HashMap hashMap, C1659hc c1659hc, A4 a42) {
        this(i10, pubContent, null, false, adConfig, hashMap, c1659hc, a42);
        kotlin.jvm.internal.g.e(pubContent, "pubContent");
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
    }

    public static int a(int i10) {
        return (int) (AbstractC1692k3.b() * i10);
    }

    public static String j(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("assetType");
            kotlin.jvm.internal.g.b(string);
            return string;
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            return "";
        }
    }

    public static String k(JSONObject jSONObject) {
        try {
            if (kotlin.text.j.G(j(jSONObject), "ICON", true) || kotlin.text.j.G(j(jSONObject), "IMAGE", true) || kotlin.text.j.G(j(jSONObject), "GIF", true)) {
                String string = jSONObject.getJSONArray("assetValue").getString(0);
                kotlin.jvm.internal.g.d(string, "getString(...)");
                if (string.length() > 0) {
                    String string2 = jSONObject.getJSONArray("assetValue").getString(0);
                    kotlin.jvm.internal.g.d(string2, "getString(...)");
                    return string2;
                }
                return "";
            }
            return "";
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            return "";
        }
    }

    public static JSONArray l(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("assetValue");
            kotlin.jvm.internal.g.d(jSONArray, "getJSONArray(...)");
            return jSONArray;
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            return new JSONArray();
        }
    }

    public static String o(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("dataType");
            kotlin.jvm.internal.g.b(string);
            return string;
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            return "";
        }
    }

    public final C1570b7 b(int i10) {
        C1570b7 c1570b7 = this.f15220f;
        if (c1570b7 != null) {
            int i11 = 0;
            while (true) {
                if (!(i11 < c1570b7.B)) {
                    break;
                }
                try {
                    int i12 = i11 + 1;
                    W6 w62 = (W6) c1570b7.A.get(i11);
                    kotlin.jvm.internal.g.b(w62);
                    if (kotlin.text.j.G(w62.f14787b, "card_scrollable", true)) {
                        C1570b7 c1570b72 = w62 instanceof C1570b7 ? (C1570b7) w62 : null;
                        if (i10 >= (c1570b72 != null ? c1570b72.B : 0)) {
                            return null;
                        }
                        W6 w63 = (c1570b72 == null || i10 < 0 || i10 >= c1570b72.B) ? null : (W6) c1570b72.A.get(i10);
                        if (w63 instanceof C1570b7) {
                            return (C1570b7) w63;
                        }
                        return null;
                    }
                    i11 = i12;
                } catch (IndexOutOfBoundsException e10) {
                    throw new NoSuchElementException(e10.getMessage());
                }
            }
        }
        return null;
    }

    public final ArrayList c() {
        HashMap hashMap = this.f15224j;
        return new ArrayList(hashMap != null ? hashMap.keySet() : null);
    }

    public final int d() {
        C1570b7<W6> c1570b7 = this.f15220f;
        if (c1570b7 != null) {
            for (W6 w62 : c1570b7) {
                if (kotlin.text.j.G(w62.f14787b, "card_scrollable", true)) {
                    if (w62 instanceof C1570b7) {
                        return ((C1570b7) w62).B;
                    }
                    return 0;
                }
            }
            return 0;
        }
        return 0;
    }

    public final JSONObject e() {
        try {
            JSONArray jSONArray = this.f15221g;
            if (jSONArray != null) {
                return jSONArray.getJSONObject(0);
            }
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
        }
        return null;
    }

    public final boolean f() {
        C1570b7 c1570b7;
        C1570b7 c1570b72 = this.f15220f;
        if (c1570b72 == null) {
            A4 a42 = this.f15229o;
            if (a42 != null) {
                ((B4) a42).b("j7", "Invalid Data Model: No Root Container");
            }
        } else {
            Iterator it = c1570b72.iterator();
            while (true) {
                C1556a7 c1556a7 = (C1556a7) it;
                if (!c1556a7.hasNext()) {
                    break;
                }
                W6 w62 = (W6) c1556a7.next();
                if (kotlin.text.j.G(w62.f14787b, "card_scrollable", true)) {
                    if (w62 instanceof C1570b7) {
                        c1570b7 = (C1570b7) w62;
                    }
                }
            }
            c1570b7 = null;
            if (c1570b7 == null) {
                A4 a43 = this.f15229o;
                if (a43 != null) {
                    ((B4) a43).b("j7", "No Card Scrollable in the data model");
                }
                return g();
            } else if (d() <= 0) {
                A4 a44 = this.f15229o;
                if (a44 != null) {
                    ((B4) a44).b("j7", "Invalid Data Model: No Cards in Card Scrollable");
                }
            } else {
                return g();
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            r7 = this;
            java.lang.String r0 = "VIDEO"
            java.util.List r0 = r7.n(r0)
            r1 = 1
            if (r0 == 0) goto Lb1
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L11
            goto Lb1
        L11:
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb1
            java.lang.Object r2 = r0.next()
            com.inmobi.media.W6 r2 = (com.inmobi.media.W6) r2
            java.lang.String r3 = r2.f14786a
            int r3 = r3.length()
            java.lang.String r4 = "j7"
            if (r3 != 0) goto L36
            com.inmobi.media.A4 r3 = r7.f15229o
            if (r3 == 0) goto L36
            com.inmobi.media.B4 r3 = (com.inmobi.media.B4) r3
            java.lang.String r5 = "Video asset has invalid ID! CTA link resolution may not work"
            r3.b(r4, r5)
        L36:
            boolean r3 = r2 instanceof com.inmobi.media.W7
            r5 = 0
            if (r3 == 0) goto L3e
            com.inmobi.media.W7 r2 = (com.inmobi.media.W7) r2
            goto L3f
        L3e:
            r2 = r5
        L3f:
            if (r2 == 0) goto L46
            com.inmobi.media.ic r3 = r2.b()
            goto L47
        L46:
            r3 = r5
        L47:
            r6 = 0
            if (r3 != 0) goto L56
            com.inmobi.media.A4 r0 = r7.f15229o
            if (r0 == 0) goto L55
            com.inmobi.media.B4 r0 = (com.inmobi.media.B4) r0
            java.lang.String r1 = "No Vast XML. Discarding DataModel"
            r0.b(r4, r1)
        L55:
            return r6
        L56:
            com.inmobi.media.ic r3 = r2.b()
            if (r3 == 0) goto L61
            com.inmobi.media.hc r3 = (com.inmobi.media.C1659hc) r3
            java.util.ArrayList r3 = r3.f15146b
            goto L62
        L61:
            r3 = r5
        L62:
            if (r3 == 0) goto La5
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L6b
            goto La5
        L6b:
            com.inmobi.media.ic r3 = r2.b()
            if (r3 == 0) goto L78
            com.inmobi.media.hc r3 = (com.inmobi.media.C1659hc) r3
            java.lang.String r3 = r3.b()
            goto L79
        L78:
            r3 = r5
        L79:
            if (r3 == 0) goto L81
            int r3 = r3.length()
            if (r3 != 0) goto L15
        L81:
            com.inmobi.media.A4 r0 = r7.f15229o
            if (r0 == 0) goto L8c
            com.inmobi.media.B4 r0 = (com.inmobi.media.B4) r0
            java.lang.String r3 = "Invalid Media URL.Discarding the model"
            r0.b(r4, r3)
        L8c:
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.String r3 = "[ERRORCODE]"
            java.lang.String r4 = "403"
            r0.<init>(r3, r4)
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            r1[r6] = r0
            java.util.HashMap r0 = kotlin.collections.q.z0(r1)
            com.inmobi.media.A4 r1 = r7.f15229o
            java.lang.String r3 = "error"
            r2.a(r3, r0, r5, r1)
            return r6
        La5:
            com.inmobi.media.A4 r0 = r7.f15229o
            if (r0 == 0) goto Lb0
            com.inmobi.media.B4 r0 = (com.inmobi.media.B4) r0
            java.lang.String r1 = "No Media files. Discarding DataModel"
            r0.b(r4, r1)
        Lb0:
            return r6
        Lb1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1682j7.g():boolean");
    }

    public final void h() {
        C1668i7 c1668i7;
        C1654h7 c1654h7;
        C1668i7 c1668i72;
        try {
            JSONObject jSONObject = this.f15216a;
            if (jSONObject == null) {
                C1668i7 c1668i73 = this.f15231q;
                if (c1668i73 == null) {
                    return;
                }
                c1668i73.c = new W6((String) null, (String) null, (String) null, (X6) null, 31);
                return;
            }
            if (!jSONObject.isNull("passThroughJson") && (c1668i72 = this.f15231q) != null) {
                c1668i72.f15189a = jSONObject.getJSONObject("passThroughJson");
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("adContent");
            if (optJSONObject != null && (c1668i7 = this.f15231q) != null && (c1654h7 = c1668i7.f15190b) != null) {
                c1654h7.f15127a = optJSONObject.optString(InMobiNetworkValues.TITLE, null);
                c1654h7.f15128b = optJSONObject.optString(InMobiNetworkValues.DESCRIPTION, null);
                c1654h7.f15129d = optJSONObject.optString("ctaText", null);
                c1654h7.c = optJSONObject.optString("iconUrl", null);
                c1654h7.f15130e = (float) optJSONObject.optLong(InMobiNetworkValues.RATING, 0L);
                c1654h7.f15131f = optJSONObject.optString("landingPageUrl", null);
                c1654h7.f15132g = optJSONObject.optBoolean("isApp");
            }
            W6 w62 = new W6((String) null, (String) null, (String) null, (X6) null, 31);
            JSONObject optJSONObject2 = jSONObject.optJSONObject("onClick");
            if (optJSONObject2 != null) {
                try {
                    a(w62, optJSONObject2);
                } catch (JSONException unused) {
                    A4 a42 = this.f15229o;
                    if (a42 != null) {
                        ((B4) a42).b("j7", "JSONException in parsing click params for publisher CTA");
                    }
                }
                if (!optJSONObject2.isNull("openMode")) {
                    String string = optJSONObject2.getString("openMode");
                    kotlin.jvm.internal.g.b(string);
                    String b10 = b(string);
                    kotlin.jvm.internal.g.e(b10, "<set-?>");
                    w62.f14791g = b10;
                    String optString = optJSONObject2.optString("fallbackUrl");
                    kotlin.jvm.internal.g.d(optString, "optString(...)");
                    w62.a(optString);
                }
                w62.f14793i = optJSONObject2.optBoolean("supportLockScreen", false);
            }
            ArrayList i10 = i(jSONObject);
            if (i10 != null) {
                w62.f14803s.addAll(i10);
            }
            C1668i7 c1668i74 = this.f15231q;
            if (c1668i74 == null) {
                return;
            }
            c1668i74.c = w62;
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            A4 a43 = this.f15229o;
            if (a43 != null) {
                ((B4) a43).b("j7", "Exception in getting publisher values from JSON");
            }
        }
    }

    public final ArrayList i(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject.isNull(Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            jSONArray = jSONObject.getJSONArray(Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH);
            kotlin.jvm.internal.g.b(jSONArray);
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
        }
        if (AbstractC1579c2.a(jSONArray)) {
            return arrayList;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            if (!jSONObject2.isNull("trackerType")) {
                String string = jSONObject2.getString("trackerType");
                kotlin.jvm.internal.g.b(string);
                if (kotlin.jvm.internal.g.a("url_ping", k(string))) {
                    int optInt = jSONObject2.optInt("eventId", 0);
                    if (!jSONObject2.isNull("uiEvent")) {
                        String string2 = jSONObject2.getString("uiEvent");
                        kotlin.jvm.internal.g.b(string2);
                        String g10 = g(string2);
                        if (!kotlin.jvm.internal.g.a("unknown", g10)) {
                            if (!kotlin.jvm.internal.g.a("OMID_VIEWABILITY", g10)) {
                                P7 a10 = a(optInt, g10, jSONObject2);
                                if (a10 != null) {
                                    arrayList.add(a10);
                                }
                            } else {
                                arrayList.addAll(n(jSONObject2));
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final W6 m(String str) {
        HashMap hashMap;
        W6 w62;
        if (str == null || str.length() == 0) {
            return null;
        }
        HashMap hashMap2 = this.f15225k;
        if (hashMap2 == null || (w62 = (W6) hashMap2.get(str)) == null) {
            C1682j7 c1682j7 = this.f15222h;
            if (c1682j7 == null || (hashMap = c1682j7.f15225k) == null) {
                return null;
            }
            return (W6) hashMap.get(str);
        }
        return w62;
    }

    public final List n(String assetType) {
        ArrayList arrayList;
        kotlin.jvm.internal.g.e(assetType, "assetType");
        HashMap hashMap = this.f15224j;
        return (hashMap == null || (arrayList = (ArrayList) hashMap.get(assetType)) == null) ? EmptyList.INSTANCE : arrayList;
    }

    public final J7 p(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        long optLong = jSONObject.optLong("absolute");
        long optLong2 = jSONObject.optLong("percentage");
        String optString = jSONObject.optString("reference");
        kotlin.jvm.internal.g.b(optString);
        return new J7(optLong, optLong2, optString, this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1682j7(int i10, JSONObject pubContent, C1682j7 c1682j7, boolean z10, AdConfig adConfig, A4 a42) {
        this(i10, pubContent, c1682j7, z10, adConfig, c1682j7 != null ? c1682j7.f15235u : null, null, a42);
        kotlin.jvm.internal.g.e(pubContent, "pubContent");
        kotlin.jvm.internal.g.e(adConfig, "adConfig");
    }

    public static String c(JSONObject jSONObject) {
        try {
            JSONObject b10 = b(jSONObject);
            String string = b10.isNull("reference") ? "" : b10.getString("reference");
            kotlin.jvm.internal.g.b(string);
            return string;
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            return "";
        }
    }

    public final W6 a(C1682j7 c1682j7, W6 w62) {
        Object obj = w62.f14789e;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || str.length() == 0) {
            return null;
        }
        String[] strArr = (String[]) new Regex("\\|").split(str, 0).toArray(new String[0]);
        W6 m10 = c1682j7.m(strArr[0]);
        if (m10 == null) {
            C1682j7 c1682j72 = c1682j7.f15222h;
            if (c1682j72 == null) {
                return null;
            }
            return a(c1682j72, w62);
        } else if (kotlin.jvm.internal.g.a(m10, w62)) {
            return null;
        } else {
            if (strArr.length == 1) {
                m10.f14796l = (byte) 1;
                return m10;
            }
            m10.f14796l = AbstractC1640g7.a(strArr[1]);
            A4 a42 = this.f15229o;
            if (a42 != null) {
                ((B4) a42).a("j7", androidx.activity.r.g(A5.a("j7", "TAG", "Referenced asset ( "), m10.f14787b, " )"));
            }
            return m10;
        }
    }

    public static String m(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("valueType");
            kotlin.jvm.internal.g.b(string);
            return string;
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            return "";
        }
    }

    public final ArrayList n(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        try {
            HashMap hashMap = new HashMap();
            if (!jSONObject.isNull("macros")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("macros");
                Iterator<String> keys = jSONObject2.keys();
                kotlin.jvm.internal.g.b(keys);
                while (keys.hasNext()) {
                    String next = keys.next();
                    String string = jSONObject2.getString(next);
                    kotlin.jvm.internal.g.b(next);
                    kotlin.jvm.internal.g.b(string);
                    hashMap.put(next, string);
                }
            }
            JSONArray jSONArray = jSONObject.getJSONArray("adVerifications");
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i10);
                if (!jSONObject3.isNull(InMobiNetworkValues.URL)) {
                    String optString = jSONObject3.optString("vendor");
                    String optString2 = jSONObject3.optString("verificationParams");
                    String string2 = jSONObject3.getString(InMobiNetworkValues.URL);
                    kotlin.jvm.internal.g.b(optString);
                    kotlin.jvm.internal.g.b(string2);
                    arrayList.add(new U8(optString, optString2, string2, hashMap));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add(new P7("", 0, "OMID_VIEWABILITY", hashMap));
            }
        } catch (Exception e10) {
            A4 a42 = this.f15229o;
            if (a42 != null) {
                ((B4) a42).b("j7", Cc.a(e10, A5.a("j7", "TAG", "Failed to parse OMID tracker : ")));
            }
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1863x4.a(e10, "event"));
        }
        return arrayList;
    }

    public C1682j7(int i10, JSONObject jSONObject, C1682j7 c1682j7, boolean z10, AdConfig adConfig, Map map, C1659hc c1659hc, A4 a42) {
        byte h10;
        HashMap hashMap;
        W6 w62;
        W6 w63;
        InterfaceC1673ic b10;
        int i11;
        HashMap hashMap2;
        this.f15230p = i10;
        this.f15222h = c1682j7;
        this.f15228n = adConfig;
        this.f15216a = jSONObject;
        this.f15217b = (byte) 0;
        this.c = false;
        this.f15227m = c1659hc;
        this.f15225k = new HashMap();
        HashMap hashMap3 = new HashMap();
        this.f15226l = hashMap3;
        this.f15224j = new HashMap();
        this.f15231q = new C1668i7();
        this.f15234t = z10;
        this.f15235u = map;
        this.f15229o = a42;
        try {
            this.f15219e = jSONObject.optJSONObject("styleRefs");
            if (jSONObject.isNull("orientation")) {
                h10 = 0;
            } else {
                String string = jSONObject.getString("orientation");
                kotlin.jvm.internal.g.d(string, "getString(...)");
                h10 = h(string);
            }
            this.f15217b = h10;
            this.f15232r = jSONObject.optBoolean("shouldAutoOpenLandingPage", true);
            this.c = jSONObject.optBoolean("disableBackButton");
            JSONObject jSONObject2 = jSONObject.getJSONObject("rootContainer");
            kotlin.jvm.internal.g.b(jSONObject2);
            W6 a10 = a(jSONObject2, "CONTAINER", "/rootContainer");
            this.f15220f = a10 instanceof C1570b7 ? (C1570b7) a10 : null;
            h();
            this.f15218d = false;
            if (jSONObject.has("rewards")) {
                this.f15223i = new HashMap();
            }
            C1646h.Companion.getClass();
            if (jSONObject.has("rewards")) {
                hashMap = new HashMap();
                JSONObject optJSONObject = jSONObject.optJSONObject("rewards");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string2 = optJSONObject.getString(next);
                        kotlin.jvm.internal.g.b(next);
                        kotlin.jvm.internal.g.b(string2);
                        hashMap.put(next, string2);
                    }
                }
            } else {
                hashMap = null;
            }
            if (hashMap != null && (hashMap2 = this.f15223i) != null) {
                hashMap2.putAll(hashMap);
            }
            a();
            b();
            for (Map.Entry entry : hashMap3.entrySet()) {
                HashMap hashMap4 = this.f15225k;
                if (hashMap4 != null && (w62 = (W6) hashMap4.get(entry.getKey())) != null && 4 == w62.f14797m && (w62.f14798n != -1 || w62.f14799o != -1)) {
                    HashMap hashMap5 = this.f15225k;
                    if (hashMap5 != null && (w63 = (W6) hashMap5.get(entry.getValue())) != null && kotlin.jvm.internal.g.a("VIDEO", w63.c)) {
                        W7 w7 = w63 instanceof W7 ? (W7) w63 : null;
                        if (w7 != null && (b10 = w7.b()) != null) {
                            C1659hc c1659hc2 = b10 instanceof C1659hc ? (C1659hc) b10 : null;
                            if (c1659hc2 != null) {
                                try {
                                    i11 = c1659hc2.a();
                                } catch (ArrayIndexOutOfBoundsException e10) {
                                    Q4 q42 = Q4.f14590a;
                                    Q4.c.a(new J1(e10));
                                    i11 = 0;
                                }
                                if (i11 == 0) {
                                    w62.f14798n = 0;
                                } else {
                                    w62.f14798n = a(w62.f14798n, i11);
                                    w62.f14799o = a(w62.f14799o, i11);
                                }
                                ((W7) w63).f14809y.add(w62);
                            }
                        }
                    }
                }
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("pages");
            this.f15221g = optJSONArray == null ? new JSONArray() : optJSONArray;
        } catch (JSONException e11) {
            Q4 q43 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e11, "event"));
        }
    }

    public static String e(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("assetId");
            kotlin.jvm.internal.g.b(string);
            return string;
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            return String.valueOf(jSONObject.hashCode());
        }
    }

    public static String j(String str) {
        String str2;
        Locale locale = Locale.US;
        String e10 = a0.d.e(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = e10.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.g.f(e10.charAt(!z10 ? i10 : length), 32) <= 0;
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
        String a10 = C6.a(length, 1, e10, i10);
        switch (a10.hashCode()) {
            case -1178781136:
                str2 = "italic";
                if (!a10.equals("italic")) {
                    return "none";
                }
                break;
            case -1026963764:
                str2 = "underline";
                if (!a10.equals("underline")) {
                    return "none";
                }
                break;
            case -891985998:
                str2 = "strike";
                if (!a10.equals("strike")) {
                    return "none";
                }
                break;
            case 3029637:
                str2 = "bold";
                if (!a10.equals("bold")) {
                    return "none";
                }
                break;
            case 3387192:
                a10.equals("none");
                return "none";
            default:
                return "none";
        }
        return str2;
    }

    public static byte l(String str) {
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.g.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
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
        String a10 = C6.a(length, 1, str, i10);
        return (!kotlin.jvm.internal.g.a(a10, "absolute") && kotlin.jvm.internal.g.a(a10, "reference")) ? (byte) 1 : (byte) 0;
    }

    public static byte d(JSONObject jSONObject) {
        JSONObject b10;
        try {
            b10 = b(jSONObject);
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
        }
        if (b10.isNull("type")) {
            return (byte) 2;
        }
        String string = b10.getString("type");
        kotlin.jvm.internal.g.d(string, "getString(...)");
        return f(string);
    }

    public static String c(String str) {
        Locale locale = Locale.US;
        String e10 = a0.d.e(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = e10.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.g.f(e10.charAt(!z10 ? i10 : length), 32) <= 0;
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
        String a10 = C6.a(length, 1, e10, i10);
        switch (a10.hashCode()) {
            case -938102371:
                return !a10.equals(InMobiNetworkValues.RATING) ? "CONTAINER" : "RATING";
            case -410956671:
                a10.equals("container");
                return "CONTAINER";
            case 98832:
                return !a10.equals(InMobiNetworkValues.CTA) ? "CONTAINER" : "CTA";
            case 102340:
                return !a10.equals(ContentTypes.EXTENSION_GIF) ? "CONTAINER" : "GIF";
            case 3226745:
                return !a10.equals(InMobiNetworkValues.ICON) ? "CONTAINER" : "ICON";
            case 3556653:
                return !a10.equals("text") ? "CONTAINER" : "TEXT";
            case 100313435:
                return !a10.equals("image") ? "CONTAINER" : "IMAGE";
            case 110364485:
                return !a10.equals("timer") ? "CONTAINER" : "TIMER";
            case 112202875:
                return !a10.equals("video") ? "CONTAINER" : "VIDEO";
            case 1224424441:
                return !a10.equals("webview") ? "CONTAINER" : "WEBVIEW";
            default:
                return "CONTAINER";
        }
    }

    public static String k(String str) {
        Locale US = Locale.US;
        kotlin.jvm.internal.g.d(US, "US");
        String upperCase = str.toUpperCase(US);
        kotlin.jvm.internal.g.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        int length = upperCase.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.g.f(upperCase.charAt(!z10 ? i10 : length), 32) <= 0;
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
        String a10 = C6.a(length, 1, upperCase, i10);
        int hashCode = a10.hashCode();
        if (hashCode != -1430070305) {
            if (hashCode != -158113182) {
                if (hashCode == 1110926088 && a10.equals("URL_WEBVIEW_PING")) {
                    return "webview_ping";
                }
            } else if (a10.equals("URL_PING")) {
                return "url_ping";
            }
        } else if (a10.equals("HTML_SCRIPT")) {
            return "html_script";
        }
        return "unknown";
    }

    public static String e(String str) {
        Locale locale = Locale.US;
        String e10 = a0.d.e(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = e10.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.g.f(e10.charAt(!z10 ? i10 : length), 32) <= 0;
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
        String a10 = C6.a(length, 1, e10, i10);
        return (!kotlin.jvm.internal.g.a(a10, "none") && kotlin.jvm.internal.g.a(a10, "line")) ? "line" : "none";
    }

    public static String f(JSONObject jSONObject) {
        try {
            String string = jSONObject.getString("assetName");
            kotlin.jvm.internal.g.b(string);
            return string;
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            return "";
        }
    }

    public static String d(String str) {
        Locale locale = Locale.US;
        String e10 = a0.d.e(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = e10.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.g.f(e10.charAt(!z10 ? i10 : length), 32) <= 0;
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
        String a10 = C6.a(length, 1, e10, i10);
        return (!kotlin.jvm.internal.g.a(a10, "straight") && kotlin.jvm.internal.g.a(a10, "curved")) ? "curved" : "straight";
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
        if (android.webkit.URLUtil.isValidUrl(r7) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014a, code lost:
        r1 = ((com.inmobi.media.C1659hc) r6).f15149f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x014e, code lost:
        if (r1 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0150, code lost:
        r1 = r1.size();
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1682j7.b():void");
    }

    public static byte f(String str) {
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.g.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
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
        String a10 = C6.a(length, 1, str, i10);
        Locale locale = Locale.US;
        String e10 = a0.d.e(locale, "US", a10, locale, "this as java.lang.String).toLowerCase(locale)");
        int hashCode = e10.hashCode();
        if (hashCode == -921832806) {
            return !e10.equals("percentage") ? (byte) 1 : (byte) 4;
        } else if (hashCode != -284840886) {
            return (hashCode == 1728122231 && e10.equals("absolute")) ? (byte) 3 : (byte) 1;
        } else {
            e10.equals("unknown");
            return (byte) 1;
        }
    }

    public final Point g(JSONObject jSONObject) {
        JSONObject h10;
        Point point = new Point();
        try {
            h10 = h(jSONObject);
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
        }
        if (h10.isNull("geometry")) {
            return point;
        }
        JSONArray jSONArray = h10.getJSONArray("geometry");
        point.x = a(jSONArray.getInt(0));
        point.y = a(jSONArray.getInt(1));
        return point;
    }

    public static byte i(String str) {
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.g.f(str.charAt(!z10 ? i10 : length), 32) <= 0;
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
        String a10 = C6.a(length, 1, str, i10);
        return (!kotlin.jvm.internal.g.a(a10, "paged") && kotlin.jvm.internal.g.a(a10, "free")) ? (byte) 1 : (byte) 0;
    }

    public final void a() {
        ArrayList arrayList;
        for (W6 w62 : n("IMAGE")) {
            Object obj = w62.f14789e;
            if (!URLUtil.isValidUrl(obj instanceof String ? (String) obj : null)) {
                W6 a10 = a(this, w62);
                if (a10 == null) {
                    A4 a42 = this.f15229o;
                    if (a42 != null) {
                        ((B4) a42).b("j7", androidx.activity.r.f(A5.a("j7", "TAG", "Could not find referenced asset for asset ("), w62.f14787b, ')'));
                    }
                } else if (kotlin.jvm.internal.g.a(a10.c, w62.c)) {
                    w62.f14789e = a10.f14789e;
                } else if (kotlin.jvm.internal.g.a(a10.c, "VIDEO") && a10.f14796l == 1) {
                    A4 a43 = this.f15229o;
                    if (a43 != null) {
                        ((B4) a43).b("j7", "Image asset cannot reference a linear creative in a video element!");
                    }
                } else if (kotlin.jvm.internal.g.a(a10.c, "VIDEO") && a10.f14796l == 2) {
                    W7 w7 = a10 instanceof W7 ? (W7) a10 : null;
                    if (w7 != null) {
                        InterfaceC1673ic b10 = w7.b();
                        Yb a11 = Wb.a(w7, w62);
                        ArrayList<Xb> a12 = a11 != null ? a11.a(1) : null;
                        if (a12 != null) {
                            for (Xb xb2 : a12) {
                                if (URLUtil.isValidUrl(xb2.f14859b)) {
                                    break;
                                }
                            }
                        }
                        xb2 = null;
                        if (a11 != null && xb2 != null) {
                            if (b10 != null) {
                                ((C1659hc) b10).f15150g = a11;
                            }
                            A4 a44 = this.f15229o;
                            if (a44 != null) {
                                StringBuilder a13 = A5.a("j7", "TAG", "Setting image asset value: ");
                                a13.append(xb2.f14859b);
                                ((B4) a44).a("j7", a13.toString());
                            }
                            w62.f14789e = xb2.f14859b;
                            ArrayList trackers = a11.a("creativeView");
                            kotlin.jvm.internal.g.e(trackers, "trackers");
                            w62.f14803s.addAll(trackers);
                            ArrayList trackers2 = w7.f14803s;
                            kotlin.jvm.internal.g.e(trackers2, "trackers");
                            Iterator it = trackers2.iterator();
                            while (it.hasNext()) {
                                P7 p72 = (P7) it.next();
                                if (kotlin.jvm.internal.g.a("error", p72.c)) {
                                    w62.f14803s.add(p72);
                                }
                            }
                        } else if (((b10 == null || (arrayList = ((C1659hc) b10).f15149f) == null) ? -1 : arrayList.size()) > 0) {
                            w7.f14806v = 8;
                            w7.a("error", kotlin.collections.q.z0(new Pair("[ERRORCODE]", "601")), (F6) null, this.f15229o);
                            A4 a45 = this.f15229o;
                            if (a45 != null) {
                                ((B4) a45).b("j7", "Unable to find the best-fit companion ad! Returning ...");
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String g(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1682j7.g(java.lang.String):java.lang.String");
    }

    public final JSONObject h(JSONObject jSONObject) {
        JSONObject jSONObject2;
        try {
            JSONObject jSONObject3 = jSONObject.isNull("assetStyle") ? null : jSONObject.getJSONObject("assetStyle");
            if (jSONObject3 == null) {
                if (jSONObject.isNull("assetStyleRef")) {
                    jSONObject2 = new JSONObject();
                } else {
                    String string = jSONObject.getString("assetStyleRef");
                    JSONObject jSONObject4 = this.f15219e;
                    JSONObject optJSONObject = jSONObject4 != null ? jSONObject4.optJSONObject(string) : null;
                    if (optJSONObject != null) {
                        return optJSONObject;
                    }
                    jSONObject2 = new JSONObject();
                }
                return jSONObject2;
            }
            return jSONObject3;
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            return new JSONObject();
        }
    }

    public static byte h(String str) {
        Locale locale = Locale.US;
        String e10 = a0.d.e(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = e10.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.g.f(e10.charAt(!z10 ? i10 : length), 32) <= 0;
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
        String a10 = C6.a(length, 1, e10, i10);
        int hashCode = a10.hashCode();
        if (hashCode == -1626174665) {
            a10.equals("unspecified");
        } else if (hashCode != 729267099) {
            if (hashCode == 1430647483 && a10.equals("landscape")) {
                return (byte) 2;
            }
        } else if (a10.equals("portrait")) {
            return (byte) 1;
        }
        return (byte) 0;
    }

    public final H7 c(Point point, Point point2, Point point3, Point point4, JSONObject jSONObject) {
        JSONObject optJSONObject;
        String str;
        String str2;
        String a10;
        String str3;
        String str4;
        String str5;
        String str6;
        String a11;
        int i10;
        String a12;
        byte b10;
        String str7 = "straight";
        String str8 = "#ff000000";
        if (jSONObject.isNull("border") || (optJSONObject = jSONObject.optJSONObject("border")) == null || optJSONObject.isNull("style")) {
            str5 = "straight";
            str3 = "#ff000000";
            str4 = "none";
        } else {
            String string = optJSONObject.getString("style");
            kotlin.jvm.internal.g.d(string, "getString(...)");
            String e10 = e(string);
            if (!optJSONObject.isNull("corner")) {
                String string2 = optJSONObject.getString("corner");
                kotlin.jvm.internal.g.d(string2, "getString(...)");
                str7 = d(string2);
            }
            if (optJSONObject.isNull("color")) {
                str = e10;
                str2 = str7;
                a10 = "#ff000000";
            } else {
                String string3 = optJSONObject.getString("color");
                kotlin.jvm.internal.g.d(string3, "getString(...)");
                int length = string3.length() - 1;
                int i11 = 0;
                boolean z10 = false;
                while (true) {
                    str = e10;
                    if (i11 > length) {
                        str2 = str7;
                        break;
                    }
                    str2 = str7;
                    boolean z11 = kotlin.jvm.internal.g.f(string3.charAt(!z10 ? i11 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length--;
                    } else if (z11) {
                        i11++;
                    } else {
                        e10 = str;
                        str7 = str2;
                        z10 = true;
                    }
                    e10 = str;
                    str7 = str2;
                }
                a10 = C6.a(length, 1, string3, i11);
            }
            str3 = a10;
            str4 = str;
            str5 = str2;
        }
        if (jSONObject.isNull("backgroundColor")) {
            a11 = "#00000000";
            str6 = "#ff000000";
        } else {
            String string4 = jSONObject.getString("backgroundColor");
            kotlin.jvm.internal.g.d(string4, "getString(...)");
            int length2 = string4.length() - 1;
            boolean z12 = false;
            int i12 = 0;
            while (true) {
                if (i12 > length2) {
                    str6 = str8;
                    break;
                }
                str6 = str8;
                boolean z13 = kotlin.jvm.internal.g.f(string4.charAt(!z12 ? i12 : length2), 32) <= 0;
                if (z12) {
                    if (!z13) {
                        break;
                    }
                    length2--;
                } else if (z13) {
                    i12++;
                } else {
                    str8 = str6;
                    z12 = true;
                }
                str8 = str6;
            }
            a11 = C6.a(length2, 1, string4, i12);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("text");
        try {
            String string5 = jSONObject2.getString("size");
            kotlin.jvm.internal.g.d(string5, "getString(...)");
            int parseDouble = (int) Double.parseDouble(string5);
            if (!jSONObject2.isNull("length")) {
                String string6 = jSONObject2.getString("length");
                kotlin.jvm.internal.g.d(string6, "getString(...)");
                Integer.parseInt(string6);
            }
            if (jSONObject2.isNull("color")) {
                a12 = str6;
                i10 = parseDouble;
            } else {
                String string7 = jSONObject2.getString("color");
                kotlin.jvm.internal.g.d(string7, "getString(...)");
                int length3 = string7.length() - 1;
                boolean z14 = false;
                int i13 = 0;
                while (true) {
                    if (i13 > length3) {
                        i10 = parseDouble;
                        break;
                    }
                    i10 = parseDouble;
                    boolean z15 = kotlin.jvm.internal.g.f(string7.charAt(!z14 ? i13 : length3), 32) <= 0;
                    if (z14) {
                        if (!z15) {
                            break;
                        }
                        length3--;
                    } else if (z15) {
                        i13++;
                    } else {
                        parseDouble = i10;
                        z14 = true;
                    }
                    parseDouble = i10;
                }
                a12 = C6.a(length3, 1, string7, i13);
            }
            ArrayList arrayList = new ArrayList();
            if (jSONObject2.isNull("style")) {
                arrayList.add("none");
            } else {
                int length4 = jSONObject2.getJSONArray("style").length();
                if (length4 == 0) {
                    arrayList.add("none");
                } else {
                    for (int i14 = 0; i14 < length4; i14++) {
                        String string8 = jSONObject2.getJSONArray("style").getString(i14);
                        kotlin.jvm.internal.g.d(string8, "getString(...)");
                        arrayList.add(j(string8));
                    }
                }
            }
            if (!jSONObject2.isNull("align")) {
                String string9 = jSONObject2.getString("align");
                kotlin.jvm.internal.g.d(string9, "getString(...)");
                int length5 = string9.length() - 1;
                boolean z16 = false;
                int i15 = 0;
                while (i15 <= length5) {
                    boolean z17 = kotlin.jvm.internal.g.f(string9.charAt(!z16 ? i15 : length5), 32) <= 0;
                    if (z16) {
                        if (!z17) {
                            break;
                        }
                        length5--;
                    } else if (z17) {
                        i15++;
                    } else {
                        z16 = true;
                    }
                }
                String a13 = C6.a(length5, 1, string9, i15);
                int hashCode = a13.hashCode();
                if (hashCode != -1364013605) {
                    if (hashCode == 3317767) {
                        a13.equals("left");
                    } else if (hashCode == 108511772 && a13.equals("right")) {
                        b10 = 1;
                    }
                } else if (a13.equals("centre")) {
                    b10 = 2;
                }
                return new H7(point.x, point.y, point2.x, point2.y, point3.x, point3.y, point4.x, point4.y, str4, str5, str3, a11, i10, b10, a12, arrayList, new K7(p(jSONObject.optJSONObject("startOffset")), p(jSONObject.optJSONObject("timerDuration"))));
            }
            b10 = 0;
            return new H7(point.x, point.y, point2.x, point2.y, point3.x, point3.y, point4.x, point4.y, str4, str5, str3, a11, i10, b10, a12, arrayList, new K7(p(jSONObject.optJSONObject("startOffset")), p(jSONObject.optJSONObject("timerDuration"))));
        } catch (NumberFormatException e11) {
            A4 a42 = this.f15229o;
            if (a42 != null) {
                ((B4) a42).b("j7", "Failure in building text asset! Text size should be an integer");
            }
            JSONException jSONException = new JSONException(e11.getMessage());
            Q4 q42 = Q4.f14590a;
            Q4.c.a(new J1(e11));
            throw jSONException;
        }
    }

    public static int a(int i10, int i11) {
        if (i10 == -1 || i10 == 0) {
            return i10;
        }
        if (i10 != 25) {
            if (i10 != 50) {
                if (i10 != 75) {
                    return i10 != 100 ? i11 / 4 : i11;
                }
                return (i11 * 3) / 4;
            }
            return i11 / 2;
        }
        return i11 / 4;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:348:0x0724
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final com.inmobi.media.W6 a(org.json.JSONObject r52, java.lang.String r53, java.lang.String r54) {
        /*
            Method dump skipped, instructions count: 2394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1682j7.a(org.json.JSONObject, java.lang.String, java.lang.String):com.inmobi.media.W6");
    }

    public final void b(W6 w62, JSONObject jSONObject) {
        String str;
        boolean z10 = true;
        String str2 = "";
        boolean z11 = false;
        if (!jSONObject.isNull("assetOnclick")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("assetOnclick");
            if (optJSONObject != null && !optJSONObject.isNull("itemUrl")) {
                str = jSONObject.getJSONObject("assetOnclick").getString("itemUrl");
                kotlin.jvm.internal.g.d(str, "getString(...)");
                z11 = true;
            } else {
                A4 a42 = this.f15229o;
                if (a42 != null) {
                    ((B4) a42).b("j7", "Missing itemUrl on asset " + jSONObject);
                }
                str = "";
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("assetOnclick");
            if (optJSONObject2 == null || !optJSONObject2.isNull("action")) {
                str2 = jSONObject.getJSONObject("assetOnclick").getString("action");
                kotlin.jvm.internal.g.d(str2, "getString(...)");
                w62.b(str);
                w62.f14792h = str2;
                w62.f14790f = z10;
            }
        } else {
            str = "";
        }
        z10 = z11;
        w62.b(str);
        w62.f14792h = str2;
        w62.f14790f = z10;
    }

    public final Point b(JSONObject jSONObject, Point point) {
        try {
            JSONObject h10 = h(jSONObject);
            if (h10.isNull("finalGeometry")) {
                return point;
            }
            JSONArray jSONArray = h10.getJSONArray("finalGeometry");
            Point point2 = new Point();
            point2.x = a(jSONArray.getInt(0));
            point2.y = a(jSONArray.getInt(1));
            return point2;
        } catch (JSONException unused) {
            return point;
        }
    }

    public static JSONObject b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        try {
            if (jSONObject.isNull("display")) {
                jSONObject2 = new JSONObject();
            } else {
                jSONObject2 = jSONObject.getJSONObject("display");
            }
            kotlin.jvm.internal.g.b(jSONObject2);
            return jSONObject2;
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            return new JSONObject();
        }
    }

    public static String b(String str) {
        Locale US = Locale.US;
        kotlin.jvm.internal.g.d(US, "US");
        String upperCase = str.toUpperCase(US);
        kotlin.jvm.internal.g.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        int length = upperCase.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.g.f(upperCase.charAt(!z10 ? i10 : length), 32) <= 0;
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
        String a10 = C6.a(length, 1, upperCase, i10);
        switch (a10.hashCode()) {
            case -2084521848:
                if (a10.equals("DOWNLOAD")) {
                    return a10;
                }
                break;
            case -1038134325:
                if (a10.equals("EXTERNAL")) {
                    return a10;
                }
                break;
            case 69805756:
                if (a10.equals("INAPP")) {
                    return a10;
                }
                break;
            case 1411860198:
                if (a10.equals("DEEPLINK")) {
                    return a10;
                }
                break;
            case 1568475786:
                if (a10.equals("EMBEDDED")) {
                    return a10;
                }
                break;
        }
        return "EXTERNAL";
    }

    public final C1612e7 b(Point point, Point point2, Point point3, Point point4, JSONObject jSONObject) {
        JSONObject optJSONObject;
        String str;
        String str2;
        String a10;
        String str3;
        String str4;
        String str5;
        String str6;
        String a11;
        int i10;
        String a12;
        String str7 = "straight";
        String str8 = "#ff000000";
        if (jSONObject.isNull("border") || (optJSONObject = jSONObject.optJSONObject("border")) == null || optJSONObject.isNull("style")) {
            str5 = "straight";
            str3 = "#ff000000";
            str4 = "none";
        } else {
            String string = optJSONObject.getString("style");
            kotlin.jvm.internal.g.d(string, "getString(...)");
            String e10 = e(string);
            if (!optJSONObject.isNull("corner")) {
                String string2 = optJSONObject.getString("corner");
                kotlin.jvm.internal.g.d(string2, "getString(...)");
                str7 = d(string2);
            }
            if (optJSONObject.isNull("color")) {
                str = e10;
                str2 = str7;
                a10 = "#ff000000";
            } else {
                String string3 = optJSONObject.getString("color");
                kotlin.jvm.internal.g.d(string3, "getString(...)");
                int length = string3.length() - 1;
                int i11 = 0;
                boolean z10 = false;
                while (true) {
                    str = e10;
                    if (i11 > length) {
                        str2 = str7;
                        break;
                    }
                    str2 = str7;
                    boolean z11 = kotlin.jvm.internal.g.f(string3.charAt(!z10 ? i11 : length), 32) <= 0;
                    if (z10) {
                        if (!z11) {
                            break;
                        }
                        length--;
                    } else if (z11) {
                        i11++;
                    } else {
                        e10 = str;
                        str7 = str2;
                        z10 = true;
                    }
                    e10 = str;
                    str7 = str2;
                }
                a10 = C6.a(length, 1, string3, i11);
            }
            str3 = a10;
            str4 = str;
            str5 = str2;
        }
        if (jSONObject.isNull("backgroundColor")) {
            a11 = "#00000000";
            str6 = "#ff000000";
        } else {
            String string4 = jSONObject.getString("backgroundColor");
            kotlin.jvm.internal.g.d(string4, "getString(...)");
            int length2 = string4.length() - 1;
            boolean z12 = false;
            int i12 = 0;
            while (true) {
                if (i12 > length2) {
                    str6 = str8;
                    break;
                }
                str6 = str8;
                boolean z13 = kotlin.jvm.internal.g.f(string4.charAt(!z12 ? i12 : length2), 32) <= 0;
                if (z12) {
                    if (!z13) {
                        break;
                    }
                    length2--;
                } else if (z13) {
                    i12++;
                } else {
                    str8 = str6;
                    z12 = true;
                }
                str8 = str6;
            }
            a11 = C6.a(length2, 1, string4, i12);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("text");
        try {
            String string5 = jSONObject2.getString("size");
            kotlin.jvm.internal.g.d(string5, "getString(...)");
            int parseDouble = (int) Double.parseDouble(string5);
            if (jSONObject2.isNull("color")) {
                a12 = str6;
                i10 = parseDouble;
            } else {
                String string6 = jSONObject2.getString("color");
                kotlin.jvm.internal.g.d(string6, "getString(...)");
                int length3 = string6.length() - 1;
                boolean z14 = false;
                int i13 = 0;
                while (true) {
                    if (i13 > length3) {
                        i10 = parseDouble;
                        break;
                    }
                    i10 = parseDouble;
                    boolean z15 = kotlin.jvm.internal.g.f(string6.charAt(!z14 ? i13 : length3), 32) <= 0;
                    if (z14) {
                        if (!z15) {
                            break;
                        }
                        length3--;
                    } else if (z15) {
                        i13++;
                    } else {
                        parseDouble = i10;
                        z14 = true;
                    }
                    parseDouble = i10;
                }
                a12 = C6.a(length3, 1, string6, i13);
            }
            ArrayList arrayList = new ArrayList();
            if (jSONObject2.isNull("style")) {
                arrayList.add("none");
            } else {
                int length4 = jSONObject2.getJSONArray("style").length();
                if (length4 == 0) {
                    arrayList.add("none");
                } else {
                    for (int i14 = 0; i14 < length4; i14++) {
                        String string7 = jSONObject2.getJSONArray("style").getString(i14);
                        kotlin.jvm.internal.g.d(string7, "getString(...)");
                        arrayList.add(j(string7));
                    }
                }
            }
            return new C1612e7(point.x, point.y, point2.x, point2.y, point3.x, point3.y, point4.x, point4.y, str4, str5, str3, a11, i10, a12, arrayList, new K7(p(jSONObject.optJSONObject("startOffset")), p(jSONObject.optJSONObject("timerDuration"))));
        } catch (NumberFormatException e11) {
            A4 a42 = this.f15229o;
            if (a42 != null) {
                ((B4) a42).b("j7", "Failure in building text asset! Text size should be an integer");
            }
            JSONException jSONException = new JSONException(e11.getMessage());
            Q4 q42 = Q4.f14590a;
            Q4.c.a(new J1(e11));
            throw jSONException;
        }
    }

    public final void a(W6 w62, JSONObject jSONObject) {
        String string;
        boolean z10;
        boolean z11 = true;
        String str = "";
        if (jSONObject.isNull("itemUrl")) {
            A4 a42 = this.f15229o;
            if (a42 != null) {
                ((B4) a42).b("j7", "Missing itemUrl on publisher onClick");
            }
            z10 = false;
            string = "";
        } else {
            string = jSONObject.getString("itemUrl");
            kotlin.jvm.internal.g.d(string, "getString(...)");
            z10 = true;
        }
        if (jSONObject.isNull("action")) {
            z11 = z10;
        } else {
            str = jSONObject.getString("action");
            kotlin.jvm.internal.g.d(str, "getString(...)");
        }
        w62.b(string);
        String optString = jSONObject.optString("fallbackUrl");
        kotlin.jvm.internal.g.d(optString, "optString(...)");
        w62.a(optString);
        w62.f14792h = str;
        w62.f14790f = z11;
        w62.f14805u = jSONObject.optString("appBundleId");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0080 A[Catch: JSONException -> 0x00cb, TRY_LEAVE, TryCatch #1 {JSONException -> 0x00cb, blocks: (B:5:0x000d, B:10:0x0022, B:11:0x0026, B:13:0x002b, B:16:0x0035, B:19:0x003f, B:22:0x0049, B:25:0x0053, B:37:0x0079, B:40:0x0080, B:41:0x0084, B:46:0x0098, B:48:0x009c, B:49:0x00a5, B:28:0x005d, B:31:0x0067, B:34:0x0070, B:51:0x00b2, B:56:0x00be, B:7:0x0015), top: B:63:0x000d, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.lang.String r6, org.json.JSONObject r7) {
        /*
            r5 = this;
            java.lang.String r0 = "text"
            java.lang.String r1 = "geometry"
            boolean r2 = r7.isNull(r1)
            r3 = 0
            if (r2 == 0) goto Ld
            goto Ld9
        Ld:
            org.json.JSONArray r1 = r7.getJSONArray(r1)     // Catch: org.json.JSONException -> Lcb
            kotlin.jvm.internal.g.b(r1)     // Catch: org.json.JSONException -> Lcb
            r2 = 2
            int r2 = r1.getInt(r2)     // Catch: org.json.JSONException -> Lbd
            r4 = 3
            int r1 = r1.getInt(r4)     // Catch: org.json.JSONException -> Lbd
            if (r2 <= 0) goto Lca
            if (r1 <= 0) goto Lca
            int r1 = r6.hashCode()     // Catch: org.json.JSONException -> Lcb
            switch(r1) {
                case -1919329183: goto Lb2;
                case 67056: goto L70;
                case 70564: goto L67;
                case 2241657: goto L5d;
                case 2571565: goto L53;
                case 69775675: goto L49;
                case 79826725: goto L3f;
                case 81665115: goto L35;
                case 1942407129: goto L2b;
                default: goto L29;
            }     // Catch: org.json.JSONException -> Lcb
        L29:
            goto Ld9
        L2b:
            java.lang.String r7 = "WEBVIEW"
            boolean r6 = r6.equals(r7)     // Catch: org.json.JSONException -> Lcb
            if (r6 == 0) goto Ld9
            goto Lbb
        L35:
            java.lang.String r7 = "VIDEO"
            boolean r6 = r6.equals(r7)     // Catch: org.json.JSONException -> Lcb
            if (r6 != 0) goto Lbb
            goto Ld9
        L3f:
            java.lang.String r7 = "TIMER"
            boolean r6 = r6.equals(r7)     // Catch: org.json.JSONException -> Lcb
            if (r6 != 0) goto Lbb
            goto Ld9
        L49:
            java.lang.String r7 = "IMAGE"
            boolean r6 = r6.equals(r7)     // Catch: org.json.JSONException -> Lcb
            if (r6 != 0) goto Lbb
            goto Ld9
        L53:
            java.lang.String r1 = "TEXT"
            boolean r6 = r6.equals(r1)     // Catch: org.json.JSONException -> Lcb
            if (r6 != 0) goto L79
            goto Ld9
        L5d:
            java.lang.String r7 = "ICON"
            boolean r6 = r6.equals(r7)     // Catch: org.json.JSONException -> Lcb
            if (r6 != 0) goto Lbb
            goto Ld9
        L67:
            java.lang.String r7 = "GIF"
            boolean r6 = r6.equals(r7)     // Catch: org.json.JSONException -> Lcb
            if (r6 != 0) goto Lbb
            goto Ld9
        L70:
            java.lang.String r1 = "CTA"
            boolean r6 = r6.equals(r1)     // Catch: org.json.JSONException -> Lcb
            if (r6 != 0) goto L79
            goto Ld9
        L79:
            boolean r6 = r7.isNull(r0)     // Catch: org.json.JSONException -> Lcb
            if (r6 == 0) goto L80
            return r3
        L80:
            org.json.JSONObject r6 = r7.getJSONObject(r0)     // Catch: org.json.JSONException -> Lcb
            java.lang.String r7 = "size"
            java.lang.String r6 = r6.getString(r7)     // Catch: java.lang.NumberFormatException -> L97 org.json.JSONException -> Lcb
            java.lang.String r7 = "getString(...)"
            kotlin.jvm.internal.g.d(r6, r7)     // Catch: java.lang.NumberFormatException -> L97 org.json.JSONException -> Lcb
            double r6 = java.lang.Double.parseDouble(r6)     // Catch: java.lang.NumberFormatException -> L97 org.json.JSONException -> Lcb
            int r6 = (int) r6
            if (r6 <= 0) goto Ld9
            goto Lbb
        L97:
            r6 = move-exception
            com.inmobi.media.A4 r7 = r5.f15229o     // Catch: org.json.JSONException -> Lcb
            if (r7 == 0) goto La5
            java.lang.String r0 = "j7"
            java.lang.String r1 = "Failure in validating text asset! Text size should be an integer"
            com.inmobi.media.B4 r7 = (com.inmobi.media.B4) r7     // Catch: org.json.JSONException -> Lcb
            r7.b(r0, r1)     // Catch: org.json.JSONException -> Lcb
        La5:
            com.inmobi.media.Q4 r7 = com.inmobi.media.Q4.f14590a     // Catch: org.json.JSONException -> Lcb
            com.inmobi.media.J1 r7 = new com.inmobi.media.J1     // Catch: org.json.JSONException -> Lcb
            r7.<init>(r6)     // Catch: org.json.JSONException -> Lcb
            com.inmobi.media.y5 r6 = com.inmobi.media.Q4.c     // Catch: org.json.JSONException -> Lcb
            r6.a(r7)     // Catch: org.json.JSONException -> Lcb
            return r3
        Lb2:
            java.lang.String r7 = "CONTAINER"
            boolean r6 = r6.equals(r7)     // Catch: org.json.JSONException -> Lcb
            if (r6 != 0) goto Lbb
            goto Ld9
        Lbb:
            r3 = 1
            goto Ld9
        Lbd:
            r6 = move-exception
            com.inmobi.media.Q4 r7 = com.inmobi.media.Q4.f14590a     // Catch: org.json.JSONException -> Lcb
            com.inmobi.media.J1 r7 = new com.inmobi.media.J1     // Catch: org.json.JSONException -> Lcb
            r7.<init>(r6)     // Catch: org.json.JSONException -> Lcb
            com.inmobi.media.y5 r6 = com.inmobi.media.Q4.c     // Catch: org.json.JSONException -> Lcb
            r6.a(r7)     // Catch: org.json.JSONException -> Lcb
        Lca:
            return r3
        Lcb:
            r6 = move-exception
            com.inmobi.media.Q4 r7 = com.inmobi.media.Q4.f14590a
            java.lang.String r7 = "event"
            com.inmobi.media.J1 r6 = com.inmobi.media.AbstractC1675j0.a(r6, r7)
            com.inmobi.media.y5 r7 = com.inmobi.media.Q4.c
            r7.a(r6)
        Ld9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1682j7.a(java.lang.String, org.json.JSONObject):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x015b, code lost:
        if (r11.equals("load") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0164, code lost:
        if (r11.equals("client_fill") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0172, code lost:
        if (r11.equals("complete") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x017b, code lost:
        if (r11.equals("unmute") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0184, code lost:
        if (r11.equals("resume") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x018d, code lost:
        if (r11.equals("thirdQuartile") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0196, code lost:
        if (r11.equals("midpoint") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0199, code lost:
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0140, code lost:
        if (r11.equals("error") == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0149, code lost:
        if (r11.equals(com.inmobi.media.C1646h.CLICK_BEACON) == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0152, code lost:
        if (r11.equals("mute") == false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.inmobi.media.P7 a(int r18, java.lang.String r19, org.json.JSONObject r20) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1682j7.a(int, java.lang.String, org.json.JSONObject):com.inmobi.media.P7");
    }

    public final InterfaceC1673ic a(JSONObject jSONObject, String str, W6 w62) {
        AdConfig.VastVideoConfig vastVideo;
        if (kotlin.text.j.G(j(jSONObject), "VIDEO", true)) {
            try {
                if (jSONObject.isNull("assetValue")) {
                    return null;
                }
                if (w62 instanceof W7) {
                    Object obj = ((W7) w62).f14789e;
                    if (obj instanceof InterfaceC1673ic) {
                        return (InterfaceC1673ic) obj;
                    }
                    return null;
                }
                AdConfig adConfig = this.f15228n;
                if (adConfig == null || (vastVideo = adConfig.getVastVideo()) == null) {
                    return null;
                }
                return new C1589cc(vastVideo, this.f15229o).a(str);
            } catch (JSONException e10) {
                Q4 q42 = Q4.f14590a;
                Q4.c.a(AbstractC1675j0.a(e10, "event"));
            }
        }
        return null;
    }

    public final Point a(JSONObject jSONObject) {
        JSONObject h10;
        Point point = new Point();
        try {
            h10 = h(jSONObject);
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
        }
        if (h10.isNull("geometry")) {
            return point;
        }
        JSONArray jSONArray = h10.getJSONArray("geometry");
        point.x = a(jSONArray.getInt(2));
        point.y = a(jSONArray.getInt(3));
        return point;
    }

    public final Point a(JSONObject jSONObject, Point point) {
        try {
            JSONObject h10 = h(jSONObject);
            if (h10.isNull("finalGeometry")) {
                return point;
            }
            JSONArray jSONArray = h10.getJSONArray("finalGeometry");
            Point point2 = new Point();
            point2.x = a(jSONArray.getInt(2));
            point2.y = a(jSONArray.getInt(3));
            return point2;
        } catch (JSONException unused) {
            return point;
        }
    }

    public static int a(JSONObject jSONObject, boolean z10) {
        try {
            JSONObject b10 = b(jSONObject);
            String str = z10 ? "delay" : "hideAfterDelay";
            if (b10.isNull(str)) {
                return -1;
            }
            int i10 = b10.getInt(str);
            if (3 != d(jSONObject)) {
                if (4 != d(jSONObject)) {
                    return -1;
                }
                if (i10 != 0) {
                    if (1 > i10 || i10 >= 101) {
                        return -1;
                    }
                    int[] iArr = {25, 50, 75, 100};
                    double d10 = Double.MAX_VALUE;
                    int i11 = -1;
                    for (int i12 = 0; i12 < 4; i12++) {
                        int i13 = i10 - iArr[i12];
                        double d11 = i13 * i13;
                        if (d11 < d10) {
                            i11 = i12;
                            d10 = d11;
                        }
                    }
                    return iArr[i11];
                }
            }
            return i10;
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            return -1;
        }
    }

    public static byte a(String str) {
        Locale US = Locale.US;
        kotlin.jvm.internal.g.d(US, "US");
        String upperCase = str.toUpperCase(US);
        kotlin.jvm.internal.g.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        int length = upperCase.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = kotlin.jvm.internal.g.f(upperCase.charAt(!z10 ? i10 : length), 32) <= 0;
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
        String a10 = C6.a(length, 1, upperCase, i10);
        return (!kotlin.jvm.internal.g.a(a10, "NONE") && kotlin.jvm.internal.g.a(a10, "EXIT")) ? (byte) 1 : (byte) 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x013c, code lost:
        if (r6.equals("aspectFill") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0143, code lost:
        if (r6.equals("fill") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x014c, code lost:
        if (r6.equals("aspectFit") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014f, code lost:
        r25 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.inmobi.media.X6 a(android.graphics.Point r32, android.graphics.Point r33, android.graphics.Point r34, android.graphics.Point r35, org.json.JSONObject r36) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C1682j7.a(android.graphics.Point, android.graphics.Point, android.graphics.Point, android.graphics.Point, org.json.JSONObject):com.inmobi.media.X6");
    }
}
