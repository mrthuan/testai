package me.zhanghai.android.materialprogressbar.internal;

import android.content.Context;
import android.content.res.TypedArray;

/* loaded from: classes3.dex */
public class ThemeUtils {
    private ThemeUtils() {
    }

    public static int getColorFromAttrRes(int i10, int i11, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        try {
            return obtainStyledAttributes.getColor(0, i11);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static float getFloatFromAttrRes(int i10, float f10, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i10});
        try {
            return obtainStyledAttributes.getFloat(0, f10);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
