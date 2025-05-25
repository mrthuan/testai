package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdnw {
    private final zzcwo zza;
    private final zzcxx zzb;
    private final zzcyk zzc;
    private final zzcyw zzd;
    private final zzdbn zze;
    private final zzfel zzf;
    private final zzfeo zzg;
    private final zzcni zzh;

    public zzdnw(zzcwo zzcwoVar, zzcxx zzcxxVar, zzcyk zzcykVar, zzcyw zzcywVar, zzdbn zzdbnVar, zzfel zzfelVar, zzfeo zzfeoVar, zzcni zzcniVar) {
        this.zza = zzcwoVar;
        this.zzb = zzcxxVar;
        this.zzc = zzcykVar;
        this.zzd = zzcywVar;
        this.zze = zzdbnVar;
        this.zzf = zzfelVar;
        this.zzg = zzfeoVar;
        this.zzh = zzcniVar;
    }

    public final void zza(zzdoa zzdoaVar) {
        zzdnn zzdnnVar;
        final zzcxx zzcxxVar = this.zzb;
        zzdnnVar = zzdoaVar.zza;
        Objects.requireNonNull(zzcxxVar);
        zzdnnVar.zzh(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzaa() { // from class: com.google.android.gms.internal.ads.zzdnv
            @Override // com.google.android.gms.ads.internal.overlay.zzaa
            public final void zzg() {
                zzcxx.this.zzb();
            }
        });
        zzdoaVar.zzh(this.zzf, this.zzg, this.zzh);
    }
}
