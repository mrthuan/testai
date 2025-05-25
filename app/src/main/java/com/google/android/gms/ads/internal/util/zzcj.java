package com.google.android.gms.ads.internal.util;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes.dex */
public final class zzcj {

    /* renamed from: b  reason: collision with root package name */
    public static List f10455b;

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f10454a = new HashMap();
    public static final Object c = new Object();

    public static List a(String str) {
        ArrayList arrayList;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        Object obj = c;
        synchronized (obj) {
            HashMap hashMap = f10454a;
            if (hashMap.containsKey(str)) {
                return (List) hashMap.get(str);
            }
            try {
                synchronized (obj) {
                    if (f10455b == null) {
                        f10455b = Arrays.asList(new MediaCodecList(0).getCodecInfos());
                    }
                    arrayList = new ArrayList();
                    for (MediaCodecInfo mediaCodecInfo : f10455b) {
                        if (!mediaCodecInfo.isEncoder() && Arrays.asList(mediaCodecInfo.getSupportedTypes()).contains(str)) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("codecName", mediaCodecInfo.getName());
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            ArrayList arrayList2 = new ArrayList();
                            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                                arrayList2.add(new Integer[]{Integer.valueOf(codecProfileLevel.profile), Integer.valueOf(codecProfileLevel.level)});
                            }
                            hashMap2.put("profileLevels", arrayList2);
                            MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                            hashMap2.put("bitRatesBps", b(videoCapabilities.getBitrateRange()));
                            hashMap2.put("widthAlignment", Integer.valueOf(videoCapabilities.getWidthAlignment()));
                            hashMap2.put("heightAlignment", Integer.valueOf(videoCapabilities.getHeightAlignment()));
                            hashMap2.put("frameRates", b(videoCapabilities.getSupportedFrameRates()));
                            hashMap2.put("widths", b(videoCapabilities.getSupportedWidths()));
                            hashMap2.put("heights", b(videoCapabilities.getSupportedHeights()));
                            hashMap2.put("instancesLimit", Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                            arrayList.add(hashMap2);
                        }
                    }
                    f10454a.put(str, arrayList);
                }
                return arrayList;
            } catch (LinkageError | RuntimeException e10) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("error", e10.getClass().getSimpleName());
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(hashMap3);
                f10454a.put(str, arrayList3);
                return arrayList3;
            }
        }
    }

    public static Integer[] b(Range range) {
        return new Integer[]{(Integer) range.getLower(), (Integer) range.getUpper()};
    }
}
