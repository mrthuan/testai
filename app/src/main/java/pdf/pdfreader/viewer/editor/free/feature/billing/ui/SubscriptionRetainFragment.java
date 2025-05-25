package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import am.c1;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.u;
import androidx.fragment.app.y0;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o0;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.base.BaseVMFragment;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.state.SubscriptionRetainPage;
import pdf.pdfreader.viewer.editor.free.feature.billing.vm.SubscriptionViewModel;
import pdf.pdfreader.viewer.editor.free.widget.scroll.ReaderNestedScrollView;

/* compiled from: SubscriptionRetainFragment.kt */
/* loaded from: classes3.dex */
public final class SubscriptionRetainFragment extends BaseVMFragment<c1> {

    /* renamed from: f0  reason: collision with root package name */
    public static final String f24912f0;

    /* renamed from: g0  reason: collision with root package name */
    public static final String f24913g0;

    /* renamed from: h0  reason: collision with root package name */
    public static final String f24914h0;

    /* renamed from: i0  reason: collision with root package name */
    public static final String f24915i0;

    /* renamed from: c0  reason: collision with root package name */
    public final k0 f24916c0 = y0.a(this, kotlin.jvm.internal.i.a(SubscriptionViewModel.class), new cg.a<o0>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionRetainFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final o0 invoke() {
            o0 viewModelStore = Fragment.this.f0().getViewModelStore();
            kotlin.jvm.internal.g.d(viewModelStore, ea.a.p("S2UCdS1yJ0ErdA92XXQuKBEuJGksd3tvEGUdUyVvMGU=", "CD9sDBw9"));
            return viewModelStore;
        }
    }, new cg.a<n1.a>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionRetainFragment$special$$inlined$activityViewModels$default$2
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // cg.a
        public final n1.a invoke() {
            n1.a aVar;
            cg.a aVar2 = cg.a.this;
            if (aVar2 == null || (aVar = (n1.a) aVar2.invoke()) == null) {
                n1.a defaultViewModelCreationExtras = this.f0().getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.g.d(defaultViewModelCreationExtras, ea.a.p("QWU6dRpyB0ERdF12AHQvKG0uVmUgYTZsM1ZaZUZNDmRWbAhyFmEWaR1ucXgdcjdz", "G31azVgG"));
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    }, new cg.a<m0.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionRetainFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final m0.b invoke() {
            m0.b defaultViewModelProviderFactory = Fragment.this.f0().getDefaultViewModelProviderFactory();
            kotlin.jvm.internal.g.d(defaultViewModelProviderFactory, ea.a.p("QWU6dRpyB0ERdF12AHQvKG0uVmUgYTZsFVZbZUdNIGRWbBtyHHYLZBdycmEKdDlyeQ==", "a20OZaKA"));
            return defaultViewModelProviderFactory;
        }
    });

    /* renamed from: d0  reason: collision with root package name */
    public String f24917d0 = "";

    /* renamed from: e0  reason: collision with root package name */
    public String f24918e0 = "";

    static {
        ea.a.p("YXUqc1RyMXA8aQluZmUjYVFu", "il2H7Xv6");
        ea.a.p("DGFfYxxsUmQJdShzFnIBcEFpAW4XZRFhW24=", "Nco82WVs");
        f24912f0 = ea.a.p("AWUbX1dyAWUXdBRpVWwIcF1yO29k", "6qjb1d2l");
        f24913g0 = ea.a.p("MWU_Xx5yUGNl", "kMZFn9Qz");
        f24914h0 = ea.a.p("WmUtX0lsIG4=", "oo1T9Asf");
        f24915i0 = ea.a.p("WGUyXxpzPWITY19fGXIzczdlZA==", "LmHQzE5G");
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final c1 p0(LayoutInflater inflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.g.e(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.fragment_subscription_retain, viewGroup, false);
        int i10 = R.id.cancel_tv;
        TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.cancel_tv);
        if (textView != null) {
            i10 = R.id.close_img;
            AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.close_img);
            if (appCompatImageView != null) {
                i10 = R.id.continue_anim;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.continue_anim);
                if (lottieAnimationView != null) {
                    i10 = R.id.continue_tv;
                    TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.continue_tv);
                    if (textView2 != null) {
                        i10 = R.id.free_day_tv;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.free_day_tv);
                        if (appCompatTextView != null) {
                            i10 = R.id.iv_step_1;
                            if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_step_1)) != null) {
                                i10 = R.id.iv_step_1_line;
                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_step_1_line)) != null) {
                                    i10 = R.id.iv_step_2;
                                    if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_step_2)) != null) {
                                        i10 = R.id.iv_step_2_line;
                                        if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_step_2_line)) != null) {
                                            i10 = R.id.iv_step_3;
                                            if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_step_3)) != null) {
                                                i10 = R.id.price_hint_tv;
                                                AppCompatTextView appCompatTextView2 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.price_hint_tv);
                                                if (appCompatTextView2 != null) {
                                                    i10 = R.id.restore_tv;
                                                    TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.restore_tv);
                                                    if (textView3 != null) {
                                                        i10 = R.id.scrollView;
                                                        if (((ReaderNestedScrollView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scrollView)) != null) {
                                                            i10 = R.id.spike_left_img;
                                                            if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.spike_left_img)) != null) {
                                                                i10 = R.id.spike_right_img;
                                                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.spike_right_img)) != null) {
                                                                    i10 = R.id.spike_tv;
                                                                    if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.spike_tv)) != null) {
                                                                        i10 = R.id.subscription_title_tv;
                                                                        TextView textView4 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscription_title_tv);
                                                                        if (textView4 != null) {
                                                                            i10 = R.id.topGuideline;
                                                                            if (((Guideline) com.google.android.play.core.assetpacks.c.u(inflate, R.id.topGuideline)) != null) {
                                                                                i10 = R.id.top_space;
                                                                                Space space = (Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.top_space);
                                                                                if (space != null) {
                                                                                    i10 = R.id.tv_step_1_content;
                                                                                    if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_step_1_content)) != null) {
                                                                                        i10 = R.id.tv_step_1_title;
                                                                                        if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_step_1_title)) != null) {
                                                                                            i10 = R.id.tv_step_2_content;
                                                                                            if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_step_2_content)) != null) {
                                                                                                i10 = R.id.tv_step_2_title;
                                                                                                if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_step_2_title)) != null) {
                                                                                                    i10 = R.id.tv_step_3_content;
                                                                                                    if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_step_3_content)) != null) {
                                                                                                        i10 = R.id.tv_step_3_title;
                                                                                                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_step_3_title);
                                                                                                        if (appCompatTextView3 != null) {
                                                                                                            c1 c1Var = new c1((ConstraintLayout) inflate, textView, appCompatImageView, lottieAnimationView, textView2, appCompatTextView, appCompatTextView2, textView3, textView4, space, appCompatTextView3);
                                                                                                            ea.a.p("Wm4tbBJ0BygbblJsCHQzcmggUW8odCJpB2VFLFlmDmxAZSk=", "i7yoJSxF");
                                                                                                            return c1Var;
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
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpJmhkSXw6IA==", "CJVBRD8P").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void r0() {
        final String str;
        Object obj;
        String str2;
        String str3;
        String str4;
        Bundle bundle = this.f3674g;
        final Boolean bool = null;
        if (bundle != null) {
            str = bundle.getString(f24912f0);
        } else {
            str = null;
        }
        Bundle bundle2 = this.f3674g;
        if (bundle2 != null) {
            obj = bundle2.getString(f24913g0);
        } else {
            obj = null;
        }
        Bundle bundle3 = this.f3674g;
        if (bundle3 != null) {
            str2 = bundle3.getString(f24914h0);
        } else {
            str2 = null;
        }
        Bundle bundle4 = this.f3674g;
        if (bundle4 != null) {
            bool = Boolean.valueOf(bundle4.getBoolean(f24915i0, false));
        }
        if (str != null && obj != null && str2 != null && bool != null) {
            this.f24917d0 = str;
            if (bool.booleanValue()) {
                str3 = "M2wXc2U=";
                str4 = "7MPxJtfs";
            } else {
                str3 = "KG88cDV5";
                str4 = "F4FHT8WF";
            }
            this.f24918e0 = ea.a.p(str3, str4);
            VB vb2 = this.Y;
            kotlin.jvm.internal.g.b(vb2);
            ((c1) vb2).f785a.setOnClickListener(new q(0));
            u i10 = i();
            if (i10 != null) {
                VB vb3 = this.Y;
                kotlin.jvm.internal.g.b(vb3);
                String p10 = ea.a.p("LWlfZBBuUC4ubzpTBWELZQ==", "gX62IUBf");
                Space space = ((c1) vb3).f793j;
                kotlin.jvm.internal.g.d(space, p10);
                ViewGroup.LayoutParams layoutParams = space.getLayoutParams();
                if (layoutParams != null) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                    ((ViewGroup.MarginLayoutParams) bVar).height = pdf.pdfreader.viewer.editor.free.utils.extension.a.a(i10);
                    space.setLayoutParams(bVar);
                } else {
                    throw new NullPointerException(ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuNm5qbjFsCSA7eUFlWWFZZChvI2QNLgtvW3MaciRpC3Q1YT5vMXRLdyZkVmUNLnRvNHM-chRpBnR5YRdvMHRLTDh5KHUwUARyLm1z", "zEdRYGDe"));
                }
            }
            t0().n(str, bool.booleanValue());
            if (TextUtils.equals(str2, ea.a.p("eDI=", "hdBSp7gF"))) {
                VB vb4 = this.Y;
                kotlin.jvm.internal.g.b(vb4);
                ((c1) vb4).f787d.j();
            }
            VB vb5 = this.Y;
            kotlin.jvm.internal.g.b(vb5);
            ((c1) vb5).f792i.addOnLayoutChangeListener(new pdf.pdfreader.viewer.editor.free.feature.ai.widget.b(this, 1));
            VB vb6 = this.Y;
            kotlin.jvm.internal.g.b(vb6);
            ((c1) vb6).f794k.setText(y(R.string.arg_res_0x7f1300e0, str));
            VB vb7 = this.Y;
            kotlin.jvm.internal.g.b(vb7);
            ((c1) vb7).f789f.setText(y(R.string.arg_res_0x7f1304ea, str));
            VB vb8 = this.Y;
            kotlin.jvm.internal.g.b(vb8);
            ((c1) vb8).f790g.setText(y(R.string.arg_res_0x7f1304cf, obj));
            VB vb9 = this.Y;
            kotlin.jvm.internal.g.b(vb9);
            String p11 = ea.a.p("FWk-ZCZuAS4rbAlzUUk6Zw==", "qlwPOfbV");
            AppCompatImageView appCompatImageView = ((c1) vb9).c;
            kotlin.jvm.internal.g.d(appCompatImageView, p11);
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionRetainFragment$initView$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                    invoke2(view);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    if (bool.booleanValue()) {
                        SubscriptionRetainFragment subscriptionRetainFragment = this;
                        String str5 = SubscriptionRetainFragment.f24912f0;
                        subscriptionRetainFragment.t0().j(SubscriptionRetainPage.FREE_TRIAL_RETAIN);
                        return;
                    }
                    SubscriptionRetainFragment subscriptionRetainFragment2 = this;
                    String str6 = SubscriptionRetainFragment.f24912f0;
                    subscriptionRetainFragment2.t0().m(this);
                }
            });
            VB vb10 = this.Y;
            kotlin.jvm.internal.g.b(vb10);
            String p12 = ea.a.p("LWlfZBBuUC4oZTl0GnINVHY=", "VLwbFAIJ");
            TextView textView = ((c1) vb10).f791h;
            kotlin.jvm.internal.g.d(textView, p12);
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionRetainFragment$initView$5
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                    invoke2(view);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    SubscriptionRetainFragment subscriptionRetainFragment = SubscriptionRetainFragment.this;
                    String str5 = SubscriptionRetainFragment.f24912f0;
                    subscriptionRetainFragment.t0().k();
                }
            });
            VB vb11 = this.Y;
            kotlin.jvm.internal.g.b(vb11);
            String p13 = ea.a.p("NmlZZDFuLC4rbwh0XW4iZWx2", "19T7XKZf");
            TextView textView2 = ((c1) vb11).f788e;
            kotlin.jvm.internal.g.d(textView2, p13);
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView2, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionRetainFragment$initView$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                    invoke2(view);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    SubscriptionRetainFragment subscriptionRetainFragment = SubscriptionRetainFragment.this;
                    String str5 = SubscriptionRetainFragment.f24912f0;
                    subscriptionRetainFragment.t0().l(SubscriptionRetainFragment.this, str, bool.booleanValue());
                }
            });
            VB vb12 = this.Y;
            kotlin.jvm.internal.g.b(vb12);
            String p14 = ea.a.p("UWklZBpuBS4RYVpjDGwCdg==", "PvATSDnk");
            TextView textView3 = ((c1) vb12).f786b;
            kotlin.jvm.internal.g.d(textView3, p14);
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView3, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionRetainFragment$initView$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ tf.d invoke(View view) {
                    invoke2(view);
                    return tf.d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    if (bool.booleanValue()) {
                        SubscriptionRetainFragment subscriptionRetainFragment = this;
                        String str5 = SubscriptionRetainFragment.f24912f0;
                        subscriptionRetainFragment.t0().j(SubscriptionRetainPage.FREE_TRIAL_RETAIN);
                        return;
                    }
                    SubscriptionRetainFragment subscriptionRetainFragment2 = this;
                    String str6 = SubscriptionRetainFragment.f24912f0;
                    subscriptionRetainFragment2.t0().m(this);
                }
            });
            return;
        }
        t0().j(SubscriptionRetainPage.FREE_TRIAL_RETAIN);
    }

    public final SubscriptionViewModel t0() {
        return (SubscriptionViewModel) this.f24916c0.getValue();
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void s0() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.base.BaseVMFragment
    public final void q0(Bundle bundle) {
    }
}
