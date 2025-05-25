package pdf.pdfreader.viewer.editor.free.ui.act;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import industries.deepthought.core.activity.PolicyActivity;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: TermsUseActivity.kt */
/* loaded from: classes3.dex */
public final class TermsUseActivity extends PolicyActivity {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f26884b = 0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26885a;

    @Override // industries.deepthought.core.activity.PolicyActivity, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        no.f.b(this).getClass();
        this.f26885a = no.f.d(this);
        pdf.pdfreader.viewer.editor.free.utils.h1.f(androidx.core.content.a.getColor(this, R.color.colorPrimary), this, pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this), this.f26885a);
        super.onCreate(bundle);
        androidx.activity.s.v0(this);
        findViewById(R.id.back_iv).setOnClickListener(new c(this, 3));
        ((TextView) findViewById(R.id.tv_title)).setText(getString(R.string.arg_res_0x7f1304cb));
        View findViewById = findViewById(R.id.ad_consent_webview);
        if (findViewById != null) {
            findViewById.setBackgroundColor(androidx.core.content.a.getColor(this, R.color.colorOnPrimary));
        }
        if (ReaderPdfApplication.f23861m) {
            ReaderPdfApplication.o(this);
            finish();
        }
    }
}
