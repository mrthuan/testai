package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgfj {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgfg
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdy zzgdyVar) {
            return zzgur.zzb((zzgff) zzgdyVar);
        }
    }, zzgff.class, zzgdo.class);
    private static final zzgdz zzc = zzglh.zzd("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", zzgdo.class, zzgsu.SYMMETRIC, zzgqu.zzh());
    private static final zzgmb zzd = new zzgmb() { // from class: com.google.android.gms.internal.ads.zzgfh
    };
    private static final zzglz zze = new zzglz() { // from class: com.google.android.gms.internal.ads.zzgfi
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdy zza(zzgen zzgenVar, Integer num) {
            zzgfp zzgfpVar = (zzgfp) zzgenVar;
            int i10 = zzgfj.zza;
            if (zzgfpVar.zzb() != 16 && zzgfpVar.zzb() != 32) {
                throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
            }
            zzgfd zzgfdVar = new zzgfd(null);
            zzgfdVar.zzd(zzgfpVar);
            zzgfdVar.zzc(num);
            zzgfdVar.zza(zzgvs.zzc(zzgfpVar.zzb()));
            zzgfdVar.zzb(zzgvs.zzc(zzgfpVar.zzc()));
            return zzgfdVar.zze();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z10) {
        int i10 = zzf;
        if (zzgkr.zza(i10)) {
            int i11 = zzgjb.zza;
            zzgjb.zze(zzgmk.zzc());
            zzgmh.zza().zze(zzb);
            zzgmg zzb2 = zzgmg.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_CTR_HMAC_SHA256", zzgip.zze);
            zzgfl zzgflVar = new zzgfl(null);
            zzgflVar.zza(16);
            zzgflVar.zzc(32);
            zzgflVar.zze(16);
            zzgflVar.zzd(16);
            zzgfm zzgfmVar = zzgfm.zzc;
            zzgflVar.zzb(zzgfmVar);
            zzgfn zzgfnVar = zzgfn.zzc;
            zzgflVar.zzf(zzgfnVar);
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzgflVar.zzg());
            hashMap.put("AES256_CTR_HMAC_SHA256", zzgip.zzf);
            zzgfl zzgflVar2 = new zzgfl(null);
            zzgflVar2.zza(32);
            zzgflVar2.zzc(32);
            zzgflVar2.zze(32);
            zzgflVar2.zzd(16);
            zzgflVar2.zzb(zzgfmVar);
            zzgflVar2.zzf(zzgfnVar);
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzgflVar2.zzg());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgmc.zza().zzb(zzd, zzgfp.class);
            zzgma.zzb().zzc(zze, zzgfp.class);
            zzgky.zzc().zzf(zzc, i10, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
