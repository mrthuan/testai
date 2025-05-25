package pdf.pdfreader.viewer.editor.free.ui.act;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26976a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderHomeActivity f26977b;

    public /* synthetic */ s(ReaderHomeActivity readerHomeActivity, int i10) {
        this.f26976a = i10;
        this.f26977b = readerHomeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26976a;
        ReaderHomeActivity readerHomeActivity = this.f26977b;
        switch (i10) {
            case 0:
                String str = ReaderHomeActivity.Y1;
                readerHomeActivity.getClass();
                try {
                    Activity l10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.l(readerHomeActivity);
                    if (l10 != null) {
                        View findViewById = l10.findViewById(16908290);
                        findViewById.setFocusable(true);
                        findViewById.setFocusableInTouchMode(true);
                        findViewById.requestFocus();
                        ((InputMethodManager) readerHomeActivity.getSystemService(ea.a.p("Jm5BdQ1fWmUuaCVk", "lczCOAEZ"))).hideSoftInputFromWindow(l10.getCurrentFocus().getWindowToken(), 0);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c cVar = readerHomeActivity.E0;
                if (cVar != null && cVar.f27674h.d()) {
                    ReaderPdfApplication.k().h(false);
                    return;
                }
                return;
            case 2:
                ReaderHomeActivity.b2(readerHomeActivity);
                return;
            default:
                String str2 = ReaderHomeActivity.Y1;
                readerHomeActivity.x2();
                return;
        }
    }
}
