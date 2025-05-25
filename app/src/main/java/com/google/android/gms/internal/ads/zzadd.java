package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzadd {
    private static final String[] zza = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] zzb = {44100, 48000, 32000};
    private static final int[] zzc = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] zze = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] zzf = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] zzg = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int zzb(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (!zzm(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i17 = i13 - 1;
        int i18 = zzb[i14];
        if (i11 == 2) {
            i18 /= 2;
        } else if (i11 == 0) {
            i18 /= 4;
        }
        int i19 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            if (i11 == 3) {
                i16 = zzc[i17];
            } else {
                i16 = zzd[i17];
            }
            return (((i16 * 12) / i18) + i19) * 4;
        }
        if (i11 == 3) {
            if (i12 == 2) {
                i15 = zze[i17];
            } else {
                i15 = zzf[i17];
            }
        } else {
            i15 = zzg[i17];
        }
        int i20 = 144;
        if (i11 == 3) {
            return androidx.appcompat.view.menu.d.a(i15, 144, i18, i19);
        }
        if (i12 == 1) {
            i20 = 72;
        }
        return androidx.appcompat.view.menu.d.a(i20, i15, i18, i19);
    }

    public static int zzc(int i10) {
        int i11;
        int i12;
        if (zzm(i10) && (i11 = (i10 >>> 19) & 3) != 1 && (i12 = (i10 >>> 17) & 3) != 0) {
            int i13 = i10 >>> 12;
            int i14 = (i10 >>> 10) & 3;
            int i15 = i13 & 15;
            if (i15 != 0 && i15 != 15 && i14 != 3) {
                return zzl(i11, i12);
            }
            return -1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int i10, int i11) {
        if (i11 != 1) {
            if (i11 == 2) {
                return 1152;
            }
            return 384;
        } else if (i10 == 3) {
            return 1152;
        } else {
            return 576;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzm(int i10) {
        if ((i10 & (-2097152)) == -2097152) {
            return true;
        }
        return false;
    }
}
