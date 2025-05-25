package com.inmobi.media;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class I3 {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f14340e = 0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f14341a = true;

    /* renamed from: b  reason: collision with root package name */
    public String f14342b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14343d;

    public I3() {
        JSONObject jSONObject = new JSONObject();
        try {
            C1706l3 d10 = AbstractC1692k3.d();
            jSONObject.put(InMobiNetworkValues.WIDTH, d10.f15274a);
            jSONObject.put(InMobiNetworkValues.HEIGHT, d10.f15275b);
            jSONObject.put("useCustomClose", this.c);
            jSONObject.put("isModal", this.f14341a);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.g.d(jSONObject2, "toString(...)");
        this.f14342b = jSONObject2;
    }
}
