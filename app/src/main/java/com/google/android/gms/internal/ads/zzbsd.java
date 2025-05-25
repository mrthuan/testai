package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbsd extends zzbgw {
    private final NativeAd.UnconfirmedClickListener zza;

    public zzbsd(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zze() {
        this.zza.b();
    }

    @Override // com.google.android.gms.internal.ads.zzbgx
    public final void zzf(String str) {
        this.zza.a();
    }
}
