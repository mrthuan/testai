package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import android.content.Context;
import android.view.View;
import fn.c;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.pdf_editor.ui.dialog.EditorFreeSaveDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g3;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27875a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f27876b;

    public /* synthetic */ c0(Context context, int i10) {
        this.f27875a = i10;
        this.f27876b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f27875a;
        Context context = this.f27876b;
        switch (i10) {
            case 0:
                int i11 = DebugAppConfigFragment.f27856d0;
                kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "1MtT1Y3p"));
                try {
                    pdf.pdfreader.viewer.editor.free.utils.q0.x(context, (int) (pdf.pdfreader.viewer.editor.free.utils.q0.j(context) - 1), ea.a.p("VWk5cwdfF3MXZGt2DHIJYytkZQ==", "0Uo2uA5Y"));
                    long j10 = pdf.pdfreader.viewer.editor.free.utils.q0.j(context);
                    j1.a(context, "首次版本号重置为" + j10);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            case 1:
                int i12 = DebugAppConfigFragment.f27856d0;
                kotlin.jvm.internal.g.e(context, ea.a.p("FWMEbiBlCXQ=", "w11kTq3f"));
                fn.c.c.getClass();
                if (c.a.b() == 0) {
                    new g3(context).show();
                    return;
                } else {
                    new EditorFreeSaveDialog(context).show();
                    return;
                }
            case 2:
                int i13 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "jlcLYzxS"));
                OperatePdfFailedDialog operatePdfFailedDialog = new OperatePdfFailedDialog(context, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initMergeSplitDialogDebug$1$1
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ tf.d invoke() {
                        invoke2();
                        return tf.d.f30009a;
                    }
                });
                String string = context.getResources().getString(R.string.arg_res_0x7f1303f8);
                kotlin.jvm.internal.g.d(string, ea.a.p("Im9ZdBJ4GS46ZRVvQXI0ZUsuNWU9U0JyloDXcjhuJS4zZVZkEnIyczhsD3RrZjZpVGU2KQ==", "xXA7wmMy"));
                operatePdfFailedDialog.H(string, context.getResources().getString(R.string.arg_res_0x7f1303fa));
                operatePdfFailedDialog.show();
                return;
            case 3:
                int i14 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("VWMlbhhlMXQ=", "dqqJlIvm"));
                new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f(context, 1, null).show();
                return;
            case 4:
                int i15 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("HWMIbhxlAHQ=", "AM9ghx8M"));
                new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.c(context, 0, null).show();
                return;
            default:
                int i16 = e1.f27886d0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "abV1kB0A"));
                j1.e(context, context.getString(R.string.arg_res_0x7f130172), true, null, -1);
                return;
        }
    }
}
