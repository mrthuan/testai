package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzalv implements zzajv {
    private final List zza;
    private final long[] zzb;
    private final long[] zzc;

    public zzalv(List list) {
        this.zza = Collections.unmodifiableList(new ArrayList(list));
        int size = list.size();
        this.zzb = new long[size + size];
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzalk zzalkVar = (zzalk) list.get(i10);
            long[] jArr = this.zzb;
            int i11 = i10 + i10;
            jArr[i11] = zzalkVar.zzb;
            jArr[i11 + 1] = zzalkVar.zzc;
        }
        long[] jArr2 = this.zzb;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.zzc = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // com.google.android.gms.internal.ads.zzajv
    public final int zza() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzajv
    public final long zzb(int i10) {
        boolean z10;
        boolean z11 = true;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzd(z10);
        if (i10 >= this.zzc.length) {
            z11 = false;
        }
        zzdi.zzd(z11);
        return this.zzc[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzajv
    public final List zzc(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            long[] jArr = this.zzb;
            int i11 = i10 + i10;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                zzalk zzalkVar = (zzalk) this.zza.get(i10);
                zzdb zzdbVar = zzalkVar.zza;
                if (zzdbVar.zze == -3.4028235E38f) {
                    arrayList2.add(zzalkVar);
                } else {
                    arrayList.add(zzdbVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.gms.internal.ads.zzalu
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((zzalk) obj).zzb, ((zzalk) obj2).zzb);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            zzcz zzb = ((zzalk) arrayList2.get(i12)).zza.zzb();
            zzb.zze((-1) - i12, 1);
            arrayList.add(zzb.zzp());
        }
        return arrayList;
    }
}
