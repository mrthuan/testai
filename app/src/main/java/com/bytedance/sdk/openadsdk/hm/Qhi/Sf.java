package com.bytedance.sdk.openadsdk.hm.Qhi;

import com.bytedance.sdk.component.Qhi.kYc;
import com.bytedance.sdk.openadsdk.core.NFd;
import org.json.JSONObject;

/* compiled from: PlayableEndCardOverlayMethod.java */
/* loaded from: classes.dex */
public class Sf extends com.bytedance.sdk.component.Qhi.Tgh<JSONObject, JSONObject> {
    private final NFd Qhi;

    public Sf(NFd nFd) {
        this.Qhi = nFd;
    }

    public static void Qhi(kYc kyc, NFd nFd) {
        kyc.Qhi("overlayRenderFinish", new Sf(nFd));
    }

    @Override // com.bytedance.sdk.component.Qhi.Tgh
    public JSONObject Qhi(JSONObject jSONObject, com.bytedance.sdk.component.Qhi.ROR ror) {
        this.Qhi.zc();
        return null;
    }
}
