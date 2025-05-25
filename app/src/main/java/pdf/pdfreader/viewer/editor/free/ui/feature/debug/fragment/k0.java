package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import android.content.Context;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.ShortcutType;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27906a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f27907b;

    public /* synthetic */ k0(Context context, int i10) {
        this.f27906a = i10;
        this.f27907b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f27906a;
        final Context context = this.f27907b;
        switch (i10) {
            case 0:
                int i11 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("bmMbbjtlMHQ=", "OjJtOHVq"));
                OperatePdfFailedDialog operatePdfFailedDialog = new OperatePdfFailedDialog(context, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initMergeSplitDialogDebug$4$1
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ tf.d invoke() {
                        invoke2();
                        return tf.d.f30009a;
                    }
                });
                String string = context.getResources().getString(R.string.arg_res_0x7f1303ad);
                kotlin.jvm.internal.g.d(string, ea.a.p("LG9fdBx4Qy4oZTlvAHILZUYuCWUxUxFyp4DMcj5uHi49ZVBkHHJobT9yLWUqZglpWWUKKQ==", "olOmEjWy"));
                operatePdfFailedDialog.H(string, context.getResources().getString(R.string.arg_res_0x7f1303ae));
                operatePdfFailedDialog.show();
                return;
            case 1:
                int i12 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "qDiZyqp5"));
                String string2 = context.getResources().getString(R.string.arg_res_0x7f1303be);
                kotlin.jvm.internal.g.d(string2, ea.a.p("LG9fdBx4Qy4oZTlvAHILZUYuCWUxUxFyIG4oKGQuBnQ9aV9nV3JSYT5lOF8abxhzKQ==", "kvLEIO6u"));
                String string3 = context.getResources().getString(R.string.arg_res_0x7f1303a4);
                kotlin.jvm.internal.g.d(string3, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdymoDiZTlfBW9SZBRmEmkOXwJhRnMMXzNyNm9AKQ==", "xDKikqjS"));
                new i3(context, string2, string3, null).show();
                return;
            case 2:
                int i13 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "g6nctG60"));
                OperatePdfFailedDialog operatePdfFailedDialog2 = new OperatePdfFailedDialog(context, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initNormalDialogDebug$13$operatePdfFailedDialog2$1
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ tf.d invoke() {
                        invoke2();
                        return tf.d.f30009a;
                    }
                });
                String string4 = context.getResources().getString(R.string.arg_res_0x7f130136);
                kotlin.jvm.internal.g.d(string4, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdy0oCRbgouKGFabC5kLHQNXxFvWnYMciJfI3BGKQ==", "07mNwZqx"));
                operatePdfFailedDialog2.H(string4, context.getResources().getString(R.string.arg_res_0x7f130561));
                operatePdfFailedDialog2.show();
                return;
            case 3:
                int i14 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "MQK02nMs"));
                pdf.pdfreader.viewer.editor.free.ui.dialog.y yVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.y(context, new cg.p<Integer, Integer, String>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initNormalDialogDebug$20$progressDialog$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // cg.p
                    public /* bridge */ /* synthetic */ String invoke(Integer num, Integer num2) {
                        return invoke(num.intValue(), num2.intValue());
                    }

                    public final String invoke(int i15, int i16) {
                        String string5 = context.getString(R.string.arg_res_0x7f1301aa);
                        kotlin.jvm.internal.g.d(string5, ea.a.p("OW8gdAd4IS4vZRJTQHI-bl8oAC46dERpGmdfaTxwLXIuaSBnKQ==", "1uZNbUHT"));
                        return string5;
                    }
                }, true, true, true);
                yVar.setOnDismissListener(new e0());
                yVar.d(75, 100);
                return;
            case 4:
                int i15 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "UrctQLaC"));
                pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r rVar = new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r(context, 0, "", "", null);
                rVar.E = 31;
                rVar.show();
                return;
            case 5:
                int i16 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "MBmseNtz"));
                new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.l(context, true, true).show();
                return;
            case 6:
                int i17 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("cWNZbkBlQXQ=", "77U649dD"));
                new pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.a(context, ShortcutType.ICON).show();
                return;
            case 7:
                int i18 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "SO7UP7Q6"));
                OperatePdfFailedDialog operatePdfFailedDialog3 = new OperatePdfFailedDialog(context, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initNormalDialogDebug$10$operatePdfFailedDialog$1
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ tf.d invoke() {
                        invoke2();
                        return tf.d.f30009a;
                    }
                });
                String string5 = context.getResources().getString(R.string.arg_res_0x7f130136);
                kotlin.jvm.internal.g.d(string5, ea.a.p("KW8DdAp4TS46ZRVvQXI0ZUsuNWU9U0JyloDXbjYuJGEjbAhkMHRWXytvCHZRciNfX3AmKQ==", "BxJmo9Wc"));
                operatePdfFailedDialog3.H(string5, context.getResources().getString(R.string.arg_res_0x7f1302c3));
                operatePdfFailedDialog3.show();
                return;
            case 8:
                int i19 = e1.f27886d0;
                kotlin.jvm.internal.g.e(context, ea.a.p("TWMLbixlLnQ=", "h7idXVQB"));
                j1.e(context, context.getResources().getString(R.string.arg_res_0x7f130413, ea.a.p("MQ==", "ZVxaj4Wn")), true, null, -1);
                return;
            default:
                int i20 = e1.f27886d0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "3tENtUla"));
                j1.h(context.getResources().getString(R.string.arg_res_0x7f1304d0), context, true, R.drawable.ic_fail_warning);
                return;
        }
    }
}
