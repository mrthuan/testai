package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.sDy;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdSlotSettings.java */
/* loaded from: classes.dex */
public class ac {
    private static final ConcurrentHashMap<String, cJ> Qhi = new ConcurrentHashMap<>();

    public static void Qhi(boolean z10) {
        String Qhi2;
        File cJ = cJ();
        if (!cJ.exists()) {
            if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
                Qhi2 = com.bytedance.sdk.openadsdk.multipro.CJ.cJ.cJ("tt_sdk_settings", "ad_slot_conf", null);
            } else {
                Qhi2 = sDy.Qhi("tt_sdk_settings", com.bytedance.sdk.openadsdk.core.HzH.Qhi()).Qhi("ad_slot_conf", (String) null);
            }
            if (TextUtils.isEmpty(Qhi2)) {
                return;
            }
            try {
                HashMap<String, cJ> cJ2 = cJ(new JSONArray(Qhi2));
                if (cJ2.isEmpty()) {
                    return;
                }
                ConcurrentHashMap<String, cJ> concurrentHashMap = Qhi;
                concurrentHashMap.clear();
                concurrentHashMap.putAll(cJ2);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        try {
            HashMap<String, cJ> cJ3 = cJ(new JSONArray(new String(com.bytedance.sdk.component.utils.ROR.CJ(cJ))));
            if (cJ3.isEmpty()) {
                return;
            }
            for (Map.Entry<String, cJ> entry : cJ3.entrySet()) {
                String key = entry.getKey();
                cJ value = entry.getValue();
                if (value.js && !z10) {
                    cJ cJVar = Qhi.get(key);
                    if (cJVar != null) {
                        cJVar.xyz = value.f9168ip;
                    }
                } else {
                    Qhi.put(key, value);
                }
            }
        } catch (Exception unused2) {
        }
    }

    private static HashMap<String, cJ> cJ(JSONArray jSONArray) {
        HashMap<String, cJ> hashMap = new HashMap<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                cJ Qhi2 = Qhi(jSONArray.getJSONObject(i10));
                if (Qhi2 != null) {
                    hashMap.put(Qhi2.Qhi, Qhi2);
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    private static File cJ() {
        return new File(com.bytedance.sdk.openadsdk.core.HzH.Qhi().getFilesDir(), "tt_ads_conf");
    }

    private static cJ cJ(String str) {
        return new cJ(str, 1);
    }

    private static cJ Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new cJ(jSONObject);
    }

    public static cJ Qhi(String str) {
        cJ cJVar = Qhi.get(str);
        return cJVar == null ? cJ(str) : cJVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bc A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void Qhi(org.json.JSONArray r5) {
        /*
            if (r5 != 0) goto L3
            return
        L3:
            java.io.File r0 = cJ()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r0.getParent()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r0.getName()
            r3.append(r4)
            java.lang.String r4 = ".tmp"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            r2 = 0
            boolean r3 = r1.exists()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L6d
            if (r3 == 0) goto L2f
            r1.delete()     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L6d
        L2f:
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L6d
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L6d
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            r3.write(r2)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            r1.renameTo(r0)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            java.lang.String r0 = "tt_sdk_settings"
            android.content.Context r2 = com.bytedance.sdk.openadsdk.core.HzH.Qhi()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            com.bytedance.sdk.openadsdk.utils.sDy r0 = com.bytedance.sdk.openadsdk.utils.sDy.Qhi(r0, r2)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            java.lang.String r2 = "ad_slot_conf"
            r0.Qhi(r2)     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5d
            boolean r0 = r1.exists()
            if (r0 == 0) goto L56
            r1.delete()
        L56:
            com.bytedance.sdk.openadsdk.utils.Gm.Qhi(r3)
            goto L79
        L5a:
            r5 = move-exception
            r2 = r3
            goto L60
        L5d:
            r2 = r3
            goto L6d
        L5f:
            r5 = move-exception
        L60:
            boolean r0 = r1.exists()
            if (r0 == 0) goto L69
            r1.delete()
        L69:
            com.bytedance.sdk.openadsdk.utils.Gm.Qhi(r2)
            throw r5
        L6d:
            boolean r0 = r1.exists()
            if (r0 == 0) goto L76
            r1.delete()
        L76:
            com.bytedance.sdk.openadsdk.utils.Gm.Qhi(r2)
        L79:
            java.util.HashMap r5 = cJ(r5)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto Lbc
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L8b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lbc
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            com.bytedance.sdk.openadsdk.core.settings.cJ r0 = (com.bytedance.sdk.openadsdk.core.settings.cJ) r0
            boolean r2 = r0.js
            if (r2 == 0) goto Lb6
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.cJ> r2 = com.bytedance.sdk.openadsdk.core.settings.ac.Qhi
            java.lang.Object r1 = r2.get(r1)
            com.bytedance.sdk.openadsdk.core.settings.cJ r1 = (com.bytedance.sdk.openadsdk.core.settings.cJ) r1
            if (r1 == 0) goto L8b
            java.lang.String r0 = r0.f9168ip
            r1.xyz = r0
            goto L8b
        Lb6:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.bytedance.sdk.openadsdk.core.settings.cJ> r2 = com.bytedance.sdk.openadsdk.core.settings.ac.Qhi
            r2.put(r1, r0)
            goto L8b
        Lbc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.ac.Qhi(org.json.JSONArray):void");
    }

    public static void Qhi() {
        File cJ = cJ();
        if (cJ.exists()) {
            cJ.delete();
        }
    }
}
