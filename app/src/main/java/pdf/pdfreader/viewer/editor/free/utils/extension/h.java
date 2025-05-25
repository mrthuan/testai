package pdf.pdfreader.viewer.editor.free.utils.extension;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;

/* compiled from: View.kt */
/* loaded from: classes3.dex */
public final class h implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f28692a;

    public h(EditText editText) {
        this.f28692a = editText;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z10) {
        if (z10) {
            View view = this.f28692a;
            view.post(new pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.fragment.c(view, 15));
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }
}
