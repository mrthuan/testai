package pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity;

import android.content.Intent;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.ToolsType;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog;
import pdf.pdfreader.viewer.editor.free.utils.p;
import tf.d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25594a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderConvertPreviewActivity f25595b;

    public /* synthetic */ a(ReaderConvertPreviewActivity readerConvertPreviewActivity, int i10) {
        this.f25594a = i10;
        this.f25595b = readerConvertPreviewActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25594a;
        final ReaderConvertPreviewActivity readerConvertPreviewActivity = this.f25595b;
        switch (i10) {
            case 0:
                int i11 = ReaderConvertPreviewActivity.R1;
                g.e(readerConvertPreviewActivity, ea.a.p("R2gic1cw", "fcfaeDLz"));
                if (readerConvertPreviewActivity.D2()) {
                    readerConvertPreviewActivity.E2();
                } else if (readerConvertPreviewActivity.C2().booleanValue()) {
                    p.o(readerConvertPreviewActivity, readerConvertPreviewActivity.T2());
                    Intent intent = new Intent(readerConvertPreviewActivity, ReaderHomeActivity.class);
                    intent.putExtra(ea.a.p("JGVIXxdlQF8zbj5lG3Q3ZFpfAG8xaAxuZw==", "3d1Nc3Dz"), true);
                    readerConvertPreviewActivity.startActivity(intent);
                    ReaderPdfApplication.k().g(new nl.g(ToolsType.PDF2WORD, ea.a.p("Q2QtMgRvEGQ=", "PRQCHA5B")));
                    readerConvertPreviewActivity.finish();
                }
                readerConvertPreviewActivity.finish();
                return;
            default:
                int i12 = ReaderConvertPreviewActivity.R1;
                g.e(readerConvertPreviewActivity, ea.a.p("BWgOc2ow", "8jqgN4QT"));
                if (readerConvertPreviewActivity.P1 == null) {
                    readerConvertPreviewActivity.P1 = new OperatePdfFailedDialog(readerConvertPreviewActivity, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.pdf2word.ui.activity.ReaderConvertPreviewActivity$showErrDialog$1$1
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
                            ReaderConvertPreviewActivity readerConvertPreviewActivity2 = ReaderConvertPreviewActivity.this;
                            int i13 = ReaderConvertPreviewActivity.R1;
                            p.i(readerConvertPreviewActivity2, readerConvertPreviewActivity2.R2().concat("_error"));
                        }
                    });
                }
                OperatePdfFailedDialog operatePdfFailedDialog = readerConvertPreviewActivity.P1;
                if (operatePdfFailedDialog != null) {
                    String string = readerConvertPreviewActivity.getResources().getString(R.string.arg_res_0x7f130136);
                    g.d(string, ea.a.p("F2U7bxByKWU7LgFlQFMjclFuNSgbLkV0loDXbjYuJGEMbC1kOnQlXytvCHZRciNfX3AmKQ==", "WjeHeJxx"));
                    operatePdfFailedDialog.H(string, readerConvertPreviewActivity.getResources().getString(R.string.arg_res_0x7f130561));
                }
                OperatePdfFailedDialog operatePdfFailedDialog2 = readerConvertPreviewActivity.P1;
                if (operatePdfFailedDialog2 != null) {
                    operatePdfFailedDialog2.show();
                }
                p.k(readerConvertPreviewActivity, readerConvertPreviewActivity.R2().concat("_error"));
                return;
        }
    }
}
