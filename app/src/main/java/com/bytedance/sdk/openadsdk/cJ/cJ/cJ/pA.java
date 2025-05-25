package com.bytedance.sdk.openadsdk.cJ.CJ.cJ;

import org.json.JSONObject;

/* compiled from: PlayErrorModel.java */
/* loaded from: classes.dex */
public class pA implements ac {
    private final int CJ;
    private long Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final int f8633ac;
    private long cJ;

    /* renamed from: fl  reason: collision with root package name */
    private final String f8634fl;

    public pA(com.bykv.vk.openvk.component.video.api.ac.Qhi qhi) {
        this.f8633ac = qhi.Qhi();
        this.CJ = qhi.cJ();
        this.f8634fl = qhi.ac();
    }

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
            jSONObject.put("error_code", this.f8633ac);
            jSONObject.put("extra_error_code", this.CJ);
            jSONObject.put("error_message", this.f8634fl);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("PlayErrorModel", th2.getMessage());
        }
    }
}
