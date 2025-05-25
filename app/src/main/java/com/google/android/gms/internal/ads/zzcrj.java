package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcrj implements zzcye, zzaxw {
    private final zzfel zza;
    private final zzcxi zzb;
    private final zzcyn zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcrj(zzfel zzfelVar, zzcxi zzcxiVar, zzcyn zzcynVar) {
        this.zza = zzfelVar;
        this.zzb = zzcxiVar;
        this.zzc = zzcynVar;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaxw
    public final void zzdp(zzaxv zzaxvVar) {
        if (this.zza.zze == 1 && zzaxvVar.zzj) {
            zza();
        }
        if (zzaxvVar.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final synchronized void zzs() {
        if (this.zza.zze != 1) {
            zza();
        }
    }
}
