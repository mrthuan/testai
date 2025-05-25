package w8;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: MultiViewUpdateListener.java */
/* loaded from: classes2.dex */
public final class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final a f31002a;

    /* renamed from: b  reason: collision with root package name */
    public final View[] f31003b;

    /* compiled from: MultiViewUpdateListener.java */
    /* loaded from: classes2.dex */
    public interface a {
        void b(ValueAnimator valueAnimator, View view);
    }

    @SuppressLint({"LambdaLast"})
    public g(a aVar, View... viewArr) {
        this.f31002a = aVar;
        this.f31003b = viewArr;
    }

    public static g a(View... viewArr) {
        return new g(new t5.e(6), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.f31003b) {
            this.f31002a.b(valueAnimator, view);
        }
    }
}
