package com.pgl.ssdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import org.json.JSONObject;

/* compiled from: SelasAgent.java */
/* loaded from: classes2.dex */
public class S {

    /* renamed from: a  reason: collision with root package name */
    public static int f15789a = 504;

    /* renamed from: b  reason: collision with root package name */
    public static String f15790b = null;
    public static String c = "";

    /* renamed from: d  reason: collision with root package name */
    private static Context f15791d;

    public static void a(Context context, String str) {
        if (f15791d == null) {
            f15791d = context;
        }
        int i10 = f15789a;
        if (i10 == 102 || i10 == 202 || i10 == 200) {
            return;
        }
        System.currentTimeMillis();
        f15790b = str;
        f15789a = 102;
        ApkUtils.a(new T(context, null));
    }

    public static synchronized String b() {
        String str;
        synchronized (S.class) {
            if (TextUtils.isEmpty(c)) {
                c = (String) com.pgl.ssdk.ces.a.meta(303, f15791d, null);
            }
            str = c;
        }
        return str;
    }

    public static void c() {
        Context context = f15791d;
        if (context != null) {
            f15789a = 102;
            ApkUtils.a(new T(context, null));
            com.pgl.ssdk.ces.c.g().a();
            PglArmorCallApi.a();
        }
    }

    public static synchronized Object a(byte[] bArr) {
        synchronized (S.class) {
            if (bArr != null) {
                return com.pgl.ssdk.ces.a.meta(302, f15791d, bArr);
            }
            return null;
        }
    }

    public static String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("os", "Android");
            jSONObject.put("version", "6.2.0.0.overseas-rc.2");
            String str = c;
            if (str != null && str.length() > 0) {
                jSONObject.put("token_id", c);
            } else {
                jSONObject.put("token_id", b());
            }
            jSONObject.put("code", f15789a);
            return Base64.encodeToString(jSONObject.toString().getBytes(), 2);
        } catch (Throwable unused) {
            return "";
        }
    }
}
