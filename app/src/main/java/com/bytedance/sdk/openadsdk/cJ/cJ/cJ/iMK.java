package com.bytedance.sdk.openadsdk.cJ.CJ.cJ;

import org.json.JSONObject;

/* compiled from: PlayBufferModel.java */
/* loaded from: classes.dex */
public class iMK implements ac {
    public long Qhi;

    /* renamed from: ac  reason: collision with root package name */
    public long f8632ac;
    public int cJ;

    public void Qhi(long j10) {
        this.Qhi = j10;
    }

    public void cJ(long j10) {
        this.f8632ac = j10;
    }

    public void Qhi(int i10) {
        this.cJ = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.cJ.CJ.cJ.ac
    public void Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.Qhi);
            jSONObject.put("buffers_count", this.cJ);
            jSONObject.put("total_duration", this.f8632ac);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("PlayBufferModel", th2.getMessage());
        }
    }
}
