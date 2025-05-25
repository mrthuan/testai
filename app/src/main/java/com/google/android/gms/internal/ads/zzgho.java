package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgho {
    public static final /* synthetic */ int zza = 0;
    private static final zzgdz zzb = zzglh.zzd("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", zzgdo.class, zzgsu.SYMMETRIC, zzgtv.zzg());
    private static final zzglz zzc = new zzglz() { // from class: com.google.android.gms.internal.ads.zzghm
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdy zza(zzgen zzgenVar, Integer num) {
            return zzghx.zza((zzgid) zzgenVar, num);
        }
    };
    private static final zzgmx zzd = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzghn
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdy zzgdyVar) {
            zzghx zzghxVar = (zzghx) zzgdyVar;
            int i10 = zzgho.zza;
            String zzd2 = zzghxVar.zzb().zzd();
            zzgex zzb2 = zzghxVar.zzb().zzb();
            zzgdo zzb3 = zzgel.zza(zzd2).zzb();
            int i11 = zzghl.zza;
            try {
                return zzgkh.zzc(new zzghl(zzgsz.zzf(zzget.zzb(zzb2), zzgxi.zza()), zzb3), zzghxVar.zzc());
            } catch (zzgyn e10) {
                throw new GeneralSecurityException(e10);
            }
        }
    }, zzghx.class, zzgdo.class);

    public static void zza(boolean z10) {
        if (zzgkr.zza(1)) {
            int i10 = zzgii.zza;
            zzgii.zze(zzgmk.zzc());
            zzgma.zzb().zzc(zzc, zzgid.class);
            zzgmh.zza().zze(zzd);
            zzgky.zzc().zzd(zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
    }
}
