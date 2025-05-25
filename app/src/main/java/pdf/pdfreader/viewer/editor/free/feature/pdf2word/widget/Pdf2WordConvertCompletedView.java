package pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget;

import am.t2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import cg.l;
import com.bumptech.glide.Priority;
import com.bumptech.glide.e;
import java.util.List;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.n;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;
import pdf.pdfreader.viewer.editor.free.ui.vm.AppViewModel;
import pdf.pdfreader.viewer.editor.free.ui.widget.RoundRecImageView;
import pdf.pdfreader.viewer.editor.free.utils.e1;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.k0;
import pdf.pdfreader.viewer.editor.free.utils.v;
import tf.d;

/* compiled from: Pdf2WordConvertCompletedView.kt */
/* loaded from: classes3.dex */
public final class Pdf2WordConvertCompletedView extends BasePdfConvertCompletedView<PdfPreviewEntity> {

    /* renamed from: e  reason: collision with root package name */
    public PdfPreviewEntity f25606e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pdf2WordConvertCompletedView(Context context) {
        super(context);
        g.e(context, ea.a.p("BG8tdD94dA==", "8HgCZ7rv"));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView, pdf.pdfreader.viewer.editor.free.feature.ai.widget.BaseBindingFrameLayout
    public final void b(final Context context) {
        g.e(context, "context");
        super.b(context);
        t2 t2Var = (t2) this.f24761a;
        if (t2Var != null) {
            t2Var.f1485q.setVisibility(0);
            t2Var.c.setImageResource(R.drawable.ic_img2pdf_close);
            AppCompatImageView appCompatImageView = t2Var.f1473e;
            appCompatImageView.setVisibility(0);
            String p10 = ea.a.p("XHAuchJ0B1MaYUZlPXY=", "52r9G4GJ");
            AppCompatTextView appCompatTextView = t2Var.f1477i;
            g.d(appCompatTextView, p10);
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatTextView, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertCompletedView$initView$1$1
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
                    BasePdfConvertCompletedView.a<PdfPreviewEntity> childListener = Pdf2WordConvertCompletedView.this.getChildListener();
                    if (childListener != null) {
                        childListener.b(context, Pdf2WordConvertCompletedView.this.f25606e);
                    }
                }
            });
            String p11 = ea.a.p("XHAuchJ0B08CZVpUdg==", "crqQsSt8");
            AppCompatTextView appCompatTextView2 = t2Var.f1475g;
            g.d(appCompatTextView2, p11);
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatTextView2, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertCompletedView$initView$1$2
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
                    BasePdfConvertCompletedView.a<PdfPreviewEntity> childListener = Pdf2WordConvertCompletedView.this.getChildListener();
                    if (childListener != null) {
                        childListener.c(context, Pdf2WordConvertCompletedView.this.f25606e);
                    }
                }
            });
            g.d(appCompatImageView, ea.a.p("IHBUchh0Ukg1bS9JGGc=", "jCwLrVdz"));
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(appCompatImageView, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertCompletedView$initView$1$3
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
                    BasePdfConvertCompletedView.a<PdfPreviewEntity> childListener = Pdf2WordConvertCompletedView.this.getChildListener();
                    if (childListener != null) {
                        childListener.f();
                    }
                }
            });
        }
    }

    public final void e(String str, PdfPreviewEntity pdfPreviewEntity) {
        t2 t2Var;
        int i10;
        String str2;
        this.f25606e = pdfPreviewEntity;
        if (pdfPreviewEntity != null && (t2Var = (t2) this.f24761a) != null) {
            BasePdfConvertCompletedView.a<PdfPreviewEntity> childListener = getChildListener();
            if (childListener != null) {
                childListener.a();
            }
            setVisibility(0);
            Pdf2WordConvertBottomView pdf2WordConvertBottomView = t2Var.f1472d;
            pdf2WordConvertBottomView.setEnquiryTitle(pdf2WordConvertBottomView.getContext().getString(R.string.arg_res_0x7f130445, pdf2WordConvertBottomView.getContext().getString(R.string.arg_res_0x7f1301a7)));
            t2Var.f1483o.setText(v.p(pdfPreviewEntity.getPath()));
            t2Var.f1482n.setText(pdfPreviewEntity.getPath());
            t2Var.f1481m.setText(String.valueOf(pdfPreviewEntity.getPage()));
            if (pdfPreviewEntity.isOtherBoolOne()) {
                i10 = R.drawable.ic_pwd;
            } else {
                i10 = R.drawable.ic_placeholder;
            }
            try {
                RoundRecImageView roundRecImageView = t2Var.f1478j;
                if (str != null) {
                    if (getContext() != null) {
                        ea.a.p("LG9fdBx4dA==", "Fns8OfZP");
                        str2 = v.j(getContext(), str);
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = "";
                }
                long o10 = v.o(str);
                Context context = getContext();
                if (context != null) {
                    ea.a.p("Mm8mdAJ4dA==", "LsQHgtIJ");
                    e k10 = com.bumptech.glide.b.c(context).f(context).o(str2).u(new o4.d(Long.valueOf(o10))).p(androidx.core.content.a.getDrawable(getContext(), i10)).k(androidx.core.content.a.getDrawable(getContext(), i10));
                    k10.K(0.6f);
                    k10.z(new pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.a(), true).h().q(Priority.NORMAL).E(roundRecImageView);
                }
                BasePdfConvertCompletedView.a<PdfPreviewEntity> childListener2 = getChildListener();
                if (childListener2 != null) {
                    childListener2.d();
                    d dVar = d.f30009a;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                d dVar2 = d.f30009a;
            }
        }
    }

    public final void f(String str, PdfPreviewEntity pdfPreviewEntity) {
        e(str, pdfPreviewEntity);
        t2 t2Var = (t2) this.f24761a;
        if (t2Var != null) {
            d(t2Var.f1484p, t2Var.f1479k, t2Var.f1483o, t2Var.f1482n, t2Var.f1476h, t2Var.f1474f, t2Var.f1472d);
        }
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.g(ea.a.p("ADI8XyhpLWk7aA==", "ynpKNCqT"));
    }

    public final void setEventSource(String value) {
        Pdf2WordConvertBottomView pdf2WordConvertBottomView;
        g.e(value, "value");
        t2 t2Var = (t2) this.f24761a;
        if (t2Var != null) {
            pdf2WordConvertBottomView = t2Var.f1472d;
        } else {
            pdf2WordConvertBottomView = null;
        }
        if (pdf2WordConvertBottomView != null) {
            pdf2WordConvertBottomView.setEventSource(value);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pdf2WordConvertCompletedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g.e(context, ea.a.p("UG8ldBZ4dA==", "xXDtKh5V"));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pdf2WordConvertCompletedView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        g.e(context, ea.a.p("FW8fdFR4dA==", "HEvq1JiF"));
    }

    /* compiled from: Pdf2WordConvertCompletedView.kt */
    /* loaded from: classes3.dex */
    public static abstract class a implements BasePdfConvertCompletedView.a<PdfPreviewEntity> {

        /* renamed from: a  reason: collision with root package name */
        public final String f25607a;

        public a(String str) {
            this.f25607a = str;
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public final void e(Context context, List list) {
            PdfPreviewEntity pdfPreviewEntity = (PdfPreviewEntity) list;
            g.e(context, "context");
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        /* renamed from: g */
        public void c(Context context, PdfPreviewEntity pdfPreviewEntity) {
            g.e(context, "context");
            n.f23972a.a();
            if (pdfPreviewEntity != null) {
                pdfPreviewEntity.setRecent(1);
                pdfPreviewEntity.setRecentDate(System.currentTimeMillis());
                FileRepository.I(pdfPreviewEntity);
                bm.c.b(context).i(pdfPreviewEntity);
                AppViewModel k10 = ReaderPdfApplication.k();
                ToolsType toolsType = ToolsType.PDF2WORD;
                String path = pdfPreviewEntity.getPath();
                g.d(path, ea.a.p("Vm4_aQd5THATdGg=", "WH0dUoNy"));
                k10.g(new nl.g(toolsType, path));
                String path2 = pdfPreviewEntity.getPath();
                String str = this.f25607a;
                if (str == null) {
                    str = "";
                }
                k0.c(context, path2, pdfPreviewEntity, "", str);
            }
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        /* renamed from: h */
        public void b(Context context, PdfPreviewEntity pdfPreviewEntity) {
            g.e(context, "context");
            if (pdfPreviewEntity != null) {
                e1.e(context, pdfPreviewEntity);
            }
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public void a() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public void d() {
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public void f() {
        }
    }
}
