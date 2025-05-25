package com.inmobi.media;

import com.google.ads.mediation.inmobi.InMobiNetworkValues;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class P7 {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f14575g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final String f14576a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14577b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public Map f14578d;

    /* renamed from: e  reason: collision with root package name */
    public final String f14579e;

    /* renamed from: f  reason: collision with root package name */
    public HashMap f14580f;

    public P7(String url, int i10, String eventType, HashMap hashMap) {
        int i11;
        boolean z10;
        kotlin.jvm.internal.g.e(url, "url");
        kotlin.jvm.internal.g.e(eventType, "eventType");
        this.f14576a = "url_ping";
        this.f14577b = i10;
        this.c = eventType;
        this.f14578d = hashMap;
        int length = url.length() - 1;
        int i12 = 0;
        boolean z11 = false;
        while (i12 <= length) {
            if (!z11) {
                i11 = i12;
            } else {
                i11 = length;
            }
            if (kotlin.jvm.internal.g.f(url.charAt(i11), 32) <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z11) {
                if (!z10) {
                    z11 = true;
                } else {
                    i12++;
                }
            } else if (!z10) {
                break;
            } else {
                length--;
            }
        }
        this.f14579e = C6.a(length, 1, url, i12);
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.f14576a);
            jSONObject.put(InMobiNetworkValues.URL, this.f14579e);
            jSONObject.put("eventType", this.c);
            jSONObject.put("eventId", this.f14577b);
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
