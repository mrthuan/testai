package pdf.pdfreader.viewer.editor.free.feature.ai.widget;

import am.i2;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.AskQuestionView;

/* compiled from: AskQuestionView.kt */
/* loaded from: classes3.dex */
public final class AskQuestionView extends FrameLayout {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ int f24747k = 0;

    /* renamed from: a  reason: collision with root package name */
    public i2 f24748a;

    /* renamed from: b  reason: collision with root package name */
    public a f24749b;
    public cg.a<tf.d> c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f24750d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f24751e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f24752f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f24753g;

    /* renamed from: h  reason: collision with root package name */
    public final int f24754h;

    /* renamed from: i  reason: collision with root package name */
    public int f24755i;

    /* renamed from: j  reason: collision with root package name */
    public ValueAnimator f24756j;

    /* compiled from: AskQuestionView.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void D0(e eVar);

        void L0();

        void e0();

        void r(String str);

        void z(d dVar);
    }

    /* compiled from: AskQuestionView.kt */
    /* loaded from: classes3.dex */
    public interface b {
        void a(boolean z10);
    }

    /* compiled from: AskQuestionView.kt */
    /* loaded from: classes3.dex */
    public interface c {
        void a(Boolean bool, Boolean bool2);
    }

    /* compiled from: AskQuestionView.kt */
    /* loaded from: classes3.dex */
    public static final class d implements c {
        public d() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.AskQuestionView.c
        public final void a(Boolean bool, Boolean bool2) {
            AskQuestionView askQuestionView = AskQuestionView.this;
            if (bool != null) {
                askQuestionView.f24750d = bool.booleanValue();
            }
            if (bool2 != null) {
                askQuestionView.f24752f = bool2.booleanValue();
            }
            i2 i2Var = askQuestionView.f24748a;
            if (i2Var != null) {
                boolean z10 = askQuestionView.f24750d;
                boolean z11 = false;
                AppCompatImageView appCompatImageView = i2Var.f986d;
                if (z10) {
                    appCompatImageView.setEnabled(true);
                    appCompatImageView.setSelected(false);
                    return;
                }
                if (askQuestionView.f24752f && !TextUtils.isEmpty(i2Var.c.getText())) {
                    z11 = true;
                }
                appCompatImageView.setEnabled(z11);
                appCompatImageView.setSelected(true);
            }
        }
    }

    /* compiled from: AskQuestionView.kt */
    /* loaded from: classes3.dex */
    public static final class e implements b {
        public e() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.AskQuestionView.b
        public final void a(boolean z10) {
            AskQuestionView askQuestionView = AskQuestionView.this;
            askQuestionView.f24753g = z10;
            askQuestionView.b(z10);
        }
    }

    /* compiled from: AskQuestionView.kt */
    /* loaded from: classes3.dex */
    public static final class f extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f24759a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f24760b;

        public f(View view, boolean z10) {
            this.f24759a = view;
            this.f24760b = z10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            int i10;
            kotlin.jvm.internal.g.e(animation, "animation");
            super.onAnimationEnd(animation);
            if (this.f24760b) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.f24759a.setVisibility(i10);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskQuestionView(Context context) {
        super(context);
        kotlin.jvm.internal.g.e(context, ea.a.p("Wm8gdCN4dA==", "pf9NFI9v"));
        this.f24751e = true;
        this.f24754h = 400;
        a(context);
    }

    public final void a(Context context) {
        AppCompatImageView appCompatImageView;
        LayoutInflater.from(context).inflate(R.layout.layout_ask_question_view, this);
        int i10 = R.id.ask_cl_root;
        ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(this, R.id.ask_cl_root);
        if (constraintLayout != null) {
            i10 = R.id.ask_edit_content;
            EditText editText = (EditText) com.google.android.play.core.assetpacks.c.u(this, R.id.ask_edit_content);
            if (editText != null) {
                i10 = R.id.ask_iv_send;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.ask_iv_send);
                if (appCompatImageView2 != null) {
                    i10 = R.id.ask_iv_upload;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(this, R.id.ask_iv_upload);
                    if (appCompatImageView3 != null) {
                        i10 = R.id.ask_tv_content_length;
                        TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(this, R.id.ask_tv_content_length);
                        if (textView != null) {
                            this.f24748a = new i2(this, constraintLayout, editText, appCompatImageView2, appCompatImageView3, textView);
                            textView.setVisibility(4);
                            appCompatImageView2.setEnabled(false);
                            appCompatImageView2.setSelected(true);
                            if (this.f24751e) {
                                appCompatImageView3.setVisibility(8);
                            }
                            i2 i2Var = this.f24748a;
                            if (i2Var != null) {
                                i2Var.f987e.setOnClickListener(new i(this));
                                i2Var.f986d.setOnClickListener(new j(this, i2Var));
                                String g10 = a6.h.g(a0.d.g(getContext().getString(R.string.arg_res_0x7f13007d), "(0/"), this.f24754h, ")");
                                EditText editText2 = i2Var.c;
                                editText2.setHint(g10);
                                editText2.addTextChangedListener(new k(this, i2Var));
                            }
                            if (this.f24751e) {
                                i2 i2Var2 = this.f24748a;
                                if (i2Var2 != null) {
                                    appCompatImageView = i2Var2.f987e;
                                } else {
                                    appCompatImageView = null;
                                }
                                if (appCompatImageView != null) {
                                    appCompatImageView.setVisibility(8);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpGmhUSTI6IA==", "P2jYntvL").concat(getResources().getResourceName(i10)));
    }

    public final void b(boolean z10) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        Editable editable = null;
        boolean z11 = false;
        if (z10) {
            EditText editContentView = getEditContentView();
            if (editContentView != null) {
                editable = editContentView.getText();
            }
            if (TextUtils.isEmpty(editable)) {
                c(false);
                return;
            }
            ValueAnimator valueAnimator3 = this.f24756j;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                z11 = true;
            }
            if (z11 && (valueAnimator2 = this.f24756j) != null) {
                valueAnimator2.cancel();
            }
            View ivUploadView = getIvUploadView();
            if (ivUploadView != null) {
                ivUploadView.setVisibility(8);
                return;
            }
            return;
        }
        EditText editContentView2 = getEditContentView();
        if (editContentView2 != null) {
            editable = editContentView2.getText();
        }
        if (TextUtils.isEmpty(editable)) {
            c(true);
            return;
        }
        ValueAnimator valueAnimator4 = this.f24756j;
        if (valueAnimator4 != null && valueAnimator4.isRunning()) {
            z11 = true;
        }
        if (z11 && (valueAnimator = this.f24756j) != null) {
            valueAnimator.cancel();
        }
        View ivUploadView2 = getIvUploadView();
        if (ivUploadView2 != null) {
            ivUploadView2.setVisibility(8);
        }
    }

    public final void c(final boolean z10) {
        boolean z11;
        float f10;
        boolean z12;
        boolean z13;
        ValueAnimator valueAnimator;
        final View ivUploadView = getIvUploadView();
        if (ivUploadView != null) {
            if (this.f24755i == 0) {
                this.f24755i = ivUploadView.getContext().getResources().getDimensionPixelSize(R.dimen.dp_40);
            }
            ValueAnimator valueAnimator2 = this.f24756j;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && (valueAnimator = this.f24756j) != null) {
                valueAnimator.cancel();
            }
            if (z10) {
                if (ivUploadView.getVisibility() == 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 && ivUploadView.getLayoutParams().width == this.f24755i) {
                    return;
                }
            }
            if (!z10) {
                if (ivUploadView.getVisibility() == 8) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12 && ivUploadView.getLayoutParams().width == 0) {
                    return;
                }
            }
            ivUploadView.setVisibility(0);
            float f11 = 0.0f;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (z10) {
                f11 = 1.0f;
            }
            final ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
            ofFloat.setDuration(300L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.ai.widget.h
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    int i10 = AskQuestionView.f24747k;
                    String p10 = ea.a.p("QXRRaQFfF3Vu", "Xfe9rekx");
                    View view = ivUploadView;
                    kotlin.jvm.internal.g.e(view, p10);
                    String p11 = ea.a.p("O2hYc10w", "xVuGVpb1");
                    AskQuestionView askQuestionView = this;
                    kotlin.jvm.internal.g.e(askQuestionView, p11);
                    kotlin.jvm.internal.g.e(valueAnimator3, ea.a.p("Um4ibRJ0C29u", "UR3qa2Nm"));
                    Object animatedValue = valueAnimator3.getAnimatedValue();
                    kotlin.jvm.internal.g.c(animatedValue, ea.a.p("V3UUbGljBW4mbxIgVmV3Y1lzJiA9bxZuG25cbiRsLiBNeQhlaWsLdCRpCC5ybDhhdA==", "jm9xIdbA"));
                    float floatValue = ((Float) animatedValue).floatValue();
                    view.setAlpha(floatValue);
                    int i11 = (int) (floatValue * askQuestionView.f24755i);
                    view.getLayoutParams().height = i11;
                    view.getLayoutParams().width = i11;
                    view.setLayoutParams(view.getLayoutParams());
                    ofFloat.addListener(new AskQuestionView.f(view, z10));
                }
            });
            ofFloat.start();
            this.f24756j = ofFloat;
        }
    }

    public final EditText getEditContentView() {
        i2 i2Var = this.f24748a;
        if (i2Var != null) {
            return i2Var.c;
        }
        return null;
    }

    public final cg.a<tf.d> getEditTextChangedListener() {
        return this.c;
    }

    public final View getIvUploadView() {
        i2 i2Var = this.f24748a;
        if (i2Var != null) {
            return i2Var.f987e;
        }
        return null;
    }

    public final ImageView getSendImageView() {
        i2 i2Var = this.f24748a;
        if (i2Var != null) {
            return i2Var.f986d;
        }
        return null;
    }

    public final void setEditTextChangedListener(cg.a<tf.d> aVar) {
        this.c = aVar;
    }

    public final void setHideUploadFile(boolean z10) {
        AppCompatImageView appCompatImageView;
        this.f24751e = z10;
        if (z10) {
            i2 i2Var = this.f24748a;
            if (i2Var != null) {
                appCompatImageView = i2Var.f987e;
            } else {
                appCompatImageView = null;
            }
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
                return;
            }
            return;
        }
        b(this.f24753g);
    }

    public final void setOnAskQuestionClickListener(a aVar) {
        this.f24749b = aVar;
        if (aVar != null) {
            aVar.z(new d());
        }
        if (aVar != null) {
            aVar.D0(new e());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskQuestionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "MXurD0o7"));
        this.f24751e = true;
        this.f24754h = 400;
        a(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AskQuestionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "Ef5g9XCd"));
        this.f24751e = true;
        this.f24754h = 400;
        a(context);
    }
}
