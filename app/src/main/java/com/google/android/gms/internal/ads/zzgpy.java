package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgpy {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvr zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglg zze;
    private static final zzglc zzf;

    static {
        zzgvr zzb2 = zzgoa.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zzb2;
        zzc = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgpu
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnq zza(zzgen zzgenVar) {
                return zzgpy.zzb((zzgon) zzgenVar);
            }
        }, zzgon.class, zzgnm.class);
        zzd = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzgpv
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgen zza(zzgnq zzgnqVar) {
                return zzgpy.zzd((zzgnm) zzgnqVar);
            }
        }, zzb2, zzgnm.class);
        zze = zzglg.zzb(new zzgle() { // from class: com.google.android.gms.internal.ads.zzgpw
            @Override // com.google.android.gms.internal.ads.zzgle
            public final zzgnq zza(zzgdy zzgdyVar, zzger zzgerVar) {
                return zzgpy.zza((zzgoe) zzgdyVar, zzgerVar);
            }
        }, zzgoe.class, zzgnl.class);
        zzf = zzglc.zzb(new zzgla() { // from class: com.google.android.gms.internal.ads.zzgpx
            @Override // com.google.android.gms.internal.ads.zzgla
            public final zzgdy zza(zzgnq zzgnqVar, zzger zzgerVar) {
                return zzgpy.zzc((zzgnl) zzgnqVar, zzgerVar);
            }
        }, zzb2, zzgnl.class);
    }

    public static /* synthetic */ zzgnl zza(zzgoe zzgoeVar, zzger zzgerVar) {
        zzgqk zzc2 = zzgql.zzc();
        zzc2.zzb(zzg(zzgoeVar.zzb()));
        byte[] zzd2 = zzgoeVar.zzd().zzd(zzgerVar);
        zzc2.zza(zzgwm.zzv(zzd2, 0, zzd2.length));
        return zzgnl.zza("type.googleapis.com/google.crypto.tink.AesCmacKey", ((zzgql) zzc2.zzbr()).zzaN(), zzgsu.SYMMETRIC, zzh(zzgoeVar.zzb().zzf()), zzgoeVar.zze());
    }

    public static /* synthetic */ zzgnm zzb(zzgon zzgonVar) {
        zzgsy zza2 = zzgsz.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzgqn zzc2 = zzgqo.zzc();
        zzc2.zzb(zzg(zzgonVar));
        zzc2.zza(zzgonVar.zzc());
        zza2.zzc(((zzgqo) zzc2.zzbr()).zzaN());
        zza2.zza(zzh(zzgonVar.zzf()));
        return zzgnm.zzb((zzgsz) zza2.zzbr());
    }

    public static /* synthetic */ zzgoe zzc(zzgnl zzgnlVar, zzger zzgerVar) {
        if (zzgnlVar.zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgql zze2 = zzgql.zze(zzgnlVar.zze(), zzgxi.zza());
                if (zze2.zza() == 0) {
                    zzgok zze3 = zzgon.zze();
                    zze3.zza(zze2.zzg().zzd());
                    zze3.zzb(zze2.zzf().zza());
                    zze3.zzc(zzf(zzgnlVar.zzc()));
                    zzgon zzd2 = zze3.zzd();
                    zzgoc zza2 = zzgoe.zza();
                    zza2.zzc(zzd2);
                    zza2.zza(zzgvs.zzb(zze2.zzg().zzA(), zzgerVar));
                    zza2.zzb(zzgnlVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyn | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgon zzd(zzgnm zzgnmVar) {
        if (zzgnmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzgqo zze2 = zzgqo.zze(zzgnmVar.zzc().zzh(), zzgxi.zza());
                zzgok zze3 = zzgon.zze();
                zze3.zza(zze2.zza());
                zze3.zzb(zze2.zzf().zza());
                zze3.zzc(zzf(zzgnmVar.zzc().zzg()));
                return zze3.zzd();
            } catch (zzgyn e10) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgnmVar.zzc().zzi())));
    }

    public static void zze(zzgmk zzgmkVar) {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static zzgol zzf(zzgtz zzgtzVar) {
        int ordinal = zzgtzVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return zzgol.zzb;
                    }
                    throw new GeneralSecurityException(b.a.c("Unable to parse OutputPrefixType: ", zzgtzVar.zza()));
                }
                return zzgol.zzd;
            }
            return zzgol.zzc;
        }
        return zzgol.zza;
    }

    private static zzgqr zzg(zzgon zzgonVar) {
        zzgqq zzc2 = zzgqr.zzc();
        zzc2.zza(zzgonVar.zzb());
        return (zzgqr) zzc2.zzbr();
    }

    private static zzgtz zzh(zzgol zzgolVar) {
        if (zzgol.zza.equals(zzgolVar)) {
            return zzgtz.TINK;
        }
        if (zzgol.zzb.equals(zzgolVar)) {
            return zzgtz.CRUNCHY;
        }
        if (zzgol.zzd.equals(zzgolVar)) {
            return zzgtz.RAW;
        }
        if (zzgol.zzc.equals(zzgolVar)) {
            return zzgtz.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgolVar)));
    }
}
