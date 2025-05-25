package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgjb {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvr zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglg zze;
    private static final zzglc zzf;

    static {
        zzgvr zzb2 = zzgoa.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zzb2;
        zzc = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgix
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnq zza(zzgen zzgenVar) {
                return zzgjb.zzd((zzgfp) zzgenVar);
            }
        }, zzgfp.class, zzgnm.class);
        zzd = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzgiy
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgen zza(zzgnq zzgnqVar) {
                return zzgjb.zzb((zzgnm) zzgnqVar);
            }
        }, zzb2, zzgnm.class);
        zze = zzglg.zzb(new zzgle() { // from class: com.google.android.gms.internal.ads.zzgiz
            @Override // com.google.android.gms.internal.ads.zzgle
            public final zzgnq zza(zzgdy zzgdyVar, zzger zzgerVar) {
                return zzgjb.zzc((zzgff) zzgdyVar, zzgerVar);
            }
        }, zzgff.class, zzgnl.class);
        zzf = zzglc.zzb(new zzgla() { // from class: com.google.android.gms.internal.ads.zzgja
            @Override // com.google.android.gms.internal.ads.zzgla
            public final zzgdy zza(zzgnq zzgnqVar, zzger zzgerVar) {
                return zzgjb.zza((zzgnl) zzgnqVar, zzgerVar);
            }
        }, zzb2, zzgnl.class);
    }

    public static /* synthetic */ zzgff zza(zzgnl zzgnlVar, zzger zzgerVar) {
        if (zzgnlVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzgqu zze2 = zzgqu.zze(zzgnlVar.zze(), zzgxi.zza());
                if (zze2.zza() == 0) {
                    if (zze2.zzf().zza() == 0) {
                        if (zze2.zzg().zza() == 0) {
                            zzgfl zzf2 = zzgfp.zzf();
                            zzf2.zza(zze2.zzf().zzg().zzd());
                            zzf2.zzc(zze2.zzg().zzh().zzd());
                            zzf2.zzd(zze2.zzf().zzf().zza());
                            zzf2.zze(zze2.zzg().zzg().zza());
                            zzf2.zzb(zzf(zze2.zzg().zzg().zzc()));
                            zzf2.zzf(zzg(zzgnlVar.zzc()));
                            zzgfp zzg = zzf2.zzg();
                            zzgfd zza2 = zzgff.zza();
                            zza2.zzd(zzg);
                            zza2.zza(zzgvs.zzb(zze2.zzf().zzg().zzA(), zzgerVar));
                            zza2.zzb(zzgvs.zzb(zze2.zzg().zzh().zzA(), zzgerVar));
                            zza2.zzc(zzgnlVar.zzf());
                            return zza2.zze();
                        }
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyn unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgfp zzb(zzgnm zzgnmVar) {
        if (zzgnmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzgqx zzd2 = zzgqx.zzd(zzgnmVar.zzc().zzh(), zzgxi.zza());
                if (zzd2.zzf().zzc() == 0) {
                    zzgfl zzf2 = zzgfp.zzf();
                    zzf2.zza(zzd2.zze().zza());
                    zzf2.zzc(zzd2.zzf().zza());
                    zzf2.zzd(zzd2.zze().zzf().zza());
                    zzf2.zze(zzd2.zzf().zzh().zza());
                    zzf2.zzb(zzf(zzd2.zzf().zzh().zzc()));
                    zzf2.zzf(zzg(zzgnmVar.zzc().zzg()));
                    return zzf2.zzg();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyn e10) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgnmVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgnl zzc(zzgff zzgffVar, zzger zzgerVar) {
        zzgqt zzc2 = zzgqu.zzc();
        zzgqz zzc3 = zzgra.zzc();
        zzgrf zzc4 = zzgrg.zzc();
        zzc4.zza(zzgffVar.zzb().zzd());
        zzc3.zzb((zzgrg) zzc4.zzbr());
        byte[] zzd2 = zzgffVar.zzd().zzd(zzgerVar);
        zzc3.zza(zzgwm.zzv(zzd2, 0, zzd2.length));
        zzc2.zza((zzgra) zzc3.zzbr());
        zzgsk zzc5 = zzgsl.zzc();
        zzc5.zzb(zzh(zzgffVar.zzb()));
        byte[] zzd3 = zzgffVar.zze().zzd(zzgerVar);
        zzc5.zza(zzgwm.zzv(zzd3, 0, zzd3.length));
        zzc2.zzb((zzgsl) zzc5.zzbr());
        return zzgnl.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((zzgqu) zzc2.zzbr()).zzaN(), zzgsu.SYMMETRIC, zzi(zzgffVar.zzb().zzh()), zzgffVar.zzf());
    }

    public static /* synthetic */ zzgnm zzd(zzgfp zzgfpVar) {
        zzgsy zza2 = zzgsz.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzgqw zza3 = zzgqx.zza();
        zzgrc zzc2 = zzgrd.zzc();
        zzgrf zzc3 = zzgrg.zzc();
        zzc3.zza(zzgfpVar.zzd());
        zzc2.zzb((zzgrg) zzc3.zzbr());
        zzc2.zza(zzgfpVar.zzb());
        zza3.zza((zzgrd) zzc2.zzbr());
        zzgsn zzd2 = zzgso.zzd();
        zzd2.zzb(zzh(zzgfpVar));
        zzd2.zza(zzgfpVar.zzc());
        zza3.zzb((zzgso) zzd2.zzbr());
        zza2.zzc(((zzgqx) zza3.zzbr()).zzaN());
        zza2.zza(zzi(zzgfpVar.zzh()));
        return zzgnm.zzb((zzgsz) zza2.zzbr());
    }

    public static void zze(zzgmk zzgmkVar) {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static zzgfm zzf(zzgsi zzgsiVar) {
        int ordinal = zzgsiVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return zzgfm.zzb;
                        }
                        throw new GeneralSecurityException(b.a.c("Unable to parse HashType: ", zzgsiVar.zza()));
                    }
                    return zzgfm.zze;
                }
                return zzgfm.zzc;
            }
            return zzgfm.zzd;
        }
        return zzgfm.zza;
    }

    private static zzgfn zzg(zzgtz zzgtzVar) {
        int ordinal = zzgtzVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(b.a.c("Unable to parse OutputPrefixType: ", zzgtzVar.zza()));
                    }
                } else {
                    return zzgfn.zzc;
                }
            }
            return zzgfn.zzb;
        }
        return zzgfn.zza;
    }

    private static zzgsr zzh(zzgfp zzgfpVar) {
        zzgsi zzgsiVar;
        zzgsq zzd2 = zzgsr.zzd();
        zzd2.zzb(zzgfpVar.zze());
        zzgfm zzg = zzgfpVar.zzg();
        if (zzgfm.zza.equals(zzg)) {
            zzgsiVar = zzgsi.SHA1;
        } else if (zzgfm.zzb.equals(zzg)) {
            zzgsiVar = zzgsi.SHA224;
        } else if (zzgfm.zzc.equals(zzg)) {
            zzgsiVar = zzgsi.SHA256;
        } else if (zzgfm.zzd.equals(zzg)) {
            zzgsiVar = zzgsi.SHA384;
        } else if (zzgfm.zze.equals(zzg)) {
            zzgsiVar = zzgsi.SHA512;
        } else {
            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zzg)));
        }
        zzd2.zza(zzgsiVar);
        return (zzgsr) zzd2.zzbr();
    }

    private static zzgtz zzi(zzgfn zzgfnVar) {
        if (zzgfn.zza.equals(zzgfnVar)) {
            return zzgtz.TINK;
        }
        if (zzgfn.zzb.equals(zzgfnVar)) {
            return zzgtz.CRUNCHY;
        }
        if (zzgfn.zzc.equals(zzgfnVar)) {
            return zzgtz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgfnVar)));
    }
}
