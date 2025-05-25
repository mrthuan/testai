package gl;

import android.annotation.SuppressLint;
import android.app.Activity;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseHomeListBanner;

/* compiled from: HomeListBanner.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes3.dex */
public final class f extends BaseHomeListBanner {

    /* renamed from: p  reason: collision with root package name */
    public static final f f17921p = new f();

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterListBanner
    public final void c() {
        Activity l10 = ReaderPdfApplication.l();
        if (l10 != null) {
            g.f17922p.b(l10);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterListBanner
    public final String f() {
        return ea.a.p("B29cZTVpRHQYYSRuEHJB", "sfDy1TgR");
    }
}
