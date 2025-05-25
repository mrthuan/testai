package pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.s;
import b.b;
import com.google.ads.ADRequestList;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
import de.e;
import gl.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.jvm.internal.g;
import no.f;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import tf.d;
import yd.c;

/* compiled from: HomeScanBanner.kt */
/* loaded from: classes3.dex */
public abstract class BaseHomeScanBanner extends FlutterBanner {
    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final void b(Context context, View adLayout) {
        TextView textView;
        g.e(context, "context");
        g.e(adLayout, "adLayout");
        if (a0.i(context)) {
            ImageView imageView = (ImageView) adLayout.findViewById(R.id.ad_icon);
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ic_native_card_ad_rtl);
            }
        } else {
            ImageView imageView2 = (ImageView) adLayout.findViewById(R.id.ad_icon);
            if (imageView2 != null) {
                imageView2.setImageResource(R.drawable.ic_native_card_ad);
            }
        }
        f.b(context).getClass();
        if (f.f()) {
            String a10 = bp.a.a(context);
            if ((TextUtils.equals(a10, ea.a.p("Qg==", "jujIY3rV")) || TextUtils.equals(a10, ea.a.p("Qw==", "p6t5OG8F"))) && (textView = (TextView) adLayout.findViewById(R.id.ad_action_button)) != null) {
                textView.setText(context.getResources().getString(R.string.arg_res_0x7f130024));
                textView.setAllCaps(false);
            }
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final void c(Context context, ADRequestList aDRequestList) {
        int i10;
        g.e(context, "context");
        Iterator<c> it = aDRequestList.iterator();
        while (it.hasNext()) {
            Bundle bundle = (Bundle) it.next().f32118b.c;
            String p10 = ea.a.p("UGQVYx5vGGMtczlwW3M-dFFvbg==", "311Jvqus");
            if (a0.i(context)) {
                i10 = 3;
            } else {
                i10 = 2;
            }
            bundle.putInt(p10, i10);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final long h() {
        boolean z10;
        g.d(ReaderPdfApplication.m(), ea.a.p("VGU_SR1zFmEcY1EoKQ==", "4D2aU6Zx"));
        String h10 = e.h(c1.J, "");
        if (h10 != null && h10.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            ea.a.p("QGM7bjtiNW4mZRRfRmUxcl1zOl8gbkJlBnYQbA4xdjkTYzVuAmkzICFzRmRRZjZ1VHRyNnlz", "sc3ZdT7Y");
        } else {
            try {
                g.d(h10, ea.a.p("LG9fZhBn", "bLtuZATF"));
                if (TextUtils.isDigitsOnly(h10)) {
                    return Long.parseLong(h10);
                }
                Result.m13constructorimpl(d.f30009a);
            } catch (Throwable th2) {
                Result.m13constructorimpl(s.v(th2));
            }
        }
        return 60000L;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final boolean n() {
        return true;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final void o() {
        h.f17923a.getClass();
        String p10 = ea.a.p("W28mZSBjA24wYVpuDHJ2dDZpVWcjcmNmDXU9dFZyS3JWZjllAGg=", "aI3k2ke5");
        int i10 = zk.a.f32399a;
        t1.b(p10);
        EngineHelper.f15726a.getClass();
        FlutterAppApi flutterAppApi = EngineHelper.f15727b;
        if (flutterAppApi != null) {
            flutterAppApi.a(ea.a.p("PWVCdRRld0g1bS9TFmEGQlRuAGU3QRlICW1UUyBhHkIubl9lC0I=", "ZCvIf1Cp"));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void r(Activity activity) {
        ArrayList<c> f10;
        if (BillingConfigImpl.c.w()) {
            String d10 = a6.h.d("premium user, skip ", i(), " load");
            int i10 = zk.a.f32399a;
            t1.b(d10);
            EngineHelper.f15726a.getClass();
            FlutterAppApi flutterAppApi = EngineHelper.f15727b;
            if (flutterAppApi != null) {
                flutterAppApi.c(i(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseHomeScanBanner$load$1
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
        } else if (activity == null) {
            EngineHelper.f15726a.getClass();
            FlutterAppApi flutterAppApi2 = EngineHelper.f15727b;
            if (flutterAppApi2 != null) {
                flutterAppApi2.c(i(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseHomeScanBanner$load$2
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
        } else if (!b.J(ReaderPdfApplication.m())) {
            String p10 = ea.a.p("NmsLcGZhUyAkbwdk", "m4EbF783");
            int i11 = zk.a.f32399a;
            t1.b(p10);
            EngineHelper.f15726a.getClass();
            FlutterAppApi flutterAppApi3 = EngineHelper.f15727b;
            if (flutterAppApi3 != null) {
                flutterAppApi3.c(i(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseHomeScanBanner$load$3
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
        } else if (!ge.h.a(activity)) {
            a(ea.a.p("H2UhdwByMyAmbxIgVXY2aVRhMGwsLBZzH2kBID1vI2Q=", "XYqUoXVW"));
            EngineHelper.f15726a.getClass();
            FlutterAppApi flutterAppApi4 = EngineHelper.f15727b;
            if (flutterAppApi4 != null) {
                flutterAppApi4.c(i(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseHomeScanBanner$load$4
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
            this.f23998l = new a(activity);
            f.b(activity).getClass();
            if (f.f()) {
                String a10 = bp.a.a(activity);
                switch (a10.hashCode()) {
                    case 65:
                        if (a10.equals(ea.a.p("QQ==", "jBDKiIHN"))) {
                            a(ea.a.p("VW8HZBdwEGVoaQhzQGE7bBh1IWU7IEZsFW5RaSIgQQ==", "jm9f7bQx"));
                            f10 = he.a.d(activity, R.layout.ad_admob_bigger_native_banner, null, new yd.a(he.a.f18182f, 1), new ie.g(R.mipmap.ic_launcher), new ie.f(he.a.f18320z3), new ie.f(he.a.A3), null, null, null, new ie.f(he.a.B3), new ie.c(he.a.f18241n2), null, null, new w4.d(he.a.f18162c0, he.a.f18204i0), new w4.a(he.a.f18184f1, he.a.f18226l1), null);
                            break;
                        }
                        a(ea.a.p("I29QZFlwRWV6aSRzAWEEbBV1HWU3IBVsO25yaREgDWUpYURsdA==", "KeQTZRbi"));
                        f10 = he.a.f(activity);
                        break;
                    case 66:
                        if (a10.equals(ea.a.p("Qg==", "NX9ze14o"))) {
                            a(ea.a.p("X28qZFNwEGVSaVpzHWE6bGR1QWU0IDNsVW5raRIgQg==", "4Ka8kCJp"));
                            f10 = he.a.d(activity, R.layout.ad_admob_bigger_native_banner, null, new yd.a(he.a.f18189g, 1), new ie.g(R.mipmap.ic_launcher), new ie.f(he.a.C3), new ie.f(he.a.D3), null, null, null, new ie.f(he.a.E3), new ie.c(he.a.f18248o2), null, null, new w4.d(he.a.f18162c0, he.a.f18211j0), new w4.a(he.a.f18184f1, he.a.f18233m1), null);
                            break;
                        }
                        a(ea.a.p("I29QZFlwRWV6aSRzAWEEbBV1HWU3IBVsO25yaREgDWUpYURsdA==", "KeQTZRbi"));
                        f10 = he.a.f(activity);
                        break;
                    case 67:
                        if (a10.equals(ea.a.p("Qw==", "12yKpcaV"))) {
                            a(ea.a.p("I29QZFlwRWV6aSRzAWEEbBV1HWU3IBVsJm5IaR8gQw==", "ePGjGhlG"));
                            f10 = he.a.d(activity, R.layout.ad_admob_bigger_native_banner, null, new yd.a(he.a.f18196h, 1), new ie.g(R.mipmap.ic_launcher), new ie.f(he.a.F3), new ie.f(he.a.G3), null, null, null, new ie.f(he.a.H3), new ie.c(he.a.f18255p2), null, null, new w4.d(he.a.f18162c0, he.a.f18218k0), new w4.a(he.a.f18184f1, he.a.f18240n1), null);
                            break;
                        }
                        a(ea.a.p("I29QZFlwRWV6aSRzAWEEbBV1HWU3IBVsO25yaREgDWUpYURsdA==", "KeQTZRbi"));
                        f10 = he.a.f(activity);
                        break;
                    default:
                        a(ea.a.p("I29QZFlwRWV6aSRzAWEEbBV1HWU3IBVsO25yaREgDWUpYURsdA==", "KeQTZRbi"));
                        f10 = he.a.f(activity);
                        break;
                }
            } else {
                a(ea.a.p("X28qZFNuDXRScEZlSWk4czBhXmxmdTBlcg==", "S5Do9FIX"));
                f10 = he.a.f(activity);
            }
            ea.a.p("IWZEKB9zE3JmZwN0fW4kdFluMWVhYVV0loDXYw5sI3UmYwxlOCl8IGggRiAUIHcgGCByfQ==", "WLHdJvhL");
            k(activity, f10);
        }
    }

    /* compiled from: HomeScanBanner.kt */
    /* loaded from: classes3.dex */
    public static final class a implements hl.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f23985a;

        public a(Activity activity) {
            this.f23985a = activity;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // hl.a
        public final void d() {
            String p10;
            Activity activity = this.f23985a;
            f.b(activity).getClass();
            if (f.f()) {
                String a10 = bp.a.a(activity);
                switch (a10.hashCode()) {
                    case 65:
                        if (a10.equals(ea.a.p("QQ==", "kgGw5vTs"))) {
                            p10 = ea.a.p("QQ==", "uAAFIBrO");
                            break;
                        }
                        p10 = ea.a.p("IW8=", "MZFlbBFe");
                        break;
                    case 66:
                        if (a10.equals(ea.a.p("Qg==", "BnxkvX8Y"))) {
                            p10 = ea.a.p("Qg==", "W8wSQkeC");
                            break;
                        }
                        p10 = ea.a.p("IW8=", "MZFlbBFe");
                        break;
                    case 67:
                        if (a10.equals(ea.a.p("Qw==", "3mXPTUJT"))) {
                            p10 = ea.a.p("Qw==", "jhx1c33V");
                            break;
                        }
                        p10 = ea.a.p("IW8=", "MZFlbBFe");
                        break;
                    default:
                        p10 = ea.a.p("IW8=", "MZFlbBFe");
                        break;
                }
                tn.a.d(ReaderPdfApplication.m(), ea.a.p("IWVGXwpjVm48aSZlKmIJbltlcg==", "ZlPv6U1b"), ea.a.p("L2UvXwJjN24uaQpla2M7aVtr", "7qAXqV6V"), p10, false);
                return;
            }
            tn.a.b(ReaderPdfApplication.m(), ea.a.p("QGMqbg==", "cSy9zOLE"), ea.a.p("W28mZSxuA3QbdlFiCG44ZTZfUWwvY2s=", "Sg4yIVvv"));
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // hl.a
        public final void f1(BannerType type) {
            String p10;
            g.e(type, "type");
            Activity activity = this.f23985a;
            f.b(activity).getClass();
            if (f.f()) {
                String a10 = bp.a.a(activity);
                switch (a10.hashCode()) {
                    case 65:
                        if (a10.equals(ea.a.p("QQ==", "IFBzo50Z"))) {
                            p10 = ea.a.p("QQ==", "dGN2mlOh");
                            break;
                        }
                        p10 = ea.a.p("XW8=", "zpTanYeC");
                        break;
                    case 66:
                        if (a10.equals(ea.a.p("Qg==", "3nkasQm8"))) {
                            p10 = ea.a.p("Qg==", "KATadLun");
                            break;
                        }
                        p10 = ea.a.p("XW8=", "zpTanYeC");
                        break;
                    case 67:
                        if (a10.equals(ea.a.p("Qw==", "2No8xGjs"))) {
                            p10 = ea.a.p("Qw==", "eIirZjh5");
                            break;
                        }
                        p10 = ea.a.p("XW8=", "zpTanYeC");
                        break;
                    default:
                        p10 = ea.a.p("XW8=", "zpTanYeC");
                        break;
                }
                tn.a.d(ReaderPdfApplication.m(), ea.a.p("IWVGXwpjVm48aSZlKmIJbltlcg==", "uGkvdjnw"), ea.a.p("IWVGXwpjVm48aSZlKnMAb3c=", "VOfO2Vmj"), p10, false);
                return;
            }
            tn.a.b(ReaderPdfApplication.m(), ea.a.p("QGMqbg==", "mVYySoOe"), ea.a.p("J29cZSZuVnQzdi9iFG4GZUdfHWgqdw==", "2M1lOErN"));
        }

        @Override // hl.a
        public final void e() {
        }

        @Override // hl.a
        public final void f() {
        }
    }
}
