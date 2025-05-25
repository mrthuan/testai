package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.content.Intent;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.motion.widget.MotionLayout;
import pdf.pdfreader.viewer.editor.free.merge.ReaderMergeManager;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderMergePdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSplitPdfActivity;
import pdf.pdfreader.viewer.editor.free.ui.convert.ReaderImg2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.x2;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;
import pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditSearchActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25804a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f25805b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f25804a = i10;
        this.f25805b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25804a) {
            case 0:
                CameraActivity cameraActivity = (CameraActivity) this.f25805b;
                int i10 = CameraActivity.H0;
                kotlin.jvm.internal.g.e(cameraActivity, ea.a.p("O2hYc10w", "QCbhd8cB"));
                cameraActivity.finish();
                return;
            case 1:
                ReaderMergeManager readerMergeManager = (ReaderMergeManager) this.f25805b;
                kotlin.jvm.internal.g.e(readerMergeManager, ea.a.p("Lmhec2ww", "RuZ7HmHv"));
                readerMergeManager.f25895i = false;
                return;
            case 2:
                pdf.pdfreader.viewer.editor.free.office.c0 c0Var = (pdf.pdfreader.viewer.editor.free.office.c0) this.f25805b;
                kotlin.jvm.internal.g.e(c0Var, ea.a.p("FmgFc2ww", "J3blHwD4"));
                ea.a.p("H28xIBZpGm0hc3M=", "94sVriEO");
                pdf.pdfreader.viewer.editor.free.office.a0 a0Var = c0Var.f26078g;
                if (a0Var != null) {
                    a0Var.onDismiss();
                    return;
                }
                return;
            case 3:
                ReaderPreviewActivity readerPreviewActivity = ReaderPreviewActivity.this;
                readerPreviewActivity.f26156b0 = false;
                readerPreviewActivity.N0(0, false, false);
                if (!readerPreviewActivity.isFinishing()) {
                    readerPreviewActivity.B1(readerPreviewActivity.f26274w);
                    readerPreviewActivity.U4();
                    readerPreviewActivity.H2();
                    return;
                }
                return;
            case 4:
                ReaderMergePdfActivity readerMergePdfActivity = (ReaderMergePdfActivity) this.f25805b;
                int i11 = ReaderMergePdfActivity.f26780f0;
                kotlin.jvm.internal.g.e(readerMergePdfActivity, ea.a.p("R2gic1cw", "lSs8MU33"));
                Intent intent = new Intent(readerMergePdfActivity, ReaderHomeActivity.class);
                intent.putExtra(ea.a.p("WGUyXwNkBF8dcFFyCHQzXzZlQXUqdA==", "SLvEjDuL"), true);
                intent.putExtra(ea.a.p("AWUIXyxlL18hbhJlWnQIZFdfImRm", "VdjqBXfo"), true);
                readerMergePdfActivity.startActivity(intent);
                readerMergePdfActivity.finish();
                return;
            case 5:
                ReaderSplitPdfActivity readerSplitPdfActivity = (ReaderSplitPdfActivity) this.f25805b;
                ReaderSplitPdfActivity.a aVar = ReaderSplitPdfActivity.f26822q0;
                kotlin.jvm.internal.g.e(readerSplitPdfActivity, ea.a.p("Q2gic1Mw", "9i7KwQui"));
                readerSplitPdfActivity.u2(1);
                return;
            case 6:
                pdf.pdfreader.viewer.editor.free.ui.adapter.d.this.i();
                return;
            case 7:
                pdf.pdfreader.viewer.editor.free.ui.convert.c.c((ReaderImg2PDFConvertActivity) this.f25805b);
                return;
            case 8:
                pdf.pdfreader.viewer.editor.free.ui.dialog.g gVar = (pdf.pdfreader.viewer.editor.free.ui.dialog.g) this.f25805b;
                int i12 = pdf.pdfreader.viewer.editor.free.ui.dialog.g.f27566g;
                kotlin.jvm.internal.g.e(gVar, ea.a.p("O2glc24w", "HAOLJotg"));
                MotionLayout motionLayout = gVar.f27570e;
                if (motionLayout != null) {
                    motionLayout.H();
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("Hm82aQZuA2ExbxN0", "FVsBiO7d"));
                    throw null;
                }
            case 9:
                x2.H((x2) this.f25805b);
                return;
            case 10:
                OperateExecuteTask operateExecuteTask = (OperateExecuteTask) this.f25805b;
                kotlin.jvm.internal.g.e(operateExecuteTask, ea.a.p("DWgLcxIw", "k1yb63Z9"));
                LinearLayout linearLayout = operateExecuteTask.f28234l;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                operateExecuteTask.r();
                return;
            case 11:
                AppCompatEditText appCompatEditText = ((ReaderEditSearchActivity) this.f25805b).f28308w;
                if (appCompatEditText != null) {
                    pdf.pdfreader.viewer.editor.free.utils.extension.g.f(appCompatEditText);
                    return;
                }
                return;
            default:
                sp.h hVar = (sp.h) this.f25805b;
                hVar.getClass();
                ea.a.p("UG8mcB9lFmU-YU1vHHR2ZCtuZQ==", "SJLbM8k0");
                hVar.f29856f.post(new pdf.pdfreader.viewer.editor.free.feature.ocr.helper.c(hVar, 9));
                return;
        }
    }
}
