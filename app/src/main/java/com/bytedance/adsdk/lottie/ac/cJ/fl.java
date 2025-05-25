package com.bytedance.adsdk.lottie.ac.cJ;

import a6.h;
import java.util.Arrays;

/* compiled from: GradientColor.java */
/* loaded from: classes.dex */
public class fl {
    private final float[] Qhi;
    private final int[] cJ;

    public fl(float[] fArr, int[] iArr) {
        this.Qhi = fArr;
        this.cJ = iArr;
    }

    public float[] Qhi() {
        return this.Qhi;
    }

    public int ac() {
        return this.cJ.length;
    }

    public int[] cJ() {
        return this.cJ;
    }

    public void Qhi(fl flVar, fl flVar2, float f10) {
        if (flVar.cJ.length == flVar2.cJ.length) {
            for (int i10 = 0; i10 < flVar.cJ.length; i10++) {
                this.Qhi[i10] = com.bytedance.adsdk.lottie.Tgh.Tgh.Qhi(flVar.Qhi[i10], flVar2.Qhi[i10], f10);
                this.cJ[i10] = com.bytedance.adsdk.lottie.Tgh.cJ.Qhi(f10, flVar.cJ[i10], flVar2.cJ[i10]);
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
        sb2.append(flVar.cJ.length);
        sb2.append(" vs ");
        throw new IllegalArgumentException(h.g(sb2, flVar2.cJ.length, ")"));
    }

    public fl Qhi(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            iArr[i10] = Qhi(fArr[i10]);
        }
        return new fl(fArr, iArr);
    }

    private int Qhi(float f10) {
        int binarySearch = Arrays.binarySearch(this.Qhi, f10);
        if (binarySearch >= 0) {
            return this.cJ[binarySearch];
        }
        int i10 = -(binarySearch + 1);
        if (i10 == 0) {
            return this.cJ[0];
        }
        int[] iArr = this.cJ;
        if (i10 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.Qhi;
        int i11 = i10 - 1;
        float f11 = fArr[i11];
        return com.bytedance.adsdk.lottie.Tgh.cJ.Qhi((f10 - f11) / (fArr[i10] - f11), iArr[i11], iArr[i10]);
    }
}
