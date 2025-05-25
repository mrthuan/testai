package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzbrc implements com.google.android.gms.ads.internal.overlay.zzp {
    final /* synthetic */ zzbre zza;

    public zzbrc(zzbre zzbreVar) {
        this.zza = zzbreVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdH() {
        com.google.android.gms.ads.internal.util.client.zzm.b("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdk() {
        com.google.android.gms.ads.internal.util.client.zzm.b("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdq() {
        com.google.android.gms.ads.internal.util.client.zzm.b("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdr() {
        MediationInterstitialListener mediationInterstitialListener;
        com.google.android.gms.ads.internal.util.client.zzm.b("Opening AdMobCustomTabsAdapter overlay.");
        zzbre zzbreVar = this.zza;
        mediationInterstitialListener = zzbreVar.zzb;
        mediationInterstitialListener.onAdOpened(zzbreVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdu(int i10) {
        MediationInterstitialListener mediationInterstitialListener;
        com.google.android.gms.ads.internal.util.client.zzm.b("AdMobCustomTabsAdapter overlay is closed.");
        zzbre zzbreVar = this.zza;
        mediationInterstitialListener = zzbreVar.zzb;
        mediationInterstitialListener.onAdClosed(zzbreVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzdt() {
    }
}
