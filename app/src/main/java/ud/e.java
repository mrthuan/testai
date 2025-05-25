package ud;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import be.a;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import zd.a;

/* compiled from: AdManagerBanner.kt */
/* loaded from: classes2.dex */
public final class e extends be.b {
    public a.InterfaceC0036a c;

    /* renamed from: d  reason: collision with root package name */
    public j3.h f30294d;

    /* renamed from: e  reason: collision with root package name */
    public AdManagerAdView f30295e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f30296f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f30297g;

    /* renamed from: h  reason: collision with root package name */
    public String f30298h;

    /* renamed from: b  reason: collision with root package name */
    public final String f30293b = "AdManagerBanner";

    /* renamed from: i  reason: collision with root package name */
    public String f30299i = "";

    /* renamed from: j  reason: collision with root package name */
    public int f30300j = -1;

    @Override // be.a
    public final void a(Activity activity) {
        AdManagerAdView adManagerAdView = this.f30295e;
        if (adManagerAdView != null) {
            adManagerAdView.a();
        }
        this.f30295e = null;
        a6.h.k(new StringBuilder(), this.f30293b, ":destroy", fe.a.a());
    }

    @Override // be.a
    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30293b);
        sb2.append('@');
        return b.a.d(this.f30299i, sb2);
    }

    @Override // be.a
    public final void d(Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        j3.h hVar;
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        String str = this.f30293b;
        a6.h.k(sb2, str, ":load", a10);
        if (activity != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            this.c = interfaceC0036a;
            this.f30294d = hVar;
            Bundle bundle = (Bundle) hVar.c;
            if (bundle != null) {
                this.f30297g = bundle.getBoolean("ad_for_child");
                j3.h hVar2 = this.f30294d;
                if (hVar2 != null) {
                    this.f30298h = ((Bundle) hVar2.c).getString("common_config", "");
                    j3.h hVar3 = this.f30294d;
                    if (hVar3 != null) {
                        this.f30296f = ((Bundle) hVar3.c).getBoolean("skip_init");
                        j3.h hVar4 = this.f30294d;
                        if (hVar4 != null) {
                            this.f30300j = ((Bundle) hVar4.c).getInt("max_height");
                        } else {
                            kotlin.jvm.internal.g.i("adConfig");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.g.i("adConfig");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.g.i("adConfig");
                    throw null;
                }
            }
            if (this.f30297g) {
                a.a();
            }
            wd.a.b(activity, this.f30296f, new b(activity, this, (a.C0429a) interfaceC0036a, 0));
        } else if (interfaceC0036a != null) {
            ((a.C0429a) interfaceC0036a).a(activity, new yd.a(a6.h.c(str, ":Please check params is right."), 0));
        } else {
            throw new IllegalArgumentException(a6.h.c(str, ":Please check MediationListener is right."));
        }
    }

    @Override // be.b
    public final void j() {
        AdManagerAdView adManagerAdView = this.f30295e;
        if (adManagerAdView != null) {
            adManagerAdView.c();
        }
    }

    @Override // be.b
    public final void k() {
        AdManagerAdView adManagerAdView = this.f30295e;
        if (adManagerAdView != null) {
            adManagerAdView.d();
        }
    }

    public final AdSize l(Activity activity) {
        AdSize c;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        int i10 = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int i11 = this.f30300j;
        if (i11 <= 0) {
            c = AdSize.a(activity, i10);
        } else {
            c = AdSize.c(i10, i11);
        }
        fe.a a10 = fe.a.a();
        a10.b(c.d(activity) + " # " + c.b(activity));
        fe.a a11 = fe.a.a();
        a11.b(c.f10024a + " # " + c.f10025b);
        return c;
    }
}
