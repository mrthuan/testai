package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzfaq implements zzemz {
    final /* synthetic */ zzfar zza;

    public zzfaq(zzfar zzfarVar) {
        this.zza = zzfarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemz
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfaj zzfajVar;
        zzfaj zzfajVar2;
        zzdsk zzdskVar;
        zzcpe zzcpeVar = (zzcpe) obj;
        synchronized (this.zza) {
            zzcpe zzcpeVar2 = this.zza.zza;
            if (zzcpeVar2 != null) {
                zzcpeVar2.zzb();
            }
            zzfar zzfarVar = this.zza;
            zzfarVar.zza = zzcpeVar;
            zzcpeVar.zzc(zzfarVar);
            zzfar zzfarVar2 = this.zza;
            zzfajVar = zzfarVar2.zzg;
            zzfajVar2 = zzfarVar2.zzg;
            zzdskVar = zzfarVar2.zzi;
            zzfajVar.zzk(new zzcpf(zzcpeVar, zzfarVar2, zzfajVar2, zzdskVar));
            zzcpeVar.zzk();
        }
    }
}
