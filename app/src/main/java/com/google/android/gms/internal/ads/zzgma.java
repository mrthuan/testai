package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgma {
    public static final /* synthetic */ int zza = 0;
    private static final zzglz zzb = new zzglz() { // from class: com.google.android.gms.internal.ads.zzgly
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdy zza(zzgen zzgenVar, Integer num) {
            int i10 = zzgma.zza;
            zzgsz zzc2 = ((zzglk) zzgenVar).zzb().zzc();
            zzgdz zzb2 = zzgky.zzc().zzb(zzc2.zzi());
            if (zzgky.zzc().zze(zzc2.zzi())) {
                zzgsv zza2 = zzb2.zza(zzc2.zzh());
                return new zzglj(zzgnl.zza(zza2.zzg(), zza2.zzf(), zza2.zzc(), zzc2.zzg(), num), zzgdx.zza());
            }
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
    };
    private static final zzgma zzc = zze();
    private final Map zzd = new HashMap();

    public static zzgma zzb() {
        return zzc;
    }

    private final synchronized zzgdy zzd(zzgen zzgenVar, Integer num) {
        zzglz zzglzVar;
        zzglzVar = (zzglz) this.zzd.get(zzgenVar.getClass());
        if (zzglzVar != null) {
        } else {
            String obj = zzgenVar.toString();
            throw new GeneralSecurityException("Cannot create a new key for parameters " + obj + ": no key creator for this class was registered.");
        }
        return zzglzVar.zza(zzgenVar, num);
    }

    private static zzgma zze() {
        zzgma zzgmaVar = new zzgma();
        try {
            zzgmaVar.zzc(zzb, zzglk.class);
            return zzgmaVar;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException("unexpected error.", e10);
        }
    }

    public final zzgdy zza(zzgen zzgenVar, Integer num) {
        return zzd(zzgenVar, num);
    }

    public final synchronized void zzc(zzglz zzglzVar, Class cls) {
        zzglz zzglzVar2 = (zzglz) this.zzd.get(cls);
        if (zzglzVar2 != null && !zzglzVar2.equals(zzglzVar)) {
            String obj = cls.toString();
            throw new GeneralSecurityException("Different key creator for parameters class " + obj + " already inserted");
        }
        this.zzd.put(cls, zzglzVar);
    }
}
