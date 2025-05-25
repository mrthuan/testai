package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: ToolsGuideDialog.kt */
/* loaded from: classes3.dex */
public final class m3 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ n3 f27664a;

    public m3(n3 n3Var) {
        this.f27664a = n3Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        n3 n3Var = this.f27664a;
        View view = n3Var.c;
        if (view == null) {
            return;
        }
        n3Var.f27705b.removeCallbacksAndMessages(null);
        view.post(new v4.a(9, this, view, n3Var));
    }
}
