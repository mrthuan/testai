package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.cJ.cJ;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: JsbDeepLinkJump.java */
/* loaded from: classes.dex */
public class kYc {
    public static void Qhi(Context context, boolean z10, JSONObject jSONObject, com.bytedance.sdk.openadsdk.core.model.tP tPVar, String str, int i10, WebView webView, com.bytedance.sdk.openadsdk.core.widget.ac acVar) {
        int optInt = jSONObject.optInt("landingStyle");
        String optString = jSONObject.optString(InMobiNetworkValues.URL);
        String optString2 = jSONObject.optString("fallback_url");
        try {
            jSONObject.put("is_activity", z10);
        } catch (JSONException unused) {
        }
        boolean z11 = true;
        com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, str, 1, jSONObject);
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        if (optInt == 0) {
            if (webView != null) {
                webView.loadUrl(optString);
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, str, 2, (JSONObject) null);
            } else {
                com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, str, -1, (JSONObject) null);
            }
        } else if (optInt != 1 && optInt != 8) {
            if (optInt == 2) {
                if (!com.bytedance.sdk.openadsdk.utils.MQ.cJ(context, optString, tPVar, str)) {
                    com.bytedance.sdk.openadsdk.Gm.Qhi.cJ cJVar = new com.bytedance.sdk.openadsdk.Gm.Qhi.cJ();
                    cJVar.Qhi(cJ.Qhi.cJ);
                    cJVar.Qhi(tPVar);
                    cJVar.cJ(str);
                    cJVar.Qhi(-1);
                    cJVar.Qhi(false);
                    cJVar.cJ(tPVar.ip());
                    com.bytedance.sdk.openadsdk.cJ.ac.Qhi(cJVar);
                    HashMap hashMap = new HashMap();
                    hashMap.put("deeplink_url", optString);
                    hashMap.put("fallback_url", optString2);
                    hashMap.put("jsb_deeplink", 1);
                    com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, str, "open_fallback_url", hashMap);
                    com.bytedance.sdk.openadsdk.utils.MQ.Qhi(context, optString2, tPVar, cJ.Qhi.cJ);
                }
            } else if (optInt == 3) {
                if (lB.cJ(context, optString, tPVar, i10, str, false)) {
                    com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, str, 3, (JSONObject) null);
                } else {
                    com.bytedance.sdk.openadsdk.cJ.ac.Qhi(tPVar, str, -2, (JSONObject) null);
                }
            } else {
                z11 = false;
            }
        } else {
            com.bytedance.sdk.openadsdk.Gm.Qhi.cJ cJVar2 = new com.bytedance.sdk.openadsdk.Gm.Qhi.cJ();
            cJVar2.Qhi(cJ.Qhi.cJ);
            cJVar2.Qhi(tPVar);
            cJVar2.cJ(str);
            cJVar2.Qhi(-1);
            cJVar2.Qhi(false);
            cJVar2.cJ(tPVar.ip());
            com.bytedance.sdk.openadsdk.cJ.ac.Qhi(cJVar2);
            com.bytedance.sdk.openadsdk.utils.MQ.Qhi(context, optString, tPVar, cJ.Qhi.cJ);
        }
        if (acVar != null && z11) {
            acVar.Qhi();
        }
    }
}
