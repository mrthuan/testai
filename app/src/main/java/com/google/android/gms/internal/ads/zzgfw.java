package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgfw {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgfu
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdy zzgdyVar) {
            return zzgun.zzb((zzgft) zzgdyVar);
        }
    }, zzgft.class, zzgdo.class);
    private static final zzgdz zzc = zzglh.zzd("type.googleapis.com/google.crypto.tink.AesEaxKey", zzgdo.class, zzgsu.SYMMETRIC, zzgrj.zzh());
    private static final zzglz zzd = new zzglz() { // from class: com.google.android.gms.internal.ads.zzgfv
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdy zza(zzgen zzgenVar, Integer num) {
            zzggb zzggbVar = (zzggb) zzgenVar;
            int i10 = zzgfw.zza;
            if (zzggbVar.zzc() != 24) {
                zzgfr zzgfrVar = new zzgfr(null);
                zzgfrVar.zzc(zzggbVar);
                zzgfrVar.zza(num);
                zzgfrVar.zzb(zzgvs.zzc(zzggbVar.zzc()));
                return zzgfrVar.zzd();
            }
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
    };

    public static void zza(boolean z10) {
        if (zzgkr.zza(1)) {
            int i10 = zzgjg.zza;
            zzgjg.zze(zzgmk.zzc());
            zzgmh.zza().zze(zzb);
            zzgmg zzb2 = zzgmg.zzb();
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_EAX", zzgip.zzc);
            zzgfy zzgfyVar = new zzgfy(null);
            zzgfyVar.zza(16);
            zzgfyVar.zzb(16);
            zzgfyVar.zzc(16);
            zzgfz zzgfzVar = zzgfz.zzc;
            zzgfyVar.zzd(zzgfzVar);
            hashMap.put("AES128_EAX_RAW", zzgfyVar.zze());
            hashMap.put("AES256_EAX", zzgip.zzd);
            zzgfy zzgfyVar2 = new zzgfy(null);
            zzgfyVar2.zza(16);
            zzgfyVar2.zzb(32);
            zzgfyVar2.zzc(16);
            zzgfyVar2.zzd(zzgfzVar);
            hashMap.put("AES256_EAX_RAW", zzgfyVar2.zze());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgma.zzb().zzc(zzd, zzggb.class);
            zzgky.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
    }
}
