package com.bytedance.sdk.component.Sf.cJ;

import org.json.JSONObject;

/* compiled from: ThreadLogModel.java */
/* loaded from: classes.dex */
public class Qhi {
    public int CJ;
    public int Qhi;

    /* renamed from: ac  reason: collision with root package name */
    public int f8047ac;
    public int cJ;

    public Qhi(int i10, int i11, int i12, int i13) {
        this.Qhi = i10;
        this.cJ = i11;
        this.f8047ac = i12;
        this.CJ = i13;
    }

    public JSONObject Qhi() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.Qhi);
            jSONObject.put("sdk_max_thread_num", this.cJ);
            jSONObject.put("app_thread_num", this.f8047ac);
            jSONObject.put("app_max_thread_num", this.CJ);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
