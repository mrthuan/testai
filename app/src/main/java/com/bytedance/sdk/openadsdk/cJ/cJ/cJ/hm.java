package com.bytedance.sdk.openadsdk.cJ.CJ.cJ;

import org.json.JSONObject;

/* compiled from: FeedPlayModel.java */
/* loaded from: classes.dex */
public class hm implements ac {
    private long Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private int f8626ac;
    private long cJ;

    public void Qhi(long j10) {
        this.Qhi = j10;
    }

    public void cJ(long j10) {
        this.cJ = j10;
    }

    public void Qhi(int i10) {
        this.f8626ac = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.cJ.CJ.cJ.ac
    public void Qhi(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("video_start_duration", this.Qhi);
            jSONObject.put("video_cache_size", this.cJ);
            jSONObject.put("is_auto_play", this.f8626ac);
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.ABk.Qhi("FeedPlayModel", th2.getMessage());
        }
    }
}
