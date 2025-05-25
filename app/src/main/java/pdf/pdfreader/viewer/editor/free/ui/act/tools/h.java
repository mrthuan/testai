package pdf.pdfreader.viewer.editor.free.ui.act.tools;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.activity.s;
import androidx.constraintlayout.motion.widget.MotionLayout;
import kotlin.Result;
import pdf.pdfreader.viewer.editor.free.data.FileRepository;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.i;
import pdf.pdfreader.viewer.editor.free.ui.dialog.PreviewAddTextDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.n3;
import pdf.pdfreader.viewer.editor.free.ui.widget.CreatePDFToolsGuideView;
import pdf.pdfreader.viewer.editor.free.ui.widget.OperateExecuteTask;
import pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditChooserActivity;
import pdf.pdfreader.viewer.editor.free.utils.b1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27064a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f27065b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f27064a = i10;
        this.f27065b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f27064a) {
            case 0:
                PDFChooseActivity pDFChooseActivity = (PDFChooseActivity) this.f27065b;
                kotlin.jvm.internal.g.e(pDFChooseActivity, ea.a.p("PWgscxww", "pQIE8kqA"));
                FileRepository.C(pDFChooseActivity, new i.a.C0351a(pDFChooseActivity));
                return;
            case 1:
                PreviewAddTextDialog previewAddTextDialog = (PreviewAddTextDialog) this.f27065b;
                int i10 = PreviewAddTextDialog.f27451o;
                kotlin.jvm.internal.g.e(previewAddTextDialog, ea.a.p("O2hYc10w", "VYryZYn1"));
                if (previewAddTextDialog.isShowing()) {
                    EditText editText = previewAddTextDialog.p().c;
                    kotlin.jvm.internal.g.d(editText, ea.a.p("VWk0ZARuKy4rbwh0UW4jRVxpdA==", "wC7ZmLzh"));
                    editText.getViewTreeObserver().addOnWindowFocusChangeListener(new pdf.pdfreader.viewer.editor.free.utils.extension.h(editText));
                    return;
                }
                return;
            case 2:
                n3 n3Var = (n3) this.f27065b;
                int i11 = n3.f27703k;
                kotlin.jvm.internal.g.e(n3Var, ea.a.p("R2gic1cw", "M0O95eJ1"));
                int[] iArr = n3Var.f27708f;
                int[] iArr2 = n3Var.f27707e;
                View view = n3Var.c;
                if (view != null) {
                    try {
                        view.getLocationOnScreen(iArr2);
                        n3Var.f27704a.getLocationOnScreen(iArr);
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (iArr2[1] - iArr[1]) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        view.setLayoutParams(layoutParams);
                        Result.m13constructorimpl(tf.d.f30009a);
                        return;
                    } catch (Throwable th2) {
                        Result.m13constructorimpl(s.v(th2));
                        return;
                    }
                }
                return;
            case 3:
                CreatePDFToolsGuideView.s((CreatePDFToolsGuideView) this.f27065b);
                return;
            case 4:
                OperateExecuteTask operateExecuteTask = (OperateExecuteTask) this.f27065b;
                kotlin.jvm.internal.g.e(operateExecuteTask, ea.a.p("O2hYc10w", "6wLvZDPd"));
                MotionLayout motionLayout = operateExecuteTask.f28233k;
                if (motionLayout != null) {
                    motionLayout.setVisibility(0);
                }
                MotionLayout motionLayout2 = operateExecuteTask.f28233k;
                if (motionLayout2 != null) {
                    motionLayout2.H();
                    return;
                }
                return;
            case 5:
                ReaderEditChooserActivity readerEditChooserActivity = (ReaderEditChooserActivity) this.f27065b;
                String str = ReaderEditChooserActivity.B;
                kotlin.jvm.internal.g.e(readerEditChooserActivity, ea.a.p("R2gic1cw", "xSe3Uxuo"));
                readerEditChooserActivity.finish();
                return;
            case 6:
                ((b1.b) this.f27065b).f28555b.a(null, null);
                return;
            default:
                sp.h hVar = (sp.h) this.f27065b;
                synchronized (hVar) {
                    hVar.b();
                    hVar.f();
                }
                return;
        }
    }
}
