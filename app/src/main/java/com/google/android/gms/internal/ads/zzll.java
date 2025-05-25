package com.google.android.gms.internal.ads;

import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzll extends zzj implements zzih {
    private final zzjm zzb;
    private final zzdm zzc;

    public zzll(zzif zzifVar) {
        zzdm zzdmVar = new zzdm(zzdj.zza);
        this.zzc = zzdmVar;
        try {
            this.zzb = new zzjm(zzifVar, this);
            zzdmVar.zze();
        } catch (Throwable th2) {
            this.zzc.zze();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzA(zzlq zzlqVar) {
        this.zzc.zzb();
        this.zzb.zzA(zzlqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzB(zzuk zzukVar) {
        this.zzc.zzb();
        this.zzb.zzB(zzukVar);
    }

    public final zzhw zzC() {
        this.zzc.zzb();
        return this.zzb.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final void zza(int i10, long j10, int i11, boolean z10) {
        this.zzc.zzb();
        this.zzb.zza(i10, j10, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzb() {
        this.zzc.zzb();
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzc() {
        this.zzc.zzb();
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzd() {
        this.zzc.zzb();
        return this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zze() {
        this.zzc.zzb();
        return this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzf() {
        this.zzc.zzb();
        return this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzg() {
        this.zzc.zzb();
        return this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final int zzh() {
        this.zzc.zzb();
        this.zzb.zzh();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzi() {
        this.zzc.zzb();
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzj() {
        this.zzc.zzb();
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzk() {
        this.zzc.zzb();
        return this.zzb.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzl() {
        this.zzc.zzb();
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final long zzm() {
        this.zzc.zzb();
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final zzcc zzn() {
        this.zzc.zzb();
        return this.zzb.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final zzck zzo() {
        this.zzc.zzb();
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzp() {
        this.zzc.zzb();
        this.zzb.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzq(boolean z10) {
        this.zzc.zzb();
        this.zzb.zzq(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzr(Surface surface) {
        this.zzc.zzb();
        this.zzb.zzr(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzs(float f10) {
        this.zzc.zzb();
        this.zzb.zzs(f10);
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final void zzt() {
        this.zzc.zzb();
        this.zzb.zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzu() {
        this.zzc.zzb();
        return this.zzb.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzv() {
        this.zzc.zzb();
        this.zzb.zzv();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbw
    public final boolean zzw() {
        this.zzc.zzb();
        return this.zzb.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final int zzx() {
        this.zzc.zzb();
        this.zzb.zzx();
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzy(zzlq zzlqVar) {
        this.zzc.zzb();
        this.zzb.zzy(zzlqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzih
    public final void zzz() {
        this.zzc.zzb();
        this.zzb.zzz();
    }
}
