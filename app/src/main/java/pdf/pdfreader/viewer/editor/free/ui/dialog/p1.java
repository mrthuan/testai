package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;

/* compiled from: PdfShowMoreMenuDialog.java */
/* loaded from: classes3.dex */
public final class p1 extends pdf.pdfreader.viewer.editor.free.utils.l0 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e2 f27724b;

    public p1(e2 e2Var) {
        this.f27724b = e2Var;
    }

    @Override // pdf.pdfreader.viewer.editor.free.utils.l0
    public final void a(View view) {
        e2 e2Var = this.f27724b;
        xn.a aVar = e2Var.f27545f0;
        if (aVar != null) {
            aVar.e();
        }
        e2Var.cancel();
    }
}
