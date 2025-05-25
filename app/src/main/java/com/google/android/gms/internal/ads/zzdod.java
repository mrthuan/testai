package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdod extends zzdnn implements zzdeq {
    private zzdeq zza;

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final synchronized void zzdG() {
        zzdeq zzdeqVar = this.zza;
        if (zzdeqVar != null) {
            zzdeqVar.zzdG();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final synchronized void zzdf() {
        zzdeq zzdeqVar = this.zza;
        if (zzdeqVar != null) {
            zzdeqVar.zzdf();
        }
    }

    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzbhn zzbhnVar, com.google.android.gms.ads.internal.overlay.zzp zzpVar, zzbhp zzbhpVar, com.google.android.gms.ads.internal.overlay.zzaa zzaaVar, zzdeq zzdeqVar) {
        super.zzh(zzaVar, zzbhnVar, zzpVar, zzbhpVar, zzaaVar);
        this.zza = zzdeqVar;
    }
}
