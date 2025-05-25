package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzfd extends zzdc {

    /* renamed from: a  reason: collision with root package name */
    public final OnAdMetadataChangedListener f10188a;

    public zzfd(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f10188a = onAdMetadataChangedListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdd
    public final void zze() {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.f10188a;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}
