package ud;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import be.a;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import pdf.pdfreader.viewer.editor.free.R;
import zd.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements wd.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f30284a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f30285b;
    public final /* synthetic */ a.InterfaceC0036a c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ be.b f30286d;

    public /* synthetic */ b(Activity activity, be.b bVar, a.C0429a c0429a, int i10) {
        this.f30284a = i10;
        this.f30285b = activity;
        this.f30286d = bVar;
        this.c = c0429a;
    }

    @Override // wd.d
    public final void a(final boolean z10) {
        int i10 = this.f30284a;
        be.b bVar = this.f30286d;
        switch (i10) {
            case 0:
                final Activity activity = this.f30285b;
                final e this$0 = (e) bVar;
                final a.InterfaceC0036a interfaceC0036a = this.c;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                activity.runOnUiThread(new Runnable() { // from class: ud.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = r5;
                        a.InterfaceC0036a interfaceC0036a2 = interfaceC0036a;
                        final Activity activity2 = activity;
                        boolean z11 = z10;
                        be.b bVar2 = this$0;
                        switch (i11) {
                            case 0:
                                e this$02 = (e) bVar2;
                                kotlin.jvm.internal.g.e(this$02, "this$0");
                                String str = this$02.f30293b;
                                if (z11) {
                                    j3.h hVar = this$02.f30294d;
                                    if (hVar != null) {
                                        Context applicationContext = activity2.getApplicationContext();
                                        try {
                                            AdManagerAdView adManagerAdView = new AdManagerAdView(applicationContext);
                                            this$02.f30295e = adManagerAdView;
                                            adManagerAdView.setAdSizes(this$02.l(activity2));
                                            String id2 = (String) hVar.f19039b;
                                            kotlin.jvm.internal.g.d(id2, "id");
                                            this$02.f30299i = id2;
                                            AdManagerAdView adManagerAdView2 = this$02.f30295e;
                                            if (adManagerAdView2 != null) {
                                                adManagerAdView2.setAdUnitId(id2);
                                            }
                                            AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
                                            if (!xd.a.b(applicationContext) && !ge.i.c(applicationContext)) {
                                                wd.a.e(false);
                                            }
                                            AdManagerAdView adManagerAdView3 = this$02.f30295e;
                                            if (adManagerAdView3 != null) {
                                                adManagerAdView3.e(new AdManagerAdRequest(builder));
                                            }
                                            AdManagerAdView adManagerAdView4 = this$02.f30295e;
                                            if (adManagerAdView4 != null) {
                                                adManagerAdView4.setAdListener(new d(this$02, activity2, applicationContext));
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th2) {
                                            a.InterfaceC0036a interfaceC0036a3 = this$02.c;
                                            if (interfaceC0036a3 != null) {
                                                interfaceC0036a3.a(applicationContext, new yd.a(a6.h.c(str, ":load exception, please check log"), 0));
                                                fe.a.a().c(th2);
                                                return;
                                            }
                                            kotlin.jvm.internal.g.i("listener");
                                            throw null;
                                        }
                                    }
                                    kotlin.jvm.internal.g.i("adConfig");
                                    throw null;
                                } else if (interfaceC0036a2 != null) {
                                    interfaceC0036a2.a(activity2, new yd.a(a6.h.c(str, ":Admob has not been inited or is initing"), 0));
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                final k this$03 = (k) bVar2;
                                kotlin.jvm.internal.g.e(this$03, "this$0");
                                String str2 = this$03.f30321b;
                                if (z11) {
                                    j3.h hVar2 = this$03.f30322d;
                                    if (hVar2 != null) {
                                        Context applicationContext2 = activity2.getApplicationContext();
                                        try {
                                            String id3 = (String) hVar2.f19039b;
                                            if (!xd.a.b(applicationContext2) && !ge.i.c(applicationContext2)) {
                                                wd.a.e(false);
                                            }
                                            kotlin.jvm.internal.g.d(id3, "id");
                                            this$03.f30328j = id3;
                                            AdLoader.Builder builder2 = new AdLoader.Builder(applicationContext2, id3);
                                            final Context applicationContext3 = activity2.getApplicationContext();
                                            builder2.b(new NativeAd.OnNativeAdLoadedListener() { // from class: ud.i
                                                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                                                public final void onNativeAdLoaded(NativeAd nativeAd) {
                                                    View view;
                                                    k this$04 = k.this;
                                                    Context context = applicationContext3;
                                                    Activity activity3 = activity2;
                                                    kotlin.jvm.internal.g.e(this$04, "this$0");
                                                    kotlin.jvm.internal.g.e(activity3, "$activity");
                                                    this$04.f30323e = nativeAd;
                                                    a6.h.k(new StringBuilder(), this$04.f30321b, ":onNativeAdLoaded", fe.a.a());
                                                    int i12 = this$04.f30329k;
                                                    NativeAd nativeAd2 = this$04.f30323e;
                                                    synchronized (this$04) {
                                                        Context applicationContext4 = activity3.getApplicationContext();
                                                        View inflate = LayoutInflater.from(activity3).inflate(i12, (ViewGroup) null);
                                                        if (nativeAd2 != null) {
                                                            if (!de.e.k(nativeAd2.getHeadline() + ' ' + nativeAd2.getBody())) {
                                                                NativeAdView nativeAdView = new NativeAdView(applicationContext4);
                                                                nativeAdView.addView(inflate, new ViewGroup.LayoutParams(-1, -2));
                                                                nativeAdView.setHeadlineView(inflate.findViewById(R.id.ad_title_textview));
                                                                nativeAdView.setBodyView(inflate.findViewById(R.id.ad_describe_textview));
                                                                nativeAdView.setCallToActionView(inflate.findViewById(R.id.ad_action_button));
                                                                nativeAdView.setIconView(inflate.findViewById(R.id.ad_icon_imageview));
                                                                View headlineView = nativeAdView.getHeadlineView();
                                                                kotlin.jvm.internal.g.c(headlineView, "null cannot be cast to non-null type android.widget.TextView");
                                                                ((TextView) headlineView).setText(nativeAd2.getHeadline());
                                                                View bodyView = nativeAdView.getBodyView();
                                                                kotlin.jvm.internal.g.c(bodyView, "null cannot be cast to non-null type android.widget.TextView");
                                                                ((TextView) bodyView).setText(nativeAd2.getBody());
                                                                View callToActionView = nativeAdView.getCallToActionView();
                                                                kotlin.jvm.internal.g.c(callToActionView, "null cannot be cast to non-null type android.widget.TextView");
                                                                ((TextView) callToActionView).setText(nativeAd2.getCallToAction());
                                                                NativeAd.Image icon = nativeAd2.getIcon();
                                                                if (icon != null) {
                                                                    View iconView = nativeAdView.getIconView();
                                                                    kotlin.jvm.internal.g.c(iconView, "null cannot be cast to non-null type android.widget.ImageView");
                                                                    ((ImageView) iconView).setImageDrawable(icon.getDrawable());
                                                                } else {
                                                                    View iconView2 = nativeAdView.getIconView();
                                                                    kotlin.jvm.internal.g.c(iconView2, "null cannot be cast to non-null type android.widget.ImageView");
                                                                    ((ImageView) iconView2).setVisibility(8);
                                                                }
                                                                nativeAdView.setNativeAd(nativeAd2);
                                                                view = LayoutInflater.from(activity3).inflate(this$04.f30330l, (ViewGroup) null);
                                                                kotlin.jvm.internal.g.d(view, "from(activity).inflate(rootLayoutId, null)");
                                                                View findViewById = view.findViewById(R.id.ad_native_banner_root_linearLayout);
                                                                kotlin.jvm.internal.g.c(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
                                                                ((LinearLayout) findViewById).addView(nativeAdView);
                                                            }
                                                        }
                                                        view = null;
                                                    }
                                                    a.InterfaceC0036a interfaceC0036a4 = this$04.c;
                                                    if (interfaceC0036a4 != null) {
                                                        if (view != null) {
                                                            interfaceC0036a4.e(activity3, view, new yd.d("AM", "NB", this$04.f30328j));
                                                            NativeAd nativeAd3 = this$04.f30323e;
                                                            if (nativeAd3 != null) {
                                                                nativeAd3.setOnPaidEventListener(new c5.b(3, context, this$04));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        interfaceC0036a4.a(context, new yd.a(androidx.activity.r.g(new StringBuilder(), this$04.f30321b, ":getAdView failed"), 0));
                                                        return;
                                                    }
                                                    kotlin.jvm.internal.g.i("listener");
                                                    throw null;
                                                }
                                            });
                                            builder2.c(new j(applicationContext2, this$03));
                                            NativeAdOptions.Builder builder3 = new NativeAdOptions.Builder();
                                            builder3.c = false;
                                            builder3.f10607a = false;
                                            builder3.f10610e = this$03.f30324f;
                                            builder3.f10608b = 2;
                                            builder3.f10609d = new VideoOptions(new VideoOptions.Builder());
                                            builder2.d(new NativeAdOptions(builder3));
                                            builder2.a().a(new AdRequest(new AdRequest.Builder()));
                                            return;
                                        } catch (Throwable th3) {
                                            a.InterfaceC0036a interfaceC0036a4 = this$03.c;
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
                                } else if (interfaceC0036a2 != null) {
                                    interfaceC0036a2.a(activity2, new yd.a(a6.h.c(str2, ":Admob has not been inited or is initing"), 0));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
            default:
                final Activity activity2 = this.f30285b;
                final k this$02 = (k) bVar;
                final a.InterfaceC0036a interfaceC0036a2 = this.c;
                kotlin.jvm.internal.g.e(this$02, "this$0");
                activity2.runOnUiThread(new Runnable() { // from class: ud.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = r5;
                        a.InterfaceC0036a interfaceC0036a22 = interfaceC0036a2;
                        final Activity activity22 = activity2;
                        boolean z11 = z10;
                        be.b bVar2 = this$02;
                        switch (i11) {
                            case 0:
                                e this$022 = (e) bVar2;
                                kotlin.jvm.internal.g.e(this$022, "this$0");
                                String str = this$022.f30293b;
                                if (z11) {
                                    j3.h hVar = this$022.f30294d;
                                    if (hVar != null) {
                                        Context applicationContext = activity22.getApplicationContext();
                                        try {
                                            AdManagerAdView adManagerAdView = new AdManagerAdView(applicationContext);
                                            this$022.f30295e = adManagerAdView;
                                            adManagerAdView.setAdSizes(this$022.l(activity22));
                                            String id2 = (String) hVar.f19039b;
                                            kotlin.jvm.internal.g.d(id2, "id");
                                            this$022.f30299i = id2;
                                            AdManagerAdView adManagerAdView2 = this$022.f30295e;
                                            if (adManagerAdView2 != null) {
                                                adManagerAdView2.setAdUnitId(id2);
                                            }
                                            AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
                                            if (!xd.a.b(applicationContext) && !ge.i.c(applicationContext)) {
                                                wd.a.e(false);
                                            }
                                            AdManagerAdView adManagerAdView3 = this$022.f30295e;
                                            if (adManagerAdView3 != null) {
                                                adManagerAdView3.e(new AdManagerAdRequest(builder));
                                            }
                                            AdManagerAdView adManagerAdView4 = this$022.f30295e;
                                            if (adManagerAdView4 != null) {
                                                adManagerAdView4.setAdListener(new d(this$022, activity22, applicationContext));
                                                return;
                                            }
                                            return;
                                        } catch (Throwable th2) {
                                            a.InterfaceC0036a interfaceC0036a3 = this$022.c;
                                            if (interfaceC0036a3 != null) {
                                                interfaceC0036a3.a(applicationContext, new yd.a(a6.h.c(str, ":load exception, please check log"), 0));
                                                fe.a.a().c(th2);
                                                return;
                                            }
                                            kotlin.jvm.internal.g.i("listener");
                                            throw null;
                                        }
                                    }
                                    kotlin.jvm.internal.g.i("adConfig");
                                    throw null;
                                } else if (interfaceC0036a22 != null) {
                                    interfaceC0036a22.a(activity22, new yd.a(a6.h.c(str, ":Admob has not been inited or is initing"), 0));
                                    return;
                                } else {
                                    return;
                                }
                            default:
                                final k this$03 = (k) bVar2;
                                kotlin.jvm.internal.g.e(this$03, "this$0");
                                String str2 = this$03.f30321b;
                                if (z11) {
                                    j3.h hVar2 = this$03.f30322d;
                                    if (hVar2 != null) {
                                        Context applicationContext2 = activity22.getApplicationContext();
                                        try {
                                            String id3 = (String) hVar2.f19039b;
                                            if (!xd.a.b(applicationContext2) && !ge.i.c(applicationContext2)) {
                                                wd.a.e(false);
                                            }
                                            kotlin.jvm.internal.g.d(id3, "id");
                                            this$03.f30328j = id3;
                                            AdLoader.Builder builder2 = new AdLoader.Builder(applicationContext2, id3);
                                            final Context applicationContext3 = activity22.getApplicationContext();
                                            builder2.b(new NativeAd.OnNativeAdLoadedListener() { // from class: ud.i
                                                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                                                public final void onNativeAdLoaded(NativeAd nativeAd) {
                                                    View view;
                                                    k this$04 = k.this;
                                                    Context context = applicationContext3;
                                                    Activity activity3 = activity22;
                                                    kotlin.jvm.internal.g.e(this$04, "this$0");
                                                    kotlin.jvm.internal.g.e(activity3, "$activity");
                                                    this$04.f30323e = nativeAd;
                                                    a6.h.k(new StringBuilder(), this$04.f30321b, ":onNativeAdLoaded", fe.a.a());
                                                    int i12 = this$04.f30329k;
                                                    NativeAd nativeAd2 = this$04.f30323e;
                                                    synchronized (this$04) {
                                                        Context applicationContext4 = activity3.getApplicationContext();
                                                        View inflate = LayoutInflater.from(activity3).inflate(i12, (ViewGroup) null);
                                                        if (nativeAd2 != null) {
                                                            if (!de.e.k(nativeAd2.getHeadline() + ' ' + nativeAd2.getBody())) {
                                                                NativeAdView nativeAdView = new NativeAdView(applicationContext4);
                                                                nativeAdView.addView(inflate, new ViewGroup.LayoutParams(-1, -2));
                                                                nativeAdView.setHeadlineView(inflate.findViewById(R.id.ad_title_textview));
                                                                nativeAdView.setBodyView(inflate.findViewById(R.id.ad_describe_textview));
                                                                nativeAdView.setCallToActionView(inflate.findViewById(R.id.ad_action_button));
                                                                nativeAdView.setIconView(inflate.findViewById(R.id.ad_icon_imageview));
                                                                View headlineView = nativeAdView.getHeadlineView();
                                                                kotlin.jvm.internal.g.c(headlineView, "null cannot be cast to non-null type android.widget.TextView");
                                                                ((TextView) headlineView).setText(nativeAd2.getHeadline());
                                                                View bodyView = nativeAdView.getBodyView();
                                                                kotlin.jvm.internal.g.c(bodyView, "null cannot be cast to non-null type android.widget.TextView");
                                                                ((TextView) bodyView).setText(nativeAd2.getBody());
                                                                View callToActionView = nativeAdView.getCallToActionView();
                                                                kotlin.jvm.internal.g.c(callToActionView, "null cannot be cast to non-null type android.widget.TextView");
                                                                ((TextView) callToActionView).setText(nativeAd2.getCallToAction());
                                                                NativeAd.Image icon = nativeAd2.getIcon();
                                                                if (icon != null) {
                                                                    View iconView = nativeAdView.getIconView();
                                                                    kotlin.jvm.internal.g.c(iconView, "null cannot be cast to non-null type android.widget.ImageView");
                                                                    ((ImageView) iconView).setImageDrawable(icon.getDrawable());
                                                                } else {
                                                                    View iconView2 = nativeAdView.getIconView();
                                                                    kotlin.jvm.internal.g.c(iconView2, "null cannot be cast to non-null type android.widget.ImageView");
                                                                    ((ImageView) iconView2).setVisibility(8);
                                                                }
                                                                nativeAdView.setNativeAd(nativeAd2);
                                                                view = LayoutInflater.from(activity3).inflate(this$04.f30330l, (ViewGroup) null);
                                                                kotlin.jvm.internal.g.d(view, "from(activity).inflate(rootLayoutId, null)");
                                                                View findViewById = view.findViewById(R.id.ad_native_banner_root_linearLayout);
                                                                kotlin.jvm.internal.g.c(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
                                                                ((LinearLayout) findViewById).addView(nativeAdView);
                                                            }
                                                        }
                                                        view = null;
                                                    }
                                                    a.InterfaceC0036a interfaceC0036a4 = this$04.c;
                                                    if (interfaceC0036a4 != null) {
                                                        if (view != null) {
                                                            interfaceC0036a4.e(activity3, view, new yd.d("AM", "NB", this$04.f30328j));
                                                            NativeAd nativeAd3 = this$04.f30323e;
                                                            if (nativeAd3 != null) {
                                                                nativeAd3.setOnPaidEventListener(new c5.b(3, context, this$04));
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        interfaceC0036a4.a(context, new yd.a(androidx.activity.r.g(new StringBuilder(), this$04.f30321b, ":getAdView failed"), 0));
                                                        return;
                                                    }
                                                    kotlin.jvm.internal.g.i("listener");
                                                    throw null;
                                                }
                                            });
                                            builder2.c(new j(applicationContext2, this$03));
                                            NativeAdOptions.Builder builder3 = new NativeAdOptions.Builder();
                                            builder3.c = false;
                                            builder3.f10607a = false;
                                            builder3.f10610e = this$03.f30324f;
                                            builder3.f10608b = 2;
                                            builder3.f10609d = new VideoOptions(new VideoOptions.Builder());
                                            builder2.d(new NativeAdOptions(builder3));
                                            builder2.a().a(new AdRequest(new AdRequest.Builder()));
                                            return;
                                        } catch (Throwable th3) {
                                            a.InterfaceC0036a interfaceC0036a4 = this$03.c;
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
                                } else if (interfaceC0036a22 != null) {
                                    interfaceC0036a22.a(activity22, new yd.a(a6.h.c(str2, ":Admob has not been inited or is initing"), 0));
                                    return;
                                } else {
                                    return;
                                }
                        }
                    }
                });
                return;
        }
    }
}
