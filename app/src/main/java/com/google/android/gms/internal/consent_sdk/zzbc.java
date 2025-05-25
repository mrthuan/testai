package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public final class zzbc implements zzdn {
    private final zzds zza;
    private final zzds zzb;
    private final zzds zzc;
    private final zzds zzd;
    private final zzds zze;
    private final zzds zzf;

    public zzbc(zzds zzdsVar, zzds zzdsVar2, zzds zzdsVar3, zzds zzdsVar4, zzds zzdsVar5, zzds zzdsVar6) {
        this.zza = zzdsVar;
        this.zzb = zzdsVar2;
        this.zzc = zzdsVar3;
        this.zzd = zzdsVar4;
        this.zze = zzdsVar5;
        this.zzf = zzdsVar6;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final /* bridge */ /* synthetic */ Object zza() {
        return new zzbb((Application) this.zza.zza(), (zzab) this.zzb.zza(), (zzbw) this.zzc.zza(), (zzap) this.zzd.zza(), (zzbp) this.zze.zza(), this.zzf);
    }
}
