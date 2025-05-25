package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzbpo extends zzbou {
    private final MediationInterscrollerAd zza;

    public zzbpo(MediationInterscrollerAd mediationInterscrollerAd) {
        this.zza = mediationInterscrollerAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbov
    public final IObjectWrapper zze() {
        return new ObjectWrapper(this.zza.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbov
    public final boolean zzf() {
        return this.zza.a();
    }
}
