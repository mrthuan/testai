package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.ui.dialog.e2;

/* compiled from: PdfShowMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class a2 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e2 f27491b;

    public a2(e2 e2Var) {
        this.f27491b = e2Var;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        pdf.pdfreader.viewer.editor.free.utils.q0.w(view.getContext(), "key_need_show_password_tip", false);
        e2 e2Var = this.f27491b;
        e2.a aVar = e2Var.f27546y;
        e2Var.cancel();
    }
}
