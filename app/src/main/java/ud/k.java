package ud;

import android.app.Activity;
import android.os.Bundle;
import be.a;
import com.google.android.gms.ads.nativead.NativeAd;
import pdf.pdfreader.viewer.editor.free.R;
import zd.a;

/* compiled from: AdManagerNativeBanner.kt */
/* loaded from: classes2.dex */
public final class k extends be.b {
    public a.InterfaceC0036a c;

    /* renamed from: d  reason: collision with root package name */
    public j3.h f30322d;

    /* renamed from: e  reason: collision with root package name */
    public NativeAd f30323e;

    /* renamed from: g  reason: collision with root package name */
    public boolean f30325g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f30326h;

    /* renamed from: i  reason: collision with root package name */
    public String f30327i;

    /* renamed from: b  reason: collision with root package name */
    public final String f30321b = "AdManagerNativeBanner";

    /* renamed from: f  reason: collision with root package name */
    public int f30324f = 1;

    /* renamed from: j  reason: collision with root package name */
    public String f30328j = "";

    /* renamed from: k  reason: collision with root package name */
    public int f30329k = R.layout.ad_native_banner;

    /* renamed from: l  reason: collision with root package name */
    public int f30330l = R.layout.ad_native_banner_root;

    @Override // be.a
    public final synchronized void a(Activity activity) {
        try {
            NativeAd nativeAd = this.f30323e;
            if (nativeAd != null) {
                nativeAd.destroy();
            }
            this.f30323e = null;
        } catch (Throwable th2) {
            fe.a.a().c(th2);
        }
    }

    @Override // be.a
    public final String b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30321b);
        sb2.append('@');
        return b.a.d(this.f30328j, sb2);
    }

    @Override // be.a
    public final void d(Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        j3.h hVar;
        fe.a a10 = fe.a.a();
        StringBuilder sb2 = new StringBuilder();
        String str = this.f30321b;
        a6.h.k(sb2, str, ":load", a10);
        if (activity != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            this.c = interfaceC0036a;
            this.f30322d = hVar;
            Bundle bundle = (Bundle) hVar.c;
            if (bundle != null) {
                this.f30326h = bundle.getBoolean("ad_for_child");
                j3.h hVar2 = this.f30322d;
                if (hVar2 != null) {
                    this.f30324f = ((Bundle) hVar2.c).getInt("ad_choices_position", 1);
                    j3.h hVar3 = this.f30322d;
                    if (hVar3 != null) {
                        this.f30329k = ((Bundle) hVar3.c).getInt("layout_id", R.layout.ad_native_banner);
                        j3.h hVar4 = this.f30322d;
                        if (hVar4 != null) {
                            this.f30330l = ((Bundle) hVar4.c).getInt("root_layout_id", R.layout.ad_native_banner_root);
                            j3.h hVar5 = this.f30322d;
                            if (hVar5 != null) {
                                this.f30327i = ((Bundle) hVar5.c).getString("common_config", "");
                                j3.h hVar6 = this.f30322d;
                                if (hVar6 != null) {
                                    this.f30325g = ((Bundle) hVar6.c).getBoolean("skip_init");
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
                    } else {
                        kotlin.jvm.internal.g.i("adConfig");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.g.i("adConfig");
                    throw null;
                }
            }
            if (this.f30326h) {
                a.a();
            }
            wd.a.b(activity, this.f30325g, new b(activity, this, (a.C0429a) interfaceC0036a, 1));
        } else if (interfaceC0036a != null) {
            ((a.C0429a) interfaceC0036a).a(activity, new yd.a(a6.h.c(str, ":Please check params is right."), 0));
        } else {
            throw new IllegalArgumentException(a6.h.c(str, ":Please check MediationListener is right."));
        }
    }

    @Override // be.b
    public final void j() {
    }

    @Override // be.b
    public final void k() {
    }
}
