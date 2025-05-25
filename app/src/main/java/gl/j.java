package gl;

import android.annotation.SuppressLint;
import android.app.Activity;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseHomeScanBanner;

/* compiled from: HomeScanBanner.kt */
@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes3.dex */
public final class j extends BaseHomeScanBanner {

    /* renamed from: o  reason: collision with root package name */
    public static final j f17926o = new j();

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final void f() {
        Activity l10 = ReaderPdfApplication.l();
        if (l10 != null) {
            i.f17925o.e(l10);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final String i() {
        return ea.a.p("e28mZSBjA24wYVpuDHJC", "QLZBIIS1");
    }
}
