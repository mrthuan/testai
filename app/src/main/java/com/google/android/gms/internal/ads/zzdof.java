package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdof {
    private final zzcwo zza;
    private final zzcxx zzb;
    private final zzcyk zzc;
    private final zzcyw zzd;
    private final zzdbn zze;
    private final zzdeo zzf;
    private final zzdsk zzg;
    private final zzfll zzh;
    private final zzedh zzi;
    private final zzcni zzj;

    public zzdof(zzcwo zzcwoVar, zzcxx zzcxxVar, zzcyk zzcykVar, zzcyw zzcywVar, zzdbn zzdbnVar, zzdeo zzdeoVar, zzdsk zzdskVar, zzfll zzfllVar, zzedh zzedhVar, zzcni zzcniVar) {
        this.zza = zzcwoVar;
        this.zzb = zzcxxVar;
        this.zzc = zzcykVar;
        this.zzd = zzcywVar;
        this.zze = zzdbnVar;
        this.zzf = zzdeoVar;
        this.zzg = zzdskVar;
        this.zzh = zzfllVar;
        this.zzi = zzedhVar;
        this.zzj = zzcniVar;
    }

    public final void zza(zzdog zzdogVar, zzcej zzcejVar) {
        zzdod zzdodVar;
        zzdodVar = zzdogVar.zza;
        final zzcxx zzcxxVar = this.zzb;
        Objects.requireNonNull(zzcxxVar);
        zzdodVar.zzi(this.zza, this.zzc, this.zzd, this.zze, new com.google.android.gms.ads.internal.overlay.zzaa() { // from class: com.google.android.gms.internal.ads.zzdoe
            @Override // com.google.android.gms.ads.internal.overlay.zzaa
            public final void zzg() {
                zzcxx.this.zzb();
            }
        }, this.zzf);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.f10115d.c.zza(zzbbw.zzjm)).booleanValue() && zzcejVar != null && zzcejVar.zzN() != null) {
            zzcgb zzN = zzcejVar.zzN();
            zzN.zzI(this.zzj, this.zzi, this.zzh);
            zzN.zzK(this.zzj, this.zzi, this.zzg);
        }
    }
}
