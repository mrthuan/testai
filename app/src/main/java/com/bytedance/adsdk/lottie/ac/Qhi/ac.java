package com.bytedance.adsdk.lottie.ac.Qhi;

import java.util.Arrays;
import java.util.List;

/* compiled from: AnimatableGradientColorValue.java */
/* loaded from: classes.dex */
public class ac extends pA<com.bytedance.adsdk.lottie.ac.cJ.fl, com.bytedance.adsdk.lottie.ac.cJ.fl> {
    public ac(List<com.bytedance.adsdk.lottie.ROR.Qhi<com.bytedance.adsdk.lottie.ac.cJ.fl>> list) {
        super(Qhi(list));
    }

    private static List<com.bytedance.adsdk.lottie.ROR.Qhi<com.bytedance.adsdk.lottie.ac.cJ.fl>> Qhi(List<com.bytedance.adsdk.lottie.ROR.Qhi<com.bytedance.adsdk.lottie.ac.cJ.fl>> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, Qhi(list.get(i10)));
        }
        return list;
    }

    @Override // com.bytedance.adsdk.lottie.ac.Qhi.pA, com.bytedance.adsdk.lottie.ac.Qhi.iMK
    public /* bridge */ /* synthetic */ List ac() {
        return super.ac();
    }

    @Override // com.bytedance.adsdk.lottie.ac.Qhi.pA, com.bytedance.adsdk.lottie.ac.Qhi.iMK
    public /* bridge */ /* synthetic */ boolean cJ() {
        return super.cJ();
    }

    @Override // com.bytedance.adsdk.lottie.ac.Qhi.pA
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    private static com.bytedance.adsdk.lottie.ROR.Qhi<com.bytedance.adsdk.lottie.ac.cJ.fl> Qhi(com.bytedance.adsdk.lottie.ROR.Qhi<com.bytedance.adsdk.lottie.ac.cJ.fl> qhi) {
        com.bytedance.adsdk.lottie.ac.cJ.fl flVar = qhi.Qhi;
        com.bytedance.adsdk.lottie.ac.cJ.fl flVar2 = qhi.cJ;
        if (flVar == null || flVar2 == null || flVar.Qhi().length == flVar2.Qhi().length) {
            return qhi;
        }
        float[] Qhi = Qhi(flVar.Qhi(), flVar2.Qhi());
        return qhi.Qhi(flVar.Qhi(Qhi), flVar2.Qhi(Qhi));
    }

    public static float[] Qhi(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f10 = Float.NaN;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = fArr3[i11];
            if (f11 != f10) {
                fArr3[i10] = f11;
                i10++;
                f10 = fArr3[i11];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i10);
    }

    @Override // com.bytedance.adsdk.lottie.ac.Qhi.iMK
    public com.bytedance.adsdk.lottie.Qhi.cJ.Qhi<com.bytedance.adsdk.lottie.ac.cJ.fl, com.bytedance.adsdk.lottie.ac.cJ.fl> Qhi() {
        return new com.bytedance.adsdk.lottie.Qhi.cJ.Tgh(this.Qhi);
    }
}
