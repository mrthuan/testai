package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzfbo implements zzfcc {
    private final zzfgu zza;
    private final Executor zzb;
    private final zzgcf zzc = new zzfbm(this);

    public zzfbo(zzfgu zzfguVar, Executor executor) {
        this.zza = zzfguVar;
        this.zzb = executor;
    }

    public final /* synthetic */ y9.a zza(zzcvx zzcvxVar, zzfbx zzfbxVar) {
        zzfgu zzfguVar = this.zza;
        zzfhe zzfheVar = zzfbxVar.zzb;
        zzbvb zzbvbVar = zzfbxVar.zza;
        zzfhd zzb = zzfguVar.zzb(zzfheVar);
        if (zzb != null && zzbvbVar != null) {
            zzgcj.zzr(zzcvxVar.zzb().zzh(zzbvbVar), this.zzc, this.zzb);
        }
        return zzgcj.zzh(new zzfbn(zzfheVar, zzbvbVar, zzb));
    }

    public final y9.a zzb(zzfcd zzfcdVar, zzfcb zzfcbVar, final zzcvx zzcvxVar) {
        return zzgcj.zze(zzgcj.zzn(zzgca.zzu(new zzfby(this.zza, zzcvxVar, this.zzb).zzc()), new zzgbq() { // from class: com.google.android.gms.internal.ads.zzfbk
            @Override // com.google.android.gms.internal.ads.zzgbq
            public final y9.a zza(Object obj) {
                return zzfbo.this.zza(zzcvxVar, (zzfbx) obj);
            }
        }, this.zzb), Exception.class, new zzfbl(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final /* bridge */ /* synthetic */ y9.a zzc(zzfcd zzfcdVar, zzfcb zzfcbVar, Object obj) {
        return zzb(zzfcdVar, zzfcbVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfcc
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
