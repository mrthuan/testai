package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzvp implements zzye {
    public long zza;
    public long zzb;
    public zzyd zzc;
    public zzvp zzd;

    public zzvp(long j10, int i10) {
        zze(j10, 65536);
    }

    public final int zza(long j10) {
        long j11 = j10 - this.zza;
        int i10 = this.zzc.zzb;
        return (int) j11;
    }

    public final zzvp zzb() {
        this.zzc = null;
        zzvp zzvpVar = this.zzd;
        this.zzd = null;
        return zzvpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final zzyd zzc() {
        zzyd zzydVar = this.zzc;
        zzydVar.getClass();
        return zzydVar;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final zzye zzd() {
        zzvp zzvpVar = this.zzd;
        if (zzvpVar != null && zzvpVar.zzc != null) {
            return zzvpVar;
        }
        return null;
    }

    public final void zze(long j10, int i10) {
        boolean z10;
        if (this.zzc == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzf(z10);
        this.zza = j10;
        this.zzb = j10 + 65536;
    }
}
