package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
final class zzgzb implements zzhaf {
    private static final zzgzh zza = new zzgyz();
    private final zzgzh zzb;

    public zzgzb() {
        zzgzh zzgzhVar = zza;
        int i10 = zzgzt.zza;
        zzgza zzgzaVar = new zzgza(zzgxr.zza(), zzgzhVar);
        byte[] bArr = zzgyl.zzb;
        this.zzb = zzgzaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhaf
    public final zzhae zza(Class cls) {
        zzgxj zzgxjVar;
        int i10 = zzhag.zza;
        if (!zzgxy.class.isAssignableFrom(cls)) {
            int i11 = zzgzt.zza;
        }
        zzgzg zzb = this.zzb.zzb(cls);
        if (!zzb.zzb()) {
            int i12 = zzgzt.zza;
            zzgzp zza2 = zzgzq.zza();
            zzgyw zza3 = zzgyx.zza();
            zzhas zzm = zzhag.zzm();
            if (zzb.zzc() - 1 != 1) {
                zzgxjVar = zzgxl.zza();
            } else {
                zzgxjVar = null;
            }
            return zzgzm.zzm(cls, zzb, zza2, zza3, zzm, zzgxjVar, zzgzf.zza());
        }
        int i13 = zzgzt.zza;
        return zzgzn.zzc(zzhag.zzm(), zzgxl.zza(), zzb.zza());
    }
}
