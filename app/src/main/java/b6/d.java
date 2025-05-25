package b6;

import android.os.Build;
import android.os.Bundle;
import com.facebook.internal.p;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MACARuleMatchingManager.kt */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f5333b;
    public static JSONArray c;

    /* renamed from: a  reason: collision with root package name */
    public static final d f5332a = new d();

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f5334d = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    public static final void a(Bundle params, String event) {
        String str;
        if (k6.a.b(d.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.g.e(params, "params");
            kotlin.jvm.internal.g.e(event, "event");
            params.putString("event", event);
            StringBuilder sb2 = new StringBuilder();
            p pVar = p.f9815a;
            pVar.getClass();
            Locale locale = p.f9823j;
            String str2 = null;
            if (locale != null) {
                str = locale.getLanguage();
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            sb2.append('_');
            pVar.getClass();
            Locale locale2 = p.f9823j;
            if (locale2 != null) {
                str2 = locale2.getCountry();
            }
            if (str2 == null) {
                str2 = "";
            }
            sb2.append(str2);
            params.putString("_locale", sb2.toString());
            pVar.getClass();
            String str4 = p.f9822i;
            if (str4 == null) {
                str4 = "";
            }
            params.putString("_appVersion", str4);
            params.putString("_deviceOS", "ANDROID");
            params.putString("_platform", "mobile");
            String str5 = Build.MODEL;
            if (str5 == null) {
                str5 = "";
            }
            params.putString("_deviceModel", str5);
            params.putString("_nativeAppID", com.facebook.d.b());
            pVar.getClass();
            String str6 = p.f9822i;
            if (str6 != null) {
                str3 = str6;
            }
            params.putString("_nativeAppShortVersion", str3);
            pVar.getClass();
            params.putString("_timezone", p.f9820g);
            pVar.getClass();
            params.putString("_carrier", p.f9821h);
            params.putString("_deviceOSTypeName", "ANDROID");
            params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
            pVar.getClass();
            params.putLong("_remainingDiskGB", p.f9818e);
        } catch (Throwable th2) {
            k6.a.a(d.class, th2);
        }
    }

    public static final String b(JSONObject jSONObject) {
        if (k6.a.b(d.class)) {
            return null;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            if (!keys.hasNext()) {
                return null;
            }
            return keys.next();
        } catch (Throwable th2) {
            k6.a.a(d.class, th2);
            return null;
        }
    }

    public static final String c(Bundle bundle) {
        boolean z10;
        String optString;
        if (k6.a.b(d.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = c;
            if (jSONArray != null) {
                if (jSONArray != null && jSONArray.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    JSONArray jSONArray2 = c;
                    kotlin.jvm.internal.g.c(jSONArray2, "null cannot be cast to non-null type org.json.JSONArray");
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray2.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String optString2 = jSONArray2.optString(i10);
                        if (optString2 != null) {
                            JSONObject jSONObject = new JSONObject(optString2);
                            long optLong = jSONObject.optLong(FacebookMediationAdapter.KEY_ID);
                            if (optLong != 0 && (optString = jSONObject.optString("rule")) != null && d(bundle, optString)) {
                                arrayList.add(Long.valueOf(optLong));
                            }
                        }
                    }
                    String jSONArray3 = new JSONArray((Collection) arrayList).toString();
                    kotlin.jvm.internal.g.d(jSONArray3, "JSONArray(res).toString()");
                    return jSONArray3;
                }
                return "[]";
            }
            return "[]";
        } catch (Throwable th2) {
            k6.a.a(d.class, th2);
            return null;
        }
    }

    public static final boolean d(Bundle bundle, String str) {
        if (!k6.a.b(d.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String b10 = b(jSONObject);
                if (b10 == null) {
                    return false;
                }
                Object obj = jSONObject.get(b10);
                int hashCode = b10.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        if (hashCode == 109267 && b10.equals("not")) {
                            return !d(bundle, obj.toString());
                        }
                    } else if (b10.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length = jSONArray.length();
                        for (int i10 = 0; i10 < length; i10++) {
                            if (!d(bundle, jSONArray.get(i10).toString())) {
                                return false;
                            }
                        }
                        return true;
                    }
                } else if (b10.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 == null) {
                        return false;
                    }
                    int length2 = jSONArray2.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        if (d(bundle, jSONArray2.get(i11).toString())) {
                            return true;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return g(b10, jSONObject2, bundle);
            } catch (Throwable th2) {
                k6.a.a(d.class, th2);
            }
        }
        return false;
    }

    public static final void e(Bundle bundle, String event) {
        if (k6.a.b(d.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.g.e(event, "event");
            if (f5333b && bundle != null) {
                try {
                    a(bundle, event);
                    bundle.putString("_audiencePropertyIds", c(bundle));
                    bundle.putString("cs_maca", "1");
                    f(bundle);
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th2) {
            k6.a.a(d.class, th2);
        }
    }

    public static final void f(Bundle params) {
        if (k6.a.b(d.class)) {
            return;
        }
        try {
            kotlin.jvm.internal.g.e(params, "params");
            for (String str : f5334d) {
                params.remove(str);
            }
        } catch (Throwable th2) {
            k6.a.a(d.class, th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
        if (r7 == null) goto L251;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022f A[Catch: all -> 0x0362, TryCatch #1 {all -> 0x0362, blocks: (B:5:0x000a, B:8:0x0011, B:21:0x0047, B:24:0x0052, B:30:0x0062, B:37:0x007b, B:38:0x007f, B:40:0x0084, B:43:0x008e, B:44:0x00a8, B:47:0x00b2, B:50:0x00be, B:136:0x022f, B:139:0x0237, B:140:0x023b, B:142:0x0241, B:53:0x00c8, B:56:0x00d2, B:57:0x00ec, B:150:0x0271, B:153:0x0279, B:154:0x027d, B:156:0x0283, B:60:0x00f6, B:63:0x0100, B:64:0x011a, B:112:0x01ca, B:67:0x0124, B:106:0x01ae, B:70:0x012e, B:97:0x0188, B:73:0x0138, B:76:0x0142, B:128:0x0210, B:79:0x014c, B:82:0x0156, B:191:0x0334, B:85:0x0160, B:118:0x01e0, B:88:0x016a, B:91:0x0174, B:124:0x01fc, B:94:0x017e, B:100:0x019a, B:103:0x01a4, B:109:0x01c0, B:115:0x01d6, B:121:0x01f2, B:125:0x0206, B:131:0x0222, B:145:0x0264, B:159:0x02a5, B:162:0x02af, B:165:0x02cb, B:168:0x02d5, B:169:0x02df, B:185:0x031f, B:172:0x02e9, B:175:0x02f3, B:176:0x0301, B:179:0x030a, B:180:0x0313, B:186:0x0328, B:192:0x033d, B:195:0x0346, B:33:0x0073, B:14:0x0028, B:16:0x0034), top: B:202:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0283 A[Catch: all -> 0x0362, TryCatch #1 {all -> 0x0362, blocks: (B:5:0x000a, B:8:0x0011, B:21:0x0047, B:24:0x0052, B:30:0x0062, B:37:0x007b, B:38:0x007f, B:40:0x0084, B:43:0x008e, B:44:0x00a8, B:47:0x00b2, B:50:0x00be, B:136:0x022f, B:139:0x0237, B:140:0x023b, B:142:0x0241, B:53:0x00c8, B:56:0x00d2, B:57:0x00ec, B:150:0x0271, B:153:0x0279, B:154:0x027d, B:156:0x0283, B:60:0x00f6, B:63:0x0100, B:64:0x011a, B:112:0x01ca, B:67:0x0124, B:106:0x01ae, B:70:0x012e, B:97:0x0188, B:73:0x0138, B:76:0x0142, B:128:0x0210, B:79:0x014c, B:82:0x0156, B:191:0x0334, B:85:0x0160, B:118:0x01e0, B:88:0x016a, B:91:0x0174, B:124:0x01fc, B:94:0x017e, B:100:0x019a, B:103:0x01a4, B:109:0x01c0, B:115:0x01d6, B:121:0x01f2, B:125:0x0206, B:131:0x0222, B:145:0x0264, B:159:0x02a5, B:162:0x02af, B:165:0x02cb, B:168:0x02d5, B:169:0x02df, B:185:0x031f, B:172:0x02e9, B:175:0x02f3, B:176:0x0301, B:179:0x030a, B:180:0x0313, B:186:0x0328, B:192:0x033d, B:195:0x0346, B:33:0x0073, B:14:0x0028, B:16:0x0034), top: B:202:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x031e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x031f A[Catch: all -> 0x0362, TryCatch #1 {all -> 0x0362, blocks: (B:5:0x000a, B:8:0x0011, B:21:0x0047, B:24:0x0052, B:30:0x0062, B:37:0x007b, B:38:0x007f, B:40:0x0084, B:43:0x008e, B:44:0x00a8, B:47:0x00b2, B:50:0x00be, B:136:0x022f, B:139:0x0237, B:140:0x023b, B:142:0x0241, B:53:0x00c8, B:56:0x00d2, B:57:0x00ec, B:150:0x0271, B:153:0x0279, B:154:0x027d, B:156:0x0283, B:60:0x00f6, B:63:0x0100, B:64:0x011a, B:112:0x01ca, B:67:0x0124, B:106:0x01ae, B:70:0x012e, B:97:0x0188, B:73:0x0138, B:76:0x0142, B:128:0x0210, B:79:0x014c, B:82:0x0156, B:191:0x0334, B:85:0x0160, B:118:0x01e0, B:88:0x016a, B:91:0x0174, B:124:0x01fc, B:94:0x017e, B:100:0x019a, B:103:0x01a4, B:109:0x01c0, B:115:0x01d6, B:121:0x01f2, B:125:0x0206, B:131:0x0222, B:145:0x0264, B:159:0x02a5, B:162:0x02af, B:165:0x02cb, B:168:0x02d5, B:169:0x02df, B:185:0x031f, B:172:0x02e9, B:175:0x02f3, B:176:0x0301, B:179:0x030a, B:180:0x0313, B:186:0x0328, B:192:0x033d, B:195:0x0346, B:33:0x0073, B:14:0x0028, B:16:0x0034), top: B:202:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0333 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0334 A[Catch: all -> 0x0362, TryCatch #1 {all -> 0x0362, blocks: (B:5:0x000a, B:8:0x0011, B:21:0x0047, B:24:0x0052, B:30:0x0062, B:37:0x007b, B:38:0x007f, B:40:0x0084, B:43:0x008e, B:44:0x00a8, B:47:0x00b2, B:50:0x00be, B:136:0x022f, B:139:0x0237, B:140:0x023b, B:142:0x0241, B:53:0x00c8, B:56:0x00d2, B:57:0x00ec, B:150:0x0271, B:153:0x0279, B:154:0x027d, B:156:0x0283, B:60:0x00f6, B:63:0x0100, B:64:0x011a, B:112:0x01ca, B:67:0x0124, B:106:0x01ae, B:70:0x012e, B:97:0x0188, B:73:0x0138, B:76:0x0142, B:128:0x0210, B:79:0x014c, B:82:0x0156, B:191:0x0334, B:85:0x0160, B:118:0x01e0, B:88:0x016a, B:91:0x0174, B:124:0x01fc, B:94:0x017e, B:100:0x019a, B:103:0x01a4, B:109:0x01c0, B:115:0x01d6, B:121:0x01f2, B:125:0x0206, B:131:0x0222, B:145:0x0264, B:159:0x02a5, B:162:0x02af, B:165:0x02cb, B:168:0x02d5, B:169:0x02df, B:185:0x031f, B:172:0x02e9, B:175:0x02f3, B:176:0x0301, B:179:0x030a, B:180:0x0313, B:186:0x0328, B:192:0x033d, B:195:0x0346, B:33:0x0073, B:14:0x0028, B:16:0x0034), top: B:202:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean g(java.lang.String r9, org.json.JSONObject r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.d.g(java.lang.String, org.json.JSONObject, android.os.Bundle):boolean");
    }
}
