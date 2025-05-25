package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Of  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1019Of {
    public static float A00(C1F c1f) {
        int height = c1f.A0E().A01();
        int width = c1f.A0E().A00();
        if (width > 0) {
            return height / width;
        }
        return -1.0f;
    }

    public static int A01(double d10) {
        int availableWidth = (int) ((LO.A00().widthPixels - (AbstractC1022Oi.A07 * 2)) / d10);
        return availableWidth;
    }

    public static int A02(int bottomMargin) {
        int ctaMargin = M3.A01(16);
        int ctaTextHeight = OL.A0B;
        int ctaSpacing = ctaTextHeight * 2;
        int ctaTextHeight2 = AbstractC1022Oi.A07;
        int ctaMargin2 = ctaMargin + ctaSpacing + (ctaTextHeight2 * 2);
        int ctaTextHeight3 = LO.A00().heightPixels;
        return (ctaTextHeight3 - bottomMargin) - ctaMargin2;
    }

    public static View$OnClickListenerC1018Oe A03(View$OnClickListenerC1178Ui view$OnClickListenerC1178Ui, String str) {
        return new View$OnClickListenerC1018Oe(view$OnClickListenerC1178Ui, str);
    }

    public static boolean A04(double d10) {
        return d10 < 0.9d;
    }

    public static boolean A05(double d10, int i10) {
        return A02(i10) < A01(d10);
    }

    public static boolean A06(int i10, int i11, double d10) {
        return i10 == 2 || A05(d10, i11);
    }
}
