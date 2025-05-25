package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzcms implements zzclz {
    private final zzbxq zza;

    public zzcms(zzbxq zzbxqVar) {
        this.zza = zzbxqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.zzbxq] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // com.google.android.gms.internal.ads.zzclz
    public final void zza(JSONObject jSONObject) {
        ?? r4;
        long optLong = jSONObject.optLong("timestamp");
        if (jSONObject.optBoolean("npa_reset")) {
            r4 = -1;
        } else {
            r4 = jSONObject.optBoolean("npa");
        }
        this.zza.zzb(r4, optLong);
    }
}
