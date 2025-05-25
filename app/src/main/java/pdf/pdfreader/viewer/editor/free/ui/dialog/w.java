package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderLoadingView;

/* compiled from: LoadingDialog.java */
/* loaded from: classes3.dex */
public final class w extends Dialog {
    public w(Context context) {
        super(context, R.style.AppTheme);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(androidx.core.content.a.getColor(context, R.color.colorPrimaryContainer));
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(new ReaderLoadingView(getContext()));
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(androidx.core.content.a.getDrawable(getContext(), R.color.no_color));
        }
    }
}
