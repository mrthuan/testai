package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.text.TextUtils;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g3;

/* compiled from: SignSwitchDialog.java */
/* loaded from: classes3.dex */
public final class d3 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g3 f27531b;

    public d3(g3 g3Var) {
        this.f27531b = g3Var;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        g3 g3Var = this.f27531b;
        g3.a aVar = g3Var.f27600z;
        if (aVar != null) {
            aVar.a();
        }
        if (!TextUtils.isEmpty(g3Var.f27599y)) {
            tn.a.d(g3Var.getContext(), ea.a.p("LmQtdBZzBHZl", "V9KDIezC"), ea.a.p("L2QtdARhJmUXcwd2UV80bFFjaw==", "LQJDwP9s"), g3Var.H(), false);
            tn.a.d(g3Var.getContext(), ea.a.p("KmRYdCZzVnZl", "QcygZJvK"), ea.a.p("KmRYdAphQWUFcyt2EF8LbFxjaw==", "UseBMTFD"), g3Var.I(), false);
        }
        g3Var.dismiss();
    }
}
