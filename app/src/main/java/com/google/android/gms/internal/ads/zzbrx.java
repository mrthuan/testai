package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbrx extends zzbgg {
    final /* synthetic */ zzbsa zza;

    public /* synthetic */ zzbrx(zzbsa zzbsaVar, zzbrw zzbrwVar) {
        this.zza = zzbsaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgh
    public final void zze(zzbfx zzbfxVar, String str) {
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener;
        NativeCustomFormatAd.OnCustomClickListener onCustomClickListener2;
        zzbsa zzbsaVar = this.zza;
        onCustomClickListener = zzbsaVar.zzb;
        if (onCustomClickListener != null) {
            onCustomClickListener2 = zzbsaVar.zzb;
            zzbsaVar.zzf(zzbfxVar);
            onCustomClickListener2.a();
        }
    }
}
