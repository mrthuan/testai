package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.FullScreenContentCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzbb extends zzch {

    /* renamed from: a  reason: collision with root package name */
    public final FullScreenContentCallback f10118a;

    public zzbb(FullScreenContentCallback fullScreenContentCallback) {
        this.f10118a = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback = this.f10118a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.f10118a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzd(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.f10118a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.d());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f10118a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f10118a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
