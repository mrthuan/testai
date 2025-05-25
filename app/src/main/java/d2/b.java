package d2;

import android.animation.ValueAnimator;
import d2.d;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.a f16076a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f16077b;

    public b(d dVar, d.a aVar) {
        this.f16077b = dVar;
        this.f16076a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        d dVar = this.f16077b;
        dVar.getClass();
        d.a aVar = this.f16076a;
        d.d(floatValue, aVar);
        dVar.a(floatValue, aVar, false);
        dVar.invalidateSelf();
    }
}
