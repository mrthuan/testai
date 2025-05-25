package com.bytedance.adsdk.lottie;

/* compiled from: ContainerHelpers.java */
/* loaded from: classes.dex */
class cJ {
    static final int[] Qhi = new int[0];
    static final long[] cJ = new long[0];

    /* renamed from: ac  reason: collision with root package name */
    static final Object[] f7849ac = new Object[0];

    public static int Qhi(int[] iArr, int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = 0;
        while (i13 <= i12) {
            int i14 = (i13 + i12) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i11) {
                i13 = i14 + 1;
            } else if (i15 > i11) {
                i12 = i14 - 1;
            } else {
                return i14;
            }
        }
        return ~i13;
    }
}
