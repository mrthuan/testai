package gl;

import android.annotation.SuppressLint;
import android.app.Activity;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BasePreviewBottomBanner;

/* compiled from: PreviewBottomBanner.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes3.dex */
public final class p extends BasePreviewBottomBanner {

    /* renamed from: p  reason: collision with root package name */
    public static final p f17933p = new p();

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final void f() {
        Activity l10 = ReaderPdfApplication.l();
        if (l10 != null) {
            q.f17934p.e(l10);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final String i() {
        return ea.a.p("R3IBdgRlPkIndBJvWUI2blZlIEE=", "xo7dmI4B");
    }
}
