package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.ShortcutType;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27873a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f27874b;

    public /* synthetic */ c(Context context, int i10) {
        this.f27873a = i10;
        this.f27874b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f27873a;
        Context context = this.f27874b;
        switch (i10) {
            case 0:
                int i11 = n.f27916d0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "JNRtk55f"));
                bl.a.J(view.getContext()).f5470i = false;
                Toast.makeText(context, ea.a.p("p66P58Su0YjK5cCfmrzk6Jq3h4fI5vOwipDr5c6oiajE5YuP", "w4OcoDDn"), 0).show();
                return;
            case 1:
                int i12 = DebugAppConfigFragment.f27856d0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "3mazKkEt"));
                try {
                    zl.a.c.getClass();
                    ig.h<Object>[] hVarArr = zl.a.f32400d;
                    zl.a.f32403g.c(hVarArr[2], 0L);
                    zl.a.f32404h.c(hVarArr[3], 0L);
                    zl.a.f32405i.c(hVarArr[4], 0L);
                    zl.a.f32406j.c(hVarArr[5], 0L);
                    zl.a.f32407k.c(hVarArr[6], 0L);
                    ig.h<Object> hVar = hVarArr[7];
                    Boolean bool = Boolean.FALSE;
                    zl.a.f32408l.c(hVar, bool);
                    zl.a.f32409m.c(hVarArr[8], bool);
                    zl.a.f32410n.c(hVarArr[9], bool);
                    Toast.makeText(context, ea.a.p("2ofG586uhIji5b6f", "70LLjjOb"), 0).show();
                    return;
                } catch (Exception unused) {
                    Toast.makeText(context, ea.a.p("poe858Su0qTr6P6l", "BXPTbPKs"), 0).show();
                    return;
                }
            case 2:
                int i13 = DebugAppConfigFragment.f27856d0;
                kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "plQkweZc"));
                try {
                    pdf.pdfreader.viewer.editor.free.utils.q0.w(context, "docx2pdf_red_dot_show_in_159", true);
                    pdf.pdfreader.viewer.editor.free.utils.q0.w(context, "preview_docx2pdf_guide_show_in_159", true);
                    j1.a(context, ea.a.p("p7fk6caNpb3m79qM0rP_5ryPu5zJ6JCBnYf85-yuq6bU5vqhpK7L6OuFgYm85sus3Y-3", "wKBVAB7c"));
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            case 3:
                int i14 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "4ZaudKUE"));
                OperatePdfFailedDialog operatePdfFailedDialog = new OperatePdfFailedDialog(context, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initMergeSplitDialogDebug$2$1
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
                kotlin.jvm.internal.g.d(string, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdyoYDHcl9uKC5BZSpkFnI9cwJsXXQ2ZjdpKGVWKQ==", "Ca6OjLt7"));
                operatePdfFailedDialog.H(string, context.getResources().getString(R.string.arg_res_0x7f1303f9));
                operatePdfFailedDialog.show();
                return;
            case 4:
                int i15 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "8GrnbxMz"));
                new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.q(context).show();
                return;
            default:
                int i16 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "dum3LoYF"));
                new pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.a(context, ShortcutType.WIDGET).show();
                return;
        }
    }
}
