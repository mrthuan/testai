package w8;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.HashMap;

/* compiled from: TextScale.java */
/* loaded from: classes2.dex */
public final class q extends f2.k {

    /* compiled from: TextScale.java */
    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f31053a;

        public a(TextView textView) {
            this.f31053a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            TextView textView = this.f31053a;
            textView.setScaleX(floatValue);
            textView.setScaleY(floatValue);
        }
    }

    @Override // f2.k
    public final void e(f2.r rVar) {
        View view = rVar.f17076b;
        if (view instanceof TextView) {
            rVar.f17075a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // f2.k
    public final void h(f2.r rVar) {
        View view = rVar.f17076b;
        if (view instanceof TextView) {
            rVar.f17075a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // f2.k
    public final Animator l(ViewGroup viewGroup, f2.r rVar, f2.r rVar2) {
        float f10;
        if (rVar == null || rVar2 == null || !(rVar.f17076b instanceof TextView)) {
            return null;
        }
        View view = rVar2.f17076b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        HashMap hashMap = rVar.f17075a;
        HashMap hashMap2 = rVar2.f17075a;
        float f11 = 1.0f;
        if (hashMap.get("android:textscale:scale") != null) {
            f10 = ((Float) hashMap.get("android:textscale:scale")).floatValue();
        } else {
            f10 = 1.0f;
        }
        if (hashMap2.get("android:textscale:scale") != null) {
            f11 = ((Float) hashMap2.get("android:textscale:scale")).floatValue();
        }
        if (f10 == f11) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
        ofFloat.addUpdateListener(new a(textView));
        return ofFloat;
    }
}
