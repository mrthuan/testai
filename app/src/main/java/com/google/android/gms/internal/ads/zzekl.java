package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzekl implements com.google.android.gms.ads.internal.zzg {
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final zzcwo zzb;
    private final zzcxi zzc;
    private final zzdes zzd;
    private final zzdek zze;
    private final zzcof zzf;

    public zzekl(zzcwo zzcwoVar, zzcxi zzcxiVar, zzdes zzdesVar, zzdek zzdekVar, zzcof zzcofVar) {
        this.zzb = zzcwoVar;
        this.zzc = zzcxiVar;
        this.zzd = zzdesVar;
        this.zze = zzdekVar;
        this.zzf = zzcofVar;
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final synchronized void zza(View view) {
        if (!this.zza.compareAndSet(false, true)) {
            return;
        }
        this.zzf.zzr();
        this.zze.zza(view);
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzb() {
        if (this.zza.get()) {
            this.zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzg
    public final void zzc() {
        if (this.zza.get()) {
            this.zzc.zza();
            this.zzd.zza();
        }
    }
}
