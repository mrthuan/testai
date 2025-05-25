package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzzc {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzyy
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((zzzb) obj).zza - ((zzzb) obj2).zza;
        }
    };
    private static final Comparator zzb = new Comparator() { // from class: com.google.android.gms.internal.ads.zzyz
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((zzzb) obj).zzc, ((zzzb) obj2).zzc);
        }
    };
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzzb[] zzd = new zzzb[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzzc(int i10) {
    }

    public final float zza(float f10) {
        ArrayList arrayList;
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f11 = this.zzg;
        int i10 = 0;
        for (int i11 = 0; i11 < this.zzc.size(); i11++) {
            zzzb zzzbVar = (zzzb) this.zzc.get(i11);
            i10 += zzzbVar.zzb;
            if (i10 >= 0.5f * f11) {
                return zzzbVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        return ((zzzb) this.zzc.get(arrayList.size() - 1)).zzc;
    }

    public final void zzb(int i10, float f10) {
        zzzb zzzbVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i11 = this.zzh;
        if (i11 > 0) {
            zzzb[] zzzbVarArr = this.zzd;
            int i12 = i11 - 1;
            this.zzh = i12;
            zzzbVar = zzzbVarArr[i12];
        } else {
            zzzbVar = new zzzb(null);
        }
        int i13 = this.zzf;
        this.zzf = i13 + 1;
        zzzbVar.zza = i13;
        zzzbVar.zzb = i10;
        zzzbVar.zzc = f10;
        this.zzc.add(zzzbVar);
        this.zzg += i10;
        while (true) {
            int i14 = this.zzg;
            if (i14 > 2000) {
                int i15 = i14 - 2000;
                zzzb zzzbVar2 = (zzzb) this.zzc.get(0);
                int i16 = zzzbVar2.zzb;
                if (i16 <= i15) {
                    this.zzg -= i16;
                    this.zzc.remove(0);
                    int i17 = this.zzh;
                    if (i17 < 5) {
                        zzzb[] zzzbVarArr2 = this.zzd;
                        this.zzh = i17 + 1;
                        zzzbVarArr2[i17] = zzzbVar2;
                    }
                } else {
                    zzzbVar2.zzb = i16 - i15;
                    this.zzg -= i15;
                }
            } else {
                return;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
