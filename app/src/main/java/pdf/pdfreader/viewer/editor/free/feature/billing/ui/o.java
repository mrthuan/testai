package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import android.content.Context;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.SubscriptionDarkTestJActivity;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;
import pdf.pdfreader.viewer.editor.free.office.OfficeReaderActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.ScannerInfoDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.t2;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugAppConfigFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugNotificationFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.q0;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24944a;

    public /* synthetic */ o(int i10) {
        this.f24944a = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24944a) {
            case 0:
                SubscriptionDarkTestJActivity.a aVar = SubscriptionDarkTestJActivity.f24905b0;
                return;
            case 1:
                PDFPageManagerActivity.a aVar2 = PDFPageManagerActivity.H0;
                return;
            case 2:
                String str = OfficeReaderActivity.D2;
                return;
            case 3:
                int i10 = t2.f27761b;
                return;
            case 4:
                int i11 = DebugAppConfigFragment.f27856d0;
                ReaderPdfApplication.f23861m = true;
                j1.a(view.getContext(), ea.a.p("r67R5_Sun4jY5eyf", "DCGoIye7"));
                return;
            case 5:
                int i12 = DebugNotificationFragment.f27859d0;
                yn.a aVar3 = yn.a.f32189o;
                Context context = view.getContext();
                kotlin.jvm.internal.g.d(context, ea.a.p("G3RfYzpuQ2UwdA==", "wvrqU7qx"));
                aVar3.i0(context, 1, ea.a.p("R2U4dEIuEmRm", "bAm2nY5Z"), null);
                return;
            case 6:
                int i13 = DebugPageAndDialogFragment.f27860g0;
                Context context2 = view.getContext();
                pdf.pdfreader.viewer.editor.free.feature.billing.dialog.b bVar = new pdf.pdfreader.viewer.editor.free.feature.billing.dialog.b(context2, a0.a.i("RS4obx10B3h0", "9H7y0Pvn", context2, "SDQ=", "B3yLFqWh"), ea.a.p("FzV6Lko5", "xcapy9NK"));
                bVar.f23542t = new q0();
                bVar.show();
                return;
            case 7:
                int i14 = DebugPageAndDialogFragment.f27860g0;
                Context context3 = view.getContext();
                kotlin.jvm.internal.g.d(context3, ea.a.p("JnQfYxZuQ2UidA==", "sbdJKmZ3"));
                new pdf.pdfreader.viewer.editor.free.ui.dialog.c(context3).show();
                return;
            case 8:
                int i15 = DebugPageAndDialogFragment.f27860g0;
                Context context4 = view.getContext();
                kotlin.jvm.internal.g.d(context4, ea.a.p("WnRlYxxuFmUKdA==", "QU03kTzu"));
                new ScannerInfoDialog(context4, ScannerInfoDialog.ScannerType.OCR).show();
                return;
            default:
                return;
        }
    }
}
