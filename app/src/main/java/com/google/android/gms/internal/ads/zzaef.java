package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
final class zzaef implements zzadx {
    public final zzfxr zza;
    private final int zzb;

    private zzaef(int i10, zzfxr zzfxrVar) {
        this.zzb = i10;
        this.zza = zzfxrVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzaef zzc(int i10, zzek zzekVar) {
        zzadx zzadxVar;
        String str;
        String str2;
        zzfxo zzfxoVar = new zzfxo();
        int zze = zzekVar.zze();
        int i11 = -2;
        while (zzekVar.zzb() > 8) {
            int zzi = zzekVar.zzi();
            int zzd = zzekVar.zzd() + zzekVar.zzi();
            zzekVar.zzJ(zzd);
            if (zzi == 1414744396) {
                zzadxVar = zzc(zzekVar.zzi(), zzekVar);
            } else {
                zzaeg zzaegVar = null;
                switch (zzi) {
                    case 1718776947:
                        if (i11 == 2) {
                            zzekVar.zzL(4);
                            int zzi2 = zzekVar.zzi();
                            int zzi3 = zzekVar.zzi();
                            zzekVar.zzL(4);
                            int zzi4 = zzekVar.zzi();
                            switch (zzi4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                a0.d.i("Ignoring track with unsupported compression ", zzi4, "StreamFormatChunk");
                            } else {
                                zzad zzadVar = new zzad();
                                zzadVar.zzac(zzi2);
                                zzadVar.zzI(zzi3);
                                zzadVar.zzX(str2);
                                zzaegVar = new zzaeg(zzadVar.zzad());
                            }
                        } else if (i11 == 1) {
                            int zzk = zzekVar.zzk();
                            if (zzk == 1) {
                                str = "audio/raw";
                            } else if (zzk != 85) {
                                if (zzk == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (zzk != 8192) {
                                    if (zzk != 8193) {
                                        str = null;
                                    } else {
                                        str = "audio/vnd.dts";
                                    }
                                } else {
                                    str = "audio/ac3";
                                }
                            } else {
                                str = "audio/mpeg";
                            }
                            if (str == null) {
                                a0.d.i("Ignoring track with unsupported format tag ", zzk, "StreamFormatChunk");
                            } else {
                                int zzk2 = zzekVar.zzk();
                                int zzi5 = zzekVar.zzi();
                                zzekVar.zzL(6);
                                int zzl = zzet.zzl(zzekVar.zzq());
                                int zzk3 = zzekVar.zzk();
                                byte[] bArr = new byte[zzk3];
                                zzekVar.zzG(bArr, 0, zzk3);
                                zzad zzadVar2 = new zzad();
                                zzadVar2.zzX(str);
                                zzadVar2.zzy(zzk2);
                                zzadVar2.zzY(zzi5);
                                if ("audio/raw".equals(str) && zzl != 0) {
                                    zzadVar2.zzR(zzl);
                                }
                                if ("audio/mp4a-latm".equals(str) && zzk3 > 0) {
                                    zzadVar2.zzL(zzfxr.zzn(bArr));
                                }
                                zzadxVar = new zzaeg(zzadVar2.zzad());
                                break;
                            }
                        } else {
                            zzea.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzet.zzC(i11)));
                        }
                        zzadxVar = zzaegVar;
                        break;
                    case 1751742049:
                        zzadxVar = zzaec.zzb(zzekVar);
                        break;
                    case 1752331379:
                        zzadxVar = zzaed.zzb(zzekVar);
                        break;
                    case 1852994675:
                        zzadxVar = zzaeh.zzb(zzekVar);
                        break;
                    default:
                        zzadxVar = zzaegVar;
                        break;
                }
            }
            if (zzadxVar != null) {
                if (zzadxVar.zza() == 1752331379) {
                    int i12 = ((zzaed) zzadxVar).zza;
                    if (i12 != 1935960438) {
                        if (i12 != 1935963489) {
                            if (i12 != 1937012852) {
                                zzea.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i12))));
                                i11 = -1;
                            } else {
                                i11 = 3;
                            }
                        } else {
                            i11 = 1;
                        }
                    } else {
                        i11 = 2;
                    }
                }
                zzfxoVar.zzf(zzadxVar);
            }
            zzekVar.zzK(zzd);
            zzekVar.zzJ(zze);
        }
        return new zzaef(i10, zzfxoVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzadx
    public final int zza() {
        return this.zzb;
    }

    public final zzadx zzb(Class cls) {
        zzfxr zzfxrVar = this.zza;
        int size = zzfxrVar.size();
        int i10 = 0;
        while (i10 < size) {
            zzadx zzadxVar = (zzadx) zzfxrVar.get(i10);
            i10++;
            if (zzadxVar.getClass() == cls) {
                return zzadxVar;
            }
        }
        return null;
    }
}
