package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeye implements zzevn {
    private final String zza;
    private final String zzb;

    public zzeye(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzevn
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        try {
            JSONObject e10 = com.google.android.gms.ads.internal.util.zzbs.e("pii", (JSONObject) obj);
            e10.put("doritos", this.zza);
            e10.put("doritos_v2", this.zzb);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.h("Failed putting doritos string.");
        }
    }
}
