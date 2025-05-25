package com.bytedance.sdk.openadsdk.cJ.CJ.cJ;

import org.json.JSONObject;

/* compiled from: LoadVideoErrorModel.java */
/* loaded from: classes.dex */
public class Gm implements ac {
    private int CJ;
    private String Qhi;
    private String Tgh;

    /* renamed from: ac  reason: collision with root package name */
    private long f8619ac;
    private long cJ;

    /* renamed from: fl  reason: collision with root package name */
    private String f8620fl;

    public void Qhi(String str) {
        this.Qhi = str;
    }

    public void ac(String str) {
        this.Tgh = str;
    }

    public void cJ(long j10) {
        this.f8619ac = j10;
    }

    public void Qhi(long j10) {
        this.cJ = j10;
    }

    public void cJ(String str) {
        this.f8620fl = str;
    }

    public void Qhi(int i10) {
        this.CJ = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.cJ.CJ.cJ.ac
    public void Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.Qhi);
            jSONObject.put("preload_size", this.cJ);
            jSONObject.put("load_time", this.f8619ac);
            jSONObject.put("error_code", this.CJ);
            jSONObject.put("error_message", this.f8620fl);
            jSONObject.put("error_message_server", this.Tgh);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("LoadVideoErrorModel", th2.getMessage());
        }
    }
}
