package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.ui.dialog.ScannerInfoDialog;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugNotificationFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class s2 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27750a;

    public /* synthetic */ s2(int i10) {
        this.f27750a = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f27750a) {
            case 0:
                int i10 = t2.f27761b;
                return;
            case 1:
                int i11 = DebugNotificationFragment.f27859d0;
                ap.e eVar = new ap.e();
                Context context = view.getContext();
                kotlin.jvm.internal.g.d(context, ea.a.p("JnQfYxZuQ2UidA==", "EWzgfOOB"));
                eVar.e(context);
                return;
            case 2:
                int i12 = DebugPageAndDialogFragment.f27860g0;
                Context context2 = view.getContext();
                pdf.pdfreader.viewer.editor.free.feature.billing.dialog.b bVar = new pdf.pdfreader.viewer.editor.free.feature.billing.dialog.b(context2, a0.a.i("RS4obx10B3h0", "rntS49O6", context2, "Nw==", "cXEmyQjP"), ea.a.p("bjUGLlo5", "wEJ7cOZE"));
                bVar.f23542t = new pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.p0();
                bVar.show();
                return;
            case 3:
                int i13 = DebugPageAndDialogFragment.f27860g0;
                Context context3 = view.getContext();
                new PdfReaderOpenDefaultDialog(context3, 1, a0.a.i("WnRlYxxuFmUKdA==", "ba9eAnot", context3, "N2V0", "6qDbTJ93"), new u0.a(11)).show();
                return;
            default:
                int i14 = DebugPageAndDialogFragment.f27860g0;
                Context context4 = view.getContext();
                kotlin.jvm.internal.g.d(context4, ea.a.p("WnRlYxxuFmUKdA==", "53EHlKxJ"));
                new ScannerInfoDialog(context4, ScannerInfoDialog.ScannerType.SCANNER).show();
                return;
        }
    }
}
