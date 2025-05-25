package com.bytedance.sdk.openadsdk.core.settings;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.component.utils.bxS;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.Eh;
import com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.js;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import com.inmobi.sdk.InMobiSdk;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsFetchTask.java */
/* loaded from: classes.dex */
public class pA extends com.bytedance.sdk.component.Sf.hm {
    private final Qhi Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final Set<Tgh> f9180ac;
    private final iMK cJ;

    /* compiled from: SettingsFetchTask.java */
    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi(boolean z10);
    }

    public pA(Qhi qhi, iMK imk, Tgh... tghArr) {
        super("SetF");
        HashSet hashSet = new HashSet();
        this.f9180ac = hashSet;
        this.Qhi = qhi;
        this.cJ = imk;
        hashSet.addAll(Arrays.asList(tghArr));
    }

    private JSONObject cJ(JSONObject jSONObject) {
        return com.bytedance.sdk.component.utils.Qhi.Qhi(jSONObject);
    }

    @Override // java.lang.Runnable
    public void run() {
        int Qhi2 = bxS.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi(), 0L);
        if (Qhi2 == 0) {
            this.Qhi.Qhi(false);
            return;
        }
        final com.bytedance.sdk.openadsdk.Gm.Qhi.Tgh tgh = new com.bytedance.sdk.openadsdk.Gm.Qhi.Tgh(1);
        JSONObject Qhi3 = Qhi(Qhi2);
        com.bytedance.sdk.component.ROR.cJ.fl cJ = com.bytedance.sdk.openadsdk.iMK.ac.Qhi().cJ().cJ();
        try {
            String Qhi4 = com.bytedance.sdk.openadsdk.Tgh.fl.Qhi(cJ, js.CJ("/api/ad/union/sdk/settings/"));
            cJ.cJ(Qhi4);
            cJ.cJ("User-Agent", js.ac());
            tgh.Qhi(Qhi4);
        } catch (Exception unused) {
        }
        String jSONObject = cJ(Qhi3).toString();
        if (com.bytedance.sdk.openadsdk.core.HzH.CJ().cjC() && Eh.Qhi().ROR() == 1) {
            js.Qhi("Pangle_Debug_Mode", jSONObject, com.bytedance.sdk.openadsdk.core.HzH.Qhi());
        }
        cJ.Qhi(jSONObject, com.bytedance.sdk.openadsdk.core.HzH.CJ().kYc());
        tgh.Qhi(cJ.ac()).Qhi();
        cJ.Qhi(6);
        cJ.Qhi("setting");
        com.bytedance.sdk.openadsdk.ABk.ac.Qhi(new com.bytedance.sdk.openadsdk.ABk.fl() { // from class: com.bytedance.sdk.openadsdk.core.settings.pA.1
            @Override // com.bytedance.sdk.openadsdk.ABk.fl
            public com.bytedance.sdk.openadsdk.ABk.cJ.Qhi generatorModel() {
                com.bytedance.sdk.openadsdk.ABk.cJ.Qhi qhi = new com.bytedance.sdk.openadsdk.ABk.cJ.Qhi();
                qhi.cJ("settings_fetch");
                return qhi;
            }
        });
        cJ.Qhi(new com.bytedance.sdk.component.ROR.Qhi.Qhi() { // from class: com.bytedance.sdk.openadsdk.core.settings.pA.2
            @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
            public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, com.bytedance.sdk.component.ROR.cJ cJVar) {
                JSONObject jSONObject2;
                int optInt;
                int Qhi5 = cJVar.Qhi();
                String CJ = cJVar.CJ();
                if (com.bytedance.sdk.openadsdk.core.HzH.CJ().cjC() && Eh.Qhi().ROR() == 1) {
                    js.Qhi("Pangle_Debug_Mode", CJ, com.bytedance.sdk.openadsdk.core.HzH.Qhi());
                }
                if (cJVar.Tgh() && !TextUtils.isEmpty(CJ)) {
                    tgh.ac(CJ).Qhi(Qhi5).Qhi(true).ac();
                    String str = null;
                    try {
                        jSONObject2 = new JSONObject(CJ);
                    } catch (JSONException unused2) {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null && (optInt = jSONObject2.optInt("cypher", -1)) != -1) {
                        if (optInt == 3) {
                            str = com.bytedance.sdk.component.utils.Qhi.ac(jSONObject2.optString(PglCryptUtils.KEY_MESSAGE));
                            if (!TextUtils.isEmpty(str)) {
                                try {
                                    jSONObject2 = new JSONObject(str);
                                } catch (Throwable unused3) {
                                }
                            }
                        }
                        try {
                            pA.this.Qhi(str, cJVar.ac());
                        } catch (Throwable unused4) {
                        }
                        try {
                            pA.this.Qhi(jSONObject2);
                            com.bytedance.sdk.openadsdk.core.HzH.CJ().Qhi(System.currentTimeMillis());
                            com.bytedance.sdk.openadsdk.ABk.ac.cJ(new com.bytedance.sdk.openadsdk.ABk.fl() { // from class: com.bytedance.sdk.openadsdk.core.settings.pA.2.1
                                @Override // com.bytedance.sdk.openadsdk.ABk.fl
                                public com.bytedance.sdk.openadsdk.ABk.cJ.Qhi generatorModel() {
                                    com.bytedance.sdk.openadsdk.ABk.cJ.Qhi qhi = new com.bytedance.sdk.openadsdk.ABk.cJ.Qhi();
                                    qhi.cJ("settings_fetch");
                                    return qhi;
                                }
                            });
                        } catch (Throwable unused5) {
                        }
                        pA.this.Qhi.Qhi(true);
                        com.bytedance.sdk.openadsdk.core.Tgh.Qhi.Qhi();
                        return;
                    }
                } else {
                    com.bytedance.sdk.openadsdk.ABk.ac.ac(new com.bytedance.sdk.openadsdk.ABk.fl() { // from class: com.bytedance.sdk.openadsdk.core.settings.pA.2.2
                        @Override // com.bytedance.sdk.openadsdk.ABk.fl
                        public com.bytedance.sdk.openadsdk.ABk.cJ.Qhi generatorModel() {
                            com.bytedance.sdk.openadsdk.ABk.cJ.Qhi qhi = new com.bytedance.sdk.openadsdk.ABk.cJ.Qhi();
                            qhi.cJ("settings_fetch");
                            return qhi;
                        }
                    });
                }
                tgh.ac(CJ).Qhi(Qhi5).CJ(cJVar.cJ()).Qhi(cJVar.Tgh()).ac();
                pA.this.Qhi.Qhi(false);
            }

            @Override // com.bytedance.sdk.component.ROR.Qhi.Qhi
            public void Qhi(com.bytedance.sdk.component.ROR.cJ.ac acVar, IOException iOException) {
                tgh.CJ(iOException != null ? iOException.getMessage() : null).Qhi(false).ac();
                pA.this.Qhi.Qhi(false);
                com.bytedance.sdk.openadsdk.core.Tgh.Qhi.Qhi();
                com.bytedance.sdk.openadsdk.ABk.ac.ac(new com.bytedance.sdk.openadsdk.ABk.fl() { // from class: com.bytedance.sdk.openadsdk.core.settings.pA.2.3
                    @Override // com.bytedance.sdk.openadsdk.ABk.fl
                    public com.bytedance.sdk.openadsdk.ABk.cJ.Qhi generatorModel() {
                        com.bytedance.sdk.openadsdk.ABk.cJ.Qhi qhi = new com.bytedance.sdk.openadsdk.ABk.cJ.Qhi();
                        qhi.cJ("settings_fetch");
                        return qhi;
                    }
                });
            }
        });
        DeviceUtils.Gm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi(String str, Map<String, String> map) {
        int i10 = 1;
        try {
            if (!TextUtils.isEmpty(str) && map != null) {
                HashMap hashMap = new HashMap();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        hashMap.put(key.toLowerCase(Locale.US), entry.getValue());
                    }
                }
                int parseInt = Integer.parseInt((String) hashMap.get("active-control"));
                long parseLong = Long.parseLong((String) hashMap.get("ts"));
                String str2 = (String) hashMap.get("pst");
                String Qhi2 = com.bykv.vk.openvk.component.video.api.Tgh.cJ.Qhi(str + parseInt + parseLong);
                if (Qhi2 != null) {
                    if (Qhi2.equalsIgnoreCase(str2)) {
                        i10 = parseInt;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        ABk.Qhi(i10);
    }

    public static JSONObject Qhi(int i10) {
        JSONObject jSONObject = new JSONObject();
        try {
            ROR CJ = com.bytedance.sdk.openadsdk.core.HzH.CJ();
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("device_city", js.pA());
            if (CJ.aP("gaid")) {
                jSONObject.put("gaid", com.bytedance.sdk.openadsdk.pA.Qhi.cJ.Qhi.Qhi().cJ());
            }
            jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_GDPR_APPLIES, com.bytedance.sdk.openadsdk.core.hm.cJ().hm());
            jSONObject.put("coppa", com.bytedance.sdk.openadsdk.core.hm.cJ().Sf());
            jSONObject.put("ccpa", com.bytedance.sdk.openadsdk.core.hm.cJ().MQ());
            if (CJ.aP("mcc")) {
                jSONObject.put("mcc", com.bytedance.sdk.openadsdk.utils.Eh.cJ());
            }
            Context Qhi2 = com.bytedance.sdk.openadsdk.core.HzH.Qhi();
            jSONObject.put("conn_type", js.ROR(i10));
            int i11 = 1;
            jSONObject.put("os", 1);
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("aos_api_level", Build.VERSION.SDK_INT);
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("language", com.bytedance.sdk.openadsdk.core.zc.Qhi());
            jSONObject.put("time_zone", js.kYc());
            jSONObject.put(InMobiNetworkValues.PACKAGE_NAME, js.fl());
            if (!js.Qhi()) {
                i11 = 2;
            }
            jSONObject.put("position", i11);
            jSONObject.put("app_version", js.ROR());
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("uuid", com.bytedance.sdk.openadsdk.core.zc.ac(Qhi2));
            String CJ2 = com.bytedance.sdk.openadsdk.core.hm.cJ().CJ();
            if (CJ2 != null) {
                jSONObject.put("app_id", CJ2);
            }
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            jSONObject.put("ts", currentTimeMillis);
            jSONObject.put("req_sign", com.bytedance.sdk.component.utils.Tgh.Qhi(CJ2 != null ? CJ2.concat(String.valueOf(currentTimeMillis)).concat(BuildConfig.VERSION_NAME) : ""));
            jSONObject.put("tcstring", HzH.ac(Qhi2));
            jSONObject.put("tcf_gdpr", HzH.cJ(Qhi2));
            jSONObject.put("lmt", DeviceUtils.ac());
            jSONObject.put("locale_language", DeviceUtils.CJ());
            jSONObject.put("channel", "main");
            JSONObject fl2 = CJ.fl();
            if (fl2 != null) {
                jSONObject.put("digest", fl2);
            }
            jSONObject.put("data_time", CJ.Tgh());
            jSONObject.put("app_set_id_scope", fl.cJ());
            jSONObject.put("app_set_id", fl.ac());
            jSONObject.put("installed_source", fl.CJ());
            if (CJ.aP("gaid")) {
                jSONObject.put("did", com.bytedance.sdk.openadsdk.core.zc.Qhi(com.bytedance.sdk.openadsdk.core.HzH.Qhi()));
            }
            String fl3 = com.bytedance.sdk.openadsdk.core.hm.cJ().fl();
            if (!TextUtils.isEmpty(fl3)) {
                jSONObject.put("mediation", fl3);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public boolean Qhi(JSONObject jSONObject) {
        this.cJ.Qhi(jSONObject);
        for (Tgh tgh : this.f9180ac) {
            if (tgh != null) {
                tgh.Qhi(jSONObject);
            }
        }
        return this.cJ.f9178ac;
    }

    public static boolean Qhi() {
        return BinderPoolService.Qhi;
    }
}
