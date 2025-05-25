package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.activity.r;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.play.core.assetpacks.b1;
import f8.h;
import f8.i;

@Deprecated
/* loaded from: classes2.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;

    /* renamed from: d  reason: collision with root package name */
    public final RectF f13136d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f13137e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f13138f;

    /* renamed from: g  reason: collision with root package name */
    public float f13139g;

    /* renamed from: h  reason: collision with root package name */
    public float f13140h;

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f13141a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f13142b;
        public final /* synthetic */ View c;

        public a(boolean z10, View view, View view2) {
            this.f13141a = z10;
            this.f13142b = view;
            this.c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (!this.f13141a) {
                this.f13142b.setVisibility(4);
                View view = this.c;
                view.setAlpha(1.0f);
                view.setVisibility(0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f13141a) {
                this.f13142b.setVisibility(0);
                View view = this.c;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public h f13143a;

        /* renamed from: b  reason: collision with root package name */
        public b1 f13144b;
    }

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.f13136d = new RectF();
        this.f13137e = new RectF();
        this.f13138f = new int[2];
    }

    public static Pair u(float f10, float f11, boolean z10, b bVar) {
        i f12;
        i f13;
        int i10;
        if (f10 != 0.0f && f11 != 0.0f) {
            if ((z10 && f11 < 0.0f) || (!z10 && i10 > 0)) {
                f12 = bVar.f13143a.f("translationXCurveUpwards");
                f13 = bVar.f13143a.f("translationYCurveUpwards");
            } else {
                f12 = bVar.f13143a.f("translationXCurveDownwards");
                f13 = bVar.f13143a.f("translationYCurveDownwards");
            }
        } else {
            f12 = bVar.f13143a.f("translationXLinear");
            f13 = bVar.f13143a.f("translationYLinear");
        }
        return new Pair(f12, f13);
    }

    public static float x(b bVar, i iVar, float f10) {
        long j10 = iVar.f17153a;
        i f11 = bVar.f13143a.f("expansion");
        float interpolation = iVar.b().getInterpolation(((float) (((f11.f17153a + f11.f17154b) + 17) - j10)) / ((float) iVar.f17154b));
        LinearInterpolator linearInterpolator = f8.b.f17141a;
        return r.l(0.0f, f10, interpolation, f10);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean b(View view, View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() != 8) {
            if ((view2 instanceof FloatingActionButton) && ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) == 0 || expandedComponentIdHint == view.getId())) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        if (fVar.f3493h == 0) {
            fVar.f3493h = 80;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03b6 A[LOOP:0: B:107:0x03b4->B:108:0x03b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0331  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.AnimatorSet t(android.view.View r25, android.view.View r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 963
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.t(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public final float v(View view, View view2, b1 b1Var) {
        RectF rectF = this.f13136d;
        RectF rectF2 = this.f13137e;
        y(view, rectF);
        rectF.offset(this.f13139g, this.f13140h);
        y(view2, rectF2);
        b1Var.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float w(View view, View view2, b1 b1Var) {
        RectF rectF = this.f13136d;
        RectF rectF2 = this.f13137e;
        y(view, rectF);
        rectF.offset(this.f13139g, this.f13140h);
        y(view2, rectF2);
        b1Var.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void y(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f13138f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract b z(Context context, boolean z10);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.f13136d = new RectF();
        this.f13137e = new RectF();
        this.f13138f = new int[2];
    }
}
