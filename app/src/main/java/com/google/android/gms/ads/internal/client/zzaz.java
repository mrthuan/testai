package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public class zzaz extends AdListener {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10112a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public AdListener f10113b;

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        synchronized (this.f10112a) {
            AdListener adListener = this.f10113b;
            if (adListener != null) {
                adListener.onAdClicked();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        synchronized (this.f10112a) {
            AdListener adListener = this.f10113b;
            if (adListener != null) {
                adListener.onAdClosed();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdFailedToLoad(LoadAdError loadAdError) {
        synchronized (this.f10112a) {
            AdListener adListener = this.f10113b;
            if (adListener != null) {
                adListener.onAdFailedToLoad(loadAdError);
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        synchronized (this.f10112a) {
            AdListener adListener = this.f10113b;
            if (adListener != null) {
                adListener.onAdImpression();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public void onAdLoaded() {
        synchronized (this.f10112a) {
            AdListener adListener = this.f10113b;
            if (adListener != null) {
                adListener.onAdLoaded();
            }
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        synchronized (this.f10112a) {
            AdListener adListener = this.f10113b;
            if (adListener != null) {
                adListener.onAdOpened();
            }
        }
    }
}
