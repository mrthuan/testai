package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: PrepareLoadingAdsDialog.java */
/* loaded from: classes3.dex */
public final class k2 extends Dialog {
    public k2(Context context) {
        super(context, R.style.AppTheme);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_prepair_loading_ads);
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
