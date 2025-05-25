package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.airbnb.lottie.LottieAnimationView;
import com.gyf.immersionbar.BarHide;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.io.Serializable;
import java.util.ArrayList;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.data.AIQuickTag;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIChatActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIHomeActivity;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIQuickTagView;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.TypingTextView;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.AIChatPageParams;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.AIJumpTarget;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;

/* compiled from: AIExperienceActivity.kt */
/* loaded from: classes3.dex */
public final class AIExperienceActivity extends jl.a {
    public boolean A;
    public boolean B;
    public AnimatorSet F;
    public AnimatorSet G;
    public AnimatorSet I;
    public AnimatorSet J;
    public boolean K;

    /* renamed from: v  reason: collision with root package name */
    public AIQuickTag f24391v;

    /* renamed from: w  reason: collision with root package name */
    public String f24392w;
    public static final String M = ea.a.p("ckkUUSZJIUstVHVHNksTWQ==", "goSOIeFM");
    public static final String N = ea.a.p("A0k5RgFMcV8YQTJIa0sSWQ==", "nMBfH4kJ");
    public static final String O = ea.a.p("dkkrRiNMMV8cWTZFa0sSWQ==", "C97tjtT3");
    public static final String P = ea.a.p("DkluRitPel8JTx9SNkU3S3BZ", "FEjDguXd");
    public static final String Q = ea.a.p("elMUTjZFJl8mVWZONkEfXwxPf0UZUAJHRQ==", "y5ESPv41");
    public static final String R = ea.a.p("ckkUSzZZPUYgT3lfOUERRQ==", "lCCcn0rC");
    public static final a L = new a();

    /* renamed from: t  reason: collision with root package name */
    public final tf.c f24389t = kotlin.a.a(new cg.a<am.b>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity$binding$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final am.b invoke() {
            View inflate = AIExperienceActivity.this.getLayoutInflater().inflate(R.layout.activity_ai_experience, (ViewGroup) null, false);
            int i10 = R.id.ai_quick_tag_view;
            AIQuickTagView aIQuickTagView = (AIQuickTagView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ai_quick_tag_view);
            if (aIQuickTagView != null) {
                i10 = R.id.backImg;
                AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.backImg);
                if (appCompatImageView != null) {
                    i10 = R.id.ic_oper_icon;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ic_oper_icon);
                    if (appCompatImageView2 != null) {
                        i10 = R.id.item_answer;
                        ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_answer);
                        if (constraintLayout != null) {
                            i10 = R.id.item_answer_container;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_answer_container);
                            if (constraintLayout2 != null) {
                                i10 = R.id.item_file;
                                ConstraintLayout constraintLayout3 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_file);
                                if (constraintLayout3 != null) {
                                    i10 = R.id.item_icon;
                                    if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_icon)) != null) {
                                        i10 = R.id.item_name;
                                        AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_name);
                                        if (appCompatTextView != null) {
                                            i10 = R.id.item_size;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.item_size);
                                            if (appCompatTextView2 != null) {
                                                i10 = R.id.iv_answer_robot;
                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_answer_robot);
                                                if (appCompatImageView3 != null) {
                                                    i10 = R.id.iv_user_header;
                                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_user_header);
                                                    if (appCompatImageView4 != null) {
                                                        i10 = R.id.let_start;
                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.let_start);
                                                        if (constraintLayout4 != null) {
                                                            i10 = R.id.loadingLottie;
                                                            LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.loadingLottie);
                                                            if (lottieAnimationView != null) {
                                                                i10 = R.id.lottie_start;
                                                                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.lottie_start);
                                                                if (lottieAnimationView2 != null) {
                                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) inflate;
                                                                    i10 = R.id.scroll_view;
                                                                    NestedScrollView nestedScrollView = (NestedScrollView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.scroll_view);
                                                                    if (nestedScrollView != null) {
                                                                        i10 = R.id.tv_ai_answer;
                                                                        TypingTextView typingTextView = (TypingTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_ai_answer);
                                                                        if (typingTextView != null) {
                                                                            i10 = R.id.tv_let_start;
                                                                            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_let_start)) != null) {
                                                                                i10 = R.id.tv_oper;
                                                                                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_oper);
                                                                                if (textView != null) {
                                                                                    i10 = R.id.tv_oper_title;
                                                                                    TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_oper_title);
                                                                                    if (textView2 != null) {
                                                                                        i10 = R.id.tv_skip;
                                                                                        TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_skip);
                                                                                        if (textView3 != null) {
                                                                                            i10 = R.id.view_status_bar;
                                                                                            View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_status_bar);
                                                                                            if (u7 != null) {
                                                                                                return new am.b(constraintLayout5, aIQuickTagView, appCompatImageView, appCompatImageView2, constraintLayout, constraintLayout2, constraintLayout3, appCompatTextView, appCompatTextView2, appCompatImageView3, appCompatImageView4, constraintLayout4, lottieAnimationView, lottieAnimationView2, constraintLayout5, nestedScrollView, typingTextView, textView, textView2, textView3, u7);
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
            throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpDmhRSRM6IA==", "zqWohyNS").concat(inflate.getResources().getResourceName(i10)));
        }
    });

    /* renamed from: u  reason: collision with root package name */
    public final Handler f24390u = new Handler(Looper.getMainLooper());

    /* renamed from: x  reason: collision with root package name */
    public int f24393x = 701;

    /* renamed from: y  reason: collision with root package name */
    public int f24394y = OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD;

    /* renamed from: z  reason: collision with root package name */
    public String f24395z = ea.a.p("R28kbHM=", "MWbRRFGa");
    public boolean C = true;
    public String D = "";
    public String E = "";
    public final h H = new h(this, 3);

    /* compiled from: AIExperienceActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    public static final void a2(AIExperienceActivity aIExperienceActivity) {
        if (!aIExperienceActivity.K && !pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIExperienceActivity)) {
            aIExperienceActivity.K = true;
            aIExperienceActivity.d2().f733l.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aIExperienceActivity.d2().f733l, ea.a.p("PGNQbBxY", "kwRB6N3l"), 0.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aIExperienceActivity.d2().f733l, ea.a.p("QGMqbBZZ", "NzW0kfSF"), 0.0f, 1.0f);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(aIExperienceActivity.d2().f733l, ea.a.p("Umw7aGE=", "rY7acjx0"), 0.0f, 1.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            aIExperienceActivity.J = animatorSet;
            animatorSet.setDuration(500L);
            AnimatorSet animatorSet2 = aIExperienceActivity.J;
            if (animatorSet2 != null) {
                animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3);
            }
            AnimatorSet animatorSet3 = aIExperienceActivity.J;
            if (animatorSet3 != null) {
                animatorSet3.addListener(new a0(aIExperienceActivity));
            }
            AnimatorSet animatorSet4 = aIExperienceActivity.J;
            if (animatorSet4 != null) {
                animatorSet4.start();
            }
        }
    }

    public static final void b2(AIExperienceActivity aIExperienceActivity) {
        aIExperienceActivity.getClass();
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIExperienceActivity)) {
            aIExperienceActivity.d2().f735n.j();
            aIExperienceActivity.f24390u.post(new x(aIExperienceActivity, 0));
        }
    }

    @Override // jl.a
    public final void C1() {
        AIQuickTag aIQuickTag;
        Serializable serializableExtra = getIntent().getSerializableExtra(M);
        if (serializableExtra instanceof AIQuickTag) {
            aIQuickTag = (AIQuickTag) serializableExtra;
        } else {
            aIQuickTag = null;
        }
        this.f24391v = aIQuickTag;
        this.f24392w = getIntent().getStringExtra(N);
        this.f24393x = getIntent().getIntExtra(O, 701);
        this.f24394y = getIntent().getIntExtra(P, OS2WindowsMetricsTable.WEIGHT_CLASS_SEMI_BOLD);
        String stringExtra = getIntent().getStringExtra(R);
        if (stringExtra == null) {
            stringExtra = ea.a.p("RW8XbHM=", "mM1x7Rfd");
        }
        this.f24395z = stringExtra;
        this.A = getIntent().getBooleanExtra(Q, false);
    }

    @Override // jl.a
    public final View D1() {
        ConstraintLayout constraintLayout = d2().f736o;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("LWlfZBBuUC4obyV0I2kNdw==", "1xp62XeO"));
        return constraintLayout;
    }

    @Override // jl.a
    public final int E1() {
        return 0;
    }

    @Override // jl.a
    @SuppressLint({"ClickableViewAccessibility"})
    public final void K1() {
        if (pdf.pdfreader.viewer.editor.free.utils.extension.c.j(this)) {
            d2().f728g.setBackgroundResource(R.drawable.bg_experience_item_left_file);
            d2().f739r.setBackgroundResource(R.drawable.bg_experience_item_send_left);
            d2().f734m.setBackgroundResource(R.drawable.bg_experience_item_right_answer);
            d2().f726e.setBackgroundResource(R.drawable.bg_experience_item_right_answer);
        } else {
            d2().f728g.setBackgroundResource(R.drawable.bg_experience_item_right_file);
            d2().f739r.setBackgroundResource(R.drawable.bg_experience_item_send_right);
            d2().f734m.setBackgroundResource(R.drawable.bg_experience_item_left_answer);
            d2().f726e.setBackgroundResource(R.drawable.bg_experience_item_left_answer);
        }
        AppCompatTextView appCompatTextView = d2().f729h;
        String string = getString(R.string.arg_res_0x7f1301f9);
        appCompatTextView.setText(string + ".pdf");
        d2().f730i.setText(pdf.pdfreader.viewer.editor.free.utils.v.t(this, 56422L));
        AppCompatImageView appCompatImageView = d2().c;
        kotlin.jvm.internal.g.d(appCompatImageView, ea.a.p("UWklZBpuBS4QYVdrIG1n", "0shyULOa"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity$initView$1
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
                AIExperienceActivity aIExperienceActivity = AIExperienceActivity.this;
                AIExperienceActivity.a aVar = AIExperienceActivity.L;
                aIExperienceActivity.h2();
                AIExperienceActivity.this.i2();
            }
        });
        TextView textView = d2().f741t;
        kotlin.jvm.internal.g.d(textView, ea.a.p("UWklZBpuBS4GdmdrAHA=", "z5kE5LVd"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity$initView$2
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
                AIExperienceActivity aIExperienceActivity = AIExperienceActivity.this;
                AIExperienceActivity.a aVar = AIExperienceActivity.L;
                aIExperienceActivity.h2();
                AIExperienceActivity.this.i2();
            }
        });
        ConstraintLayout constraintLayout = d2().f733l;
        kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4eZUBTHWEkdA==", "6JM5J3Hy"));
        pdf.pdfreader.viewer.editor.free.utils.extension.g.e(constraintLayout, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity$initView$3
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
                tn.a.d(AIExperienceActivity.this, ea.a.p("Lmk=", "13GBpP2O"), ea.a.p("UmksdRpkB18BdFVyHV81bC1jaw==", "SbYZi87N"), AIExperienceActivity.this.D, false);
                AIExperienceActivity.this.i2();
            }
        });
        d2().f737p.setOnTouchListener(new e(this, 1));
        d2().f737p.setOnScrollChangeListener(new NestedScrollView.c() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.w
            @Override // androidx.core.widget.NestedScrollView.c
            public final void a(NestedScrollView nestedScrollView, int i10, int i11) {
                AIExperienceActivity.a aVar = AIExperienceActivity.L;
                String p10 = ea.a.p("M2gPc2ww", "Q3GfHXiU");
                AIExperienceActivity aIExperienceActivity = AIExperienceActivity.this;
                kotlin.jvm.internal.g.e(aIExperienceActivity, p10);
                kotlin.jvm.internal.g.e(nestedScrollView, ea.a.p("dg==", "gDYNB2aq"));
                if (aIExperienceActivity.B && i11 > i10) {
                    aIExperienceActivity.C = false;
                }
                if (i10 == nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getHeight()) {
                    aIExperienceActivity.C = true;
                }
            }
        });
        d2().f738q.setOnHeightChange(new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity$initView$6
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ tf.d invoke() {
                invoke2();
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AIExperienceActivity aIExperienceActivity = AIExperienceActivity.this;
                if (aIExperienceActivity.C) {
                    aIExperienceActivity.d2().f737p.f(ShapeTypes.DOUBLE_WAVE);
                }
            }
        });
        d2().f724b.setTitleTextColor(androidx.core.content.a.getColor(this, R.color.white));
        d2().f724b.setItemBgDrawable(R.drawable.bg_1e232f_r4);
        d2().f724b.setItemTextColor(androidx.core.content.a.getColor(this, R.color.white));
        AIQuickTagView aIQuickTagView = d2().f724b;
        String string2 = getString(R.string.arg_res_0x7f1305a1);
        im.b.f18555a.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(im.b.d(this));
        arrayList.add(im.b.e(this));
        arrayList.add(im.b.a(this));
        arrayList.add(im.b.b(this));
        aIQuickTagView.getClass();
        aIQuickTagView.c(aIQuickTagView.f24745e, arrayList, string2);
        d2().f724b.setOnItemClickListener(new cg.p<Integer, AIQuickTag, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity$initView$7
            {
                super(2);
            }

            @Override // cg.p
            public /* bridge */ /* synthetic */ tf.d invoke(Integer num, AIQuickTag aIQuickTag) {
                invoke(num.intValue(), aIQuickTag);
                return tf.d.f30009a;
            }

            public final void invoke(int i10, AIQuickTag aiQuickTag) {
                String p10;
                kotlin.jvm.internal.g.e(aiQuickTag, "aiQuickTag");
                AnimatorSet animatorSet = AIExperienceActivity.this.G;
                if (animatorSet != null && animatorSet.isRunning()) {
                    return;
                }
                AIExperienceActivity.this.E = aiQuickTag.getTag();
                AIExperienceActivity.this.d2().f725d.setImageResource(aiQuickTag.getIcon());
                AIExperienceActivity.this.d2().f740s.setText(aiQuickTag.getTag());
                if (aiQuickTag.isTranslate()) {
                    AIExperienceActivity.this.d2().f739r.setText(AIExperienceActivity.this.getString(R.string.arg_res_0x7f130226));
                    AIExperienceActivity.this.D = ea.a.p("AnItbgdsVnRl", "mmvLt7Uf");
                } else {
                    AIExperienceActivity.this.d2().f739r.setText(aiQuickTag.getDes());
                    AIExperienceActivity aIExperienceActivity = AIExperienceActivity.this;
                    String tag = aiQuickTag.getTag();
                    if (kotlin.jvm.internal.g.a(tag, AIExperienceActivity.this.getString(R.string.arg_res_0x7f1304a3))) {
                        p10 = ea.a.p("PHVcbRhyXnpl", "eBhNsZAt");
                    } else if (kotlin.jvm.internal.g.a(tag, AIExperienceActivity.this.getString(R.string.arg_res_0x7f13001d))) {
                        p10 = ea.a.p("LmJCdAthVHQ=", "kIeCXZUN");
                    } else {
                        p10 = ea.a.p("KHJQbRRhcg==", "nK28kVO6");
                    }
                    aIExperienceActivity.D = p10;
                }
                tn.a.d(AIExperienceActivity.this, ea.a.p("Umk=", "zFXCL7F5"), ea.a.p("EGkDdQZkJF8udQhjQGk4bktfMWwgY2s=", "e9qdoA6U"), AIExperienceActivity.this.D, false);
                final AIExperienceActivity aIExperienceActivity2 = AIExperienceActivity.this;
                aIExperienceActivity2.getClass();
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(aIExperienceActivity2.d2().f724b, PropertyValuesHolder.ofKeyframe(ea.a.p("LmxBaGE=", "AoV2RK1C"), Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.3f, 0.0f), Keyframe.ofFloat(1.0f, 0.0f)));
                kotlin.jvm.internal.g.d(ofPropertyValuesHolder, ea.a.p("XGYbchxwB3IGeWJhBXUzcwxvXmQjcmtilIDNaTZ3ZSBHYSxWGmUVQR5wXGExSDlsIGVAKQ==", "vkSIDKzk"));
                ofPropertyValuesHolder.addUpdateListener(new n8.a(aIExperienceActivity2, 1));
                Keyframe ofFloat = Keyframe.ofFloat(0.0f, 0.0f);
                Keyframe ofFloat2 = Keyframe.ofFloat(0.3f, 0.0f);
                Keyframe ofFloat3 = Keyframe.ofFloat(0.45f, 1.05f);
                Keyframe ofFloat4 = Keyframe.ofFloat(0.525f, 0.95f);
                Keyframe ofFloat5 = Keyframe.ofFloat(0.6f, 1.0f);
                Keyframe ofFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
                ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(aIExperienceActivity2.d2().f739r, PropertyValuesHolder.ofKeyframe(ea.a.p("QGMqbBZY", "PaACNJdz"), ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6), PropertyValuesHolder.ofKeyframe(ea.a.p("QGMqbBZZ", "bSWByXVh"), ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6), PropertyValuesHolder.ofKeyframe(ea.a.p("Umw7aGE=", "vD0H8495"), Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.3f, 0.0f), Keyframe.ofFloat(0.45f, 1.0f), Keyframe.ofFloat(1.0f, 1.0f)));
                kotlin.jvm.internal.g.d(ofPropertyValuesHolder2, ea.a.p("IGZhchZwUnIueRxhGXUNc31vAmQgck1it4D_WRJvNWQqch0gFnBSchtsOmgUSAdsUWUcKQ==", "4PDiUYZY"));
                ofPropertyValuesHolder2.addUpdateListener(new k9.a(aIExperienceActivity2, 1));
                Keyframe ofFloat7 = Keyframe.ofFloat(0.0f, 0.0f);
                Keyframe ofFloat8 = Keyframe.ofFloat(0.6f, 0.0f);
                Keyframe ofFloat9 = Keyframe.ofFloat(0.7f, 1.0f);
                Keyframe ofFloat10 = Keyframe.ofFloat(1.0f, 1.0f);
                ObjectAnimator ofPropertyValuesHolder3 = ObjectAnimator.ofPropertyValuesHolder(aIExperienceActivity2.d2().f731j, PropertyValuesHolder.ofKeyframe(ea.a.p("QGMqbBZY", "9I0sClqq"), ofFloat7, ofFloat8, ofFloat9, ofFloat10), PropertyValuesHolder.ofKeyframe(ea.a.p("QGMqbBZZ", "aoIqLALG"), ofFloat7, ofFloat8, ofFloat9, ofFloat10));
                kotlin.jvm.internal.g.d(ofPropertyValuesHolder3, ea.a.p("XGYbchxwB3IGeWJhBXUzcwxvXmQjcmti0IDQICFvD29HSC5hF2UQUxFhWGUwSDlsIGVAKQ==", "2vSmgQTR"));
                ofPropertyValuesHolder3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.y
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        AIExperienceActivity.a aVar = AIExperienceActivity.L;
                        String p11 = ea.a.p("O2hYc10w", "6I36rWlu");
                        AIExperienceActivity aIExperienceActivity3 = AIExperienceActivity.this;
                        kotlin.jvm.internal.g.e(aIExperienceActivity3, p11);
                        kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("KW4qbSB0Wm9u", "pOHCA37G"));
                        if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIExperienceActivity3)) {
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            kotlin.jvm.internal.g.c(animatedValue, ea.a.p("LXVebFVjEG4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiA3eUJlVWsedCRpCC5ybDhhdA==", "ilC2uqWx"));
                            if (((Float) animatedValue).floatValue() > 0.0f && aIExperienceActivity3.d2().f731j.getVisibility() != 0) {
                                aIExperienceActivity3.d2().f731j.setVisibility(0);
                            }
                        }
                    }
                });
                Keyframe ofFloat11 = Keyframe.ofFloat(0.0f, 0.0f);
                Keyframe ofFloat12 = Keyframe.ofFloat(0.7f, 0.0f);
                Keyframe ofFloat13 = Keyframe.ofFloat(0.85f, 1.05f);
                Keyframe ofFloat14 = Keyframe.ofFloat(0.925f, 0.95f);
                Keyframe ofFloat15 = Keyframe.ofFloat(1.0f, 1.0f);
                ObjectAnimator ofPropertyValuesHolder4 = ObjectAnimator.ofPropertyValuesHolder(aIExperienceActivity2.d2().f734m, PropertyValuesHolder.ofKeyframe(ea.a.p("N2M0bApY", "YyDUoe9g"), ofFloat11, ofFloat12, ofFloat13, ofFloat14, ofFloat15), PropertyValuesHolder.ofKeyframe(ea.a.p("QGMqbBZZ", "a06GvwhY"), ofFloat11, ofFloat12, ofFloat13, ofFloat14, ofFloat15), PropertyValuesHolder.ofKeyframe(ea.a.p("LmxBaGE=", "i2ROh3T4"), Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.7f, 0.0f), Keyframe.ofFloat(0.85f, 1.0f), Keyframe.ofFloat(1.0f, 1.0f)));
                kotlin.jvm.internal.g.d(ofPropertyValuesHolder4, ea.a.p("XGYbchxwB3IGeWJhBXUzcwxvXmQjcmtisYDPbDBlESwTbCRhF2kMZzNsRGgISDlsIGVAKQ==", "SiTcNNuz"));
                ofPropertyValuesHolder4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.z
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        AIExperienceActivity.a aVar = AIExperienceActivity.L;
                        String p11 = ea.a.p("E2guc0Aw", "W2gGdIVq");
                        AIExperienceActivity aIExperienceActivity3 = AIExperienceActivity.this;
                        kotlin.jvm.internal.g.e(aIExperienceActivity3, p11);
                        kotlin.jvm.internal.g.e(valueAnimator, ea.a.p("Lm5YbRh0Xm9u", "sK1COryT"));
                        if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(aIExperienceActivity3)) {
                            Object animatedValue = valueAnimator.getAnimatedValue();
                            kotlin.jvm.internal.g.c(animatedValue, ea.a.p("IXVdbFljVm40bz4gF2VIY1RzGiAxb0VuP25YbjBsOSA7eUFlWWtYdDZpJC4zbAdhdA==", "3dbWPuEU"));
                            if (((Float) animatedValue).floatValue() > 0.0f && aIExperienceActivity3.d2().f734m.getVisibility() != 0) {
                                aIExperienceActivity3.d2().f727f.setVisibility(0);
                                aIExperienceActivity3.d2().f734m.setVisibility(0);
                                aIExperienceActivity3.d2().f734m.post(new o0(aIExperienceActivity3, 2));
                            }
                        }
                    }
                });
                ofPropertyValuesHolder4.addListener(new c0(aIExperienceActivity2));
                AnimatorSet animatorSet2 = new AnimatorSet();
                aIExperienceActivity2.G = animatorSet2;
                animatorSet2.setDuration(2000L);
                AnimatorSet animatorSet3 = aIExperienceActivity2.G;
                if (animatorSet3 != null) {
                    animatorSet3.playTogether(ofPropertyValuesHolder, ofPropertyValuesHolder2, ofPropertyValuesHolder3, ofPropertyValuesHolder4);
                }
                AnimatorSet animatorSet4 = aIExperienceActivity2.G;
                if (animatorSet4 != null) {
                    animatorSet4.start();
                }
            }
        });
    }

    public final String c2() {
        String string = getString(R.string.arg_res_0x7f1301f8);
        String string2 = getString(R.string.arg_res_0x7f1301ed);
        String string3 = getString(R.string.arg_res_0x7f1301ef);
        String string4 = getString(R.string.arg_res_0x7f1301ee);
        String string5 = getString(R.string.arg_res_0x7f1301f1);
        String string6 = getString(R.string.arg_res_0x7f1301f0);
        String string7 = getString(R.string.arg_res_0x7f1301f3);
        String string8 = getString(R.string.arg_res_0x7f1301f2);
        String string9 = getString(R.string.arg_res_0x7f1301f5);
        String string10 = getString(R.string.arg_res_0x7f1301f4);
        String string11 = getString(R.string.arg_res_0x7f1301f7);
        String string12 = getString(R.string.arg_res_0x7f1301f6);
        StringBuilder f10 = android.support.v4.media.session.h.f("## ", string, "  \n&nbsp;\n### ", string2, " \n&nbsp;\n- **");
        a6.h.l(f10, string3, "** ", string4, "  \n&nbsp;\n- **");
        a6.h.l(f10, string5, "** ", string6, "  \n&nbsp;\n- **");
        a6.h.l(f10, string7, "** ", string8, "  \n&nbsp;\n- **");
        a6.h.l(f10, string9, "** ", string10, "  \n&nbsp;\n- **");
        return androidx.activity.f.o(f10, string11, "** ", string12);
    }

    public final am.b d2() {
        return (am.b) this.f24389t.getValue();
    }

    public final String e2() {
        String string = getString(R.string.arg_res_0x7f130209);
        String string2 = getString(R.string.arg_res_0x7f1301fe);
        String string3 = getString(R.string.arg_res_0x7f1301fa, a6.h.d("**", getString(R.string.arg_res_0x7f1301fb), "**"), a6.h.d("**", getString(R.string.arg_res_0x7f1301fc), "**"));
        String string4 = getString(R.string.arg_res_0x7f1301fd);
        String string5 = getString(R.string.arg_res_0x7f130203);
        String string6 = getString(R.string.arg_res_0x7f1301ff, a6.h.d("**", getString(R.string.arg_res_0x7f130200), "**"), a6.h.d("**", getString(R.string.arg_res_0x7f130201), "**"));
        String string7 = getString(R.string.arg_res_0x7f130202);
        String string8 = getString(R.string.arg_res_0x7f130208);
        String string9 = getString(R.string.arg_res_0x7f130204, a6.h.d("**", getString(R.string.arg_res_0x7f130205), "**"), a6.h.d("**", getString(R.string.arg_res_0x7f130206), "**"));
        String string10 = getString(R.string.arg_res_0x7f130207);
        StringBuilder f10 = android.support.v4.media.session.h.f("## ", string, "  \n&nbsp;  \n\n### ", string2, "  \n- ");
        a6.h.l(f10, string3, " \n- ", string4, "\n\n### ");
        a6.h.l(f10, string5, "  \n- ", string6, "\n- ");
        a6.h.l(f10, string7, "\n\n### ", string8, "  \n- ");
        return androidx.activity.f.o(f10, string9, " \n- ", string10);
    }

    public final String f2() {
        String string = getString(R.string.arg_res_0x7f130215);
        String string2 = getString(R.string.arg_res_0x7f13020a);
        String string3 = getString(R.string.arg_res_0x7f13020d);
        String string4 = getString(R.string.arg_res_0x7f13020b);
        String string5 = getString(R.string.arg_res_0x7f13020c);
        String string6 = getString(R.string.arg_res_0x7f13020f);
        String string7 = getString(R.string.arg_res_0x7f13020e);
        String string8 = getString(R.string.arg_res_0x7f130212);
        String string9 = getString(R.string.arg_res_0x7f130210);
        String string10 = getString(R.string.arg_res_0x7f130211);
        String string11 = getString(R.string.arg_res_0x7f130214);
        String string12 = getString(R.string.arg_res_0x7f130213);
        StringBuilder f10 = android.support.v4.media.session.h.f("## ", string, "  \n&nbsp;  \n\n", string2, "  \n&nbsp;  \n\n### ");
        a6.h.l(f10, string3, "  \n- ", string4, "\n- ");
        a6.h.l(f10, string5, "  \n\n### ", string6, "  \n- ");
        a6.h.l(f10, string7, "  \n\n### ", string8, "  \n- ");
        a6.h.l(f10, string9, "\n- ", string10, "  \n\n### ");
        return androidx.activity.f.o(f10, string11, "  \n", string12);
    }

    public final String g2() {
        String string = getString(R.string.arg_res_0x7f130225);
        String string2 = getString(R.string.arg_res_0x7f13021a);
        String string3 = getString(R.string.arg_res_0x7f130216);
        String string4 = getString(R.string.arg_res_0x7f130217);
        String string5 = getString(R.string.arg_res_0x7f130218);
        String string6 = getString(R.string.arg_res_0x7f130219);
        String string7 = getString(R.string.arg_res_0x7f13021d);
        String string8 = getString(R.string.arg_res_0x7f13021b);
        String string9 = getString(R.string.arg_res_0x7f13021c);
        String string10 = getString(R.string.arg_res_0x7f130222);
        String string11 = getString(R.string.arg_res_0x7f13021e);
        String string12 = getString(R.string.arg_res_0x7f13021f);
        String string13 = getString(R.string.arg_res_0x7f130220);
        String string14 = getString(R.string.arg_res_0x7f130221);
        String string15 = getString(R.string.arg_res_0x7f130224);
        String string16 = getString(R.string.arg_res_0x7f130223);
        StringBuilder f10 = android.support.v4.media.session.h.f("## ", string, "  \n&nbsp;  \n\n### ", string2, "  \n- **");
        a6.h.l(f10, string3, "**  \n", string4, "\n- **");
        a6.h.l(f10, string5, "**  \n", string6, "  \n\n### ");
        a6.h.l(f10, string7, "  \n- **", string8, "**  \n");
        a6.h.l(f10, string9, "  \n\n### ", string10, "  \n- **");
        a6.h.l(f10, string11, "**  \n", string12, "\n- **");
        a6.h.l(f10, string13, "**  \n", string14, "  \n\n### ");
        return androidx.activity.f.o(f10, string15, "  \n- ", string16);
    }

    public final void h2() {
        tn.a.b(this, ea.a.p("Umk=", "8ah8VDON"), ea.a.p("LmlWdRBkUl8payNwKmMEaVZr", "N33nwEFd"));
    }

    public final void i2() {
        String str = "";
        if (!BillingConfigImpl.c.w()) {
            if (this.A) {
                BaseSubscriptionActivity.a aVar = BaseSubscriptionActivity.L;
                String p10 = ea.a.p("UmM_aQVl", "5F2GsTNF");
                String str2 = this.f24395z;
                AIJumpTarget aIJumpTarget = new AIJumpTarget(AIHomeActivity.class, null, null, 6, null);
                aVar.getClass();
                BaseSubscriptionActivity.a.b(this, p10, str2, aIJumpTarget);
            } else {
                BaseSubscriptionActivity.a aVar2 = BaseSubscriptionActivity.L;
                String p11 = ea.a.p("LmNFaQ9l", "4fmRog26");
                String str3 = this.f24395z;
                AIQuickTag aIQuickTag = this.f24391v;
                String str4 = this.f24392w;
                if (str4 != null) {
                    str = str4;
                }
                AIJumpTarget aIJumpTarget2 = new AIJumpTarget(AIChatActivity.class, new AIChatPageParams(aIQuickTag, str, this.f24393x, this.f24394y), null, 4, null);
                aVar2.getClass();
                BaseSubscriptionActivity.a.b(this, p11, str3, aIJumpTarget2);
            }
        } else if (this.A) {
            AIHomeActivity.a aVar3 = AIHomeActivity.J;
            String str5 = this.f24395z;
            aVar3.getClass();
            AIHomeActivity.a.a(this, str5);
        } else {
            AIChatActivity.a aVar4 = AIChatActivity.f24356v0;
            AIQuickTag aIQuickTag2 = this.f24391v;
            String str6 = this.f24392w;
            if (str6 != null) {
                str = str6;
            }
            int i10 = this.f24393x;
            int i11 = this.f24394y;
            aVar4.getClass();
            AIChatActivity.a.a(this, aIQuickTag2, str, i10, i11);
        }
        pdf.pdfreader.viewer.editor.free.utils.q0.w(this, "need_show_ai_self_page_in_162", false);
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (d2().c.getVisibility() == 0) {
            h2();
            i2();
        }
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String e22;
        super.onCreate(bundle);
        com.gyf.immersionbar.g r4 = com.gyf.immersionbar.g.r(this);
        if (new com.gyf.immersionbar.a(this).f13751b) {
            r4.e(BarHide.FLAG_HIDE_NAVIGATION_BAR);
        }
        r4.p(d2().f742u);
        r4.f13799k.f13757d = false;
        r4.o(false);
        boolean z10 = true;
        r4.j(!pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this));
        r4.i(R.color.color_100_white_black);
        r4.h();
        r4.f();
        if (bundle == null) {
            d2().f728g.getViewTreeObserver().addOnGlobalLayoutListener(new e0(this));
            d2().c.postDelayed(new androidx.appcompat.widget.y0(this, 25), pdf.pdfreader.viewer.editor.free.utils.c1.c(this));
            AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
            AppCoreFilterEvent.g(ea.a.p("LmluaRd0UnI7Yz5pA2U=", "TjTNmt2P"));
            return;
        }
        String string = bundle.getString(ea.a.p("J2xfY1hUKWc=", "4nD63Huj"));
        if (string == null) {
            string = "";
        }
        this.E = string;
        int i10 = bundle.getInt(ea.a.p("Um44dxZyNnkCaVpnIG4yZXg=", "bZliScgV"), 0);
        d2().c.setVisibility(0);
        d2().f741t.setVisibility(0);
        if (this.E.length() != 0) {
            z10 = false;
        }
        if (z10) {
            d2().f724b.setTranslationY(0.0f);
            d2().f724b.setVisibility(0);
            return;
        }
        d2().f724b.setVisibility(8);
        d2().f739r.setVisibility(0);
        String str = this.E;
        if (kotlin.jvm.internal.g.a(str, getString(R.string.arg_res_0x7f13018c))) {
            d2().f739r.setText(R.string.arg_res_0x7f130226);
            e22 = g2();
        } else if (kotlin.jvm.internal.g.a(str, getString(R.string.arg_res_0x7f1304a3))) {
            d2().f739r.setText(R.string.arg_res_0x7f1304a4);
            e22 = f2();
        } else if (kotlin.jvm.internal.g.a(str, getString(R.string.arg_res_0x7f13001d))) {
            d2().f739r.setText(R.string.arg_res_0x7f13001e);
            e22 = c2();
        } else {
            d2().f739r.setText(R.string.arg_res_0x7f130185);
            e22 = e2();
        }
        String text = e22;
        d2().f731j.setVisibility(0);
        d2().f727f.setVisibility(0);
        d2().f734m.setVisibility(8);
        d2().f726e.setVisibility(0);
        TypingTextView typingTextView = d2().f738q;
        cg.p<CharSequence, Boolean, tf.d> pVar = new cg.p<CharSequence, Boolean, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AIExperienceActivity$endLayout$1
            {
                super(2);
            }

            @Override // cg.p
            public /* bridge */ /* synthetic */ tf.d invoke(CharSequence charSequence, Boolean bool) {
                invoke(charSequence, bool.booleanValue());
                return tf.d.f30009a;
            }

            public final void invoke(CharSequence text2, boolean z11) {
                kotlin.jvm.internal.g.e(text2, "text");
                if (z11) {
                    AIExperienceActivity.a2(AIExperienceActivity.this);
                    return;
                }
                AIExperienceActivity aIExperienceActivity = AIExperienceActivity.this;
                AIExperienceActivity.a aVar = AIExperienceActivity.L;
                aIExperienceActivity.d2().f733l.setVisibility(0);
                AIExperienceActivity.b2(AIExperienceActivity.this);
            }
        };
        typingTextView.getClass();
        kotlin.jvm.internal.g.e(text, "text");
        typingTextView.l(text, -1L, null, i10, pVar);
    }

    @Override // jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public final void onDestroy() {
        boolean z10;
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2;
        AnimatorSet animatorSet3;
        AnimatorSet animatorSet4;
        super.onDestroy();
        if (d2().f734m.h()) {
            d2().f734m.d();
        }
        if (d2().f735n.h()) {
            d2().f735n.d();
        }
        AnimatorSet animatorSet5 = this.F;
        boolean z13 = true;
        if (animatorSet5 != null && animatorSet5.isRunning()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && (animatorSet4 = this.F) != null) {
            animatorSet4.cancel();
        }
        AnimatorSet animatorSet6 = this.G;
        if (animatorSet6 != null && animatorSet6.isRunning()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && (animatorSet3 = this.G) != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet7 = this.I;
        if (animatorSet7 != null && animatorSet7.isRunning()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12 && (animatorSet2 = this.I) != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet8 = this.J;
        if (animatorSet8 == null || !animatorSet8.isRunning()) {
            z13 = false;
        }
        if (z13 && (animatorSet = this.J) != null) {
            animatorSet.cancel();
        }
        this.f24390u.removeCallbacks(this.H);
    }

    @Override // jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        if (!TextUtils.isEmpty(this.E)) {
            outState.putString(ea.a.p("LGxYYxJUVmc=", "UdQGtmMx"), this.E);
            CharSequence text = d2().f738q.getText();
            if (text == null) {
                text = "";
            }
            outState.putInt(ea.a.p("Um44dxZyNnkCaVpnIG4yZXg=", "l20o5D69"), text.length());
        }
    }
}
