package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public final class zzbv implements zzdn {
    private final zzds zza;
    private final zzds zzb;

    public zzbv(zzds zzdsVar, zzds zzdsVar2, zzds zzdsVar3) {
        this.zza = zzdsVar;
        this.zzb = zzdsVar3;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    /* renamed from: zzb */
    public final zzbu zza() {
        return new zzbu((zzbw) this.zza.zza(), zzas.zzb(), ((zzcb) this.zzb).zza());
    }
}
