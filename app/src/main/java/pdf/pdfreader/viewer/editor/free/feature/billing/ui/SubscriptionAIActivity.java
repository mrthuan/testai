package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import am.w;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.y0;
import androidx.appcompat.widget.z0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: SubscriptionAIActivity.kt */
/* loaded from: classes3.dex */
public final class SubscriptionAIActivity extends BaseAISubscriptionActivity {
    public static final /* synthetic */ int X = 0;
    public final tf.c V = kotlin.a.a(new cg.a<w>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionAIActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final w invoke() {
            View inflate = SubscriptionAIActivity.this.getLayoutInflater().inflate(R.layout.activity_subscription_dark_test_h, (ViewGroup) null, false);
            int i10 = R.id.aiPrivilegesContainer;
            FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.aiPrivilegesContainer);
            if (frameLayout != null) {
                i10 = R.id.bottom_split_line;
                if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.bottom_split_line)) != null) {
                    i10 = R.id.cancel_tv;
                    if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cancel_tv)) != null) {
                        i10 = R.id.close_img;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.close_img);
                        if (appCompatImageView != null) {
                            i10 = R.id.continue_anim;
                            if (((LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.continue_anim)) != null) {
                                i10 = R.id.continue_tv;
                                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.continue_tv);
                                if (textView != null) {
                                    i10 = R.id.logoWithImg;
                                    if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.logoWithImg)) != null) {
                                        i10 = R.id.month_plan_tv;
                                        TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.month_plan_tv);
                                        if (textView2 != null) {
                                            i10 = R.id.percent_space1;
                                            if (((Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.percent_space1)) != null) {
                                                i10 = R.id.percent_space2;
                                                Space space = (Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.percent_space2);
                                                if (space != null) {
                                                    i10 = R.id.percent_space3;
                                                    Space space2 = (Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.percent_space3);
                                                    if (space2 != null) {
                                                        i10 = R.id.percent_space4;
                                                        Space space3 = (Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.percent_space4);
                                                        if (space3 != null) {
                                                            i10 = R.id.percent_space5;
                                                            Space space4 = (Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.percent_space5);
                                                            if (space4 != null) {
                                                                i10 = R.id.powerByGTP;
                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.powerByGTP);
                                                                if (appCompatTextView != null) {
                                                                    i10 = R.id.privacy_policy_tv;
                                                                    TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.privacy_policy_tv);
                                                                    if (textView3 != null) {
                                                                        i10 = R.id.restore_tv;
                                                                        TextView textView4 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.restore_tv);
                                                                        if (textView4 != null) {
                                                                            i10 = R.id.retainPageContainer;
                                                                            FrameLayout frameLayout2 = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retainPageContainer);
                                                                            if (frameLayout2 != null) {
                                                                                i10 = R.id.spike_left_img;
                                                                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.spike_left_img)) != null) {
                                                                                    i10 = R.id.spike_right_img;
                                                                                    if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.spike_right_img)) != null) {
                                                                                        i10 = R.id.spike_tv;
                                                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.spike_tv);
                                                                                        if (appCompatTextView2 != null) {
                                                                                            i10 = R.id.term_of_use_tv;
                                                                                            TextView textView5 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.term_of_use_tv);
                                                                                            if (textView5 != null) {
                                                                                                i10 = R.id.topBgImg;
                                                                                                LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.topBgImg);
                                                                                                if (lottieAnimationView != null) {
                                                                                                    i10 = R.id.top_space;
                                                                                                    Space space5 = (Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.top_space);
                                                                                                    if (space5 != null) {
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
                                                                                                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.year_save_tip_iv);
                                                                                                                    if (appCompatImageView2 != null) {
                                                                                                                        i10 = R.id.year_save_tip_tv;
                                                                                                                        TextView textView8 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.year_save_tip_tv);
                                                                                                                        if (textView8 != null) {
                                                                                                                            return new w((ConstraintLayout) inflate, frameLayout, appCompatImageView, textView, textView2, space, space2, space3, space4, appCompatTextView, textView3, textView4, frameLayout2, appCompatTextView2, textView5, lottieAnimationView, space5, constraintLayout, textView6, textView7, appCompatImageView2, textView8);
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
                    }
                }
            }
            throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpH2gSSTA6IA==", "k2tPd7q5").concat(inflate.getResources().getResourceName(i10)));
        }
    });
    public int W;

    static {
        ea.a.p("HHVTcxpyXnAuaSVuNEkpY0FpGGkxeQ==", "u3Mpg1n4");
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final AppCompatImageView B2() {
        AppCompatImageView appCompatImageView = M2().c;
        kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("IWlcZCJuAC4rbAlzUUk6Zw==", "HsC2KgMx"));
        return appCompatImageView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final TextView C2() {
        TextView textView = M2().f1556d;
        kotlin.jvm.internal.g.d(textView, ea.a.p("UWklZBpuBS4Rb1p0AG4jZRB2", "QNZ0NcX9"));
        return textView;
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = M2().f1554a;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4Ab1t0", "g5FQgmd5"));
        return constraintLayout;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final TextView D2() {
        TextView textView = M2().f1557e;
        kotlin.jvm.internal.g.d(textView, ea.a.p("UWklZBpuBS4fb1p0AVA6YSpUdg==", "R2mEe0Qd"));
        return textView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final TextView E2() {
        TextView textView = M2().f1563k;
        kotlin.jvm.internal.g.d(textView, ea.a.p("I2k8ZA5uNy44cg92VWMuUFdsO2MwVHY=", "lCARgP9H"));
        return textView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final TextView F2() {
        TextView textView = M2().f1564l;
        kotlin.jvm.internal.g.d(textView, ea.a.p("LWlfZBBuUC4oZTl0GnINVHY=", "w2WnkjC2"));
        return textView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final TextView G2() {
        TextView textView = M2().f1567o;
        kotlin.jvm.internal.g.d(textView, ea.a.p("LWlfZBBuUC4uZThtOmY9c1BUdg==", "oobhCrRm"));
        return textView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final ConstraintLayout H2() {
        ConstraintLayout constraintLayout = M2().f1570r;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4LZVVyOWw3bghhS28zdA==", "VrIwDO53"));
        return constraintLayout;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final TextView I2() {
        TextView textView = M2().f1571s;
        kotlin.jvm.internal.g.d(textView, ea.a.p("UWklZBpuBS4LZVVyOWw3bhdhRGUSdg==", "o6D5TLwX"));
        return textView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final TextView J2() {
        TextView textView = M2().f1572t;
        kotlin.jvm.internal.g.d(textView, ea.a.p("UWklZBpuBS4LZVVyOWw3bhB2", "CuV5Wc1i"));
        return textView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity, pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a
    public final void K1() {
        int i10;
        int i11;
        int i12;
        super.K1();
        if (1.8888888f > (getResources().getDisplayMetrics().heightPixels * 1.0f) / getResources().getDisplayMetrics().widthPixels) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_55);
            LottieAnimationView lottieAnimationView = M2().f1568p;
            kotlin.jvm.internal.g.d(lottieAnimationView, ea.a.p("UWklZBpuBS4Gb0RCDkk7Zw==", "h0VhV6Ku"));
            ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                ((ViewGroup.MarginLayoutParams) bVar).topMargin = -dimensionPixelSize;
                lottieAnimationView.setLayoutParams(bVar);
                Space space = M2().f1560h;
                kotlin.jvm.internal.g.d(space, ea.a.p("E2lfZC1uLi44ZRRjUW4jU0hhMWU0", "T3q1DIns"));
                ViewGroup.LayoutParams layoutParams2 = space.getLayoutParams();
                if (layoutParams2 != null) {
                    ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
                    bVar2.S = 0.015f;
                    space.setLayoutParams(bVar2);
                    Space space2 = M2().f1559g;
                    kotlin.jvm.internal.g.d(space2, ea.a.p("MmkhZCZuLi44ZRRjUW4jU0hhMWUz", "klPOOIzq"));
                    ViewGroup.LayoutParams layoutParams3 = space2.getLayoutParams();
                    if (layoutParams3 != null) {
                        ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams3;
                        bVar3.S = 0.015f;
                        space2.setLayoutParams(bVar3);
                    } else {
                        throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuDW5Ebk1sWCBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQOYRBvTXQad1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTAN5BnVMUFVyUm1z", "bi840gfd"));
                    }
                } else {
                    throw new NullPointerException(ea.a.p("CnU9bGdjLW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAQeSFlZ2EiZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdw1kNmUzLg9vJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyBW1z", "yddQGLx7"));
                }
            } else {
                throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuX25XbgxsWCBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXRcYQNvDHQad1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTFF5FXUNUFVyUm1z", "0zy4toRh"));
            }
        }
        M2().f1561i.addOnLayoutChangeListener(new b(this, 0));
        M2().f1566n.addOnLayoutChangeListener(new c(this, 0));
        FrameLayout frameLayout = M2().f1555b;
        ViewGroup viewGroup = (ViewGroup) frameLayout.findViewById(R.id.subscriptionPrivilegesCl);
        boolean a10 = kotlin.jvm.internal.g.a(frameLayout.getTag(), ea.a.p("PG1QbGw=", "1oIxOX4B"));
        int i13 = R.dimen.sp_14;
        if (viewGroup != null) {
            ea.a.p("LGhYbGQ=", "QTkNQkwb");
            int childCount = viewGroup.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = viewGroup.getChildAt(i14);
                kotlin.jvm.internal.g.d(childAt, ea.a.p("VGU_QxtpDmQzdBxpB2QzeCk=", "zpPxQSqc"));
                if (childAt instanceof AppCompatTextView) {
                    AppCompatTextView appCompatTextView = (AppCompatTextView) childAt;
                    if (a10) {
                        i12 = R.dimen.sp_12;
                    } else {
                        i12 = R.dimen.sp_14;
                    }
                    kl.h.a(appCompatTextView, 2, i12);
                }
            }
        }
        boolean a11 = kotlin.jvm.internal.g.a(M2().f1562j.getTag(), ea.a.p("Fm0PbGw=", "pAenPl9X"));
        String string = getResources().getString(R.string.arg_res_0x7f13034d);
        kotlin.jvm.internal.g.d(string, ea.a.p("EGUybwdyDGU7LgFlQFMjclFuNSgbLkV0BmkfZ39wLXcHciRkLWIWXy9wEik=", "7LbArowP"));
        int V = kotlin.text.k.V(string, ea.a.p("CFBlLTQ=", "OLyyC8Q6"), 0, false, 6);
        int i15 = V + 5;
        if (V >= 0 && i15 <= string.length()) {
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new StyleSpan(1), V, i15, 33);
            M2().f1562j.setText(spannableString);
        }
        final AppCompatTextView appCompatTextView2 = M2().f1562j;
        kotlin.jvm.internal.g.d(appCompatTextView2, ea.a.p("UWklZBpuBS4Cb0NlG0IvRxBQ", "gTUr5yuj"));
        if (a11) {
            i13 = R.dimen.sp_13;
        }
        kl.h.a(appCompatTextView2, 2, i13);
        Resources resources = getResources();
        if (a11) {
            i10 = R.dimen.dp_24;
        } else {
            i10 = R.dimen.sp_30;
        }
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(i10);
        Resources resources2 = getResources();
        if (a11) {
            i11 = R.dimen.dp_30;
        } else {
            i11 = R.dimen.sp_37;
        }
        final int dimensionPixelSize3 = resources2.getDimensionPixelSize(i11);
        appCompatTextView2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.d
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23) {
                int i24 = SubscriptionAIActivity.X;
                String p10 = ea.a.p("a3RUeA1WXmV3", "fkiPXMcD");
                AppCompatTextView appCompatTextView3 = AppCompatTextView.this;
                kotlin.jvm.internal.g.e(appCompatTextView3, p10);
                Layout layout = appCompatTextView3.getLayout();
                if (layout != null) {
                    if (layout.getLineCount() <= 1) {
                        appCompatTextView3.setBackgroundResource(R.drawable.ai_subscription_gpt_line1_bg);
                        int measuredHeight = appCompatTextView3.getMeasuredHeight();
                        int i25 = dimensionPixelSize2;
                        if (measuredHeight != i25) {
                            ViewGroup.LayoutParams layoutParams4 = appCompatTextView3.getLayoutParams();
                            if (layoutParams4 != null) {
                                ConstraintLayout.b bVar4 = (ConstraintLayout.b) layoutParams4;
                                ((ViewGroup.MarginLayoutParams) bVar4).height = i25;
                                appCompatTextView3.setLayoutParams(bVar4);
                                appCompatTextView3.post(new y0(appCompatTextView3, 29));
                            } else {
                                throw new NullPointerException(ea.a.p("CnU5bHVjEG4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAQeSVldWEfZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdw1kMmUhLjJvJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyBW1z", "fidUUqYt"));
                            }
                        }
                    } else {
                        appCompatTextView3.setBackgroundResource(R.drawable.ai_subscription_gpt_line2_bg);
                        int measuredHeight2 = appCompatTextView3.getMeasuredHeight();
                        int i26 = dimensionPixelSize3;
                        if (measuredHeight2 != i26) {
                            ViewGroup.LayoutParams layoutParams5 = appCompatTextView3.getLayoutParams();
                            if (layoutParams5 != null) {
                                ConstraintLayout.b bVar5 = (ConstraintLayout.b) layoutParams5;
                                ((ViewGroup.MarginLayoutParams) bVar5).height = i26;
                                appCompatTextView3.setLayoutParams(bVar5);
                                appCompatTextView3.post(new z0(appCompatTextView3, 25));
                            } else {
                                throw new NullPointerException(ea.a.p("OnUUbHJjAm4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiAgeQhlcmENZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdz1kH2UmLiBvJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyNW1z", "o8TxRc76"));
                            }
                        }
                    }
                    tf.d dVar = tf.d.f30009a;
                }
            }
        });
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final AppCompatImageView K2() {
        AppCompatImageView appCompatImageView = M2().f1573u;
        kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("UWklZBpuBS4LZVVyOmEgZRBpQkl2", "Ep3Blt5Q"));
        return appCompatImageView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity
    public final TextView L2() {
        TextView textView = M2().f1574v;
        kotlin.jvm.internal.g.d(textView, ea.a.p("UWklZBpuBS4LZVVyOmEgZRBpQlR2", "t34SD71v"));
        return textView;
    }

    public final w M2() {
        return (w) this.V.getValue();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final Space i2() {
        Space space = M2().f1569q;
        kotlin.jvm.internal.g.d(space, ea.a.p("LWlfZBBuUC4ubzpTBWELZQ==", "DkiNKjTn"));
        return space;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseAISubscriptionActivity, pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ea.a.p("XG4IchZhFmU=", "tFHgPaax");
        if (bundle == null) {
            M2().f1568p.j();
        } else {
            M2().f1568p.setProgress(1.0f);
        }
    }
}
