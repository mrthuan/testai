package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzajf extends zzajo {
    private zzacv zza;
    private zzaje zzb;

    private static boolean zzd(byte[] bArr) {
        if (bArr[0] != -1) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final long zza(zzek zzekVar) {
        if (zzd(zzekVar.zzM())) {
            int i10 = (zzekVar.zzM()[2] & 255) >> 4;
            if (i10 != 6) {
                if (i10 == 7) {
                    i10 = 7;
                }
                int zza = zzacr.zza(zzekVar, i10);
                zzekVar.zzK(0);
                return zza;
            }
            zzekVar.zzL(4);
            zzekVar.zzw();
            int zza2 = zzacr.zza(zzekVar, i10);
            zzekVar.zzK(0);
            return zza2;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final void zzb(boolean z10) {
        super.zzb(z10);
        if (z10) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajo
    public final boolean zzc(zzek zzekVar, long j10, zzajl zzajlVar) {
        byte[] zzM = zzekVar.zzM();
        zzacv zzacvVar = this.zza;
        if (zzacvVar == null) {
            zzacv zzacvVar2 = new zzacv(zzM, 17);
            this.zza = zzacvVar2;
            zzajlVar.zza = zzacvVar2.zzc(Arrays.copyOfRange(zzM, 9, zzekVar.zze()), null);
            return true;
        } else if ((zzM[0] & Byte.MAX_VALUE) == 3) {
            zzacu zzb = zzacs.zzb(zzekVar);
            zzacv zzf = zzacvVar.zzf(zzb);
            this.zza = zzf;
            this.zzb = new zzaje(zzf, zzb);
            return true;
        } else if (!zzd(zzM)) {
            return true;
        } else {
            zzaje zzajeVar = this.zzb;
            if (zzajeVar != null) {
                zzajeVar.zza(j10);
                zzajlVar.zzb = this.zzb;
            }
            zzajlVar.zza.getClass();
            return false;
        }
    }
}
