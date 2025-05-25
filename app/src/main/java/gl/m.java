package gl;

import android.annotation.SuppressLint;
import android.app.Activity;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseImage2PDFConvertBanner;

/* compiled from: Image2PDFConvertBanner.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes3.dex */
public final class m extends BaseImage2PDFConvertBanner {

    /* renamed from: o  reason: collision with root package name */
    public static final m f17930o = new m();

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final void f() {
        Activity l10 = ReaderPdfApplication.l();
        if (l10 != null) {
            l.f17929o.e(l10);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final String i() {
        return ea.a.p("Wm0qZxYyMkQ0Q1tuH2UkdAZhXG4jckI=", "Jk41SqH5");
    }
}
