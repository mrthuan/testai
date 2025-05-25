package com.bytedance.sdk.openadsdk.hm.Qhi;

import com.bytedance.sdk.component.Qhi.fl;
import com.bytedance.sdk.component.Qhi.kYc;
import com.bytedance.sdk.openadsdk.core.NFd;
import com.bytedance.sdk.openadsdk.core.model.tP;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DoGetAdsFromNetworkAsyncMethod.java */
/* loaded from: classes.dex */
public class Qhi extends com.bytedance.sdk.component.Qhi.fl<JSONObject, JSONObject> {
    private final WeakReference<NFd> Qhi;

    public Qhi(NFd nFd) {
        this.Qhi = new WeakReference<>(nFd);
    }

    public static void Qhi(kYc kyc, final NFd nFd) {
        kyc.Qhi("getNetworkData", new fl.cJ() { // from class: com.bytedance.sdk.openadsdk.hm.Qhi.Qhi.1
            @Override // com.bytedance.sdk.component.Qhi.fl.cJ
            public com.bytedance.sdk.component.Qhi.fl Qhi() {
                return new Qhi(NFd.this);
            }
        });
    }

    @Override // com.bytedance.sdk.component.Qhi.fl
    public void Qhi(JSONObject jSONObject, com.bytedance.sdk.component.Qhi.ROR ror) {
        NFd nFd = this.Qhi.get();
        if (nFd == null) {
            ac();
        } else {
            nFd.Qhi(jSONObject, new com.bytedance.sdk.openadsdk.WAv.ac() { // from class: com.bytedance.sdk.openadsdk.hm.Qhi.Qhi.2
                @Override // com.bytedance.sdk.openadsdk.WAv.ac
                public void Qhi(boolean z10, List<tP> list) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        if (!z10) {
                            Qhi.this.Qhi((Qhi) jSONObject2);
                            return;
                        }
                        jSONObject2.put("creatives", NFd.cJ(list));
                        Qhi.this.Qhi((Qhi) jSONObject2);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
