package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgii {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvr zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglg zze;
    private static final zzglc zzf;

    static {
        zzgvr zzb2 = zzgoa.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zzb = zzb2;
        zzc = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgie
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnq zza(zzgen zzgenVar) {
                return zzgii.zzd((zzgid) zzgenVar);
            }
        }, zzgid.class, zzgnm.class);
        zzd = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzgif
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgen zza(zzgnq zzgnqVar) {
                return zzgii.zzb((zzgnm) zzgnqVar);
            }
        }, zzb2, zzgnm.class);
        zze = zzglg.zzb(new zzgle() { // from class: com.google.android.gms.internal.ads.zzgig
            @Override // com.google.android.gms.internal.ads.zzgle
            public final zzgnq zza(zzgdy zzgdyVar, zzger zzgerVar) {
                return zzgii.zzc((zzghx) zzgdyVar, zzgerVar);
            }
        }, zzghx.class, zzgnl.class);
        zzf = zzglc.zzb(new zzgla() { // from class: com.google.android.gms.internal.ads.zzgih
            @Override // com.google.android.gms.internal.ads.zzgla
            public final zzgdy zza(zzgnq zzgnqVar, zzger zzgerVar) {
                return zzgii.zza((zzgnl) zzgnqVar, zzgerVar);
            }
        }, zzb2, zzgnl.class);
    }

    public static /* synthetic */ zzghx zza(zzgnl zzgnlVar, zzger zzgerVar) {
        if (zzgnlVar.zzg().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                zzgtv zze2 = zzgtv.zze(zzgnlVar.zze(), zzgxi.zza());
                if (zze2.zza() == 0) {
                    return zzghx.zza(zzf(zze2.zzf(), zzgnlVar.zzc()), zzgnlVar.zzf());
                }
                throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got ".concat(String.valueOf(zze2)));
            } catch (zzgyn e10) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgid zzb(zzgnm zzgnmVar) {
        if (zzgnmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return zzf(zzgty.zzf(zzgnmVar.zzc().zzh(), zzgxi.zza()), zzgnmVar.zzc().zzg());
            } catch (zzgyn e10) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(zzgnmVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgnl zzc(zzghx zzghxVar, zzger zzgerVar) {
        zzgtu zzc2 = zzgtv.zzc();
        zzc2.zza(zzg(zzghxVar.zzb()));
        return zzgnl.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzgtv) zzc2.zzbr()).zzaN(), zzgsu.REMOTE, zzh(zzghxVar.zzb().zzc()), zzghxVar.zzd());
    }

    public static /* synthetic */ zzgnm zzd(zzgid zzgidVar) {
        zzgsy zza2 = zzgsz.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza2.zzc(zzg(zzgidVar).zzaN());
        zza2.zza(zzh(zzgidVar.zzc()));
        return zzgnm.zzb((zzgsz) zza2.zzbr());
    }

    public static void zze(zzgmk zzgmkVar) {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static zzgid zzf(zzgty zzgtyVar, zzgtz zzgtzVar) {
        zzgia zzgiaVar;
        zzgib zzgibVar;
        zzgsy zza2 = zzgsz.zza();
        zza2.zzb(zzgtyVar.zza().zzi());
        zza2.zzc(zzgtyVar.zza().zzh());
        zza2.zza(zzgtz.RAW);
        zzgen zza3 = zzget.zza(((zzgsz) zza2.zzbr()).zzaV());
        if (zza3 instanceof zzggo) {
            zzgiaVar = zzgia.zza;
        } else if (zza3 instanceof zzghh) {
            zzgiaVar = zzgia.zzc;
        } else if (zza3 instanceof zzgiw) {
            zzgiaVar = zzgia.zzb;
        } else if (zza3 instanceof zzgfp) {
            zzgiaVar = zzgia.zzd;
        } else if (zza3 instanceof zzggb) {
            zzgiaVar = zzgia.zze;
        } else if (zza3 instanceof zzghb) {
            zzgiaVar = zzgia.zzf;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(zza3.toString()));
        }
        zzghz zzghzVar = new zzghz(null);
        int ordinal = zzgtzVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                zzgibVar = zzgib.zzb;
            } else {
                throw new GeneralSecurityException(b.a.c("Unable to parse OutputPrefixType: ", zzgtzVar.zza()));
            }
        } else {
            zzgibVar = zzgib.zza;
        }
        zzghzVar.zzd(zzgibVar);
        zzghzVar.zzc(zzgtyVar.zzg());
        zzghzVar.zza((zzgex) zza3);
        zzghzVar.zzb(zzgiaVar);
        return zzghzVar.zze();
    }

    private static zzgty zzg(zzgid zzgidVar) {
        try {
            zzgsz zzf2 = zzgsz.zzf(zzget.zzb(zzgidVar.zzb()), zzgxi.zza());
            zzgtx zzc2 = zzgty.zzc();
            zzc2.zzb(zzgidVar.zzd());
            zzc2.zza(zzf2);
            return (zzgty) zzc2.zzbr();
        } catch (zzgyn e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }

    private static zzgtz zzh(zzgib zzgibVar) {
        if (zzgib.zza.equals(zzgibVar)) {
            return zzgtz.TINK;
        }
        if (zzgib.zzb.equals(zzgibVar)) {
            return zzgtz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzgibVar)));
    }
}
