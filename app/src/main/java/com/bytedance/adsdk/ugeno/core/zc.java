package com.bytedance.adsdk.ugeno.core;

import org.json.JSONObject;

/* compiled from: UGenEvent.java */
/* loaded from: classes.dex */
public class zc {
    private zc CJ;
    private com.bytedance.adsdk.ugeno.component.cJ Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private JSONObject f7945ac;
    private int cJ;

    /* renamed from: fl  reason: collision with root package name */
    private zc f7946fl;

    public zc CJ() {
        return this.CJ;
    }

    public com.bytedance.adsdk.ugeno.component.cJ Qhi() {
        return this.Qhi;
    }

    public JSONObject ac() {
        return this.f7945ac;
    }

    public int cJ() {
        return this.cJ;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.Qhi + ", mEventType=" + this.cJ + ", mEvent=" + this.f7945ac + '}';
    }

    public void Qhi(com.bytedance.adsdk.ugeno.component.cJ cJVar) {
        this.Qhi = cJVar;
    }

    public void cJ(zc zcVar) {
        this.f7946fl = zcVar;
    }

    public void Qhi(int i10) {
        this.cJ = i10;
    }

    public void Qhi(JSONObject jSONObject) {
        this.f7945ac = jSONObject;
    }

    public void Qhi(zc zcVar) {
        this.CJ = zcVar;
    }
}
