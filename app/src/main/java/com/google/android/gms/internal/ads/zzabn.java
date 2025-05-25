package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzabn {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final float zzj;
    public final String zzk;

    private zzabn(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = i17;
        this.zzj = f10;
        this.zzk = str;
    }

    public static zzabn zza(zzek zzekVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str;
        float f10;
        try {
            zzekVar.zzL(4);
            int zzm = (zzekVar.zzm() & 3) + 1;
            if (zzm != 3) {
                ArrayList arrayList = new ArrayList();
                int zzm2 = zzekVar.zzm() & 31;
                for (int i17 = 0; i17 < zzm2; i17++) {
                    arrayList.add(zzb(zzekVar));
                }
                int zzm3 = zzekVar.zzm();
                for (int i18 = 0; i18 < zzm3; i18++) {
                    arrayList.add(zzb(zzekVar));
                }
                if (zzm2 > 0) {
                    zzfg zze = zzfh.zze((byte[]) arrayList.get(0), zzm + 1, ((byte[]) arrayList.get(0)).length);
                    int i19 = zze.zze;
                    int i20 = zze.zzf;
                    int i21 = zze.zzj;
                    int i22 = zze.zzk;
                    int i23 = zze.zzl;
                    float f11 = zze.zzg;
                    str = zzdk.zza(zze.zza, zze.zzb, zze.zzc);
                    i15 = i22;
                    i16 = i23;
                    f10 = f11;
                    i12 = zze.zzh + 8;
                    i13 = zze.zzi + 8;
                    i14 = i21;
                    i10 = i19;
                    i11 = i20;
                } else {
                    i10 = -1;
                    i11 = -1;
                    i12 = -1;
                    i13 = -1;
                    i14 = -1;
                    i15 = -1;
                    i16 = -1;
                    str = null;
                    f10 = 1.0f;
                }
                return new zzabn(arrayList, zzm, i10, i11, i12, i13, i14, i15, i16, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzbo.zza("Error parsing AVC config", e10);
        }
    }

    private static byte[] zzb(zzek zzekVar) {
        int zzq = zzekVar.zzq();
        int zzd = zzekVar.zzd();
        zzekVar.zzL(zzq);
        return zzdk.zzc(zzekVar.zzM(), zzd, zzq);
    }
}
