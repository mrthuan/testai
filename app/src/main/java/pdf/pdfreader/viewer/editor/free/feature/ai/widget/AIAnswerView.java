package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import am.b2;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import kotlin.collections.m;
import lib.zj.office.fc.openxml4j.opc.PackagingURIHelper;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.db.AIAnswerContent;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIAnswerView;
import pdf.pdfreader.viewer.editor.free.utils.l0;
import qb.j0;

/* compiled from: AIAnswerView.kt */
/* loaded from: classes3.dex */
public final class AIAnswerView extends BaseBindingFrameLayout<b2> {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f24728g = 0;

    /* renamed from: b  reason: collision with root package name */
    public a f24729b;
    public cg.a<tf.d> c;

    /* renamed from: d  reason: collision with root package name */
    public cg.a<tf.d> f24730d;

    /* renamed from: e  reason: collision with root package name */
    public int f24731e;

    /* renamed from: f  reason: collision with root package name */
    public String f24732f;

    /* compiled from: AIAnswerView.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void a();

        void b();

        void c();

        void d(String str);

        void e(boolean z10);

        void f();
    }

    /* compiled from: AIAnswerView.kt */
    /* loaded from: classes3.dex */
    public static final class b extends l0 {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AIAnswerView f24733b;
        public final /* synthetic */ b2 c;

        public b(b2 b2Var, AIAnswerView aIAnswerView) {
            this.f24733b = aIAnswerView;
            this.c = b2Var;
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View v10) {
            kotlin.jvm.internal.g.e(v10, "v");
            a aVar = this.f24733b.f24729b;
            if (aVar != null) {
                aVar.d(this.c.f763p.getText().toString());
            }
        }
    }

    /* compiled from: AIAnswerView.kt */
    /* loaded from: classes3.dex */
    public static final class c extends l0 {
        public c() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View v10) {
            kotlin.jvm.internal.g.e(v10, "v");
            a aVar = AIAnswerView.this.f24729b;
            if (aVar != null) {
                aVar.b();
            }
        }
    }

    /* compiled from: AIAnswerView.kt */
    /* loaded from: classes3.dex */
    public static final class d extends l0 {
        public d() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.utils.l0
        public final void a(View v10) {
            kotlin.jvm.internal.g.e(v10, "v");
            a aVar = AIAnswerView.this.f24729b;
            if (aVar != null) {
                aVar.c();
            }
        }
    }

    /* compiled from: AIAnswerView.kt */
    /* loaded from: classes3.dex */
    public static final class e implements l4.d<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b2 f24736a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AIAnswerView f24737b;

        public e(b2 b2Var, AIAnswerView aIAnswerView) {
            this.f24736a = b2Var;
            this.f24737b = aIAnswerView;
        }

        @Override // l4.d
        public final void a(GlideException glideException) {
            this.f24736a.f760m.setVisibility(8);
        }

        @Override // l4.d
        public final void b(Object obj, DataSource dataSource) {
            cg.a<tf.d> onMindFirstLoadCallBack;
            Bitmap bitmap = (Bitmap) obj;
            if (dataSource == DataSource.REMOTE && (onMindFirstLoadCallBack = this.f24737b.getOnMindFirstLoadCallBack()) != null) {
                onMindFirstLoadCallBack.invoke();
            }
            this.f24736a.f760m.setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIAnswerView(Context context) {
        super(context);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "DukvU21b"));
        addOnLayoutChangeListener(new pdf.pdfreader.viewer.editor.free.feature.ai.widget.b(this, 0));
        this.f24732f = "";
    }

    public static void c(AIAnswerView aIAnswerView, int i10, int i11, int i12, int i13) {
        cg.a<tf.d> aVar;
        kotlin.jvm.internal.g.e(aIAnswerView, ea.a.p("RWgAc2ww", "pC1iH7M1"));
        if (i11 - i10 != i13 - i12 && (aVar = aIAnswerView.c) != null) {
            aVar.invoke();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final b2 a(LayoutInflater from) {
        kotlin.jvm.internal.g.e(from, "from");
        from.inflate(R.layout.layout_ai_answer_view, this);
        int i10 = R.id.ai_answer_cl_root;
        ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(this, R.id.ai_answer_cl_root);
        if (constraintLayout != null) {
            i10 = R.id.ai_chat_ll_unlock_guide_container;
            LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(this, R.id.ai_chat_ll_unlock_guide_container);
            if (linearLayout != null) {
                i10 = R.id.ai_chat_tv_unlock;
                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.ai_chat_tv_unlock);
                if (textView != null) {
                    i10 = R.id.ai_chat_tv_unlock_guide_title;
                    if (((AppCompatTextView) com.google.android.play.core.assetpacks.c.u(this, R.id.ai_chat_tv_unlock_guide_title)) != null) {
                        i10 = R.id.ai_chat_tv_unlock_guide_txt;
                        TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.ai_chat_tv_unlock_guide_txt);
                        if (textView2 != null) {
                            i10 = R.id.answer_fl_content_container;
                            FrameLayout frameLayout = (FrameLayout) com.google.android.play.core.assetpacks.c.u(this, R.id.answer_fl_content_container);
                            if (frameLayout != null) {
                                i10 = R.id.answer_iv_copy;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.answer_iv_copy);
                                if (appCompatImageView != null) {
                                    i10 = R.id.answer_iv_mind;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.answer_iv_mind);
                                    if (appCompatImageView2 != null) {
                                        i10 = R.id.answer_iv_next;
                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.answer_iv_next);
                                        if (appCompatImageView3 != null) {
                                            i10 = R.id.answer_iv_previous;
                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.answer_iv_previous);
                                            if (appCompatImageView4 != null) {
                                                i10 = R.id.answer_iv_reload;
                                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.answer_iv_reload);
                                                if (appCompatImageView5 != null) {
                                                    i10 = R.id.answer_iv_share;
                                                    AppCompatImageView appCompatImageView6 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.answer_iv_share);
                                                    if (appCompatImageView6 != null) {
                                                        i10 = R.id.answer_lottie_mind;
                                                        LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(this, R.id.answer_lottie_mind);
                                                        if (lottieAnimationView != null) {
                                                            i10 = R.id.answer_lottie_view;
                                                            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(this, R.id.answer_lottie_view);
                                                            if (lottieAnimationView2 != null) {
                                                                i10 = R.id.answer_page_group;
                                                                Group group = (Group) com.google.android.play.core.assetpacks.c.u(this, R.id.answer_page_group);
                                                                if (group != null) {
                                                                    i10 = R.id.answer_tv_content;
                                                                    TypingTextView typingTextView = (TypingTextView) com.google.android.play.core.assetpacks.c.u(this, R.id.answer_tv_content);
                                                                    if (typingTextView != null) {
                                                                        i10 = R.id.answer_tv_page;
                                                                        TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.answer_tv_page);
                                                                        if (textView3 != null) {
                                                                            b2 b2Var = new b2(this, constraintLayout, linearLayout, textView, textView2, frameLayout, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, lottieAnimationView, lottieAnimationView2, group, typingTextView, textView3);
                                                                            ea.a.p("Jm5XbBh0Uig8ciVtWSAcaFxzKQ==", "mh4DN3bc");
                                                                            return b2Var;
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
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpAGhVSRY6IA==", "tuR70MtJ").concat(getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final void b(Context context) {
        int i10;
        kotlin.jvm.internal.g.e(context, "context");
        b2 b2Var = (b2) this.f24761a;
        if (b2Var != null) {
            boolean j10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.j(context);
            ConstraintLayout constraintLayout = b2Var.f750b;
            LottieAnimationView lottieAnimationView = b2Var.f761n;
            if (j10) {
                lottieAnimationView.setRotationY(180.0f);
                constraintLayout.setBackgroundResource(R.drawable.bg_ai_answer_rtl);
            } else {
                lottieAnimationView.setRotationY(0.0f);
                constraintLayout.setBackgroundResource(R.drawable.bg_ai_answer);
            }
            boolean h10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.h(context);
            LottieAnimationView lottieAnimationView2 = b2Var.f760m;
            if (h10) {
                lottieAnimationView2.setAnimation(R.raw.ai_mind_holder_lottie_dark);
                i10 = R.drawable.bg_ai_mind_img_holder_dark;
            } else {
                lottieAnimationView2.setAnimation(R.raw.ai_mind_holder_lottie);
                i10 = R.drawable.bg_ai_mind_img_holder;
            }
            this.f24731e = i10;
            b2Var.f754g.setOnClickListener(new b(b2Var, this));
            b2Var.f759l.setOnClickListener(new c());
            b2Var.f758k.setOnClickListener(new d());
            b2Var.f757j.setOnClickListener(new d9.f(this, 2));
            b2Var.f756i.setOnClickListener(new j0(this, 2));
            String p10 = ea.a.p("Um44dxZyJGwxb1p0DG4iQytuRmEvbiZy", "x5pe9c50");
            FrameLayout frameLayout = b2Var.f753f;
            kotlin.jvm.internal.g.d(frameLayout, p10);
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(frameLayout, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIAnswerView$initView$1$6
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
                    AIAnswerView.a aVar = AIAnswerView.this.f24729b;
                    if (aVar != null) {
                        aVar.f();
                    }
                }
            });
            String p11 = ea.a.p("LmlyaBh0Y3YPbiZvFms=", "FX3PATIl");
            TextView textView = b2Var.f751d;
            kotlin.jvm.internal.g.d(textView, p11);
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(textView, new cg.l<View, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.widget.AIAnswerView$initView$1$7
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
                    AIAnswerView.a aVar = AIAnswerView.this.f24729b;
                    if (aVar != null) {
                        aVar.a();
                    }
                }
            });
        }
    }

    public final void d(int i10, int i11) {
        boolean z10;
        b2 b2Var = (b2) this.f24761a;
        if (b2Var != null) {
            boolean z11 = true;
            Group group = b2Var.f762o;
            if (i11 > 1) {
                group.setVisibility(0);
                if (i10 != 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b2Var.f757j.setEnabled(z10);
                b2Var.f764q.setText(i10 + PackagingURIHelper.FORWARD_SLASH_STRING + i11);
                if (i10 == i11) {
                    z11 = false;
                }
                b2Var.f756i.setEnabled(z11);
                return;
            }
            group.setVisibility(8);
        }
    }

    public final void e(km.a aVar, boolean z10, Boolean bool) {
        boolean z11;
        CharSequence charSequence;
        b2 b2Var = (b2) this.f24761a;
        if (b2Var != null && aVar != null) {
            ArrayList arrayList = aVar.f19893w;
            kotlin.jvm.internal.g.d(arrayList, ea.a.p("JnQfYRdzQGUoQyVuAWUGdA==", "ZyEgMmmi"));
            boolean z12 = true;
            int i10 = aVar.f19892v - 1;
            if (i10 < 0) {
                i10 = 0;
            }
            AIAnswerContent aIAnswerContent = (AIAnswerContent) m.t0(i10, arrayList);
            if (aIAnswerContent != null && aIAnswerContent.getType() == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            ConstraintLayout constraintLayout = b2Var.f750b;
            TypingTextView typingTextView = b2Var.f763p;
            AppCompatImageView appCompatImageView = b2Var.f755h;
            if (z11) {
                if (!z10 && kotlin.jvm.internal.g.a(bool, Boolean.TRUE)) {
                    appCompatImageView.setImageResource(0);
                }
                typingTextView.setVisibility(8);
                appCompatImageView.post(new ha.e(3, b2Var, aIAnswerContent, this));
                constraintLayout.setVisibility(0);
                appCompatImageView.setVisibility(0);
                d(aVar.f19892v, arrayList.size());
            } else {
                b2Var.f760m.setVisibility(8);
                constraintLayout.setVisibility(0);
                b2Var.f761n.setVisibility(8);
                appCompatImageView.setVisibility(8);
                appCompatImageView.setImageResource(0);
                typingTextView.setVisibility(0);
                if (aIAnswerContent != null) {
                    charSequence = aIAnswerContent.getSpanStr();
                } else {
                    charSequence = null;
                }
                typingTextView.setText(charSequence);
                d(aVar.f19892v, arrayList.size());
            }
            AppCompatImageView appCompatImageView2 = b2Var.f759l;
            AppCompatImageView appCompatImageView3 = b2Var.f758k;
            AppCompatImageView appCompatImageView4 = b2Var.f754g;
            if (z10) {
                appCompatImageView4.setVisibility(8);
                appCompatImageView3.setVisibility(8);
                appCompatImageView2.setVisibility(8);
            } else if (aVar.B) {
                appCompatImageView4.setVisibility(8);
                appCompatImageView3.setVisibility(8);
                appCompatImageView2.setVisibility(8);
            } else {
                if (aIAnswerContent == null || aIAnswerContent.getType() != 2) {
                    z12 = false;
                }
                if (z12) {
                    appCompatImageView4.setVisibility(8);
                } else {
                    appCompatImageView4.setVisibility(0);
                }
                appCompatImageView3.setVisibility(0);
                appCompatImageView2.setVisibility(0);
            }
        }
    }

    public final void f(String str, cg.l lVar) {
        tf.d dVar;
        b2 b2Var = (b2) this.f24761a;
        if (b2Var != null) {
            b2Var.f750b.setVisibility(0);
            AppCompatImageView appCompatImageView = b2Var.f755h;
            appCompatImageView.setVisibility(8);
            appCompatImageView.setBackgroundResource(0);
            TypingTextView typingTextView = b2Var.f763p;
            typingTextView.setVisibility(0);
            b2Var.f761n.setVisibility(8);
            b2Var.f760m.setVisibility(8);
            if (kotlin.jvm.internal.g.a(this.f24732f, str)) {
                CharSequence charSequence = pdf.pdfreader.viewer.editor.free.feature.ai.typing.c.f24355e;
                if (charSequence != null) {
                    typingTextView.setText(charSequence);
                    dVar = tf.d.f30009a;
                } else {
                    dVar = null;
                }
                if (dVar == null) {
                    typingTextView.setText("");
                }
                pdf.pdfreader.viewer.editor.free.feature.ai.typing.c.c = new pdf.pdfreader.viewer.editor.free.feature.ai.widget.d(this, str, b2Var, lVar);
            }
            b2Var.f754g.setVisibility(8);
            b2Var.f758k.setVisibility(8);
            b2Var.f759l.setVisibility(8);
            b2Var.f762o.setVisibility(8);
        }
    }

    public final int getHolder() {
        return this.f24731e;
    }

    public final cg.a<tf.d> getOnHeightChange() {
        return this.c;
    }

    public final cg.a<tf.d> getOnMindFirstLoadCallBack() {
        return this.f24730d;
    }

    @Override // android.view.View
    public final String getTag() {
        return this.f24732f;
    }

    public final void setHolder(int i10) {
        this.f24731e = i10;
    }

    public final void setOnAIAnswerListener(a aVar) {
        this.f24729b = aVar;
    }

    public final void setOnHeightChange(cg.a<tf.d> aVar) {
        this.c = aVar;
    }

    public final void setOnMindFirstLoadCallBack(cg.a<tf.d> aVar) {
        this.f24730d = aVar;
    }

    public final void setTag(String str) {
        this.f24732f = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIAnswerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "aNsjG8KO"));
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.widget.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                AIAnswerView.c(AIAnswerView.this, i11, i13, i15, i17);
            }
        });
        this.f24732f = "";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIAnswerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "TXB4QBZM"));
        addOnLayoutChangeListener(new pdf.pdfreader.viewer.editor.free.feature.ai.widget.c(this, 0));
        this.f24732f = "";
    }
}
