package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzagc {
    public static final zzaga zza = new Object() { // from class: com.google.android.gms.internal.ads.zzaga
    };

    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.gms.internal.ads.zzbk zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzaga r13, com.google.android.gms.internal.ads.zzafe r14) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagc.zza(byte[], int, com.google.android.gms.internal.ads.zzaga, com.google.android.gms.internal.ads.zzafe):com.google.android.gms.internal.ads.zzbk");
    }

    private static int zzb(int i10) {
        if (i10 != 0 && i10 != 3) {
            return 2;
        }
        return 1;
    }

    private static int zzc(byte[] bArr, int i10, int i11) {
        int zzd = zzd(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd < length - 1) {
                int i12 = zzd + 1;
                if ((zzd - i10) % 2 == 0 && bArr[i12] == 0) {
                    return zzd;
                }
                zzd = zzd(bArr, i12);
            } else {
                return length;
            }
        }
    }

    private static int zzd(byte[] bArr, int i10) {
        while (true) {
            int length = bArr.length;
            if (i10 < length) {
                if (bArr[i10] == 0) {
                    return i10;
                }
                i10++;
            } else {
                return length;
            }
        }
    }

    private static int zze(zzek zzekVar, int i10) {
        byte[] zzM = zzekVar.zzM();
        int zzd = zzekVar.zzd();
        int i11 = zzd;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < zzd + i10) {
                if ((zzM[i11] & 255) == 255 && zzM[i12] == 0) {
                    System.arraycopy(zzM, i11 + 2, zzM, i12, (i10 - (i11 - zzd)) - 2);
                    i10--;
                }
                i11 = i12;
            } else {
                return i10;
            }
        }
    }

    private static zzfxr zzf(byte[] bArr, int i10, int i11) {
        if (i11 >= bArr.length) {
            return zzfxr.zzn("");
        }
        zzfxo zzfxoVar = new zzfxo();
        int zzc = zzc(bArr, i11, i10);
        while (i11 < zzc) {
            zzfxoVar.zzf(new String(bArr, i11, zzc - i11, zzi(i10)));
            i11 = zzb(i10) + zzc;
            zzc = zzc(bArr, i11, i10);
        }
        zzfxr zzi = zzfxoVar.zzi();
        if (zzi.isEmpty()) {
            return zzfxr.zzn("");
        }
        return zzi;
    }

    private static String zzg(byte[] bArr, int i10, int i11, Charset charset) {
        if (i11 > i10 && i11 <= bArr.length) {
            return new String(bArr, i10, i11 - i10, charset);
        }
        return "";
    }

    private static String zzh(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        }
        return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    private static Charset zzi(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return zzfuj.zzb;
                }
                return zzfuj.zzc;
            }
            return zzfuj.zzd;
        }
        return zzfuj.zzf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        r4 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean zzj(com.google.android.gms.internal.ads.zzek r21, int r22, int r23, boolean r24) {
        /*
            r1 = r21
            r0 = r22
            int r2 = r21.zzd()
        L8:
            int r3 = r21.zzb()     // Catch: java.lang.Throwable -> La8
            r4 = 1
            r5 = r23
            if (r3 < r5) goto La4
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r21.zzg()     // Catch: java.lang.Throwable -> La8
            long r8 = r21.zzu()     // Catch: java.lang.Throwable -> La8
            int r10 = r21.zzq()     // Catch: java.lang.Throwable -> La8
            goto L2c
        L22:
            int r7 = r21.zzo()     // Catch: java.lang.Throwable -> La8
            int r8 = r21.zzo()     // Catch: java.lang.Throwable -> La8
            long r8 = (long) r8     // Catch: java.lang.Throwable -> La8
            r10 = r6
        L2c:
            r11 = 0
            if (r7 != 0) goto L38
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L38
            if (r10 != 0) goto L38
            goto La4
        L38:
            r7 = 4
            if (r0 != r7) goto L68
            if (r24 != 0) goto L68
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L48
        L45:
            r4 = r6
            goto La4
        L48:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            r17 = 16
            long r17 = r8 >> r17
            r19 = 24
            long r8 = r8 >> r19
            long r15 = r15 & r11
            long r11 = r17 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L68:
            if (r0 != r7) goto L78
            r3 = r10 & 64
            if (r3 == 0) goto L6f
            goto L70
        L6f:
            r4 = r6
        L70:
            r3 = r10 & 1
            r20 = r4
            r4 = r3
            r3 = r20
            goto L8a
        L78:
            if (r0 != r3) goto L88
            r3 = r10 & 32
            if (r3 == 0) goto L80
            r3 = r4
            goto L81
        L80:
            r3 = r6
        L81:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L86
            goto L8a
        L86:
            r4 = r6
            goto L8a
        L88:
            r3 = r6
            r4 = r3
        L8a:
            if (r4 == 0) goto L8e
            int r3 = r3 + 4
        L8e:
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La8
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L94
            goto L45
        L94:
            int r3 = r21.zzb()     // Catch: java.lang.Throwable -> La8
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La8
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L9e
            goto L45
        L9e:
            int r3 = (int) r8     // Catch: java.lang.Throwable -> La8
            r1.zzL(r3)     // Catch: java.lang.Throwable -> La8
            goto L8
        La4:
            r1.zzK(r2)
            return r4
        La8:
            r0 = move-exception
            r1.zzK(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagc.zzj(com.google.android.gms.internal.ads.zzek, int, int, boolean):boolean");
    }

    private static byte[] zzk(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return zzet.zzf;
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:79|(2:81|(1:87)(1:86))|88|(1:89)|(2:91|(10:298|99|100|(3:138|139|(2:153|(5:(5:238|(2:240|(2:242|(5:246|247|(1:249)|250|251))(1:265))(1:266)|255|256|257)(13:184|185|(1:187)(1:235)|188|(10:190|191|192|193|194|195|196|197|198|199)|216|217|(4:220|(3:222|223|224)(1:226)|225|218)|227|228|(1:230)(1:234)|231|232)|120|54|(0)|57)(13:160|(1:162)|163|(1:165)|166|(4:169|(3:171|172|173)(1:175)|174|167)|176|177|119|120|54|(0)|57))(2:147|(5:149|64|54|(0)|57)(3:150|151|152)))(7:107|108|(3:110|(1:112)|113)(4:123|124|125|(1:127))|114|115|116|117)|118|119|120|54|(0)|57)(2:94|(12:283|284|285|286|287|288|289|290|66|54|(0)|57)(1:97)))(1:299)|98|99|100|(14:102|138|139|(1:141)|153|(1:155)|(1:179)|238|(0)(0)|255|256|257|120|54)(14:272|138|139|(0)|153|(0)|(0)|238|(0)(0)|255|256|257|120|54)|(0)|57) */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x039e, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x039f, code lost:
        r8 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03a3, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03a5, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03a6, code lost:
        r8 = r36;
     */
    /* JADX WARN: Removed duplicated region for block: B:191:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05c0  */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v58 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzagd zzl(int r35, com.google.android.gms.internal.ads.zzek r36, boolean r37, int r38, com.google.android.gms.internal.ads.zzaga r39) {
        /*
            Method dump skipped, instructions count: 1524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagc.zzl(int, com.google.android.gms.internal.ads.zzek, boolean, int, com.google.android.gms.internal.ads.zzaga):com.google.android.gms.internal.ads.zzagd");
    }
}
