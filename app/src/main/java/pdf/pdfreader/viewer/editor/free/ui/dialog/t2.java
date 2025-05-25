package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ReflowTipDialog.kt */
/* loaded from: classes3.dex */
public final class t2 extends oo.i {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f27761b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final View.OnClickListener f27762a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(Context context, View.OnClickListener onClickListener) {
        super(context, R.style.ConvertGuideDialog);
        kotlin.jvm.internal.g.e(context, ea.a.p("J28FdFZ4dA==", "rIDk3L7p"));
        this.f27762a = onClickListener;
    }

    public final void c() {
        setContentView(R.layout.dialog_reflow_tip);
        ((TextView) findViewById(R.id.operate_ok)).setOnClickListener(new u4.j(this, 22));
        findViewById(R.id.anim_view).setOnClickListener(new s2(0));
        findViewById(R.id.desc_tv).setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.o(3));
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
            window.setDimAmount(0.8f);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.getAttributes().flags |= 1024;
        }
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
        setCancelable(false);
        setCanceledOnTouchOutside(false);
        int i10 = getContext().getResources().getConfiguration().orientation;
        c();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent event) {
        kotlin.jvm.internal.g.e(event, "event");
        if (i10 == 4) {
            return true;
        }
        return super.onKeyUp(i10, event);
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        a();
    }

    @Override // android.app.Dialog
    public final void show() {
        try {
            if (Build.VERSION.SDK_INT > 29) {
                super.show();
            } else {
                Window window = getWindow();
                window.setFlags(8, 8);
                super.show();
                oo.i.b(window);
                window.clearFlags(8);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
