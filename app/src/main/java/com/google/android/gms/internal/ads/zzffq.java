package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzffq implements zzgcf {
    final /* synthetic */ zzcej zza;
    final /* synthetic */ zzcni zzb;
    final /* synthetic */ zzfll zzc;
    final /* synthetic */ zzedh zzd;

    public zzffq(zzcej zzcejVar, zzcni zzcniVar, zzfll zzfllVar, zzedh zzedhVar) {
        this.zza = zzcejVar;
        this.zzb = zzcniVar;
        this.zzc = zzfllVar;
        this.zzd = zzedhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zzb(Object obj) {
        int i10;
        String str = (String) obj;
        if (!this.zza.zzD().zzai) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjg)).booleanValue() && this.zzb != null && zzcni.zzj(str)) {
                this.zzb.zzi(str, this.zzc, com.google.android.gms.ads.internal.client.zzay.f10107f.f10111e);
                return;
            } else {
                this.zzc.zzc(str, null);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzu zzuVar = com.google.android.gms.ads.internal.zzu.B;
        zzuVar.f10560j.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        String str2 = this.zza.zzR().zzb;
        if (!zzuVar.f10557g.zzA(this.zza.getContext())) {
            if ((!((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzfD)).booleanValue() || !this.zza.zzD().zzS) && this.zza.zzD().zzad == null) {
                i10 = 1;
                this.zzd.zzd(new zzedj(currentTimeMillis, str2, str, i10));
            }
        }
        i10 = 2;
        this.zzd.zzd(new zzedj(currentTimeMillis, str2, str, i10));
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
    }
}
