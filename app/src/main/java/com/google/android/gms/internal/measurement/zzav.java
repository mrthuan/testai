package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.h;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzav extends zzaw {
    public zzav() {
        this.zza.add(zzbl.BITWISE_AND);
        this.zza.add(zzbl.BITWISE_LEFT_SHIFT);
        this.zza.add(zzbl.BITWISE_NOT);
        this.zza.add(zzbl.BITWISE_OR);
        this.zza.add(zzbl.BITWISE_RIGHT_SHIFT);
        this.zza.add(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.zza.add(zzbl.BITWISE_XOR);
    }

    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        zzbl zzblVar = zzbl.ADD;
        switch (zzh.zze(str).ordinal()) {
            case 4:
                return new zzah(Double.valueOf(zzh.zzb(zzgVar.zzb((zzap) h.d(zzbl.BITWISE_AND, 2, list, 0)).zzh().doubleValue()) & zzh.zzb(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue())));
            case 5:
                return new zzah(Double.valueOf(zzh.zzb(zzgVar.zzb((zzap) h.d(zzbl.BITWISE_LEFT_SHIFT, 2, list, 0)).zzh().doubleValue()) << ((int) (zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) & 31))));
            case 6:
                return new zzah(Double.valueOf(~zzh.zzb(zzgVar.zzb((zzap) h.d(zzbl.BITWISE_NOT, 1, list, 0)).zzh().doubleValue())));
            case 7:
                return new zzah(Double.valueOf(zzh.zzb(zzgVar.zzb((zzap) h.d(zzbl.BITWISE_OR, 2, list, 0)).zzh().doubleValue()) | zzh.zzb(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue())));
            case 8:
                return new zzah(Double.valueOf(zzh.zzb(zzgVar.zzb((zzap) h.d(zzbl.BITWISE_RIGHT_SHIFT, 2, list, 0)).zzh().doubleValue()) >> ((int) (zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) & 31))));
            case 9:
                return new zzah(Double.valueOf(zzh.zzd(zzgVar.zzb((zzap) h.d(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list, 0)).zzh().doubleValue()) >>> ((int) (zzh.zzd(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue()) & 31))));
            case 10:
                return new zzah(Double.valueOf(zzh.zzb(zzgVar.zzb((zzap) h.d(zzbl.BITWISE_XOR, 2, list, 0)).zzh().doubleValue()) ^ zzh.zzb(zzgVar.zzb((zzap) list.get(1)).zzh().doubleValue())));
            default:
                return super.zzb(str);
        }
    }
}
