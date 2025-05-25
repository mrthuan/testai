package com.bytedance.sdk.openadsdk.core.ROR.ac;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.Arrays;
import java.util.List;

/* compiled from: VastUtils.java */
/* loaded from: classes.dex */
public class fl {
    public static final List<String> Qhi = Arrays.asList("video/mp4", "video/3gpp");

    public static double Qhi(int i10, double d10, int i11, int i12, int i13, String str) {
        double Qhi2 = Qhi(i10, d10, i11, i12);
        return (1.0d / ((Qhi2 + 1.0d) + Qhi(i13))) * Qhi(str);
    }

    private static double Qhi(int i10, double d10, int i11, int i12) {
        return (d10 > 0.0d ? Math.abs(d10 - (i12 > 0 ? i11 / i12 : 0.0d)) : 0.0d) + (i10 > 0 ? Math.abs((i10 - i11) / i10) : 0.0d);
    }

    private static double Qhi(int i10) {
        int max = Math.max(i10, 0);
        if (700 > max || max > 1500) {
            return Math.min(Math.abs(700 - max) / 700.0f, Math.abs(TTAdConstant.STYLE_SIZE_RADIO_3_2 - max) / 1500.0f);
        }
        return 0.0d;
    }

    private static double Qhi(String str) {
        char c;
        if (str == null) {
            str = "";
        }
        int hashCode = str.hashCode();
        if (hashCode != -1664118616) {
            if (hashCode == 1331848029 && str.equals("video/mp4")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("video/3gpp")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? 1.0d : 1.5d;
    }
}
