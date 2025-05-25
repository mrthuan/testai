package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzamw {
    public static zzamv zza(zzej zzejVar) {
        int i10;
        int i11;
        char c;
        int i12;
        int i13;
        char c10;
        int zzd = zzejVar.zzd(8);
        int i14 = 5;
        int zzd2 = zzejVar.zzd(5);
        if (zzd2 == 31) {
            i10 = zzejVar.zzd(24);
        } else {
            switch (zzd2) {
                case 0:
                    i10 = 96000;
                    break;
                case 1:
                    i10 = 88200;
                    break;
                case 2:
                    i10 = 64000;
                    break;
                case 3:
                    i10 = 48000;
                    break;
                case 4:
                    i10 = 44100;
                    break;
                case 5:
                    i10 = 32000;
                    break;
                case 6:
                    i10 = 24000;
                    break;
                case 7:
                    i10 = 22050;
                    break;
                case 8:
                    i10 = 16000;
                    break;
                case 9:
                    i10 = 12000;
                    break;
                case 10:
                    i10 = 11025;
                    break;
                case 11:
                    i10 = 8000;
                    break;
                case 12:
                    i10 = 7350;
                    break;
                case 13:
                case 14:
                default:
                    throw zzbo.zzc("Unsupported sampling rate index " + zzd2);
                case 15:
                    i10 = 57600;
                    break;
                case 16:
                    i10 = 51200;
                    break;
                case 17:
                    i10 = 40000;
                    break;
                case 18:
                    i10 = 38400;
                    break;
                case 19:
                    i10 = 34150;
                    break;
                case 20:
                    i10 = 28800;
                    break;
                case 21:
                    i10 = 25600;
                    break;
                case 22:
                    i10 = 20000;
                    break;
                case 23:
                    i10 = 19200;
                    break;
                case 24:
                    i10 = 17075;
                    break;
                case 25:
                    i10 = 14400;
                    break;
                case 26:
                    i10 = 12800;
                    break;
                case 27:
                    i10 = 9600;
                    break;
            }
        }
        int zzd3 = zzejVar.zzd(3);
        int i15 = 1;
        if (zzd3 != 0) {
            if (zzd3 != 1) {
                if (zzd3 != 2 && zzd3 != 3) {
                    if (zzd3 == 4) {
                        i11 = 4096;
                    } else {
                        throw zzbo.zzc("Unsupported coreSbrFrameLengthIndex " + zzd3);
                    }
                } else {
                    i11 = 2048;
                }
            } else {
                i11 = 1024;
            }
        } else {
            i11 = 768;
        }
        if (zzd3 != 0 && zzd3 != 1) {
            if (zzd3 != 2) {
                if (zzd3 != 3) {
                    if (zzd3 == 4) {
                        c = 1;
                    } else {
                        throw zzbo.zzc("Unsupported coreSbrFrameLengthIndex " + zzd3);
                    }
                } else {
                    c = 3;
                }
            } else {
                c = 2;
            }
        } else {
            c = 0;
        }
        zzejVar.zzn(2);
        zze(zzejVar);
        int zzd4 = zzejVar.zzd(5);
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = 16;
            if (i16 < zzd4 + 1) {
                int zzd5 = zzejVar.zzd(3);
                i17 += zzc(zzejVar, 5, 8, 16) + 1;
                if ((zzd5 == 0 || zzd5 == 2) && zzejVar.zzp()) {
                    zze(zzejVar);
                }
                i16++;
            } else {
                int zzc = zzc(zzejVar, 4, 8, 16) + 1;
                zzejVar.zzm();
                int i19 = 0;
                while (true) {
                    double d10 = 2.0d;
                    if (i19 < zzc) {
                        int zzd6 = zzejVar.zzd(2);
                        if (zzd6 != 0) {
                            if (zzd6 != i15) {
                                if (zzd6 == 3) {
                                    zzc(zzejVar, 4, 8, i18);
                                    int zzc2 = zzc(zzejVar, 4, 8, i18);
                                    if (zzejVar.zzp()) {
                                        zzc(zzejVar, 8, i18, 0);
                                    }
                                    zzejVar.zzm();
                                    if (zzc2 > 0) {
                                        zzejVar.zzn(zzc2 * 8);
                                    }
                                }
                                i12 = zzd;
                            } else {
                                if (zzf(zzejVar)) {
                                    zzejVar.zzm();
                                }
                                if (c > 0) {
                                    zzd(zzejVar);
                                    i13 = zzejVar.zzd(2);
                                    c10 = c;
                                } else {
                                    i13 = 0;
                                    c10 = 0;
                                }
                                if (i13 > 0) {
                                    zzejVar.zzn(6);
                                    int zzd7 = zzejVar.zzd(2);
                                    zzejVar.zzn(4);
                                    if (zzejVar.zzp()) {
                                        zzejVar.zzn(i14);
                                    }
                                    if (i13 == 2 || i13 == 3) {
                                        zzejVar.zzn(6);
                                    }
                                    if (zzd7 == 2) {
                                        zzejVar.zzm();
                                    }
                                }
                                i12 = zzd;
                                int floor = ((int) Math.floor(Math.log(i17 - 1) / Math.log(2.0d))) + 1;
                                int zzd8 = zzejVar.zzd(2);
                                if (zzd8 > 0 && zzejVar.zzp()) {
                                    zzejVar.zzn(floor);
                                }
                                if (zzejVar.zzp()) {
                                    zzejVar.zzn(floor);
                                }
                                if (c10 == 0 && zzd8 == 0) {
                                    zzejVar.zzm();
                                }
                            }
                        } else {
                            i12 = zzd;
                            zzf(zzejVar);
                            if (c > 0) {
                                zzd(zzejVar);
                            }
                        }
                        i19++;
                        zzd = i12;
                        i14 = 5;
                        i15 = 1;
                        i18 = 16;
                    } else {
                        int i20 = zzd;
                        byte[] bArr = null;
                        if (zzejVar.zzp()) {
                            int zzc3 = zzc(zzejVar, 2, 4, 8) + 1;
                            for (int i21 = 0; i21 < zzc3; i21++) {
                                int zzc4 = zzc(zzejVar, 4, 8, 16);
                                int zzc5 = zzc(zzejVar, 4, 8, 16);
                                if (zzc4 == 7) {
                                    int zzd9 = zzejVar.zzd(4) + 1;
                                    zzejVar.zzn(4);
                                    byte[] bArr2 = new byte[zzd9];
                                    for (int i22 = 0; i22 < zzd9; i22++) {
                                        bArr2[i22] = (byte) zzejVar.zzd(8);
                                    }
                                    bArr = bArr2;
                                } else {
                                    zzejVar.zzn(zzc5 * 8);
                                }
                            }
                        }
                        byte[] bArr3 = bArr;
                        switch (i10) {
                            case 14700:
                            case 16000:
                                d10 = 3.0d;
                                break;
                            case 22050:
                            case 24000:
                                break;
                            case 29400:
                            case 32000:
                            case 58800:
                            case 64000:
                                d10 = 1.5d;
                                break;
                            case 44100:
                            case 48000:
                            case 88200:
                            case 96000:
                                d10 = 1.0d;
                                break;
                            default:
                                throw zzbo.zzc("Unsupported sampling rate " + i10);
                        }
                        return new zzamv(i20, (int) (i10 * d10), (int) (i11 * d10), bArr3, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zzb(com.google.android.gms.internal.ads.zzej r17, com.google.android.gms.internal.ads.zzamt r18) {
        /*
            r0 = r17
            r1 = r18
            r17.zzb()
            r2 = 3
            r3 = 8
            int r2 = zzc(r0, r2, r3, r3)
            r1.zza = r2
            r4 = 0
            r5 = -1
            if (r2 == r5) goto Lc0
            r2 = 2
            int r6 = java.lang.Math.max(r2, r3)
            r7 = 32
            int r6 = java.lang.Math.max(r6, r7)
            r8 = 63
            r9 = 1
            if (r6 > r8) goto L26
            r6 = r9
            goto L27
        L26:
            r6 = r4
        L27:
            com.google.android.gms.internal.ads.zzdi.zzd(r6)
            r10 = 3
            r12 = 255(0xff, double:1.26E-321)
            long r14 = com.google.android.gms.internal.ads.zzgaj.zza(r10, r12)
            r5 = 4294967296(0x100000000, double:2.121995791E-314)
            com.google.android.gms.internal.ads.zzgaj.zza(r14, r5)
            int r5 = r17.zza()
            r14 = -1
            if (r5 >= r2) goto L44
        L42:
            r5 = r14
            goto L6a
        L44:
            long r5 = r0.zze(r2)
            int r16 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r16 != 0) goto L6a
            int r5 = r17.zza()
            if (r5 >= r3) goto L53
            goto L42
        L53:
            long r5 = r0.zze(r3)
            long r10 = r10 + r5
            int r3 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r3 != 0) goto L69
            int r3 = r17.zza()
            if (r3 >= r7) goto L63
            goto L42
        L63:
            long r5 = r0.zze(r7)
            long r5 = r5 + r10
            goto L6a
        L69:
            r5 = r10
        L6a:
            r1.zzb = r5
            int r3 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r3 != 0) goto L71
            return r4
        L71:
            r10 = 16
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 > 0) goto Lad
            r10 = 0
            int r3 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r3 != 0) goto L9e
            int r3 = r1.zza
            r5 = 0
            if (r3 == r9) goto L97
            if (r3 == r2) goto L90
            r2 = 17
            if (r3 == r2) goto L89
            goto L9e
        L89:
            java.lang.String r0 = "AudioTruncation packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r5)
            throw r0
        L90:
            java.lang.String r0 = "Mpegh3daFrame packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r5)
            throw r0
        L97:
            java.lang.String r0 = "Mpegh3daConfig packet with invalid packet label 0"
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r5)
            throw r0
        L9e:
            r2 = 11
            r3 = 24
            int r0 = zzc(r0, r2, r3, r3)
            r1.zzc = r0
            r1 = -1
            if (r0 == r1) goto Lac
            return r9
        Lac:
            return r4
        Lad:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Contains sub-stream with an invalid packet label "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzbo r0 = com.google.android.gms.internal.ads.zzbo.zzc(r0)
            throw r0
        Lc0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamw.zzb(com.google.android.gms.internal.ads.zzej, com.google.android.gms.internal.ads.zzamt):boolean");
    }

    private static int zzc(zzej zzejVar, int i10, int i11, int i12) {
        boolean z10;
        if (Math.max(Math.max(i10, i11), i12) <= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzdi.zzd(z10);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        zzgah.zza(zzgah.zza(i13, i14), 1 << i12);
        if (zzejVar.zza() < i10) {
            return -1;
        }
        int zzd = zzejVar.zzd(i10);
        if (zzd == i13) {
            if (zzejVar.zza() < i11) {
                return -1;
            }
            int zzd2 = zzejVar.zzd(i11);
            int i15 = zzd + zzd2;
            if (zzd2 == i14) {
                if (zzejVar.zza() < i12) {
                    return -1;
                }
                return i15 + zzejVar.zzd(i12);
            }
            return i15;
        }
        return zzd;
    }

    private static void zzd(zzej zzejVar) {
        zzejVar.zzn(3);
        zzejVar.zzn(8);
        boolean zzp = zzejVar.zzp();
        boolean zzp2 = zzejVar.zzp();
        if (zzp) {
            zzejVar.zzn(5);
        }
        if (zzp2) {
            zzejVar.zzn(6);
        }
    }

    private static void zze(zzej zzejVar) {
        int i10;
        int zzd;
        int zzd2 = zzejVar.zzd(2);
        int i11 = 6;
        if (zzd2 == 0) {
            zzejVar.zzn(6);
            return;
        }
        int i12 = 5;
        int zzc = zzc(zzejVar, 5, 8, 16) + 1;
        if (zzd2 == 1) {
            zzejVar.zzn(zzc * 7);
        } else if (zzd2 == 2) {
            boolean zzp = zzejVar.zzp();
            if (true != zzp) {
                i10 = 5;
            } else {
                i10 = 1;
            }
            if (true == zzp) {
                i12 = 7;
            }
            if (true == zzp) {
                i11 = 8;
            }
            int i13 = 0;
            while (i13 < zzc) {
                if (zzejVar.zzp()) {
                    zzejVar.zzn(7);
                    zzd = 0;
                } else {
                    if (zzejVar.zzd(2) == 3 && zzejVar.zzd(i12) * i10 != 0) {
                        zzejVar.zzm();
                    }
                    zzd = zzejVar.zzd(i11) * i10;
                    if (zzd != 0 && zzd != 180) {
                        zzejVar.zzm();
                    }
                    zzejVar.zzm();
                }
                if (zzd != 0 && zzd != 180 && zzejVar.zzp()) {
                    i13++;
                }
                i13++;
            }
        }
    }

    private static boolean zzf(zzej zzejVar) {
        zzejVar.zzn(3);
        boolean zzp = zzejVar.zzp();
        if (zzp) {
            zzejVar.zzn(13);
        }
        return zzp;
    }
}
