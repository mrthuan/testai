package oo;

import android.content.Context;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.ui.dialog.x;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugNotificationFragment;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment.DebugPageAndDialogFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23526a;

    public /* synthetic */ e(int i10) {
        this.f23526a = i10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f23526a) {
            case 0:
                int i10 = f.f23527m;
                return;
            case 1:
                int i11 = DebugNotificationFragment.f27859d0;
                Context context = view.getContext();
                kotlin.jvm.internal.g.d(context, ea.a.p("LnRLYzluGmUwdA==", "tkGeVn74"));
                pdf.pdfreader.viewer.editor.free.service.b.i(context, null, 1L);
                return;
            case 2:
                int i12 = DebugNotificationFragment.f27859d0;
                Context context2 = view.getContext();
                kotlin.jvm.internal.g.d(context2, ea.a.p("EXR5YyhuTWUwdA==", "z1xWG9Ko"));
                yn.d.d(context2);
                return;
            case 3:
                int i13 = DebugPageAndDialogFragment.f27860g0;
                Context context3 = view.getContext();
                new pdf.pdfreader.viewer.editor.free.feature.billing.dialog.c(a0.a.i("X3RiY15uB2UwdA==", "gZ6L1sqB", context3, "ADQ=", "P117Oelb"), context3, false, true).show();
                return;
            default:
                int i14 = DebugPageAndDialogFragment.f27860g0;
                new x(view.getContext(), 0).show();
                return;
        }
    }
}
