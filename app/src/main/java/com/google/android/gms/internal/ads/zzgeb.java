package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgeb {
    public static final zzgen zza(zzgen zzgenVar) {
        if (zzgenVar != null) {
            return zzgenVar;
        }
        return zzget.zza(zzb(null).zzaV());
    }

    public static final zzgsz zzb(zzgen zzgenVar) {
        try {
            return ((zzgnm) zzgmk.zzc().zze(null, zzgnm.class)).zzc();
        } catch (GeneralSecurityException e10) {
            throw new zzgnz("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e10);
        }
    }
}
