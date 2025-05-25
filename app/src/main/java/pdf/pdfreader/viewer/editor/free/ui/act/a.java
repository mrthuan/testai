package pdf.pdfreader.viewer.editor.free.ui.act;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;
import pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity;
import x0.f0;

/* compiled from: BaseOperatePDFTransparentStatusBarActivity.kt */
/* loaded from: classes3.dex */
public abstract class a extends OperatePDFWatcherActivity {
    public static final /* synthetic */ int H = 0;

    @Override // jl.a
    public final int G1() {
        return 0;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ui.act.tools.OperatePDFWatcherActivity, jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            pdf.pdfreader.viewer.editor.free.utils.extension.i.j(window, 1280);
        }
        View D1 = D1();
        if (D1 != null) {
            d9.g gVar = new d9.g(this, 16);
            WeakHashMap<View, x0.n0> weakHashMap = x0.f0.f31435a;
            f0.i.u(D1, gVar);
        }
    }
}
