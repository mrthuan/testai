package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfwy extends zzfwl {
    final /* synthetic */ zzfxa zza;
    private final Object zzb;
    private int zzc;

    public zzfwy(zzfxa zzfxaVar, int i10) {
        this.zza = zzfxaVar;
        this.zzb = zzfxa.zzg(zzfxaVar, i10);
        this.zzc = i10;
    }

    private final void zza() {
        int zzw;
        int i10 = this.zzc;
        if (i10 == -1 || i10 >= this.zza.size() || !zzfur.zza(this.zzb, zzfxa.zzg(this.zza, this.zzc))) {
            zzw = this.zza.zzw(this.zzb);
            this.zzc = zzw;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwl, java.util.Map.Entry
    public final Object getKey() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfwl, java.util.Map.Entry
    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            return null;
        }
        return zzfxa.zzj(this.zza, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfwl, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i10 = this.zzc;
        if (i10 == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        zzfxa zzfxaVar = this.zza;
        Object zzj = zzfxa.zzj(zzfxaVar, i10);
        zzfxa.zzn(zzfxaVar, this.zzc, obj);
        return zzj;
    }
}
