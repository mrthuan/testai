package gl;

import android.annotation.SuppressLint;
import android.app.Activity;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseHomeListBanner;

/* compiled from: HomeListBanner.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes3.dex */
public final class g extends BaseHomeListBanner {

    /* renamed from: p  reason: collision with root package name */
    public static final g f17922p = new g();

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterListBanner
    public final void c() {
        Activity l10 = ReaderPdfApplication.l();
        if (l10 != null) {
            f.f17921p.b(l10);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterListBanner
    public final String f() {
        return ea.a.p("e28mZT9pEXQwYVpuDHJC", "xKder0jQ");
    }
}
