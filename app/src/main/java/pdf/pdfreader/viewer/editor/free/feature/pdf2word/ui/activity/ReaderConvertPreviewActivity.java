package pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.f;
import androidx.appcompat.libconvert.helper.NativeSoLoaderHelper;
import androidx.appcompat.widget.z0;
import androidx.constraintlayout.widget.ConstraintLayout;
import cg.l;
import gl.o;
import gl.q;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.e;
import nl.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.n;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.BaseSubscriptionActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertCompletedView;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperateInterceptDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.x;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderRoundProgressBar;
import pdf.pdfreader.viewer.editor.free.ui.widget.MagnifierContainer;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;
import pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent;
import pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource;
import pdf.pdfreader.viewer.editor.free.utils.event.ConvertEventCenter;
import pdf.pdfreader.viewer.editor.free.utils.event.EventCenter;
import pdf.pdfreader.viewer.editor.free.utils.h1;
import pdf.pdfreader.viewer.editor.free.utils.p;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import tf.d;

/* compiled from: ReaderConvertPreviewActivity.kt */
/* loaded from: classes3.dex */
public final class ReaderConvertPreviewActivity extends ReaderAIPreviewActivity {
    public static final /* synthetic */ int R1 = 0;
    public ImageView A1;
    public View B1;
    public View C1;
    public TextView D1;
    public Pdf2WordConvertCompletedView E1;
    public ConstraintLayout F1;
    public ReaderRoundProgressBar G1;
    public ImageView H1;
    public boolean I1;
    public PdfPreviewEntity J1;
    public boolean K1;
    public final androidx.activity.result.c<String[]> L1;
    public j2 M1;
    public OperateInterceptDialog N1;
    public x O1;
    public OperatePdfFailedDialog P1;
    public boolean Q1;

    /* compiled from: ReaderConvertPreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a extends Pdf2WordConvertCompletedView.a {
        public a(String str) {
            super(str);
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertCompletedView.a, pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public final void a() {
            int i10 = ReaderConvertPreviewActivity.R1;
            ReaderConvertPreviewActivity readerConvertPreviewActivity = ReaderConvertPreviewActivity.this;
            p.q(readerConvertPreviewActivity, readerConvertPreviewActivity.T2());
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public final void close() {
            int i10 = ReaderConvertPreviewActivity.R1;
            ReaderConvertPreviewActivity readerConvertPreviewActivity = ReaderConvertPreviewActivity.this;
            p.o(readerConvertPreviewActivity, readerConvertPreviewActivity.T2());
            readerConvertPreviewActivity.onBackPressed();
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertCompletedView.a, pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public final void d() {
            int i10 = ReaderConvertPreviewActivity.R1;
            ReaderConvertPreviewActivity readerConvertPreviewActivity = ReaderConvertPreviewActivity.this;
            String T2 = readerConvertPreviewActivity.T2();
            String str = p.f28740a;
            p.b(readerConvertPreviewActivity, ea.a.p("VWklaQBo", "wFOyt8S9"), ea.a.p("OXMDXzBoHnc=", "LdXhCqMG"), T2);
            Pdf2WordConvertCompletedView pdf2WordConvertCompletedView = readerConvertPreviewActivity.E1;
            if (pdf2WordConvertCompletedView != null) {
                pdf2WordConvertCompletedView.setEventSource(readerConvertPreviewActivity.T2());
            }
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertCompletedView.a, pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        public final void f() {
            int i10 = ReaderConvertPreviewActivity.R1;
            ReaderConvertPreviewActivity readerConvertPreviewActivity = ReaderConvertPreviewActivity.this;
            readerConvertPreviewActivity.getClass();
            Intent intent = new Intent(readerConvertPreviewActivity, ReaderHomeActivity.class);
            intent.putExtra(ea.a.p("BWUTXyVlT18hbhJlWnQIZFdfImRm", "LwnjK8HR"), true);
            readerConvertPreviewActivity.startActivity(intent);
            ReaderPdfApplication.k().g(new g(ToolsType.PDF2WORD, ea.a.p("FmReMiZvRWQ=", "lAf8Q7cP")));
            readerConvertPreviewActivity.finish();
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertCompletedView.a, pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        /* renamed from: g */
        public final void c(Context context, PdfPreviewEntity pdfPreviewEntity) {
            kotlin.jvm.internal.g.e(context, "context");
            super.c(context, pdfPreviewEntity);
            int i10 = ReaderConvertPreviewActivity.R1;
            ReaderConvertPreviewActivity readerConvertPreviewActivity = ReaderConvertPreviewActivity.this;
            String T2 = readerConvertPreviewActivity.T2();
            String str = p.f28740a;
            p.b(readerConvertPreviewActivity, ea.a.p("VWklaQBo", "RiWquSPg"), ea.a.p("KWlfaQpoaG8qZSRfFmwBY2s=", "nclLRmYK"), T2);
        }

        @Override // pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.Pdf2WordConvertCompletedView.a, pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.BasePdfConvertCompletedView.a
        /* renamed from: h */
        public final void b(Context context, PdfPreviewEntity pdfPreviewEntity) {
            kotlin.jvm.internal.g.e(context, "context");
            super.b(context, pdfPreviewEntity);
            int i10 = ReaderConvertPreviewActivity.R1;
            ReaderConvertPreviewActivity readerConvertPreviewActivity = ReaderConvertPreviewActivity.this;
            p.p(readerConvertPreviewActivity, readerConvertPreviewActivity.T2());
        }
    }

    /* compiled from: ReaderConvertPreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements androidx.lifecycle.x, e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f25591a;

        public b(l lVar) {
            ea.a.p("KXVfYw1pWG4=", "zfrzEbwF");
            this.f25591a = lVar;
        }

        @Override // kotlin.jvm.internal.e
        public final l a() {
            return this.f25591a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.x) && (obj instanceof e)) {
                return kotlin.jvm.internal.g.a(this.f25591a, ((e) obj).a());
            }
            return false;
        }

        public final int hashCode() {
            return this.f25591a.hashCode();
        }

        @Override // androidx.lifecycle.x
        public final /* synthetic */ void m(Object obj) {
            this.f25591a.invoke(obj);
        }
    }

    public ReaderConvertPreviewActivity() {
        androidx.activity.result.c<String[]> registerForActivityResult = registerForActivityResult(new j.b(), new androidx.appcompat.libconvert.a(this, 16));
        kotlin.jvm.internal.g.d(registerForActivityResult, ea.a.p("PWVWaQp0UnIcbzhBFnQBdlx0F1IgcxBsmoDjfUMgeCBvIBEgWSAXIHp9QCBVIEggFSBOfQ==", "14BLxEIX"));
        this.L1 = registerForActivityResult;
    }

    public static void O2(ReaderConvertPreviewActivity readerConvertPreviewActivity, Map map) {
        kotlin.jvm.internal.g.e(readerConvertPreviewActivity, ea.a.p("NWgYc2kw", "RIAqMNZC"));
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!((Boolean) entry.getValue()).booleanValue()) {
                z10 = false;
            }
        }
        if (!z10) {
            if (!k0.b.b(readerConvertPreviewActivity, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFIAQSFfHFg6RQhODEwQU2VPK0FwRQ==", "j1cFYnZM")) && !k0.b.b(readerConvertPreviewActivity, ea.a.p("UG4hcidpAi44ZRRtXXMkaVdufFcbSWJFK0UpVBRSDEF9XxZUB1InR0U=", "jk1EHfeW"))) {
                readerConvertPreviewActivity.X1(true);
            } else {
                readerConvertPreviewActivity.X1(false);
            }
        }
    }

    public static final void P2(ReaderConvertPreviewActivity readerConvertPreviewActivity) {
        readerConvertPreviewActivity.Q1 = false;
        readerConvertPreviewActivity.M.post(new z0(readerConvertPreviewActivity, 26));
    }

    private final void X1(boolean z10) {
        j2 j2Var = new j2(this);
        this.M1 = j2Var;
        if (z10) {
            j2Var.c(1);
        } else {
            j2Var.c(0);
        }
        j2Var.f27638i = new c(this, z10);
        j2 j2Var2 = this.M1;
        if (j2Var2 != null) {
            j2Var2.show();
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity, jl.a
    public final void C1() {
        Pdf2WordConvertCompletedView pdf2WordConvertCompletedView;
        super.C1();
        View view = this.f24484g0;
        if (view != null) {
            pdf2WordConvertCompletedView = (Pdf2WordConvertCompletedView) view.findViewById(R.id.pdf2word_convert_completed);
        } else {
            pdf2WordConvertCompletedView = null;
        }
        this.E1 = pdf2WordConvertCompletedView;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity
    public final Boolean C2() {
        boolean z10;
        if (this.J1 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // jl.a
    public final View D1() {
        MagnifierContainer magnifierContainer = this.E0;
        kotlin.jvm.internal.g.d(magnifierContainer, ea.a.p("PW9edC9pUnc=", "ADPLTshE"));
        return magnifierContainer;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity
    public final void F2() {
        ConstraintLayout constraintLayout;
        ReaderRoundProgressBar readerRoundProgressBar;
        boolean z10;
        n.f23972a.b(this);
        super.F2();
        View view = this.f24484g0;
        if (view == null) {
            return;
        }
        this.B1 = view.findViewById(R.id.preview_convert_to_pdf_ll);
        this.C1 = this.f24484g0.findViewById(R.id.preview_convert_to_pdf_fl);
        this.A1 = (ImageView) this.f24484g0.findViewById(R.id.preview_convert_to_pdf_pro_iv);
        ProgressView progressView = (ProgressView) this.f24484g0.findViewById(R.id.preview_convert_to_pdf_progress);
        this.D1 = (TextView) this.f24484g0.findViewById(R.id.preview_convert_tv);
        View view2 = this.f24484g0;
        ImageView imageView = null;
        if (view2 != null) {
            constraintLayout = (ConstraintLayout) view2.findViewById(R.id.root_preview_progressbar);
        } else {
            constraintLayout = null;
        }
        this.F1 = constraintLayout;
        View view3 = this.f24484g0;
        if (view3 != null) {
            readerRoundProgressBar = (ReaderRoundProgressBar) view3.findViewById(R.id.progressbar_overlay);
        } else {
            readerRoundProgressBar = null;
        }
        this.G1 = readerRoundProgressBar;
        View view4 = this.f24484g0;
        if (view4 != null) {
            imageView = (ImageView) view4.findViewById(R.id.iv_progress_close);
        }
        this.H1 = imageView;
        TextView textView = this.D1;
        if (textView != null) {
            textView.setText(getString(R.string.arg_res_0x7f1300d1));
        }
        BillingConfigImpl billingConfigImpl = BillingConfigImpl.c;
        if (billingConfigImpl.z() && !billingConfigImpl.w() && BillingConfigImpl.u()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ImageView imageView2 = this.A1;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        } else {
            ImageView imageView3 = this.A1;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
        }
        View view5 = this.C1;
        if (view5 != null) {
            view5.setVisibility(0);
        }
        ImageView imageView4 = this.H1;
        if (imageView4 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(imageView4, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity$makeButtonsView$1
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(View view6) {
                    invoke2(view6);
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    ReaderConvertPreviewActivity readerConvertPreviewActivity = ReaderConvertPreviewActivity.this;
                    int i10 = ReaderConvertPreviewActivity.R1;
                    readerConvertPreviewActivity.U2();
                }
            });
        }
        View view6 = this.B1;
        if (view6 != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.g.e(view6, new l<View, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity$makeButtonsView$2
                {
                    super(1);
                }

                @Override // cg.l
                public /* bridge */ /* synthetic */ d invoke(View view7) {
                    invoke2(view7);
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(View it) {
                    kotlin.jvm.internal.g.e(it, "it");
                    ReaderConvertPreviewActivity readerConvertPreviewActivity = ReaderConvertPreviewActivity.this;
                    int i10 = ReaderConvertPreviewActivity.R1;
                    readerConvertPreviewActivity.getClass();
                    tn.a.d(readerConvertPreviewActivity, ea.a.p("LG9fdhxydA==", "stgWQrxB"), ea.a.p("SXcRb1d2FXI8XwVvWnYyckxfMWwgY2s=", "Dl9r9pvT"), f.m(readerConvertPreviewActivity.S2(), "_", ConvertEventCenter.f28654b), false);
                    PDF2WordHelper.Companion companion = PDF2WordHelper.f25574a;
                    final ReaderConvertPreviewActivity readerConvertPreviewActivity2 = ReaderConvertPreviewActivity.this;
                    cg.a<d> aVar = new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity$makeButtonsView$2.1
                        {
                            super(0);
                        }

                        @Override // cg.a
                        public /* bridge */ /* synthetic */ d invoke() {
                            invoke2();
                            return d.f30009a;
                        }

                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            final ReaderConvertPreviewActivity readerConvertPreviewActivity3 = ReaderConvertPreviewActivity.this;
                            if (readerConvertPreviewActivity3.Q1) {
                                return;
                            }
                            if (!h1.c() && !pdf.pdfreader.viewer.editor.free.utils.extension.c.g(readerConvertPreviewActivity3)) {
                                readerConvertPreviewActivity3.L1.a(new String[]{ea.a.p("J24VclxpLS44ZRRtXXMkaVdufFIMQXJfMVglRQNOA0wZUyVPYUEORQ==", "okFq3IYm"), ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFcUSRdFNEUBVBJSFEF_XxhUPFIjR0U=", "kYWZISOd")});
                                return;
                            }
                            BillingConfigImpl billingConfigImpl2 = BillingConfigImpl.c;
                            if (billingConfigImpl2.w()) {
                                t0.V().execute(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b(readerConvertPreviewActivity3, 3));
                            } else if (billingConfigImpl2.z() && BillingConfigImpl.u()) {
                                readerConvertPreviewActivity3.I1 = true;
                                BaseSubscriptionActivity.a aVar2 = BaseSubscriptionActivity.L;
                                String p10 = ea.a.p("Q2QtMgRvEGQ=", "EiXrbKN5");
                                aVar2.getClass();
                                BaseSubscriptionActivity.a.a(readerConvertPreviewActivity3, p10);
                            } else {
                                t0.V().execute(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b(readerConvertPreviewActivity3, 3));
                                n.f23972a.d(readerConvertPreviewActivity3, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity$clickPdf2wordBtn$1
                                    {
                                        super(0);
                                    }

                                    @Override // cg.a
                                    public /* bridge */ /* synthetic */ d invoke() {
                                        invoke2();
                                        return d.f30009a;
                                    }

                                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        ReaderConvertPreviewActivity.this.K1 = true;
                                    }
                                });
                            }
                        }
                    };
                    AnonymousClass2 anonymousClass2 = new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity$makeButtonsView$2.2
                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // cg.a
                        public /* bridge */ /* synthetic */ d invoke() {
                            invoke2();
                            return d.f30009a;
                        }
                    };
                    AnonymousClass3 anonymousClass3 = new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity$makeButtonsView$2.3
                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }

                        @Override // cg.a
                        public /* bridge */ /* synthetic */ d invoke() {
                            invoke2();
                            return d.f30009a;
                        }
                    };
                    NativeSoLoaderHelper.DownloadSource downloadSource = NativeSoLoaderHelper.DownloadSource.FromPreview;
                    companion.getClass();
                    PDF2WordHelper.Companion.d(readerConvertPreviewActivity2, aVar, anonymousClass2, anonymousClass3, downloadSource);
                }
            });
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity
    public final void G2(Bundle bundle) {
        super.G2(bundle);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity
    public final void H2(Bundle bundle) {
        n.f23972a.b(this);
        EventCenter.f28658e = ea.a.p("PG8CaQ==", "3yRvO1HD");
        ReaderPdfApplication.f();
        pdf.pdfreader.viewer.editor.free.service.b.d();
        if (bundle == null) {
            EventCenter.sendLanguageRecallClickEvent(this, getIntent());
            tn.a.a(ReaderPdfApplication.m(), ea.a.p("LG9DZSZwQ293", "KLM3mrn3"));
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity, jl.a
    public final void K1() {
        if (C2().booleanValue()) {
            Pdf2WordConvertCompletedView pdf2WordConvertCompletedView = this.E1;
            if (pdf2WordConvertCompletedView != null) {
                pdf2WordConvertCompletedView.e(this.f24505s0, this.J1);
            }
        } else {
            Pdf2WordConvertCompletedView pdf2WordConvertCompletedView2 = this.E1;
            if (pdf2WordConvertCompletedView2 != null) {
                pdf2WordConvertCompletedView2.setVisibility(8);
            }
        }
        BillingConfigImpl.c.getClass();
        BillingConfigImpl.x().e(this, new b(new l<Boolean, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity$initView$1
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(Boolean bool) {
                invoke2(bool);
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Boolean bool) {
                kotlin.jvm.internal.g.d(bool, ea.a.p("WnQ=", "Y5FzBfK1"));
                if (bool.booleanValue()) {
                    ReaderConvertPreviewActivity readerConvertPreviewActivity = ReaderConvertPreviewActivity.this;
                    int i10 = ReaderConvertPreviewActivity.R1;
                    ViewGroup viewGroup = readerConvertPreviewActivity.f24495m1;
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                        viewGroup.setVisibility(8);
                    }
                    ImageView imageView = ReaderConvertPreviewActivity.this.A1;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                    ReaderConvertPreviewActivity activity = ReaderConvertPreviewActivity.this;
                    o.f17931a.getClass();
                    kotlin.jvm.internal.g.e(activity, "activity");
                    gl.p.f17933p.e(activity);
                    q.f17934p.e(activity);
                }
            }
        }));
    }

    public final void Q2() {
        OperateInterceptDialog operateInterceptDialog;
        OperateInterceptDialog operateInterceptDialog2 = this.N1;
        boolean z10 = false;
        if (operateInterceptDialog2 != null && operateInterceptDialog2.isShowing()) {
            z10 = true;
        }
        if (z10 && (operateInterceptDialog = this.N1) != null) {
            operateInterceptDialog.cancel();
        }
    }

    public final String R2() {
        if (D2()) {
            return ea.a.p("G2g1clxfHDJ3", "DDhT9lOU");
        }
        return ea.a.p("ATJ3", "CBqkRpRL");
    }

    public final String S2() {
        String str = this.S;
        if (str == null) {
            str = "";
        }
        this.S = str;
        switch (str.hashCode()) {
            case -1271564784:
                if (str.equals(ea.a.p("dVIETSxILU03X2BPJkxT", "zLpDv856"))) {
                    return ea.a.p("W28mZQ==", "Ow07r6wz");
                }
                break;
            case -392488846:
                if (str.equals(ea.a.p("dVIETSxUKkkgRA==", "C0tIp2Ht"))) {
                    return ea.a.p("QGgqcmU=", "Fno2adVv");
                }
                break;
            case -392274714:
                if (str.equals(ea.a.p("CFJ2TT1UeE8EUw==", "g9N9b7zZ"))) {
                    return ea.a.p("O29ebHM=", "6Pu6VCYB");
                }
                break;
            case 1465644033:
                if (str.equals(ea.a.p("dVIETSxMK1MmX3lPO0U=", "RcqSatiU"))) {
                    return ea.a.p("HmkWZQ==", "mVxzVK7p");
                }
                break;
        }
        return ea.a.p("W28mZQ==", "drKacxtM");
    }

    public final String T2() {
        if (D2()) {
            return ea.a.p("PGhQchxfRzJ3", "6cT3jEOY");
        }
        return ea.a.p("QzJ3", "Fa2zlZ0H");
    }

    public final void U2() {
        boolean z10;
        cg.a<d> aVar = new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity$showQuiteDialog$1
            {
                super(0);
            }

            @Override // cg.a
            public /* bridge */ /* synthetic */ d invoke() {
                invoke2();
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                try {
                    try {
                        PDF2WordHelper.Companion companion = PDF2WordHelper.f25574a;
                        ReaderConvertPreviewActivity readerConvertPreviewActivity = ReaderConvertPreviewActivity.this;
                        companion.getClass();
                        PDF2WordHelper.Companion.c(readerConvertPreviewActivity);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                } finally {
                    ReaderConvertPreviewActivity.P2(ReaderConvertPreviewActivity.this);
                    ReaderConvertPreviewActivity.this.Q1 = false;
                }
            }
        };
        if (this.N1 == null) {
            String string = getResources().getString(R.string.arg_res_0x7f13035a);
            kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0E2ldZ35xFmlHXyhvHXYHcgZpWmcp", "a3Pce2rq"));
            String string2 = getResources().getString(R.string.arg_res_0x7f1304a9);
            kotlin.jvm.internal.g.d(string2, ea.a.p("QWU4bwZyAWUBLlNlHVMici1uVSgULjB0lYD2bgYuF3VBZRRxBmkWXxFvWnYMciJfI3BGKQ==", "wPadXsNF"));
            this.N1 = new OperateInterceptDialog(this, string, string2);
        }
        OperateInterceptDialog operateInterceptDialog = this.N1;
        if (operateInterceptDialog != null && !operateInterceptDialog.isShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            OperateInterceptDialog operateInterceptDialog2 = this.N1;
            if (operateInterceptDialog2 != null) {
                operateInterceptDialog2.A = new pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.b(this, aVar);
            }
            if (operateInterceptDialog2 != null) {
                operateInterceptDialog2.show();
            }
            p.m(this, R2());
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, android.app.Activity
    public final void finish() {
        super.finish();
        if (this.Q1) {
            PDF2WordHelper.f25574a.getClass();
            PDF2WordHelper.Companion.c(this);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        pdf.pdfreader.viewer.editor.free.feature.bridge.c cVar = this.H0;
        if (cVar != null && cVar.d()) {
            return;
        }
        if (this.f24517y0) {
            n.f23972a.a();
            t2();
        } else if (this.Q1) {
            U2();
        } else {
            n.f23972a.c(this, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity$onBackPressed$1
                {
                    super(0);
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ d invoke() {
                    invoke2();
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ReaderConvertPreviewActivity.this.t2();
                }
            }, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity$onBackPressed$2
                {
                    super(0);
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ d invoke() {
                    invoke2();
                    return d.f30009a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ReaderConvertPreviewActivity readerConvertPreviewActivity = ReaderConvertPreviewActivity.this;
                    int i10 = ReaderConvertPreviewActivity.R1;
                    readerConvertPreviewActivity.f24512v1 = true;
                }
            });
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity, pdf.pdfreader.viewer.editor.free.ui.act.a, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        PDF2WordHelper.Companion companion = PDF2WordHelper.f25574a;
        int hashCode = hashCode();
        companion.getClass();
        PDF2WordHelper.f25575b = hashCode;
        PdfPreviewEntity pdfPreviewEntity = null;
        if (bundle != null) {
            serializable = bundle.getSerializable(ea.a.p("UG8ldhZyFlcdclBFB3Q_dHk=", "GHrf30oB"));
        } else {
            serializable = null;
        }
        if (serializable instanceof PdfPreviewEntity) {
            pdfPreviewEntity = (PdfPreviewEntity) serializable;
        }
        this.J1 = pdfPreviewEntity;
        super.onCreate(bundle);
        String str = this.S;
        if (str == null) {
            str = "";
        }
        this.S = str;
        Pdf2WordConvertCompletedView pdf2WordConvertCompletedView = this.E1;
        if (pdf2WordConvertCompletedView != null) {
            pdf2WordConvertCompletedView.setChildListener(new a(str));
        }
        no.f.b(this).getClass();
        if (no.f.h(this)) {
            if (TextUtils.equals(getIntent().getStringExtra(ea.a.p("Q2EsZSxmEG8fMg==", "H2wo0KgY")), ea.a.p("HmEgZTpsIG4vdQdnUV80aFdvIWU=", "qxnGeAyx"))) {
                String p10 = ea.a.p("XWU8Zh9vdw==", "arhSaBXP");
                String p11 = ea.a.p("P3JUdhBlQF81bilyEGEcZWpmB3I2dA==", "iN3428gK");
                no.f.b(this).getClass();
                tn.a.d(this, p10, p11, no.f.c().concat("_lang"), false);
            } else if (TextUtils.equals(getIntent().getStringExtra(ea.a.p("P2FWZSZmRW83Mg==", "YEgx8X4w")), ea.a.p("Q2EsZSxsA24VdVVnDF8kZSdhXmw=", "f84WQAak"))) {
                String p12 = ea.a.p("IWVGZhVvdw==", "68XLfuET");
                String p13 = ea.a.p("Q3IudhplFV8dbldyDGEiZRtmW3I1dA==", "V8PchYSB");
                no.f.b(this).getClass();
                tn.a.d(this, p12, p13, no.f.c().concat("_noti"), false);
            }
        }
        tn.a.d(this, ea.a.p("KW8NdhVydA==", "4PJcpq3x"), ea.a.p("Q3cobx12B3IGX0doBnc=", "702WM0J3"), f.m(S2(), "_", ConvertEventCenter.f28654b), false);
        AppOpenSource appOpenSource = AppCoreFilterEvent.f28650a;
        AppCoreFilterEvent.g(ea.a.p("QzI8XwVpB3c=", "8isfESTh"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r0.isShowing() == true) goto L5;
     */
    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity, pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDestroy() {
        /*
            r2 = this;
            super.onDestroy()
            r2.Q2()
            pdf.pdfreader.viewer.editor.free.ui.dialog.x r0 = r2.O1
            if (r0 == 0) goto L12
            boolean r0 = r0.isShowing()
            r1 = 1
            if (r0 != r1) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L1c
            pdf.pdfreader.viewer.editor.free.ui.dialog.x r0 = r2.O1
            if (r0 == 0) goto L1c
            r0.cancel()
        L1c:
            boolean r0 = r2.isFinishing()
            if (r0 == 0) goto L36
            pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper$Companion r0 = pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper.f25574a
            r0.getClass()
            int r0 = pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper.f25575b
            int r1 = r2.hashCode()
            if (r0 != r1) goto L36
            boolean r0 = r2.Q1
            if (r0 == 0) goto L36
            pdf.pdfreader.viewer.editor.free.feature.pdf2word.helper.PDF2WordHelper.Companion.c(r2)
        L36:
            pdf.pdfreader.viewer.editor.free.ads.n r0 = pdf.pdfreader.viewer.editor.free.ads.n.f23972a
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity.onDestroy():void");
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity, jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onResume() {
        super.onResume();
        Pdf2WordConvertCompletedView pdf2WordConvertCompletedView = this.E1;
        if (pdf2WordConvertCompletedView != null) {
            pdf2WordConvertCompletedView.c();
        }
        if (this.I1) {
            this.I1 = false;
            if (BillingConfigImpl.c.w()) {
                t0.V().execute(new pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.b(this, 3));
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity, jl.a, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.g.e(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putSerializable(ea.a.p("UG8ldhZyFlcdclBFB3Q_dHk=", "M259Bekm"), this.J1);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity
    public final void t2() {
        runOnUiThread(new pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.a(this, 0));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity
    public final int v2() {
        return R.layout.layout_pdf_view_editor2_convert;
    }

    /* compiled from: ReaderConvertPreviewActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements xn.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f25592a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ReaderConvertPreviewActivity f25593b;

        public c(ReaderConvertPreviewActivity readerConvertPreviewActivity, boolean z10) {
            this.f25592a = z10;
            this.f25593b = readerConvertPreviewActivity;
        }

        @Override // xn.b
        public final void a() {
            boolean z10 = this.f25592a;
            ReaderConvertPreviewActivity readerConvertPreviewActivity = this.f25593b;
            if (z10) {
                h1.i(readerConvertPreviewActivity);
            } else {
                readerConvertPreviewActivity.L1.a(new String[]{ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFIDQQdfNVg4RQFOFExsUx9PIUElRQ==", "plSUvFe7"), ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFcXSTFFHUUCVHFSC0EDX2JUNlJ2R0U=", "3FWYBZ4E")});
            }
        }

        @Override // xn.b
        public final void b() {
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity
    public final void A2() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity
    public final void J2() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity
    public final void K2() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity
    public final void L2() {
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.ReaderAIPreviewActivity
    public final void x2() {
    }
}
