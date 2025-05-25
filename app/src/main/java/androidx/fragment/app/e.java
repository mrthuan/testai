package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.SpecialEffectsController;
import be.a;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.lib.flutter.encrypt.FlutterAppApi;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3765a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f3766b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f3767d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f3768e;

    public /* synthetic */ e(Activity activity, ud.q qVar, a.InterfaceC0036a interfaceC0036a, boolean z10) {
        this.f3765a = 2;
        this.f3766b = z10;
        this.c = qVar;
        this.f3767d = activity;
        this.f3768e = interfaceC0036a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f3765a;
        boolean z10 = true;
        boolean z11 = this.f3766b;
        Object obj = this.f3768e;
        Object obj2 = this.f3767d;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                y.b lastInViews = (y.b) obj;
                kotlin.jvm.internal.g.e(lastInViews, "$lastInViews");
                Fragment inFragment = ((SpecialEffectsController.Operation) obj3).c;
                Fragment outFragment = ((SpecialEffectsController.Operation) obj2).c;
                s0 s0Var = q0.f3921a;
                kotlin.jvm.internal.g.e(inFragment, "inFragment");
                kotlin.jvm.internal.g.e(outFragment, "outFragment");
                return;
            case 1:
                FlutterAppApi flutterAppApi = (FlutterAppApi) obj3;
                String str = (String) obj2;
                cg.a aVar = (cg.a) obj;
                tf.c<gf.j> cVar = FlutterAppApi.c;
                kotlin.jvm.internal.g.e(flutterAppApi, ea.a.p("EWhac1Uw", "ije3qdEW"));
                kotlin.jvm.internal.g.e(str, ea.a.p("F3QycBZBEGc=", "efaLJlvo"));
                kotlin.jvm.internal.g.e(aVar, ea.a.p("QWMsbFViWWNr", "BleM989r"));
                new gf.b(flutterAppApi.f15734a, ea.a.p("K2VHLh9sQnQuZTguBWkPZVpuQEYpdRF0AXIqcCRBNGlhb19BHUxYYT5lLlIQcx1sdA==", "AzYjdkTD"), FlutterAppApi.a.a(), null).a(ge.a.I(str, Boolean.valueOf(z11)), new com.lib.flutter.encrypt.c(aVar, 1));
                return;
            default:
                ud.q this$0 = (ud.q) obj3;
                Activity activity = (Activity) obj2;
                a.InterfaceC0036a interfaceC0036a = (a.InterfaceC0036a) obj;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                String str2 = this$0.f30351b;
                if (z11) {
                    j3.h hVar = this$0.f30353e;
                    if (hVar != null) {
                        Context applicationContext = activity.getApplicationContext();
                        if (this$0.f30356h) {
                            wd.a.f();
                        }
                        try {
                            String id2 = (String) hVar.f19039b;
                            kotlin.jvm.internal.g.d(id2, "id");
                            this$0.f30358j = id2;
                            AdRequest.Builder builder = new AdRequest.Builder();
                            this$0.f30354f = new ud.p(this$0, applicationContext);
                            if (!xd.a.b(applicationContext) && !ge.i.c(applicationContext)) {
                                z10 = false;
                            }
                            this$0.f30360l = z10;
                            wd.a.e(z10);
                            String str3 = this$0.f30358j;
                            AdRequest adRequest = new AdRequest(builder);
                            ud.p pVar = this$0.f30354f;
                            kotlin.jvm.internal.g.b(pVar);
                            AppOpenAd.load(applicationContext, str3, adRequest, pVar);
                            return;
                        } catch (Throwable th2) {
                            a.InterfaceC0036a interfaceC0036a2 = this$0.f30352d;
                            if (interfaceC0036a2 != null) {
                                interfaceC0036a2.a(applicationContext, new yd.a(a6.h.c(str2, ":load exception, please check log"), 0));
                                fe.a.a().c(th2);
                                return;
                            }
                            kotlin.jvm.internal.g.i("listener");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.g.i("adConfig");
                    throw null;
                }
                interfaceC0036a.a(activity, new yd.a(a6.h.c(str2, ":Admob has not been inited or is initing"), 0));
                return;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, boolean z10, Object obj3, int i10) {
        this.f3765a = i10;
        this.c = obj;
        this.f3767d = obj2;
        this.f3766b = z10;
        this.f3768e = obj3;
    }
}
