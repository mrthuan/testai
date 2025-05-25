package com.bytedance.sdk.openadsdk.hm.Qhi;

import com.bytedance.sdk.component.Qhi.kYc;
import com.bytedance.sdk.openadsdk.core.NFd;
import org.json.JSONObject;

/* compiled from: OneSlotMultipleAdJSMethod.java */
/* loaded from: classes.dex */
public class ROR extends com.bytedance.sdk.component.Qhi.Tgh<JSONObject, JSONObject> {
    private final NFd Qhi;
    private final String cJ;

    public ROR(NFd nFd, String str) {
        this.Qhi = nFd;
        this.cJ = str;
    }

    public static void Qhi(kYc kyc, NFd nFd) {
        kyc.Qhi("endcardDynamicCreatives", new ROR(nFd, "endcardDynamicCreatives"));
        kyc.Qhi("multiOpenCovert", new ROR(nFd, "multiOpenCovert"));
    }

    @Override // com.bytedance.sdk.component.Qhi.Tgh
    public JSONObject Qhi(JSONObject jSONObject, com.bytedance.sdk.component.Qhi.ROR ror) {
        if ("endcardDynamicCreatives".equals(this.cJ)) {
            return this.Qhi.fl(jSONObject);
        }
        if ("multiOpenCovert".equals(this.cJ)) {
            this.Qhi.Tgh(jSONObject);
            return null;
        }
        return null;
    }
}
