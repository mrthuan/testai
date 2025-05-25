package pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter;

import a6.h;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.google.ads.ADRequestList;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
import de.e;
import gl.n;
import ie.c;
import ie.f;
import ie.g;
import java.util.ArrayList;
import java.util.Iterator;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ads.standard.banner.BannerType;
import pdf.pdfreader.viewer.editor.free.feature.billing.BillingConfigImpl;
import pdf.pdfreader.viewer.editor.free.utils.AdUtils;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.t1;
import tf.d;
import zk.a;

/* compiled from: HomeListBanner.kt */
/* loaded from: classes3.dex */
public abstract class BaseHomeListBanner extends FlutterListBanner {
    public final void l(Activity activity) {
        boolean z10;
        int i10;
        int i11;
        if (BillingConfigImpl.c.w()) {
            String d10 = h.d("premium user, skip ", f(), " load");
            int i12 = a.f32399a;
            t1.b(d10);
            EngineHelper.f15726a.getClass();
            FlutterAppApi flutterAppApi = EngineHelper.f15727b;
            if (flutterAppApi != null) {
                flutterAppApi.c(f(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseHomeListBanner$load$1
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
                flutterAppApi2.c(f(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseHomeListBanner$load$2
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
            c1 c1Var = c1.f28564a;
            String p10 = ea.a.p("MA==", "p0RCqlQy");
            String h10 = e.h(ea.a.p("J29cZSZsXnMuXyRhAWkeZWpiD24rZRdfPncfdFFo", "IToEMv2G"), p10);
            if (android.support.v4.media.session.h.b("UG8lZhpn", "KgQM0j7P", h10) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                p10 = h10;
            }
            if (!TextUtils.equals(p10, ea.a.p("MQ==", "WlCkIjE3"))) {
                a(ea.a.p("QGsicFNhBiAeb1Vk", "HYvI02zw"));
                EngineHelper.f15726a.getClass();
                FlutterAppApi flutterAppApi3 = EngineHelper.f15727b;
                if (flutterAppApi3 != null) {
                    flutterAppApi3.c(f(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseHomeListBanner$load$3
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
                a(ea.a.p("B2UEdwZyXCAmbxIgVXY2aVRhMGwsLBZzH2kBID1vI2Q=", "cMipi7OP"));
                EngineHelper.f15726a.getClass();
                FlutterAppApi flutterAppApi4 = EngineHelper.f15727b;
                if (flutterAppApi4 != null) {
                    flutterAppApi4.c(f(), false, new cg.a<d>() { // from class: pdf.pdfreader.viewer.editor.free.ads.standard.banner.flutter.BaseHomeListBanner$load$4
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
                if (AdUtils.a(activity)) {
                    i10 = R.layout.ad_list_native_banner;
                } else {
                    i10 = R.layout.ad_list_bigger_native_banner;
                }
                ArrayList d11 = he.a.d(activity, i10, null, new yd.a(he.a.f18203i, 1), new g(R.mipmap.ic_launcher), new f(he.a.I3), new f(he.a.J3), null, null, null, new f(he.a.K3), new c(he.a.f18261q2), null, null, new w4.d(he.a.f18162c0, he.a.f18225l0), new w4.a(he.a.f18184f1, he.a.f18247o1), null);
                ea.a.p("VGU_TBpzFk4TdF12DEI3biplQCgnYzdphYCWRDosZlIdbSJwHmESLhtja2wIdThjLGVAKQ==", "g0jFMsQk");
                if (this.f24010j) {
                    a(ea.a.p("WGREcgZxRmU7dA9uUyx3c1NpIiAlb1dk", "Qy9dc33M"));
                    return;
                }
                ADRequestList aDRequestList = new ADRequestList(new FlutterListBanner$load$adRequestList$1(this));
                aDRequestList.addAll(d11);
                Iterator<yd.c> it = aDRequestList.iterator();
                while (it.hasNext()) {
                    Bundle bundle = (Bundle) it.next().f32118b.c;
                    String p11 = ea.a.p("LmRuYxFvXmM_cxVwGnMBdFxvbg==", "ZCpwUQgr");
                    if (a0.i(activity)) {
                        i11 = 3;
                    } else {
                        i11 = 2;
                    }
                    bundle.putInt(p11, i11);
                }
                ((Handler) this.f24004d.getValue()).removeCallbacks(this.f24014n);
                this.f24006f = 0L;
                this.f24005e = 0L;
                this.c = BannerType.None;
                this.f24015o = null;
                this.f24009i = false;
                this.f24010j = true;
                zd.a aVar = new zd.a();
                this.f24002a = aVar;
                a(ea.a.p("X28qZFNhZA==", "wsPsNWG0"));
                aVar.e(activity, aDRequestList);
                for (n nVar : e()) {
                    nVar.h();
                }
            }
        }
    }
}
