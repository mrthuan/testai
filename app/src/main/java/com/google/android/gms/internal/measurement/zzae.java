package com.google.android.gms.internal.measurement;

import b.a;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.2 */
/* loaded from: classes2.dex */
public final class zzae implements Iterable, zzap, zzal {
    final SortedMap zza;
    final Map zzb;

    public zzae() {
        this.zza = new TreeMap();
        this.zzb = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        if (zzc() != zzaeVar.zzc()) {
            return false;
        }
        if (this.zza.isEmpty()) {
            return zzaeVar.zza.isEmpty();
        }
        for (int intValue = ((Integer) this.zza.firstKey()).intValue(); intValue <= ((Integer) this.zza.lastKey()).intValue(); intValue++) {
            if (!zze(intValue).equals(zzaeVar.zze(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzad(this);
    }

    public final String toString() {
        return zzj(",");
    }

    public final int zzb() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !Constants.PUSH.equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str) && !"sort".equals(str) && !"splice".equals(str) && !"toString".equals(str) && !"unshift".equals(str)) {
            return zzaj.zza(this, new zzat(str), zzgVar, list);
        }
        return zzbb.zza(str, this, zzgVar, list);
    }

    public final int zzc() {
        if (this.zza.isEmpty()) {
            return 0;
        }
        return ((Integer) this.zza.lastKey()).intValue() + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        zzae zzaeVar = new zzae();
        for (Map.Entry entry : this.zza.entrySet()) {
            if (entry.getValue() instanceof zzal) {
                zzaeVar.zza.put((Integer) entry.getKey(), (zzap) entry.getValue());
            } else {
                zzaeVar.zza.put((Integer) entry.getKey(), ((zzap) entry.getValue()).zzd());
            }
        }
        return zzaeVar;
    }

    public final zzap zze(int i10) {
        zzap zzapVar;
        if (i10 < zzc()) {
            if (zzs(i10) && (zzapVar = (zzap) this.zza.get(Integer.valueOf(i10))) != null) {
                return zzapVar;
            }
            return zzap.zzf;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String str) {
        zzap zzapVar;
        if ("length".equals(str)) {
            return new zzah(Double.valueOf(zzc()));
        }
        if (zzt(str) && (zzapVar = (zzap) this.zzb.get(str)) != null) {
            return zzapVar;
        }
        return zzap.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        if (this.zza.size() == 1) {
            return zze(0).zzh();
        }
        if (this.zza.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return zzj(",");
    }

    public final String zzj(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.zza.isEmpty()) {
            int i10 = 0;
            while (true) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i10 >= zzc()) {
                    break;
                }
                zzap zze = zze(i10);
                sb2.append(str2);
                if (!(zze instanceof zzau) && !(zze instanceof zzan)) {
                    sb2.append(zze.zzi());
                }
                i10++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    public final Iterator zzk() {
        return this.zza.keySet().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzac(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final List zzm() {
        ArrayList arrayList = new ArrayList(zzc());
        for (int i10 = 0; i10 < zzc(); i10++) {
            arrayList.add(zze(i10));
        }
        return arrayList;
    }

    public final void zzn() {
        this.zza.clear();
    }

    public final void zzo(int i10, zzap zzapVar) {
        if (i10 >= 0) {
            if (i10 >= zzc()) {
                zzq(i10, zzapVar);
                return;
            }
            for (int intValue = ((Integer) this.zza.lastKey()).intValue(); intValue >= i10; intValue--) {
                SortedMap sortedMap = this.zza;
                Integer valueOf = Integer.valueOf(intValue);
                zzap zzapVar2 = (zzap) sortedMap.get(valueOf);
                if (zzapVar2 != null) {
                    zzq(intValue + 1, zzapVar2);
                    this.zza.remove(valueOf);
                }
            }
            zzq(i10, zzapVar);
            return;
        }
        throw new IllegalArgumentException(a.c("Invalid value index: ", i10));
    }

    public final void zzp(int i10) {
        int intValue = ((Integer) this.zza.lastKey()).intValue();
        if (i10 <= intValue && i10 >= 0) {
            this.zza.remove(Integer.valueOf(i10));
            if (i10 == intValue) {
                SortedMap sortedMap = this.zza;
                int i11 = i10 - 1;
                Integer valueOf = Integer.valueOf(i11);
                if (!sortedMap.containsKey(valueOf) && i11 >= 0) {
                    this.zza.put(valueOf, zzap.zzf);
                    return;
                }
                return;
            }
            while (true) {
                i10++;
                if (i10 <= ((Integer) this.zza.lastKey()).intValue()) {
                    SortedMap sortedMap2 = this.zza;
                    Integer valueOf2 = Integer.valueOf(i10);
                    zzap zzapVar = (zzap) sortedMap2.get(valueOf2);
                    if (zzapVar != null) {
                        this.zza.put(Integer.valueOf(i10 - 1), zzapVar);
                        this.zza.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void zzq(int i10, zzap zzapVar) {
        if (i10 <= 32468) {
            if (i10 >= 0) {
                if (zzapVar == null) {
                    this.zza.remove(Integer.valueOf(i10));
                    return;
                } else {
                    this.zza.put(Integer.valueOf(i10), zzapVar);
                    return;
                }
            }
            throw new IndexOutOfBoundsException(a.c("Out of bounds index: ", i10));
        }
        throw new IllegalStateException("Array too large");
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String str, zzap zzapVar) {
        if (zzapVar == null) {
            this.zzb.remove(str);
        } else {
            this.zzb.put(str, zzapVar);
        }
    }

    public final boolean zzs(int i10) {
        if (i10 >= 0 && i10 <= ((Integer) this.zza.lastKey()).intValue()) {
            return this.zza.containsKey(Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(a.c("Out of bounds index: ", i10));
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String str) {
        if (!"length".equals(str) && !this.zzb.containsKey(str)) {
            return false;
        }
        return true;
    }

    public zzae(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                zzq(i10, (zzap) list.get(i10));
            }
        }
    }
}
