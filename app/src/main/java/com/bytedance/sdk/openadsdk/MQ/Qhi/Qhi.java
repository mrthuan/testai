package com.bytedance.sdk.openadsdk.MQ.Qhi;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import org.json.JSONObject;

/* compiled from: PAGAdViewInfo.java */
/* loaded from: classes.dex */
public class Qhi {
    private final int Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private final float f8499ac;
    private final int cJ;

    public Qhi(int i10, int i11, float f10) {
        this.Qhi = i10;
        this.cJ = i11;
        this.f8499ac = f10;
    }

    public static JSONObject Qhi(Qhi qhi) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(InMobiNetworkValues.WIDTH, qhi.Qhi);
        jSONObject.put(InMobiNetworkValues.HEIGHT, qhi.cJ);
        jSONObject.put("alpha", qhi.f8499ac);
        return jSONObject;
    }
}
