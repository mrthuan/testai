package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzcta implements zzgcf {
    final /* synthetic */ zzctc zza;

    public zzcta(zzctc zzctcVar) {
        this.zza = zzctcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final void zza(Throwable th2) {
        zzdby zzdbyVar;
        zzdbyVar = this.zza.zzf;
        zzdbyVar.zzn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzgcf
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzdby zzdbyVar;
        zzbvb zzbvbVar = (zzbvb) obj;
        zzdbyVar = this.zza.zzf;
        zzdbyVar.zzn(true);
    }
}
