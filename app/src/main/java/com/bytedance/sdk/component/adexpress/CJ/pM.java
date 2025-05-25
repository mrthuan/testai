package com.bytedance.sdk.component.adexpress.CJ;

import android.graphics.drawable.GradientDrawable;

/* compiled from: ShapeUtils.java */
/* loaded from: classes.dex */
public class pM {
    public static GradientDrawable Qhi(int i10, Integer num, int[] iArr, int[] iArr2, Integer num2, Integer num3) {
        int i11;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(i10);
        if (num != null) {
            gradientDrawable.setColor(num.intValue());
        }
        if (iArr != null) {
            i11 = iArr.length;
        } else {
            i11 = 0;
        }
        if (i11 == 1) {
            gradientDrawable.setCornerRadius(iArr[0]);
        } else if (i11 == 4) {
            int i12 = iArr[0];
            int i13 = iArr[1];
            int i14 = iArr[2];
            int i15 = iArr[3];
            gradientDrawable.setCornerRadii(new float[]{i12, i12, i13, i13, i14, i14, i15, i15});
        }
        if (iArr2 != null && iArr2.length == 2) {
            gradientDrawable.setSize(iArr2[0], iArr2[1]);
        }
        if (num2 != null && num3 != null) {
            gradientDrawable.setStroke(num2.intValue(), num3.intValue());
        }
        return gradientDrawable;
    }
}
