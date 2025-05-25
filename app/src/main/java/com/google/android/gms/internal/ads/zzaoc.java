package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaoc {
    public static Pair zza(zzacl zzaclVar) {
        zzaclVar.zzj();
        zzaob zzd = zzd(1684108385, zzaclVar, new zzek(8));
        ((zzaby) zzaclVar).zzo(8, false);
        return Pair.create(Long.valueOf(zzaclVar.zzf()), Long.valueOf(zzd.zzb));
    }

    public static zzaoa zzb(zzacl zzaclVar) {
        boolean z10;
        byte[] bArr;
        zzek zzekVar = new zzek(16);
        zzaob zzd = zzd(1718449184, zzaclVar, zzekVar);
        if (zzd.zzb >= 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzf(z10);
        zzaby zzabyVar = (zzaby) zzaclVar;
        zzabyVar.zzm(zzekVar.zzM(), 0, 16, false);
        zzekVar.zzK(0);
        int zzk = zzekVar.zzk();
        int zzk2 = zzekVar.zzk();
        int zzj = zzekVar.zzj();
        int zzj2 = zzekVar.zzj();
        int zzk3 = zzekVar.zzk();
        int zzk4 = zzekVar.zzk();
        int i10 = ((int) zzd.zzb) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            zzabyVar.zzm(bArr2, 0, i10, false);
            bArr = bArr2;
        } else {
            bArr = zzet.zzf;
        }
        ((zzaby) zzaclVar).zzo((int) (zzaclVar.zze() - zzaclVar.zzf()), false);
        return new zzaoa(zzk, zzk2, zzj, zzj2, zzk3, zzk4, bArr);
    }

    public static boolean zzc(zzacl zzaclVar) {
        zzek zzekVar = new zzek(8);
        int i10 = zzaob.zza(zzaclVar, zzekVar).zza;
        if (i10 != 1380533830 && i10 != 1380333108) {
            return false;
        }
        ((zzaby) zzaclVar).zzm(zzekVar.zzM(), 0, 4, false);
        zzekVar.zzK(0);
        int zzg = zzekVar.zzg();
        if (zzg != 1463899717) {
            zzea.zzc("WavHeaderReader", "Unsupported form type: " + zzg);
            return false;
        }
        return true;
    }

    private static zzaob zzd(int i10, zzacl zzaclVar, zzek zzekVar) {
        zzaob zza = zzaob.zza(zzaclVar, zzekVar);
        while (true) {
            int i11 = zza.zza;
            if (i11 != i10) {
                a0.d.i("Ignoring unknown WAV chunk: ", i11, "WavHeaderReader");
                long j10 = zza.zzb;
                int i12 = ((j10 & 1) > 0L ? 1 : ((j10 & 1) == 0L ? 0 : -1));
                long j11 = j10 + 8;
                if (i12 != 0) {
                    j11++;
                }
                if (j11 <= 2147483647L) {
                    ((zzaby) zzaclVar).zzo((int) j11, false);
                    zza = zzaob.zza(zzaclVar, zzekVar);
                } else {
                    int i13 = zza.zza;
                    throw zzbo.zzc("Chunk is too large (~2GB+) to skip; id: " + i13);
                }
            } else {
                return zza;
            }
        }
    }
}
