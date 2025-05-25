package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import android.content.Context;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.dialog.EnterFileNameDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27910a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f27911b;

    public /* synthetic */ l0(Context context, int i10) {
        this.f27910a = i10;
        this.f27911b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f27910a;
        Context context = this.f27911b;
        switch (i10) {
            case 0:
                int i11 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "8swA1zQ1"));
                EnterFileNameDialog enterFileNameDialog = new EnterFileNameDialog(context, new o0(context), false);
                DebugPageAndDialogFragment$initMergeSplitDialogDebug$5$2$1 debugPageAndDialogFragment$initMergeSplitDialogDebug$5$2$1 = new cg.l<String, Boolean>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initMergeSplitDialogDebug$5$2$1
                    @Override // cg.l
                    public final Boolean invoke(String it) {
                        kotlin.jvm.internal.g.e(it, "it");
                        return Boolean.TRUE;
                    }
                };
                kotlin.jvm.internal.g.e(debugPageAndDialogFragment$initMergeSplitDialogDebug$5$2$1, "<set-?>");
                enterFileNameDialog.f27436v = debugPageAndDialogFragment$initMergeSplitDialogDebug$5$2$1;
                enterFileNameDialog.show();
                return;
            case 1:
                int i12 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "JhtNEojW"));
                String string = context.getResources().getString(R.string.arg_res_0x7f1303be);
                kotlin.jvm.internal.g.d(string, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdyCG4PKBYuRnRBaSVnXXIHYRZlRl8GbyZzKQ==", "ahD52U0V"));
                String string2 = context.getResources().getString(R.string.arg_res_0x7f1303a5);
                kotlin.jvm.internal.g.d(string2, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdyg4DzcmpsDmFXXy1hGmw9cwtzQGUEXzNyNm9AKQ==", "aU5aQ0Eg"));
                new i3(context, string, string2, null).show();
                return;
            case 2:
                int i13 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "cT3Xayk8"));
                pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r rVar = new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r(context, 1, "", "", null);
                rVar.E = 31;
                rVar.show();
                return;
            default:
                int i14 = e1.f27886d0;
                kotlin.jvm.internal.g.e(context, ea.a.p("V2MgbhplP3Q=", "7usOnGyf"));
                j1.b(context, context.getResources().getString(R.string.arg_res_0x7f130049));
                return;
        }
    }
}
