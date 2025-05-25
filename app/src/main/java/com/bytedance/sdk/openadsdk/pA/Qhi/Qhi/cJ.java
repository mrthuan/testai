package com.bytedance.sdk.openadsdk.pA.Qhi.Qhi;

import a6.h;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.js;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: DeepLinkUtils.java */
/* loaded from: classes.dex */
public class cJ {
    public static boolean Qhi(Context context, String str, tP tPVar) {
        String Qhi = js.Qhi(tPVar);
        int i10 = 1;
        com.bytedance.sdk.openadsdk.core.fl.Qhi(tPVar, Qhi, 1, null);
        Intent Qhi2 = Qhi(context, str);
        if (!TextUtils.isEmpty(str) && Qhi2 != null) {
            boolean Sf = js.Sf(context);
            HashMap h10 = h.h(InMobiNetworkValues.URL, str);
            if (Sf) {
                js.cJ cJ = js.cJ(context, Qhi2);
                if (cJ.cJ > 0) {
                    try {
                        Qhi(context, tPVar, h10);
                        h10.put("matched_count", Integer.valueOf(cJ.cJ));
                        ComponentName componentName = cJ.Qhi;
                        if (componentName != null) {
                            Qhi2.setComponent(componentName);
                        }
                    } catch (Throwable th2) {
                        ABk.Qhi("DeepLinkUtils", th2.getMessage());
                    }
                } else {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("intent", Qhi2.toString());
                        jSONObject.put("can_query_install", 1);
                    } catch (Exception unused) {
                    }
                    com.bytedance.sdk.openadsdk.core.fl.Qhi(tPVar, Qhi, -3, jSONObject);
                    return false;
                }
            }
            try {
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, Qhi, "open_url_app", h10);
                context.startActivity(Qhi2);
                com.bytedance.sdk.openadsdk.cJ.ABk.Qhi().Qhi(h10).Qhi(tPVar, Qhi);
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi("dp_start_act_success", tPVar, Qhi, h10);
                return true;
            } catch (Throwable th3) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("exception", th3.getMessage());
                    jSONObject2.put("intent", Qhi2.toString());
                    if (!Sf) {
                        i10 = 0;
                    }
                    jSONObject2.put("can_query_install", i10);
                } catch (Exception unused2) {
                }
                com.bytedance.sdk.openadsdk.core.fl.Qhi(tPVar, Qhi, -4, jSONObject2);
                return false;
            }
        }
        com.bytedance.sdk.openadsdk.core.fl.Qhi(tPVar, Qhi, -2, tPVar.ReL().CJ());
        return false;
    }

    private static Intent Qhi(Context context, String str) {
        try {
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        } catch (Throwable th2) {
            ABk.Qhi("DeepLinkUtils", th2.getMessage());
            return null;
        }
    }

    private static void Qhi(Context context, tP tPVar, Map<String, Object> map) {
        if (tPVar != null && tPVar.nR() == 0) {
            map.put("auto_click", Boolean.valueOf(!tPVar.CJ()));
        }
        map.put("can_query_install", Integer.valueOf(js.Sf(context) ? 1 : 0));
    }
}
