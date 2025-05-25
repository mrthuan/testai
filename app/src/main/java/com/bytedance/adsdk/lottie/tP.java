package com.bytedance.adsdk.lottie;

/* compiled from: RenderMode.java */
/* loaded from: classes.dex */
public enum tP {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    /* compiled from: RenderMode.java */
    /* renamed from: com.bytedance.adsdk.lottie.tP$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Qhi;

        static {
            int[] iArr = new int[tP.values().length];
            Qhi = iArr;
            try {
                iArr[tP.HARDWARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Qhi[tP.SOFTWARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Qhi[tP.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public boolean Qhi(int i10, boolean z10, int i11) {
        int i12 = AnonymousClass1.Qhi[ordinal()];
        if (i12 == 1) {
            return false;
        }
        if (i12 == 2) {
            return true;
        }
        if ((!z10 || i10 >= 28) && i11 <= 4 && i10 > 25) {
            return false;
        }
        return true;
    }
}
