package com.google.android.gms.ads;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public class AdError {

    /* renamed from: a  reason: collision with root package name */
    public final int f10005a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10006b;
    public final String c;

    /* renamed from: d  reason: collision with root package name */
    public final AdError f10007d;

    public AdError() {
        throw null;
    }

    public AdError(int i10, String str, String str2, AdError adError) {
        this.f10005a = i10;
        this.f10006b = str;
        this.c = str2;
        this.f10007d = adError;
    }

    public int a() {
        return this.f10005a;
    }

    public final com.google.android.gms.ads.internal.client.zze b() {
        com.google.android.gms.ads.internal.client.zze zzeVar;
        AdError adError = this.f10007d;
        if (adError == null) {
            zzeVar = null;
        } else {
            String str = adError.c;
            zzeVar = new com.google.android.gms.ads.internal.client.zze(adError.f10005a, adError.f10006b, str, null, null);
        }
        return new com.google.android.gms.ads.internal.client.zze(this.f10005a, this.f10006b, this.c, zzeVar, null);
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(StandardStructureTypes.CODE, this.f10005a);
        jSONObject.put("Message", this.f10006b);
        jSONObject.put("Domain", this.c);
        AdError adError = this.f10007d;
        if (adError == null) {
            jSONObject.put("Cause", "null");
        } else {
            jSONObject.put("Cause", adError.c());
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return c().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
