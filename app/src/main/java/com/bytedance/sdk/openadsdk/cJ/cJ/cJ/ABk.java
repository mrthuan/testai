package com.bytedance.sdk.openadsdk.cJ.CJ.cJ;

import org.json.JSONObject;

/* compiled from: LoadVideoSuccessModel.java */
/* loaded from: classes.dex */
public class ABk implements ac {
    private long CJ;
    private String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private long f8618ac;
    private long cJ;

    public void Qhi(String str) {
        this.Qhi = str;
    }

    public void ac(long j10) {
        this.CJ = j10;
    }

    public void cJ(long j10) {
        this.f8618ac = j10;
    }

    public void Qhi(long j10) {
        this.cJ = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.cJ.CJ.cJ.ac
    public void Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.Qhi);
            jSONObject.put("preload_size", this.cJ);
            jSONObject.put("load_time", this.f8618ac);
            jSONObject.put("local_cache", this.CJ);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("LoadVideoSuccessModel", th2.getMessage());
        }
    }
}
