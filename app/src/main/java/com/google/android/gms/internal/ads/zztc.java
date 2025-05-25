package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
@SuppressLint({"InlinedApi"})
/* loaded from: classes2.dex */
public final class zztc {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzaf r19) {
        /*
            Method dump skipped, instructions count: 2264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztc.zza(com.google.android.gms.internal.ads.zzaf):android.util.Pair");
    }

    public static zzsf zzb() {
        List zze = zze("audio/raw", false, false);
        if (zze.isEmpty()) {
            return null;
        }
        return (zzsf) zze.get(0);
    }

    public static String zzc(zzaf zzafVar) {
        Pair zza2;
        if ("audio/eac3-joc".equals(zzafVar.zzm)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(zzafVar.zzm) && (zza2 = zza(zzafVar)) != null) {
            int intValue = ((Integer) zza2.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                if (intValue == 1024) {
                    return "video/av01";
                }
                return null;
            }
            return "video/hevc";
        }
        return null;
    }

    public static List zzd(zzsq zzsqVar, zzaf zzafVar, boolean z10, boolean z11) {
        String zzc2 = zzc(zzafVar);
        if (zzc2 == null) {
            return zzfxr.zzm();
        }
        return zze(zzc2, z10, z11);
    }

    public static synchronized List zze(String str, boolean z10, boolean z11) {
        synchronized (zztc.class) {
            zzsu zzsuVar = new zzsu(str, z10, z11);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzsuVar);
            if (list != null) {
                return list;
            }
            int i10 = zzet.zza;
            ArrayList zzh = zzh(zzsuVar, new zzta(z10, z11));
            if (z10 && zzh.isEmpty() && zzet.zza <= 23) {
                zzh = zzh(zzsuVar, new zzsz(null));
                if (!zzh.isEmpty()) {
                    String str2 = ((zzsf) zzh.get(0)).zza;
                    zzea.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + str2);
                }
            }
            if ("audio/raw".equals(str)) {
                if (zzet.zza < 26 && zzet.zzb.equals("R9") && zzh.size() == 1 && ((zzsf) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzsf.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzi(zzh, new zztb() { // from class: com.google.android.gms.internal.ads.zzss
                    @Override // com.google.android.gms.internal.ads.zztb
                    public final int zza(Object obj) {
                        int i11 = zztc.zza;
                        String str3 = ((zzsf) obj).zza;
                        if (str3.startsWith("OMX.google") || str3.startsWith("c2.android")) {
                            return 1;
                        }
                        if (zzet.zza >= 26 || !str3.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                            return 0;
                        }
                        return -1;
                    }
                });
            }
            if (zzet.zza < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzsf) zzh.get(0)).zza)) {
                zzh.add((zzsf) zzh.remove(0));
            }
            zzfxr zzk = zzfxr.zzk(zzh);
            hashMap.put(zzsuVar, zzk);
            return zzk;
        }
    }

    public static List zzf(zzsq zzsqVar, zzaf zzafVar, boolean z10, boolean z11) {
        List zze = zze(zzafVar.zzm, z10, z11);
        List zzd = zzd(zzsqVar, zzafVar, z10, z11);
        zzfxo zzfxoVar = new zzfxo();
        zzfxoVar.zzh(zze);
        zzfxoVar.zzh(zzd);
        return zzfxoVar.zzi();
    }

    public static List zzg(List list, final zzaf zzafVar) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zztb() { // from class: com.google.android.gms.internal.ads.zzst
            @Override // com.google.android.gms.internal.ads.zztb
            public final int zza(Object obj) {
                int i10 = zztc.zza;
                if (((zzsf) obj).zzd(zzaf.this)) {
                    return 1;
                }
                return 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:64|65|(1:67)(2:129|(1:131)(1:132))|68|(1:70)(2:121|(1:128)(1:127))|(4:(2:115|116)|95|(8:98|99|100|101|102|103|104|106)|11)|74|75|76|77|11) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b1, code lost:
        if (r1.zzb == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01cf, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0225, code lost:
        com.google.android.gms.internal.ads.zzea.zzc("MediaCodecUtil", "Skipping codec " + r1 + " (failed to query capabilities)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
        if ("SCV31".equals(r10) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (r9 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017d A[Catch: Exception -> 0x0210, TryCatch #0 {Exception -> 0x0210, blocks: (B:80:0x0133, B:86:0x014a, B:92:0x015f, B:94:0x0165, B:99:0x0175, B:101:0x017d, B:111:0x01a9, B:102:0x0182, B:104:0x0192, B:106:0x019a, B:95:0x016a), top: B:151:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0182 A[Catch: Exception -> 0x0210, TryCatch #0 {Exception -> 0x0210, blocks: (B:80:0x0133, B:86:0x014a, B:92:0x015f, B:94:0x0165, B:99:0x0175, B:101:0x017d, B:111:0x01a9, B:102:0x0182, B:104:0x0192, B:106:0x019a, B:95:0x016a), top: B:151:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x021f A[Catch: Exception -> 0x026d, TRY_ENTER, TryCatch #3 {Exception -> 0x026d, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:10:0x0034, B:14:0x0042, B:18:0x004c, B:20:0x0054, B:22:0x005c, B:24:0x0066, B:26:0x0070, B:28:0x0078, B:30:0x0080, B:32:0x0088, B:34:0x0090, B:36:0x0098, B:38:0x00a0, B:42:0x00ac, B:44:0x00b4, B:46:0x00bc, B:48:0x00c5, B:138:0x0217, B:141:0x021f, B:143:0x0225, B:144:0x023f, B:145:0x0260, B:51:0x00ce, B:52:0x00d1, B:54:0x00d9, B:57:0x00e4, B:59:0x00ec, B:62:0x00f7, B:64:0x00ff, B:67:0x010a, B:69:0x0112, B:72:0x011d, B:74:0x0125), top: B:157:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x023f A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0165 A[Catch: Exception -> 0x0210, TryCatch #0 {Exception -> 0x0210, blocks: (B:80:0x0133, B:86:0x014a, B:92:0x015f, B:94:0x0165, B:99:0x0175, B:101:0x017d, B:111:0x01a9, B:102:0x0182, B:104:0x0192, B:106:0x019a, B:95:0x016a), top: B:151:0x0133 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016a A[Catch: Exception -> 0x0210, TryCatch #0 {Exception -> 0x0210, blocks: (B:80:0x0133, B:86:0x014a, B:92:0x015f, B:94:0x0165, B:99:0x0175, B:101:0x017d, B:111:0x01a9, B:102:0x0182, B:104:0x0192, B:106:0x019a, B:95:0x016a), top: B:151:0x0133 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zzsu r23, com.google.android.gms.internal.ads.zzsx r24) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztc.zzh(com.google.android.gms.internal.ads.zzsu, com.google.android.gms.internal.ads.zzsx):java.util.ArrayList");
    }

    private static void zzi(List list, final zztb zztbVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzsr
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i10 = zztc.zza;
                zztb zztbVar2 = zztb.this;
                return zztbVar2.zza(obj2) - zztbVar2.zza(obj);
            }
        });
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (zzet.zza >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        } else if (zzbn.zzg(str)) {
            return true;
        } else {
            String zza2 = zzfuf.zza(mediaCodecInfo.getName());
            if (zza2.startsWith("arc.")) {
                return false;
            }
            if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
                return true;
            }
            if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
                return true;
            }
            if (!zza2.startsWith("omx.") && !zza2.startsWith("c2.")) {
                return true;
            }
            return false;
        }
    }
}
