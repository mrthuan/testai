package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes2.dex */
public final class zzdl implements zzdn {
    private zzdq zza;

    public static void zzb(zzdq zzdqVar, zzdq zzdqVar2) {
        zzdl zzdlVar = (zzdl) zzdqVar;
        if (zzdlVar.zza == null) {
            zzdlVar.zza = zzdqVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final Object zza() {
        zzdq zzdqVar = this.zza;
        if (zzdqVar != null) {
            return zzdqVar.zza();
        }
        throw new IllegalStateException();
    }
}
