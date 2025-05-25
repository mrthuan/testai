package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lib.zj.office.fc.hslf.record.SlideAtom;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzgap extends zzgaq {
    public static /* bridge */ /* synthetic */ int zza(int[] iArr, int i10, int i11, int i12) {
        while (i11 < i12) {
            if (iArr[i11] != i10) {
                i11++;
            } else {
                return i11;
            }
        }
        return -1;
    }

    public static int zzb(long j10) {
        boolean z10;
        int i10 = (int) j10;
        if (i10 == j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfuu.zzg(z10, "Out of range: %s", j10);
        return i10;
    }

    public static int zzc(int i10, int i11, int i12) {
        zzfuu.zzh(true, "min (%s) must be less than or equal to max (%s)", i11, 1073741823);
        return Math.min(Math.max(i10, i11), 1073741823);
    }

    public static int zzd(byte[] bArr) {
        boolean z10;
        int length = bArr.length;
        if (length >= 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfuu.zzh(z10, "array too small: %s < %s", length, 4);
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static int zze(long j10) {
        if (j10 > 2147483647L) {
            return Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        if (j10 < -2147483648L) {
            return SlideAtom.USES_MASTER_SLIDE_ID;
        }
        return (int) j10;
    }

    public static Integer zzf(String str, int i10) {
        Long valueOf;
        str.getClass();
        if (!str.isEmpty()) {
            int i11 = 0;
            char charAt = str.charAt(0);
            if (charAt == '-') {
                i11 = 1;
            }
            if (i11 != str.length()) {
                int i12 = i11 + 1;
                int zza = zzgar.zza(str.charAt(i11));
                if (zza >= 0 && zza < 10) {
                    long j10 = -zza;
                    while (true) {
                        if (i12 < str.length()) {
                            int i13 = i12 + 1;
                            int zza2 = zzgar.zza(str.charAt(i12));
                            if (zza2 < 0 || zza2 >= 10 || j10 < -922337203685477580L) {
                                break;
                            }
                            long j11 = j10 * 10;
                            long j12 = zza2;
                            if (j11 < Long.MIN_VALUE + j12) {
                                break;
                            }
                            j10 = j11 - j12;
                            i12 = i13;
                        } else if (charAt == '-') {
                            valueOf = Long.valueOf(j10);
                        } else if (j10 != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j10);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    public static List zzg(int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new zzgao(iArr, 0, length);
    }

    public static int[] zzh(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            obj.getClass();
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
