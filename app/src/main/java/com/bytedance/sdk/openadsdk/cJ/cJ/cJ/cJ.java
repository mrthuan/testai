package com.bytedance.sdk.openadsdk.cJ.CJ.cJ;

import org.json.JSONObject;

/* compiled from: EndcardSkipModel.java */
/* loaded from: classes.dex */
public class cJ implements ac {
    private int CJ;
    private long Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private int f8624ac;
    private long cJ;

    public void Qhi(long j10) {
        this.Qhi = j10;
    }

    public void cJ(long j10) {
        this.cJ = j10;
    }

    public void Qhi(int i10) {
        this.f8624ac = i10;
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
            jSONObject.put("buffers_time", this.Qhi);
            jSONObject.put("total_duration", this.cJ);
            jSONObject.put("vbtt_skip_type", this.f8624ac);
            jSONObject.put("skip_reason", this.CJ);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("EndcardSkipModel", th2.getMessage());
        }
    }
}
