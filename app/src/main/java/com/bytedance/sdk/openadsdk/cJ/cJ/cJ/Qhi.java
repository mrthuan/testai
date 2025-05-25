package com.bytedance.sdk.openadsdk.cJ.CJ.cJ;

import com.bytedance.sdk.openadsdk.cJ.CJ.cJ.ac;
import com.bytedance.sdk.openadsdk.core.model.tP;
import org.json.JSONObject;

/* compiled from: BaseEventModel.java */
/* loaded from: classes.dex */
public class Qhi<T extends ac> {
    private T CJ;
    private tP Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private JSONObject f8621ac;
    private String cJ;

    /* renamed from: fl  reason: collision with root package name */
    private boolean f8622fl = false;

    public Qhi(tP tPVar, String str, JSONObject jSONObject, T t4) {
        this.Qhi = tPVar;
        this.cJ = str;
        this.f8621ac = jSONObject;
        this.CJ = t4;
    }

    public T CJ() {
        return this.CJ;
    }

    public tP Qhi() {
        return this.Qhi;
    }

    public JSONObject ac() {
        if (this.f8621ac == null) {
            this.f8621ac = new JSONObject();
        }
        return this.f8621ac;
    }

    public String cJ() {
        return this.cJ;
    }

    public boolean fl() {
        return this.f8622fl;
    }

    public void Qhi(boolean z10) {
        this.f8622fl = z10;
    }
}
