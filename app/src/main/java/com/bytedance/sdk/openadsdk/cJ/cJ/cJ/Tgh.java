package com.bytedance.sdk.openadsdk.cJ.CJ.cJ;

import org.json.JSONObject;

/* compiled from: FeedContinueModel.java */
/* loaded from: classes.dex */
public class Tgh implements ac {
    private long Qhi;
    private long cJ;

    public void Qhi(long j10) {
        this.Qhi = j10;
    }

    public void cJ(long j10) {
        this.cJ = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.cJ.CJ.cJ.ac
    public void Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.Qhi);
            jSONObject.put("total_duration", this.cJ);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("FeedContinueModel", th2.getMessage());
        }
    }
}
