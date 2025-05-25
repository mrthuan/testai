package com.bytedance.adsdk.ugeno.swiper.Qhi;

import android.view.View;
import com.bytedance.adsdk.ugeno.viewpager.ViewPager;

/* compiled from: ScaleAndAlphaTransformer.java */
/* loaded from: classes.dex */
public class Qhi implements ViewPager.Tgh {
    final float Qhi = 0.8f;
    final float cJ = 0.5f;

    @Override // com.bytedance.adsdk.ugeno.viewpager.ViewPager.Tgh
    public void Qhi(View view, float f10) {
        float f11;
        float f12;
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 < 0) {
            f11 = 0.19999999f;
        } else {
            f11 = -0.19999999f;
        }
        float f13 = (f11 * f10) + 1.0f;
        if (i10 < 0) {
            f12 = 0.5f;
        } else {
            f12 = -0.5f;
        }
        float f14 = (f10 * f12) + 1.0f;
        if (i10 < 0) {
            view.setPivotX(view.getWidth());
            view.setPivotY(view.getHeight() / 2);
        } else {
            view.setPivotX(0.0f);
            view.setPivotY(view.getHeight() / 2);
        }
        view.setScaleX(f13);
        view.setScaleY(f13);
        view.setAlpha(Math.abs(f14));
    }
}
