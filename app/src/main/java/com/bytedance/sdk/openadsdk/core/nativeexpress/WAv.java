package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.tP;
import org.json.JSONObject;

/* compiled from: ExpressEventManager.java */
/* loaded from: classes.dex */
public class WAv {
    public static void Qhi(String str, int i10, String str2, String str3, String str4, tP tPVar) {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.Sf.Qhi(i10);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            tP.Qhi es = tPVar.es();
            if (es != null) {
                jSONObject.put("tpl_id", es.fl());
                if ("Web".equals(str)) {
                    if (es.ABk()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.Gm.ac.Qhi().Qhi(com.bytedance.sdk.openadsdk.Gm.Qhi.fl.cJ().Qhi(Qhi(str3)).ac(str4).fl(tPVar != null ? tPVar.jWV() : "").cJ(i10).cJ(jSONObject.toString()).Tgh(str2));
    }

    private static int Qhi(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1695837674:
                if (str.equals("banner_ad")) {
                    c = 0;
                    break;
                }
                break;
            case -1364000502:
                if (str.equals("rewarded_video")) {
                    c = 1;
                    break;
                }
                break;
            case -1263194568:
                if (str.equals("open_ad")) {
                    c = 2;
                    break;
                }
                break;
            case -764631662:
                if (str.equals("fullscreen_interstitial_ad")) {
                    c = 3;
                    break;
                }
                break;
            case 1844104722:
                if (str.equals("interaction")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 7;
            case 2:
                return 3;
            case 3:
                return 8;
            case 4:
                return 2;
            default:
                return 5;
        }
    }
}
