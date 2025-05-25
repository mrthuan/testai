package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes2.dex */
public final class zzsf {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    public zzsf(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z10;
        this.zze = z13;
        this.zzf = z15;
        this.zzh = zzbn.zzi(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        if ("Nexus 10".equals(r3) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
        if (r15.isFeatureSupported("secure-playback") != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzsf zzc(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.zzsf r11 = new com.google.android.gms.internal.ads.zzsf
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3b
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L3b
            int r3 = com.google.android.gms.internal.ads.zzet.zza
            r5 = 22
            if (r3 > r5) goto L39
            java.lang.String r3 = com.google.android.gms.internal.ads.zzet.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L28
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L39
        L28:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L3b
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L39
            goto L3b
        L39:
            r8 = r0
            goto L3c
        L3b:
            r8 = r2
        L3c:
            if (r4 == 0) goto L4a
            int r3 = com.google.android.gms.internal.ads.zzet.zza
            java.lang.String r3 = "tunneled-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L4a
            r9 = r0
            goto L4b
        L4a:
            r9 = r2
        L4b:
            if (r20 != 0) goto L5c
            if (r4 == 0) goto L5a
            int r3 = com.google.android.gms.internal.ads.zzet.zza
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L5a
            goto L5c
        L5a:
            r10 = r2
            goto L5d
        L5c:
            r10 = r0
        L5d:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsf.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzsf");
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i12 = zzet.zza;
        return new Point((((i10 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i11 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        String str2 = zzet.zze;
        StringBuilder g10 = b.a.g("NoSupport [", str, "] [");
        g10.append(this.zza);
        g10.append(", ");
        g10.append(this.zzb);
        g10.append("] [");
        g10.append(str2);
        g10.append("]");
        zzea.zzb("MediaCodecInfo", g10.toString());
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point zzi = zzi(videoCapabilities, i10, i11);
        int i12 = zzi.x;
        int i13 = zzi.y;
        if (d10 != -1.0d && d10 >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
        }
        return videoCapabilities.isSizeSupported(i12, i13);
    }

    private final boolean zzl(zzaf zzafVar, boolean z10) {
        int i10;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair zza = zztc.zza(zzafVar);
        if (zza != null) {
            int intValue = ((Integer) zza.first).intValue();
            int intValue2 = ((Integer) zza.second).intValue();
            int i11 = 8;
            if ("video/dolby-vision".equals(zzafVar.zzm)) {
                if ("video/avc".equals(this.zzb)) {
                    intValue = 8;
                } else if ("video/hevc".equals(this.zzb)) {
                    intValue = 2;
                }
                intValue2 = 0;
            }
            if (!this.zzh) {
                if (intValue == 42) {
                    intValue = 42;
                }
            }
            MediaCodecInfo.CodecProfileLevel[] zzh = zzh();
            if (zzet.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzh.length == 0) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                    i10 = videoCapabilities.getBitrateRange().getUpper().intValue();
                } else {
                    i10 = 0;
                }
                if (i10 >= 180000000) {
                    i11 = 1024;
                } else if (i10 >= 120000000) {
                    i11 = 512;
                } else if (i10 >= 60000000) {
                    i11 = 256;
                } else if (i10 >= 30000000) {
                    i11 = 128;
                } else if (i10 >= 18000000) {
                    i11 = 64;
                } else if (i10 >= 12000000) {
                    i11 = 32;
                } else if (i10 >= 7200000) {
                    i11 = 16;
                } else if (i10 < 3600000) {
                    if (i10 >= 1800000) {
                        i11 = 4;
                    } else if (i10 >= 800000) {
                        i11 = 2;
                    } else {
                        i11 = 1;
                    }
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                codecProfileLevel.profile = 1;
                codecProfileLevel.level = i11;
                zzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzh) {
                if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z10)) {
                    if ("video/hevc".equals(this.zzb) && intValue == 2) {
                        String str = zzet.zzb;
                        if (!"sailfish".equals(str) && !"marlin".equals(str)) {
                        }
                    }
                }
            }
            zzj(androidx.appcompat.view.menu.d.d("codec.profileLevel, ", zzafVar.zzj, ", ", this.zzc));
            return false;
        }
        return true;
    }

    private final boolean zzm(zzaf zzafVar) {
        if (!this.zzb.equals(zzafVar.zzm) && !this.zzb.equals(zztc.zzc(zzafVar))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
            return zzi(videoCapabilities, i10, i11);
        }
        return null;
    }

    public final zzho zzb(zzaf zzafVar, zzaf zzafVar2) {
        int i10;
        int i11;
        if (true != zzet.zzG(zzafVar.zzm, zzafVar2.zzm)) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        if (this.zzh) {
            if (zzafVar.zzu != zzafVar2.zzu) {
                i10 |= 1024;
            }
            if (!this.zze && (zzafVar.zzr != zzafVar2.zzr || zzafVar.zzs != zzafVar2.zzs)) {
                i10 |= 512;
            }
            if ((!zzo.zzg(zzafVar.zzy) || !zzo.zzg(zzafVar2.zzy)) && !zzet.zzG(zzafVar.zzy, zzafVar2.zzy)) {
                i10 |= 2048;
            }
            String str = this.zza;
            if (zzet.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzafVar.zzd(zzafVar2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                String str2 = this.zza;
                if (true != zzafVar.zzd(zzafVar2)) {
                    i11 = 2;
                } else {
                    i11 = 3;
                }
                return new zzho(str2, zzafVar, zzafVar2, i11, 0);
            }
        } else {
            if (zzafVar.zzz != zzafVar2.zzz) {
                i10 |= 4096;
            }
            if (zzafVar.zzA != zzafVar2.zzA) {
                i10 |= 8192;
            }
            if (zzafVar.zzB != zzafVar2.zzB) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair zza = zztc.zza(zzafVar);
                Pair zza2 = zztc.zza(zzafVar2);
                if (zza != null && zza2 != null) {
                    int intValue = ((Integer) zza.first).intValue();
                    int intValue2 = ((Integer) zza2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzho(this.zza, zzafVar, zzafVar2, 3, 0);
                    }
                }
            }
            if (!zzafVar.zzd(zzafVar2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new zzho(this.zza, zzafVar, zzafVar2, 1, 0);
            }
        }
        return new zzho(this.zza, zzafVar, zzafVar2, 0, i10);
    }

    public final boolean zzd(zzaf zzafVar) {
        if (!zzm(zzafVar) || !zzl(zzafVar, false)) {
            return false;
        }
        return true;
    }

    public final boolean zze(zzaf zzafVar) {
        int i10;
        int i11;
        if (!zzm(zzafVar) || !zzl(zzafVar, true)) {
            return false;
        }
        if (this.zzh) {
            int i12 = zzafVar.zzr;
            if (i12 <= 0 || (i11 = zzafVar.zzs) <= 0) {
                return true;
            }
            int i13 = zzet.zza;
            return zzg(i12, i11, zzafVar.zzt);
        }
        int i14 = zzet.zza;
        int i15 = zzafVar.zzA;
        if (i15 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities == null) {
                zzj("sampleRate.caps");
                return false;
            }
            MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
            if (audioCapabilities == null) {
                zzj("sampleRate.aCaps");
                return false;
            } else if (!audioCapabilities.isSampleRateSupported(i15)) {
                zzj(b.a.c("sampleRate.support, ", i15));
                return false;
            }
        }
        int i16 = zzafVar.zzz;
        if (i16 != -1) {
            MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
            if (codecCapabilities2 == null) {
                zzj("channelCount.caps");
            } else {
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    zzj("channelCount.aCaps");
                } else {
                    String str = this.zza;
                    String str2 = this.zzb;
                    int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                    if (maxInputChannelCount <= 1 && ((zzet.zza < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                        if ("audio/ac3".equals(str2)) {
                            i10 = 6;
                        } else if ("audio/eac3".equals(str2)) {
                            i10 = 16;
                        } else {
                            i10 = 30;
                        }
                        zzea.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i10 + "]");
                        maxInputChannelCount = i10;
                    }
                    if (maxInputChannelCount < i16) {
                        zzj(b.a.c("channelCount.support, ", i16));
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean zzf(zzaf zzafVar) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zza = zztc.zza(zzafVar);
        if (zza != null && ((Integer) zza.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean zzg(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzj("sizeAndRate.vCaps");
            return false;
        }
        if (zzet.zza >= 29) {
            int zza = zzsh.zza(videoCapabilities, i10, i11, d10);
            if (zza != 2) {
                if (zza == 1) {
                    StringBuilder f10 = a0.d.f("sizeAndRate.cover, ", i10, "x", i11, "@");
                    f10.append(d10);
                    zzj(f10.toString());
                    return false;
                }
            }
            return true;
        }
        if (!zzk(videoCapabilities, i10, i11, d10)) {
            if (i10 < i11 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) || !"mcv5a".equals(zzet.zzb)) && zzk(videoCapabilities, i11, i10, d10))) {
                StringBuilder f11 = a0.d.f("sizeAndRate.rotated, ", i10, "x", i11, "@");
                f11.append(d10);
                String sb2 = f11.toString();
                String str = this.zza;
                String str2 = this.zzb;
                String str3 = zzet.zze;
                StringBuilder f12 = android.support.v4.media.session.h.f("AssumedSupport [", sb2, "] [", str, ", ");
                f12.append(str2);
                f12.append("] [");
                f12.append(str3);
                f12.append("]");
                zzea.zzb("MediaCodecInfo", f12.toString());
            } else {
                StringBuilder f13 = a0.d.f("sizeAndRate.support, ", i10, "x", i11, "@");
                f13.append(d10);
                zzj(f13.toString());
                return false;
            }
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return codecProfileLevelArr;
    }
}
