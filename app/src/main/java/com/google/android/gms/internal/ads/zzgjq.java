package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgjq {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvr zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglg zze;
    private static final zzglc zzf;

    static {
        zzgvr zzb2 = zzgoa.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zzb2;
        zzc = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgjm
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnq zza(zzgen zzgenVar) {
                return zzgjq.zzd((zzghb) zzgenVar);
            }
        }, zzghb.class, zzgnm.class);
        zzd = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzgjn
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgen zza(zzgnq zzgnqVar) {
                return zzgjq.zzb((zzgnm) zzgnqVar);
            }
        }, zzb2, zzgnm.class);
        zze = zzglg.zzb(new zzgle() { // from class: com.google.android.gms.internal.ads.zzgjo
            @Override // com.google.android.gms.internal.ads.zzgle
            public final zzgnq zza(zzgdy zzgdyVar, zzger zzgerVar) {
                return zzgjq.zzc((zzggs) zzgdyVar, zzgerVar);
            }
        }, zzggs.class, zzgnl.class);
        zzf = zzglc.zzb(new zzgla() { // from class: com.google.android.gms.internal.ads.zzgjp
            @Override // com.google.android.gms.internal.ads.zzgla
            public final zzgdy zza(zzgnq zzgnqVar, zzger zzgerVar) {
                return zzgjq.zza((zzgnl) zzgnqVar, zzgerVar);
            }
        }, zzb2, zzgnl.class);
    }

    public static /* synthetic */ zzggs zza(zzgnl zzgnlVar, zzger zzgerVar) {
        if (zzgnlVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzgry zze2 = zzgry.zze(zzgnlVar.zze(), zzgxi.zza());
                if (zze2.zza() == 0) {
                    zzggy zzc2 = zzghb.zzc();
                    zzc2.zza(zze2.zzf().zzd());
                    zzc2.zzb(zzf(zzgnlVar.zzc()));
                    zzghb zzc3 = zzc2.zzc();
                    zzggq zza2 = zzggs.zza();
                    zza2.zzc(zzc3);
                    zza2.zzb(zzgvs.zzb(zze2.zzf().zzA(), zzgerVar));
                    zza2.zza(zzgnlVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyn unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzghb zzb(zzgnm zzgnmVar) {
        if (zzgnmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzgsb zzf2 = zzgsb.zzf(zzgnmVar.zzc().zzh(), zzgxi.zza());
                if (zzf2.zzc() == 0) {
                    zzggy zzc2 = zzghb.zzc();
                    zzc2.zza(zzf2.zza());
                    zzc2.zzb(zzf(zzgnmVar.zzc().zzg()));
                    return zzc2.zzc();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgyn e10) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(zzgnmVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgnl zzc(zzggs zzggsVar, zzger zzgerVar) {
        zzgrx zzc2 = zzgry.zzc();
        byte[] zzd2 = zzggsVar.zzd().zzd(zzgerVar);
        zzc2.zza(zzgwm.zzv(zzd2, 0, zzd2.length));
        return zzgnl.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((zzgry) zzc2.zzbr()).zzaN(), zzgsu.SYMMETRIC, zzg(zzggsVar.zzb().zzd()), zzggsVar.zze());
    }

    public static /* synthetic */ zzgnm zzd(zzghb zzghbVar) {
        zzgsy zza2 = zzgsz.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzgsa zzd2 = zzgsb.zzd();
        zzd2.zza(zzghbVar.zzb());
        zza2.zzc(((zzgsb) zzd2.zzbr()).zzaN());
        zza2.zza(zzg(zzghbVar.zzd()));
        return zzgnm.zzb((zzgsz) zza2.zzbr());
    }

    public static void zze(zzgmk zzgmkVar) {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static zzggz zzf(zzgtz zzgtzVar) {
        int ordinal = zzgtzVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(b.a.c("Unable to parse OutputPrefixType: ", zzgtzVar.zza()));
                    }
                } else {
                    return zzggz.zzc;
                }
            }
            return zzggz.zzb;
        }
        return zzggz.zza;
    }

    private static zzgtz zzg(zzggz zzggzVar) {
        if (zzggz.zza.equals(zzggzVar)) {
            return zzgtz.TINK;
        }
        if (zzggz.zzb.equals(zzggzVar)) {
            return zzgtz.CRUNCHY;
        }
        if (zzggz.zzc.equals(zzggzVar)) {
            return zzgtz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzggzVar)));
    }
}
