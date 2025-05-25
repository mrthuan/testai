package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgjg {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvr zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglg zze;
    private static final zzglc zzf;

    static {
        zzgvr zzb2 = zzgoa.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zzb2;
        zzc = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgjc
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnq zza(zzgen zzgenVar) {
                return zzgjg.zzd((zzggb) zzgenVar);
            }
        }, zzggb.class, zzgnm.class);
        zzd = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzgjd
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgen zza(zzgnq zzgnqVar) {
                return zzgjg.zzb((zzgnm) zzgnqVar);
            }
        }, zzb2, zzgnm.class);
        zze = zzglg.zzb(new zzgle() { // from class: com.google.android.gms.internal.ads.zzgje
            @Override // com.google.android.gms.internal.ads.zzgle
            public final zzgnq zza(zzgdy zzgdyVar, zzger zzgerVar) {
                return zzgjg.zzc((zzgft) zzgdyVar, zzgerVar);
            }
        }, zzgft.class, zzgnl.class);
        zzf = zzglc.zzb(new zzgla() { // from class: com.google.android.gms.internal.ads.zzgjf
            @Override // com.google.android.gms.internal.ads.zzgla
            public final zzgdy zza(zzgnq zzgnqVar, zzger zzgerVar) {
                return zzgjg.zza((zzgnl) zzgnqVar, zzgerVar);
            }
        }, zzb2, zzgnl.class);
    }

    public static /* synthetic */ zzgft zza(zzgnl zzgnlVar, zzger zzgerVar) {
        if (zzgnlVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzgrj zze2 = zzgrj.zze(zzgnlVar.zze(), zzgxi.zza());
                if (zze2.zza() == 0) {
                    zzgfy zzd2 = zzggb.zzd();
                    zzd2.zzb(zze2.zzg().zzd());
                    zzd2.zza(zze2.zzf().zza());
                    zzd2.zzc(16);
                    zzd2.zzd(zzf(zzgnlVar.zzc()));
                    zzggb zze3 = zzd2.zze();
                    zzgfr zza2 = zzgft.zza();
                    zza2.zzc(zze3);
                    zza2.zzb(zzgvs.zzb(zze2.zzg().zzA(), zzgerVar));
                    zza2.zza(zzgnlVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyn unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzggb zzb(zzgnm zzgnmVar) {
        if (zzgnmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzgrm zze2 = zzgrm.zze(zzgnmVar.zzc().zzh(), zzgxi.zza());
                zzgfy zzd2 = zzggb.zzd();
                zzd2.zzb(zze2.zza());
                zzd2.zza(zze2.zzf().zza());
                zzd2.zzc(16);
                zzd2.zzd(zzf(zzgnmVar.zzc().zzg()));
                return zzd2.zze();
            } catch (zzgyn e10) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(zzgnmVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgnl zzc(zzgft zzgftVar, zzger zzgerVar) {
        zzgri zzc2 = zzgrj.zzc();
        zzc2.zzb(zzg(zzgftVar.zzb()));
        byte[] zzd2 = zzgftVar.zzd().zzd(zzgerVar);
        zzc2.zza(zzgwm.zzv(zzd2, 0, zzd2.length));
        return zzgnl.zza("type.googleapis.com/google.crypto.tink.AesEaxKey", ((zzgrj) zzc2.zzbr()).zzaN(), zzgsu.SYMMETRIC, zzh(zzgftVar.zzb().zze()), zzgftVar.zze());
    }

    public static /* synthetic */ zzgnm zzd(zzggb zzggbVar) {
        zzgsy zza2 = zzgsz.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzgrl zzc2 = zzgrm.zzc();
        zzc2.zzb(zzg(zzggbVar));
        zzc2.zza(zzggbVar.zzc());
        zza2.zzc(((zzgrm) zzc2.zzbr()).zzaN());
        zza2.zza(zzh(zzggbVar.zze()));
        return zzgnm.zzb((zzgsz) zza2.zzbr());
    }

    public static void zze(zzgmk zzgmkVar) {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static zzgfz zzf(zzgtz zzgtzVar) {
        int ordinal = zzgtzVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(b.a.c("Unable to parse OutputPrefixType: ", zzgtzVar.zza()));
                    }
                } else {
                    return zzgfz.zzc;
                }
            }
            return zzgfz.zzb;
        }
        return zzgfz.zza;
    }

    private static zzgrp zzg(zzggb zzggbVar) {
        zzgro zzc2 = zzgrp.zzc();
        zzc2.zza(zzggbVar.zzb());
        return (zzgrp) zzc2.zzbr();
    }

    private static zzgtz zzh(zzgfz zzgfzVar) {
        if (zzgfz.zza.equals(zzgfzVar)) {
            return zzgtz.TINK;
        }
        if (zzgfz.zzb.equals(zzgfzVar)) {
            return zzgtz.CRUNCHY;
        }
        if (zzgfz.zzc.equals(zzgfzVar)) {
            return zzgtz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgfzVar)));
    }
}
