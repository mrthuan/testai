package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import ao.f1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ReaderSplashActivity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.d;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.scan.dialog.l;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergeChooserActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.BaseOperatePDFActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.SearchPDFWhenChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.adapter.u;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.h2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.x;
import pdf.pdfreader.viewer.editor.free.ui.frag.SplitPreviewFragment;
import pdf.pdfreader.viewer.editor.free.ui.widget.PreviewEditGuideView;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.p;
import pdf.pdfreader.viewer.editor.free.utils.share.ThirdOpenParseManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25377a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f25378b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f25377a = i10;
        this.f25378b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar;
        ArrayList arrayList;
        ViewGroup viewGroup;
        int i10 = this.f25377a;
        ArrayList arrayList2 = null;
        boolean z10 = true;
        Object obj = this.f25378b;
        switch (i10) {
            case 0:
                d dVar = (d) obj;
                d.a aVar = d.f25379j0;
                g.e(dVar, ea.a.p("R2gic1cw", "ALSpZJiF"));
                if (dVar.D() && !dVar.A) {
                    dVar.y0();
                    return;
                }
                return;
            case 1:
                ReaderConvertPreviewActivity readerConvertPreviewActivity = (ReaderConvertPreviewActivity) obj;
                int i11 = ReaderConvertPreviewActivity.R1;
                g.e(readerConvertPreviewActivity, ea.a.p("R2gic1cw", "MKxoG0qr"));
                x xVar = new x(readerConvertPreviewActivity, readerConvertPreviewActivity.getString(R.string.arg_res_0x7f1302ad), readerConvertPreviewActivity.getString(R.string.arg_res_0x7f1304da), readerConvertPreviewActivity.getString(R.string.arg_res_0x7f130421));
                readerConvertPreviewActivity.O1 = xVar;
                xVar.H = new com.google.android.tools.d(readerConvertPreviewActivity, 15);
                readerConvertPreviewActivity.W1(xVar);
                p.k(readerConvertPreviewActivity, readerConvertPreviewActivity.R2().concat("_space"));
                readerConvertPreviewActivity.Q1 = false;
                return;
            case 2:
                OfficeReaderActivity officeReaderActivity = (OfficeReaderActivity) obj;
                String str = OfficeReaderActivity.D2;
                g.e(officeReaderActivity, ea.a.p("O2hYc10w", "DuTojjoe"));
                officeReaderActivity.G2();
                return;
            case 3:
                f1 f1Var = (f1) obj;
                f1Var.getClass();
                ExecutorService executorService = ReaderPreviewActivity.U5;
                f1Var.f5040b.Z2();
                return;
            case 4:
                ReaderMergeChooserActivity readerMergeChooserActivity = (ReaderMergeChooserActivity) obj;
                ReaderMergeChooserActivity.a aVar2 = ReaderMergeChooserActivity.f26759n0;
                g.e(readerMergeChooserActivity, ea.a.p("O2hYc10w", "jGFBi4dY"));
                readerMergeChooserActivity.v2(1);
                return;
            case 5:
                ReaderMergePdfActivity readerMergePdfActivity = (ReaderMergePdfActivity) obj;
                int i12 = ReaderMergePdfActivity.f26780f0;
                g.e(readerMergePdfActivity, ea.a.p("Imgcc2cw", "T7VuCG1V"));
                Intent intent = new Intent(readerMergePdfActivity, ReaderHomeActivity.class);
                intent.putExtra(ea.a.p("WGUyXwNkBF8dcFFyCHQzXzZlQXUqdA==", "5gJfFXqU"), true);
                readerMergePdfActivity.startActivity(intent);
                readerMergePdfActivity.finish();
                return;
            case 6:
                ReaderSplitPdfActivity readerSplitPdfActivity = (ReaderSplitPdfActivity) obj;
                ReaderSplitPdfActivity.a aVar3 = ReaderSplitPdfActivity.f26822q0;
                g.e(readerSplitPdfActivity, ea.a.p("R2gic1cw", "m06paxcH"));
                Intent intent2 = new Intent(readerSplitPdfActivity, ReaderHomeActivity.class);
                intent2.putExtra(ea.a.p("JGVIXxdlQF8zbj5lG3Q3ZFpfHmRm", "8R4dEGR3"), true);
                readerSplitPdfActivity.startActivity(intent2);
                readerSplitPdfActivity.finish();
                return;
            case 7:
                RecentAddedActivity.l2((RecentAddedActivity) obj);
                return;
            case 8:
                BaseOperatePDFActivity baseOperatePDFActivity = (BaseOperatePDFActivity) obj;
                int i13 = BaseOperatePDFActivity.Z;
                g.e(baseOperatePDFActivity, ea.a.p("O2hYc10w", "8RvcdEQK"));
                baseOperatePDFActivity.I1();
                j1.e(baseOperatePDFActivity, baseOperatePDFActivity.getString(R.string.arg_res_0x7f130390), true, null, -1);
                return;
            case 9:
                OperatePDFWatcherActivity operatePDFWatcherActivity = (OperatePDFWatcherActivity) obj;
                String str2 = OperatePDFWatcherActivity.E;
                g.e(operatePDFWatcherActivity, ea.a.p("O2hYc10w", "njBczCdo"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(operatePDFWatcherActivity)) {
                    operatePDFWatcherActivity.B = System.currentTimeMillis();
                    l lVar2 = operatePDFWatcherActivity.f27003v;
                    if (lVar2 == null || !lVar2.isShowing()) {
                        z10 = false;
                    }
                    if (z10 && (lVar = operatePDFWatcherActivity.f27003v) != null) {
                        lVar.dismiss();
                    }
                    l lVar3 = new l(operatePDFWatcherActivity, false, false);
                    operatePDFWatcherActivity.f27003v = lVar3;
                    lVar3.show();
                    return;
                }
                return;
            case 10:
                SearchPDFWhenChooseActivity searchPDFWhenChooseActivity = (SearchPDFWhenChooseActivity) obj;
                int i14 = SearchPDFWhenChooseActivity.f27034m0;
                g.e(searchPDFWhenChooseActivity, ea.a.p("HGg-c1Ew", "JthWuYeH"));
                ArrayList arrayList3 = new ArrayList();
                StringBuilder sb2 = new StringBuilder();
                u uVar = searchPDFWhenChooseActivity.f27043i0;
                if (uVar != null && (arrayList = uVar.f27310e) != null) {
                    if (!arrayList.isEmpty()) {
                        arrayList2 = arrayList;
                    }
                    if (arrayList2 != null) {
                        arrayList3.addAll(arrayList2);
                    }
                }
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (!TextUtils.isEmpty(str3)) {
                        sb2.append(str3);
                        if (it.hasNext()) {
                            sb2.append(ea.a.p("p7-l", "mrHhKnyH"));
                        }
                    }
                }
                eo.a.b(ReaderPdfApplication.m(), sb2.toString());
                return;
            case 11:
                ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = (ReaderImg2PDFChooseActivity) obj;
                ReaderImg2PDFChooseActivity.a aVar4 = ReaderImg2PDFChooseActivity.M0;
                g.e(readerImg2PDFChooseActivity, ea.a.p("R2gic1cw", "45akhZKk"));
                if (!readerImg2PDFChooseActivity.isFinishing() && !readerImg2PDFChooseActivity.isDestroyed()) {
                    LinearLayout linearLayout = readerImg2PDFChooseActivity.S;
                    if (linearLayout != null) {
                        linearLayout.setEnabled(true);
                        AppCompatImageView appCompatImageView = readerImg2PDFChooseActivity.Y;
                        if (appCompatImageView != null) {
                            appCompatImageView.setEnabled(true);
                            readerImg2PDFChooseActivity.w2().setEnabled(true);
                            View view = readerImg2PDFChooseActivity.U;
                            if (view != null) {
                                view.setVisibility(8);
                                return;
                            } else {
                                g.i(ea.a.p("IWlTdwJvMnUHdgNyWGF5", "HYW6RBgC"));
                                throw null;
                            }
                        }
                        g.i(ea.a.p("MGFRaz9tZw==", "M7R2vpME"));
                        throw null;
                    }
                    g.i(ea.a.p("R2k_bBZUdg==", "SMT5GHkd"));
                    throw null;
                }
                return;
            case 12:
                g2 g2Var = (g2) obj;
                int i15 = g2.N;
                if (g2Var.isShowing() && (viewGroup = g2Var.B) != null) {
                    g2Var.L = true;
                    viewGroup.animate().alpha(0.0f).setDuration(500L).setListener(new h2(g2Var)).start();
                    return;
                }
                return;
            case 13:
                SplitPreviewFragment splitPreviewFragment = (SplitPreviewFragment) obj;
                g.e(splitPreviewFragment, ea.a.p("R2gic1cw", "z3H8JaiJ"));
                SplitPreviewFragment.a aVar5 = SplitPreviewFragment.f27979l0;
                splitPreviewFragment.q0(0, 40);
                return;
            case 14:
                PreviewEditGuideView previewEditGuideView = (PreviewEditGuideView) obj;
                int i16 = PreviewEditGuideView.f28275s;
                g.e(previewEditGuideView, ea.a.p("I2gDc1Yw", "9LWjrCqE"));
                if (previewEditGuideView.isAttachedToWindow()) {
                    previewEditGuideView.setVisibility(8);
                    return;
                }
                return;
            case 15:
                View view2 = (View) obj;
                g.e(view2, ea.a.p("F3QjaQBfEWgdd31uGXUiTypSV2EieQ==", "0m1IIHzV"));
                pdf.pdfreader.viewer.editor.free.utils.extension.g.g(view2);
                return;
            default:
                Activity activity = (Activity) obj;
                ThirdOpenParseManager thirdOpenParseManager = ThirdOpenParseManager.f28760a;
                g.e(activity, ea.a.p("a2FSdBB2XnR5", "DVNrrCnQ"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.c(activity) && (activity instanceof ReaderSplashActivity)) {
                    ((ReaderSplashActivity) activity).x1(true);
                    return;
                }
                return;
        }
    }
}
