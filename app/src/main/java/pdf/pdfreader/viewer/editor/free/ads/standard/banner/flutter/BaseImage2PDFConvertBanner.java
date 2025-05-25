package pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter;

import a6.h;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.google.ads.ADRequestList;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
import gl.k;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import tf.d;
import w4.b;
import yd.c;

/* compiled from: Image2PDFConvertBanner.kt */
/* loaded from: classes3.dex */
public abstract class BaseImage2PDFConvertBanner extends FlutterBanner {
    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final void b(Context context, View adLayout) {
        int i10;
        int i11;
        int i12;
        int i13;
        g.e(context, "context");
        g.e(adLayout, "adLayout");
        boolean D = c1.D(context);
        if (a0.i(context)) {
            ImageView imageView = (ImageView) adLayout.findViewById(R.id.ad_icon);
            if (imageView != null) {
                if (D) {
                    i13 = R.drawable.ic_native_banner_ad_light_rtl;
                } else {
                    i13 = R.drawable.ic_native_banner_ad_dark_rtl;
                }
                imageView.setImageResource(i13);
            }
        } else {
            ImageView imageView2 = (ImageView) adLayout.findViewById(R.id.ad_icon);
            if (imageView2 != null) {
                if (D) {
                    i10 = R.drawable.ic_native_banner_ad_light;
                } else {
                    i10 = R.drawable.ic_native_banner_ad_dark;
                }
                imageView2.setImageResource(i10);
            }
        }
        Button button = (Button) adLayout.findViewById(R.id.ad_action_button);
        if (button != null) {
            if (D) {
                i11 = R.drawable.bg_native_banner_btn;
            } else {
                i11 = R.drawable.bg_native_banner_stroke_btn;
            }
            button.setBackgroundResource(i11);
            if (D) {
                i12 = R.color.white;
            } else {
                i12 = R.color.colorAccent;
            }
            button.setTextColor(androidx.core.content.a.getColor(context, i12));
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final void c(Context context, ADRequestList aDRequestList) {
        int i10;
        g.e(context, "context");
        Iterator<c> it = aDRequestList.iterator();
        while (it.hasNext()) {
            Bundle bundle = (Bundle) it.next().f32118b.c;
            String p10 = ea.a.p("UmQUYxtvC2MXc2twBnM_dC1vbg==", "LfuZz52x");
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
        return 1314000000L;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final boolean n() {
        return false;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final void o() {
        k.f17927a.getClass();
        String p10 = ea.a.p("Jm1QZxwyZ0QcQyVuA2UadHdhAG4gckV0G2k-ZzByd2YjdUV0HHIXcj9mOGUGaA==", "KipYiYUW");
        int i10 = zk.a.f32399a;
        t1.b(p10);
        EngineHelper.f15726a.getClass();
        FlutterAppApi flutterAppApi = EngineHelper.f15727b;
        if (flutterAppApi != null) {
            flutterAppApi.a(ea.a.p("PWVCdRRld2k3YS1lR1AsRnZvAHYgchFCO24WZRtBEGkiYVZlS1BzRhlvJHYQchxCVG4AZTdC", "MuxLZxil"));
        }
    }

    public final void r(Activity activity) {
        if (BillingConfigImpl.c.w()) {
            String d10 = h.d("premium user, skip ", i(), " load");
            int i10 = zk.a.f32399a;
            t1.b(d10);
            EngineHelper.f15726a.getClass();
            FlutterAppApi flutterAppApi = EngineHelper.f15727b;
            if (flutterAppApi != null) {
                flutterAppApi.c(i(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseImage2PDFConvertBanner$load$1
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
                flutterAppApi2.c(i(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseImage2PDFConvertBanner$load$2
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
            Context m10 = ReaderPdfApplication.m();
            g.d(m10, ea.a.p("VGU_SR1zFmEcY1EoKQ==", "0ZbRyoYW"));
            if (!c1.F(m10)) {
                String p10 = ea.a.p("PGtYcFlhUyA2bytk", "ZQGWmZ2k");
                int i11 = zk.a.f32399a;
                t1.b(p10);
                EngineHelper.f15726a.getClass();
                FlutterAppApi flutterAppApi3 = EngineHelper.f15727b;
                if (flutterAppApi3 != null) {
                    flutterAppApi3.c(i(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseImage2PDFConvertBanner$load$3
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
            this.f23998l = new a();
            ArrayList<c> d11 = he.a.d(activity, R.layout.ad_admob_native_banner, null, new yd.a(he.a.f18168d, 1), new ie.g(R.mipmap.ic_launcher), null, null, new ie.d(he.a.f18280t3), new ie.d(he.a.f18286u3), new ie.d(he.a.f18293v3), null, null, new ie.a(he.a.f18227l2), new b(he.a.f18162c0, he.a.f18190g0), null, null, new wk.g(he.a.f18184f1, he.a.f18212j1));
            ea.a.p("NmUYQxluGWU6dCRhWm4ychBhMXQgdl90loDXZSMsYlJ_bQVwG2EfLiFjOWxVdTljUGUgKQ==", "bMQlvor9");
            k(activity, d11);
        }
    }

    /* compiled from: Image2PDFConvertBanner.kt */
    /* loaded from: classes3.dex */
    public static final class a implements hl.a {
        @Override // hl.a
        public final void f1(BannerType type) {
            g.e(type, "type");
        }

        @Override // hl.a
        public final void d() {
        }

        @Override // hl.a
        public final void e() {
        }

        @Override // hl.a
        public final void f() {
        }
    }
}
