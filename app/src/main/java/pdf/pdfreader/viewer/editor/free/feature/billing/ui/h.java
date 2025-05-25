package pdf.pdfreader.viewer.editor.free.feature.billing.ui;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.scan.dialog.ImageAdjustLeaveDialog;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ClearDefaultReaderStep2Activity;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.PDFChooseActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.i3;
import pdf.pdfreader.viewer.editor.free.ui.dialog.x2;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugNotificationFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24933a;

    public /* synthetic */ h(int i10) {
        this.f24933a = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f24933a) {
            case 0:
                int i10 = SubscriptionBlackFridayActivity.f24898a0;
                return;
            case 1:
                int i11 = SubscriptionDarkTestFActivity.f24900a0;
                return;
            case 2:
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                return;
            case 3:
                int i12 = oo.g.f23537x;
                return;
            case 4:
                int i13 = DebugNotificationFragment.f27859d0;
                yn.b bVar = yn.b.f32194o;
                Context context = view.getContext();
                kotlin.jvm.internal.g.d(context, ea.a.p("WnRlYxxuFmUKdA==", "2E5HKlrb"));
                bVar.i0(context, null);
                return;
            case 5:
                int i14 = DebugPageAndDialogFragment.f27860g0;
                Context context2 = view.getContext();
                kotlin.jvm.internal.g.d(context2, ea.a.p("WnRlYxxuFmUKdA==", "aRwy8uiu"));
                new ImageAdjustLeaveDialog(context2).show();
                return;
            case 6:
                int i15 = DebugPageAndDialogFragment.f27860g0;
                Context context3 = view.getContext();
                kotlin.jvm.internal.g.d(context3, ea.a.p("WnRlYxxuFmUKdA==", "cqOkYl5H"));
                String string = view.getContext().getString(R.string.arg_res_0x7f1304a1);
                kotlin.jvm.internal.g.d(string, ea.a.p("WnRlYxxuFmUKdBpnDHQFdDZpXGduUm1zDnIfbhYuK3VRcyhyGnAWaR1ua2YIaTplICk=", "zvqX5AhQ"));
                String string2 = view.getContext().getString(R.string.arg_res_0x7f13017e);
                kotlin.jvm.internal.g.d(string2, ea.a.p("WnRlYxxuFmUKdBpnDHQFdDZpXGduUm1zpICVbh0uKW9cZydlLHADeS11WmELbDNfKm9FKQ==", "F3zNaNUC"));
                new i3(context3, string, string2, null).show();
                return;
            case 7:
                int i16 = DebugPageAndDialogFragment.f27860g0;
                ClearDefaultReaderStep2Activity.a aVar2 = ClearDefaultReaderStep2Activity.C;
                Context context4 = view.getContext();
                kotlin.jvm.internal.g.d(context4, ea.a.p("JnQfYxZuQ2UidA==", "wJvgLgwF"));
                String p10 = ea.a.p("QGEmcwZuZw==", "Zxz4KayB");
                aVar2.getClass();
                ClearDefaultReaderStep2Activity.a.a(context4, p10);
                return;
            case 8:
                int i17 = DebugPageAndDialogFragment.f27860g0;
                new pdf.pdfreader.viewer.editor.free.ui.dialog.i(view.getContext()).show();
                return;
            case 9:
                int i18 = DebugPageAndDialogFragment.f27860g0;
                x2 x2Var = new x2(view.getContext(), "", false);
                x2Var.C = true;
                x2Var.show();
                return;
            default:
                int i19 = DebugPageAndDialogFragment.f27860g0;
                PDFChooseActivity.a aVar3 = PDFChooseActivity.f27008u0;
                Context context5 = view.getContext();
                kotlin.jvm.internal.g.d(context5, ea.a.p("WnRlYxxuFmUKdA==", "lMmWyg5N"));
                aVar3.getClass();
                Intent intent = new Intent(context5, PDFChooseActivity.class);
                intent.putExtra(ea.a.p("JGVIX01fQ2UpdBVlGHAceQ==", "JElroO6d"), true);
                context5.startActivity(intent);
                return;
        }
    }
}
