package com.bytedance.sdk.component.adexpress.CJ;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.component.adexpress.dynamic.ac.Sf;

/* compiled from: DrawableFactory.java */
/* loaded from: classes.dex */
public class MQ {
    public static Drawable Qhi(Context context, Sf sf2) {
        if (context == null || sf2 == null) {
            return null;
        }
        return Qhi(context, (int) CQU.Qhi(context, sf2.HzH()), sf2.hpZ(), sf2.aP());
    }

    public static Drawable Qhi(Context context, int i10, int i11, int i12) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        if (context != null) {
            gradientDrawable.setStroke(i10, i11);
        }
        gradientDrawable.setColor(i12);
        return gradientDrawable;
    }
}
