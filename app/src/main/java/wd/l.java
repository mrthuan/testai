package wd;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import be.a;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeAdView;
import ge.d;
import pdf.pdfreader.viewer.editor.free.R;
import zd.d;

/* compiled from: AdmobNativeCard.java */
/* loaded from: classes.dex */
public final class l extends be.d {

    /* renamed from: b  reason: collision with root package name */
    public j3.h f31137b;
    public boolean c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f31138d;

    /* renamed from: f  reason: collision with root package name */
    public NativeAd f31140f;

    /* renamed from: h  reason: collision with root package name */
    public a.InterfaceC0036a f31142h;

    /* renamed from: i  reason: collision with root package name */
    public String f31143i;

    /* renamed from: k  reason: collision with root package name */
    public String f31145k;

    /* renamed from: m  reason: collision with root package name */
    public float f31147m;

    /* renamed from: e  reason: collision with root package name */
    public int f31139e = 1;

    /* renamed from: g  reason: collision with root package name */
    public int f31141g = R.layout.ad_native_card;

    /* renamed from: j  reason: collision with root package name */
    public boolean f31144j = false;

    /* renamed from: l  reason: collision with root package name */
    public float f31146l = 1.7758986f;

    /* compiled from: AdmobNativeCard.java */
    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f31148a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0036a f31149b;

        /* compiled from: AdmobNativeCard.java */
        /* renamed from: wd.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0394a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f31150a;

            public RunnableC0394a(boolean z10) {
                this.f31150a = z10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z10 = this.f31150a;
                a aVar = a.this;
                if (z10) {
                    l lVar = l.this;
                    j3.h hVar = lVar.f31137b;
                    Activity activity = aVar.f31148a;
                    Context applicationContext = activity.getApplicationContext();
                    try {
                        String str = (String) hVar.f19039b;
                        if (!xd.a.b(applicationContext) && !ge.i.c(applicationContext)) {
                            wd.a.e(false);
                        }
                        lVar.f31145k = str;
                        AdLoader.Builder builder = new AdLoader.Builder(applicationContext.getApplicationContext(), str);
                        builder.b(new n(lVar, activity.getApplicationContext(), activity));
                        builder.c(new m(lVar, applicationContext));
                        NativeAdOptions.Builder builder2 = new NativeAdOptions.Builder();
                        builder2.c = false;
                        builder2.f10607a = false;
                        builder2.f10610e = lVar.f31139e;
                        builder2.f10608b = 2;
                        VideoOptions.Builder builder3 = new VideoOptions.Builder();
                        builder3.f10057a = true;
                        builder2.f10609d = new VideoOptions(builder3);
                        builder.d(new NativeAdOptions(builder2));
                        builder.a().a(new AdRequest(new AdRequest.Builder()));
                        return;
                    } catch (Throwable th2) {
                        a.InterfaceC0036a interfaceC0036a = lVar.f31142h;
                        if (interfaceC0036a != null) {
                            interfaceC0036a.a(applicationContext, new yd.a("AdmobNativeCard:load exception, please check log", 0));
                        }
                        fe.a.a().c(th2);
                        return;
                    }
                }
                a.InterfaceC0036a interfaceC0036a2 = aVar.f31149b;
                if (interfaceC0036a2 != null) {
                    interfaceC0036a2.a(aVar.f31148a, new yd.a("AdmobNativeCard:Admob has not been inited or is initing", 0));
                }
            }
        }

        public a(Activity activity, d.a aVar) {
            this.f31148a = activity;
            this.f31149b = aVar;
        }

        @Override // wd.d
        public final void a(boolean z10) {
            this.f31148a.runOnUiThread(new RunnableC0394a(z10));
        }
    }

    /* compiled from: AdmobNativeCard.java */
    /* loaded from: classes.dex */
    public class c implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeAdView f31152a;

        public c(NativeAdView nativeAdView) {
            this.f31152a = nativeAdView;
        }

        @Override // ge.d.a
        public final void a(Bitmap bitmap) {
            ((ImageView) this.f31152a.getIconView()).setImageBitmap(bitmap);
        }

        @Override // ge.d.a
        public final void b() {
            ((ImageView) this.f31152a.getIconView()).setVisibility(8);
        }
    }

    @Override // be.a
    public final synchronized void a(Activity activity) {
        try {
            NativeAd nativeAd = this.f31140f;
            if (nativeAd != null) {
                nativeAd.destroy();
                this.f31140f = null;
            }
        } finally {
        }
    }

    @Override // be.a
    public final String b() {
        return b.a.d(this.f31145k, new StringBuilder("AdmobNativeCard@"));
    }

    @Override // be.a
    public final void d(Activity activity, yd.c cVar, a.InterfaceC0036a interfaceC0036a) {
        j3.h hVar;
        fe.a.a().b("AdmobNativeCard:load");
        if (activity != null && cVar != null && (hVar = cVar.f32118b) != null && interfaceC0036a != null) {
            this.f31142h = interfaceC0036a;
            this.f31137b = hVar;
            Bundle bundle = (Bundle) hVar.c;
            if (bundle != null) {
                this.c = bundle.getBoolean("ad_for_child");
                this.f31139e = ((Bundle) this.f31137b.c).getInt("ad_choices_position", 1);
                this.f31141g = ((Bundle) this.f31137b.c).getInt("layout_id", R.layout.ad_native_card);
                this.f31143i = ((Bundle) this.f31137b.c).getString("common_config", "");
                this.f31144j = ((Bundle) this.f31137b.c).getBoolean("ban_video", this.f31144j);
                this.f31147m = ((Bundle) this.f31137b.c).getFloat("cover_width", activity.getResources().getDisplayMetrics().widthPixels * 0.9f);
                this.f31138d = ((Bundle) this.f31137b.c).getBoolean("skip_init");
            }
            if (this.c) {
                wd.a.f();
            }
            wd.a.b(activity, this.f31138d, new a(activity, (d.a) interfaceC0036a));
        } else if (interfaceC0036a != null) {
            ((d.a) interfaceC0036a).a(activity, new yd.a("AdmobNativeCard:Please check params is right.", 0));
        } else {
            throw new IllegalArgumentException("AdmobNativeCard:Please check MediationListener is right.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
        if (r1 != false) goto L33;
     */
    @Override // be.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.view.View j(android.app.Activity r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.l.j(android.app.Activity, int, int):android.view.View");
    }

    /* compiled from: AdmobNativeCard.java */
    /* loaded from: classes.dex */
    public class b implements ViewGroup.OnHierarchyChangeListener {
        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            if (view2 instanceof ImageView) {
                ((ImageView) view2).setAdjustViewBounds(true);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
        }
    }
}
