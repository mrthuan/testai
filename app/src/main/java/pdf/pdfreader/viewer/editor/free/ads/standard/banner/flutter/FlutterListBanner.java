package pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter;

import a6.h;
import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import androidx.activity.f;
import androidx.activity.s;
import androidx.appcompat.widget.y0;
import be.b;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
import de.e;
import gl.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import tf.c;
import tf.d;
import zd.a;

/* compiled from: FlutterListBanner.kt */
/* loaded from: classes3.dex */
public abstract class FlutterListBanner {

    /* renamed from: a  reason: collision with root package name */
    public a f24002a;

    /* renamed from: b  reason: collision with root package name */
    public View f24003b;

    /* renamed from: e  reason: collision with root package name */
    public long f24005e;

    /* renamed from: f  reason: collision with root package name */
    public long f24006f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f24007g;

    /* renamed from: i  reason: collision with root package name */
    public boolean f24009i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f24010j;

    /* renamed from: o  reason: collision with root package name */
    public Bitmap f24015o;
    public BannerType c = BannerType.None;

    /* renamed from: d  reason: collision with root package name */
    public final c f24004d = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterListBanner$refreshHandler$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cg.a
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    });

    /* renamed from: h  reason: collision with root package name */
    public boolean f24008h = true;

    /* renamed from: k  reason: collision with root package name */
    public final c f24011k = kotlin.a.a(new cg.a<List<n>>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterListBanner$listeners$2
        @Override // cg.a
        public final List<n> invoke() {
            return new ArrayList();
        }
    });

    /* renamed from: l  reason: collision with root package name */
    public boolean f24012l = true;

    /* renamed from: m  reason: collision with root package name */
    public long f24013m = -1;

    /* renamed from: n  reason: collision with root package name */
    public final y0 f24014n = new y0(this, 21);

    public final void a(String log) {
        g.e(log, "log");
        String m10 = f.m(f(), " ", log);
        int i10 = zk.a.f32399a;
        t1.b(m10);
    }

    public final void b(Activity context) {
        g.e(context, "context");
        ((Handler) this.f24004d.getValue()).removeCallbacks(this.f24014n);
        this.f24006f = 0L;
        this.f24005e = 0L;
        BannerType bannerType = BannerType.None;
        this.c = bannerType;
        if (this.f24002a != null) {
            a(ea.a.p("KWUHdChvQCApZA==", "nUMtZ9r7"));
        }
        this.f24009i = false;
        this.f24010j = false;
        this.c = bannerType;
        a aVar = this.f24002a;
        if (aVar != null) {
            b bVar = aVar.f32347e;
            if (bVar != null) {
                bVar.a(context);
            }
            b bVar2 = aVar.f32348f;
            if (bVar2 != null && aVar.f32347e != bVar2) {
                bVar2.a(context);
            }
            aVar.f32349g = null;
            aVar.f32351i = null;
        }
        this.f24002a = null;
        this.f24003b = null;
        this.f24015o = null;
    }

    public abstract void c();

    public final long d() {
        boolean z10;
        long parseLong;
        if (this.f24013m < 0) {
            g.d(ReaderPdfApplication.m(), ea.a.p("MmVMSRpzQ2EmYwMoKQ==", "yXU8t7uC"));
            String h10 = e.h(c1.M, "");
            if (h10 != null && h10.length() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                ea.a.p("I2lCdCZiVm40ZThfB2UOclBzBl8sbhFlM3YIbCcxVjlvY15uH2lQIDNzamQQZgl1WXRONnVz", "pYXDAixb");
            } else {
                try {
                    g.d(h10, ea.a.p("UG8lZhpn", "IeWyC0k4"));
                } catch (Throwable th2) {
                    Result.m13constructorimpl(s.v(th2));
                }
                if (TextUtils.isDigitsOnly(h10)) {
                    parseLong = Long.parseLong(h10);
                    this.f24013m = parseLong;
                } else {
                    Result.m13constructorimpl(d.f30009a);
                }
            }
            parseLong = 60000;
            this.f24013m = parseLong;
        }
        return this.f24013m;
    }

    public final List<n> e() {
        return (List) this.f24011k.getValue();
    }

    public abstract String f();

    public final boolean g() {
        if (this.f24002a != null && this.f24003b != null) {
            return true;
        }
        return false;
    }

    public final void h() {
        b bVar;
        this.f24008h = true;
        a aVar = this.f24002a;
        if (aVar != null && (bVar = aVar.f32347e) != null) {
            bVar.j();
        }
        if (this.c != BannerType.None) {
            ((Handler) this.f24004d.getValue()).removeCallbacks(this.f24014n);
            if (this.f24005e != 0) {
                this.f24007g = true;
                this.f24006f = (SystemClock.elapsedRealtime() - this.f24005e) + this.f24006f;
                if (d() - this.f24006f < 0) {
                    this.f24006f = d();
                    ea.a.p("DmRlZQp0", "mj1Kxy8Q");
                    f();
                    return;
                }
                ea.a.p("DmRlZQp0", "mj1Kxy8Q");
                f();
            }
        }
    }

    public final void i() {
        b bVar;
        this.f24008h = false;
        a aVar = this.f24002a;
        if (aVar != null && (bVar = aVar.f32347e) != null) {
            bVar.k();
        }
        boolean z10 = this.f24007g;
        if (z10 && this.c != BannerType.None && z10) {
            this.f24007g = false;
            long d10 = d() - this.f24006f;
            if (d10 < 0) {
                d10 = 0;
            }
            ea.a.p("DmRlZQp0", "mj1Kxy8Q");
            f();
            ((Handler) this.f24004d.getValue()).postDelayed(this.f24014n, d10 + 2000);
            this.f24005e = SystemClock.elapsedRealtime();
        }
    }

    public final void j(LinearLayout linearLayout) {
        ViewGroup viewGroup;
        if (BillingConfigImpl.c.w()) {
            String d10 = h.d("premium user, skip ", f(), " show");
            int i10 = zk.a.f32399a;
            t1.b(d10);
        } else if (!g()) {
            a(ea.a.p("AGgDd2ZmE2kkZQIgWm8jIF14O3M9IFdk", "jqslFrPr"));
            EngineHelper.f15726a.getClass();
            FlutterAppApi flutterAppApi = EngineHelper.f15727b;
            if (flutterAppApi != null) {
                flutterAppApi.d(f(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterListBanner$showAd$1
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
        } else {
            try {
                View view = this.f24003b;
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
                    linearLayout.removeAllViews();
                    linearLayout.addView(this.f24003b);
                    linearLayout.setVisibility(0);
                    EngineHelper.f15726a.getClass();
                    FlutterAppApi flutterAppApi2 = EngineHelper.f15727b;
                    if (flutterAppApi2 != null) {
                        flutterAppApi2.d(f(), true, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterListBanner$showAd$2
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
                    if (this.f24012l) {
                        a(ea.a.p("PGhed1lzQmM5ZTlz", "ooKozoRQ"));
                        if (this.c != BannerType.None) {
                            k();
                        }
                        this.f24012l = false;
                        return;
                    }
                    return;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            a(ea.a.p("PGhed1lmVmk2ZWQ=", "eDyRkdsk"));
            EngineHelper.f15726a.getClass();
            FlutterAppApi flutterAppApi3 = EngineHelper.f15727b;
            if (flutterAppApi3 != null) {
                flutterAppApi3.d(f(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterListBanner$showAd$3
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
    }

    public final void k() {
        if (this.f24008h) {
            return;
        }
        long d10 = d() / 1000;
        ea.a.p("DmRlZQp0", "mj1Kxy8Q");
        f();
        this.f24005e = SystemClock.elapsedRealtime();
        this.f24006f = 0L;
        c cVar = this.f24004d;
        y0 y0Var = this.f24014n;
        ((Handler) cVar.getValue()).removeCallbacks(y0Var);
        ((Handler) cVar.getValue()).postDelayed(y0Var, d() + 2000);
    }
}
