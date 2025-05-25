package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzakb implements zzack {
    private final zzack zza;
    private final zzajy zzb;
    private zzakc zzc;

    public zzakb(zzack zzackVar, zzajy zzajyVar) {
        this.zza = zzackVar;
        this.zzb = zzajyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final int zzb(zzacl zzaclVar, zzadf zzadfVar) {
        return this.zza.zzb(zzaclVar, zzadfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final zzack zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final /* synthetic */ List zzd() {
        return zzfxr.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zze(zzacn zzacnVar) {
        zzakc zzakcVar = new zzakc(zzacnVar, this.zzb);
        this.zzc = zzakcVar;
        this.zza.zze(zzakcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzf() {
        this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final void zzi(long j10, long j11) {
        zzakc zzakcVar = this.zzc;
        if (zzakcVar != null) {
            zzakcVar.zza();
        }
        this.zza.zzi(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzack
    public final boolean zzj(zzacl zzaclVar) {
        return this.zza.zzj(zzaclVar);
    }
}
