package com.inmobi.media;

import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.RootConfig;
import com.inmobi.sdk.InMobiSdk;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class M3 {

    /* renamed from: a  reason: collision with root package name */
    public static final M3 f14454a = new M3();

    /* renamed from: b  reason: collision with root package name */
    public static JSONObject f14455b;
    public static JSONObject c;

    /* renamed from: d  reason: collision with root package name */
    public static JSONObject f14456d;

    /* renamed from: e  reason: collision with root package name */
    public static RootConfig f14457e;

    /* JADX WARN: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final org.json.JSONObject c() {
        /*
            android.content.Context r0 = com.inmobi.media.Ha.d()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            if (r0 == 0) goto L11
            java.lang.String r3 = r0.getPackageName()
            goto L12
        L11:
            r3 = r2
        L12:
            java.lang.String r4 = "_preferences"
            java.lang.String r1 = androidx.activity.r.g(r1, r3, r4)
            if (r0 == 0) goto L20
            r3 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r3)
            goto L21
        L20:
            r0 = r2
        L21:
            if (r0 == 0) goto L70
            r1 = -1
            java.lang.String r3 = "IABTCF_TCString"
            java.lang.String r3 = r0.getString(r3, r2)     // Catch: java.lang.Exception -> L31
            java.lang.String r4 = "IABTCF_gdprApplies"
            int r4 = r0.getInt(r4, r1)     // Catch: java.lang.Exception -> L32
            goto L33
        L31:
            r3 = r2
        L32:
            r4 = r1
        L33:
            java.lang.String r5 = "gdpr"
            java.lang.String r6 = "gdpr_consent"
            if (r3 == 0) goto L4b
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4b
            r7.<init>()     // Catch: org.json.JSONException -> L4b
            r7.put(r6, r3)     // Catch: org.json.JSONException -> L4b
            if (r4 == r1) goto L4c
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch: org.json.JSONException -> L4b
            r7.put(r5, r1)     // Catch: org.json.JSONException -> L4b
            goto L4c
        L4b:
            r7 = r2
        L4c:
            if (r7 != 0) goto L6e
            java.lang.String r1 = "IABConsent_ConsentString"
            java.lang.String r1 = r0.getString(r1, r2)     // Catch: java.lang.Exception -> L5b
            java.lang.String r3 = "IABConsent_SubjectToGDPR"
            java.lang.String r0 = r0.getString(r3, r2)     // Catch: java.lang.Exception -> L5c
            goto L5d
        L5b:
            r1 = r2
        L5c:
            r0 = r2
        L5d:
            if (r1 == 0) goto L6d
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L6d
            r7.<init>()     // Catch: org.json.JSONException -> L6d
            r7.put(r6, r1)     // Catch: org.json.JSONException -> L6d
            if (r0 == 0) goto L6e
            r7.put(r5, r0)     // Catch: org.json.JSONException -> L6d
            goto L6e
        L6d:
            r7 = r2
        L6e:
            if (r7 != 0) goto Lce
        L70:
            org.json.JSONObject r0 = com.inmobi.media.M3.c
            if (r0 != 0) goto L77
            org.json.JSONObject r7 = com.inmobi.media.M3.f14455b
            goto Lce
        L77:
            org.json.JSONObject r1 = com.inmobi.media.M3.f14455b
            if (r1 != 0) goto L7d
        L7b:
            r7 = r0
            goto Lce
        L7d:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = com.inmobi.media.M3.c
            if (r1 == 0) goto L8b
            java.util.Iterator r1 = r1.keys()
            goto L8c
        L8b:
            r1 = r2
        L8c:
            if (r1 == 0) goto La8
        L8e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La8
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            org.json.JSONObject r4 = com.inmobi.media.M3.c     // Catch: org.json.JSONException -> L8e
            if (r4 == 0) goto La3
            java.lang.Object r4 = r4.opt(r3)     // Catch: org.json.JSONException -> L8e
            goto La4
        La3:
            r4 = r2
        La4:
            r0.put(r3, r4)     // Catch: org.json.JSONException -> L8e
            goto L8e
        La8:
            org.json.JSONObject r1 = com.inmobi.media.M3.f14455b
            if (r1 == 0) goto Lb1
            java.util.Iterator r1 = r1.keys()
            goto Lb2
        Lb1:
            r1 = r2
        Lb2:
            if (r1 == 0) goto L7b
        Lb4:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            org.json.JSONObject r4 = com.inmobi.media.M3.f14455b     // Catch: org.json.JSONException -> Lb4
            if (r4 == 0) goto Lc9
            java.lang.Object r4 = r4.opt(r3)     // Catch: org.json.JSONException -> Lb4
            goto Lca
        Lc9:
            r4 = r2
        Lca:
            r0.put(r3, r4)     // Catch: org.json.JSONException -> Lb4
            goto Lb4
        Lce:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.M3.c():org.json.JSONObject");
    }

    public static final byte e() {
        JSONObject c10 = c();
        if (c10 == null) {
            return (byte) -1;
        }
        if (!c10.has(InMobiSdk.IM_GDPR_CONSENT_IAB)) {
            if (!c10.has(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE)) {
                return (byte) -1;
            }
            try {
                return c10.getBoolean(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE) ? (byte) 1 : (byte) 0;
            } catch (JSONException unused) {
                return (byte) -1;
            }
        }
        return (byte) 1;
    }

    public static final void h() {
        HashMap hashMap = U2.f14728a;
        Config a10 = U2.a(Ha.b(), "root");
        kotlin.jvm.internal.g.c(a10, "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig");
        f14457e = (RootConfig) a10;
    }

    public static final void i() {
        f14455b = null;
        c = null;
        f14456d = null;
        f14457e = null;
    }

    public final void a(JSONObject jSONObject) {
        f14456d = jSONObject;
    }

    public final JSONObject b() {
        return f14456d;
    }

    public final JSONObject g() {
        return f14455b;
    }

    public final void j() {
        LinkedHashMap linkedHashMap = C1732n2.f15334a;
        f14457e = (RootConfig) AbstractC1773q4.a("root", "null cannot be cast to non-null type com.inmobi.commons.core.configs.RootConfig", null);
    }

    public static /* synthetic */ boolean a(M3 m32, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return m32.a(z10);
    }

    public static final void b(JSONObject jSONObject) {
        if (jSONObject != null) {
            f14455b = jSONObject;
        }
    }

    public final boolean a(boolean z10) {
        if (f14457e == null) {
            j();
        }
        byte e10 = e();
        RootConfig rootConfig = f14457e;
        return e10 == 1 || kotlin.jvm.internal.g.a(rootConfig != null ? Boolean.valueOf(rootConfig.shouldTransmitRequest()) : null, Boolean.TRUE) || z10;
    }

    public final boolean a() {
        return a(this, false, 1, null);
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }

    public static final void c(JSONObject jSONObject) {
        if (jSONObject != null) {
            c = jSONObject;
        }
    }
}
