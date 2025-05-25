package l8;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f9.h;

/* compiled from: BottomSheetBehavior.java */
/* loaded from: classes2.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f20526a;

    public a(BottomSheetBehavior bottomSheetBehavior) {
        this.f20526a = bottomSheetBehavior;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        h hVar = this.f20526a.f12128i;
        if (hVar != null) {
            hVar.o(floatValue);
        }
    }
}
