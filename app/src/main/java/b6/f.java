package b6;

import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.p;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: SensitiveParamsManager.kt */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f5338b;

    /* renamed from: a  reason: collision with root package name */
    public static final f f5337a = new f();
    public static HashSet<String> c = new HashSet<>();

    /* renamed from: d  reason: collision with root package name */
    public static HashMap f5339d = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
        if (r9.contains(r3) != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {all -> 0x0080, blocks: (B:22:0x0061, B:25:0x006c, B:31:0x0078), top: B:47:0x0061 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(android.os.Bundle r8, java.lang.String r9) {
        /*
            java.lang.Class<b6.f> r0 = b6.f.class
            boolean r1 = k6.a.b(r0)
            if (r1 == 0) goto L9
            return
        L9:
            java.lang.String r1 = "eventName"
            kotlin.jvm.internal.g.e(r9, r1)     // Catch: java.lang.Throwable -> L9d
            boolean r1 = b6.f.f5338b     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto L9c
            if (r8 != 0) goto L16
            goto L9c
        L16:
            java.util.HashSet<java.lang.String> r1 = b6.f.c     // Catch: java.lang.Throwable -> L9d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L9d
            if (r1 == 0) goto L27
            java.util.HashMap r1 = b6.f.f5339d     // Catch: java.lang.Throwable -> L9d
            boolean r1 = r1.containsKey(r9)     // Catch: java.lang.Throwable -> L9d
            if (r1 != 0) goto L27
            return
        L27:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L9d
            r1.<init>()     // Catch: java.lang.Throwable -> L9d
            java.util.HashMap r2 = b6.f.f5339d     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            java.lang.Object r9 = r2.get(r9)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            java.util.HashSet r9 = (java.util.HashSet) r9     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            java.util.Set r3 = r8.keySet()     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            r2.<init>(r3)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
        L43:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            if (r3 == 0) goto L8d
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            b6.f r4 = b6.f.f5337a     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            java.lang.String r5 = "key"
            kotlin.jvm.internal.g.d(r3, r5)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            r4.getClass()     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            boolean r5 = k6.a.b(r4)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            r6 = 0
            if (r5 == 0) goto L61
            goto L84
        L61:
            java.util.HashSet<java.lang.String> r5 = b6.f.c     // Catch: java.lang.Throwable -> L80
            boolean r5 = r5.contains(r3)     // Catch: java.lang.Throwable -> L80
            r7 = 1
            if (r5 != 0) goto L7e
            if (r9 == 0) goto L75
            boolean r5 = r9.isEmpty()     // Catch: java.lang.Throwable -> L80
            if (r5 == 0) goto L73
            goto L75
        L73:
            r5 = r6
            goto L76
        L75:
            r5 = r7
        L76:
            if (r5 != 0) goto L84
            boolean r4 = r9.contains(r3)     // Catch: java.lang.Throwable -> L80
            if (r4 == 0) goto L84
        L7e:
            r6 = r7
            goto L84
        L80:
            r5 = move-exception
            k6.a.a(r4, r5)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
        L84:
            if (r6 == 0) goto L43
            r8.remove(r3)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            r1.put(r3)     // Catch: java.lang.Exception -> L8d java.lang.Throwable -> L9d
            goto L43
        L8d:
            int r9 = r1.length()     // Catch: java.lang.Throwable -> L9d
            if (r9 <= 0) goto L9c
            java.lang.String r9 = "_filteredKey"
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9d
            r8.putString(r9, r1)     // Catch: java.lang.Throwable -> L9d
        L9c:
            return
        L9d:
            r8 = move-exception
            k6.a.a(r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.f.b(android.os.Bundle, java.lang.String):void");
    }

    public final void a() {
        HashSet<String> e10;
        if (k6.a.b(this)) {
            return;
        }
        try {
            com.facebook.internal.f k10 = FetchedAppSettingsManager.k(com.facebook.d.b(), false);
            if (k10 == null) {
                return;
            }
            try {
                c = new HashSet<>();
                f5339d = new HashMap();
                JSONArray jSONArray = k10.f9780p;
                if (jSONArray != null && jSONArray.length() != 0) {
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                        boolean has = jSONObject.has("key");
                        boolean has2 = jSONObject.has("value");
                        if (has && has2) {
                            String string = jSONObject.getString("key");
                            JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                            if (jSONArray2 != null && (e10 = p.e(jSONArray2)) != null) {
                                if (string.equals("_MTSDK_Default_")) {
                                    c = e10;
                                } else {
                                    f5339d.put(string, e10);
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            k6.a.a(this, th2);
        }
    }
}
