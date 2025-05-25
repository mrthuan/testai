package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgko {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvr zzb;
    private static final zzgmt zzc;
    private static final zzgmp zzd;
    private static final zzglg zze;
    private static final zzglc zzf;

    static {
        zzgvr zzb2 = zzgoa.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zzb = zzb2;
        zzc = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgkk
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnq zza(zzgen zzgenVar) {
                return zzgko.zzd((zzgiw) zzgenVar);
            }
        }, zzgiw.class, zzgnm.class);
        zzd = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzgkl
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgen zza(zzgnq zzgnqVar) {
                return zzgko.zzb((zzgnm) zzgnqVar);
            }
        }, zzb2, zzgnm.class);
        zze = zzglg.zzb(new zzgle() { // from class: com.google.android.gms.internal.ads.zzgkm
            @Override // com.google.android.gms.internal.ads.zzgle
            public final zzgnq zza(zzgdy zzgdyVar, zzger zzgerVar) {
                return zzgko.zzc((zzgiq) zzgdyVar, zzgerVar);
            }
        }, zzgiq.class, zzgnl.class);
        zzf = zzglc.zzb(new zzgla() { // from class: com.google.android.gms.internal.ads.zzgkn
            @Override // com.google.android.gms.internal.ads.zzgla
            public final zzgdy zza(zzgnq zzgnqVar, zzger zzgerVar) {
                return zzgko.zza((zzgnl) zzgnqVar, zzgerVar);
            }
        }, zzb2, zzgnl.class);
    }

    public static /* synthetic */ zzgiq zza(zzgnl zzgnlVar, zzger zzgerVar) {
        if (zzgnlVar.zzg().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                zzguf zze2 = zzguf.zze(zzgnlVar.zze(), zzgxi.zza());
                if (zze2.zza() == 0) {
                    return zzgiq.zza(zzf(zzgnlVar.zzc()), zzgvs.zzb(zze2.zzf().zzA(), zzgerVar), zzgnlVar.zzf());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyn unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgiw zzb(zzgnm zzgnmVar) {
        if (zzgnmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (zzgui.zze(zzgnmVar.zzc().zzh(), zzgxi.zza()).zza() == 0) {
                    return zzgiw.zzc(zzf(zzgnmVar.zzc().zzg()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzgyn e10) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(zzgnmVar.zzc().zzi())));
    }

    public static /* synthetic */ zzgnl zzc(zzgiq zzgiqVar, zzger zzgerVar) {
        zzgue zzc2 = zzguf.zzc();
        byte[] zzd2 = zzgiqVar.zzd().zzd(zzgerVar);
        zzc2.zza(zzgwm.zzv(zzd2, 0, zzd2.length));
        return zzgnl.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzguf) zzc2.zzbr()).zzaN(), zzgsu.SYMMETRIC, zzg(zzgiqVar.zzb().zzb()), zzgiqVar.zze());
    }

    public static /* synthetic */ zzgnm zzd(zzgiw zzgiwVar) {
        zzgsy zza2 = zzgsz.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza2.zzc(zzgui.zzd().zzaN());
        zza2.zza(zzg(zzgiwVar.zzb()));
        return zzgnm.zzb((zzgsz) zza2.zzbr());
    }

    public static void zze(zzgmk zzgmkVar) {
        zzgmkVar.zzi(zzc);
        zzgmkVar.zzh(zzd);
        zzgmkVar.zzg(zze);
        zzgmkVar.zzf(zzf);
    }

    private static zzgiv zzf(zzgtz zzgtzVar) {
        int ordinal = zzgtzVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException(b.a.c("Unable to parse OutputPrefixType: ", zzgtzVar.zza()));
                    }
                } else {
                    return zzgiv.zzc;
                }
            }
            return zzgiv.zzb;
        }
        return zzgiv.zza;
    }

    private static zzgtz zzg(zzgiv zzgivVar) {
        if (zzgiv.zza.equals(zzgivVar)) {
            return zzgtz.TINK;
        }
        if (zzgiv.zzb.equals(zzgivVar)) {
            return zzgtz.CRUNCHY;
        }
        if (zzgiv.zzc.equals(zzgivVar)) {
            return zzgtz.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(zzgivVar.toString()));
    }
}
