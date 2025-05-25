package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzehg implements zzeev {
    private final zzdqb zza;

    public zzehg(zzdqb zzdqbVar) {
        this.zza = zzdqbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeev
    public final zzeew zza(String str, JSONObject jSONObject) {
        return new zzeew(this.zza.zzc(str, jSONObject), new zzegp(), str);
    }
}
