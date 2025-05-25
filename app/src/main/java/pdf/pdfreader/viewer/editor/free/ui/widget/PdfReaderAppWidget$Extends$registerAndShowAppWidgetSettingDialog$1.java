package pdf.pdfreader.viewer.editor.free.ui.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import androidx.lifecycle.p;

/* compiled from: PdfReaderAppWidget.kt */
/* loaded from: classes3.dex */
public final class PdfReaderAppWidget$Extends$registerAndShowAppWidgetSettingDialog$1 implements n {
    @Override // androidx.lifecycle.n
    public final void d(p pVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            androidx.core.content.a.registerReceiver(null, null, null, 2);
        } else if (event != Lifecycle.Event.ON_DESTROY) {
        } else {
            throw null;
        }
    }
}
