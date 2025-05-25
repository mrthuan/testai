package com.apm.insight;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.apm.insight.MonitorCrash;
import com.apm.insight.l.u;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {

    /* renamed from: b  reason: collision with root package name */
    protected static MonitorCrash f6514b;
    protected static volatile ConcurrentHashMap<String, h> c = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    protected MonitorCrash f6515a;

    private h(MonitorCrash monitorCrash) {
        this.f6515a = monitorCrash;
        com.apm.insight.entity.b.a(this);
        com.apm.insight.j.b.d();
        com.apm.insight.k.k.e();
    }

    public static h a(String str) {
        return c.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject e() {
        int i10;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f6515a.mConfig.mPackageName == null) {
                Context g10 = i.g();
                PackageInfo packageInfo = g10.getPackageManager().getPackageInfo(g10.getPackageName(), 128);
                if (packageInfo != null) {
                    MonitorCrash.Config config = this.f6515a.mConfig;
                    if (config.mVersionInt == -1) {
                        config.mVersionInt = packageInfo.versionCode;
                    }
                    if (config.mVersionStr == null) {
                        config.mVersionStr = packageInfo.versionName;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(this.f6515a.mConfig.mDeviceId) || PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES.equals(this.f6515a.mConfig.mDeviceId)) {
            this.f6515a.mConfig.mDeviceId = i.c().a();
        }
        try {
            jSONObject.put("aid", String.valueOf(this.f6515a.mConfig.mAid));
            jSONObject.put("update_version_code", this.f6515a.mConfig.mVersionInt);
            jSONObject.put("version_code", this.f6515a.mConfig.mVersionInt);
            jSONObject.put("app_version", this.f6515a.mConfig.mVersionStr);
            jSONObject.put("channel", this.f6515a.mConfig.mChannel);
            jSONObject.put("package", com.apm.insight.l.k.a(this.f6515a.mConfig.mPackageName));
            jSONObject.put("device_id", this.f6515a.mConfig.mDeviceId);
            jSONObject.put("user_id", this.f6515a.mConfig.mUID);
            jSONObject.put("ssid", this.f6515a.mConfig.mSSID);
            jSONObject.put("os", "Android");
            jSONObject.put("so_list", com.apm.insight.l.k.a(this.f6515a.mConfig.mSoList));
            jSONObject.put("thread_list", com.apm.insight.l.k.a(this.f6515a.mConfig.mThreadList));
            if (d()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            jSONObject.put("single_upload", i10);
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    public String b() {
        return this.f6515a.mConfig.mAid;
    }

    public JSONObject c() {
        return e();
    }

    public boolean d() {
        return false;
    }

    public static Object a() {
        return f6514b;
    }

    private JSONObject b(CrashType crashType) {
        Map<? extends String, ? extends String> userData;
        AttachUserData attachUserData = this.f6515a.mCustomData;
        if (attachUserData == null || (userData = attachUserData.getUserData(crashType)) == null) {
            return null;
        }
        return new JSONObject(userData);
    }

    private JSONObject c(CrashType crashType) {
        return new JSONObject(this.f6515a.mTagMap);
    }

    public JSONArray a(StackTraceElement[] stackTraceElementArr, Throwable th2) {
        return a(stackTraceElementArr, th2, null);
    }

    public JSONArray a(StackTraceElement[] stackTraceElementArr, Throwable th2, String str) {
        String[] strArr = this.f6515a.mConfig.mPackageName;
        if (strArr == null) {
            return new JSONArray().put(new u.a(0, stackTraceElementArr.length).a());
        }
        if (th2 == null || stackTraceElementArr == null) {
            return null;
        }
        JSONArray a10 = u.a(stackTraceElementArr, strArr);
        if (str != null && this.f6515a.mConfig.mThreadList != null && com.apm.insight.l.k.a(a10)) {
            for (String str2 : this.f6515a.mConfig.mThreadList) {
                if (TextUtils.equals(str2, str)) {
                    a10.put(new u.a(0, stackTraceElementArr.length).a());
                }
            }
        }
        return a10;
    }

    public JSONArray a(String[] strArr) {
        return this.f6515a.config().mPackageName == null ? new JSONArray().put(new u.a(0, strArr.length).a()) : u.a(strArr, this.f6515a.mConfig.mPackageName);
    }

    public JSONObject a(CrashType crashType) {
        return a(crashType, (JSONArray) null);
    }

    public JSONObject a(CrashType crashType, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("header", e());
            if (crashType != null) {
                jSONObject.put("custom", b(crashType));
                jSONObject.put("filters", c(crashType));
            }
            jSONObject.put("line_num", jSONArray);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static void a(Context context, final MonitorCrash monitorCrash) {
        f6514b = monitorCrash;
        h hVar = new h(monitorCrash);
        final com.apm.insight.runtime.d a10 = i.a();
        Npth.init(context, new ICommonParams() { // from class: com.apm.insight.h.1
            @Override // com.apm.insight.ICommonParams
            public Map<String, Object> getCommonParams() {
                return com.apm.insight.l.k.b(h.this.e());
            }

            @Override // com.apm.insight.ICommonParams
            public String getDeviceId() {
                if (TextUtils.isEmpty(monitorCrash.mConfig.mDeviceId)) {
                    return a10.d();
                }
                return monitorCrash.mConfig.mDeviceId;
            }

            @Override // com.apm.insight.ICommonParams
            public List<String> getPatchInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public Map<String, Integer> getPluginInfo() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public String getSessionId() {
                return null;
            }

            @Override // com.apm.insight.ICommonParams
            public long getUserId() {
                return 0L;
            }
        });
    }

    public static void a(MonitorCrash monitorCrash) {
        h hVar = new h(monitorCrash);
        if (monitorCrash == null || monitorCrash.mConfig == null) {
            return;
        }
        c.put(monitorCrash.mConfig.mAid, hVar);
    }

    public boolean a(Object obj) {
        return this.f6515a == obj;
    }

    public boolean a(String str, String str2) {
        if (this.f6515a.config().mPackageName == null) {
            return true;
        }
        return com.apm.insight.entity.b.a(str, com.apm.insight.l.k.a(this.f6515a.mConfig.mSoList), str2, com.apm.insight.l.k.a(this.f6515a.mConfig.mThreadList));
    }
}
