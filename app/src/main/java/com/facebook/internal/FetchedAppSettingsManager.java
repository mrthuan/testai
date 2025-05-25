package com.facebook.internal;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.r;
import com.facebook.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FetchedAppSettingsManager.kt */
/* loaded from: classes.dex */
public final class FetchedAppSettingsManager {

    /* renamed from: a  reason: collision with root package name */
    public static final FetchedAppSettingsManager f9737a = new FetchedAppSettingsManager();

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f9738b = ge.a.I("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", r.f(new StringBuilder("app_events_config.os_version("), Build.VERSION.RELEASE, ')'));
    public static final ConcurrentHashMap c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    public static final AtomicReference<FetchAppSettingState> f9739d = new AtomicReference<>(FetchAppSettingState.NOT_LOADED);

    /* renamed from: e  reason: collision with root package name */
    public static final ConcurrentLinkedQueue<a> f9740e = new ConcurrentLinkedQueue<>();

    /* renamed from: f  reason: collision with root package name */
    public static boolean f9741f;

    /* compiled from: FetchedAppSettingsManager.kt */
    /* loaded from: classes.dex */
    public enum FetchAppSettingState {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* compiled from: FetchedAppSettingsManager.kt */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void onSuccess();
    }

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f9738b);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        String str = com.facebook.e.f9701j;
        com.facebook.e g10 = e.c.g(null, "app", null);
        g10.f9711i = true;
        g10.f9706d = bundle;
        JSONObject jSONObject = g10.c().f9729d;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public static final f b(String str) {
        return (f) c.get(str);
    }

    public static final HashMap c() {
        JSONObject jSONObject;
        String string = com.facebook.d.a().getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(b.a.f(new Object[]{com.facebook.d.b()}, 1, "com.facebook.internal.APP_SETTINGS.%s", "format(format, *args)"), null);
        if (!p.v(string)) {
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    com.facebook.d dVar = com.facebook.d.f9685a;
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    f9737a.getClass();
                    return h(jSONObject);
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d() {
        /*
            android.content.Context r0 = com.facebook.d.a()
            java.lang.String r1 = com.facebook.d.b()
            boolean r2 = com.facebook.internal.p.v(r1)
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState> r3 = com.facebook.internal.FetchedAppSettingsManager.f9739d
            com.facebook.internal.FetchedAppSettingsManager r4 = com.facebook.internal.FetchedAppSettingsManager.f9737a
            if (r2 == 0) goto L1b
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r0 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.ERROR
            r3.set(r0)
            r4.j()
            return
        L1b:
            java.util.concurrent.ConcurrentHashMap r2 = com.facebook.internal.FetchedAppSettingsManager.c
            boolean r2 = r2.containsKey(r1)
            if (r2 == 0) goto L2c
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r0 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.SUCCESS
            r3.set(r0)
            r4.j()
            return
        L2c:
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r2 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.NOT_LOADED
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r5 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.LOADING
        L30:
            boolean r6 = r3.compareAndSet(r2, r5)
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L3a
            r2 = r8
            goto L41
        L3a:
            java.lang.Object r6 = r3.get()
            if (r6 == r2) goto L30
            r2 = r7
        L41:
            if (r2 != 0) goto L5b
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r2 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.ERROR
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r5 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.LOADING
        L47:
            boolean r6 = r3.compareAndSet(r2, r5)
            if (r6 == 0) goto L4f
            r2 = r8
            goto L56
        L4f:
            java.lang.Object r6 = r3.get()
            if (r6 == r2) goto L47
            r2 = r7
        L56:
            if (r2 == 0) goto L59
            goto L5b
        L59:
            r2 = r7
            goto L5c
        L5b:
            r2 = r8
        L5c:
            if (r2 != 0) goto L62
            r4.j()
            return
        L62:
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r2[r7] = r1
            java.lang.String r3 = "com.facebook.internal.APP_SETTINGS.%s"
            java.lang.String r4 = "format(format, *args)"
            java.lang.String r2 = b.a.f(r2, r8, r3, r4)
            java.util.concurrent.Executor r3 = com.facebook.d.c()
            a6.e r4 = new a6.e
            r4.<init>(r0, r2, r1)
            r3.execute(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FetchedAppSettingsManager.d():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ca A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.internal.f e(java.lang.String r46, org.json.JSONObject r47) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FetchedAppSettingsManager.e(java.lang.String, org.json.JSONObject):com.facebook.internal.f");
    }

    public static ArrayList f(String str, JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            if (kotlin.jvm.internal.g.a(jSONObject2.getString("key"), "prod_keys")) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                    if (kotlin.jvm.internal.g.a(jSONObject3.getString("key"), str)) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i12 = 0; i12 < length3; i12++) {
                            arrayList.add(jSONArray3.getJSONObject(i12).getString("value"));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.addAll(arrayList);
                        return arrayList2;
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static ArrayList g(JSONObject jSONObject, boolean z10) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
                return null;
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            String string = jSONObject2.getString("key");
            if ((!kotlin.jvm.internal.g.a(string, "prod_keys") || !z10) && (!kotlin.jvm.internal.g.a(string, "test_keys") || z10)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i11);
                    String string2 = jSONObject3.getString("key");
                    if (!kotlin.jvm.internal.g.a(string2, "_valueToSum") && !kotlin.jvm.internal.g.a(string2, "fb_currency")) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList2 = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i12 = 0; i12 < length3; i12++) {
                            arrayList2.add(jSONArray3.getJSONObject(i12).getString("value"));
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new Pair(string2, arrayList2));
                    }
                }
            }
        }
        return arrayList;
    }

    public static HashMap h(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                hashMap.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException unused) {
                p pVar = p.f9815a;
                com.facebook.d dVar = com.facebook.d.f9685a;
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                hashMap.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException unused2) {
                p pVar2 = p.f9815a;
                com.facebook.d dVar2 = com.facebook.d.f9685a;
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    public static JSONArray i(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    public static final f k(String applicationId, boolean z10) {
        kotlin.jvm.internal.g.e(applicationId, "applicationId");
        if (!z10) {
            ConcurrentHashMap concurrentHashMap = c;
            if (concurrentHashMap.containsKey(applicationId)) {
                return (f) concurrentHashMap.get(applicationId);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = f9737a;
        fetchedAppSettingsManager.getClass();
        f e10 = e(applicationId, a());
        if (kotlin.jvm.internal.g.a(applicationId, com.facebook.d.b())) {
            f9739d.set(FetchAppSettingState.SUCCESS);
            fetchedAppSettingsManager.j();
        }
        return e10;
    }

    public final synchronized void j() {
        FetchAppSettingState fetchAppSettingState = f9739d.get();
        if (FetchAppSettingState.NOT_LOADED != fetchAppSettingState && FetchAppSettingState.LOADING != fetchAppSettingState) {
            f fVar = (f) c.get(com.facebook.d.b());
            Handler handler = new Handler(Looper.getMainLooper());
            if (FetchAppSettingState.ERROR == fetchAppSettingState) {
                while (true) {
                    ConcurrentLinkedQueue<a> concurrentLinkedQueue = f9740e;
                    if (!concurrentLinkedQueue.isEmpty()) {
                        handler.post(new androidx.activity.i(concurrentLinkedQueue.poll(), 2));
                    } else {
                        return;
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue<a> concurrentLinkedQueue2 = f9740e;
                    if (!concurrentLinkedQueue2.isEmpty()) {
                        handler.post(new l.r(4, concurrentLinkedQueue2.poll(), fVar));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
