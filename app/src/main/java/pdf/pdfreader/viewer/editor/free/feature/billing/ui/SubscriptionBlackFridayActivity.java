package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import am.t1;
import am.u;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.billing.SubscriptionType;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.widget.BillingIntroduceDetailView;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: SubscriptionBlackFridayActivity.kt */
/* loaded from: classes3.dex */
public final class SubscriptionBlackFridayActivity extends BaseSubscriptionActivity {

    /* renamed from: a0  reason: collision with root package name */
    public static final /* synthetic */ int f24898a0 = 0;
    public final tf.c S = kotlin.a.a(new cg.a<u>() { // from class: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionBlackFridayActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final u invoke() {
            View inflate = SubscriptionBlackFridayActivity.this.getLayoutInflater().inflate(R.layout.activity_subscription_black_friday, (ViewGroup) null, false);
            int i10 = R.id.bottom_split_line;
            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.bottom_split_line)) != null) {
                i10 = R.id.cancel_tv;
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
                                i10 = R.id.loadingVS;
                                ViewStub viewStub = (ViewStub) com.google.android.play.core.assetpacks.c.u(inflate, R.id.loadingVS);
                                if (viewStub != null) {
                                    i10 = R.id.percent_space1;
                                    if (((Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.percent_space1)) != null) {
                                        i10 = R.id.percent_space2;
                                        if (((Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.percent_space2)) != null) {
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
                                                                i10 = R.id.scrollView;
                                                                if (((BillingIntroduceDetailView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scrollView)) != null) {
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
                                                                                        Space space = (Space) com.google.android.play.core.assetpacks.c.u(inflate, R.id.top_space);
                                                                                        if (space != null) {
                                                                                            i10 = R.id.yearOriginPriceTv;
                                                                                            TextView textView8 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.yearOriginPriceTv);
                                                                                            if (textView8 != null) {
                                                                                                i10 = R.id.year_plan_layout;
                                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.year_plan_layout);
                                                                                                if (constraintLayout != null) {
                                                                                                    i10 = R.id.year_plan_save_tv;
                                                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.year_plan_save_tv);
                                                                                                    if (appCompatTextView != null) {
                                                                                                        i10 = R.id.year_plan_tv;
                                                                                                        TextView textView9 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.year_plan_tv);
                                                                                                        if (textView9 != null) {
                                                                                                            i10 = R.id.year_save_tip_iv;
                                                                                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.year_save_tip_iv);
                                                                                                            if (appCompatImageView2 != null) {
                                                                                                                i10 = R.id.year_save_tip_tv;
                                                                                                                TextView textView10 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.year_save_tip_tv);
                                                                                                                if (textView10 != null) {
                                                                                                                    i10 = R.id.yearTv;
                                                                                                                    if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.yearTv)) != null) {
                                                                                                                        return new u((ConstraintLayout) inflate, textView, appCompatImageView, lottieAnimationView, textView2, viewStub, textView3, textView4, textView5, textView6, textView7, space, textView8, constraintLayout, appCompatTextView, textView9, appCompatImageView2, textView10);
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
            throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpBmh4SSM6IA==", "rXgFdh0q").concat(inflate.getResources().getResourceName(i10)));
        }
    });
    public t1 T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* compiled from: SubscriptionBlackFridayActivity.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24899a;

        static {
            int[] iArr = new int[SubscriptionType.values().length];
            try {
                iArr[SubscriptionType.YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubscriptionType.YEAR_TRIAL_3D.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SubscriptionType.MONTH.ordinal()] = 3;
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
            f24899a = iArr;
        }
    }

    static {
        ea.a.p("PHUhcxtyDnA8aQludmw2Y1NGIGktYXk=", "qqoCxgnO");
    }

    public final void B2() {
        if (C2().c.getVisibility() != 0 && hasWindowFocus()) {
            C2().c.postDelayed(new b7.g(this, 23), c1.c(this));
        }
    }

    public final u C2() {
        return (u) this.S.getValue();
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = C2().f1487a;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("LWlfZBBuUC4obyV0", "ZJBzn6pk"));
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

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0146, code lost:
        if (pdf.pdfreader.viewer.editor.free.utils.c1.K(r7) != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012f A[EDGE_INSN: B:31:0x012f->B:19:0x012f ?: BREAK  , SYNTHETIC] */
    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K1() {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionBlackFridayActivity.K1():void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a
    public final void L1() {
        super.L1();
        t0.d0(b.b.x(this), null, null, new SubscriptionBlackFridayActivity$initViewModel$1(this, null), 3);
    }

    @Override // android.app.Activity
    public final void finish() {
        if (!this.X && !this.Z) {
            this.X = true;
            Intent intent = getIntent();
            if (!ReaderPdfApplication.n(this)) {
                Intent intent2 = new Intent(this, ReaderHomeActivity.class);
                intent2.putExtra(ea.a.p("LGUQXyxlAV8hbhJlWnQIZFdfPG89aF9uZw==", "HEGiBvk1"), true);
                kotlin.jvm.internal.g.d(intent, ea.a.p("X28oYR9JDHQXbnQ=", "G1kS9LxE"));
                ge.a.s(intent, intent2, ea.a.p("Q2EsZSxmEG8fMg==", "y0zPq0fU"));
                startActivity(intent2);
            }
        }
        super.finish();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final Space i2() {
        Space space = C2().f1497l;
        kotlin.jvm.internal.g.d(space, ea.a.p("OGkMZBtuJC48bxZTRGE0ZQ==", "dsZbrC9I"));
        return space;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final boolean k2() {
        String string = getString(R.string.arg_res_0x7f1304a1);
        kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHMzYjBjK2kXdC1vCV9VYSJsFmQp", "YgDgfwaH"));
        z2(string, false);
        return true;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        if (getIntent().hasExtra(ea.a.p("Q2EsZSxmEG8fMg==", "A5ELRlnH")) && TextUtils.equals(getIntent().getStringExtra(ea.a.p("Q2EsZSxmEG8fMg==", "5RWKDAdW")), ea.a.p("Q2EsZSxsA24VdVVnDF81aCtvQWU=", "v34aImpw"))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Y = z10;
        super.onCreate(bundle);
        ea.a.p("XG4IchZhFmU=", "HWNBfm90");
        this.f19294h = true;
        Window window = getWindow();
        kotlin.jvm.internal.g.d(window, ea.a.p("RGklZBx3", "zFz1K2H0"));
        pdf.pdfreader.viewer.editor.free.utils.extension.i.b(window, false);
        Window window2 = getWindow();
        kotlin.jvm.internal.g.d(window2, ea.a.p("RGklZBx3", "0gmtEPcU"));
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
                t0.d0(b.b.x(this), null, null, new SubscriptionBlackFridayActivity$onWindowFocusChanged$1(this, null), 3);
            } else if (C2().c.getVisibility() != 0) {
                B2();
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final void p2() {
        if (this.W) {
            return;
        }
        finish();
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final void q2(boolean z10, boolean z11) {
        int i10;
        int i11;
        C2().f1499n.setSelected(z10);
        AppCompatImageView appCompatImageView = C2().f1502q;
        int i12 = 0;
        if (z10 && z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        appCompatImageView.setVisibility(i10);
        TextView textView = C2().f1503r;
        if (z10 && z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        TextView textView2 = C2().f1501p;
        if (!z11) {
            i12 = 8;
        }
        textView2.setVisibility(i12);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity
    public final void u2(ol.d info) {
        kotlin.jvm.internal.g.e(info, "info");
        TextView textView = C2().f1503r;
        String string = getString(R.string.arg_res_0x7f13034e, info.f23477b);
        textView.setText(string + " ");
        for (ol.i iVar : info.c) {
            int i10 = a.f24899a[iVar.f23489a.ordinal()];
            String str = iVar.c;
            if (i10 != 1) {
                if (i10 == 2) {
                    C2().f1501p.setText(getString(R.string.arg_res_0x7f1300e1, iVar.f23491d));
                    C2().f1500o.setText(str);
                }
            } else {
                C2().f1488b.setText(getString(R.string.arg_res_0x7f1304cf, str));
                C2().f1498m.setText(str);
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
}
