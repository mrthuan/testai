package pdf.pdfreader.viewer.editor.free.ui.act;

import android.os.Bundle;
import android.view.View;
import industries.deepthought.core.activity.PolicyActivity;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;

/* compiled from: PolicyOverloadActivity.kt */
/* loaded from: classes3.dex */
public final class PolicyOverloadActivity extends PolicyActivity {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f26626b = 0;

    /* renamed from: a  reason: collision with root package name */
    public boolean f26627a;

    @Override // industries.deepthought.core.activity.PolicyActivity, androidx.fragment.app.u, androidx.activity.ComponentActivity, k0.j, android.app.Activity
    public final void onCreate(Bundle bundle) {
        no.f.b(this).getClass();
        this.f26627a = no.f.d(this);
        pdf.pdfreader.viewer.editor.free.utils.h1.f(androidx.core.content.a.getColor(this, R.color.colorPrimary), this, pdf.pdfreader.viewer.editor.free.utils.extension.c.h(this), this.f26627a);
        super.onCreate(bundle);
        androidx.activity.s.v0(this);
        findViewById(R.id.back_iv).setOnClickListener(new k9.c(this, 18));
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
