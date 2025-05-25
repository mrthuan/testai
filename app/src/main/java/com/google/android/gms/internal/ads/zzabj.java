package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.nio.ByteBuffer;
import lib.zj.office.fc.hpsf.Constants;
import lib.zj.office.fc.hssf.record.BOFRecord;
import lib.zj.office.fc.hwpf.usermodel.Field;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzabj {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {24000, 22050, 16000};
    private static final int[] zze = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzf = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzg = {69, 87, 104, 121, ShapeTypes.FLOW_CHART_TERMINATOR, ShapeTypes.GEAR_9, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, Constants.CP_WINDOWS_1253, 1393};

    public static int zza(ByteBuffer byteBuffer) {
        int i10 = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                i10 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
            }
            return zzb[i10] * 256;
        }
        return BOFRecord.VERSION;
    }

    public static int zzb(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            int i10 = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i10 + i10;
        }
        byte b10 = bArr[4];
        return zzf((b10 & 192) >> 6, b10 & Field.BARCODE);
    }

    public static zzaf zzc(zzek zzekVar, String str, String str2, zzy zzyVar) {
        zzej zzejVar = new zzej();
        zzejVar.zzj(zzekVar);
        int i10 = zzc[zzejVar.zzd(2)];
        zzejVar.zzn(8);
        int i11 = zze[zzejVar.zzd(3)];
        if (zzejVar.zzd(1) != 0) {
            i11++;
        }
        int i12 = zzf[zzejVar.zzd(5)] * 1000;
        zzejVar.zzf();
        zzekVar.zzK(zzejVar.zzb());
        zzad zzadVar = new zzad();
        zzadVar.zzK(str);
        zzadVar.zzX("audio/ac3");
        zzadVar.zzy(i11);
        zzadVar.zzY(i10);
        zzadVar.zzE(zzyVar);
        zzadVar.zzO(str2);
        zzadVar.zzx(i12);
        zzadVar.zzS(i12);
        return zzadVar.zzad();
    }

    public static zzaf zzd(zzek zzekVar, String str, String str2, zzy zzyVar) {
        String str3;
        zzej zzejVar = new zzej();
        zzejVar.zzj(zzekVar);
        int zzd2 = zzejVar.zzd(13) * 1000;
        zzejVar.zzn(3);
        int i10 = zzc[zzejVar.zzd(2)];
        zzejVar.zzn(10);
        int i11 = zze[zzejVar.zzd(3)];
        if (zzejVar.zzd(1) != 0) {
            i11++;
        }
        zzejVar.zzn(3);
        int zzd3 = zzejVar.zzd(4);
        zzejVar.zzn(1);
        if (zzd3 > 0) {
            zzejVar.zzn(6);
            if (zzejVar.zzd(1) != 0) {
                i11 += 2;
            }
            zzejVar.zzn(1);
        }
        if (zzejVar.zza() > 7) {
            zzejVar.zzn(7);
            if (zzejVar.zzd(1) != 0) {
                str3 = "audio/eac3-joc";
                zzejVar.zzf();
                zzekVar.zzK(zzejVar.zzb());
                zzad zzadVar = new zzad();
                zzadVar.zzK(str);
                zzadVar.zzX(str3);
                zzadVar.zzy(i11);
                zzadVar.zzY(i10);
                zzadVar.zzE(zzyVar);
                zzadVar.zzO(str2);
                zzadVar.zzS(zzd2);
                return zzadVar.zzad();
            }
        }
        str3 = "audio/eac3";
        zzejVar.zzf();
        zzekVar.zzK(zzejVar.zzb());
        zzad zzadVar2 = new zzad();
        zzadVar2.zzK(str);
        zzadVar2.zzX(str3);
        zzadVar2.zzy(i11);
        zzadVar2.zzY(i10);
        zzadVar2.zzE(zzyVar);
        zzadVar2.zzO(str2);
        zzadVar2.zzS(zzd2);
        return zzadVar2.zzad();
    }

    public static zzabi zze(zzej zzejVar) {
        String str;
        int i10;
        int i11;
        int i12;
        String str2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        String str3;
        int zzc2 = zzejVar.zzc();
        zzejVar.zzn(40);
        int zzd2 = zzejVar.zzd(5);
        zzejVar.zzl(zzc2);
        int i22 = -1;
        if (zzd2 > 10) {
            zzejVar.zzn(16);
            int zzd3 = zzejVar.zzd(2);
            if (zzd3 != 0) {
                if (zzd3 != 1) {
                    if (zzd3 == 2) {
                        i22 = 2;
                    }
                } else {
                    i22 = 1;
                }
            } else {
                i22 = 0;
            }
            zzejVar.zzn(3);
            int zzd4 = zzejVar.zzd(11) + 1;
            int zzd5 = zzejVar.zzd(2);
            if (zzd5 == 3) {
                i18 = zzd[zzejVar.zzd(2)];
                i19 = 6;
                i17 = 3;
            } else {
                int zzd6 = zzejVar.zzd(2);
                int i23 = zzb[zzd6];
                i17 = zzd6;
                i18 = zzc[zzd5];
                i19 = i23;
            }
            int i24 = zzd4 + zzd4;
            int i25 = (i24 * i18) / (i19 * 32);
            int zzd7 = zzejVar.zzd(3);
            boolean zzp = zzejVar.zzp();
            i11 = zze[zzd7] + (zzp ? 1 : 0);
            zzejVar.zzn(10);
            if (zzejVar.zzp()) {
                zzejVar.zzn(8);
            }
            if (zzd7 == 0) {
                zzejVar.zzn(5);
                if (zzejVar.zzp()) {
                    zzejVar.zzn(8);
                }
                i20 = 0;
                zzd7 = 0;
            } else {
                i20 = zzd7;
            }
            if (i22 == 1) {
                if (zzejVar.zzp()) {
                    zzejVar.zzn(16);
                }
                i21 = 1;
            } else {
                i21 = i22;
            }
            if (zzejVar.zzp()) {
                if (i20 > 2) {
                    zzejVar.zzn(2);
                }
                if ((i20 & 1) != 0 && i20 > 2) {
                    zzejVar.zzn(6);
                }
                if ((i20 & 4) != 0) {
                    zzejVar.zzn(6);
                }
                if (zzp && zzejVar.zzp()) {
                    zzejVar.zzn(5);
                }
                if (i21 == 0) {
                    if (zzejVar.zzp()) {
                        zzejVar.zzn(6);
                    }
                    if (i20 == 0 && zzejVar.zzp()) {
                        zzejVar.zzn(6);
                    }
                    if (zzejVar.zzp()) {
                        zzejVar.zzn(6);
                    }
                    int zzd8 = zzejVar.zzd(2);
                    if (zzd8 == 1) {
                        zzejVar.zzn(5);
                    } else if (zzd8 == 2) {
                        zzejVar.zzn(12);
                    } else if (zzd8 == 3) {
                        int zzd9 = zzejVar.zzd(5);
                        if (zzejVar.zzp()) {
                            zzejVar.zzn(5);
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(4);
                            }
                            if (zzejVar.zzp()) {
                                if (zzejVar.zzp()) {
                                    zzejVar.zzn(4);
                                }
                                if (zzejVar.zzp()) {
                                    zzejVar.zzn(4);
                                }
                            }
                        }
                        if (zzejVar.zzp()) {
                            zzejVar.zzn(5);
                            if (zzejVar.zzp()) {
                                zzejVar.zzn(7);
                                if (zzejVar.zzp()) {
                                    zzejVar.zzn(8);
                                }
                            }
                        }
                        zzejVar.zzn((zzd9 + 2) * 8);
                        zzejVar.zzf();
                    }
                    if (i20 < 2) {
                        if (zzejVar.zzp()) {
                            zzejVar.zzn(14);
                        }
                        if (zzd7 == 0 && zzejVar.zzp()) {
                            zzejVar.zzn(14);
                        }
                    }
                    if (zzejVar.zzp()) {
                        if (i17 == 0) {
                            zzejVar.zzn(5);
                            i21 = 0;
                            i17 = 0;
                        } else {
                            for (int i26 = 0; i26 < i19; i26++) {
                                if (zzejVar.zzp()) {
                                    zzejVar.zzn(5);
                                }
                            }
                        }
                    }
                    i21 = 0;
                }
            }
            if (zzejVar.zzp()) {
                zzejVar.zzn(5);
                if (i20 == 2) {
                    zzejVar.zzn(4);
                    i20 = 2;
                }
                if (i20 >= 6) {
                    zzejVar.zzn(2);
                }
                if (zzejVar.zzp()) {
                    zzejVar.zzn(8);
                }
                if (i20 == 0 && zzejVar.zzp()) {
                    zzejVar.zzn(8);
                }
                if (zzd5 < 3) {
                    zzejVar.zzm();
                }
            }
            if (i21 == 0 && i17 != 3) {
                zzejVar.zzm();
            }
            if (i21 == 2 && (i17 == 3 || zzejVar.zzp())) {
                zzejVar.zzn(6);
            }
            if (zzejVar.zzp() && zzejVar.zzd(6) == 1 && zzejVar.zzd(8) == 1) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
            str2 = str3;
            i12 = i22;
            i14 = i24;
            i15 = i18;
            i16 = i19 * 256;
            i13 = i25;
        } else {
            zzejVar.zzn(32);
            int zzd10 = zzejVar.zzd(2);
            if (zzd10 == 3) {
                str = null;
            } else {
                str = "audio/ac3";
            }
            int zzd11 = zzejVar.zzd(6);
            int i27 = zzf[zzd11 / 2] * 1000;
            int zzf2 = zzf(zzd10, zzd11);
            zzejVar.zzn(8);
            int zzd12 = zzejVar.zzd(3);
            if ((zzd12 & 1) != 0 && zzd12 != 1) {
                zzejVar.zzn(2);
            }
            if ((zzd12 & 4) != 0) {
                zzejVar.zzn(2);
            }
            if (zzd12 == 2) {
                zzejVar.zzn(2);
            }
            if (zzd10 < 3) {
                i10 = zzc[zzd10];
            } else {
                i10 = -1;
            }
            i11 = zze[zzd12] + (zzejVar.zzp() ? 1 : 0);
            i12 = -1;
            str2 = str;
            i13 = i27;
            i14 = zzf2;
            i15 = i10;
            i16 = 1536;
        }
        return new zzabi(str2, i12, i11, i15, i14, i16, i13, null);
    }

    private static int zzf(int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 < 3 && i11 >= 0 && (i12 = i11 >> 1) < 19) {
            int i13 = zzc[i10];
            if (i13 == 44100) {
                int i14 = zzg[i12] + (i11 & 1);
                return i14 + i14;
            }
            int i15 = zzf[i12];
            if (i13 == 32000) {
                return i15 * 6;
            }
            return i15 * 4;
        }
        return -1;
    }
}
