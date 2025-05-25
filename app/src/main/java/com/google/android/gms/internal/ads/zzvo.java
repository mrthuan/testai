package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzvo extends zzth implements zzvf {
    private final zzfr zza;
    private final zzri zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;
    private zzgu zzh;
    private zzbc zzi;
    private final zzvl zzj;
    private final zzyo zzk;

    public /* synthetic */ zzvo(zzbc zzbcVar, zzfr zzfrVar, zzvl zzvlVar, zzri zzriVar, zzyo zzyoVar, int i10, zzvn zzvnVar) {
        this.zzi = zzbcVar;
        this.zza = zzfrVar;
        this.zzj = zzvlVar;
        this.zzb = zzriVar;
        this.zzk = zzyoVar;
        this.zzc = i10;
    }

    private final void zzw() {
        zzav zzavVar;
        zzcc zzccVar;
        long j10 = this.zze;
        boolean z10 = this.zzf;
        boolean z11 = this.zzg;
        zzbc zzJ = zzJ();
        if (z11) {
            zzavVar = zzJ.zzc;
        } else {
            zzavVar = null;
        }
        zzwb zzwbVar = new zzwb(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j10, 0L, 0L, z10, false, false, null, zzJ, zzavVar);
        if (this.zzd) {
            zzccVar = new zzvk(this, zzwbVar);
        } else {
            zzccVar = zzwbVar;
        }
        zzo(zzccVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzG(zzug zzugVar) {
        ((zzvj) zzugVar).zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final zzug zzI(zzui zzuiVar, zzyk zzykVar, long j10) {
        zzfs zza = this.zza.zza();
        zzgu zzguVar = this.zzh;
        if (zzguVar != null) {
            zza.zzf(zzguVar);
        }
        zzax zzaxVar = zzJ().zzb;
        zzaxVar.getClass();
        zzvl zzvlVar = this.zzj;
        zzb();
        return new zzvj(zzaxVar.zza, zza, new zztk(zzvlVar.zza), this.zzb, zzc(zzuiVar), this.zzk, zze(zzuiVar), this, zzykVar, null, this.zzc, zzet.zzr(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final synchronized zzbc zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zza(long j10, boolean z10, boolean z11) {
        if (j10 == -9223372036854775807L) {
            j10 = this.zze;
        }
        if (!this.zzd && this.zze == j10 && this.zzf == z10 && this.zzg == z11) {
            return;
        }
        this.zze = j10;
        this.zzf = z10;
        this.zzg = z11;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzth
    public final void zzn(zzgu zzguVar) {
        this.zzh = zzguVar;
        Looper.myLooper().getClass();
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzth, com.google.android.gms.internal.ads.zzuk
    public final synchronized void zzt(zzbc zzbcVar) {
        this.zzi = zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzth
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzz() {
    }
}
