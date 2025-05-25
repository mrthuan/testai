package pdf.pdfreader.viewer.editor.free.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.concurrent.Executors;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderSplashActivity;
import pdf.pdfreader.viewer.editor.free.utils.b1;

/* compiled from: BrowserFileUtil.kt */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final String f28698a = ea.a.p("WGUyXxFyDXcBZUZfD2k6ZRtlXHQvdHk=", "63Al6MMS");

    public static final void a(Context context, Intent intent, f fVar) {
        kotlin.jvm.internal.g.e(intent, "intent");
        Activity l10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.l(context);
        if (l10 != null && !l10.isFinishing() && intent.getData() != null) {
            pdf.pdfreader.viewer.editor.free.ui.dialog.d dVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.d(context, false);
            dVar.show();
            dVar.a(R.string.arg_res_0x7f1303a8);
            b1 a10 = b1.a();
            Uri data = intent.getData();
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.c cVar = new pdf.pdfreader.viewer.editor.free.feature.pdf2image.adapter.c(dVar, l10, context, fVar);
            a10.getClass();
            if (data != null) {
                String p10 = ea.a.p("lbi75vO5k4jO5Nyr", "zxq2evIA");
                ReaderSplashActivity.f23873s.getClass();
                ReaderSplashActivity.a.c(p10);
                Executors.newSingleThreadExecutor().execute(new b1.b(intent, data, cVar));
            }
        }
    }
}
