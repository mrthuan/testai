package pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home;

import android.content.Context;
import pdf.pdfreader.viewer.editor.free.ui.dialog.j3;

/* compiled from: ThanksRateDialogChain.kt */
/* loaded from: classes3.dex */
public final class h extends po.a {

    /* renamed from: d  reason: collision with root package name */
    public static boolean f27692d;
    public j3 c;

    @Override // po.a
    public final void a() {
        j3 j3Var = this.c;
        if (j3Var != null) {
            j3Var.dismiss();
        }
    }

    @Override // po.a
    public final boolean c(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        if (!kotlin.jvm.internal.g.a(this.f28987b, Boolean.TRUE) && !f27692d) {
            return false;
        }
        j3 j3Var = new j3(context);
        j3Var.setOnDismissListener(new f5.g(this, 1));
        j3Var.show();
        this.c = j3Var;
        return true;
    }

    @Override // po.a
    public final boolean d() {
        j3 j3Var = this.c;
        if (j3Var != null) {
            return j3Var.isShowing();
        }
        return false;
    }
}
