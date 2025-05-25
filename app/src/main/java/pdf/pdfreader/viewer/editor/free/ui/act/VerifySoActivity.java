package pdf.pdfreader.viewer.editor.free.ui.act;

import android.app.AlertDialog;
import android.os.Bundle;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.q1;

/* compiled from: VerifySoActivity.kt */
/* loaded from: classes3.dex */
public final class VerifySoActivity extends androidx.appcompat.app.c {
    @Override // androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_verify_so);
        new AlertDialog.Builder(this, 2132017748).setTitle(R.string.arg_res_0x7f1304ca).setCancelable(false).setPositiveButton(R.string.arg_res_0x7f1301d7, new q1(this)).setMessage(R.string.arg_res_0x7f13004a).create().show();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }
}
