package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzdwc extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdwf zzb;

    public zzdwc(zzdwf zzdwfVar, String str) {
        this.zza = str;
        this.zzb = zzdwfVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzl;
        zzdwf zzdwfVar = this.zzb;
        zzl = zzdwf.zzl(loadAdError);
        zzdwfVar.zzm(zzl, this.zza);
    }
}
