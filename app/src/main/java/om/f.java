package om;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: SubscriptionJPagerTransformer.kt */
/* loaded from: classes3.dex */
public final class f implements ViewPager2.i {
    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void a(View view, float f10) {
        int measuredWidth = view.getMeasuredWidth();
        if (f10 < -1.0f) {
            view.setAlpha(0.0f);
            return;
        }
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        boolean z10 = true;
        float f11 = 1.0f;
        if (i10 <= 0) {
            float f12 = (f10 + 0.72f) * 1.389f;
            if (f12 < 0.0f) {
                f12 = 0.0f;
            }
            if (f12 <= 1.0f) {
                f11 = f12;
            }
            view.setAlpha(f11);
            float f13 = measuredWidth * (-f10);
            View findViewById = view.findViewById(R.id.titleTv);
            if (findViewById != null) {
                if (-0.72f > f10 || i10 > 0) {
                    z10 = false;
                }
                if (z10) {
                    findViewById.setTranslationX((f10 / 0.72f) * f13 * 0.186f);
                } else {
                    findViewById.setTranslationX((-f13) * 0.186f);
                }
                View findViewById2 = view.findViewById(R.id.aiPrivilegesLayout);
                if (findViewById2 != null) {
                    findViewById2.setTranslationX(findViewById.getTranslationX());
                }
            }
            View findViewById3 = view.findViewById(R.id.imageView);
            if (findViewById3 != null) {
                findViewById3.setTranslationX((-f13) * 0.466f);
            }
            if (findViewById == null && findViewById3 == null) {
                f13 -= 0.466f * f13;
            }
            view.setTranslationX(f13);
            view.setTranslationZ(0.0f);
        } else if (f10 <= 1.0f) {
            float f14 = (1 - f10) * 1.389f;
            if (f14 < 0.0f) {
                f14 = 0.0f;
            }
            if (f14 <= 1.0f) {
                f11 = f14;
            }
            view.setAlpha(f11);
            float f15 = -f10;
            float f16 = measuredWidth * f15;
            View findViewById4 = view.findViewById(R.id.titleTv);
            if (findViewById4 != null) {
                if (0.0f > f10 || f10 > 0.72f) {
                    z10 = false;
                }
                if (z10) {
                    findViewById4.setTranslationX((f15 / 0.72f) * f16 * 0.186f);
                } else {
                    findViewById4.setTranslationX((-f16) * 0.186f);
                }
                View findViewById5 = view.findViewById(R.id.aiPrivilegesLayout);
                if (findViewById5 != null) {
                    findViewById5.setTranslationX(findViewById4.getTranslationX());
                }
            }
            View findViewById6 = view.findViewById(R.id.imageView);
            if (findViewById6 != null) {
                findViewById6.setTranslationX((-f16) * 0.466f);
            }
            if (findViewById4 == null && findViewById6 == null) {
                f16 -= 0.466f * f16;
            }
            view.setTranslationX(f16);
            view.setTranslationZ(-1.0f);
        } else {
            view.setAlpha(0.0f);
        }
    }
}
