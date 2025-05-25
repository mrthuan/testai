package com.facebook.applinks;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.appevents.k;
import com.facebook.d;
import com.facebook.e;
import com.facebook.internal.a;
import com.facebook.internal.p;
import com.facebook.internal.q;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AppLinkData.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public Uri f9672a;

    /* renamed from: b  reason: collision with root package name */
    public JSONObject f9673b;
    public Bundle c;

    /* compiled from: AppLinkData.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(b bVar);
    }

    public static void a(Context context, String str, a aVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("event", "DEFERRED_APP_LINK");
            com.facebook.internal.a aVar2 = com.facebook.internal.a.f9745f;
            p.A(jSONObject, a.C0146a.a(context), k.a(context), d.e(context), context);
            p.B(d.a(), jSONObject);
            jSONObject.put("application_package_name", context.getPackageName());
            String format = String.format("%s/activities", str);
            b bVar = null;
            try {
                String str2 = e.f9701j;
                JSONObject jSONObject2 = e.c.h(null, format, jSONObject, null).c().f9728b;
                if (jSONObject2 != null) {
                    String optString = jSONObject2.optString("applink_args");
                    long optLong = jSONObject2.optLong("click_time", -1L);
                    String optString2 = jSONObject2.optString("applink_class");
                    String optString3 = jSONObject2.optString("applink_url");
                    if (!TextUtils.isEmpty(optString) && (bVar = b(optString)) != null) {
                        if (optLong != -1) {
                            try {
                                JSONObject jSONObject3 = bVar.f9673b;
                                if (jSONObject3 != null) {
                                    jSONObject3.put("com.facebook.platform.APPLINK_TAP_TIME_UTC", optLong);
                                }
                                Bundle bundle = bVar.c;
                                if (bundle != null) {
                                    bundle.putString("com.facebook.platform.APPLINK_TAP_TIME_UTC", Long.toString(optLong));
                                }
                            } catch (JSONException unused) {
                                d dVar = d.f9685a;
                            }
                        }
                        if (optString2 != null) {
                            try {
                                JSONObject jSONObject4 = bVar.f9673b;
                                if (jSONObject4 != null) {
                                    jSONObject4.put("com.facebook.platform.APPLINK_NATIVE_CLASS", optString2);
                                }
                                Bundle bundle2 = bVar.c;
                                if (bundle2 != null) {
                                    bundle2.putString("com.facebook.platform.APPLINK_NATIVE_CLASS", optString2);
                                }
                            } catch (JSONException unused2) {
                                d dVar2 = d.f9685a;
                            }
                        }
                        if (optString3 != null) {
                            try {
                                JSONObject jSONObject5 = bVar.f9673b;
                                if (jSONObject5 != null) {
                                    jSONObject5.put("com.facebook.platform.APPLINK_NATIVE_URL", optString3);
                                }
                                Bundle bundle3 = bVar.c;
                                if (bundle3 != null) {
                                    bundle3.putString("com.facebook.platform.APPLINK_NATIVE_URL", optString3);
                                }
                            } catch (JSONException unused3) {
                                d dVar3 = d.f9685a;
                            }
                        }
                    }
                }
            } catch (Exception unused4) {
                d dVar4 = d.f9685a;
            }
            aVar.a(bVar);
        } catch (JSONException e10) {
            throw new FacebookException("An error occurred while preparing deferred app link", e10);
        }
    }

    public static b b(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("version");
            if (jSONObject.getJSONObject("bridge_args").getString("method").equals("applink") && string.equals("2")) {
                b bVar = new b();
                JSONObject jSONObject2 = jSONObject.getJSONObject("method_args");
                bVar.f9673b = jSONObject2;
                if (jSONObject2.has("ref")) {
                    bVar.f9673b.getString("ref");
                } else if (bVar.f9673b.has("referer_data")) {
                    JSONObject jSONObject3 = bVar.f9673b.getJSONObject("referer_data");
                    if (jSONObject3.has("fb_ref")) {
                        jSONObject3.getString("fb_ref");
                    }
                }
                if (bVar.f9673b.has("target_url")) {
                    Uri parse = Uri.parse(bVar.f9673b.getString("target_url"));
                    bVar.f9672a = parse;
                    if (!k6.a.b(b.class) && parse != null) {
                        try {
                            String queryParameter = parse.getQueryParameter("al_applink_data");
                            if (queryParameter != null) {
                                try {
                                    new JSONObject(queryParameter);
                                } catch (JSONException unused) {
                                }
                            }
                        } catch (Throwable th2) {
                            k6.a.a(b.class, th2);
                        }
                    }
                }
                if (bVar.f9673b.has("extras")) {
                    JSONObject jSONObject4 = bVar.f9673b.getJSONObject("extras");
                    if (jSONObject4.has("deeplink_context")) {
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("deeplink_context");
                        if (jSONObject5.has("promo_code")) {
                            jSONObject5.getString("promo_code");
                        }
                    }
                }
                bVar.c = d(bVar.f9673b);
                return bVar;
            }
        } catch (FacebookException unused2) {
            p pVar = p.f9815a;
            d dVar = d.f9685a;
        } catch (JSONException unused3) {
            p pVar2 = p.f9815a;
            d dVar2 = d.f9685a;
        }
        return null;
    }

    public static void c(Context context, a aVar) {
        q.c(context, "context");
        p pVar = p.f9815a;
        q.c(context, "context");
        String b10 = d.b();
        d.c().execute(new com.facebook.applinks.a(context.getApplicationContext(), b10, aVar));
    }

    public static Bundle d(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                bundle.putBundle(next, d((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int i10 = 0;
                if (jSONArray.length() == 0) {
                    bundle.putStringArray(next, new String[0]);
                } else {
                    Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        Bundle[] bundleArr = new Bundle[jSONArray.length()];
                        while (i10 < jSONArray.length()) {
                            bundleArr[i10] = d(jSONArray.getJSONObject(i10));
                            i10++;
                        }
                        bundle.putParcelableArray(next, bundleArr);
                    } else if (!(obj2 instanceof JSONArray)) {
                        String[] strArr = new String[jSONArray.length()];
                        while (i10 < jSONArray.length()) {
                            strArr[i10] = jSONArray.get(i10).toString();
                            i10++;
                        }
                        bundle.putStringArray(next, strArr);
                    } else {
                        throw new FacebookException("Nested arrays are not supported.");
                    }
                }
            } else {
                bundle.putString(next, obj.toString());
            }
        }
        return bundle;
    }
}
