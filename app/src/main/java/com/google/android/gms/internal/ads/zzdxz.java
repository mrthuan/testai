package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdxz extends zzbut {
    final /* synthetic */ zzdya zza;

    public zzdxz(zzdya zzdyaVar) {
        this.zza = zzdyaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbuu
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        zzbzt zzbztVar = this.zza.zza;
        zzbbVar.getClass();
        zzbztVar.zzd(new com.google.android.gms.ads.internal.util.zzba(zzbbVar.f10417a, zzbbVar.f10418b));
    }

    @Override // com.google.android.gms.internal.ads.zzbuu
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzdya zzdyaVar = this.zza;
        zzdyaVar.zza.zzc(new zzdyq(autoCloseInputStream, zzdyaVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzbuu
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbvb zzbvbVar) {
        this.zza.zza.zzc(new zzdyq(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbvbVar));
    }
}
