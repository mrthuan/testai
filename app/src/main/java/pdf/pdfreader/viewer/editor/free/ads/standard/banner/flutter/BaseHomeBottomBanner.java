package pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter;

import a6.h;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.activity.s;
import com.google.ads.ADRequestList;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
import de.e;
import gl.b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Result;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import tf.d;
import yd.c;

/* compiled from: HomeBottomBanner.kt */
/* loaded from: classes3.dex */
public abstract class BaseHomeBottomBanner extends FlutterBanner {
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
            String p10 = ea.a.p("UmQUYxtvC2MXc2twBnM_dC1vbg==", "uv8qf1Sy");
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
        g.d(ReaderPdfApplication.m(), ea.a.p("KGVFSRdzQ2E0Yy8oKQ==", "RBjpGXmK"));
        String h10 = e.h(c1.K, "");
        if (h10 != null && h10.length() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            ea.a.p("VW8idA1tC2IpbghlRl8lZV5yN3MhX19uAGUDdjBsHTEDOXZjDW4yaS8gD3MUZDJmWXU-dGk2BnM=", "MO7VbT2j");
        } else {
            try {
                g.d(h10, ea.a.p("LG9fZhBn", "AtbpxnCy"));
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
        b.f17914a.getClass();
        b.b();
    }

    public final void r(Activity activity) {
        if (BillingConfigImpl.c.w()) {
            String d10 = h.d("premium user, skip ", i(), " load");
            int i10 = zk.a.f32399a;
            t1.b(d10);
            EngineHelper.f15726a.getClass();
            FlutterAppApi flutterAppApi = EngineHelper.f15727b;
            if (flutterAppApi != null) {
                flutterAppApi.c(i(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseHomeBottomBanner$load$1
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
                flutterAppApi2.c(i(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseHomeBottomBanner$load$2
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
            g.d(m10, ea.a.p("KGVFSRdzQ2E0Yy8oKQ==", "B34h4vBo"));
            if (!c1.H(m10)) {
                String p10 = ea.a.p("QGsicFNhBiAeb1Vk", "RdKsPlka");
                int i11 = zk.a.f32399a;
                t1.b(p10);
                EngineHelper.f15726a.getClass();
                FlutterAppApi flutterAppApi3 = EngineHelper.f15727b;
                if (flutterAppApi3 != null) {
                    flutterAppApi3.c(i(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseHomeBottomBanner$load$3
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
            ArrayList<c> d11 = he.a.d(activity, R.layout.ad_admob_native_banner, null, new yd.a(he.a.f18146a, 1), new ie.g(R.mipmap.ic_launcher), null, null, new ie.d(he.a.f18221k3), new ie.d(he.a.f18228l3), new ie.d(he.a.f18235m3), null, null, new ie.a(he.a.f18206i2), new w4.b(he.a.f18162c0, he.a.f18169d0), null, null, new wk.g(he.a.f18184f1, he.a.f18191g1));
            ea.a.p("KGVFTRhpWUI7biRlBygJY0FpGGkxeUkgiIDAZSYsElJhbVhwFGFHLjNjFWwUdQZjXWUcKQ==", "lMudjfT2");
            k(activity, d11);
        }
    }

    /* compiled from: HomeBottomBanner.kt */
    /* loaded from: classes3.dex */
    public static final class a implements hl.a {
        @Override // hl.a
        public final void e() {
            boolean z10;
            if (o9.d.c.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                tn.a.b(ReaderPdfApplication.m(), ea.a.p("LWVUdV5fMF8qXwRhWm4ycg==", "8MI69X7k"), "call_flutter_show_".concat(o9.d.f22759b));
                tn.a.b(ReaderPdfApplication.m(), ea.a.p("V2UpdRRfCl8QX1ZhB24zcg==", "312d2kCS"), ea.a.p("LGFdbCZmW3UudC9yKnMAb0JfGm8xYWw=", "kWssYCkG"));
            }
        }

        @Override // hl.a
        public final void f() {
            o9.d.f22759b = "";
        }

        @Override // hl.a
        public final void f1(BannerType type) {
            boolean z10;
            g.e(type, "type");
            if (o9.d.c.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                tn.a.b(ReaderPdfApplication.m(), ea.a.p("V2UpdRRfCl8QX1ZhB24zcg==", "N5Zrq6Lu"), "show_".concat(o9.d.f22759b));
                tn.a.b(ReaderPdfApplication.m(), ea.a.p("K2VTdR5fX184XyhhG24Ncg==", "AJgOJYnb"), ea.a.p("QGgkdyx0DXQTbA==", "tcDHJ3y5"));
                o9.d.c = "";
                o9.d.f22759b = "";
            }
            tn.a.d(ReaderPdfApplication.m(), ea.a.p("LmRZbxRlaGI7biRlcg==", "LmWhl1ZY"), ea.a.p("BmQ8aCJtU187aAl3", "49gcM6gD"), fl.a.a(type), false);
        }

        @Override // hl.a
        public final void d() {
        }
    }
}
