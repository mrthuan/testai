package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzaif {
    private static final byte[] zza;

    static {
        int i10 = zzet.zza;
        zza = "OpusHead".getBytes(zzfuj.zzc);
    }

    public static zzbk zza(zzahv zzahvVar) {
        zzex zzexVar;
        zzahw zzb = zzahvVar.zzb(1751411826);
        zzahw zzb2 = zzahvVar.zzb(1801812339);
        zzahw zzb3 = zzahvVar.zzb(1768715124);
        if (zzb != null && zzb2 != null && zzb3 != null && zzg(zzb.zza) == 1835299937) {
            zzek zzekVar = zzb2.zza;
            zzekVar.zzK(12);
            int zzg = zzekVar.zzg();
            String[] strArr = new String[zzg];
            for (int i10 = 0; i10 < zzg; i10++) {
                int zzg2 = zzekVar.zzg();
                zzekVar.zzL(4);
                strArr[i10] = zzekVar.zzA(zzg2 - 8, zzfuj.zzc);
            }
            zzek zzekVar2 = zzb3.zza;
            zzekVar2.zzK(8);
            ArrayList arrayList = new ArrayList();
            while (zzekVar2.zzb() > 8) {
                int zzg3 = zzekVar2.zzg() + zzekVar2.zzd();
                int zzg4 = zzekVar2.zzg() - 1;
                if (zzg4 >= 0 && zzg4 < zzg) {
                    String str = strArr[zzg4];
                    while (true) {
                        int zzd = zzekVar2.zzd();
                        if (zzd < zzg3) {
                            int zzg5 = zzekVar2.zzg();
                            if (zzekVar2.zzg() == 1684108385) {
                                int zzg6 = zzekVar2.zzg();
                                int zzg7 = zzekVar2.zzg();
                                int i11 = zzg5 - 16;
                                byte[] bArr = new byte[i11];
                                zzekVar2.zzG(bArr, 0, i11);
                                zzexVar = new zzex(str, bArr, zzg7, zzg6);
                                break;
                            }
                            zzekVar2.zzK(zzd + zzg5);
                        } else {
                            zzexVar = null;
                            break;
                        }
                    }
                    if (zzexVar != null) {
                        arrayList.add(zzexVar);
                    }
                } else {
                    a0.d.i("Skipped metadata with unknown key index: ", zzg4, "AtomParsers");
                }
                zzekVar2.zzK(zzg3);
            }
            if (!arrayList.isEmpty()) {
                return new zzbk(arrayList);
            }
        }
        return null;
    }

    public static zzbk zzb(zzahw zzahwVar) {
        int zzn;
        zzek zzekVar = zzahwVar.zza;
        zzekVar.zzK(8);
        zzbk zzbkVar = new zzbk(-9223372036854775807L, new zzbj[0]);
        while (zzekVar.zzb() >= 8) {
            int zzd = zzekVar.zzd();
            int zzg = zzekVar.zzg() + zzd;
            int zzg2 = zzekVar.zzg();
            zzbk zzbkVar2 = null;
            if (zzg2 == 1835365473) {
                zzekVar.zzK(zzd);
                zzekVar.zzL(8);
                zze(zzekVar);
                while (true) {
                    if (zzekVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd2 = zzekVar.zzd();
                    int zzg3 = zzekVar.zzg() + zzd2;
                    if (zzekVar.zzg() == 1768715124) {
                        zzekVar.zzK(zzd2);
                        zzekVar.zzL(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzekVar.zzd() < zzg3) {
                            zzbj zza2 = zzain.zza(zzekVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzbkVar2 = new zzbk(arrayList);
                        }
                    } else {
                        zzekVar.zzK(zzg3);
                    }
                }
                zzbkVar = zzbkVar.zzd(zzbkVar2);
            } else if (zzg2 == 1936553057) {
                zzekVar.zzK(zzd);
                zzekVar.zzL(12);
                while (true) {
                    if (zzekVar.zzd() >= zzg) {
                        break;
                    }
                    int zzd3 = zzekVar.zzd();
                    int zzg4 = zzekVar.zzg();
                    if (zzekVar.zzg() == 1935766900) {
                        if (zzg4 >= 16) {
                            zzekVar.zzL(4);
                            int i10 = -1;
                            int i11 = 0;
                            for (int i12 = 0; i12 < 2; i12++) {
                                int zzm = zzekVar.zzm();
                                int zzm2 = zzekVar.zzm();
                                if (zzm == 0) {
                                    i10 = zzm2;
                                } else if (zzm == 1) {
                                    i11 = zzm2;
                                }
                            }
                            if (i10 == 12) {
                                zzn = 240;
                            } else if (i10 == 13) {
                                zzn = 120;
                            } else {
                                if (i10 == 21 && zzekVar.zzb() >= 8 && zzekVar.zzd() + 8 <= zzg) {
                                    int zzg5 = zzekVar.zzg();
                                    int zzg6 = zzekVar.zzg();
                                    if (zzg5 >= 12 && zzg6 == 1936877170) {
                                        zzn = zzekVar.zzn();
                                    }
                                }
                                zzn = -2147483647;
                            }
                            if (zzn != -2147483647) {
                                zzbkVar2 = new zzbk(-9223372036854775807L, new zzagy(zzn, i11));
                            }
                        }
                    } else {
                        zzekVar.zzK(zzd3 + zzg4);
                    }
                }
                zzbkVar = zzbkVar.zzd(zzbkVar2);
            } else if (zzg2 == -1451722374) {
                zzbkVar = zzbkVar.zzd(zzi(zzekVar));
            }
            zzekVar.zzK(zzg);
        }
        return zzbkVar;
    }

    public static zzfd zzc(zzek zzekVar) {
        long zzt;
        long zzt2;
        zzekVar.zzK(8);
        if (zzahx.zze(zzekVar.zzg()) == 0) {
            zzt = zzekVar.zzu();
            zzt2 = zzekVar.zzu();
        } else {
            zzt = zzekVar.zzt();
            zzt2 = zzekVar.zzt();
        }
        return new zzfd(zzt, zzt2, zzekVar.zzu());
    }

    /* JADX WARN: Code restructure failed: missing block: B:349:0x0707, code lost:
        if (r7.zzd(1) > 0) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x072b, code lost:
        if (r13 == 1) goto L308;
     */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0962  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0af8  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0afc  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0b2b  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0b55  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0b62 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List zzd(com.google.android.gms.internal.ads.zzahv r55, com.google.android.gms.internal.ads.zzacy r56, long r57, com.google.android.gms.internal.ads.zzy r59, boolean r60, boolean r61, com.google.android.gms.internal.ads.zzful r62) {
        /*
            Method dump skipped, instructions count: 2924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaif.zzd(com.google.android.gms.internal.ads.zzahv, com.google.android.gms.internal.ads.zzacy, long, com.google.android.gms.internal.ads.zzy, boolean, boolean, com.google.android.gms.internal.ads.zzful):java.util.List");
    }

    public static void zze(zzek zzekVar) {
        int zzd = zzekVar.zzd();
        zzekVar.zzL(4);
        if (zzekVar.zzg() != 1751411826) {
            zzd += 4;
        }
        zzekVar.zzK(zzd);
    }

    private static int zzf(zzek zzekVar) {
        int zzm = zzekVar.zzm();
        int i10 = zzm & ShapeTypes.VERTICAL_SCROLL;
        while ((zzm & 128) == 128) {
            zzm = zzekVar.zzm();
            i10 = (i10 << 7) | (zzm & ShapeTypes.VERTICAL_SCROLL);
        }
        return i10;
    }

    private static int zzg(zzek zzekVar) {
        zzekVar.zzK(16);
        return zzekVar.zzg();
    }

    private static Pair zzh(zzek zzekVar, int i10, int i11) {
        boolean z10;
        boolean z11;
        boolean z12;
        Integer num;
        zzaix zzaixVar;
        Pair create;
        int i12;
        int i13;
        boolean z13;
        byte[] bArr;
        int zzd = zzekVar.zzd();
        while (zzd - i10 < i11) {
            zzekVar.zzK(zzd);
            int zzg = zzekVar.zzg();
            boolean z14 = true;
            if (zzg > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzaco.zzb(z10, "childAtomSize must be positive");
            if (zzekVar.zzg() == 1936289382) {
                int i14 = zzd + 8;
                int i15 = 0;
                int i16 = -1;
                String str = null;
                Integer num2 = null;
                while (i14 - zzd < zzg) {
                    zzekVar.zzK(i14);
                    int zzg2 = zzekVar.zzg();
                    int zzg3 = zzekVar.zzg();
                    if (zzg3 == 1718775137) {
                        num2 = Integer.valueOf(zzekVar.zzg());
                    } else if (zzg3 == 1935894637) {
                        zzekVar.zzL(4);
                        str = zzekVar.zzA(4, zzfuj.zzc);
                    } else if (zzg3 == 1935894633) {
                        i16 = i14;
                        i15 = zzg2;
                    }
                    i14 += zzg2;
                }
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num2 != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zzaco.zzb(z11, "frma atom is mandatory");
                    if (i16 != -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zzaco.zzb(z12, "schi atom is mandatory");
                    int i17 = i16 + 8;
                    while (true) {
                        if (i17 - i16 < i15) {
                            zzekVar.zzK(i17);
                            int zzg4 = zzekVar.zzg();
                            if (zzekVar.zzg() == 1952804451) {
                                int zze = zzahx.zze(zzekVar.zzg());
                                zzekVar.zzL(1);
                                if (zze == 0) {
                                    zzekVar.zzL(1);
                                    i12 = 0;
                                    i13 = 0;
                                } else {
                                    int zzm = zzekVar.zzm();
                                    i12 = zzm & 15;
                                    i13 = (zzm & 240) >> 4;
                                }
                                if (zzekVar.zzm() == 1) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                int zzm2 = zzekVar.zzm();
                                byte[] bArr2 = new byte[16];
                                zzekVar.zzG(bArr2, 0, 16);
                                if (z13 && zzm2 == 0) {
                                    int zzm3 = zzekVar.zzm();
                                    byte[] bArr3 = new byte[zzm3];
                                    zzekVar.zzG(bArr3, 0, zzm3);
                                    bArr = bArr3;
                                } else {
                                    bArr = null;
                                }
                                num = num2;
                                zzaixVar = new zzaix(z13, str, zzm2, bArr2, i13, i12, bArr);
                            } else {
                                i17 += zzg4;
                            }
                        } else {
                            num = num2;
                            zzaixVar = null;
                            break;
                        }
                    }
                    if (zzaixVar == null) {
                        z14 = false;
                    }
                    zzaco.zzb(z14, "tenc atom is mandatory");
                    int i18 = zzet.zza;
                    create = Pair.create(num, zzaixVar);
                }
                if (create != null) {
                    return create;
                }
            }
            zzd += zzg;
        }
        return null;
    }

    private static zzbk zzi(zzek zzekVar) {
        short zzD = zzekVar.zzD();
        zzekVar.zzL(2);
        String zzA = zzekVar.zzA(zzD, zzfuj.zzc);
        int max = Math.max(zzA.lastIndexOf(43), zzA.lastIndexOf(45));
        try {
            return new zzbk(-9223372036854775807L, new zzfa(Float.parseFloat(zzA.substring(0, max)), Float.parseFloat(zzA.substring(max, zzA.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    private static zzahz zzj(zzek zzekVar, int i10) {
        long j10;
        long j11;
        zzekVar.zzK(i10 + 12);
        zzekVar.zzL(1);
        zzf(zzekVar);
        zzekVar.zzL(2);
        int zzm = zzekVar.zzm();
        if ((zzm & 128) != 0) {
            zzekVar.zzL(2);
        }
        if ((zzm & 64) != 0) {
            zzekVar.zzL(zzekVar.zzm());
        }
        if ((zzm & 32) != 0) {
            zzekVar.zzL(2);
        }
        zzekVar.zzL(1);
        zzf(zzekVar);
        String zzd = zzbn.zzd(zzekVar.zzm());
        if (!"audio/mpeg".equals(zzd) && !"audio/vnd.dts".equals(zzd) && !"audio/vnd.dts.hd".equals(zzd)) {
            zzekVar.zzL(4);
            long zzu = zzekVar.zzu();
            long zzu2 = zzekVar.zzu();
            zzekVar.zzL(1);
            int zzf = zzf(zzekVar);
            byte[] bArr = new byte[zzf];
            zzekVar.zzG(bArr, 0, zzf);
            if (zzu2 <= 0) {
                j10 = -1;
            } else {
                j10 = zzu2;
            }
            if (zzu > 0) {
                j11 = zzu;
            } else {
                j11 = -1;
            }
            return new zzahz(zzd, bArr, j10, j11);
        }
        return new zzahz(zzd, null, -1L, -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0290 A[LOOP:12: B:101:0x0290->B:105:0x029a, LOOP_START, PHI: r17 
      PHI: (r17v6 int) = (r17v2 int), (r17v7 int) binds: [B:100:0x028e, B:105:0x029a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x027f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzaiz zzk(com.google.android.gms.internal.ads.zzaiw r39, com.google.android.gms.internal.ads.zzahv r40, com.google.android.gms.internal.ads.zzacy r41) {
        /*
            Method dump skipped, instructions count: 1496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaif.zzk(com.google.android.gms.internal.ads.zzaiw, com.google.android.gms.internal.ads.zzahv, com.google.android.gms.internal.ads.zzacy):com.google.android.gms.internal.ads.zzaiz");
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x01bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzm(com.google.android.gms.internal.ads.zzek r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, com.google.android.gms.internal.ads.zzy r33, com.google.android.gms.internal.ads.zzaib r34, int r35) {
        /*
            Method dump skipped, instructions count: 1353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaif.zzm(com.google.android.gms.internal.ads.zzek, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzy, com.google.android.gms.internal.ads.zzaib, int):void");
    }
}
