package gl;

import android.annotation.SuppressLint;
import android.app.Activity;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseHomeBottomBanner;

/* compiled from: HomeBottomBanner.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes3.dex */
public final class d extends BaseHomeBottomBanner {

    /* renamed from: o  reason: collision with root package name */
    public static final d f17917o = new d();

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final void f() {
        Activity l10 = ReaderPdfApplication.l();
        if (l10 != null) {
            c.f17916o.e(l10);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final String i() {
        return ea.a.p("Dm8EZSBvR3QnbSRhWm4yckI=", "Rjfib3UH");
    }
}
