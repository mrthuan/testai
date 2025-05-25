package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzhbe {
    private static final zzhbb zza;

    static {
        if (zzhaz.zzA() && zzhaz.zzB()) {
            int i10 = zzgvz.zza;
        }
        zza = new zzhbc();
    }

    public static /* bridge */ /* synthetic */ int zzc(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    return zzk(b10, bArr[i10], bArr[i10 + 1]);
                }
                throw new AssertionError();
            }
            return zzj(b10, bArr[i10]);
        } else if (b10 > -12) {
            return -1;
        } else {
            return b10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fe, code lost:
        return r10 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int zzd(java.lang.String r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzhbe.zzd(java.lang.String, byte[], int, int):int");
    }

    public static int zze(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = str.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = str.length();
                while (i11 < length2) {
                    char charAt2 = str.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new zzhbd(i11, length2);
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i12 + 4294967296L));
    }

    public static int zzf(int i10, byte[] bArr, int i11, int i12) {
        return zza.zza(i10, bArr, i11, i12);
    }

    public static String zzg(ByteBuffer byteBuffer, int i10, int i11) {
        zzhbb zzhbbVar = zza;
        if (byteBuffer.hasArray()) {
            return zzhbbVar.zzb(byteBuffer.array(), byteBuffer.arrayOffset() + i10, i11);
        } else if (byteBuffer.isDirect()) {
            return zzhbb.zzc(byteBuffer, i10, i11);
        } else {
            return zzhbb.zzc(byteBuffer, i10, i11);
        }
    }

    public static String zzh(byte[] bArr, int i10, int i11) {
        return zza.zzb(bArr, i10, i11);
    }

    public static boolean zzi(byte[] bArr, int i10, int i11) {
        if (zza.zza(0, bArr, i10, i11) != 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzj(int i10, int i11) {
        if (i10 <= -12 && i11 <= -65) {
            return i10 ^ (i11 << 8);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzk(int i10, int i11, int i12) {
        if (i10 <= -12 && i11 <= -65 && i12 <= -65) {
            return (i10 ^ (i11 << 8)) ^ (i12 << 16);
        }
        return -1;
    }
}
