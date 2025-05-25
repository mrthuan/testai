package com.bytedance.sdk.openadsdk.multipro.cJ;

import org.json.JSONObject;

/* compiled from: VideoControllerDataModel.java */
/* loaded from: classes.dex */
public class Qhi {
    public boolean CJ;
    public boolean Qhi;
    public long ROR;
    public long Tgh;

    /* renamed from: ac  reason: collision with root package name */
    public boolean f9348ac;
    public boolean cJ;

    /* renamed from: fl  reason: collision with root package name */
    public long f9349fl;

    /* compiled from: VideoControllerDataModel.java */
    /* renamed from: com.bytedance.sdk.openadsdk.multipro.cJ.Qhi$Qhi  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0135Qhi {
        Qhi Tgh();
    }

    public Qhi CJ(boolean z10) {
        this.f9348ac = z10;
        return this;
    }

    public Qhi Qhi(boolean z10) {
        this.CJ = z10;
        return this;
    }

    public Qhi ac(boolean z10) {
        this.cJ = z10;
        return this;
    }

    public Qhi cJ(boolean z10) {
        this.Qhi = z10;
        return this;
    }

    public Qhi Qhi(long j10) {
        this.f9349fl = j10;
        return this;
    }

    public Qhi ac(long j10) {
        this.ROR = j10;
        return this;
    }

    public Qhi cJ(long j10) {
        this.Tgh = j10;
        return this;
    }

    public JSONObject Qhi() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.Qhi);
            jSONObject.put("isFromVideoDetailPage", this.cJ);
            jSONObject.put("isFromDetailPage", this.f9348ac);
            jSONObject.put("duration", this.f9349fl);
            jSONObject.put("totalPlayDuration", this.Tgh);
            jSONObject.put("currentPlayPosition", this.ROR);
            jSONObject.put("isAutoPlay", this.CJ);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static Qhi Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        Qhi qhi = new Qhi();
        qhi.cJ(jSONObject.optBoolean("isCompleted"));
        qhi.ac(jSONObject.optBoolean("isFromVideoDetailPage"));
        qhi.CJ(jSONObject.optBoolean("isFromDetailPage"));
        qhi.Qhi(jSONObject.optLong("duration"));
        qhi.cJ(jSONObject.optLong("totalPlayDuration"));
        qhi.ac(jSONObject.optLong("currentPlayPosition"));
        qhi.Qhi(jSONObject.optBoolean("isAutoPlay"));
        return qhi;
    }
}
