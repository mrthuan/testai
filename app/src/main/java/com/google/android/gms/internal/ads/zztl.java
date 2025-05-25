package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zztl implements zzvx {
    public final zzvx zza;
    final /* synthetic */ zztm zzb;
    private boolean zzc;

    public zztl(zztm zztmVar, zzvx zzvxVar) {
        this.zzb = zztmVar;
        this.zza = zzvxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final int zza(zzjz zzjzVar, zzhd zzhdVar, int i10) {
        zztm zztmVar = this.zzb;
        if (zztmVar.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzhdVar.zzc(4);
            return -4;
        }
        long zzb = zztmVar.zzb();
        int zza = this.zza.zza(zzjzVar, zzhdVar, i10);
        if (zza == -5) {
            zzaf zzafVar = zzjzVar.zza;
            zzafVar.getClass();
            int i11 = zzafVar.zzC;
            int i12 = 0;
            if (i11 == 0) {
                if (zzafVar.zzD != 0) {
                    i11 = 0;
                }
                return -5;
            }
            if (this.zzb.zzb == Long.MIN_VALUE) {
                i12 = zzafVar.zzD;
            }
            zzad zzb2 = zzafVar.zzb();
            zzb2.zzF(i11);
            zzb2.zzG(i12);
            zzjzVar.zza = zzb2.zzad();
            return -5;
        }
        long j10 = this.zzb.zzb;
        if (j10 != Long.MIN_VALUE && ((zza == -4 && zzhdVar.zze >= j10) || (zza == -3 && zzb == Long.MIN_VALUE && !zzhdVar.zzd))) {
            zzhdVar.zzb();
            zzhdVar.zzc(4);
            this.zzc = true;
            return -4;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final int zzb(long j10) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j10);
    }

    public final void zzc() {
        this.zzc = false;
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final void zzd() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvx
    public final boolean zze() {
        if (!this.zzb.zzq() && this.zza.zze()) {
            return true;
        }
        return false;
    }
}
