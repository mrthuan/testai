package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes.dex */
public final class zzh extends zzbj {

    /* renamed from: a  reason: collision with root package name */
    public final AdLoadCallback f10197a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10198b;

    public zzh(AdLoadCallback adLoadCallback, Object obj) {
        this.f10197a = adLoadCallback;
        this.f10198b = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb(zze zzeVar) {
        AdLoadCallback adLoadCallback = this.f10197a;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zzeVar.f());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc() {
        Object obj;
        AdLoadCallback adLoadCallback = this.f10197a;
        if (adLoadCallback != null && (obj = this.f10198b) != null) {
            adLoadCallback.onAdLoaded(obj);
        }
    }
}
