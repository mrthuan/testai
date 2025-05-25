package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public final class zzo implements zzdn {
    private final zzds zza;
    private final zzds zzb;

    public zzo(zzds zzdsVar, zzds zzdsVar2) {
        this.zza = zzdsVar;
        this.zzb = zzdsVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    /* renamed from: zzb */
    public final zzl zza() {
        return new zzl((Application) this.zza.zza(), (zzap) this.zzb.zza());
    }
}
