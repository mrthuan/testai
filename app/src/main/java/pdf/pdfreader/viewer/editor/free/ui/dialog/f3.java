package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.text.TextUtils;
import android.view.View;
import pdf.pdfreader.viewer.editor.free.ui.dialog.g3;

/* compiled from: SignSwitchDialog.java */
/* loaded from: classes3.dex */
public final class f3 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g3 f27565b;

    public f3(g3 g3Var) {
        this.f27565b = g3Var;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        g3 g3Var = this.f27565b;
        g3.a aVar = g3Var.f27600z;
        if (aVar != null) {
            aVar.b();
        }
        g3Var.dismiss();
        if (!TextUtils.isEmpty(g3Var.f27599y)) {
            tn.a.d(g3Var.getContext(), ea.a.p("VmQidCxzA3Zl", "zNMKe9US"), ea.a.p("VmQidABhFGUtZF1hCmEkZBtjXmklaw==", "1nDoh50B"), g3Var.H(), false);
            tn.a.d(g3Var.getContext(), ea.a.p("VmQidCxzA3Zl", "F5qDlC86"), ea.a.p("VmQidABhFGUtZF1hCmEkZBtjXmklaw==", "7U5lYOSp"), g3Var.I(), false);
        }
    }
}
