package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Toast;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.feature.scan.dialog.ChooseCropTypeDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperateInterceptDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperatePdfFailedDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27932a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f27933b;

    public /* synthetic */ w(Context context, int i10) {
        this.f27932a = i10;
        this.f27933b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f27932a;
        Context context = this.f27933b;
        switch (i10) {
            case 0:
                int i11 = DebugAppConfigFragment.f27856d0;
                kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "ljVohBIc"));
                no.f.b(view.getContext()).getClass();
                no.f.j(0L);
                no.f.b(view.getContext()).getClass();
                pdf.pdfreader.viewer.editor.free.utils.d1 b10 = pdf.pdfreader.viewer.editor.free.utils.d1.b(ReaderPdfApplication.m());
                String p10 = ea.a.p("KWNcXw5vRWsFYyV1G3Q3MQM1", "LEz4zbNP");
                SharedPreferences sharedPreferences = b10.f28619a;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt(p10, 0).apply();
                }
                Toast.makeText(context, ea.a.p("q7-f5u250YjK5cCf", "zWQJ2Zgx"), 0).show();
                return;
            case 1:
                int i12 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "CPusB4Rg"));
                OperatePdfFailedDialog operatePdfFailedDialog = new OperatePdfFailedDialog(context, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initMergeSplitDialogDebug$3$1
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
                kotlin.jvm.internal.g.d(string, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdyhYDAcgpuVi5BZSpkFnI9bRdyU2U2ZjdpKGVWKQ==", "gfc1tkh0"));
                operatePdfFailedDialog.H(string, context.getResources().getString(R.string.arg_res_0x7f1303af));
                operatePdfFailedDialog.show();
                return;
            case 2:
                int i13 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("E2MLbjllTHQ=", "dU7dM4vM"));
                String string2 = context.getResources().getString(R.string.arg_res_0x7f130391);
                kotlin.jvm.internal.g.d(string2, ea.a.p("EG8UdCN4Ny46ZRVvQXI0ZUsuNWU9U0JyloDXbjYuMGUSZB9yGWYqbC1fA3hXZSd0UW88KQ==", "RqszFC22"));
                String string3 = context.getResources().getString(R.string.arg_res_0x7f1303a9);
                kotlin.jvm.internal.g.d(string3, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdyt4DQchdhLGVBXydvEGEOXxRpWGU2Yz5hKmdXKQ==", "UvrHj5OA"));
                new i3(context, string2, string3, null).show();
                return;
            case 3:
                int i14 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "4Qx81nRX"));
                OperatePdfFailedDialog operatePdfFailedDialog2 = new OperatePdfFailedDialog(context, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment$initNormalDialogDebug$12$operatePdfFailedDialog2$1
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
                kotlin.jvm.internal.g.d(string4, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdym4DIbgUuHmFabC5kLHQNXxFvWnYMciJfI3BGKQ==", "ynbxS2ht"));
                operatePdfFailedDialog2.H(string4, context.getResources().getString(R.string.arg_res_0x7f130052));
                operatePdfFailedDialog2.show();
                return;
            case 4:
                int i15 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "HP5VQ1CU"));
                new ChooseCropTypeDialog(null, context, ea.a.p("V2UpdWc=", "at5cUL4X")).show();
                return;
            case 5:
                int i16 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "lzgfFw07"));
                new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.c(context, 1, null).show();
                return;
            case 6:
                int i17 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("bmM_bhBlKXQ=", "BKJPdQHv"));
                String string5 = context.getResources().getString(R.string.arg_res_0x7f13035a);
                kotlin.jvm.internal.g.d(string5, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdy0oDlUm9zM3JabiwuAnULdC1jW24fZSR0LW5VKQ==", "0CAGEsTA"));
                String string6 = context.getResources().getString(R.string.arg_res_0x7f1303d2);
                kotlin.jvm.internal.g.d(string6, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdyg4D0cwZyAG5ULjllEmQHci1xQWkdXyJvJXNGKQ==", "aRris87F"));
                new OperateInterceptDialog(context, string5, string6).show();
                return;
            default:
                int i18 = e1.f27886d0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "jvLGBrfa"));
                j1.e(context, context.getResources().getString(R.string.arg_res_0x7f1303ec), true, null, -1);
                return;
        }
    }
}
