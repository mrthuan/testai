package com.google.android.gms.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class LoadAdError extends AdError {

    /* renamed from: e  reason: collision with root package name */
    public final ResponseInfo f10036e;

    public LoadAdError(int i10, String str, String str2, AdError adError, ResponseInfo responseInfo) {
        super(i10, str, str2, adError);
        this.f10036e = responseInfo;
    }

    @Override // com.google.android.gms.ads.AdError
    public final JSONObject c() {
        JSONObject c = super.c();
        ResponseInfo responseInfo = this.f10036e;
        if (responseInfo == null) {
            c.put("Response Info", "null");
        } else {
            c.put("Response Info", responseInfo.b());
        }
        return c;
    }

    @Override // com.google.android.gms.ads.AdError
    public final String toString() {
        try {
            return c().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
