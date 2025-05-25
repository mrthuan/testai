package com.inmobi.media;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class N4 {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f14521a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f14522b = new Object();
    public static boolean c;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f14523d;

    /* renamed from: e  reason: collision with root package name */
    public static JSONObject f14524e;

    /* renamed from: f  reason: collision with root package name */
    public static JSONObject f14525f;

    public static final void a(JSONObject jSONObject) {
        synchronized (f14522b) {
            Objects.toString(f14525f);
            Objects.toString(jSONObject);
            f14525f = jSONObject;
            f14523d = true;
            Context d10 = Ha.d();
            if (d10 != null) {
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                C1851w5 a10 = AbstractC1838v5.a(d10, "unified_id_info_store");
                JSONObject jSONObject2 = f14525f;
                if (jSONObject2 == null) {
                    a10.a("publisher_provided_unified_id");
                } else {
                    a10.a("publisher_provided_unified_id", String.valueOf(jSONObject2));
                    tf.d dVar = tf.d.f30009a;
                }
            }
        }
    }

    public static final JSONObject b() {
        synchronized (f14521a) {
            if (c) {
                return f14524e;
            }
            c = true;
            Context d10 = Ha.d();
            if (d10 != null) {
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                String string = AbstractC1838v5.a(d10, "unified_id_info_store").f15579a.getString("ufids", null);
                if (string != null) {
                    try {
                        f14524e = new JSONObject(string);
                    } catch (JSONException unused) {
                    }
                    return f14524e;
                }
            }
            return null;
        }
    }

    public static final JSONObject a() {
        synchronized (f14522b) {
            if (f14523d) {
                Objects.toString(f14525f);
                return f14525f;
            }
            f14523d = true;
            Context d10 = Ha.d();
            String str = null;
            if (d10 != null) {
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                str = AbstractC1838v5.a(d10, "unified_id_info_store").f15579a.getString("publisher_provided_unified_id", null);
            }
            try {
                f14525f = new JSONObject(str);
            } catch (NullPointerException | JSONException unused) {
            }
            Objects.toString(f14525f);
            return f14525f;
        }
    }

    public static final void b(JSONObject jSONObject) {
        synchronized (f14521a) {
            f14524e = jSONObject;
            c = true;
            Context d10 = Ha.d();
            if (d10 != null) {
                ConcurrentHashMap concurrentHashMap = C1851w5.f15578b;
                C1851w5 a10 = AbstractC1838v5.a(d10, "unified_id_info_store");
                JSONObject jSONObject2 = f14524e;
                if (jSONObject2 == null) {
                    a10.a("ufids");
                } else {
                    String valueOf = String.valueOf(jSONObject2);
                    SharedPreferences.Editor edit = a10.f15579a.edit();
                    edit.putString("ufids", valueOf);
                    edit.apply();
                }
                SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(d10).edit();
                JSONObject jSONObject3 = f14524e;
                if (jSONObject3 == null) {
                    edit2.remove("InMobi_unifiedId");
                } else {
                    edit2.putString("InMobi_unifiedId", String.valueOf(jSONObject3));
                }
                edit2.apply();
            }
        }
    }
}
