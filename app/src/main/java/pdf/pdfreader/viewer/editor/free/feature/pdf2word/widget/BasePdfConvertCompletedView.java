package pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget;

import am.j2;
import am.t2;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.emoji2.text.h;
import cg.l;
import com.airbnb.lottie.LottieAnimationView;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;
import pdf.pdfreader.viewer.editor.free.ui.widget.RoundRecImageView;
import tf.d;

/* compiled from: BasePdfConvertCompletedView.kt */
/* loaded from: classes3.dex */
public abstract class BasePdfConvertCompletedView<T> extends BaseBindingFrameLayout<t2> {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f25599d = 0;

    /* renamed from: b  reason: collision with root package name */
    public a<T> f25600b;
    public final int c;

    /* compiled from: BasePdfConvertCompletedView.kt */
    /* loaded from: classes3.dex */
    public interface a<T> {
        void a();

        void b(Context context, T t4);

        void c(Context context, PdfPreviewEntity pdfPreviewEntity);

        void close();

        void d();

        void e(Context context, List list);

        void f();
    }

    /* compiled from: BasePdfConvertCompletedView.kt */
    /* loaded from: classes3.dex */
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t2 f25601a;

        public b(t2 t2Var) {
            this.f25601a = t2Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animation) {
            g.e(animation, "animation");
            super.onAnimationEnd(animation);
            this.f25601a.f1471b.j();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePdfConvertCompletedView(Context context) {
        super(context);
        g.e(context, ea.a.p("UG8ldBZ4dA==", "kwWcuz0K"));
        this.c = ReaderPdfApplication.m().getResources().getDimensionPixelSize(R.dimen.dp_40);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final t2 a(LayoutInflater from) {
        g.e(from, "from");
        View inflate = from.inflate(R.layout.layout_pdf_convert_completed, (ViewGroup) this, false);
        addView(inflate);
        int i10 = R.id.doneAnimView;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.doneAnimView);
        if (lottieAnimationView != null) {
            i10 = R.id.guideCenter;
            if (((Guideline) com.google.android.play.core.assetpacks.c.u(inflate, R.id.guideCenter)) != null) {
                i10 = R.id.ivTopBg;
                if (((AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.ivTopBg)) != null) {
                    i10 = R.id.operateCloseImg;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.operateCloseImg);
                    if (appCompatImageView != null) {
                        i10 = R.id.operateFl_enquiry;
                        Pdf2WordConvertBottomView pdf2WordConvertBottomView = (Pdf2WordConvertBottomView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.operateFl_enquiry);
                        if (pdf2WordConvertBottomView != null) {
                            i10 = R.id.operateHomeImg;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.operateHomeImg);
                            if (appCompatImageView2 != null) {
                                i10 = R.id.operateOpenCon;
                                ConstraintLayout constraintLayout = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.operateOpenCon);
                                if (constraintLayout != null) {
                                    i10 = R.id.operateOpenTv;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.operateOpenTv);
                                    if (appCompatTextView != null) {
                                        i10 = R.id.operateSaveCon;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.operateSaveCon);
                                        if (constraintLayout2 != null) {
                                            i10 = R.id.operateShareTv;
                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.operateShareTv);
                                            if (appCompatTextView2 != null) {
                                                i10 = R.id.pdf_cover;
                                                RoundRecImageView roundRecImageView = (RoundRecImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.pdf_cover);
                                                if (roundRecImageView != null) {
                                                    i10 = R.id.rv_pdf_cover;
                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.rv_pdf_cover);
                                                    if (constraintLayout3 != null) {
                                                        i10 = R.id.save_progress;
                                                        ProgressView progressView = (ProgressView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.save_progress);
                                                        if (progressView != null) {
                                                            i10 = R.id.tv_page;
                                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_page);
                                                            if (appCompatTextView3 != null) {
                                                                i10 = R.id.tv_path;
                                                                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_path);
                                                                if (textView != null) {
                                                                    i10 = R.id.tv_title;
                                                                    TextView textView2 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_title);
                                                                    if (textView2 != null) {
                                                                        i10 = R.id.tvTitleTips;
                                                                        TextView textView3 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tvTitleTips);
                                                                        if (textView3 != null) {
                                                                            i10 = R.id.tvToast;
                                                                            if (((TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tvToast)) != null) {
                                                                                i10 = R.id.tv_word_flg;
                                                                                TextView textView4 = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_word_flg);
                                                                                if (textView4 != null) {
                                                                                    i10 = R.id.view_tools_status_bar_02;
                                                                                    View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.view_tools_status_bar_02);
                                                                                    if (u7 != null) {
                                                                                        t2 t2Var = new t2((ConstraintLayout) inflate, lottieAnimationView, appCompatImageView, pdf2WordConvertBottomView, appCompatImageView2, constraintLayout, appCompatTextView, constraintLayout2, appCompatTextView2, roundRecImageView, constraintLayout3, progressView, appCompatTextView3, textView, textView2, textView3, textView4, u7);
                                                                                        ea.a.p("Jm5XbBh0Uig8ciVtWSAcaFxzQiAxchBlKQ==", "lvKnIQ4O");
                                                                                        return t2Var;
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
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpQGh0SRc6IA==", "4TSPxQAN").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public void b(Context context) {
        g.e(context, "context");
        t2 t2Var = (t2) this.f24761a;
        if (t2Var != null) {
            View view = t2Var.f1486r;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = aj.b.B(context);
            view.setLayoutParams(layoutParams);
            String p10 = ea.a.p("IHBUchh0UkM2bzllPG1n", "euBV8luZ");
            AppCompatImageView appCompatImageView = t2Var.c;
            g.d(appCompatImageView, p10);
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new l<View, d>(this) { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView$initView$1$1
                final /* synthetic */ BasePdfConvertCompletedView<T> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                    this.this$0 = this;
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(View view2) {
                    invoke2(view2);
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    g.e(it, "it");
                    BasePdfConvertCompletedView.a childListener = this.this$0.getChildListener();
                    if (childListener != null) {
                        childListener.close();
                    }
                }
            });
        }
    }

    public final void c() {
        t2 t2Var;
        Pdf2WordConvertBottomView pdf2WordConvertBottomView;
        Context context;
        if (getVisibility() == 0 && (t2Var = (t2) this.f24761a) != null && (pdf2WordConvertBottomView = t2Var.f1472d) != null) {
            if (pdf2WordConvertBottomView.getVisibility() == 0 && wn.b.f31393i) {
                wn.b.f31393i = false;
                try {
                    View rootView = pdf2WordConvertBottomView.getRootView();
                    if (rootView != null) {
                        context = rootView.getContext();
                    } else {
                        context = null;
                    }
                    new i(context).show();
                } catch (Exception unused) {
                }
                if (pdf2WordConvertBottomView.c) {
                    j2 j2Var = (j2) pdf2WordConvertBottomView.f24761a;
                    if (j2Var != null) {
                        j2Var.f1010g.setImageResource(R.drawable.img_enquiry_notreally_check);
                        j2Var.f1011h.setEnabled(false);
                        j2Var.c.setVisibility(8);
                        j2Var.f1014k.setEnabled(false);
                        j2Var.f1007d.setEnabled(false);
                    }
                } else {
                    pdf2WordConvertBottomView.c();
                }
            }
            pdf2WordConvertBottomView.c = false;
        }
    }

    public final void d(View... viewArr) {
        View[] viewArr2;
        t2 t2Var = (t2) this.f24761a;
        if (t2Var != null) {
            for (View view : (View[]) Arrays.copyOf(viewArr, viewArr.length)) {
                if (view != null) {
                    view.setAlpha(0.0f);
                    view.setTranslationY(this.c);
                }
            }
            post(new h(7, viewArr, this, t2Var));
        }
    }

    public final a<T> getChildListener() {
        return this.f25600b;
    }

    public final void setChildListener(a<T> aVar) {
        this.f25600b = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePdfConvertCompletedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g.e(context, ea.a.p("UG8ldBZ4dA==", "YAqvSK4q"));
        this.c = ReaderPdfApplication.m().getResources().getDimensionPixelSize(R.dimen.dp_40);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePdfConvertCompletedView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, ea.a.p("LG9fdBx4dA==", "X4FV1yYs"));
        this.c = ReaderPdfApplication.m().getResources().getDimensionPixelSize(R.dimen.dp_40);
    }
}
