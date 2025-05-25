package qb;

import android.app.Activity;
import android.content.Context;
import be.a;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.inmobi.media.A4;
import com.inmobi.media.D1;
import com.inmobi.media.Y1;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class i0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29220a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f29221b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f29222d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f29223e;

    public /* synthetic */ i0(A4 a42, String str, boolean z10, D1 d12) {
        this.f29220a = 0;
        this.c = a42;
        this.f29222d = str;
        this.f29221b = z10;
        this.f29223e = d12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f29220a;
        boolean z10 = true;
        boolean z11 = this.f29221b;
        Object obj = this.f29223e;
        Object obj2 = this.f29222d;
        Object obj3 = this.c;
        switch (i10) {
            case 0:
                Y1.b((A4) obj3, (String) obj2, z11, (D1) obj);
                return;
            case 1:
                ud.h this$0 = (ud.h) obj3;
                Activity activity = (Activity) obj2;
                a.InterfaceC0036a interfaceC0036a = (a.InterfaceC0036a) obj;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                String str = this$0.f30305b;
                if (z11) {
                    Context applicationContext = activity.getApplicationContext();
                    kotlin.jvm.internal.g.d(applicationContext, "activity.applicationContext");
                    j3.h hVar = this$0.f30306d;
                    if (hVar != null) {
                        try {
                            String id2 = (String) hVar.f19039b;
                            kotlin.jvm.internal.g.d(id2, "id");
                            this$0.f30311i = id2;
                            AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
                            if (!xd.a.b(applicationContext) && !ge.i.c(applicationContext)) {
                                z10 = false;
                            }
                            this$0.f30314l = z10;
                            wd.a.e(z10);
                            AdManagerInterstitialAd.load(applicationContext.getApplicationContext(), id2, new AdManagerAdRequest(builder), new ud.g(this$0, applicationContext));
                            return;
                        } catch (Throwable th2) {
                            a.InterfaceC0036a interfaceC0036a2 = this$0.c;
                            if (interfaceC0036a2 != null) {
                                interfaceC0036a2.a(applicationContext, new yd.a(a6.h.c(str, ":load exception, please check log"), 0));
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
                interfaceC0036a.a(activity, new yd.a(a6.h.c(str, ":Admob has not been inited or is initing"), 0));
                return;
            default:
                ud.m this$02 = (ud.m) obj3;
                Activity activity2 = (Activity) obj2;
                a.InterfaceC0036a interfaceC0036a3 = (a.InterfaceC0036a) obj;
                kotlin.jvm.internal.g.e(this$02, "this$0");
                String str2 = this$02.f30333b;
                if (z11) {
                    j3.h hVar2 = this$02.f30334d;
                    if (hVar2 != null) {
                        Context applicationContext2 = activity2.getApplicationContext();
                        try {
                            String id3 = (String) hVar2.f19039b;
                            if (!xd.a.b(applicationContext2) && !ge.i.c(applicationContext2)) {
                                wd.a.e(false);
                            }
                            kotlin.jvm.internal.g.d(id3, "id");
                            this$02.f30341k = id3;
                            AdLoader.Builder builder2 = new AdLoader.Builder(applicationContext2.getApplicationContext(), id3);
                            builder2.b(new a7.b(this$02, activity2.getApplicationContext(), activity2));
                            builder2.c(new ud.n(applicationContext2, this$02));
                            NativeAdOptions.Builder builder3 = new NativeAdOptions.Builder();
                            builder3.c = false;
                            builder3.f10607a = false;
                            builder3.f10610e = this$02.f30336f;
                            builder3.f10608b = 2;
                            VideoOptions.Builder builder4 = new VideoOptions.Builder();
                            builder4.f10057a = true;
                            builder3.f10609d = new VideoOptions(builder4);
                            builder2.d(new NativeAdOptions(builder3));
                            builder2.a().a(new AdRequest(new AdRequest.Builder()));
                            return;
                        } catch (Throwable th3) {
                            a.InterfaceC0036a interfaceC0036a4 = this$02.c;
                            if (interfaceC0036a4 != null) {
                                interfaceC0036a4.a(applicationContext2, new yd.a(a6.h.c(str2, ":load exception, please check log"), 0));
                                fe.a.a().c(th3);
                                return;
                            }
                            kotlin.jvm.internal.g.i("listener");
                            throw null;
                        }
                    }
                    kotlin.jvm.internal.g.i("adConfig");
                    throw null;
                } else if (interfaceC0036a3 != null) {
                    interfaceC0036a3.a(activity2, new yd.a(a6.h.c(str2, ":Admob has not been inited or is initing"), 0));
                    return;
                } else {
                    return;
                }
        }
    }

    public /* synthetic */ i0(boolean z10, be.a aVar, Activity activity, a.InterfaceC0036a interfaceC0036a, int i10) {
        this.f29220a = i10;
        this.f29221b = z10;
        this.c = aVar;
        this.f29222d = activity;
        this.f29223e = interfaceC0036a;
    }
}
