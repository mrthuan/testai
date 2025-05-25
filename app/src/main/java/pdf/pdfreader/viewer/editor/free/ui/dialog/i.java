package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: DialogThanksFeedback.java */
/* loaded from: classes3.dex */
public final class i extends oo.g implements View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view.getId() == R.id.tv_btn) {
            cancel();
        } else if (view.getId() == R.id.iv_close) {
            cancel();
        }
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_thanks_feedback;
    }

    @Override // oo.g
    public final void z() {
        x().findViewById(R.id.tv_btn).setOnClickListener(this);
        x().findViewById(R.id.iv_close).setOnClickListener(this);
    }
}
