package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzget {
    public static zzgen zza(byte[] bArr) {
        try {
            zzgsz zzf = zzgsz.zzf(bArr, zzgxi.zza());
            zzgmk zzc = zzgmk.zzc();
            zzgnm zza = zzgnm.zza(zzf);
            if (!zzc.zzk(zza)) {
                return new zzglk(zza);
            }
            return zzc.zzb(zza);
        } catch (IOException e10) {
            throw new GeneralSecurityException("Failed to parse proto", e10);
        }
    }

    public static byte[] zzb(zzgen zzgenVar) {
        return ((zzgnm) zzgmk.zzc().zze(zzgenVar, zzgnm.class)).zzc().zzaV();
    }
}
