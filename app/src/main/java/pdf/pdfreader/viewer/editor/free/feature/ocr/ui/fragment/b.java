package pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment;

import am.w0;
import android.content.Context;
import android.widget.EditText;
import androidx.constraintlayout.motion.widget.MotionLayout;
import b1.e;
import java.io.File;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.feature.ocr.ui.fragment.OCRResultFragment;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.widget.PreviewCreateEditGuideView;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity;
import pdf.pdfreader.viewer.editor.free.feature.pdf2word.widget.PreviewPageManageGuideView;
import pdf.pdfreader.viewer.editor.free.repo.data.FileReadProgressChecker;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.c0;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.SearchPDFWhenChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.d;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;
import pdf.pdfreader.viewer.editor.free.ui.widget.act.BasePdfEditActivity;
import pdf.pdfreader.viewer.editor.free.utils.f0;
import pdf.pdfreader.viewer.editor.free.utils.u0;
import pdf.pdfreader.viewer.editor.free.utils.v;
import sp.h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25229a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f25230b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f25229a = i10;
        this.f25230b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EditText u7;
        int i10 = this.f25229a;
        boolean z10 = false;
        Object obj = this.f25230b;
        switch (i10) {
            case 0:
                OCRResultFragment oCRResultFragment = (OCRResultFragment) obj;
                OCRResultFragment.a aVar = OCRResultFragment.f25189r0;
                g.e(oCRResultFragment, ea.a.p("R2gic1cw", "ZSwS5aKi"));
                VB vb2 = oCRResultFragment.Y;
                g.b(vb2);
                ((w0) vb2).c.setVisibility(0);
                VB vb3 = oCRResultFragment.Y;
                g.b(vb3);
                ((w0) vb3).f1583j.setVisibility(0);
                return;
            case 1:
                f.a2((f) obj);
                return;
            case 2:
                PreviewCreateEditGuideView previewCreateEditGuideView = (PreviewCreateEditGuideView) obj;
                int i11 = PreviewCreateEditGuideView.f25425s;
                g.e(previewCreateEditGuideView, ea.a.p("O2hYc10w", "nPQ1wIKN"));
                if (previewCreateEditGuideView.isAttachedToWindow()) {
                    previewCreateEditGuideView.r();
                    return;
                }
                return;
            case 3:
                ReaderConvertPreviewActivity readerConvertPreviewActivity = (ReaderConvertPreviewActivity) obj;
                int i12 = ReaderConvertPreviewActivity.R1;
                g.e(readerConvertPreviewActivity, ea.a.p("BGg9c0kw", "clpTm7qR"));
                if (f0.a() > (((((float) new File(readerConvertPreviewActivity.f24505s0).length()) / 1024.0f) / 1024.0f) + 10) * 2) {
                    z10 = true;
                }
                if (!z10) {
                    readerConvertPreviewActivity.runOnUiThread(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c(readerConvertPreviewActivity, 1));
                    return;
                }
                v.N(readerConvertPreviewActivity, readerConvertPreviewActivity.f24505s0);
                readerConvertPreviewActivity.runOnUiThread(new e(readerConvertPreviewActivity, 21));
                return;
            case 4:
                PreviewPageManageGuideView previewPageManageGuideView = (PreviewPageManageGuideView) obj;
                int i13 = PreviewPageManageGuideView.f25608s;
                g.e(previewPageManageGuideView, ea.a.p("R2gic1cw", "jbt5cqVZ"));
                if (previewPageManageGuideView.isAttachedToWindow()) {
                    previewPageManageGuideView.r();
                    return;
                }
                return;
            case 5:
                Context context = (Context) obj;
                tf.c cVar = FileReadProgressChecker.f26553a;
                g.e(context, ea.a.p("a2Nebg1lT3Q=", "CxwiV2xw"));
                FileReadProgressChecker.b(context, false);
                return;
            case 6:
                c0 c0Var = (c0) obj;
                c0Var.getClass();
                String str = ReaderHomeActivity.Y1;
                c0Var.f26896o.E2();
                return;
            case 7:
                SearchPDFWhenChooseActivity searchPDFWhenChooseActivity = (SearchPDFWhenChooseActivity) obj;
                int i14 = SearchPDFWhenChooseActivity.f27034m0;
                g.e(searchPDFWhenChooseActivity, ea.a.p("R2gic1cw", "jbaa74YA"));
                EditText editText = searchPDFWhenChooseActivity.f27041g0;
                if (editText != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.f(editText);
                    return;
                } else {
                    g.i(ea.a.p("VmQidCdlGnQ=", "iAlJGbU0"));
                    throw null;
                }
            case 8:
                ReaderImg2PDFChooseActivity readerImg2PDFChooseActivity = (ReaderImg2PDFChooseActivity) obj;
                ReaderImg2PDFChooseActivity.a aVar2 = ReaderImg2PDFChooseActivity.M0;
                g.e(readerImg2PDFChooseActivity, ea.a.p("O2hYc10w", "g18hvUAg"));
                readerImg2PDFChooseActivity.K2(1);
                return;
            case 9:
                pdf.pdfreader.viewer.editor.free.ui.convert.c.c((ReaderImg2PDFConvertActivity) obj);
                return;
            case 10:
                oo.f fVar = (oo.f) obj;
                int i15 = oo.f.f23527m;
                g.e(fVar, ea.a.p("O2hYc10w", "lZW86ziV"));
                if (fVar.u() != null && fVar.isShowing() && !oo.f.x() && (u7 = fVar.u()) != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.b(u7);
                    return;
                }
                return;
            case 11:
                OperateExecuteTask operateExecuteTask = (OperateExecuteTask) obj;
                g.e(operateExecuteTask, ea.a.p("GGgdc00w", "i2lti9oO"));
                MotionLayout motionLayout = operateExecuteTask.f28233k;
                if (motionLayout != null) {
                    motionLayout.H();
                    return;
                }
                return;
            case 12:
                BasePdfEditActivity basePdfEditActivity = (BasePdfEditActivity) obj;
                int i16 = BasePdfEditActivity.f28296v;
                g.e(basePdfEditActivity, ea.a.p("PGgjc1Iw", "ETHJvHMy"));
                if (com.google.android.play.core.assetpacks.c.W(basePdfEditActivity)) {
                    ((d) basePdfEditActivity.f28297t.getValue()).dismiss();
                    return;
                }
                return;
            case 13:
                u0 u0Var = (u0) obj;
                g.e(u0Var, ea.a.p("F2wicwdlDGVy", "A2UU5gd8"));
                u0Var.a(null);
                return;
            default:
                h hVar = (h) obj;
                hVar.f29856f.post(new pdf.pdfreader.viewer.editor.free.ui.act.tools.h(hVar, 7));
                return;
        }
    }
}
