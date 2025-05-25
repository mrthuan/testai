package com.bytedance.sdk.openadsdk.cJ.Qhi;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* compiled from: AdEvenRecord.java */
/* loaded from: classes.dex */
public class cJ {
    public int CJ;
    public AtomicInteger Qhi = new AtomicInteger(0);
    public AtomicInteger cJ = new AtomicInteger(0);

    /* renamed from: ac  reason: collision with root package name */
    public AtomicLong f8654ac = new AtomicLong(0);

    /* renamed from: fl  reason: collision with root package name */
    public AtomicInteger f8655fl = new AtomicInteger(0);
    public Map<Integer, Integer> Tgh = new HashMap();
    public AtomicBoolean ROR = new AtomicBoolean(false);

    public cJ(int i10) {
        this.CJ = i10;
    }

    public JSONObject Qhi() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.Qhi.get());
            jSONObject.put("fail", this.cJ.get());
            jSONObject.put("type", this.CJ);
            jSONObject.put("duration", this.f8654ac.get() / this.Qhi.get());
            JSONObject jSONObject2 = new JSONObject();
            if (this.Tgh.size() > 0) {
                for (Map.Entry<Integer, Integer> entry : this.Tgh.entrySet()) {
                    jSONObject2.put(String.valueOf(entry.getKey()), entry.getValue());
                }
            }
            jSONObject.put("fail_error_code", jSONObject2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public JSONObject cJ() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.Qhi.get());
            jSONObject.put("fail", this.cJ.get());
            jSONObject.put("type", this.CJ);
            jSONObject.put("time", this.f8655fl.get());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
