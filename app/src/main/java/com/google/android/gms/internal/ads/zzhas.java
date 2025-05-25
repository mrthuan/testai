package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzhas {
    public abstract Object zza(Object obj);

    public abstract Object zzb();

    public abstract Object zzc(Object obj);

    public abstract void zzd(Object obj, int i10, int i11);

    public abstract void zze(Object obj, int i10, long j10);

    public abstract void zzf(Object obj, int i10, Object obj2);

    public abstract void zzg(Object obj, int i10, zzgwm zzgwmVar);

    public abstract void zzh(Object obj, int i10, long j10);

    public abstract void zzi(Object obj);

    public final boolean zzj(Object obj, zzgzw zzgzwVar) {
        int zzd = zzgzwVar.zzd();
        int i10 = zzd >>> 3;
        int i11 = zzd & 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                zzd(obj, i10, zzgzwVar.zzf());
                                return true;
                            }
                            throw zzgyn.zza();
                        }
                        return false;
                    }
                    Object zzb = zzb();
                    int i12 = i10 << 3;
                    while (zzgzwVar.zzc() != Integer.MAX_VALUE && zzj(zzb, zzgzwVar)) {
                    }
                    if ((4 | i12) == zzgzwVar.zzd()) {
                        zzc(zzb);
                        zzf(obj, i10, zzb);
                        return true;
                    }
                    throw zzgyn.zzb();
                }
                zzg(obj, i10, zzgzwVar.zzp());
                return true;
            }
            zze(obj, i10, zzgzwVar.zzk());
            return true;
        }
        zzh(obj, i10, zzgzwVar.zzl());
        return true;
    }
}
