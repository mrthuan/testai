package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.content.DialogInterface;
import ao.i2;
import java.util.concurrent.ExecutorService;
import pdf.pdfreader.viewer.editor.free.feature.scan.dialog.ImageAdjustDeleteConfirmDialog;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.ScannerInfoDialog;
import pdf.pdfreader.viewer.editor.free.utils.event.ScanEventCenter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25861a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f25862b;

    public /* synthetic */ z(Object obj, int i10) {
        this.f25861a = i10;
        this.f25862b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i10 = this.f25861a;
        Object obj = this.f25862b;
        switch (i10) {
            case 0:
                ImageAdjustDeleteConfirmDialog imageAdjustDeleteConfirmDialog = (ImageAdjustDeleteConfirmDialog) obj;
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustDeleteConfirmDialog, ea.a.p("F2QiYR9vZw==", "56LWktlq"));
                if (imageAdjustDeleteConfirmDialog.f25679z) {
                    tn.a.b(ScanEventCenter.a(), ea.a.p("AGEwZWZhCGo9c3Q=", "3KpW9lHH"), ea.a.p("LmRbdQp0U2U2ZRVkEGwNdFBfDWwsY2s=", "P2zTcek1"));
                    return;
                } else {
                    tn.a.b(ScanEventCenter.a(), ea.a.p("FGEEZWhhMWo9c3Q=", "e7dc7Utt"), ea.a.p("LmRbdQp0U2U2ZRVjFG4LZVlfDWwsY2s=", "h3W3UnCL"));
                    return;
                }
            case 1:
                i2 i2Var = (i2) obj;
                i2Var.getClass();
                ExecutorService executorService = ReaderPreviewActivity.U5;
                ReaderPreviewActivity readerPreviewActivity = i2Var.f5074a;
                readerPreviewActivity.H3();
                readerPreviewActivity.f26199j1 = null;
                return;
            default:
                ScannerInfoDialog scannerInfoDialog = (ScannerInfoDialog) obj;
                int i11 = ScannerInfoDialog.B;
                kotlin.jvm.internal.g.e(scannerInfoDialog, ea.a.p("R2gic1cw", "Q4ErZ5DM"));
                if (!scannerInfoDialog.A) {
                    tn.a.d(scannerInfoDialog.getContext(), ea.a.p("VHUiZGU=", "ucZO2eQS"), ea.a.p("P2RXMh51XmQ_XyZhAWUaX1ZsB2Nr", "pXMkQdgi"), scannerInfoDialog.H(), false);
                    return;
                }
                return;
        }
    }
}
