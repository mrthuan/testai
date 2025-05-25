package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;

/* compiled from: ReadOnlyFileDialog.java */
/* loaded from: classes3.dex */
public final class q2 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r2 f27730a;

    public q2(r2 r2Var) {
        this.f27730a = r2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r2 r2Var = this.f27730a;
        oo.a aVar = r2Var.f23542t;
        if (aVar != null) {
            aVar.a();
        }
        r2Var.dismiss();
    }
}
