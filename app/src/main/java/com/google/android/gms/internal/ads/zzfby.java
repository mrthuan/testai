package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfby {
    private final zzfgu zza;
    private final zzcvx zzb;
    private final Executor zzc;
    private zzfbx zzd;

    public zzfby(zzfgu zzfguVar, zzcvx zzcvxVar, Executor executor) {
        this.zza = zzfguVar;
        this.zzb = zzcvxVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfhe zze() {
        zzffg zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final y9.a zzc() {
        y9.a zze;
        zzfbx zzfbxVar = this.zzd;
        if (zzfbxVar == null) {
            if (!((Boolean) zzbdz.zza.zze()).booleanValue()) {
                zzfbx zzfbxVar2 = new zzfbx(null, zze(), null);
                this.zzd = zzfbxVar2;
                zze = zzgcj.zzh(zzfbxVar2);
            } else {
                zze = zzgcj.zze(zzgcj.zzm(zzgca.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzfbv(this), this.zzc), zzdyp.class, new zzfbu(this), this.zzc);
            }
            return zzgcj.zzm(zze, new zzful() { // from class: com.google.android.gms.internal.ads.zzfbt
                @Override // com.google.android.gms.internal.ads.zzful
                public final Object apply(Object obj) {
                    return (zzfbx) obj;
                }
            }, this.zzc);
        }
        return zzgcj.zzh(zzfbxVar);
    }
}
