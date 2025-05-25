package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import d9.j;
import java.util.WeakHashMap;
import t5.i;
import w8.g;
import w8.m;
import w8.n;
import w8.t;
import w8.w;
import x0.f0;
import x0.h;
import x0.n0;

/* compiled from: SearchViewAnimationHelper.java */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final SearchView f12834a;

    /* renamed from: b  reason: collision with root package name */
    public final View f12835b;
    public final ClippableRoundedCornerLayout c;

    /* renamed from: d  reason: collision with root package name */
    public final FrameLayout f12836d;

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f12837e;

    /* renamed from: f  reason: collision with root package name */
    public final MaterialToolbar f12838f;

    /* renamed from: g  reason: collision with root package name */
    public final Toolbar f12839g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f12840h;

    /* renamed from: i  reason: collision with root package name */
    public final EditText f12841i;

    /* renamed from: j  reason: collision with root package name */
    public final ImageButton f12842j;

    /* renamed from: k  reason: collision with root package name */
    public final View f12843k;

    /* renamed from: l  reason: collision with root package name */
    public final TouchObserverFrameLayout f12844l;

    /* renamed from: m  reason: collision with root package name */
    public SearchBar f12845m;

    /* compiled from: SearchViewAnimationHelper.java */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f12846a;

        public a(boolean z10) {
            this.f12846a = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            float f10;
            boolean z10 = this.f12846a;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            e eVar = e.this;
            e.a(eVar, f10);
            if (z10) {
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = eVar.c;
                clippableRoundedCornerLayout.f12595a = null;
                clippableRoundedCornerLayout.invalidate();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            float f10;
            if (this.f12846a) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            e.a(e.this, f10);
        }
    }

    public e(SearchView searchView) {
        this.f12834a = searchView;
        this.f12835b = searchView.f12803a;
        this.c = searchView.f12804b;
        this.f12836d = searchView.f12806e;
        this.f12837e = searchView.f12807f;
        this.f12838f = searchView.f12808g;
        this.f12839g = searchView.f12809h;
        this.f12840h = searchView.f12810i;
        this.f12841i = searchView.f12811j;
        this.f12842j = searchView.f12812k;
        this.f12843k = searchView.f12813l;
        this.f12844l = searchView.f12814m;
    }

    public static void a(e eVar, float f10) {
        ActionMenuView a10;
        eVar.f12842j.setAlpha(f10);
        eVar.f12843k.setAlpha(f10);
        eVar.f12844l.setAlpha(f10);
        if (eVar.f12834a.f12822u && (a10 = t.a(eVar.f12838f)) != null) {
            a10.setAlpha(f10);
        }
    }

    public final void b(AnimatorSet animatorSet) {
        ImageButton b10 = t.b(this.f12838f);
        if (b10 == null) {
            return;
        }
        Drawable d10 = p0.a.d(b10.getDrawable());
        if (this.f12834a.f12821t) {
            if (d10 instanceof n.d) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new j((n.d) d10, 0));
                animatorSet.playTogether(ofFloat);
            }
            if (d10 instanceof w8.d) {
                final w8.d dVar = (w8.d) d10;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: d9.i
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        w8.d.this.a(valueAnimator.getAnimatedFraction());
                    }
                });
                animatorSet.playTogether(ofFloat2);
                return;
            }
            return;
        }
        if (d10 instanceof n.d) {
            n.d dVar2 = (n.d) d10;
            if (dVar2.f22267i != 1.0f) {
                dVar2.f22267i = 1.0f;
                dVar2.invalidateSelf();
            }
        }
        if (d10 instanceof w8.d) {
            ((w8.d) d10).a(1.0f);
        }
    }

    public final AnimatorSet c(boolean z10) {
        Interpolator interpolator;
        long j10;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        int i10;
        int i11;
        long j18;
        long j19;
        AnimatorSet animatorSet = new AnimatorSet();
        Animator[] animatorArr = new Animator[10];
        if (z10) {
            interpolator = f8.b.f17141a;
        } else {
            interpolator = f8.b.f17142b;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            j10 = 300;
        } else {
            j10 = 250;
        }
        ofFloat.setDuration(j10);
        ofFloat.setInterpolator(n.a(z10, interpolator));
        ofFloat.addUpdateListener(new g(new ha.n(4), this.f12835b));
        animatorArr[0] = ofFloat;
        SearchView searchView = this.f12834a;
        Rect rect = new Rect(searchView.getLeft(), searchView.getTop() + 0, searchView.getRight(), searchView.getBottom() + 0);
        int[] iArr = new int[2];
        this.f12845m.getLocationOnScreen(iArr);
        int i12 = iArr[0];
        int i13 = iArr[1];
        int[] iArr2 = new int[2];
        this.c.getLocationOnScreen(iArr2);
        int i14 = i12 - iArr2[0];
        int i15 = i13 - iArr2[1];
        Rect rect2 = new Rect(i14, i15, this.f12845m.getWidth() + i14, this.f12845m.getHeight() + i15);
        final Rect rect3 = new Rect(rect2);
        final float cornerSize = this.f12845m.getCornerSize();
        ValueAnimator ofObject = ValueAnimator.ofObject(new m(rect3), rect2, rect);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: d9.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                com.google.android.material.search.e eVar = com.google.android.material.search.e.this;
                eVar.getClass();
                float animatedFraction = (1.0f - valueAnimator.getAnimatedFraction()) * cornerSize;
                ClippableRoundedCornerLayout clippableRoundedCornerLayout = eVar.c;
                clippableRoundedCornerLayout.getClass();
                Rect rect4 = rect3;
                RectF rectF = new RectF(rect4.left, rect4.top, rect4.right, rect4.bottom);
                if (clippableRoundedCornerLayout.f12595a == null) {
                    clippableRoundedCornerLayout.f12595a = new Path();
                }
                clippableRoundedCornerLayout.f12595a.reset();
                clippableRoundedCornerLayout.f12595a.addRoundRect(rectF, animatedFraction, animatedFraction, Path.Direction.CW);
                clippableRoundedCornerLayout.f12595a.close();
                clippableRoundedCornerLayout.invalidate();
            }
        });
        if (z10) {
            j11 = 300;
        } else {
            j11 = 250;
        }
        ofObject.setDuration(j11);
        m1.b bVar = f8.b.f17142b;
        ofObject.setInterpolator(n.a(z10, bVar));
        animatorArr[1] = ofObject;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            j12 = 50;
        } else {
            j12 = 42;
        }
        ofFloat2.setDuration(j12);
        if (z10) {
            j13 = 250;
        } else {
            j13 = 0;
        }
        ofFloat2.setStartDelay(j13);
        LinearInterpolator linearInterpolator = f8.b.f17141a;
        ofFloat2.setInterpolator(n.a(z10, linearInterpolator));
        ofFloat2.addUpdateListener(new g(new ha.n(4), this.f12842j));
        animatorArr[2] = ofFloat2;
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator[] animatorArr2 = new Animator[3];
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            j14 = 150;
        } else {
            j14 = 83;
        }
        ofFloat3.setDuration(j14);
        if (z10) {
            j15 = 75;
        } else {
            j15 = 0;
        }
        ofFloat3.setStartDelay(j15);
        ofFloat3.setInterpolator(n.a(z10, linearInterpolator));
        View view = this.f12843k;
        TouchObserverFrameLayout touchObserverFrameLayout = this.f12844l;
        ofFloat3.addUpdateListener(new g(new ha.n(4), view, touchObserverFrameLayout));
        animatorArr2[0] = ofFloat3;
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat((touchObserverFrameLayout.getHeight() * 0.050000012f) / 2.0f, 0.0f);
        if (z10) {
            j16 = 300;
        } else {
            j16 = 250;
        }
        ofFloat4.setDuration(j16);
        ofFloat4.setInterpolator(n.a(z10, bVar));
        ofFloat4.addUpdateListener(g.a(view));
        animatorArr2[1] = ofFloat4;
        ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.95f, 1.0f);
        if (z10) {
            j17 = 300;
        } else {
            j17 = 250;
        }
        ofFloat5.setDuration(j17);
        ofFloat5.setInterpolator(n.a(z10, bVar));
        ofFloat5.addUpdateListener(new g(new com.facebook.appevents.m(4), touchObserverFrameLayout));
        animatorArr2[2] = ofFloat5;
        animatorSet2.playTogether(animatorArr2);
        animatorArr[3] = animatorSet2;
        AnimatorSet animatorSet3 = new AnimatorSet();
        MaterialToolbar materialToolbar = this.f12838f;
        View b10 = t.b(materialToolbar);
        if (b10 == null) {
            i10 = 2;
            i11 = 1;
        } else {
            ValueAnimator ofFloat6 = ValueAnimator.ofFloat(e(b10), 0.0f);
            ofFloat6.addUpdateListener(new g(new i(6), b10));
            i10 = 2;
            i11 = 1;
            ValueAnimator ofFloat7 = ValueAnimator.ofFloat(f(), 0.0f);
            ofFloat7.addUpdateListener(g.a(b10));
            animatorSet3.playTogether(ofFloat6, ofFloat7);
        }
        b(animatorSet3);
        View a10 = t.a(materialToolbar);
        if (a10 != null) {
            float[] fArr = new float[i10];
            fArr[0] = d(a10);
            fArr[i11] = 0.0f;
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(fArr);
            View[] viewArr = new View[i11];
            viewArr[0] = a10;
            ofFloat8.addUpdateListener(new g(new i(6), viewArr));
            ValueAnimator ofFloat9 = ValueAnimator.ofFloat(f(), 0.0f);
            ofFloat9.addUpdateListener(g.a(a10));
            animatorSet3.playTogether(ofFloat8, ofFloat9);
        }
        if (z10) {
            j18 = 300;
        } else {
            j18 = 250;
        }
        animatorSet3.setDuration(j18);
        animatorSet3.setInterpolator(n.a(z10, bVar));
        animatorArr[4] = animatorSet3;
        animatorArr[5] = h(this.f12836d, z10, false);
        Toolbar toolbar = this.f12839g;
        animatorArr[6] = h(toolbar, z10, false);
        ValueAnimator ofFloat10 = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (z10) {
            j19 = 300;
        } else {
            j19 = 250;
        }
        ofFloat10.setDuration(j19);
        ofFloat10.setInterpolator(n.a(z10, bVar));
        if (searchView.f12822u) {
            ofFloat10.addUpdateListener(new w8.e(t.a(toolbar), t.a(materialToolbar)));
        }
        animatorArr[7] = ofFloat10;
        animatorArr[8] = h(this.f12841i, z10, true);
        animatorArr[9] = h(this.f12840h, z10, true);
        animatorSet.playTogether(animatorArr);
        animatorSet.addListener(new a(z10));
        return animatorSet;
    }

    public final int d(View view) {
        int b10 = h.b((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        if (w.e(this.f12845m)) {
            return this.f12845m.getLeft() - b10;
        }
        return (this.f12845m.getRight() - this.f12834a.getWidth()) + b10;
    }

    public final int e(View view) {
        int c = h.c((ViewGroup.MarginLayoutParams) view.getLayoutParams());
        SearchBar searchBar = this.f12845m;
        WeakHashMap<View, n0> weakHashMap = f0.f31435a;
        int f10 = f0.e.f(searchBar);
        if (w.e(this.f12845m)) {
            return ((this.f12845m.getWidth() - this.f12845m.getRight()) + c) - f10;
        }
        return (this.f12845m.getLeft() - c) + f10;
    }

    public final int f() {
        FrameLayout frameLayout = this.f12837e;
        int top = frameLayout.getTop();
        return ((this.f12845m.getBottom() + this.f12845m.getTop()) / 2) - ((frameLayout.getBottom() + top) / 2);
    }

    public final AnimatorSet g(boolean z10) {
        long j10;
        AnimatorSet animatorSet = new AnimatorSet();
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.c;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(clippableRoundedCornerLayout.getHeight(), 0.0f);
        ofFloat.addUpdateListener(g.a(clippableRoundedCornerLayout));
        animatorSet.playTogether(ofFloat);
        b(animatorSet);
        animatorSet.setInterpolator(n.a(z10, f8.b.f17142b));
        if (z10) {
            j10 = 350;
        } else {
            j10 = 300;
        }
        animatorSet.setDuration(j10);
        return animatorSet;
    }

    public final AnimatorSet h(View view, boolean z10, boolean z11) {
        int d10;
        long j10;
        if (z11) {
            d10 = e(view);
        } else {
            d10 = d(view);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(d10, 0.0f);
        ofFloat.addUpdateListener(new g(new i(6), view));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f(), 0.0f);
        ofFloat2.addUpdateListener(g.a(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        if (z10) {
            j10 = 300;
        } else {
            j10 = 250;
        }
        animatorSet.setDuration(j10);
        animatorSet.setInterpolator(n.a(z10, f8.b.f17142b));
        return animatorSet;
    }
}
