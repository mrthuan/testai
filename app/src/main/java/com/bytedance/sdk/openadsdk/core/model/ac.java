package com.bytedance.sdk.openadsdk.core.model;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import org.json.JSONObject;

/* compiled from: AppInfo.java */
/* loaded from: classes.dex */
public class ac {
    private int ROR;
    private String Qhi = "";
    private String cJ = "";

    /* renamed from: ac  reason: collision with root package name */
    private String f9086ac = "";
    private String CJ = "";

    /* renamed from: fl  reason: collision with root package name */
    private double f9087fl = -1.0d;
    private int Tgh = -1;

    public double CJ() {
        return this.f9087fl;
    }

    public String Qhi() {
        return this.Qhi;
    }

    public String ROR() {
        return this.CJ;
    }

    public JSONObject Sf() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", cJ());
            jSONObject.put("app_size", Tgh());
            jSONObject.put("comment_num", fl());
            jSONObject.put("download_url", Qhi());
            jSONObject.put(InMobiNetworkValues.PACKAGE_NAME, ac());
            jSONObject.put("score", CJ());
            jSONObject.put("app_category", ROR());
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.ABk.cJ(e10.toString());
        }
        return jSONObject;
    }

    public int Tgh() {
        return this.ROR;
    }

    public String ac() {
        return this.f9086ac;
    }

    public String cJ() {
        return this.cJ;
    }

    public int fl() {
        return this.Tgh;
    }

    public void CJ(String str) {
        this.CJ = str;
    }

    public void Qhi(String str) {
        this.Qhi = str;
    }

    public void ac(String str) {
        this.f9086ac = str;
    }

    public void cJ(String str) {
        this.cJ = str;
    }

    public void Qhi(double d10) {
        if (d10 >= 1.0d && d10 <= 5.0d) {
            this.f9087fl = d10;
        } else {
            this.f9087fl = -1.0d;
        }
    }

    public void cJ(int i10) {
        this.ROR = i10;
    }

    public void Qhi(int i10) {
        if (i10 <= 0) {
            this.Tgh = -1;
        } else {
            this.Tgh = i10;
        }
    }
}
