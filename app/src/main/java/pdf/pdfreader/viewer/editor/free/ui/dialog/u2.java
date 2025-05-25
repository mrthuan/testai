package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: RemoveRecentDialog.java */
/* loaded from: classes3.dex */
public final class u2 extends oo.c {
    @Override // oo.g
    public final boolean A() {
        return true;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    @Override // oo.c
    public final int H() {
        return R.layout.dialog_delete;
    }

    @Override // oo.c, oo.g
    public final void z() {
        super.z();
        J().setText(getContext().getString(R.string.arg_res_0x7f1303dc, getContext().getString(R.string.arg_res_0x7f1303d8)));
        I().setText(getContext().getString(R.string.arg_res_0x7f1303db));
        ((TextView) x().findViewById(R.id.tv_desc)).setText(getContext().getString(R.string.arg_res_0x7f1303bd, getContext().getString(R.string.arg_res_0x7f1303d8)));
    }
}
