package com.google.android.tools;

import android.app.Application;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* compiled from: DeviceUtils.kt */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedHashMap f13487a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f13488b;
    public static cg.a<tf.d> c;

    /* JADX WARN: Removed duplicated region for block: B:35:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(android.app.Application r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto Lc
            int r1 = r4.length()
            if (r1 != 0) goto La
            goto Lc
        La:
            r1 = r0
            goto Ld
        Lc:
            r1 = 1
        Ld:
            java.lang.String r2 = ""
            if (r1 == 0) goto L12
            r4 = r2
        L12:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L19
            goto L6e
        L19:
            java.lang.String r4 = d(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L24
            goto L6e
        L24:
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()     // Catch: java.lang.Exception -> L4d
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Exception -> L4d
            s0.h r3 = s0.e.a(r3)     // Catch: java.lang.Exception -> L4d
            int r4 = r3.d()     // Catch: java.lang.Exception -> L4d
            if (r4 <= 0) goto L51
            java.util.Locale r3 = r3.c(r0)     // Catch: java.lang.Exception -> L4d
            if (r3 == 0) goto L41
            java.lang.String r3 = r3.getCountry()     // Catch: java.lang.Exception -> L4d
            goto L42
        L41:
            r3 = 0
        L42:
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L4d
            if (r4 != 0) goto L51
            if (r3 != 0) goto L4b
            goto L51
        L4b:
            r4 = r3
            goto L52
        L4d:
            r3 = move-exception
            r3.printStackTrace()
        L51:
            r4 = r2
        L52:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L59
            goto L6e
        L59:
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r4 = r3.getCountry()
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L6d
            java.lang.String r3 = "country"
            kotlin.jvm.internal.g.d(r4, r3)
            goto L6e
        L6d:
            r4 = r2
        L6e:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 == 0) goto L75
            goto L87
        L75:
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r0 = "getDefault()"
            kotlin.jvm.internal.g.d(r3, r0)
            java.lang.String r2 = r4.toUpperCase(r3)
            java.lang.String r3 = "this as java.lang.String).toUpperCase(locale)"
            kotlin.jvm.internal.g.d(r2, r3)
        L87:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.tools.f.a(android.app.Application, java.lang.String):java.lang.String");
    }

    public static String b() {
        f13488b = true;
        LinkedHashMap linkedHashMap = f13487a;
        tf.c cVar = InstallReferrerUtil.f13468a;
        linkedHashMap.put("from", String.valueOf(InstallReferrerUtil.d()));
        String jSONObject = new JSONObject(linkedHashMap).toString();
        kotlin.jvm.internal.g.d(jSONObject, "jsonObject.toString()");
        return jSONObject;
    }

    public static String c(Application application) {
        try {
            WindowManager windowManager = (WindowManager) application.getSystemService("window");
            if (windowManager != null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(displayMetrics.widthPixels);
                sb2.append('*');
                sb2.append(displayMetrics.heightPixels);
                return sb2.toString();
            }
            return "";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public static String d(Application application) {
        try {
            Object systemService = application.getSystemService("phone");
            kotlin.jvm.internal.g.c(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
            String country = ((TelephonyManager) systemService).getSimCountryIso();
            if (!TextUtils.isEmpty(country)) {
                kotlin.jvm.internal.g.d(country, "country");
                return country;
            }
            return "";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
        if (kotlin.text.j.M(r2, "generic", false) == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean e() {
        /*
            java.lang.String r0 = "generic"
            r1 = 0
            java.lang.String r2 = android.os.Build.HARDWARE     // Catch: java.lang.Exception -> L5e
            java.lang.String r3 = "HARDWARE"
            kotlin.jvm.internal.g.d(r2, r3)     // Catch: java.lang.Exception -> L5e
            java.lang.CharSequence r2 = kotlin.text.k.n0(r2)     // Catch: java.lang.Exception -> L5e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L5e
            java.lang.String r3 = "ranchu"
            boolean r2 = kotlin.jvm.internal.g.a(r2, r3)     // Catch: java.lang.Exception -> L5e
            if (r2 != 0) goto L5c
            java.lang.String r2 = android.os.Build.MODEL     // Catch: java.lang.Exception -> L5e
            java.lang.String r3 = "MODEL"
            kotlin.jvm.internal.g.d(r2, r3)     // Catch: java.lang.Exception -> L5e
            java.lang.String r3 = "Emulator"
            boolean r2 = kotlin.text.k.O(r2, r3, r1)     // Catch: java.lang.Exception -> L5e
            if (r2 != 0) goto L5c
            java.lang.String r2 = android.os.Build.MANUFACTURER     // Catch: java.lang.Exception -> L5e
            java.lang.String r3 = "MANUFACTURER"
            kotlin.jvm.internal.g.d(r2, r3)     // Catch: java.lang.Exception -> L5e
            java.lang.String r3 = "Genymotion"
            boolean r2 = kotlin.text.k.O(r2, r3, r1)     // Catch: java.lang.Exception -> L5e
            if (r2 != 0) goto L5c
            java.lang.String r2 = android.os.Build.BRAND     // Catch: java.lang.Exception -> L5e
            java.lang.String r3 = "BRAND"
            kotlin.jvm.internal.g.d(r2, r3)     // Catch: java.lang.Exception -> L5e
            boolean r2 = kotlin.text.j.M(r2, r0, r1)     // Catch: java.lang.Exception -> L5e
            if (r2 == 0) goto L52
            java.lang.String r2 = android.os.Build.DEVICE     // Catch: java.lang.Exception -> L5e
            java.lang.String r3 = "DEVICE"
            kotlin.jvm.internal.g.d(r2, r3)     // Catch: java.lang.Exception -> L5e
            boolean r0 = kotlin.text.j.M(r2, r0, r1)     // Catch: java.lang.Exception -> L5e
            if (r0 != 0) goto L5c
        L52:
            java.lang.String r0 = "google_sdk"
            java.lang.String r2 = android.os.Build.PRODUCT     // Catch: java.lang.Exception -> L5e
            boolean r0 = kotlin.jvm.internal.g.a(r0, r2)     // Catch: java.lang.Exception -> L5e
            if (r0 == 0) goto L62
        L5c:
            r1 = 1
            goto L62
        L5e:
            r0 = move-exception
            r0.printStackTrace()
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.tools.f.e():boolean");
    }

    public static void f(String ref, String metaReferrer) {
        boolean z10;
        kotlin.jvm.internal.g.e(ref, "ref");
        kotlin.jvm.internal.g.e(metaReferrer, "metaReferrer");
        LinkedHashMap linkedHashMap = f13487a;
        linkedHashMap.put("ref", ref);
        if (metaReferrer.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            linkedHashMap.put("meta_referrer", metaReferrer);
        }
    }
}
