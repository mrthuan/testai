package d3;

import android.view.inputmethod.InputMethodManager;
import com.afollestad.materialdialogs.MaterialDialog;

/* compiled from: DialogUtils.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialDialog f16112a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialDialog.b f16113b;

    public a(MaterialDialog materialDialog, MaterialDialog.b bVar) {
        this.f16112a = materialDialog;
        this.f16113b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MaterialDialog materialDialog = this.f16112a;
        materialDialog.f5933g.requestFocus();
        InputMethodManager inputMethodManager = (InputMethodManager) this.f16113b.f5946a.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(materialDialog.f5933g, 1);
        }
    }
}
