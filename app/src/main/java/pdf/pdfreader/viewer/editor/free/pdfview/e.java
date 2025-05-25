package pdf.pdfreader.viewer.editor.free.pdfview;

import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog;

/* compiled from: ReaderPreviewActivity.java */
/* loaded from: classes3.dex */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderPreviewActivity f26426a;

    /* compiled from: ReaderPreviewActivity.java */
    /* loaded from: classes3.dex */
    public class a implements cg.a<tf.d> {
        @Override // cg.a
        public final /* bridge */ /* synthetic */ tf.d invoke() {
            return null;
        }
    }

    public e(ReaderPreviewActivity readerPreviewActivity) {
        this.f26426a = readerPreviewActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReaderPreviewActivity readerPreviewActivity = this.f26426a;
        if (readerPreviewActivity.Q5 == null) {
            OperatePdfFailedDialog operatePdfFailedDialog = new OperatePdfFailedDialog(readerPreviewActivity, new a());
            readerPreviewActivity.Q5 = operatePdfFailedDialog;
            operatePdfFailedDialog.H(readerPreviewActivity.getString(R.string.arg_res_0x7f130136), readerPreviewActivity.getString(R.string.arg_res_0x7f130561));
        }
        readerPreviewActivity.Q5.show();
    }
}
