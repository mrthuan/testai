package com.bytedance.sdk.openadsdk.hm.Qhi;

import com.bytedance.sdk.component.Qhi.kYc;
import com.bytedance.sdk.component.widget.SSWebView;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: PreventTouchEventMethod.java */
/* loaded from: classes.dex */
public class hm extends com.bytedance.sdk.component.Qhi.Tgh<JSONObject, JSONObject> {
    private WeakReference<SSWebView> Qhi;

    public hm(SSWebView sSWebView) {
        this.Qhi = new WeakReference<>(sSWebView);
    }

    public static void Qhi(kYc kyc, SSWebView sSWebView) {
        kyc.Qhi("preventTouchEvent", new hm(sSWebView));
    }

    @Override // com.bytedance.sdk.component.Qhi.Tgh
    public JSONObject Qhi(JSONObject jSONObject, com.bytedance.sdk.component.Qhi.ROR ror) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean optBoolean = jSONObject.optBoolean("isPrevent", false);
            SSWebView sSWebView = this.Qhi.get();
            if (sSWebView != null) {
                sSWebView.setIsPreventTouchEvent(optBoolean);
                jSONObject2.put("success", true);
            } else {
                jSONObject2.put("success", false);
            }
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
        }
        return jSONObject2;
    }
}
