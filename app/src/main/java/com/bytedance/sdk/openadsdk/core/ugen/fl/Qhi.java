package com.bytedance.sdk.openadsdk.core.ugen.fl;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UGenTemplateModel.java */
/* loaded from: classes.dex */
public class Qhi {
    private String CJ;
    private String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private String f9209ac;
    private String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private String f9210fl;

    public String CJ() {
        return this.CJ;
    }

    public String Qhi() {
        return this.Qhi;
    }

    public String ac() {
        return this.f9209ac;
    }

    public String cJ() {
        return this.cJ;
    }

    public String fl() {
        return this.f9210fl;
    }

    public Qhi CJ(String str) {
        this.CJ = str;
        return this;
    }

    public Qhi Qhi(String str) {
        this.Qhi = str;
        return this;
    }

    public Qhi ac(String str) {
        this.f9209ac = str;
        return this;
    }

    public Qhi cJ(String str) {
        this.cJ = str;
        return this;
    }

    public Qhi fl(String str) {
        this.f9210fl = str;
        return this;
    }

    public JSONObject Qhi(Qhi qhi) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FacebookMediationAdapter.KEY_ID, this.Qhi);
            jSONObject.put("md5", this.cJ);
            jSONObject.put(InMobiNetworkValues.URL, this.f9209ac);
            if (qhi != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(FacebookMediationAdapter.KEY_ID, qhi.Qhi());
                jSONObject2.put("md5", qhi.cJ());
                jSONObject2.put(InMobiNetworkValues.URL, qhi.ac());
                jSONObject.put("overlay", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
