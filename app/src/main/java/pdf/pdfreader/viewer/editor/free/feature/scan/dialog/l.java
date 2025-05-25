package pdf.pdfreader.viewer.editor.free.feature.scan.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: CustomProgressDialog.kt */
/* loaded from: classes3.dex */
public final class l extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f25697a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f25698b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, boolean z10, boolean z11) {
        super(context, R.style.Centerdialog);
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "guP60IHU"));
        this.f25697a = z10;
        this.f25698b = z11;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.layout_custom_progress_dialog);
        setCancelable(this.f25697a);
        setCanceledOnTouchOutside(this.f25698b);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -2;
            attributes.height = -2;
            window.setAttributes(attributes);
        }
        TextView textView = (TextView) findViewById(R.id.tv_desc);
    }

    @Override // android.app.Dialog
    public final void show() {
        try {
            super.show();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
