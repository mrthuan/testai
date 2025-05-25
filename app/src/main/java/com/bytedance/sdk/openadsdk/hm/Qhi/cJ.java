package com.bytedance.sdk.openadsdk.hm.Qhi;

import com.bytedance.sdk.component.Qhi.fl;
import com.bytedance.sdk.component.Qhi.kYc;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.core.NFd;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: DoInterstitialWebViewCloseMethod.java */
/* loaded from: classes.dex */
public class cJ extends com.bytedance.sdk.component.Qhi.fl<JSONObject, JSONObject> {
    private final WeakReference<NFd> Qhi;

    public cJ(NFd nFd) {
        this.Qhi = new WeakReference<>(nFd);
    }

    public static void Qhi(kYc kyc, final NFd nFd) {
        kyc.Qhi("interstitial_webview_close", new fl.cJ() { // from class: com.bytedance.sdk.openadsdk.hm.Qhi.cJ.1
            @Override // com.bytedance.sdk.component.Qhi.fl.cJ
            public com.bytedance.sdk.component.Qhi.fl Qhi() {
                return new cJ(NFd.this);
            }
        });
    }

    @Override // com.bytedance.sdk.component.Qhi.fl
    public void Qhi(JSONObject jSONObject, com.bytedance.sdk.component.Qhi.ROR ror) {
        com.bytedance.sdk.openadsdk.core.hm.cJ().HzH();
        NFd nFd = this.Qhi.get();
        if (nFd == null) {
            ABk.Qhi("DoInterstitialWebViewCloseMethod", "invoke error");
            ac();
            return;
        }
        nFd.ROR();
    }
}
