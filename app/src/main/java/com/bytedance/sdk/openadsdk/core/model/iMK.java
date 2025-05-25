package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: DspStyle.java */
/* loaded from: classes.dex */
public class iMK {
    private final int CJ;
    private final int Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final int f9099ac;
    private final int cJ;

    public iMK(JSONObject jSONObject) {
        this.Qhi = jSONObject.optInt("auto_click", 0);
        this.cJ = jSONObject.optInt("close_jump_probability", 0);
        this.f9099ac = jSONObject.optInt("skip_jump_probability", 0);
        this.CJ = jSONObject.optInt("hidden_bar", 0);
    }

    public boolean CJ() {
        if (this.CJ == 1) {
            return true;
        }
        return false;
    }

    public int Qhi() {
        return this.Qhi;
    }

    public int ac() {
        int i10 = this.f9099ac;
        if (i10 >= 0 && i10 <= 100) {
            return i10;
        }
        return 0;
    }

    public int cJ() {
        int i10 = this.cJ;
        if (i10 >= 0 && i10 <= 100) {
            return i10;
        }
        return 0;
    }

    public JSONObject fl() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i10 = this.Qhi;
            if (i10 == 1) {
                jSONObject.put("auto_click", i10);
            }
            int i11 = this.cJ;
            if (i11 > 0 && i11 <= 100) {
                jSONObject.put("close_jump_probability", i11);
            }
            int i12 = this.f9099ac;
            if (i12 > 0 && i12 <= 100) {
                jSONObject.put("skip_jump_probability", i12);
            }
            if (this.CJ == 1) {
                jSONObject.put("hidden_bar", 1);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static boolean Qhi(tP tPVar) {
        if (tPVar == null || !tPVar.IC() || tPVar.eG() == null) {
            return false;
        }
        return tPVar.eG().CJ();
    }
}
