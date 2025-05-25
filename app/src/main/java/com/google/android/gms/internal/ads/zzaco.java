package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaco {
    public static int zza(zzacl zzaclVar, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            int zzb = zzaclVar.zzb(bArr, i10 + i12, i11 - i12);
            if (zzb == -1) {
                break;
            }
            i12 += zzb;
        }
        return i12;
    }

    public static void zzb(boolean z10, String str) {
        if (z10) {
            return;
        }
        throw zzbo.zza(str, null);
    }

    public static boolean zzc(zzacl zzaclVar, byte[] bArr, int i10, int i11, boolean z10) {
        try {
            return zzaclVar.zzm(bArr, 0, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static boolean zzd(zzacl zzaclVar, byte[] bArr, int i10, int i11) {
        try {
            ((zzaby) zzaclVar).zzn(bArr, i10, i11, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzacl zzaclVar, int i10) {
        try {
            ((zzaby) zzaclVar).zzo(i10, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
