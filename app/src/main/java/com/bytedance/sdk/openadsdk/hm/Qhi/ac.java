package com.bytedance.sdk.openadsdk.hm.Qhi;

import com.bytedance.sdk.component.Qhi.fl;
import com.bytedance.sdk.component.Qhi.kYc;
import com.bytedance.sdk.openadsdk.core.NFd;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: DoNewClickEventMethod.java */
/* loaded from: classes.dex */
public class ac extends com.bytedance.sdk.component.Qhi.fl<JSONObject, JSONObject> {
    private final WeakReference<NFd> Qhi;

    public ac(NFd nFd) {
        this.Qhi = new WeakReference<>(nFd);
    }

    public static void Qhi(kYc kyc, final NFd nFd) {
        kyc.Qhi("newClickEvent", new fl.cJ() { // from class: com.bytedance.sdk.openadsdk.hm.Qhi.ac.1
            @Override // com.bytedance.sdk.component.Qhi.fl.cJ
            public com.bytedance.sdk.component.Qhi.fl Qhi() {
                return new ac(NFd.this);
            }
        });
    }

    @Override // com.bytedance.sdk.component.Qhi.fl
    public void Qhi(JSONObject jSONObject, com.bytedance.sdk.component.Qhi.ROR ror) {
        NFd nFd = this.Qhi.get();
        if (nFd == null) {
            ac();
        } else {
            nFd.ac(jSONObject);
        }
    }
}
