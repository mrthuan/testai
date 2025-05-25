package com.bytedance.sdk.openadsdk.core.model;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ArbitrageInterceptorInfo.java */
/* loaded from: classes.dex */
public class Tgh {
    private int CJ;
    private int Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private List<Integer> f9082ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private List<String> f9083fl;

    public List<Integer> CJ() {
        return this.f9082ac;
    }

    public List<String> Qhi() {
        return this.f9083fl;
    }

    public JSONObject Tgh() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("interceptor_x", this.Qhi);
            jSONObject.put("interceptor_y", this.cJ);
            if (this.f9082ac != null) {
                JSONArray jSONArray = new JSONArray();
                for (Integer num : this.f9082ac) {
                    jSONArray.put(num.intValue());
                }
                jSONObject.put("interceptor_page", jSONArray);
            }
            jSONObject.put("interceptor_interval_time", this.CJ);
            if (this.f9083fl != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (String str : this.f9083fl) {
                    jSONArray2.put(str);
                }
                jSONObject.put("url_regular", jSONArray2);
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.cJ(th2.getMessage());
        }
        return jSONObject;
    }

    public int ac() {
        return this.cJ;
    }

    public int cJ() {
        return this.Qhi;
    }

    public int fl() {
        return this.CJ;
    }

    public void Qhi(List<String> list) {
        this.f9083fl = list;
    }

    public void ac(int i10) {
        this.CJ = i10;
    }

    public void cJ(int i10) {
        this.cJ = i10;
    }

    public void Qhi(int i10) {
        this.Qhi = i10;
    }

    public void cJ(List<Integer> list) {
        this.f9082ac = list;
    }
}
