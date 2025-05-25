package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import ea.a;
import java.io.File;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.utils.extension.c;
import pdf.pdfreader.viewer.editor.free.utils.j1;
import pdf.pdfreader.viewer.editor.free.utils.k0;

/* compiled from: ShortcutProxyActivity.kt */
/* loaded from: classes3.dex */
public final class ShortcutProxyActivity extends Activity {
    public final void a() {
        Intent intent = new Intent(this, ReaderHomeActivity.class);
        intent.putExtra(a.p("WGUyXx1lFV8bbkBlB3QJZCtfXG8yaCpuZw==", "Q8A6g5GC"), true);
        startActivity(intent);
        j1.e(this, getString(R.string.arg_res_0x7f130172), true, null, -1);
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z10;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra(a.p("Q2E_aA==", "23U5uaAT"));
        if (stringExtra != null && stringExtra.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            a();
        } else if (!c.g(this)) {
            Intent intent = new Intent(this, ReaderHomeActivity.class);
            intent.putExtra(a.p("Q2EsZSxmEG9t", "uD41S0Vd"), a.p("CVJ-TSZIeE0fXxlDJ0UtTg==", "ZkuIre6A"));
            startActivity(intent);
            finish();
        } else if (!new File(stringExtra).exists()) {
            a();
        } else {
            try {
                PdfPreviewEntity pdfPreviewEntity = new PdfPreviewEntity(new File(stringExtra));
                k0.c(this, pdfPreviewEntity.getPath(), pdfPreviewEntity, "", a.p("P2FWZSZ3XmQ9ZXQ=", "wEOhIsGh"));
            } catch (Throwable unused) {
                a();
            }
        }
    }
}
