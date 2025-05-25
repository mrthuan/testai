package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzeah extends zzbuq {
    final /* synthetic */ zzeai zza;

    public zzeah(zzeai zzeaiVar) {
        this.zza = zzeaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbur
    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        zzbzt zzbztVar = this.zza.zza;
        zzbbVar.getClass();
        zzbztVar.zzd(new com.google.android.gms.ads.internal.util.zzba(zzbbVar.f10417a, zzbbVar.f10418b));
    }

    @Override // com.google.android.gms.internal.ads.zzbur
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzc(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
