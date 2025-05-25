package w8;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* compiled from: ViewUtils.java */
/* loaded from: classes2.dex */
public final class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f31057a;

    public u(EditText editText) {
        this.f31057a = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f31057a;
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }
}
