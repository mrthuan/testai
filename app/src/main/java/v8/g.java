package v8;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import f9.m;
import java.util.ArrayList;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: FloatingActionButtonImplLollipop.java */
/* loaded from: classes2.dex */
public final class g extends com.google.android.material.floatingactionbutton.g {
    public StateListAnimator N;

    /* compiled from: FloatingActionButtonImplLollipop.java */
    /* loaded from: classes2.dex */
    public static class a extends f9.h {
        @Override // f9.h, android.graphics.drawable.Drawable
        public final boolean isStateful() {
            return true;
        }
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final float e() {
        return this.f12557v.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final void f(Rect rect) {
        boolean z10;
        if (FloatingActionButton.this.f12514k) {
            super.f(rect);
            return;
        }
        boolean z11 = this.f12541f;
        FloatingActionButton floatingActionButton = this.f12557v;
        if (z11 && floatingActionButton.getSizeDimension() < this.f12546k) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            int sizeDimension = (this.f12546k - floatingActionButton.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable drawable;
        f9.h s4 = s();
        this.f12538b = s4;
        s4.setTintList(colorStateList);
        if (mode != null) {
            this.f12538b.setTintMode(mode);
        }
        f9.h hVar = this.f12538b;
        FloatingActionButton floatingActionButton = this.f12557v;
        hVar.k(floatingActionButton.getContext());
        if (i10 > 0) {
            Context context = floatingActionButton.getContext();
            m mVar = this.f12537a;
            mVar.getClass();
            b bVar = new b(mVar);
            int color = androidx.core.content.a.getColor(context, R.color.design_fab_stroke_top_outer_color);
            int color2 = androidx.core.content.a.getColor(context, R.color.design_fab_stroke_top_inner_color);
            int color3 = androidx.core.content.a.getColor(context, R.color.design_fab_stroke_end_inner_color);
            int color4 = androidx.core.content.a.getColor(context, R.color.design_fab_stroke_end_outer_color);
            bVar.f30755i = color;
            bVar.f30756j = color2;
            bVar.f30757k = color3;
            bVar.f30758l = color4;
            float f10 = i10;
            if (bVar.f30754h != f10) {
                bVar.f30754h = f10;
                bVar.f30749b.setStrokeWidth(f10 * 1.3333f);
                bVar.f30760n = true;
                bVar.invalidateSelf();
            }
            if (colorStateList != null) {
                bVar.f30759m = colorStateList.getColorForState(bVar.getState(), bVar.f30759m);
            }
            bVar.f30762p = colorStateList;
            bVar.f30760n = true;
            bVar.invalidateSelf();
            this.f12539d = bVar;
            b bVar2 = this.f12539d;
            bVar2.getClass();
            f9.h hVar2 = this.f12538b;
            hVar2.getClass();
            drawable = new LayerDrawable(new Drawable[]{bVar2, hVar2});
        } else {
            this.f12539d = null;
            drawable = this.f12538b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(c9.a.c(colorStateList2), drawable, null);
        this.c = rippleDrawable;
        this.f12540e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final void i() {
        q();
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final void k(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        FloatingActionButton floatingActionButton = this.f12557v;
        if (floatingActionButton.getStateListAnimator() == this.N) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.g.H, r(f10, f12));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.g.I, r(f10, f11));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.g.J, r(f10, f11));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.g.K, r(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f10).setDuration(0L));
            if (i10 <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.g.C);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.g.L, animatorSet);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.g.M, r(0.0f, 0.0f));
            this.N = stateListAnimator;
            floatingActionButton.setStateListAnimator(stateListAnimator);
        }
        if (o()) {
            q();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final void m(ColorStateList colorStateList) {
        Drawable drawable = this.c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(c9.a.c(colorStateList));
        } else {
            super.m(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final boolean o() {
        boolean z10;
        if (FloatingActionButton.this.f12514k) {
            return true;
        }
        if (this.f12541f && this.f12557v.getSizeDimension() < this.f12546k) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            return true;
        }
        return false;
    }

    public final AnimatorSet r(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        FloatingActionButton floatingActionButton = this.f12557v;
        animatorSet.play(ObjectAnimator.ofFloat(floatingActionButton, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.g.C);
        return animatorSet;
    }

    public final f9.h s() {
        m mVar = this.f12537a;
        mVar.getClass();
        return new a(mVar);
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final void h() {
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final void p() {
    }

    @Override // com.google.android.material.floatingactionbutton.g
    public final void j(int[] iArr) {
    }
}
