package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbrz extends zzbgj {
    final /* synthetic */ zzbsa zza;

    public /* synthetic */ zzbrz(zzbsa zzbsaVar, zzbry zzbryVar) {
        this.zza = zzbsaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zze(zzbfx zzbfxVar) {
        zzbsa zzbsaVar = this.zza;
        NativeCustomFormatAd.OnCustomFormatAdLoadedListener zzd = zzbsa.zzd(zzbsaVar);
        zzbsa.zze(zzbsaVar, zzbfxVar);
        zzd.a();
    }
}
