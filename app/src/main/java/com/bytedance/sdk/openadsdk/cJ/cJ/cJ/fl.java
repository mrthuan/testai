package com.bytedance.sdk.openadsdk.cJ.CJ.cJ;

import org.json.JSONObject;

/* compiled from: FeedBreakModel.java */
/* loaded from: classes.dex */
public class fl implements ac {
    public int CJ = 0;
    public long Qhi;

    /* renamed from: ac  reason: collision with root package name */
    public int f8625ac;
    public long cJ;

    public void Qhi(long j10) {
        this.Qhi = j10;
    }

    public void cJ(long j10) {
        this.cJ = j10;
    }

    public void Qhi(int i10) {
        this.f8625ac = i10;
    }

    public void cJ(int i10) {
        this.CJ = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.cJ.CJ.cJ.ac
    public void Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.Qhi);
            jSONObject.put("buffers_time", this.cJ);
            jSONObject.put("break_reason", this.f8625ac);
            jSONObject.put("video_backup", this.CJ);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("FeedBreakModel", th2.getMessage());
        }
    }
}
