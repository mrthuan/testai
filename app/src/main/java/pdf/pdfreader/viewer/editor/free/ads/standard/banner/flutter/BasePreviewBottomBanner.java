package pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter;

import a6.h;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.activity.f;
import com.google.ads.ADRequestList;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
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
import wn.b;
import yd.c;

/* compiled from: PreviewBottomBanner.kt */
/* loaded from: classes3.dex */
public abstract class BasePreviewBottomBanner extends FlutterBanner {

    /* renamed from: o  reason: collision with root package name */
    public String f23986o = "";

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
            String p10 = ea.a.p("UmQUYxtvC2MXc2twBnM_dC1vbg==", "RnZc7s0k");
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
        Context m10 = ReaderPdfApplication.m();
        g.d(m10, ea.a.p("VGU_SR1zFmEcY1EoKQ==", "ISgOZVcR"));
        return c1.O(m10);
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    public final boolean n() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    @Override // pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.FlutterBanner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            r5 = this;
            java.util.Stack<android.app.Activity> r0 = pdf.pdfreader.viewer.editor.free.ReaderPdfApplication.f23858j
            if (r0 == 0) goto L2c
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            goto L2c
        Lb:
            int r1 = r0.size()
        Lf:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L2c
            java.lang.Object r2 = r0.get(r1)
            android.app.Activity r2 = (android.app.Activity) r2
            java.lang.Class r3 = r2.getClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = r2.getPackageName()
            boolean r3 = r3.startsWith(r4)
            if (r3 == 0) goto Lf
            goto L2d
        L2c:
            r2 = 0
        L2d:
            if (r2 != 0) goto L30
            return
        L30:
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            r1 = 1
            if (r0 != r1) goto L64
            gl.o r0 = gl.o.f17931a
            r0.getClass()
            java.lang.String r0 = "Q3IudhplFUIddEBvBEI3biplQCAycipnJGURIABsPHRHZTkgAWUEchdzaA=="
            java.lang.String r1 = "CcfIfdd5"
            java.lang.String r0 = ea.a.p(r0, r1)
            int r1 = zk.a.f32399a
            pdf.pdfreader.viewer.editor.free.utils.t1.b(r0)
            com.lib.flutter.encrypt.EngineHelper r0 = com.lib.flutter.encrypt.EngineHelper.f15726a
            r0.getClass()
            com.lib.flutter.encrypt.FlutterAppApi r0 = com.lib.flutter.encrypt.EngineHelper.f15727b
            if (r0 == 0) goto L94
            java.lang.String r1 = "PWVCdRRld3AoZTxpEHcqb0F0AW0HYQtuHHIRfBNyLHYmZUZCFnRDbzdCK24bZRpC"
            java.lang.String r2 = "OeCjyPcI"
            java.lang.String r1 = ea.a.p(r1, r2)
            r0.a(r1)
            goto L94
        L64:
            java.lang.String r0 = "PXI8dgBlP0IndBJvWUI2blZlICxpc11pBCADZTdyJ3MlIDBuSWwpbixzBWFEZQ=="
            java.lang.String r1 = "LcMYiH1G"
            java.lang.String r0 = ea.a.p(r0, r1)
            int r1 = zk.a.f32399a
            pdf.pdfreader.viewer.editor.free.utils.t1.b(r0)
            gl.o r0 = gl.o.f17931a
            r0.getClass()
            gl.p r0 = gl.p.f17933p
            boolean r1 = r0.f23994h
            if (r1 != 0) goto L85
            pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType r1 = r0.c
            pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType r2 = pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType.None
            if (r1 == r2) goto L85
            r0.q()
        L85:
            gl.q r0 = gl.q.f17934p
            boolean r1 = r0.f23994h
            if (r1 != 0) goto L94
            pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType r1 = r0.c
            pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType r2 = pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType.None
            if (r1 == r2) goto L94
            r0.q()
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BasePreviewBottomBanner.o():void");
    }

    public final void r(Activity activity) {
        ArrayList<c> d10;
        if (BillingConfigImpl.c.w()) {
            String d11 = h.d("premium user, skip ", i(), " load");
            int i10 = zk.a.f32399a;
            t1.b(d11);
            EngineHelper.f15726a.getClass();
            FlutterAppApi flutterAppApi = EngineHelper.f15727b;
            if (flutterAppApi != null) {
                flutterAppApi.c(i(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BasePreviewBottomBanner$load$1
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
                flutterAppApi2.c(i(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BasePreviewBottomBanner$load$2
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
            g.d(m10, ea.a.p("KGVFSRdzQ2E0Yy8oKQ==", "er6Tc4VQ"));
            if (!c1.I(m10)) {
                String p10 = ea.a.p("QGsicFNhBiAeb1Vk", "XhT9Tpc5");
                int i11 = zk.a.f32399a;
                t1.b(p10);
                EngineHelper.f15726a.getClass();
                FlutterAppApi flutterAppApi3 = EngineHelper.f15727b;
                if (flutterAppApi3 != null) {
                    flutterAppApi3.c(i(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BasePreviewBottomBanner$load$3
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
            boolean z10 = b.f31389e;
            String str = he.a.f18184f1;
            String str2 = he.a.f18162c0;
            if (z10) {
                d10 = he.a.d(activity, R.layout.ad_admob_native_banner, null, new yd.a(he.a.c, 1), new ie.g(R.mipmap.ic_launcher), null, null, new ie.d(he.a.f18262q3), new ie.d(he.a.f18268r3), new ie.d(he.a.f18274s3), null, null, new ie.a(he.a.f18220k2), new w4.b(str2, he.a.f18183f0), null, null, new wk.g(str, he.a.f18205i1));
            } else {
                d10 = he.a.d(activity, R.layout.ad_admob_native_banner, null, new yd.a(he.a.f18154b, 1), new ie.g(R.mipmap.ic_launcher), null, null, new ie.d(he.a.f18242n3), new ie.d(he.a.f18249o3), new ie.d(he.a.f18256p3), null, null, new ie.a(he.a.f18213j2), new w4.b(str2, he.a.f18176e0), null, null, new wk.g(str, he.a.f18198h1));
            }
            ea.a.p("VGU_UAFlFGkXd3ZhB24zcmxhUXQvdip0lIDzZnRsOmJSbA9hB2FMaQFBRHAnZSFVN2VAKQ==", "vU3UV0e3");
            k(activity, d10);
        }
    }

    /* compiled from: PreviewBottomBanner.kt */
    /* loaded from: classes3.dex */
    public static final class a implements hl.a {
        public a() {
        }

        @Override // hl.a
        public final void f1(BannerType type) {
            g.e(type, "type");
            tn.a.d(ReaderPdfApplication.m(), ea.a.p("LmRHaRx3aGI7biRlcg==", "32GZ13ET"), ea.a.p("MWQxdl9lTl87aAl3", "B7Pn69bR"), f.m(BasePreviewBottomBanner.this.f23986o, "_", fl.a.a(type)), false);
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
