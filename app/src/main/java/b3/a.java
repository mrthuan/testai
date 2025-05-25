package b3;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.afollestad.materialdialogs.internal.MDRootLayout;

/* compiled from: DialogBase.java */
/* loaded from: classes.dex */
public class a extends Dialog implements DialogInterface.OnShowListener {

    /* renamed from: a  reason: collision with root package name */
    public MDRootLayout f5321a;

    /* renamed from: b  reason: collision with root package name */
    public DialogInterface.OnShowListener f5322b;

    public final void a() {
        super.setOnShowListener(this);
    }

    public final void b(MDRootLayout mDRootLayout) {
        super.setContentView(mDRootLayout);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i10) {
        return this.f5321a.findViewById(i10);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        DialogInterface.OnShowListener onShowListener = this.f5322b;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // android.app.Dialog
    @Deprecated
    public final void setContentView(int i10) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f5322b = onShowListener;
    }

    @Override // android.app.Dialog
    @Deprecated
    public final void setContentView(View view) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    @Deprecated
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }
}
