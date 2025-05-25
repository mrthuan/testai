package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import android.content.Context;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperateInterceptDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27922a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f27923b;

    public /* synthetic */ t(Context context, int i10) {
        this.f27922a = i10;
        this.f27923b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f27922a;
        Context context = this.f27923b;
        switch (i10) {
            case 0:
                int i11 = DebugAppConfigFragment.f27856d0;
                kotlin.jvm.internal.g.e(context, ea.a.p("EmM7bhJlPnQ=", "UH6TfFcM"));
                eo.e.p(context, 1);
                return;
            case 1:
                int i12 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "5UN2Jo9z"));
                String string = context.getResources().getString(R.string.arg_res_0x7f1303d0);
                kotlin.jvm.internal.g.d(string, ea.a.p("LG9fdBx4Qy4oZTlvAHILZUYuCWUxUxFyjIDTcgBuMy49ZVBkHHJocS9pPl8YZRpnXG4JKQ==", "MY4DnuiT"));
                String string2 = context.getResources().getString(R.string.arg_res_0x7f1303d2);
                kotlin.jvm.internal.g.d(string2, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdykIDRczFyA25ULjllEmQHci1xQWkdXyJvJXNGKQ==", "rwEjSKQA"));
                new OperateInterceptDialog(context, string, string2).show();
                return;
            case 2:
                int i13 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("ZmNXbi1lT3Q=", "H2B8Y7n3"));
                String string3 = context.getResources().getString(R.string.arg_res_0x7f1303be);
                kotlin.jvm.internal.g.d(string3, ea.a.p("Gm8mdAt4Ei46ZRVvQXI0ZUsuNWU9U0JyHW4WKAMuMXQLaSZnQHIDYSxlFF9bbydzKQ==", "jryHnf6p"));
                String string4 = context.getResources().getString(R.string.arg_res_0x7f1303a3);
                kotlin.jvm.internal.g.d(string4, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdyroD-ZRpfNG9SZBRmEmkOXx5hV2s2bTNtK3JLKQ==", "LXhXK6C0"));
                new i3(context, string3, string4, null).show();
                return;
            case 3:
                int i14 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "0kvSuhp3"));
                pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r rVar = new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r(context, 0, "", "", null);
                rVar.E = 33;
                rVar.show();
                return;
            default:
                int i15 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "Z6JJMkly"));
                pdf.pdfreader.viewer.editor.free.utils.q0.w(context, "tools_red_dot_show_in_version_95", true);
                return;
        }
    }
}
