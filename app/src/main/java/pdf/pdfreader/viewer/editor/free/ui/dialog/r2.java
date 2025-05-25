package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ReadOnlyFileDialog.java */
/* loaded from: classes3.dex */
public final class r2 extends oo.g {
    @Override // oo.g
    public final boolean B() {
        return true;
    }

    @Override // oo.g
    public final int w() {
        return R.layout.dialog_file_readonly;
    }

    @Override // oo.g
    public final void z() {
        View x4 = x();
        ((TextView) x4.findViewById(R.id.tv_cancel)).setOnClickListener(new p2(this));
        ((TextView) x4.findViewById(R.id.tv_ok)).setOnClickListener(new q2(this));
        ((ImageView) x4.findViewById(R.id.iv_icon)).setImageResource(R.drawable.ic_merge_fail);
    }
}
