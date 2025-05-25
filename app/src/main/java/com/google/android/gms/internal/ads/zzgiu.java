package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgiu {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgir
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdy zzgdyVar) {
            zzgiq zzgiqVar = (zzgiq) zzgdyVar;
            int i10 = zzgiu.zza;
            if (zzgkj.zzc()) {
                return zzgkj.zzb(zzgiqVar);
            }
            return zzgvq.zzb(zzgiqVar);
        }
    }, zzgiq.class, zzgdo.class);
    private static final zzgdz zzc = zzglh.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzgdo.class, zzgsu.SYMMETRIC, zzguf.zzg());
    private static final zzgmb zzd = new zzgmb() { // from class: com.google.android.gms.internal.ads.zzgis
    };
    private static final zzglz zze = new zzglz() { // from class: com.google.android.gms.internal.ads.zzgit
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdy zza(zzgen zzgenVar, Integer num) {
            int i10 = zzgiu.zza;
            return zzgiq.zza(((zzgiw) zzgenVar).zzb(), zzgvs.zzc(32), num);
        }
    };

    public static void zza(boolean z10) {
        if (zzgkr.zza(1)) {
            int i10 = zzgko.zza;
            zzgko.zze(zzgmk.zzc());
            zzgmh.zza().zze(zzb);
            zzgmg zzb2 = zzgmg.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", zzgiw.zzc(zzgiv.zza));
            hashMap.put("XCHACHA20_POLY1305_RAW", zzgiw.zzc(zzgiv.zzc));
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgma.zzb().zzc(zze, zzgiw.class);
            zzgmc.zza().zzb(zzd, zzgiw.class);
            zzgky.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
    }
}
