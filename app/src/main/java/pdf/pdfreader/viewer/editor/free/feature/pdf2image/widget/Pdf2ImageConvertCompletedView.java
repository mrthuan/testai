package pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget;

import am.t2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import cg.l;
import com.bumptech.glide.Priority;
import com.bumptech.glide.b;
import java.util.List;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2image.data.ImageFileInfo;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertBottomView;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;
import pdf.pdfreader.viewer.editor.free.ui.widget.RoundRecImageView;
import pdf.pdfreader.viewer.editor.free.utils.e1;
import pdf.pdfreader.viewer.editor.free.utils.extension.c;
import pdf.pdfreader.viewer.editor.free.utils.v;
import tf.d;

/* compiled from: Pdf2ImageConvertCompletedView.kt */
/* loaded from: classes3.dex */
public final class Pdf2ImageConvertCompletedView extends BasePdfConvertCompletedView<List<? extends ImageFileInfo>> {

    /* renamed from: e  reason: collision with root package name */
    public List<ImageFileInfo> f25572e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f25573f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pdf2ImageConvertCompletedView(Context context) {
        super(context);
        g.e(context, ea.a.p("Nm9ZdD94dA==", "scU7ZHOf"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView, pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final void b(final Context context) {
        g.e(context, "context");
        super.b(context);
        t2 t2Var = (t2) this.f24761a;
        if (t2Var != null) {
            t2Var.f1482n.setVisibility(8);
            AppCompatTextView appCompatTextView = t2Var.f1477i;
            appCompatTextView.setText(R.string.arg_res_0x7f13044d);
            AppCompatTextView appCompatTextView2 = t2Var.f1475g;
            appCompatTextView2.setText(R.string.arg_res_0x7f1303ef);
            g.d(appCompatTextView, ea.a.p("XHAuchJ0B1MaYUZlPXY=", "SJiD6gbO"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatTextView, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView$initView$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(View view) {
                    invoke2(view);
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    BasePdfConvertCompletedView.a<List<? extends ImageFileInfo>> childListener;
                    g.e(it, "it");
                    Pdf2ImageConvertCompletedView pdf2ImageConvertCompletedView = Pdf2ImageConvertCompletedView.this;
                    if (pdf2ImageConvertCompletedView.f25573f || (childListener = pdf2ImageConvertCompletedView.getChildListener()) == null) {
                        return;
                    }
                    childListener.e(context, Pdf2ImageConvertCompletedView.this.f25572e);
                }
            });
            g.d(appCompatTextView2, ea.a.p("XHAuchJ0B08CZVpUdg==", "NaEpYriS"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatTextView2, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView$initView$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(View view) {
                    invoke2(view);
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    g.e(it, "it");
                    BasePdfConvertCompletedView.a<List<? extends ImageFileInfo>> childListener = Pdf2ImageConvertCompletedView.this.getChildListener();
                    if (childListener != null) {
                        childListener.b(context, Pdf2ImageConvertCompletedView.this.f25572e);
                    }
                }
            });
        }
    }

    public final void e() {
        ProgressView progressView;
        AppCompatTextView appCompatTextView;
        if (getVisibility() == 0) {
            this.f25573f = false;
            t2 t2Var = (t2) this.f24761a;
            if (t2Var != null && (appCompatTextView = t2Var.f1477i) != null) {
                appCompatTextView.setText(R.string.arg_res_0x7f13044d);
            }
            t2 t2Var2 = (t2) this.f24761a;
            if (t2Var2 != null) {
                progressView = t2Var2.f1480l;
            } else {
                progressView = null;
            }
            if (progressView != null) {
                progressView.setVisibility(8);
            }
        }
    }

    public final void f(List<ImageFileInfo> list, boolean z10) {
        boolean z11;
        t2 t2Var;
        int i10;
        this.f25572e = list;
        List<ImageFileInfo> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11 && (t2Var = (t2) this.f24761a) != null) {
            BasePdfConvertCompletedView.a<List<? extends ImageFileInfo>> childListener = getChildListener();
            if (childListener != null) {
                childListener.a();
            }
            setVisibility(0);
            AppCompatTextView appCompatTextView = t2Var.f1481m;
            appCompatTextView.setVisibility(0);
            Pdf2WordConvertBottomView pdf2WordConvertBottomView = t2Var.f1472d;
            if (z10) {
                pdf2WordConvertBottomView.setEnquiryTitle(pdf2WordConvertBottomView.getContext().getString(R.string.arg_res_0x7f130445, pdf2WordConvertBottomView.getContext().getString(R.string.arg_res_0x7f130340)));
            } else {
                pdf2WordConvertBottomView.setEnquiryTitle(pdf2WordConvertBottomView.getContext().getString(R.string.arg_res_0x7f130445, pdf2WordConvertBottomView.getContext().getString(R.string.arg_res_0x7f13033f)));
            }
            int size = list.size();
            TextView textView = t2Var.f1483o;
            if (size == 1) {
                textView.setText(getResources().getString(R.string.arg_res_0x7f130598, String.valueOf(list.size())));
            } else {
                textView.setText(getResources().getString(R.string.arg_res_0x7f130599, String.valueOf(list.size())));
            }
            appCompatTextView.setText(String.valueOf(list.size()));
            try {
                RoundRecImageView roundRecImageView = t2Var.f1478j;
                Context context = getContext();
                g.d(context, ea.a.p("LG9fdBx4dA==", "IuFj8ACp"));
                if (c.h(context)) {
                    i10 = R.drawable.ic_convert_unavailable_night;
                } else {
                    i10 = R.drawable.ic_convert_unavailable;
                }
                long o10 = v.o(list.get(0).getFilePath());
                Context context2 = getContext();
                if (context2 != null) {
                    ea.a.p("UG8ldBZ4dA==", "yuDW63N5");
                    b.c(context2).f(context2).o(list.get(0).getFilePath()).u(new o4.d(Long.valueOf(o10))).j(i10).c().h().q(Priority.NORMAL).E(roundRecImageView);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                d dVar = d.f30009a;
            }
        }
    }

    public final void g(List<ImageFileInfo> list, boolean z10) {
        if (list != null) {
            f(list, z10);
            t2 t2Var = (t2) this.f24761a;
            if (t2Var != null) {
                d(t2Var.f1484p, t2Var.f1479k, t2Var.f1483o, t2Var.f1482n, t2Var.f1476h, t2Var.f1474f, t2Var.f1472d);
            }
        }
    }

    public final void h() {
        AppCompatTextView appCompatTextView;
        if (getVisibility() == 0) {
            this.f25573f = true;
            t2 t2Var = (t2) this.f24761a;
            ProgressView progressView = null;
            if (t2Var != null) {
                appCompatTextView = t2Var.f1477i;
            } else {
                appCompatTextView = null;
            }
            if (appCompatTextView != null) {
                appCompatTextView.setText("");
            }
            t2 t2Var2 = (t2) this.f24761a;
            if (t2Var2 != null) {
                progressView = t2Var2.f1480l;
            }
            if (progressView != null) {
                progressView.setVisibility(0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pdf2ImageConvertCompletedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g.e(context, ea.a.p("UG8ldBZ4dA==", "K0n0tzGB"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pdf2ImageConvertCompletedView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, ea.a.p("UG8ldBZ4dA==", "yTu9Xraq"));
    }

    /* compiled from: Pdf2ImageConvertCompletedView.kt */
    /* loaded from: classes3.dex */
    public static abstract class a implements BasePdfConvertCompletedView.a<List<? extends ImageFileInfo>> {
        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public final void c(Context context, PdfPreviewEntity pdfPreviewEntity) {
            List list = (List) pdfPreviewEntity;
            g.e(context, "context");
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        /* renamed from: g */
        public void b(Context context, List<ImageFileInfo> list) {
            g.e(context, "context");
            if (list != null) {
                e1.g(context, list);
            }
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        /* renamed from: h */
        public void e(Context context, List<ImageFileInfo> list) {
            g.e(context, "context");
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public void a() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public final void d() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public final void f() {
        }
    }
}
