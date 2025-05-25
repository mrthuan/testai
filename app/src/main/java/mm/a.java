package mm;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: BasePageTransformer.java */
/* loaded from: classes3.dex */
public abstract class a implements ViewPager2.i {
    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void a(View view, float f10) {
        view.setScaleX(0.999f);
        int width = view.getWidth();
        view.setPivotY(view.getHeight() / 2);
        view.setPivotX(width / 2);
        if (f10 < -1.0f) {
            view.setScaleX(0.65f);
            view.setScaleY(0.65f);
            view.setPivotX(width);
        } else if (f10 <= 1.0f) {
            if (f10 < 0.0f) {
                float f11 = ((1.0f + f10) * 0.35000002f) + 0.65f;
                view.setScaleX(f11);
                view.setScaleY(f11);
                view.setPivotX((((-f10) * 0.5f) + 0.5f) * width);
                return;
            }
            float f12 = 1.0f - f10;
            float f13 = (0.35000002f * f12) + 0.65f;
            view.setScaleX(f13);
            view.setScaleY(f13);
            view.setPivotX(f12 * 0.5f * width);
        } else {
            view.setPivotX(0.0f);
            view.setScaleX(0.65f);
            view.setScaleY(0.65f);
        }
    }
}
