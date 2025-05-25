package gl;

import android.annotation.SuppressLint;
import android.app.Activity;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseImage2PDFConvertBanner;

/* compiled from: Image2PDFConvertBanner.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes3.dex */
public final class l extends BaseImage2PDFConvertBanner {

    /* renamed from: o  reason: collision with root package name */
    public static final l f17929o = new l();

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final void f() {
        Activity l10 = ReaderPdfApplication.l();
        if (l10 != null) {
            m.f17930o.e(l10);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final String i() {
        return ea.a.p("Jm1QZxwyZ0QcQyVuA2UadHdhAG4gckE=", "pAzUkfod");
    }
}
