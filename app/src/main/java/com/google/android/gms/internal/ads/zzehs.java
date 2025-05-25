package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzehs extends zzbqe {
    final /* synthetic */ zzeht zza;
    private final zzeew zzb;

    public /* synthetic */ zzehs(zzeht zzehtVar, zzeew zzeewVar, zzehr zzehrVar) {
        this.zza = zzehtVar;
        this.zzb = zzeewVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqf
    public final void zze(String str) {
        ((zzegp) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqf
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        ((zzegp) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqf
    public final void zzg(zzbpb zzbpbVar) {
        zzeht.zzc(this.zza, zzbpbVar);
        ((zzegp) this.zzb.zzc).zzo();
    }
}
