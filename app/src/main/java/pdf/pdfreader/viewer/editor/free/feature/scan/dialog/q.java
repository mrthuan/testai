package pdf.pdfreader.viewer.editor.free.feature.scan.dialog;

import android.content.Context;
import android.text.TextUtils;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: QuitCameraDialog.java */
/* loaded from: classes3.dex */
public final class q extends oo.c {
    public final String C;
    public final String D;
    public final String E;

    public q(Context context, String str, String str2, String str3) {
        super(context);
        this.C = str;
        this.D = str2;
        this.E = str3;
    }

    @Override // oo.g
    public final boolean A() {
        return false;
    }

    @Override // oo.g
    public final boolean B() {
        return true;
    }

    @Override // oo.c
    public final int H() {
        return R.layout.dialog_quite_camera;
    }

    @Override // oo.c, oo.g
    public final void z() {
        super.z();
        String str = this.C;
        if (TextUtils.isEmpty(str)) {
            J().setText(getContext().getString(R.string.arg_res_0x7f1304dc));
        } else {
            J().setText(str);
        }
        String str2 = this.E;
        if (TextUtils.isEmpty(str2)) {
            I().setText(getContext().getString(R.string.arg_res_0x7f130359));
        } else {
            I().setText(str2);
        }
        TextView textView = (TextView) findViewById(R.id.tv_desc);
        if (textView != null) {
            String str3 = this.D;
            if (TextUtils.isEmpty(str3)) {
                textView.setText(getContext().getString(R.string.arg_res_0x7f130348));
            } else {
                textView.setText(str3);
            }
        }
    }
}
