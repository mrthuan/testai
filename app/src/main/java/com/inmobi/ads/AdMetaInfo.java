package com.inmobi.ads;

import com.inmobi.media.C1577c0;
import kotlin.jvm.internal.g;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AdMetaInfo {

    /* renamed from: a  reason: collision with root package name */
    public final String f14041a;

    /* renamed from: b  reason: collision with root package name */
    public final JSONObject f14042b;

    public AdMetaInfo(String creativeID, JSONObject jSONObject) {
        g.e(creativeID, "creativeID");
        this.f14041a = creativeID;
        this.f14042b = jSONObject;
    }

    public final double getBid() {
        JSONObject jSONObject = this.f14042b;
        if (jSONObject != null) {
            return jSONObject.optDouble(C1577c0.BUYER_PRICE);
        }
        return 0.0d;
    }

    public final JSONObject getBidInfo() {
        JSONObject jSONObject = this.f14042b;
        if (jSONObject == null) {
            return new JSONObject();
        }
        return jSONObject;
    }

    public final String getBidKeyword() {
        JSONObject jSONObject = this.f14042b;
        if (jSONObject != null) {
            return jSONObject.optString("bidKeyword");
        }
        return null;
    }

    public final String getCreativeID() {
        return this.f14041a;
    }
}
