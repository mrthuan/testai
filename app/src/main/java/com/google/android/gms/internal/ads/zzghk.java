package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzghk {
    public static final /* synthetic */ int zza = 0;
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzghi
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdy zzgdyVar) {
            zzghp zzghpVar = (zzghp) zzgdyVar;
            int i10 = zzghk.zza;
            zzgek zza2 = zzgel.zza(zzghpVar.zzb().zzd());
            zzghpVar.zzb();
            return zzgkh.zzc(zza2.zzb(), zzghpVar.zzc());
        }
    }, zzghp.class, zzgdo.class);
    private static final zzgdz zzc = zzglh.zzd("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzgdo.class, zzgsu.REMOTE, zzgtp.zzg());
    private static final zzglz zzd = new zzglz() { // from class: com.google.android.gms.internal.ads.zzghj
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdy zza(zzgen zzgenVar, Integer num) {
            return zzghp.zza((zzghr) zzgenVar, num);
        }
    };

    public static void zza(boolean z10) {
        if (zzgkr.zza(1)) {
            int i10 = zzghw.zza;
            zzghw.zze(zzgmk.zzc());
            zzgmh.zza().zze(zzb);
            zzgma.zzb().zzc(zzd, zzghr.class);
            zzgky.zzc().zzd(zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
    }
}
