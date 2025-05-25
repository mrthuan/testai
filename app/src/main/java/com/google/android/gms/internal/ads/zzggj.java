package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzggj {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzggg
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdy zzgdyVar) {
            return zzguo.zzb((zzggf) zzgdyVar);
        }
    }, zzggf.class, zzgdo.class);
    private static final zzgdz zzc = zzglh.zzd("type.googleapis.com/google.crypto.tink.AesGcmKey", zzgdo.class, zzgsu.SYMMETRIC, zzgrs.zzg());
    private static final zzgmb zzd = new zzgmb() { // from class: com.google.android.gms.internal.ads.zzggh
    };
    private static final zzglz zze = new zzglz() { // from class: com.google.android.gms.internal.ads.zzggi
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdy zza(zzgen zzgenVar, Integer num) {
            zzggo zzggoVar = (zzggo) zzgenVar;
            int i10 = zzggj.zza;
            if (zzggoVar.zzb() != 24) {
                zzggd zzggdVar = new zzggd(null);
                zzggdVar.zzc(zzggoVar);
                zzggdVar.zza(num);
                zzggdVar.zzb(zzgvs.zzc(zzggoVar.zzb()));
                return zzggdVar.zzd();
            }
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z10) {
        int i10 = zzf;
        if (zzgkr.zza(i10)) {
            int i11 = zzgjl.zza;
            zzgjl.zze(zzgmk.zzc());
            zzgmh.zza().zze(zzb);
            zzgmg zzb2 = zzgmg.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_GCM", zzgip.zza);
            zzggl zzgglVar = new zzggl(null);
            zzgglVar.zza(12);
            zzgglVar.zzb(16);
            zzgglVar.zzc(16);
            zzggm zzggmVar = zzggm.zzc;
            zzgglVar.zzd(zzggmVar);
            hashMap.put("AES128_GCM_RAW", zzgglVar.zze());
            hashMap.put("AES256_GCM", zzgip.zzb);
            zzggl zzgglVar2 = new zzggl(null);
            zzgglVar2.zza(12);
            zzgglVar2.zzb(32);
            zzgglVar2.zzc(16);
            zzgglVar2.zzd(zzggmVar);
            hashMap.put("AES256_GCM_RAW", zzgglVar2.zze());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgmc.zza().zzb(zzd, zzggo.class);
            zzgma.zzb().zzc(zze, zzggo.class);
            zzgky.zzc().zzf(zzc, i10, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }
}
