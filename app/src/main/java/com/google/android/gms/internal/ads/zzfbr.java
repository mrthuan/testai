package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfbr implements zzfcc {
    private zzcvx zza;

    @Override // com.google.android.gms.internal.ads.zzfcc
    /* renamed from: zza */
    public final synchronized zzcvx zzd() {
        return this.zza;
    }

    public final synchronized y9.a zzb(zzfcd zzfcdVar, zzfcb zzfcbVar, zzcvx zzcvxVar) {
        zzctc zzb;
        if (zzcvxVar != null) {
            this.zza = zzcvxVar;
        } else {
            this.zza = (zzcvx) zzfcbVar.zza(zzfcdVar.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzi(zzb.zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final /* bridge */ /* synthetic */ y9.a zzc(zzfcd zzfcdVar, zzfcb zzfcbVar, Object obj) {
        return zzb(zzfcdVar, zzfcbVar, null);
    }
}
