package com.inmobi.media;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class U8 extends P7 {

    /* renamed from: h  reason: collision with root package name */
    public final String f14735h;

    /* renamed from: i  reason: collision with root package name */
    public final String f14736i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U8(String vendorKey, String str, String url, HashMap hashMap) {
        super(url, 0, "OMID_VIEWABILITY", hashMap);
        kotlin.jvm.internal.g.e(vendorKey, "vendorKey");
        kotlin.jvm.internal.g.e(url, "url");
        this.f14736i = vendorKey;
        this.f14735h = str;
    }

    @Override // com.inmobi.media.P7
    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f14576a);
            jSONObject.put(InMobiNetworkValues.URL, this.f14579e);
            jSONObject.put("eventType", this.c);
            jSONObject.put("eventId", this.f14577b);
            if (AbstractC1579c2.a(this.f14736i)) {
                jSONObject.put("vendorKey", this.f14736i);
            }
            if (AbstractC1579c2.a(this.f14735h)) {
                jSONObject.put("verificationParams", this.f14735h);
            }
            Map map = this.f14578d;
            if (map == null) {
                map = new HashMap();
            }
            jSONObject.put("extras", K8.a(",", map));
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.g.d(jSONObject2, "toString(...)");
            return jSONObject2;
        } catch (JSONException e10) {
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            return "";
        }
    }
}
