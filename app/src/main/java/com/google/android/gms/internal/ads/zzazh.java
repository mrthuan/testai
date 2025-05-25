package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzazh implements Comparator {
    public zzazh(zzazi zzaziVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzayw zzaywVar = (zzayw) obj;
        zzayw zzaywVar2 = (zzayw) obj2;
        if (zzaywVar.zzd() < zzaywVar2.zzd()) {
            return -1;
        }
        if (zzaywVar.zzd() <= zzaywVar2.zzd()) {
            if (zzaywVar.zzb() < zzaywVar2.zzb()) {
                return -1;
            }
            if (zzaywVar.zzb() <= zzaywVar2.zzb()) {
                float zza = (zzaywVar.zza() - zzaywVar.zzd()) * (zzaywVar.zzc() - zzaywVar.zzb());
                float zza2 = (zzaywVar2.zza() - zzaywVar2.zzd()) * (zzaywVar2.zzc() - zzaywVar2.zzb());
                if (zza > zza2) {
                    return -1;
                }
                if (zza >= zza2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
