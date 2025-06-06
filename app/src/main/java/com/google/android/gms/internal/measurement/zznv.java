package com.google.android.gms.internal.measurement;

import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.util.IEEEDouble;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.2 */
/* loaded from: classes2.dex */
final class zznv {
    public static /* bridge */ /* synthetic */ void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
        if (!zze(b11)) {
            if ((((b11 + 112) + (b10 << Field.NUMCHARS)) >> 30) == 0 && !zze(b12) && !zze(b13)) {
                int i11 = ((b10 & 7) << 18) | ((b11 & Field.BARCODE) << 12) | ((b12 & Field.BARCODE) << 6) | (b13 & Field.BARCODE);
                cArr[i10] = (char) ((i11 >>> 10) + 55232);
                cArr[i10 + 1] = (char) ((i11 & IEEEDouble.EXPONENT_BIAS) + 56320);
                return;
            }
        }
        throw zzll.zzc();
    }

    public static /* bridge */ /* synthetic */ void zzb(byte b10, byte b11, byte b12, char[] cArr, int i10) {
        if (!zze(b11)) {
            if (b10 == -32) {
                if (b11 >= -96) {
                    b10 = -32;
                }
            }
            if (b10 == -19) {
                if (b11 < -96) {
                    b10 = -19;
                }
            }
            if (!zze(b12)) {
                cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & Field.BARCODE) << 6) | (b12 & Field.BARCODE));
                return;
            }
        }
        throw zzll.zzc();
    }

    public static /* bridge */ /* synthetic */ void zzc(byte b10, byte b11, char[] cArr, int i10) {
        if (b10 >= -62 && !zze(b11)) {
            cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & Field.BARCODE));
            return;
        }
        throw zzll.zzc();
    }

    public static /* bridge */ /* synthetic */ boolean zzd(byte b10) {
        if (b10 >= 0) {
            return true;
        }
        return false;
    }

    private static boolean zze(byte b10) {
        if (b10 > -65) {
            return true;
        }
        return false;
    }
}
