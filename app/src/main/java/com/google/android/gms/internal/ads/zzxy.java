package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzxy extends zzyb {
    public abstract Pair zzd(zzxx zzxxVar, int[][][] iArr, int[] iArr2, zzui zzuiVar, zzcc zzccVar);

    @Override // com.google.android.gms.internal.ads.zzyb
    public final zzyc zzo(zzlh[] zzlhVarArr, zzwi zzwiVar, zzui zzuiVar, zzcc zzccVar) {
        boolean z10;
        boolean z11;
        zzfxr zzm;
        int[] iArr;
        boolean z12;
        int[] iArr2 = new int[3];
        zzcd[][] zzcdVarArr = new zzcd[3];
        int[][][] iArr3 = new int[3][];
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = zzwiVar.zzb;
            zzcdVarArr[i10] = new zzcd[i11];
            iArr3[i10] = new int[i11];
        }
        int i12 = 2;
        int[] iArr4 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            iArr4[i13] = zzlhVarArr[i13].zze();
        }
        int i14 = 0;
        while (i14 < zzwiVar.zzb) {
            zzcd zzb = zzwiVar.zzb(i14);
            int i15 = zzb.zzc;
            int i16 = i12;
            int i17 = 0;
            int i18 = 0;
            boolean z13 = true;
            while (i17 < i12) {
                zzlh zzlhVar = zzlhVarArr[i17];
                int i19 = 0;
                for (int i20 = 0; i20 < zzb.zza; i20++) {
                    i19 = Math.max(i19, zzlhVar.zzY(zzb.zzb(i20)) & 7);
                }
                if (iArr2[i17] == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i19 <= i18) {
                    if (i19 == i18 && i15 == 5 && !z13 && z12) {
                        i16 = i17;
                        i18 = i19;
                        z13 = true;
                    }
                } else {
                    z13 = z12;
                    i16 = i17;
                    i18 = i19;
                }
                i17++;
                i12 = 2;
            }
            if (i16 == i12) {
                iArr = new int[zzb.zza];
            } else {
                zzlh zzlhVar2 = zzlhVarArr[i16];
                int[] iArr5 = new int[zzb.zza];
                for (int i21 = 0; i21 < zzb.zza; i21++) {
                    iArr5[i21] = zzlhVar2.zzY(zzb.zzb(i21));
                }
                iArr = iArr5;
            }
            int i22 = iArr2[i16];
            zzcdVarArr[i16][i22] = zzb;
            iArr3[i16][i22] = iArr;
            iArr2[i16] = i22 + 1;
            i14++;
            i12 = 2;
        }
        int i23 = i12;
        boolean z14 = true;
        zzwi[] zzwiVarArr = new zzwi[i23];
        String[] strArr = new String[i23];
        int[] iArr6 = new int[i23];
        int i24 = 0;
        while (i24 < i23) {
            int i25 = iArr2[i24];
            zzwiVarArr[i24] = new zzwi((zzcd[]) zzet.zzP(zzcdVarArr[i24], i25));
            iArr3[i24] = (int[][]) zzet.zzP(iArr3[i24], i25);
            strArr[i24] = zzlhVarArr[i24].zzU();
            iArr6[i24] = zzlhVarArr[i24].zzb();
            i24++;
            i23 = 2;
        }
        int i26 = i23;
        zzxx zzxxVar = new zzxx(strArr, iArr6, zzwiVarArr, iArr4, iArr3, new zzwi((zzcd[]) zzet.zzP(zzcdVarArr[i26], iArr2[i26])));
        Pair zzd = zzd(zzxxVar, iArr3, iArr4, zzuiVar, zzccVar);
        zzxz[] zzxzVarArr = (zzxz[]) zzd.second;
        List[] listArr = new List[zzxzVarArr.length];
        for (int i27 = 0; i27 < zzxzVarArr.length; i27++) {
            zzxz zzxzVar = zzxzVarArr[i27];
            if (zzxzVar != null) {
                zzm = zzfxr.zzn(zzxzVar);
            } else {
                zzm = zzfxr.zzm();
            }
            listArr[i27] = zzm;
        }
        zzfxo zzfxoVar = new zzfxo();
        int i28 = 0;
        while (i28 < 2) {
            zzwi zzd2 = zzxxVar.zzd(i28);
            List list = listArr[i28];
            int i29 = 0;
            while (i29 < zzd2.zzb) {
                zzcd zzb2 = zzd2.zzb(i29);
                if (zzxxVar.zza(i28, i29, false) != 0) {
                    z10 = z14;
                } else {
                    z10 = false;
                }
                int i30 = zzb2.zza;
                int[] iArr7 = new int[i30];
                boolean[] zArr = new boolean[i30];
                for (int i31 = 0; i31 < zzb2.zza; i31++) {
                    iArr7[i31] = zzxxVar.zzb(i28, i29, i31) & 7;
                    int i32 = 0;
                    while (true) {
                        if (i32 < list.size()) {
                            zzxz zzxzVar2 = (zzxz) list.get(i32);
                            if (zzxzVar2.zze().equals(zzb2) && zzxzVar2.zzb(i31) != -1) {
                                z11 = true;
                                break;
                            }
                            i32++;
                        } else {
                            z11 = false;
                            break;
                        }
                    }
                    zArr[i31] = z11;
                }
                zzfxoVar.zzf(new zzcj(zzb2, z10, iArr7, zArr));
                i29++;
                z14 = true;
            }
            i28++;
            z14 = true;
        }
        zzwi zze = zzxxVar.zze();
        for (int i33 = 0; i33 < zze.zzb; i33++) {
            zzcd zzb3 = zze.zzb(i33);
            int[] iArr8 = new int[zzb3.zza];
            Arrays.fill(iArr8, 0);
            zzfxoVar.zzf(new zzcj(zzb3, false, iArr8, new boolean[zzb3.zza]));
        }
        return new zzyc((zzli[]) zzd.first, (zzxv[]) zzd.second, new zzck(zzfxoVar.zzi()), zzxxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzyb
    public final void zzp(Object obj) {
    }
}
