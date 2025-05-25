package pdf.pdfreader.viewer.editor.free.ui.dialog;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: SimpleConfirmDialog.kt */
/* loaded from: classes3.dex */
public final class h3 extends oo.c {
    public final CharSequence C;
    public final CharSequence D;
    public final CharSequence E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(Context context, String str, String str2, CharSequence charSequence) {
        super(context);
        kotlin.jvm.internal.g.e(context, ea.a.p("FW8mdCh4dA==", "dAvHMEZb"));
        ea.a.p("O2kzbGU=", "cnOG9PEk");
        ea.a.p("UG8ldBZudA==", "g5FyQD7O");
        this.C = str;
        this.D = str2;
        this.E = charSequence;
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
        return R.layout.dialog_simple_confirm;
    }

    @Override // oo.g, com.google.android.material.bottomsheet.b, l.p, androidx.activity.l, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        J().setText(this.C);
        TextView textView = (TextView) findViewById(R.id.contentTv);
        if (textView != null) {
            textView.setText(this.D);
        }
        TextView I = I();
        CharSequence charSequence = this.E;
        if (charSequence == null) {
            charSequence = getContext().getString(R.string.arg_res_0x7f1300ff);
        }
        I.setText(charSequence);
        I().setAllCaps(false);
    }
}
