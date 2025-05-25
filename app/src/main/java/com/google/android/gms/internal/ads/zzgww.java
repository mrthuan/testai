package com.google.android.gms.internal.ads;

import java.io.InputStream;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public abstract class zzgww {
    public static final /* synthetic */ int zzd = 0;
    private static volatile int zze = 100;
    int zza;
    final int zzb = zze;
    zzgwx zzc;

    public /* synthetic */ zzgww(zzgwv zzgwvVar) {
    }

    public static int zzD(int i10) {
        return (i10 >>> 1) ^ (-(i10 & 1));
    }

    public static int zzE(int i10, InputStream inputStream) {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & ShapeTypes.VERTICAL_SCROLL;
        int i12 = 7;
        while (i12 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i11 |= (read & ShapeTypes.VERTICAL_SCROLL) << i12;
                if ((read & 128) == 0) {
                    return i11;
                }
                i12 += 7;
            } else {
                throw zzgyn.zzi();
            }
        }
        while (i12 < 64) {
            int read2 = inputStream.read();
            if (read2 != -1) {
                if ((read2 & 128) == 0) {
                    return i11;
                }
                i12 += 7;
            } else {
                throw zzgyn.zzi();
            }
        }
        throw zzgyn.zze();
    }

    public static long zzF(long j10) {
        return (j10 >>> 1) ^ (-(1 & j10));
    }

    public static zzgww zzG(InputStream inputStream, int i10) {
        if (inputStream == null) {
            byte[] bArr = zzgyl.zzb;
            int length = bArr.length;
            return zzH(bArr, 0, 0, false);
        }
        return new zzgws(inputStream, 4096, null);
    }

    public static zzgww zzH(byte[] bArr, int i10, int i11, boolean z10) {
        zzgwo zzgwoVar = new zzgwo(bArr, i10, i11, z10, null);
        try {
            zzgwoVar.zzd(i11);
            return zzgwoVar;
        } catch (zzgyn e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract boolean zzA();

    public abstract boolean zzB();

    public abstract double zza();

    public abstract float zzb();

    public abstract int zzc();

    public abstract int zzd(int i10);

    public abstract int zze();

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzj();

    public abstract int zzk();

    public abstract int zzl();

    public abstract int zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzs();

    public abstract long zzt();

    public abstract long zzu();

    public abstract zzgwm zzv();

    public abstract String zzw();

    public abstract String zzx();

    public abstract void zzy(int i10);

    public abstract void zzz(int i10);
}
