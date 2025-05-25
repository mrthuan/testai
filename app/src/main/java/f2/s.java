package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.BaseInterpolator;
import f2.k;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: TranslationAnimationCreator.java */
/* loaded from: classes.dex */
public final class s {
    public static ObjectAnimator a(View view, r rVar, int i10, int i11, float f10, float f11, float f12, float f13, BaseInterpolator baseInterpolator, k kVar) {
        float f14;
        float f15;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) rVar.f17076b.getTag(R.id.transition_position);
        if (iArr != null) {
            f14 = (iArr[0] - i10) + translationX;
            f15 = (iArr[1] - i11) + translationY;
        } else {
            f14 = f10;
            f15 = f11;
        }
        int round = Math.round(f14 - translationX) + i10;
        int round2 = Math.round(f15 - translationY) + i11;
        view.setTranslationX(f14);
        view.setTranslationY(f15);
        if (f14 == f12 && f15 == f13) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f14, f12), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f15, f13));
        a aVar = new a(view, rVar.f17076b, round, round2, translationX, translationY);
        kVar.a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        ofPropertyValuesHolder.addPauseListener(aVar);
        ofPropertyValuesHolder.setInterpolator(baseInterpolator);
        return ofPropertyValuesHolder;
    }

    /* compiled from: TranslationAnimationCreator.java */
    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements k.d {

        /* renamed from: a  reason: collision with root package name */
        public final View f17077a;

        /* renamed from: b  reason: collision with root package name */
        public final View f17078b;
        public final int c;

        /* renamed from: d  reason: collision with root package name */
        public final int f17079d;

        /* renamed from: e  reason: collision with root package name */
        public int[] f17080e;

        /* renamed from: f  reason: collision with root package name */
        public float f17081f;

        /* renamed from: g  reason: collision with root package name */
        public float f17082g;

        /* renamed from: h  reason: collision with root package name */
        public final float f17083h;

        /* renamed from: i  reason: collision with root package name */
        public final float f17084i;

        public a(View view, View view2, int i10, int i11, float f10, float f11) {
            this.f17078b = view;
            this.f17077a = view2;
            this.c = i10 - Math.round(view.getTranslationX());
            this.f17079d = i11 - Math.round(view.getTranslationY());
            this.f17083h = f10;
            this.f17084i = f11;
            int[] iArr = (int[]) view2.getTag(R.id.transition_position);
            this.f17080e = iArr;
            if (iArr != null) {
                view2.setTag(R.id.transition_position, null);
            }
        }

        @Override // f2.k.d
        public final void c(k kVar) {
            View view = this.f17078b;
            view.setTranslationX(this.f17083h);
            view.setTranslationY(this.f17084i);
            kVar.x(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            if (this.f17080e == null) {
                this.f17080e = new int[2];
            }
            int[] iArr = this.f17080e;
            View view = this.f17078b;
            iArr[0] = Math.round(view.getTranslationX() + this.c);
            this.f17080e[1] = Math.round(view.getTranslationY() + this.f17079d);
            this.f17077a.setTag(R.id.transition_position, this.f17080e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            View view = this.f17078b;
            this.f17081f = view.getTranslationX();
            this.f17082g = view.getTranslationY();
            view.setTranslationX(this.f17083h);
            view.setTranslationY(this.f17084i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            float f10 = this.f17081f;
            View view = this.f17078b;
            view.setTranslationX(f10);
            view.setTranslationY(this.f17082g);
        }

        @Override // f2.k.d
        public final void a() {
        }

        @Override // f2.k.d
        public final void b() {
        }

        @Override // f2.k.d
        public final void d() {
        }

        @Override // f2.k.d
        public final void e() {
        }
    }
}
