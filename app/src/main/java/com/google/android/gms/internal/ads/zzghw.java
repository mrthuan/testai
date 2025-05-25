package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzghw {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvr zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglg zze;
    private static final zzglc zzf;

    static {
        zzgvr zzb2 = zzgoa.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzb = zzb2;
        zzc = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzghs
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnq zza(zzgen zzgenVar) {
                return zzghw.zzd((zzghr) zzgenVar);
            }
        }, zzghr.class, zzgnm.class);
        zzd = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzght
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgen zza(zzgnq zzgnqVar) {
                return zzghw.zzb((zzgnm) zzgnqVar);
            }
        }, zzb2, zzgnm.class);
        zze = zzglg.zzb(new zzgle() { // from class: com.google.android.gms.internal.ads.zzghu
            @Override // com.google.android.gms.internal.ads.zzgle
            public final zzgnq zza(zzgdy zzgdyVar, zzger zzgerVar) {
                return zzghw.zzc((zzghp) zzgdyVar, zzgerVar);
            }
        }, zzghp.class, zzgnl.class);
        zzf = zzglc.zzb(new zzgla() { // from class: com.google.android.gms.internal.ads.zzghv
            @Override // com.google.android.gms.internal.ads.zzgla
            public final zzgdy zza(zzgnq zzgnqVar, zzger zzgerVar) {
                return zzghw.zza((zzgnl) zzgnqVar, zzgerVar);
            }
        }, zzb2, zzgnl.class);
    }

    public static /* synthetic */ zzghp zza(zzgnl zzgnlVar, zzger zzgerVar) {
        if (zzgnlVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                zzgtp zze2 = zzgtp.zze(zzgnlVar.zze(), zzgxi.zza());
                if (zze2.zza() == 0) {
                    return zzghp.zza(zzghr.zzc(zze2.zzf().zzf(), zzf(zzgnlVar.zzc())), zzgnlVar.zzf());
                }
                throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got ".concat(String.valueOf(zze2)));
            } catch (zzgyn e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzghr zzb(zzgnm zzgnmVar) {
        if (zzgnmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                return zzghr.zzc(zzgts.zze(zzgnmVar.zzc().zzh(), zzgxi.zza()).zzf(), zzf(zzgnmVar.zzc().zzg()));
            } catch (zzgyn e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgnmVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgnl zzc(zzghp zzghpVar, zzger zzgerVar) {
        zzgto zzc2 = zzgtp.zzc();
        zzgtr zza2 = zzgts.zza();
        zza2.zza(zzghpVar.zzb().zzd());
        zzc2.zza((zzgts) zza2.zzbr());
        return zzgnl.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzgtp) zzc2.zzbr()).zzaN(), zzgsu.REMOTE, zzg(zzghpVar.zzb().zzb()), zzghpVar.zzd());
    }

    public static /* synthetic */ zzgnm zzd(zzghr zzghrVar) {
        zzgsy zza2 = zzgsz.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zzgtr zza3 = zzgts.zza();
        zza3.zza(zzghrVar.zzd());
        zza2.zzc(((zzgts) zza3.zzbr()).zzaN());
        zza2.zza(zzg(zzghrVar.zzb()));
        return zzgnm.zzb((zzgsz) zza2.zzbr());
    }

    public static void zze(zzgmk zzgmkVar) {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static zzghq zzf(zzgtz zzgtzVar) {
        int ordinal = zzgtzVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                return zzghq.zzb;
            }
            throw new GeneralSecurityException(b.a.c("Unable to parse OutputPrefixType: ", zzgtzVar.zza()));
        }
        return zzghq.zza;
    }

    private static zzgtz zzg(zzghq zzghqVar) {
        if (zzghq.zza.equals(zzghqVar)) {
            return zzgtz.TINK;
        }
        if (zzghq.zzb.equals(zzghqVar)) {
            return zzgtz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzghqVar.toString()));
    }
}
