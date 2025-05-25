package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfnn {
    private JSONObject zza;
    private final zzfnw zzb;

    public zzfnn(zzfnw zzfnwVar) {
        this.zzb = zzfnwVar;
    }

    public final JSONObject zza() {
        return this.zza;
    }

    public final void zzb() {
        this.zzb.zzb(new zzfnx(this));
    }

    public final void zzc(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zzb(new zzfny(this, hashSet, jSONObject, j10));
    }

    public final void zzd(JSONObject jSONObject, HashSet hashSet, long j10) {
        this.zzb.zzb(new zzfnz(this, hashSet, jSONObject, j10));
    }

    public final void zze(JSONObject jSONObject) {
        this.zza = jSONObject;
    }
}
