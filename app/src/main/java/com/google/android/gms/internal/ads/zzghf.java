package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzghf {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzghd
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdy zzgdyVar) {
            zzghc zzghcVar = (zzghc) zzgdyVar;
            int i10 = zzghf.zza;
            if (zzgjs.zze()) {
                return zzgjs.zzb(zzghcVar);
            }
            return zzguq.zzb(zzghcVar);
        }
    }, zzghc.class, zzgdo.class);
    private static final zzglz zzc = new zzglz() { // from class: com.google.android.gms.internal.ads.zzghe
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdy zza(zzgen zzgenVar, Integer num) {
            int i10 = zzghf.zza;
            return zzghc.zza(((zzghh) zzgenVar).zzb(), zzgvs.zzc(32), num);
        }
    };
    private static final zzgdz zzd = zzglh.zzd("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzgdo.class, zzgsu.SYMMETRIC, zzgse.zzg());

    public static void zza(boolean z10) {
        if (zzgkr.zza(1)) {
            int i10 = zzgjx.zza;
            zzgjx.zze(zzgmk.zzc());
            zzgmh.zza().zze(zzb);
            zzgma.zzb().zzc(zzc, zzghh.class);
            zzgmg zzb2 = zzgmg.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", zzghh.zzc(zzghg.zza));
            hashMap.put("CHACHA20_POLY1305_RAW", zzghh.zzc(zzghg.zzc));
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgky.zzc().zzd(zzd, true);
            return;
        }
        throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
    }
}
