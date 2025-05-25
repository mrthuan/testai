package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import h5.c;
import j5.a;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.dialog.OperateInterceptDialog;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.utils.j1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27869a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f27870b;

    public /* synthetic */ b0(Context context, int i10) {
        this.f27869a = i10;
        this.f27870b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f27869a;
        Context context = this.f27870b;
        switch (i10) {
            case 0:
                int i11 = DebugAppConfigFragment.f27856d0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "ZNmp6f5M"));
                try {
                    c.a aVar = h5.c.f18014h;
                    Context context2 = view.getContext();
                    kotlin.jvm.internal.g.d(context2, ea.a.p("JnQfYxZuQ2UidA==", "ClmIOplC"));
                    h5.c a10 = aVar.a(context2);
                    a.C0258a c0258a = j5.a.f19040b;
                    int a11 = c0258a.a(a10.f18016a).a("pi_lcac", 0) - 1;
                    Context context3 = view.getContext();
                    kotlin.jvm.internal.g.d(context3, ea.a.p("JnQfYxZuQ2UidA==", "pWLG2ocB"));
                    j5.a.b(c0258a.a(aVar.a(context3).f18016a), "pi_lcac", a11);
                    j1.a(context, "版本号重置为" + a11);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            case 1:
                int i12 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("HWMJbhJlAXQ=", "zW9ffybV"));
                String string = context.getResources().getString(R.string.arg_res_0x7f1303d1);
                kotlin.jvm.internal.g.d(string, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdy1IDsbg0uR2VSZC5yLHEXaQZfR3AFaSJ0LW5VKQ==", "6Jj5lGsa"));
                String string2 = context.getResources().getString(R.string.arg_res_0x7f1303d2);
                kotlin.jvm.internal.g.d(string2, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdyuICTcy1yGm5ULjllEmQHci1xQWkdXyJvJXNGKQ==", "Z5Ys9Xkr"));
                new OperateInterceptDialog(context, string, string2).show();
                return;
            case 2:
                int i13 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "WfjdhIeW"));
                String string3 = context.getResources().getString(R.string.arg_res_0x7f13040a);
                kotlin.jvm.internal.g.d(string3, ea.a.p("IG8IdF14HC46ZRVvQXI0ZUsuNWU9U0JyloDXLiNlI2Qmcjl1VnMdcDhvFHRRZAhmUWw3KQ==", "kuCf8h7d"));
                String string4 = context.getResources().getString(R.string.arg_res_0x7f13040b);
                kotlin.jvm.internal.g.d(string4, ea.a.p("UG8ldBZ4Fi4AZUdvHHI1ZTcuVWUyUzdygYCSZDJyF3Vdcz5wA28QdBdka2YAbDNfIGVBKQ==", "c4WHX0NM"));
                new i3(context, string3, string4, null).show();
                return;
            case 3:
                int i14 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("a2Nebg1lT3Q=", "3U2Nefyh"));
                new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.f(context, 0, null).show();
                return;
            case 4:
                int i15 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "d0vtLMxT"));
                pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r rVar = new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r(context, 1, "", "", null);
                rVar.E = 33;
                rVar.show();
                return;
            case 5:
                int i16 = DebugPageAndDialogFragment.f27860g0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "ouQdbmh0"));
                pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.d(context, true);
                dVar.show();
                dVar.a(R.string.arg_res_0x7f1303a6);
                ImageView imageView = dVar.f27523e;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    return;
                }
                return;
            default:
                int i17 = e1.f27886d0;
                kotlin.jvm.internal.g.e(context, ea.a.p("F2MkbgdlGnQ=", "a7QoELiI"));
                j1.d(context, context.getString(R.string.arg_res_0x7f13010b), null);
                return;
        }
    }
}
