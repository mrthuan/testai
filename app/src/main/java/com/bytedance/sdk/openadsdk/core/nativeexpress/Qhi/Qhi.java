package com.bytedance.sdk.openadsdk.core.nativeexpress.Qhi;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.utils.zn;

/* compiled from: DynamicViewUtils.java */
/* loaded from: classes.dex */
public class Qhi {
    public static Pair<Float, Float> Qhi(Window window, int i10) {
        View decorView = window.getDecorView();
        float[] fArr = {decorView.getWidth() - (decorView.getPaddingLeft() * 2), decorView.getHeight() - (decorView.getPaddingTop() * 2)};
        fArr[0] = zn.ac(window.getContext(), fArr[0]);
        float ac2 = zn.ac(window.getContext(), fArr[1]);
        fArr[1] = ac2;
        if (fArr[0] < 10.0f || ac2 < 10.0f) {
            fArr = Qhi(window.getContext(), zn.ac(window.getContext(), zn.Qhi()), i10);
        }
        float max = Math.max(fArr[0], fArr[1]);
        float min = Math.min(fArr[0], fArr[1]);
        if (i10 == 1) {
            fArr[0] = min;
            fArr[1] = max;
        } else {
            fArr[0] = max;
            fArr[1] = min;
        }
        return new Pair<>(Float.valueOf(fArr[0]), Float.valueOf(fArr[1]));
    }

    public static float cJ(Context context) {
        return zn.ac(context, zn.WAv(context));
    }

    private static float[] Qhi(Context context, int i10, int i11) {
        float Qhi = Qhi(context);
        float cJ = cJ(context);
        if ((i11 == 1) != (Qhi > cJ)) {
            float f10 = Qhi + cJ;
            cJ = f10 - cJ;
            Qhi = f10 - cJ;
        }
        if (i11 == 1) {
            Qhi -= i10;
        } else {
            cJ -= i10;
        }
        return new float[]{cJ, Qhi};
    }

    public static float Qhi(Context context) {
        return zn.ac(context, zn.hm(context));
    }
}
