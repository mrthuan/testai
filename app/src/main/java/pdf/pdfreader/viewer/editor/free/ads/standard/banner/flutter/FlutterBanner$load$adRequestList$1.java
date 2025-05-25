package pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter;

import ae.a;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ads.AppOpenManager;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import tf.d;

/* compiled from: FlutterBanner.kt */
/* loaded from: classes3.dex */
public final class FlutterBanner$load$adRequestList$1 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FlutterBanner f24001a;

    public FlutterBanner$load$adRequestList$1(FlutterBanner flutterBanner) {
        this.f24001a = flutterBanner;
    }

    public static void f(FlutterBanner flutterBanner) {
        g.e(flutterBanner, ea.a.p("O2hYc10w", "eQdsppPM"));
        EngineHelper.f15726a.getClass();
        FlutterAppApi flutterAppApi = EngineHelper.f15727b;
        if (flutterAppApi != null) {
            flutterAppApi.c(flutterBanner.i(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner$load$adRequestList$1$onAdLoadFailed$2$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ d invoke() {
                    invoke2();
                    return d.f30009a;
                }
            });
        }
    }

    @Override // ae.a
    public final void a(Context context, View view, yd.d dVar) {
        BannerType bannerType;
        g.e(context, "context");
        FlutterBanner flutterBanner = this.f24001a;
        flutterBanner.f23997k = false;
        if (view != null) {
            if (view instanceof ViewGroup) {
                ((ViewGroup) view).setDescendantFocusability(393216);
            }
            flutterBanner.b(context, view);
            flutterBanner.f23989b = view;
            flutterBanner.f23995i = true;
        }
        flutterBanner.a(ea.a.p("IG5wZDVvVmQ=", "mULdEUrX"));
        String p10 = ea.a.p("AUI=", "O2wNVgl3");
        String str = dVar.f32120b;
        if (g.a(str, p10)) {
            bannerType = BannerType.Native;
        } else if (g.a(str, ea.a.p("Qg==", "hJ8ql8Q7"))) {
            bannerType = BannerType.Adaptive;
        } else {
            bannerType = BannerType.None;
        }
        flutterBanner.c = bannerType;
        hl.a aVar = flutterBanner.f23998l;
        if (aVar != null) {
            aVar.e();
        }
        flutterBanner.f();
        EngineHelper.f15726a.getClass();
        FlutterAppApi flutterAppApi = EngineHelper.f15727b;
        if (flutterAppApi != null) {
            flutterAppApi.c(flutterBanner.i(), true, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner$load$adRequestList$1$onAdLoad$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // cg.a
                public /* bridge */ /* synthetic */ d invoke() {
                    invoke2();
                    return d.f30009a;
                }
            });
        }
    }

    @Override // ae.c
    public final void b(Context context, yd.d dVar) {
        g.e(context, "context");
        FlutterBanner flutterBanner = this.f24001a;
        flutterBanner.f23996j = true;
        AppOpenManager.c().f23907g = false;
        flutterBanner.a(ea.a.p("P24OZDJsLmNr", "8JPOqGnb"));
        hl.a aVar = flutterBanner.f23998l;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // ae.c
    public final void c(yd.a aVar) {
        FlutterBanner flutterBanner = this.f24001a;
        flutterBanner.f23997k = false;
        flutterBanner.a("onAdLoadFailed " + aVar);
        flutterBanner.c = BannerType.Native;
        flutterBanner.q();
        hl.a aVar2 = flutterBanner.f23998l;
        if (aVar2 != null) {
            aVar2.f();
        }
        if (g.a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            EngineHelper.f15726a.getClass();
            FlutterAppApi flutterAppApi = EngineHelper.f15727b;
            if (flutterAppApi != null) {
                flutterAppApi.c(flutterBanner.i(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner$load$adRequestList$1$onAdLoadFailed$1
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ d invoke() {
                        invoke2();
                        return d.f30009a;
                    }
                });
                return;
            }
            return;
        }
        w0.a().f28791b.execute(new b7.g(flutterBanner, 16));
    }

    @Override // ae.a
    public final void d() {
    }
}
