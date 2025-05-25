package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* compiled from: OemModel.java */
/* loaded from: classes.dex */
public class EBS {
    private int CJ;
    private String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private int f9062ac;
    private String cJ;

    public void Qhi(String str) {
        this.Qhi = str;
    }

    public JSONObject ac() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.Qhi)) {
                jSONObject.put("market_dpl", this.Qhi);
            }
            if (!TextUtils.isEmpty(this.cJ)) {
                jSONObject.put("market_dpl_auto", this.cJ);
            }
            jSONObject.put("exec_type", this.f9062ac);
            jSONObject.put("oem_vendor_type", this.CJ);
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("OemModel", th2.getMessage());
            return null;
        }
    }

    public void cJ(String str) {
        this.cJ = str;
    }

    public void Qhi(int i10) {
        this.f9062ac = i10;
    }

    public void cJ(int i10) {
        this.CJ = i10;
    }

    public boolean Qhi() {
        return this.CJ == 1;
    }

    public String cJ() {
        if (this.f9062ac == 2) {
            return this.cJ;
        }
        return this.Qhi;
    }

    public static EBS Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        EBS ebs = new EBS();
        try {
            ebs.Qhi(jSONObject.optString("market_dpl", ""));
            ebs.cJ(jSONObject.optString("market_dpl_auto", ""));
            ebs.Qhi(jSONObject.optInt("exec_type", 0));
            ebs.cJ(jSONObject.optInt("oem_vendor_type", 0));
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("OemModel", th2.getMessage());
        }
        return ebs;
    }
}
