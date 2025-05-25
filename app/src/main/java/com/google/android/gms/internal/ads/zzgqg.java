package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgqg {
    public static final /* synthetic */ int zza = 0;
    private static final zzgvr zzb;
    private static final zzgkw zzc;
    private static final zzgkw zzd;
    private static final zzgmt zze;
    private static final zzgmp zzf;
    private static final zzglg zzg;
    private static final zzglc zzh;

    static {
        zzgvr zzb2 = zzgoa.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zzb2;
        zzgku zza2 = zzgkw.zza();
        zza2.zza(zzgtz.RAW, zzgpe.zzd);
        zza2.zza(zzgtz.TINK, zzgpe.zza);
        zza2.zza(zzgtz.LEGACY, zzgpe.zzc);
        zza2.zza(zzgtz.CRUNCHY, zzgpe.zzb);
        zzc = zza2.zzb();
        zzgku zza3 = zzgkw.zza();
        zza3.zza(zzgsi.SHA1, zzgpd.zza);
        zza3.zza(zzgsi.SHA224, zzgpd.zzb);
        zza3.zza(zzgsi.SHA256, zzgpd.zzc);
        zza3.zza(zzgsi.SHA384, zzgpd.zzd);
        zza3.zza(zzgsi.SHA512, zzgpd.zze);
        zzd = zza3.zzb();
        zze = zzgmt.zzb(new zzgmr() { // from class: com.google.android.gms.internal.ads.zzgqc
            @Override // com.google.android.gms.internal.ads.zzgmr
            public final zzgnq zza(zzgen zzgenVar) {
                return zzgqg.zzb((zzgpg) zzgenVar);
            }
        }, zzgpg.class, zzgnm.class);
        zzf = zzgmp.zzb(new zzgmn() { // from class: com.google.android.gms.internal.ads.zzgqd
            @Override // com.google.android.gms.internal.ads.zzgmn
            public final zzgen zza(zzgnq zzgnqVar) {
                return zzgqg.zzd((zzgnm) zzgnqVar);
            }
        }, zzb2, zzgnm.class);
        zzg = zzglg.zzb(new zzgle() { // from class: com.google.android.gms.internal.ads.zzgqe
            @Override // com.google.android.gms.internal.ads.zzgle
            public final zzgnq zza(zzgdy zzgdyVar, zzger zzgerVar) {
                return zzgqg.zza((zzgov) zzgdyVar, zzgerVar);
            }
        }, zzgov.class, zzgnl.class);
        zzh = zzglc.zzb(new zzgla() { // from class: com.google.android.gms.internal.ads.zzgqf
            @Override // com.google.android.gms.internal.ads.zzgla
            public final zzgdy zza(zzgnq zzgnqVar, zzger zzgerVar) {
                return zzgqg.zzc((zzgnl) zzgnqVar, zzgerVar);
            }
        }, zzb2, zzgnl.class);
    }

    public static /* synthetic */ zzgnl zza(zzgov zzgovVar, zzger zzgerVar) {
        zzgsk zzc2 = zzgsl.zzc();
        zzc2.zzb(zzf(zzgovVar.zzb()));
        byte[] zzd2 = zzgovVar.zzd().zzd(zzgerVar);
        zzc2.zza(zzgwm.zzv(zzd2, 0, zzd2.length));
        return zzgnl.zza("type.googleapis.com/google.crypto.tink.HmacKey", ((zzgsl) zzc2.zzbr()).zzaN(), zzgsu.SYMMETRIC, (zzgtz) zzc.zzb(zzgovVar.zzb().zzg()), zzgovVar.zze());
    }

    public static /* synthetic */ zzgnm zzb(zzgpg zzgpgVar) {
        zzgsy zza2 = zzgsz.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgsn zzd2 = zzgso.zzd();
        zzd2.zzb(zzf(zzgpgVar));
        zzd2.zza(zzgpgVar.zzc());
        zza2.zzc(((zzgso) zzd2.zzbr()).zzaN());
        zza2.zza((zzgtz) zzc.zzb(zzgpgVar.zzg()));
        return zzgnm.zzb((zzgsz) zza2.zzbr());
    }

    public static /* synthetic */ zzgov zzc(zzgnl zzgnlVar, zzger zzgerVar) {
        if (zzgnlVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgsl zzf2 = zzgsl.zzf(zzgnlVar.zze(), zzgxi.zza());
                if (zzf2.zza() == 0) {
                    zzgpc zze2 = zzgpg.zze();
                    zze2.zzb(zzf2.zzh().zzd());
                    zze2.zzc(zzf2.zzg().zza());
                    zze2.zza((zzgpd) zzd.zzc(zzf2.zzg().zzc()));
                    zze2.zzd((zzgpe) zzc.zzc(zzgnlVar.zzc()));
                    zzgpg zze3 = zze2.zze();
                    zzgot zza2 = zzgov.zza();
                    zza2.zzc(zze3);
                    zza2.zzb(zzgvs.zzb(zzf2.zzh().zzA(), zzgerVar));
                    zza2.zza(zzgnlVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgyn | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
    }

    public static /* synthetic */ zzgpg zzd(zzgnm zzgnmVar) {
        if (zzgnmVar.zzc().zzi().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgso zzg2 = zzgso.zzg(zzgnmVar.zzc().zzh(), zzgxi.zza());
                if (zzg2.zzc() == 0) {
                    zzgpc zze2 = zzgpg.zze();
                    zze2.zzb(zzg2.zza());
                    zze2.zzc(zzg2.zzh().zza());
                    zze2.zza((zzgpd) zzd.zzc(zzg2.zzh().zzc()));
                    zze2.zzd((zzgpe) zzc.zzc(zzgnmVar.zzc().zzg()));
                    return zze2.zze();
                }
                throw new GeneralSecurityException(b.a.c("Parsing HmacParameters failed: unknown Version ", zzg2.zzc()));
            } catch (zzgyn e10) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(zzgnmVar.zzc().zzi())));
    }

    public static void zze(zzgmk zzgmkVar) {
        zzgmkVar.zzi(zze);
        zzgmkVar.zzh(zzf);
        zzgmkVar.zzg(zzg);
        zzgmkVar.zzf(zzh);
    }

    private static zzgsr zzf(zzgpg zzgpgVar) {
        zzgsq zzd2 = zzgsr.zzd();
        zzd2.zzb(zzgpgVar.zzb());
        zzd2.zza((zzgsi) zzd.zzb(zzgpgVar.zzf()));
        return (zzgsr) zzd2.zzbr();
    }
}
