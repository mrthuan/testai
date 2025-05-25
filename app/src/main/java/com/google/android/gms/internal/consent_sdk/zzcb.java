package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public final class zzcb implements zzdn {
    private final zzds zza;
    private final zzds zzb;
    private final zzds zzc;
    private final zzds zzd;
    private final zzds zze;
    private final zzds zzf;

    public zzcb(zzds zzdsVar, zzds zzdsVar2, zzds zzdsVar3, zzds zzdsVar4, zzds zzdsVar5, zzds zzdsVar6, zzds zzdsVar7, zzds zzdsVar8) {
        this.zza = zzdsVar;
        this.zzb = zzdsVar2;
        this.zzc = zzdsVar5;
        this.zzd = zzdsVar6;
        this.zze = zzdsVar7;
        this.zzf = zzdsVar8;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    /* renamed from: zzb */
    public final zzca zza() {
        return new zzca((Application) this.zza.zza(), (zzbw) this.zzb.zza(), zzas.zzb(), zzau.zzb(), (zze) this.zzc.zza(), ((zzao) this.zzd).zza(), (zzbb) this.zze.zza(), (zzap) this.zzf.zza());
    }
}
