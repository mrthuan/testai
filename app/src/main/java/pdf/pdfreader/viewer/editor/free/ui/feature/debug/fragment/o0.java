package pdf.pdfreader.viewer.editor.free.ui.feature.debug.fragment;

import android.content.Context;
import android.widget.Toast;
import pdf.pdfreader.viewer.editor.free.ui.dialog.EnterFileNameDialog;

/* compiled from: DebugPageAndDialogFragment.kt */
/* loaded from: classes3.dex */
public final class o0 implements EnterFileNameDialog.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f27917a;

    public o0(Context context) {
        this.f27917a = context;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.dialog.EnterFileNameDialog.a
    public final void c(String str, boolean z10) {
        Toast.makeText(this.f27917a, str, 0).show();
    }
}
