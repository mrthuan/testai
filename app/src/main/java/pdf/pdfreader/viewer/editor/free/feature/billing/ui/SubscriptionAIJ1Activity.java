package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import am.x;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.l1;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionAIJ1Activity;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: SubscriptionAIJ1Activity.kt */
/* loaded from: classes3.dex */
public final class SubscriptionAIJ1Activity extends BaseAISubscriptionActivity {
    public static final a Z;
    public final tf.c V = kotlin.a.a(new cg.a<x>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionAIJ1Activity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final x invoke() {
            return x.a(SubscriptionAIJ1Activity.this.getLayoutInflater());
        }
    });
    public l1 W;
    public int X;
    public ValueAnimator Y;

    /* compiled from: SubscriptionAIJ1Activity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    static {
        ea.a.p("HHVTcxpyXnAuaSVuNEkiMXRjGmkzaRF5", "vNdJzifu");
        Z = new a();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final AppCompatImageView B2() {
        AppCompatImageView appCompatImageView = M2().f1611b;
        kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("B2kFZA1uNS4rbAlzUUk6Zw==", "GhekdRMH"));
        return appCompatImageView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final TextView C2() {
        TextView textView = M2().f1612d;
        kotlin.jvm.internal.g.d(textView, ea.a.p("UWklZBpuBS4Rb1p0AG4jZRB2", "kajCajT2"));
        return textView;
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = M2().f1610a;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("LWlfZBBuUC4obyV0", "EYrRjIBw"));
        return constraintLayout;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final TextView D2() {
        TextView textView = M2().f1618j;
        kotlin.jvm.internal.g.d(textView, ea.a.p("E2k4ZA1uKi4lbwh0XFA7YVZUdg==", "ogqVdMJJ"));
        return textView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final TextView E2() {
        TextView textView = M2().f1619k;
        kotlin.jvm.internal.g.d(textView, ea.a.p("FGlZZBxuUC44cg92VWMuUFdsO2MwVHY=", "Crv7u71z"));
        return textView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final TextView F2() {
        TextView textView = M2().f1620l;
        kotlin.jvm.internal.g.d(textView, ea.a.p("UWklZBpuBS4AZUd0BnIzVHY=", "zqe7a3re"));
        return textView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final TextView G2() {
        TextView textView = M2().f1622n;
        kotlin.jvm.internal.g.d(textView, ea.a.p("LWlfZBBuUC4uZThtOmY9c1BUdg==", "bO4YRkiU"));
        return textView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final ConstraintLayout H2() {
        ConstraintLayout constraintLayout = M2().f1625q;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4LZVVyOWw3bghhS28zdA==", "UThqQ55S"));
        return constraintLayout;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final TextView I2() {
        TextView textView = M2().f1626r;
        kotlin.jvm.internal.g.d(textView, ea.a.p("W2kUZD5uEi4xZQdyZGw2bmthJGUddg==", "xx9zWusk"));
        return textView;
    }

    @Override // jl.a
    public final void J1(Bundle bundle) {
        int i10;
        N2();
        if (bundle != null) {
            i10 = bundle.getInt(ea.a.p("UHU5chZuFkkGZW0=", "hoVSoLjy"));
        } else {
            i10 = 0;
        }
        this.X = i10;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final TextView J2() {
        TextView textView = M2().f1627s;
        kotlin.jvm.internal.g.d(textView, ea.a.p("FGk0ZF9uLC4xZQdyZGw2bmx2", "9mvZ6KKN"));
        return textView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity, pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a
    @SuppressLint({"ClickableViewAccessibility"})
    public final void K1() {
        int i10;
        RecyclerView recyclerView;
        super.K1();
        AppCompatImageView appCompatImageView = M2().f1616h;
        boolean z10 = this.C;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        appCompatImageView.setVisibility(i10);
        ViewPager2 viewPager2 = M2().f1624p;
        viewPager2.setAdapter(new om.e(z10));
        View childAt = viewPager2.getChildAt(0);
        if (childAt instanceof RecyclerView) {
            recyclerView = (RecyclerView) childAt;
        } else {
            recyclerView = null;
        }
        if (recyclerView != null) {
            recyclerView.setOnTouchListener(new k9.k(this, 2));
        }
        viewPager2.f(new b());
        if (this.X > 0) {
            ea.a.p("Emkgdx5hU2Vy", "XWdEN4HJ");
            kl.i.c(this.X, viewPager2);
        } else {
            ea.a.p("OWlUdylhUGVy", "BXmdzvJc");
            kl.i.c(12002, viewPager2);
        }
        viewPager2.getCurrentItem();
        viewPager2.setPageTransformer(new om.f());
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final AppCompatImageView K2() {
        AppCompatImageView appCompatImageView = M2().f1628t;
        kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("LWlfZBBuUC4jZStyJmEeZWFpHkl2", "zGti2WRf"));
        return appCompatImageView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final TextView L2() {
        TextView textView = M2().f1629u;
        kotlin.jvm.internal.g.d(textView, ea.a.p("UWklZBpuBS4LZVVyOmEgZRBpQlR2", "W9k9DB5T"));
        return textView;
    }

    public final x M2() {
        return (x) this.V.getValue();
    }

    public final void N2() {
        l1 l1Var = this.W;
        if (l1Var != null) {
            l1Var.b(null);
        }
        this.W = t0.d0(b.b.x(this), null, null, new SubscriptionAIJ1Activity$reinitScrollTask$1(this, null), 3);
    }

    public final void O2(int i10, final ViewPager2 viewPager2) {
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(this) && i10 != viewPager2.getCurrentItem() && kl.i.a(i10, viewPager2) && !viewPager2.e()) {
            ValueAnimator valueAnimator = this.Y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, (i10 - viewPager2.getCurrentItem()) * viewPager2.getMeasuredWidth());
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.e
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    SubscriptionAIJ1Activity.a aVar = SubscriptionAIJ1Activity.Z;
                    String p10 = ea.a.p("HXAaZU9pJ3U7VgdsQWU=", "KD9h9HUP");
                    Ref$IntRef ref$IntRef2 = Ref$IntRef.this;
                    kotlin.jvm.internal.g.e(ref$IntRef2, p10);
                    String p11 = ea.a.p("F3YiZQRQA2cXcg==", "x04TAkkc");
                    ViewPager2 viewPager22 = viewPager2;
                    kotlin.jvm.internal.g.e(viewPager22, p11);
                    kotlin.jvm.internal.g.e(valueAnimator2, ea.a.p("RWEndRZBDGkfYUBvcg==", "6nt0f6kJ"));
                    Object animatedValue = valueAnimator2.getAnimatedValue();
                    kotlin.jvm.internal.g.c(animatedValue, ea.a.p("X3VfbGpjUm4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiBFeUNlamtcdCRpCC59bnQ=", "3O13J3eH"));
                    int intValue = ((Integer) animatedValue).intValue();
                    viewPager22.c(-(intValue - ref$IntRef2.element));
                    ref$IntRef2.element = intValue;
                }
            });
            ofInt.addListener(new f(viewPager2));
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.setDuration(550L);
            ofInt.start();
            this.Y = ofInt;
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final Space i2() {
        Space space = M2().f1623o;
        kotlin.jvm.internal.g.d(space, ea.a.p("LWlfZBBuUC4ubzpTBWELZQ==", "UcPU3m1L"));
        return space;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putInt(ea.a.p("UHU5chZuFkkGZW0=", "Bl7K9qZS"), M2().f1624p.getCurrentItem());
    }

    /* compiled from: SubscriptionAIJ1Activity.kt */
    /* loaded from: classes3.dex */
    public static final class b extends ViewPager2.g {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void c(int i10) {
            int i11;
            boolean z10;
            boolean z11;
            boolean z12;
            a aVar = SubscriptionAIJ1Activity.Z;
            SubscriptionAIJ1Activity subscriptionAIJ1Activity = SubscriptionAIJ1Activity.this;
            if (subscriptionAIJ1Activity.C) {
                i11 = 4;
            } else {
                i11 = 3;
            }
            AppCompatImageView appCompatImageView = subscriptionAIJ1Activity.M2().f1613e;
            int i12 = i10 % i11;
            boolean z13 = false;
            if (i12 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            appCompatImageView.setSelected(z10);
            AppCompatImageView appCompatImageView2 = subscriptionAIJ1Activity.M2().f1614f;
            if (i12 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            appCompatImageView2.setSelected(z11);
            AppCompatImageView appCompatImageView3 = subscriptionAIJ1Activity.M2().f1615g;
            if (i12 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            appCompatImageView3.setSelected(z12);
            AppCompatImageView appCompatImageView4 = subscriptionAIJ1Activity.M2().f1616h;
            if (i12 == 3) {
                z13 = true;
            }
            appCompatImageView4.setSelected(z13);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public final void a(int i10) {
        }
    }
}
