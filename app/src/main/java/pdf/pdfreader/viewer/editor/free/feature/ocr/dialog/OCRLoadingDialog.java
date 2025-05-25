package pdf.pdfreader.viewer.editor.free.feature.ocr.dialog;

import am.d0;
import android.content.Context;
import android.os.Bundle;
import b.b;
import ea.a;
import kotlin.jvm.internal.g;
import oo.m;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import qb.j0;

/* compiled from: OCRLoadingDialog.kt */
/* loaded from: classes3.dex */
public final class OCRLoadingDialog extends m<d0> {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f25056f = 0;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25057e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OCRLoadingDialog(Context context) {
        super(context);
        g.e(context, a.p("JW9WdDd4dA==", "KHF8REDb"));
    }

    public static final void p(OCRLoadingDialog oCRLoadingDialog, String str) {
        if (oCRLoadingDialog.isShowing() && !oCRLoadingDialog.f25057e) {
            d0 d0Var = oCRLoadingDialog.f23551d;
            g.b(d0Var);
            d0Var.f810d.setText(str);
        }
    }

    @Override // oo.m, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
    }

    @Override // oo.m, androidx.activity.l, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d0 d0Var = this.f23551d;
        g.b(d0Var);
        d0Var.c.setOnClickListener(new j0(this, 7));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // oo.m, android.app.Dialog
    public final void show() {
        super.show();
        d0 d0Var = this.f23551d;
        g.b(d0Var);
        d0Var.f809b.setFrame(0);
        d0 d0Var2 = this.f23551d;
        g.b(d0Var2);
        d0Var2.f809b.j();
        t0.d0(b.x(this), null, null, new OCRLoadingDialog$show$1(this, null), 3);
    }
}
