package zo;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: GalleryPageTransformer.kt */
/* loaded from: classes3.dex */
public final class a implements ViewPager2.i {

    /* renamed from: a  reason: collision with root package name */
    public final float f32427a;

    /* renamed from: b  reason: collision with root package name */
    public final b f32428b;

    public a(float f10, b bVar) {
        this.f32427a = f10;
        this.f32428b = bVar;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void a(View view, float f10) {
        b bVar = this.f32428b;
        if (bVar != null) {
            bVar.a(view, f10);
        }
        int width = view.getWidth();
        view.getHeight();
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        float f11 = this.f32427a;
        if (i10 < 0 && f10 >= -1.0f) {
            float f12 = (0.2f * f10) + 1.0f;
            view.setScaleX(f12);
            view.setScaleY(f12);
            view.setTranslationZ(f10);
            view.setTranslationX((((1 - view.getScaleX()) * width) / 2.0f) + (f10 * (-f11)));
        } else if (f10 > 0.0f && f10 <= 1.0f) {
            float f13 = 1.0f - (0.2f * f10);
            view.setScaleX(f13);
            view.setScaleY(f13);
            view.setTranslationZ(-f10);
            view.setTranslationX((f10 * (-f11)) - (((1 - view.getScaleX()) * width) / 2.0f));
        } else {
            view.setTranslationX(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setTranslationZ(0.0f);
        }
    }
}
