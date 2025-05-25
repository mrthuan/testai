package com.inmobi.media;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Xb {

    /* renamed from: a  reason: collision with root package name */
    public final byte f14858a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14859b;

    public Xb(byte b10, String str) {
        this.f14858a = b10;
        this.f14859b = str;
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            byte b10 = this.f14858a;
            String str = "unknown";
            if (b10 != 0) {
                if (b10 == 1) {
                    str = "static";
                } else if (b10 == 2) {
                    str = "html";
                } else if (b10 == 3) {
                    str = "iframe";
                }
            }
            jSONObject.put("type", str);
            jSONObject.put("content", this.f14859b);
            String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.g.d(jSONObject2, "toString(...)");
            return jSONObject2;
        } catch (JSONException e10) {
            List list = Yb.f14892h;
            Q4 q42 = Q4.f14590a;
            Q4.c.a(AbstractC1675j0.a(e10, "event"));
            return "";
        }
    }
}
