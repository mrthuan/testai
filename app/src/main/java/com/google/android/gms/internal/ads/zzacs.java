package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzacs {
    public static zzbk zza(zzacl zzaclVar, boolean z10) {
        zzaga zzagaVar;
        if (z10) {
            zzagaVar = null;
        } else {
            zzagaVar = zzagc.zza;
        }
        zzbk zza = new zzada().zza(zzaclVar, zzagaVar);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }

    public static zzacu zzb(zzek zzekVar) {
        zzekVar.zzL(1);
        int zzo = zzekVar.zzo();
        long zzd = zzekVar.zzd();
        long j10 = zzo;
        int i10 = zzo / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long zzt = zzekVar.zzt();
            if (zzt == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = zzt;
            jArr2[i11] = zzekVar.zzt();
            zzekVar.zzL(2);
            i11++;
        }
        zzekVar.zzL((int) ((zzd + j10) - zzekVar.zzd()));
        return new zzacu(jArr, jArr2);
    }
}
