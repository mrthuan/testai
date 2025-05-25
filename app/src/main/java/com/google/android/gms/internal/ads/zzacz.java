package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzacz {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final float zzh;
    public final String zzi;

    private zzacz(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f10, String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i13;
        this.zzd = i14;
        this.zze = i15;
        this.zzf = i16;
        this.zzg = i17;
        this.zzh = f10;
        this.zzi = str;
    }

    public static zzacz zza(zzek zzekVar) {
        List singletonList;
        int i10;
        int i11;
        int i12;
        try {
            zzekVar.zzL(21);
            int zzm = zzekVar.zzm() & 3;
            int zzm2 = zzekVar.zzm();
            int zzd = zzekVar.zzd();
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < zzm2; i15++) {
                zzekVar.zzL(1);
                int zzq = zzekVar.zzq();
                for (int i16 = 0; i16 < zzq; i16++) {
                    int zzq2 = zzekVar.zzq();
                    i14 += zzq2 + 4;
                    zzekVar.zzL(zzq2);
                }
            }
            zzekVar.zzK(zzd);
            byte[] bArr = new byte[i14];
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            String str = null;
            float f10 = 1.0f;
            int i24 = 0;
            int i25 = 0;
            while (i24 < zzm2) {
                int zzm3 = zzekVar.zzm() & 63;
                int zzq3 = zzekVar.zzq();
                int i26 = i13;
                while (i26 < zzq3) {
                    int zzq4 = zzekVar.zzq();
                    int i27 = zzm2;
                    System.arraycopy(zzfh.zza, i13, bArr, i25, 4);
                    int i28 = i25 + 4;
                    System.arraycopy(zzekVar.zzM(), zzekVar.zzd(), bArr, i28, zzq4);
                    int i29 = i28 + zzq4;
                    if (zzm3 == 33 && i26 == 0) {
                        zzfe zzc = zzfh.zzc(bArr, i28 + 2, i29);
                        i17 = zzc.zzi;
                        i18 = zzc.zzj;
                        i19 = zzc.zze + 8;
                        i20 = zzc.zzf + 8;
                        int i30 = zzc.zzl;
                        int i31 = zzc.zzm;
                        int i32 = zzc.zzn;
                        i10 = i29;
                        float f11 = zzc.zzk;
                        i11 = zzm3;
                        i12 = zzq3;
                        str = zzdk.zzb(zzc.zza, zzc.zzb, zzc.zzc, zzc.zzd, zzc.zzg, zzc.zzh);
                        f10 = f11;
                        i21 = i30;
                        i23 = i32;
                        i22 = i31;
                        i26 = 0;
                    } else {
                        i10 = i29;
                        i11 = zzm3;
                        i12 = zzq3;
                    }
                    zzekVar.zzL(zzq4);
                    i26++;
                    zzm2 = i27;
                    i25 = i10;
                    zzm3 = i11;
                    zzq3 = i12;
                    i13 = 0;
                }
                i24++;
                i13 = 0;
            }
            if (i14 == 0) {
                singletonList = Collections.emptyList();
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new zzacz(singletonList, zzm + 1, i17, i18, i19, i20, i21, i22, i23, f10, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzbo.zza("Error parsing HEVC config", e10);
        }
    }
}
