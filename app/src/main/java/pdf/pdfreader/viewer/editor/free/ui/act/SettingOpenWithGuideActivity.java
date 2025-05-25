package pdf.pdfreader.viewer.editor.free.ui.act;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import pdf.pdfreader.viewer.editor.free.R;

/* loaded from: classes3.dex */
public class SettingOpenWithGuideActivity extends jl.a {

    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            tn.a.d(view.getContext(), ea.a.p("VHUiZGU=", "IOGSvILJ"), ea.a.p("KHVYZBxzTnMFbyFfFmwBY2s=", "NWWxwvfJ"), ea.a.p("K2VXYQxsdA==", "BJwZuln4"), false);
            SettingOpenWithGuideActivity.this.finish();
        }
    }

    @Override // jl.a
    public final void C1() {
        findViewById(R.id.btnOpenWithGuide).setOnClickListener(new a());
        ((TextView) findViewById(R.id.tvOpenWithGuideDesc)).setText(getString(R.string.arg_res_0x7f1302eb, getString(R.string.arg_res_0x7f13036c)));
    }

    @Override // jl.a
    public final int E1() {
        return R.layout.activity_open_with_guide;
    }

    @Override // jl.a
    public final int F1() {
        return androidx.core.content.a.getColor(this, R.color.black_70);
    }

    @Override // jl.a
    public final int G1() {
        return androidx.core.content.a.getColor(this, R.color.black_70);
    }

    @Override // jl.a, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
        tn.a.d(this, ea.a.p("KHVYZGU=", "RoRMm1VA"), ea.a.p("VHUiZBZzG3Mtc1xvdw==", "S2XnDjS4"), ea.a.p("V2UtYQZsdA==", "0sNiRNWs"), false);
    }

    @Override // jl.a, androidx.fragment.app.u, android.app.Activity
    public final void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
    }

    @Override // jl.a
    public final void K1() {
    }
}
