package y8;

import android.animation.ValueAnimator;
import com.google.android.material.navigation.NavigationBarItemView;

/* compiled from: NavigationBarItemView.java */
/* loaded from: classes2.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f32090a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NavigationBarItemView f32091b;

    public a(NavigationBarItemView navigationBarItemView, float f10) {
        this.f32091b = navigationBarItemView;
        this.f32090a = f10;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int[] iArr = NavigationBarItemView.E;
        this.f32091b.b(floatValue, this.f32090a);
    }
}
