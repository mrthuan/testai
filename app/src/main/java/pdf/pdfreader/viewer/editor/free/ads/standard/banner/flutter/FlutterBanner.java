package pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter;

import a6.h;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.b;
import androidx.activity.f;
import com.google.ads.ADRequestList;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
import gl.d;
import gl.l;
import gl.m;
import java.util.ArrayList;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import tf.c;
import zd.a;

/* compiled from: FlutterBanner.kt */
/* loaded from: classes3.dex */
public abstract class FlutterBanner {

    /* renamed from: a  reason: collision with root package name */
    public a f23988a;

    /* renamed from: b  reason: collision with root package name */
    public View f23989b;

    /* renamed from: e  reason: collision with root package name */
    public long f23991e;

    /* renamed from: f  reason: collision with root package name */
    public long f23992f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f23993g;

    /* renamed from: i  reason: collision with root package name */
    public boolean f23995i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f23996j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f23997k;

    /* renamed from: l  reason: collision with root package name */
    public hl.a f23998l;
    public BannerType c = BannerType.None;

    /* renamed from: d  reason: collision with root package name */
    public final c f23990d = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner$refreshHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* renamed from: h  reason: collision with root package name */
    public boolean f23994h = true;

    /* renamed from: m  reason: collision with root package name */
    public long f23999m = -1;

    /* renamed from: n  reason: collision with root package name */
    public final b f24000n = new b(this, 23);

    public final void a(String log) {
        g.e(log, "log");
        String m10 = f.m(i(), " ", log);
        int i10 = zk.a.f32399a;
        t1.b(m10);
    }

    public abstract void b(Context context, View view);

    public abstract void c(Context context, ADRequestList aDRequestList);

    public final void d() {
        if (!this.f23994h && n() && this.f23995i && this.c != BannerType.None) {
            this.f23995i = false;
            q();
        }
    }

    public final void e(Activity context) {
        g.e(context, "context");
        if (n()) {
            ((Handler) this.f23990d.getValue()).removeCallbacks(this.f24000n);
            this.f23992f = 0L;
            this.f23991e = 0L;
            this.c = BannerType.None;
        }
        if (this.f23988a != null) {
            a(ea.a.p("DmUrdDVvTSApZA==", "R9jXG4CQ"));
        }
        this.f23997k = false;
        this.c = BannerType.None;
        a aVar = this.f23988a;
        if (aVar != null) {
            be.b bVar = aVar.f32347e;
            if (bVar != null) {
                bVar.a(context);
            }
            be.b bVar2 = aVar.f32348f;
            if (bVar2 != null && aVar.f32347e != bVar2) {
                bVar2.a(context);
            }
            aVar.f32349g = null;
            aVar.f32351i = null;
        }
        this.f23988a = null;
        this.f23989b = null;
    }

    public abstract void f();

    public final long g() {
        if (this.f23999m < 0) {
            this.f23999m = h();
        }
        return this.f23999m;
    }

    public abstract long h();

    public abstract String i();

    public final boolean j() {
        if (this.f23988a != null && this.f23989b != null) {
            return true;
        }
        return false;
    }

    public final void k(Activity activity, ArrayList<yd.c> arrayList) {
        g.e(activity, "activity");
        if (this.f23997k) {
            a(ea.a.p("LmQRchxxQmUpdCNuEixIc15pHiApbwRk", "BjeXcplD"));
            return;
        }
        ADRequestList aDRequestList = new ADRequestList(new FlutterBanner$load$adRequestList$1(this));
        aDRequestList.addAll(arrayList);
        c(activity, aDRequestList);
        if (n()) {
            ((Handler) this.f23990d.getValue()).removeCallbacks(this.f24000n);
            this.f23992f = 0L;
            this.f23991e = 0L;
            this.c = BannerType.None;
        }
        boolean z10 = true;
        this.f23997k = true;
        a aVar = new a();
        this.f23988a = aVar;
        a(ea.a.p("X28qZFNhZA==", "xawAGZ96"));
        if ((this instanceof gl.c) || (this instanceof d)) {
            if (o9.d.f22759b.length() != 0) {
                z10 = false;
            }
            if (!z10) {
                o9.d.c = o9.d.f22759b;
                tn.a.b(ReaderPdfApplication.m(), ea.a.p("V2UpdRRfCl8QX1ZhB24zcg==", "JShky2Ip"), "load_".concat(o9.d.f22759b));
                tn.a.b(ReaderPdfApplication.m(), ea.a.p("V2UpdRRfCl8QX1ZhB24zcg==", "5JqBTkJd"), ea.a.p("I29QZCZ0WHQ7bA==", "RyO6YzgA"));
            }
        }
        aVar.e(activity, aDRequestList);
    }

    public final void l() {
        be.b bVar;
        this.f23994h = true;
        a aVar = this.f23988a;
        if (aVar != null && (bVar = aVar.f32347e) != null) {
            bVar.j();
        }
        if (n() && this.c != BannerType.None) {
            ((Handler) this.f23990d.getValue()).removeCallbacks(this.f24000n);
            if (this.f23991e != 0) {
                this.f23993g = true;
                this.f23992f = (SystemClock.elapsedRealtime() - this.f23991e) + this.f23992f;
                if (g() - this.f23992f < 0) {
                    this.f23992f = g();
                    ea.a.p("cmQfZQB0", "ONbaRt6v");
                    i();
                    return;
                }
                ea.a.p("cmQfZQB0", "ONbaRt6v");
                i();
            }
        }
    }

    public final void m() {
        be.b bVar;
        this.f23994h = false;
        a aVar = this.f23988a;
        if (aVar != null && (bVar = aVar.f32347e) != null) {
            bVar.k();
        }
        if (this.f23996j) {
            this.f23996j = false;
            if ((this instanceof gl.c) || (this instanceof d)) {
                o9.d.f22759b = ea.a.p("RQ==", "gkPOo4xB");
                o();
            }
            if ((this instanceof l) || (this instanceof m)) {
                o();
            }
            if (this instanceof BasePreviewBottomBanner) {
                o();
            }
        }
        if (n()) {
            boolean z10 = this.f23993g;
            if (z10) {
                if (this.c != BannerType.None && z10) {
                    this.f23993g = false;
                    long g10 = g() - this.f23992f;
                    if (g10 < 0) {
                        g10 = 0;
                    }
                    ea.a.p("cmQfZQB0", "ONbaRt6v");
                    i();
                    ((Handler) this.f23990d.getValue()).postDelayed(this.f24000n, g10 + 2000);
                    this.f23991e = SystemClock.elapsedRealtime();
                }
            } else if (this.f23995i && this.c != BannerType.None) {
                d();
            }
        }
    }

    public abstract boolean n();

    public abstract void o();

    public final void p(ViewGroup adLayout) {
        ViewGroup viewGroup;
        g.e(adLayout, "adLayout");
        if (BillingConfigImpl.c.w()) {
            String d10 = h.d("premium user, skip ", i(), " show");
            int i10 = zk.a.f32399a;
            t1.b(d10);
        } else if (!j()) {
            a(ea.a.p("R2g5d3JmIGkkZQIgWm8jIF14O3M9IFdk", "1P4VRAHd"));
            EngineHelper.f15726a.getClass();
            FlutterAppApi flutterAppApi = EngineHelper.f15727b;
            if (flutterAppApi != null) {
                flutterAppApi.d(i(), false, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner$showAd$1
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ tf.d invoke() {
                        invoke2();
                        return tf.d.f30009a;
                    }
                });
            }
        } else {
            try {
                View view = this.f23989b;
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        viewGroup = (ViewGroup) parent;
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                    }
                    adLayout.removeAllViews();
                    adLayout.addView(this.f23989b);
                    adLayout.setVisibility(0);
                    hl.a aVar = this.f23998l;
                    if (aVar != null) {
                        aVar.f1(this.c);
                    }
                    a(ea.a.p("PGhed1lzQmM5ZTlz", "ldvVEgEO"));
                    EngineHelper.f15726a.getClass();
                    FlutterAppApi flutterAppApi2 = EngineHelper.f15727b;
                    if (flutterAppApi2 != null) {
                        flutterAppApi2.d(i(), true, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner$showAd$2
                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                            }

                            @Override // cg.a
                            public /* bridge */ /* synthetic */ tf.d invoke() {
                                invoke2();
                                return tf.d.f30009a;
                            }
                        });
                        return;
                    }
                    return;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            a(ea.a.p("PGhed1lmVmk2ZWQ=", "FYeif8X8"));
            EngineHelper.f15726a.getClass();
            FlutterAppApi flutterAppApi3 = EngineHelper.f15727b;
            if (flutterAppApi3 != null) {
                flutterAppApi3.d(i(), false, new cg.a<tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner$showAd$3
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // cg.a
                    public /* bridge */ /* synthetic */ tf.d invoke() {
                        invoke2();
                        return tf.d.f30009a;
                    }
                });
            }
        }
    }

    public final void q() {
        if (!this.f23994h && n()) {
            long g10 = g() / 1000;
            ea.a.p("cmQfZQB0", "ONbaRt6v");
            i();
            this.f23991e = SystemClock.elapsedRealtime();
            this.f23992f = 0L;
            c cVar = this.f23990d;
            b bVar = this.f24000n;
            ((Handler) cVar.getValue()).removeCallbacks(bVar);
            ((Handler) cVar.getValue()).postDelayed(bVar, g() + 2000);
        }
    }
}
