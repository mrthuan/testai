package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbnp implements zzbzx {
    final /* synthetic */ zzbmu zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzbzt zzc;
    final /* synthetic */ zzbns zzd;

    public zzbnp(zzbns zzbnsVar, zzbmu zzbmuVar, Object obj, zzbzt zzbztVar) {
        this.zza = zzbmuVar;
        this.zzb = obj;
        this.zzc = zzbztVar;
        this.zzd = zzbnsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        com.google.android.gms.ads.internal.util.zze.h("callJs > getEngine: Promise fulfilled");
        Object obj2 = this.zzb;
        zzbzt zzbztVar = this.zzc;
        zzbns.zzd(this.zzd, this.zza, (zzbnb) obj, obj2, zzbztVar);
    }
}
