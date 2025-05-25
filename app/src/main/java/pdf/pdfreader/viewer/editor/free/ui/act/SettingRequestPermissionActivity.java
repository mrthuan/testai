package pdf.pdfreader.viewer.editor.free.ui.act;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class SettingRequestPermissionActivity extends androidx.appcompat.app.c {

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SettingRequestPermissionActivity.this.finish();
        }
    }

    @Override // androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_permission_guide);
        findViewById(R.id.btn_permisson).setOnClickListener(new a());
        findViewById(R.id.switch_permission).setEnabled(false);
        ((TextView) findViewById(R.id.tv_tips)).setText(String.format(getString(R.string.arg_res_0x7f130166), getString(R.string.arg_res_0x7f13036c)));
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }
}
