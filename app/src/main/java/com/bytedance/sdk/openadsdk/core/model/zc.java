package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* compiled from: DeepLink.java */
/* loaded from: classes.dex */
public class zc {
    private String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private int f9118ac;
    private String cJ;

    public JSONObject CJ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("u", this.Qhi);
            jSONObject.put("ft", this.f9118ac);
            jSONObject.put("fu", this.cJ);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public String Qhi() {
        return this.Qhi;
    }

    public int ac() {
        return this.f9118ac;
    }

    public String cJ() {
        return this.cJ;
    }

    public void Qhi(String str) {
        this.Qhi = str;
    }

    public void cJ(String str) {
        this.cJ = str;
    }

    public void Qhi(int i10) {
        this.f9118ac = i10;
    }
}
