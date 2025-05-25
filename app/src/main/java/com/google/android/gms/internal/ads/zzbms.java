package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbms implements zzbzx {
    final /* synthetic */ zzbmu zza;

    public zzbms(zzbmu zzbmuVar) {
        this.zza = zzbmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzx
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzbmz zzbmzVar;
        zzbnb zzbnbVar = (zzbnb) obj;
        com.google.android.gms.ads.internal.util.zze.h("Releasing engine reference.");
        zzbmzVar = this.zza.zzb;
        zzbmzVar.zzd();
    }
}
