package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhfa implements zzhfc {
    private zzhfl zza;

    public static void zza(zzhfl zzhflVar, zzhfl zzhflVar2) {
        zzhfa zzhfaVar = (zzhfa) zzhflVar;
        if (zzhfaVar.zza == null) {
            zzhfaVar.zza = zzhflVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.ads.zzhfu, com.google.android.gms.internal.ads.zzhft
    public final Object zzb() {
        zzhfl zzhflVar = this.zza;
        if (zzhflVar != null) {
            return zzhflVar.zzb();
        }
        throw new IllegalStateException();
    }
}
