package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import com.gyf.immersionbar.BarHide;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.Serializable;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.data.AIQuickTag;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.TypingTextView;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.AIChatPageParams;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.AIJumpTarget;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;

/* compiled from: AISelfInfoActivity.kt */
/* loaded from: classes3.dex */
public final class AISelfInfoActivity extends jl.a {
    public boolean A;
    public AnimatorSet B;
    public AnimatorSet D;
    public ObjectAnimator E;
    public ValueAnimator F;

    /* renamed from: v  reason: collision with root package name */
    public AIQuickTag f24415v;

    /* renamed from: w  reason: collision with root package name */
    public String f24416w;
    public static final String H = ea.a.p("FkkKUWJJAEsXVCdHa0sSWQ==", "niWU7CbJ");
    public static final String I = ea.a.p("DkluRjBMcl8KQR5IKkstWQ==", "bfD6ABrD");
    public static final String J = ea.a.p("DEkuRhFMF18cWTZFa0sSWQ==", "7GMqXRpV");
    public static final String K = ea.a.p("DUluRjpPel8bTzNSd0U=", "pmL1h7Mo");
    public static final String L = ea.a.p("elMUTjZFJl8mVWZONkEfXwxPf0UZUAJHRQ==", "koS31qAd");
    public static final String M = ea.a.p("DkluSzxZaEYITwdfJUEvRQ==", "mu12EZIg");
    public static final a G = new a();

    /* renamed from: t  reason: collision with root package name */
    public final tf.c f24413t = kotlin.a.a(new cg.a<am.f>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final am.f invoke() {
            View inflate = AISelfInfoActivity.this.getLayoutInflater().inflate(R.layout.activity_ai_self_info, (ViewGroup) null, false);
            int i10 = R.id.backImg;
            AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.backImg);
            if (appCompatImageView != null) {
                i10 = R.id.guideline1;
                if (((Guideline) com.google.android.play.core.assetpacks.c.u(inflate, R.id.guideline1)) != null) {
                    i10 = R.id.iv_ai_answer;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_ai_answer);
                    if (appCompatImageView2 != null) {
                        i10 = R.id.iv_ai_robot;
                        LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_ai_robot);
                        if (lottieAnimationView != null) {
                            i10 = R.id.iv_ai_summarize;
                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_ai_summarize);
                            if (appCompatImageView3 != null) {
                                i10 = R.id.iv_ai_translate;
                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_ai_translate);
                                if (appCompatImageView4 != null) {
                                    i10 = R.id.iv_ai_write;
                                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_ai_write);
                                    if (appCompatImageView5 != null) {
                                        i10 = R.id.iv_allow;
                                        AppCompatImageView appCompatImageView6 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_allow);
                                        if (appCompatImageView6 != null) {
                                            i10 = R.id.rl_continue;
                                            RelativeLayout relativeLayout = (RelativeLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rl_continue);
                                            if (relativeLayout != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                i10 = R.id.tv_ai_answer;
                                                TypingTextView typingTextView = (TypingTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_answer);
                                                if (typingTextView != null) {
                                                    i10 = R.id.tv_ai_answer_placeholder;
                                                    if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_answer_placeholder)) != null) {
                                                        i10 = R.id.tv_ai_info1;
                                                        TypingTextView typingTextView2 = (TypingTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_info1);
                                                        if (typingTextView2 != null) {
                                                            i10 = R.id.tv_ai_info2;
                                                            TypingTextView typingTextView3 = (TypingTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_info2);
                                                            if (typingTextView3 != null) {
                                                                i10 = R.id.tv_ai_more;
                                                                TypingTextView typingTextView4 = (TypingTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_more);
                                                                if (typingTextView4 != null) {
                                                                    i10 = R.id.tv_ai_summarize;
                                                                    TypingTextView typingTextView5 = (TypingTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_summarize);
                                                                    if (typingTextView5 != null) {
                                                                        i10 = R.id.tv_ai_summarize_placeholder;
                                                                        if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_summarize_placeholder)) != null) {
                                                                            i10 = R.id.tv_ai_translate;
                                                                            TypingTextView typingTextView6 = (TypingTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_translate);
                                                                            if (typingTextView6 != null) {
                                                                                i10 = R.id.tv_ai_translate_placeholder;
                                                                                if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_translate_placeholder)) != null) {
                                                                                    i10 = R.id.tv_ai_write;
                                                                                    TypingTextView typingTextView7 = (TypingTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_write);
                                                                                    if (typingTextView7 != null) {
                                                                                        i10 = R.id.tv_ai_write_placeholder;
                                                                                        if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_write_placeholder)) != null) {
                                                                                            i10 = R.id.tv_skip;
                                                                                            TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_skip);
                                                                                            if (textView != null) {
                                                                                                i10 = R.id.view_status_bar;
                                                                                                View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_status_bar);
                                                                                                if (u7 != null) {
                                                                                                    return new am.f(constraintLayout, appCompatImageView, appCompatImageView2, lottieAnimationView, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, relativeLayout, constraintLayout, typingTextView, typingTextView2, typingTextView3, typingTextView4, typingTextView5, typingTextView6, typingTextView7, textView, u7);
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
            throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpG2hDSSw6IA==", "och52RjO").concat(inflate.getResources().getResourceName(i10)));
        }
    });

    /* renamed from: u  reason: collision with root package name */
    public final Handler f24414u = new Handler(Looper.getMainLooper());

    /* renamed from: x  reason: collision with root package name */
    public int f24417x = 701;

    /* renamed from: y  reason: collision with root package name */
    public int f24418y = OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD;

    /* renamed from: z  reason: collision with root package name */
    public String f24419z = ea.a.p("PG8pbHM=", "49HFirMP");
    public final b7.g C = new b7.g(this, 20);

    /* compiled from: AISelfInfoActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static void a(Context context, String str, int i10, int i11, String str2, boolean z10) {
            if (context != null) {
                Intent intent = new Intent(context, AISelfInfoActivity.class);
                intent.putExtra(ea.a.p("c0kKUQdJLEsXVCdHa0sSWQ==", "zc2URo7H"), (Serializable) null);
                intent.putExtra(ea.a.p("ckkURjpMJ18iQWBINksTWQ==", "bH4XaeU3"), str);
                intent.putExtra(ea.a.p("K0kIRjBMNF8cWTZFa0sSWQ==", "QYjWyqUu"), i10);
                intent.putExtra(ea.a.p("DkluRitPel8JTx9SNkU=", "8jRjM41y"), i11);
                intent.putExtra(ea.a.p("ckkUSzZZPUYgT3lfOUERRQ==", "0oe1HxKf"), str2);
                intent.putExtra(ea.a.p("BlNuTjxFc18OVRhOKkEhX31PI0UaUCRHRQ==", "ddpKAMnb"), z10);
                context.startActivity(intent);
            }
        }
    }

    public static final void a2(AISelfInfoActivity aISelfInfoActivity) {
        aISelfInfoActivity.getClass();
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aISelfInfoActivity)) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aISelfInfoActivity.b2().f877h, ea.a.p("O3JQbgpsVnQzbyRY", "ZwdsKX4O"), 0.0f, 15.0f, 0.0f, 15.0f, 0.0f, 15.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
            aISelfInfoActivity.E = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(2000L);
            }
            ObjectAnimator objectAnimator = aISelfInfoActivity.E;
            if (objectAnimator != null) {
                objectAnimator.setRepeatCount(-1);
            }
            ObjectAnimator objectAnimator2 = aISelfInfoActivity.E;
            if (objectAnimator2 != null) {
                objectAnimator2.start();
            }
        }
    }

    @Override // jl.a
    public final void C1() {
        AIQuickTag aIQuickTag;
        Serializable serializableExtra = getIntent().getSerializableExtra(H);
        if (serializableExtra instanceof AIQuickTag) {
            aIQuickTag = (AIQuickTag) serializableExtra;
        } else {
            aIQuickTag = null;
        }
        this.f24415v = aIQuickTag;
        this.f24416w = getIntent().getStringExtra(I);
        this.f24417x = getIntent().getIntExtra(J, 701);
        this.f24418y = getIntent().getIntExtra(K, OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
        String stringExtra = getIntent().getStringExtra(M);
        if (stringExtra == null) {
            stringExtra = ea.a.p("R28kbHM=", "tOJ0LJYL");
        }
        this.f24419z = stringExtra;
        this.A = getIntent().getBooleanExtra(L, false);
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = b2().f879j;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4Ab1t0", "H7aviYHx"));
        return constraintLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    @Override // jl.a
    public final void K1() {
        AppCompatImageView appCompatImageView = b2().f872b;
        kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("AWlWZB5uFS4qYQVrfW1n", "dRc8wr1q"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity$initView$1
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
                AISelfInfoActivity aISelfInfoActivity = AISelfInfoActivity.this;
                AISelfInfoActivity.a aVar = AISelfInfoActivity.G;
                aISelfInfoActivity.c2();
                AISelfInfoActivity.this.d2();
            }
        });
        TextView textView = b2().f887r;
        kotlin.jvm.internal.g.d(textView, ea.a.p("UWklZBpuBS4GdmdrAHA=", "vvUasxjT"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity$initView$2
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
                AISelfInfoActivity aISelfInfoActivity = AISelfInfoActivity.this;
                AISelfInfoActivity.a aVar = AISelfInfoActivity.G;
                aISelfInfoActivity.c2();
                AISelfInfoActivity.this.d2();
            }
        });
        RelativeLayout relativeLayout = b2().f878i;
        kotlin.jvm.internal.g.d(relativeLayout, ea.a.p("LWlfZBBuUC4obAlvG3QBbkBl", "kffsxTZJ"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(relativeLayout, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity$initView$3
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
                ObjectAnimator objectAnimator;
                kotlin.jvm.internal.g.e(it, "it");
                tn.a.b(AISelfInfoActivity.this, ea.a.p("MGk=", "qPQp7bLz"), ea.a.p("UmksdRpkB18Rb1p0AG4jZRtjXmklaw==", "Sa0klszM"));
                AIExperienceActivity.a aVar = AIExperienceActivity.L;
                AISelfInfoActivity aISelfInfoActivity = AISelfInfoActivity.this;
                AIQuickTag aIQuickTag = aISelfInfoActivity.f24415v;
                String str = aISelfInfoActivity.f24416w;
                if (str == null) {
                    str = "";
                }
                int i10 = aISelfInfoActivity.f24417x;
                int i11 = aISelfInfoActivity.f24418y;
                String fromAIEntrance = aISelfInfoActivity.f24419z;
                boolean z10 = aISelfInfoActivity.A;
                aVar.getClass();
                kotlin.jvm.internal.g.e(fromAIEntrance, "fromAIEntrance");
                if (aISelfInfoActivity != null) {
                    Intent intent = new Intent(aISelfInfoActivity, AIExperienceActivity.class);
                    intent.putExtra(ea.a.p("ckkUUSZJIUstVHVHNksTWQ==", "jiKF1BaV"), aIQuickTag);
                    intent.putExtra(ea.a.p("DkluRjBMcl8KQR5IKkstWQ==", "CglXgex2"), str);
                    intent.putExtra(ea.a.p("DkluRjBMcl8OWRpFKkstWQ==", "riMUMxyF"), i10);
                    intent.putExtra(ea.a.p("JkkRRipPDF8bTzNSd0UIS31Z", "7sgNxAHE"), i11);
                    intent.putExtra(ea.a.p("ckkUSzZZPUYgT3lfOUERRQ==", "5kjJQSoZ"), fromAIEntrance);
                    intent.putExtra(ea.a.p("BlNuTjxFc18OVRhOKkEhX31PI0UaUCRHRQ==", "vlv1Y8y3"), z10);
                    aISelfInfoActivity.startActivity(intent);
                }
                ObjectAnimator objectAnimator2 = AISelfInfoActivity.this.E;
                boolean z11 = false;
                if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                    z11 = true;
                }
                if (z11 && (objectAnimator = AISelfInfoActivity.this.E) != null) {
                    objectAnimator.cancel();
                }
                AISelfInfoActivity.this.finish();
            }
        });
    }

    public final am.f b2() {
        return (am.f) this.f24413t.getValue();
    }

    public final void c2() {
        tn.a.b(this, ea.a.p("Umk=", "n5WXCipY"), ea.a.p("FGkidTtkH187aw9wa2M7aVtr", "ZRuERz9U"));
    }

    public final void d2() {
        String str = "";
        if (!BillingConfigImpl.c.w()) {
            if (this.A) {
                BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                String p10 = ea.a.p("KHVYZGU=", "NpsALNKK");
                String str2 = this.f24419z;
                AIJumpTarget aIJumpTarget = new AIJumpTarget(AIHomeActivity.class, null, null, 6, null);
                aVar.getClass();
                BaseSubscriptionActivity.a.b(this, p10, str2, aIJumpTarget);
            } else {
                BaseSubscriptionActivity.a aVar2 = BaseSubscriptionActivity.L;
                String p11 = ea.a.p("VHUiZGU=", "uJYc5Xin");
                String str3 = this.f24419z;
                AIQuickTag aIQuickTag = this.f24415v;
                String str4 = this.f24416w;
                if (str4 != null) {
                    str = str4;
                }
                AIJumpTarget aIJumpTarget2 = new AIJumpTarget(AIChatActivity.class, new AIChatPageParams(aIQuickTag, str, this.f24417x, this.f24418y), null, 4, null);
                aVar2.getClass();
                BaseSubscriptionActivity.a.b(this, p11, str3, aIJumpTarget2);
            }
        } else if (this.A) {
            AIHomeActivity.a aVar3 = AIHomeActivity.J;
            String str5 = this.f24419z;
            aVar3.getClass();
            AIHomeActivity.a.a(this, str5);
        } else {
            AIChatActivity.a aVar4 = AIChatActivity.f24356v0;
            AIQuickTag aIQuickTag2 = this.f24415v;
            String str6 = this.f24416w;
            if (str6 != null) {
                str = str6;
            }
            int i10 = this.f24417x;
            int i11 = this.f24418y;
            aVar4.getClass();
            AIChatActivity.a.a(this, aIQuickTag2, str, i10, i11);
        }
        pdf.pdfreader.viewer.editor.free.utils.q0.w(this, "need_show_ai_self_page_in_162", false);
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (b2().f887r.getVisibility() == 0) {
            c2();
            d2();
        }
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.gyf.immersionbar.g r4 = com.gyf.immersionbar.g.r(this);
        if (new com.gyf.immersionbar.a(this).f13751b) {
            r4.e(BarHide.FLAG_HIDE_NAVIGATION_BAR);
        }
        r4.p(b2().f888s);
        r4.f13799k.f13757d = false;
        r4.o(false);
        r4.j(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
        r4.i(R.color.color_100_white_black);
        r4.h();
        r4.f();
        tn.a.d(this, ea.a.p("Lmk=", "K4jJEhOo"), ea.a.p("LmlWdRBkUl8qYS1lKnMAb3c=", "LvxsjfUy"), ea.a.p("P2FWZTE=", "FgCjyGcv"), false);
        if (bundle == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b2().f873d, ea.a.p("PGNQbBxY", "zvgd4r8D"), 0.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(b2().f873d, ea.a.p("QGMqbBZZ", "0fALMoQH"), 0.0f, 1.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(b2().f873d, ea.a.p("Umw7aGE=", "Hhr2HNES"), 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            this.B = animatorSet;
            animatorSet.setDuration(350L);
            AnimatorSet animatorSet2 = this.B;
            if (animatorSet2 != null) {
                animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3);
            }
            AnimatorSet animatorSet3 = this.B;
            if (animatorSet3 != null) {
                animatorSet3.addListener(new m0(this));
            }
            AnimatorSet animatorSet4 = this.B;
            if (animatorSet4 != null) {
                animatorSet4.start();
            }
        } else {
            b2().f879j.getViewTreeObserver().addOnGlobalLayoutListener(new j0(this));
        }
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.g(ea.a.p("UmkUaR10EG8WdVdl", "EJNkYeaf"));
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        boolean z10;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        ObjectAnimator objectAnimator;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        super.onDestroy();
        AnimatorSet animatorSet3 = this.B;
        boolean z13 = true;
        if (animatorSet3 != null && animatorSet3.isRunning()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (animatorSet2 = this.B) != null) {
            animatorSet2.cancel();
        }
        if (b2().f873d.h()) {
            b2().f873d.d();
        }
        b2().f881l.n();
        b2().f880k.n();
        b2().f884o.n();
        b2().f886q.n();
        b2().f885p.n();
        b2().f883n.n();
        AnimatorSet animatorSet4 = this.D;
        if (animatorSet4 != null && animatorSet4.isRunning()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && (animatorSet = this.D) != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimator2 = this.E;
        if (objectAnimator2 != null && objectAnimator2.isRunning()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && (objectAnimator = this.E) != null) {
            objectAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.F;
        if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
            z13 = false;
        }
        if (z13 && (valueAnimator = this.F) != null) {
            valueAnimator.cancel();
        }
        this.f24414u.removeCallbacks(this.C);
    }
}
