package com.bytedance.adsdk.ugeno.swiper;

import java.util.Collection;

/* compiled from: SwiperUtils.java */
/* loaded from: classes.dex */
public class cJ {
    public static int Qhi(boolean z10, int i10, int i11) {
        if (i11 != 0 && z10) {
            int i12 = i10 - 1073741823;
            int abs = Math.abs(i12) % i11;
            return (i12 >= 0 || abs == 0) ? abs : i11 - abs;
        }
        return i10;
    }

    public static boolean Qhi(int i10, Collection<?> collection) {
        return i10 >= 0 && i10 < collection.size();
    }
}
