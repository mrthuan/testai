package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.PageManagerQuitDialog;
import pdf.pdfreader.viewer.editor.free.ui.act.ClearDefaultReaderStep2Activity;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugNotificationFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class m2 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27663a;

    public /* synthetic */ m2(int i10) {
        this.f27663a = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f27663a) {
            case 0:
                int i10 = PreviewAddTextDialog.f27451o;
                return;
            case 1:
                boolean z10 = ReaderDebugActivity.f27826e;
                return;
            case 2:
                int i11 = DebugNotificationFragment.f27859d0;
                yn.c cVar = yn.c.f32199o;
                Context context = view.getContext();
                kotlin.jvm.internal.g.d(context, ea.a.p("JnQfYxZuQ2UidA==", "B3DgJw2s"));
                cVar.i0(context, 1);
                return;
            case 3:
                int i12 = DebugPageAndDialogFragment.f27860g0;
                Context context2 = view.getContext();
                new pdf.pdfreader.viewer.editor.free.feature.billing.dialog.c(a0.a.i("WnRlYxxuFmUKdA==", "wSmRF6mq", context2, "Mw==", "NLsDNIL0"), context2, false, true).show();
                return;
            case 4:
                int i13 = DebugPageAndDialogFragment.f27860g0;
                ClearDefaultReaderStep2Activity.a aVar = ClearDefaultReaderStep2Activity.C;
                Context context3 = view.getContext();
                kotlin.jvm.internal.g.d(context3, ea.a.p("JnQfYxZuQ2UidA==", "lpLIw1jD"));
                String p10 = ea.a.p("Q2kzZWw=", "3zGPpSEa");
                aVar.getClass();
                ClearDefaultReaderStep2Activity.a.a(context3, p10);
                return;
            default:
                int i14 = DebugPageAndDialogFragment.f27860g0;
                Context context4 = view.getContext();
                kotlin.jvm.internal.g.d(context4, ea.a.p("WnRlYxxuFmUKdA==", "CMzJ0HqX"));
                new PageManagerQuitDialog(context4).show();
                return;
        }
    }
}
