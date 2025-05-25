package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ThankRateDialog.kt */
/* loaded from: classes3.dex */
public final class j3 extends oo.g {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f27640y = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(Context context) {
        super(context, (Object) null);
        kotlin.jvm.internal.g.e(context, ea.a.p("C29ddCJ4dA==", "H7h3G4VG"));
    }

    @Override // oo.g, com.google.android.material.bottomsheet.b, android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        boolean z10 = pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.h.f27692d;
        pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.h.f27692d = false;
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_thanks_rate;
    }

    @Override // oo.g
    public final void z() {
        ((TextView) x().findViewById(R.id.action_ok)).setOnClickListener(new d9.f(this, 26));
        ((ImageView) x().findViewById(R.id.action_cancel)).setOnClickListener(new qb.j0(this, 23));
    }
}
