package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import android.content.Context;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.dialog.PageManagerDeleteConfirmDialog;
import pdf.pdfreader.viewer.editor.free.feature.scan.dialog.ImageAdjustDeleteConfirmDialog;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ClearDefaultReaderStep2Activity;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugIAPConfigFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25846a;

    public /* synthetic */ s(int i10) {
        this.f25846a = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f25846a) {
            case 0:
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                return;
            case 1:
                Word2PDFConvertActivity.a aVar2 = Word2PDFConvertActivity.f26020p1;
                return;
            case 2:
                ClearDefaultReaderStep2Activity.a aVar3 = ClearDefaultReaderStep2Activity.C;
                return;
            case 3:
                int i10 = DebugIAPConfigFragment.f27857e0;
                BillingConfigImpl.c.getClass();
                ig.h<Object>[] hVarArr = BillingConfigImpl.f24850d;
                BillingConfigImpl.B.c(hVarArr[7], 0L);
                BillingConfigImpl.A.c(hVarArr[6], 0);
                j1.a(view.getContext(), ea.a.p("p66P58Su0YjK5cCf", "mjvNmNhG"));
                return;
            case 4:
                int i11 = DebugPageAndDialogFragment.f27860g0;
                Context context = view.getContext();
                kotlin.jvm.internal.g.d(context, ea.a.p("WnRlYxxuFmUKdA==", "LoWPNXSd"));
                new ImageAdjustDeleteConfirmDialog(context).show();
                return;
            case 5:
                int i12 = DebugPageAndDialogFragment.f27860g0;
                ClearDefaultReaderStep2Activity.a aVar4 = ClearDefaultReaderStep2Activity.C;
                Context context2 = view.getContext();
                kotlin.jvm.internal.g.d(context2, ea.a.p("G3RJYzVuNWUwdA==", "j9rgZAvr"));
                String p10 = ea.a.p("N2lQbxRp", "xAnfByMM");
                aVar4.getClass();
                ClearDefaultReaderStep2Activity.a.a(context2, p10);
                return;
            case 6:
                int i13 = DebugPageAndDialogFragment.f27860g0;
                new pdf.pdfreader.viewer.editor.free.ui.dialog.x(view.getContext()).show();
                return;
            default:
                int i14 = DebugPageAndDialogFragment.f27860g0;
                Context context3 = view.getContext();
                kotlin.jvm.internal.g.d(context3, ea.a.p("LnR4YwBuBmUwdA==", "tiGVorqN"));
                new PageManagerDeleteConfirmDialog(context3, 1).show();
                return;
        }
    }
}
