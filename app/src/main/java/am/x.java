package am;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ActivitySubscriptionDarkTestJBinding.java */
/* loaded from: classes3.dex */
public final class x implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f1610a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatImageView f1611b;
    public final LottieAnimationView c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f1612d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatImageView f1613e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatImageView f1614f;

    /* renamed from: g  reason: collision with root package name */
    public final AppCompatImageView f1615g;

    /* renamed from: h  reason: collision with root package name */
    public final AppCompatImageView f1616h;

    /* renamed from: i  reason: collision with root package name */
    public final ViewStub f1617i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f1618j;

    /* renamed from: k  reason: collision with root package name */
    public final TextView f1619k;

    /* renamed from: l  reason: collision with root package name */
    public final TextView f1620l;

    /* renamed from: m  reason: collision with root package name */
    public final FrameLayout f1621m;

    /* renamed from: n  reason: collision with root package name */
    public final TextView f1622n;

    /* renamed from: o  reason: collision with root package name */
    public final Space f1623o;

    /* renamed from: p  reason: collision with root package name */
    public final ViewPager2 f1624p;

    /* renamed from: q  reason: collision with root package name */
    public final ConstraintLayout f1625q;

    /* renamed from: r  reason: collision with root package name */
    public final TextView f1626r;

    /* renamed from: s  reason: collision with root package name */
    public final TextView f1627s;

    /* renamed from: t  reason: collision with root package name */
    public final AppCompatImageView f1628t;

    /* renamed from: u  reason: collision with root package name */
    public final TextView f1629u;

    public x(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, LottieAnimationView lottieAnimationView, TextView textView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, ViewStub viewStub, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout, TextView textView5, Space space, ViewPager2 viewPager2, ConstraintLayout constraintLayout2, TextView textView6, TextView textView7, AppCompatImageView appCompatImageView6, TextView textView8) {
        this.f1610a = constraintLayout;
        this.f1611b = appCompatImageView;
        this.c = lottieAnimationView;
        this.f1612d = textView;
        this.f1613e = appCompatImageView2;
        this.f1614f = appCompatImageView3;
        this.f1615g = appCompatImageView4;
        this.f1616h = appCompatImageView5;
        this.f1617i = viewStub;
        this.f1618j = textView2;
        this.f1619k = textView3;
        this.f1620l = textView4;
        this.f1621m = frameLayout;
        this.f1622n = textView5;
        this.f1623o = space;
        this.f1624p = viewPager2;
        this.f1625q = constraintLayout2;
        this.f1626r = textView6;
        this.f1627s = textView7;
        this.f1628t = appCompatImageView6;
        this.f1629u = textView8;
    }

    public static x a(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.activity_subscription_dark_test_j, (ViewGroup) null, false);
        int i10 = R.id.bottom_split_line;
        if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.bottom_split_line)) != null) {
            i10 = R.id.cancel_tv;
            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cancel_tv)) != null) {
                i10 = R.id.close_img;
                AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.close_img);
                if (appCompatImageView != null) {
                    i10 = R.id.continue_anim;
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.continue_anim);
                    if (lottieAnimationView != null) {
                        i10 = R.id.continue_tv;
                        TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.continue_tv);
                        if (textView != null) {
                            i10 = R.id.indicator1Iv;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.indicator1Iv);
                            if (appCompatImageView2 != null) {
                                i10 = R.id.indicator2Iv;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.indicator2Iv);
                                if (appCompatImageView3 != null) {
                                    i10 = R.id.indicator3Iv;
                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.indicator3Iv);
                                    if (appCompatImageView4 != null) {
                                        i10 = R.id.indicator4Iv;
                                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.indicator4Iv);
                                        if (appCompatImageView5 != null) {
                                            i10 = R.id.loadingVS;
                                            ViewStub viewStub = (ViewStub) com.google.android.play.core.assetpacks.c.u(inflate, R.id.loadingVS);
                                            if (viewStub != null) {
                                                i10 = R.id.month_plan_tv;
                                                TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.month_plan_tv);
                                                if (textView2 != null) {
                                                    i10 = R.id.percent_space1;
                                                    if (((Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.percent_space1)) != null) {
                                                        i10 = R.id.percent_space2;
                                                        if (((Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.percent_space2)) != null) {
                                                            i10 = R.id.percent_space3;
                                                            if (((Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.percent_space3)) != null) {
                                                                i10 = R.id.privacy_policy_tv;
                                                                TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.privacy_policy_tv);
                                                                if (textView3 != null) {
                                                                    i10 = R.id.restore_tv;
                                                                    TextView textView4 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.restore_tv);
                                                                    if (textView4 != null) {
                                                                        i10 = R.id.retainPageContainer;
                                                                        FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retainPageContainer);
                                                                        if (frameLayout != null) {
                                                                            i10 = R.id.term_of_use_tv;
                                                                            TextView textView5 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.term_of_use_tv);
                                                                            if (textView5 != null) {
                                                                                i10 = R.id.top_space;
                                                                                Space space = (Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.top_space);
                                                                                if (space != null) {
                                                                                    i10 = R.id.viewPager;
                                                                                    ViewPager2 viewPager2 = (ViewPager2) com.google.android.play.core.assetpacks.c.u(inflate, R.id.viewPager);
                                                                                    if (viewPager2 != null) {
                                                                                        i10 = R.id.year_plan_layout;
                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.year_plan_layout);
                                                                                        if (constraintLayout != null) {
                                                                                            i10 = R.id.year_plan_save_tv;
                                                                                            TextView textView6 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.year_plan_save_tv);
                                                                                            if (textView6 != null) {
                                                                                                i10 = R.id.year_plan_tv;
                                                                                                TextView textView7 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.year_plan_tv);
                                                                                                if (textView7 != null) {
                                                                                                    i10 = R.id.year_save_tip_iv;
                                                                                                    AppCompatImageView appCompatImageView6 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.year_save_tip_iv);
                                                                                                    if (appCompatImageView6 != null) {
                                                                                                        i10 = R.id.year_save_tip_tv;
                                                                                                        TextView textView8 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.year_save_tip_tv);
                                                                                                        if (textView8 != null) {
                                                                                                            return new x((ConstraintLayout) inflate, appCompatImageView, lottieAnimationView, textView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, viewStub, textView2, textView3, textView4, frameLayout, textView5, space, viewPager2, constraintLayout, textView6, textView7, appCompatImageView6, textView8);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("O2kacy5uFiA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "KAviGqVV").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // i2.a
    public final View b() {
        return this.f1610a;
    }
}
