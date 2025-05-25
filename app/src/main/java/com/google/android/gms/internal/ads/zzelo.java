package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzelo extends com.google.android.gms.ads.internal.client.zzbm {
    private final zzemv zza;

    public zzelo(Context context, zzcgj zzcgjVar, zzffe zzffeVar, zzdjm zzdjmVar, com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        zzemx zzemxVar = new zzemx(zzdjmVar, zzcgjVar.zzj());
        zzemxVar.zze(zzbhVar);
        this.zza = new zzemv(new zzenh(zzcgjVar, context, zzemxVar, zzffeVar), zzffeVar.zzL());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza.zzd(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzl zzlVar, int i10) {
        this.zza.zzd(zzlVar, i10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized boolean zzi() {
        return this.zza.zze();
    }
}
