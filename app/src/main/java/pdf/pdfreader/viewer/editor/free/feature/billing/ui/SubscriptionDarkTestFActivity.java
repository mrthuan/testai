package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import am.t1;
import am.v;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.w;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.i;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.widget.BillingIntroduceDetailView;
import pdf.pdfreader.viewer.editor.free.feature.billing.vm.SubscriptionViewModel;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import x0.j0;

/* compiled from: SubscriptionDarkTestFActivity.kt */
/* loaded from: classes3.dex */
public final class SubscriptionDarkTestFActivity extends BaseSubscriptionActivity {

    /* renamed from: a0  reason: collision with root package name */
    public static final /* synthetic */ int f24900a0 = 0;
    public final tf.c S = kotlin.a.a(new cg.a<v>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestFActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final v invoke() {
            View inflate = SubscriptionDarkTestFActivity.this.getLayoutInflater().inflate(R.layout.activity_subscription_dark_test_f, (ViewGroup) null, false);
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
                                i10 = R.id.loadingVS;
                                ViewStub viewStub = (ViewStub) com.google.android.play.core.assetpacks.c.u(inflate, R.id.loadingVS);
                                if (viewStub != null) {
                                    i10 = R.id.month_plan_tv;
                                    TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.month_plan_tv);
                                    if (textView2 != null) {
                                        i10 = R.id.percent_space1;
                                        if (((Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.percent_space1)) != null) {
                                            i10 = R.id.percent_space2;
                                            Space space = (Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.percent_space2);
                                            if (space != null) {
                                                i10 = R.id.percent_space3;
                                                if (((Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.percent_space3)) != null) {
                                                    i10 = R.id.percent_space4;
                                                    if (((Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.percent_space4)) != null) {
                                                        i10 = R.id.percent_space5;
                                                        if (((Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.percent_space5)) != null) {
                                                            i10 = R.id.privacy_policy_tv;
                                                            TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.privacy_policy_tv);
                                                            if (textView3 != null) {
                                                                i10 = R.id.restore_tv;
                                                                TextView textView4 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.restore_tv);
                                                                if (textView4 != null) {
                                                                    i10 = R.id.retainPageContainer;
                                                                    FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.retainPageContainer);
                                                                    if (frameLayout != null) {
                                                                        i10 = R.id.scrollView;
                                                                        BillingIntroduceDetailView billingIntroduceDetailView = (BillingIntroduceDetailView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scrollView);
                                                                        if (billingIntroduceDetailView != null) {
                                                                            i10 = R.id.spike_left_img;
                                                                            if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.spike_left_img)) != null) {
                                                                                i10 = R.id.spike_right_img;
                                                                                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.spike_right_img)) != null) {
                                                                                    i10 = R.id.spike_tv;
                                                                                    TextView textView5 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.spike_tv);
                                                                                    if (textView5 != null) {
                                                                                        i10 = R.id.subscription_title_tv;
                                                                                        TextView textView6 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.subscription_title_tv);
                                                                                        if (textView6 != null) {
                                                                                            i10 = R.id.term_of_use_tv;
                                                                                            TextView textView7 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.term_of_use_tv);
                                                                                            if (textView7 != null) {
                                                                                                i10 = R.id.top_space;
                                                                                                Space space2 = (Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.top_space);
                                                                                                if (space2 != null) {
                                                                                                    i10 = R.id.year_plan_layout;
                                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.year_plan_layout);
                                                                                                    if (constraintLayout != null) {
                                                                                                        i10 = R.id.year_plan_save_tv;
                                                                                                        TextView textView8 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.year_plan_save_tv);
                                                                                                        if (textView8 != null) {
                                                                                                            i10 = R.id.year_plan_tv;
                                                                                                            TextView textView9 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.year_plan_tv);
                                                                                                            if (textView9 != null) {
                                                                                                                i10 = R.id.year_save_tip_iv;
                                                                                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.year_save_tip_iv);
                                                                                                                if (appCompatImageView2 != null) {
                                                                                                                    i10 = R.id.year_save_tip_tv;
                                                                                                                    TextView textView10 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.year_save_tip_tv);
                                                                                                                    if (textView10 != null) {
                                                                                                                        return new v((ConstraintLayout) inflate, appCompatImageView, lottieAnimationView, textView, viewStub, textView2, space, textView3, textView4, frameLayout, billingIntroduceDetailView, textView5, textView6, textView7, space2, constraintLayout, textView8, textView9, appCompatImageView2, textView10);
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
            throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpRGhsSQk6IA==", "0LMF3wfb").concat(inflate.getResources().getResourceName(i10)));
        }
    });
    public t1 T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* compiled from: SubscriptionDarkTestFActivity.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24901a;

        static {
            int[] iArr = new int[SubscriptionType.values().length];
            try {
                iArr[SubscriptionType.MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionType.YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubscriptionType.YEAR_TRIAL_3D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SubscriptionType.YEAR_TRIAL_7D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SubscriptionType.YEAR_TRIAL_14D.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f24901a = iArr;
        }
    }

    /* compiled from: SubscriptionDarkTestFActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f24903e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f24904f;

        public b(String str, String str2) {
            this.f24903e = str;
            this.f24904f = str2;
        }

        @Override // oo.a
        public final void a() {
            SubscriptionType subscriptionType;
            Context m10 = ReaderPdfApplication.m();
            String p10 = ea.a.p("WGFw", "7I1khYtO");
            String p11 = ea.a.p("WmE7chZ0A2kcX0d0CHIiXydsW2Nr", "4KSqyAqJ");
            SubscriptionDarkTestFActivity subscriptionDarkTestFActivity = SubscriptionDarkTestFActivity.this;
            String str = this.f24903e;
            String str2 = this.f24904f;
            tn.a.d(m10, p10, p11, subscriptionDarkTestFActivity.g2(str, str2, false), false);
            tn.a.d(ReaderPdfApplication.m(), ea.a.p("BGFw", "llm7bRiW"), ea.a.p("J2EBcjJ0E2kmXxV0VXIjX1tsO2Nr", "IWNqWrbk"), subscriptionDarkTestFActivity.g2(str, str2, true), false);
            if (subscriptionDarkTestFActivity.C) {
                subscriptionType = SubscriptionType.YEAR_TRIAL_7D;
            } else {
                subscriptionType = SubscriptionType.YEAR_TRIAL_14D;
            }
            subscriptionDarkTestFActivity.J = subscriptionType;
            subscriptionDarkTestFActivity.w2(subscriptionType, str);
        }

        @Override // androidx.fragment.app.w, oo.a
        public final void cancel() {
            Context m10 = ReaderPdfApplication.m();
            String p10 = ea.a.p("JmFw", "PncUOCN6");
            String p11 = ea.a.p("WmE7chZ0A2kcX1hlCHYzXydsW2Nr", "dlc0duhn");
            SubscriptionDarkTestFActivity subscriptionDarkTestFActivity = SubscriptionDarkTestFActivity.this;
            String str = this.f24903e;
            String str2 = this.f24904f;
            tn.a.d(m10, p10, p11, subscriptionDarkTestFActivity.g2(str, str2, false), false);
            tn.a.d(ReaderPdfApplication.m(), ea.a.p("JmFw", "ccWxK31R"), ea.a.p("A2EccjV0FWkmXwplVXYyX1tsO2Nr", "94jlPtpo"), subscriptionDarkTestFActivity.g2(str, str2, true), false);
            subscriptionDarkTestFActivity.finish();
        }
    }

    static {
        ea.a.p("YHUpcxByC3AGaVtuLWEkaxBlQXRG", "WjXVXSc0");
    }

    public final void B2() {
        if (C2().f1512b.getVisibility() != 0 && hasWindowFocus()) {
            C2().f1512b.postDelayed(new androidx.activity.b(this, 29), c1.c(this));
        }
    }

    public final v C2() {
        return (v) this.S.getValue();
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = C2().f1511a;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4Ab1t0", "oIEaqOrJ"));
        return constraintLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    @Override // jl.a
    public final int F1() {
        return -16645881;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a
    public final void K1() {
        int i10;
        super.K1();
        Group group = (Group) C2().f1520k.findViewById(R.id.aiGroup);
        boolean z10 = false;
        if (this.C) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        group.setVisibility(i10);
        final int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dp_20);
        C2().f1520k.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.j
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                Object next;
                int i19 = SubscriptionDarkTestFActivity.f24900a0;
                String p10 = ea.a.p("PGgsc0cw", "gDHEcvcc");
                SubscriptionDarkTestFActivity subscriptionDarkTestFActivity = SubscriptionDarkTestFActivity.this;
                kotlin.jvm.internal.g.e(subscriptionDarkTestFActivity, p10);
                if (view != null) {
                    BillingIntroduceDetailView billingIntroduceDetailView = subscriptionDarkTestFActivity.C2().f1520k;
                    kotlin.jvm.internal.g.d(billingIntroduceDetailView, ea.a.p("UWklZBpuBS4BY0ZvBWwAaSF3", "zrMAT5qg"));
                    j0 j0Var = new j0(billingIntroduceDetailView);
                    if (!j0Var.hasNext()) {
                        next = null;
                    } else {
                        next = j0Var.next();
                    }
                    View view2 = (View) next;
                    if (view2 != null) {
                        view.getMeasuredHeight();
                        view2.getMeasuredHeight();
                        subscriptionDarkTestFActivity.C2().f1516g.getMeasuredHeight();
                        if (view.getMeasuredHeight() > view2.getMeasuredHeight()) {
                            BillingIntroduceDetailView billingIntroduceDetailView2 = subscriptionDarkTestFActivity.C2().f1520k;
                            kotlin.jvm.internal.g.d(billingIntroduceDetailView2, ea.a.p("LWlaZFBuBS47YxRvWGwBaV13", "P2O49bH3"));
                            ViewGroup.LayoutParams layoutParams = billingIntroduceDetailView2.getLayoutParams();
                            if (layoutParams != null) {
                                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                                ((ViewGroup.MarginLayoutParams) bVar).height = view2.getMeasuredHeight();
                                billingIntroduceDetailView2.setLayoutParams(bVar);
                                Space space = subscriptionDarkTestFActivity.C2().f1516g;
                                kotlin.jvm.internal.g.d(space, ea.a.p("LWlfZBBuUC4qZThjEG4cU0VhDWUy", "DMOQJyrT"));
                                ViewGroup.LayoutParams layoutParams2 = space.getLayoutParams();
                                if (layoutParams2 != null) {
                                    ConstraintLayout.b bVar2 = (ConstraintLayout.b) layoutParams2;
                                    ((ViewGroup.MarginLayoutParams) bVar2).height = (view.getMeasuredHeight() + dimensionPixelSize) - view2.getMeasuredHeight();
                                    space.setLayoutParams(bVar2);
                                    view.post(new g9.e(subscriptionDarkTestFActivity, view2.getMeasuredHeight(), 3));
                                    return;
                                }
                                throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuHm4dbjFsIyBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQdYUlvMXRhd1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTBB5X3UwUC5yUm1z", "q0DOnfaH"));
                            }
                            throw new NullPointerException(ea.a.p("G3UtbGJjJ24mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiABeTFlYmEoZDpvD2RMLjRvVnMmcihpWHQYYQhvJHRsdxxkJmU2LgVvJnMSclVpOXR0YStvPHQYTBV5HnUlUCNyFG1z", "iOuABFH9"));
                        }
                    }
                }
            }
        });
        C2().f1521l.addOnLayoutChangeListener(new k(this, 0));
        C2().f1522m.addOnLayoutChangeListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.b(this, 2));
        C2().f1523n.getPaint().setFlags(C2().f1523n.getPaintFlags() | 8);
        C2().f1517h.getPaint().setFlags(C2().f1517h.getPaintFlags() | 8);
        C2().c.j();
        C2().f1512b.setOnClickListener(new d9.f(this, 6));
        C2().f1518i.setOnClickListener(new qb.j0(this, 5));
        C2().f1513d.setOnClickListener(new f5.d(this, 7));
        C2().f1523n.setOnClickListener(new f5.e(this, 5));
        C2().f1517h.setOnClickListener(new k9.c(this, 4));
        C2().f1525p.setOnClickListener(new u4.g(this, 5));
        C2().f1515f.setOnClickListener(new u4.j(this, 7));
        C2().f1514e.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.l
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view) {
                int i11 = SubscriptionDarkTestFActivity.f24900a0;
                String p10 = ea.a.p("R2gic1cw", "4NNETaOx");
                SubscriptionDarkTestFActivity subscriptionDarkTestFActivity = SubscriptionDarkTestFActivity.this;
                kotlin.jvm.internal.g.e(subscriptionDarkTestFActivity, p10);
                subscriptionDarkTestFActivity.W = true;
                t1 a10 = t1.a(view);
                a10.f1467b.setOnClickListener(new h(1));
                TextView textView = (TextView) a10.f1469e;
                i.a aVar = i.f24934a;
                Context context = textView.getContext();
                kotlin.jvm.internal.g.d(context, ea.a.p("D3RUcwVhI3QcdkhjW24jZUB0", "e1fzqQcy"));
                String string = subscriptionDarkTestFActivity.getString(R.string.arg_res_0x7f13049c, ea.a.p("Mw==", "k24PZWHb"));
                kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHMyYTF0F3kHdT5fDnJWZRR0AWkDbC0xGCBLM3Qp", "HhLhOB5g"));
                TextPaint paint = textView.getPaint();
                kotlin.jvm.internal.g.d(paint, ea.a.p("WnRlcwdhEHQmdhpwCGk4dA==", "PavJXw1C"));
                aVar.getClass();
                textView.setText(i.a.c(context, string, paint));
                ((LottieAnimationView) a10.c).j();
                subscriptionDarkTestFActivity.T = a10;
            }
        });
        if (!this.c) {
            j2();
            if (SubscriptionViewModel.h(this.f24891y) && m2() && !this.Y) {
                no.f.b(this).getClass();
                if (no.f.d(this) && c1.K(this)) {
                    z10 = true;
                }
            }
            if (z10) {
                C2().f1514e.inflate();
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a
    public final void L1() {
        super.L1();
        t0.d0(b.b.x(this), null, null, new SubscriptionDarkTestFActivity$initViewModel$1(this, null), 3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x032f, code lost:
        if (r5.equals(ea.a.p("Q2EsZSxwBmYtdFtfHm8kZA==", "6pkJbyS2")) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0333, code lost:
        tn.a.a(pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.m(), ea.a.p("UG85ZSxwFm93", "eK8F0pEJ"));
        r2.setClass(r13, pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0355, code lost:
        if (r5.equals(ea.a.p("SWExZWZwGWU-aQN3a28xZlFjZQ==", "ok9V9kyI")) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0359, code lost:
        r2.setClass(r13, pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x036c, code lost:
        if (r5.equals(ea.a.p("AmEQZSdwImU-aQN3a3AzZg==", "qfrwxPPM")) != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0370, code lost:
        r2.setClass(r13, pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0383, code lost:
        if (r5.equals(ea.a.p("Q2EsZSxwBmYtdFtfAG03Z2U=", "G0cNXCt3")) != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0387, code lost:
        tn.a.a(pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.m(), ea.a.p("Im8ZZTxwLW9p", "M9AkcYQh"));
        ge.a.q(r1, r2, ea.a.p("WnMUbBxuBV8bbVVnZQ==", "qxK5qgYG"));
        r2.setClass(r13, pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x03af, code lost:
        if (r5.equals(ea.a.p("Q2EsZSx3DXIWX0BvNnAyZg==", "RP15xyOH")) != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x03b2, code lost:
        tn.a.a(pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.m(), ea.a.p("Cm9BZSh3Im9w", "tki3wVKH"));
        r2.setClass(r13, pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x03d5, code lost:
        if (r5.equals(ea.a.p("RGEiZWtwCWYXdAlfWG85Z2dpP2EuZQ==", "zY4E4m9I")) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03d8, code lost:
        tn.a.a(pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.m(), ea.a.p("LG9DZSZwQ29s", "chZelwmf"));
        ge.a.q(r1, r2, ea.a.p("WnMUbBxuBV8bbVVnZQ==", "5yRGVEqJ"));
        r2.setClass(r13, pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.Pdf2ImagePicPreviewActivity.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x012a, code lost:
        if (r0.equals(ea.a.p("FGEJZSpoAm0tXxZwdA==", "qYdnumJr")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013a, code lost:
        if (r0.equals(ea.a.p("F2FfZSxoOG0tXxZkZg==", "Zeg8sWz7")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014a, code lost:
        if (r0.equals(ea.a.p("P2FWZSZoWG0_Xz5vGmxz", "OVjw2cmu")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x015a, code lost:
        if (r0.equals(ea.a.p("P2FWZSZoWG0_Xy94FmVs", "jVXVZTTc")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x016a, code lost:
        if (r0.equals(ea.a.p("Q2EsZSx3C2QVZUBfDGQ_dA==", "Y6cUGO0F")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x017a, code lost:
        if (r0.equals(ea.a.p("Q2EsZSxoDW0XX0NvG2Q=", "Tp3jPN5g")) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0189, code lost:
        if (r0.equals(ea.a.p("Q2EsZSxoDW0XX1ZvBms7YTZr", "kJXHSwUU")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0199, code lost:
        if (r0.equals(ea.a.p("Q2EsZSxoDW0XX1VsBV8waShl", "KRNIa6QS")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01aa, code lost:
        if (r0.equals(ea.a.p("P2FWZSZ3XmQ9ZT5fBmMJbgdwCmY=", "v2zXLxtf")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ba, code lost:
        if (r0.equals(ea.a.p("Q2EsZSxzB2EAY2g=", "1raDZ96x")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ca, code lost:
        if (r0.equals(ea.a.p("Q2EsZSx3C2QVZUBfAG0xMjRkZg==", "Y9x5R1AY")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
        if (r0.equals(ea.a.p("Q2EsZSxoDW0XX0ZlCmU4dA==", "6q9CHUaO")) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01de, code lost:
        r2.setClass(r13, pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity.class);
        ea.a.p("X28oYR9JDHQXbnQ=", "LCrtizaw");
        ge.a.s(r1, r2, ea.a.p("P2FWZSZ0bw==", "IkRb4AZ1"));
        ge.a.s(r1, r2, ea.a.p("VXIkbQ==", "xBA4JaJB"));
        ge.a.s(r1, r2, ea.a.p("Q2EsZSxmEG8fMg==", "kTuS10G8"));
        startActivity(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x023d, code lost:
        if (r5.equals(ea.a.p("P2FWZSZwU2YFdCVfAm8aZA==", "4VPxE3cU")) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x024d, code lost:
        if (r5.equals(ea.a.p("Q2EsZSxwEGUEaVF3Nm8wZi1jZQ==", "8NgkUf5A")) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x025e, code lost:
        if (r5.equals(ea.a.p("OGEKZRhwQ2U-aQN3a3AzZg==", "zZHmG19P")) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x026f, code lost:
        if (r5.equals(ea.a.p("P2FWZSZwU2YFdCVfHG0JZ2U=", "vUu6KoYY")) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02c8, code lost:
        if (r5.equals(ea.a.p("P2FWZSZ3WHI-Xz5vKnAMZg==", "meJYbBbs")) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02d8, code lost:
        if (r5.equals(ea.a.p("P2FWZSZwU2YFdCVfGW8GZ2ppA2EiZQ==", "ofheEp6G")) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02dc, code lost:
        r2.setAction(ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhVJFlc=", "SBIpXOKv"));
        ea.a.p("X28oYR9JDHQXbnQ=", "E8m3Mz07");
        ge.a.r(r1, r2, ea.a.p("JGVIXw1oXnI-XzloFHJl", "6klgD6cb"));
        ge.a.q(r1, r2, ea.a.p("JGVIXw1oXnI-XzloFHINX0BpMXMxYRFl", "b3kBmvbX"));
        ge.a.s(r1, r2, ea.a.p("VXIkbQ==", "KJzGHSMy"));
        ge.a.s(r1, r2, ea.a.p("O3lBZT1lRGMOZTJ0", "hyeBpcos"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x031e, code lost:
        switch(r5.hashCode()) {
            case -2057610273: goto L74;
            case -1156599213: goto L71;
            case 346516212: goto L68;
            case 1138557515: goto L65;
            case 1383514819: goto L62;
            case 2089807441: goto L59;
            default: goto L77;
        };
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void finish() {
        /*
            Method dump skipped, instructions count: 1164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestFActivity.finish():void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final Space i2() {
        Space space = C2().f1524o;
        kotlin.jvm.internal.g.d(space, ea.a.p("LWlfZBBuUC4ubzpTBWELZQ==", "jsn4XiT6"));
        return space;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final boolean k2() {
        return false;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        if (getIntent().hasExtra(ea.a.p("JGEiZW5mRm8lMg==", "HoTE14Xe")) && TextUtils.equals(getIntent().getStringExtra(ea.a.p("Q2EsZSxmEG8fMg==", "2pZvCBSN")), ea.a.p("KmE2ZRxsM24vdQdnUV80aFdvIWU=", "tpZQCRj7"))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y = z10;
        super.onCreate(bundle);
        ea.a.p("C24VcgxhQGU=", "FWdVi4oH");
        this.f19294h = true;
        Window window = getWindow();
        kotlin.jvm.internal.g.d(window, ea.a.p("OGlfZBZ3", "WkPts3MJ"));
        pdf.pdfreader.viewer.editor.free.utils.extension.i.b(window, false);
        Window window2 = getWindow();
        kotlin.jvm.internal.g.d(window2, ea.a.p("RGklZBx3", "ak1wSbV5"));
        pdf.pdfreader.viewer.editor.free.utils.extension.i.a(window2, false);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        LottieAnimationView lottieAnimationView;
        super.onWindowFocusChanged(z10);
        j2().o(z10);
        if (z10) {
            if (this.W) {
                t1 t1Var = this.T;
                if (t1Var != null && (lottieAnimationView = (LottieAnimationView) t1Var.c) != null) {
                    lottieAnimationView.j();
                }
                t0.d0(b.b.x(this), null, null, new SubscriptionDarkTestFActivity$onWindowFocusChanged$1(this, null), 3);
            } else if (C2().f1512b.getVisibility() != 0) {
                B2();
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final void p2() {
        boolean f10;
        Object obj;
        boolean z10;
        if (this.W) {
            return;
        }
        s2();
        SubscriptionViewModel j22 = j2();
        boolean z11 = this.C;
        if (z11) {
            f10 = j22.g(this.f24891y);
        } else {
            f10 = j22.f(this.f24891y);
        }
        if (m2() && !this.f24892z && f10) {
            Iterator<T> it = j2().e(this.f24891y).c.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    ol.i iVar = (ol.i) obj;
                    if (!z11 ? iVar.f23489a == SubscriptionType.YEAR_TRIAL_14D : iVar.f23489a == SubscriptionType.YEAR_TRIAL_7D) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            ol.i iVar2 = (ol.i) obj;
            if (iVar2 != null) {
                String p10 = ea.a.p("UGwkc2U=", "MoEnj5Lf");
                String str = iVar2.f23491d;
                b bVar = new b(p10, str);
                if (l2()) {
                    pdf.pdfreader.viewer.editor.free.feature.billing.dialog.a aVar = new pdf.pdfreader.viewer.editor.free.feature.billing.dialog.a(this, iVar2.f23491d, iVar2.c, iVar2.f23492e);
                    aVar.f23542t = bVar;
                    aVar.show();
                } else {
                    pdf.pdfreader.viewer.editor.free.feature.billing.dialog.b bVar2 = new pdf.pdfreader.viewer.editor.free.feature.billing.dialog.b(this, str, iVar2.c);
                    bVar2.f23542t = bVar;
                    bVar2.show();
                }
                this.f24892z = true;
                tn.a.d(this, ea.a.p("WmFw", "fPx5IFqF"), ea.a.p("E2EYchV0CmkmXxVoW3c=", "7MzhpkiL"), g2(p10, str, false), false);
                tn.a.d(this, ea.a.p("K2Fw", "BpBN7k6s"), ea.a.p("WmE7chZ0A2kcX0doBnc=", "0GhQE62V"), g2(p10, str, true), false);
                return;
            }
        }
        finish();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final void q2(boolean z10, boolean z11) {
        int i10;
        int i11;
        C2().f1525p.setSelected(z10);
        C2().f1515f.setSelected(!z10);
        AppCompatImageView appCompatImageView = C2().f1528s;
        int i12 = 0;
        if (z10 && z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        appCompatImageView.setVisibility(i10);
        TextView textView = C2().f1529t;
        if (z10 && z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        TextView textView2 = C2().f1527r;
        if (!z11) {
            i12 = 8;
        }
        textView2.setVisibility(i12);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final void u2(ol.d info) {
        kotlin.jvm.internal.g.e(info, "info");
        TextView textView = C2().f1529t;
        String string = getString(R.string.arg_res_0x7f13034e, info.f23477b);
        textView.setText(string + " ");
        for (ol.i iVar : info.c) {
            int i10 = a.f24901a[iVar.f23489a.ordinal()];
            String str = iVar.c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        C2().f1527r.setText(getString(R.string.arg_res_0x7f13057d, str));
                        C2().f1526q.setText(getString(R.string.arg_res_0x7f1300e1, iVar.f23491d));
                    }
                } else {
                    C2().f1526q.setText(getString(R.string.arg_res_0x7f130263, str));
                }
            } else {
                C2().f1515f.setText(getString(R.string.arg_res_0x7f130268, str));
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final void z2(String str, boolean z10) {
        int i10;
        boolean z11 = !z10;
        if (z10) {
            i10 = R.drawable.ic_subscription_positive;
        } else {
            i10 = R.drawable.ic_subscription_negative;
        }
        j1.i(this, str, z11, i10);
    }

    @Override // jl.a
    public final void C1() {
    }

    @Override // jl.a
    public final void J1(Bundle bundle) {
    }
}
