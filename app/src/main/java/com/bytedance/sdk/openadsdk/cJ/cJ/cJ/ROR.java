package com.bytedance.sdk.openadsdk.cJ.CJ.cJ;

import org.json.JSONObject;

/* compiled from: FeedOverModel.java */
/* loaded from: classes.dex */
public class ROR implements ac {
    private long Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private int f8623ac = 0;
    private long cJ;

    public void Qhi(long j10) {
        this.Qhi = j10;
    }

    public void cJ(long j10) {
        this.cJ = j10;
    }

    public void Qhi(int i10) {
        this.f8623ac = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.cJ.CJ.cJ.ac
    public void Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.Qhi);
            jSONObject.put("buffers_time", this.cJ);
            jSONObject.put("video_backup", this.f8623ac);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("FeedOverModel", th2.getMessage());
        }
    }
}
