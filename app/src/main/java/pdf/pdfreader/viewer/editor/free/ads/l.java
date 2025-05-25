package pdf.pdfreader.viewer.editor.free.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.ads.ADRequestList;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
import java.util.ArrayList;
import java.util.Random;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ads.a;
import pdf.pdfreader.viewer.editor.free.ads.standard.FullAdType;
import pdf.pdfreader.viewer.editor.free.ui.vm.AppViewModel;
import pdf.pdfreader.viewer.editor.free.utils.d1;

/* compiled from: SplashFullAds.java */
/* loaded from: classes3.dex */
public final class l extends pdf.pdfreader.viewer.editor.free.ads.a {

    /* renamed from: k  reason: collision with root package name */
    public static l f23966k;

    /* renamed from: i  reason: collision with root package name */
    public String f23967i;

    /* renamed from: j  reason: collision with root package name */
    public a.d f23968j;

    /* compiled from: SplashFullAds.java */
    /* loaded from: classes3.dex */
    public class a implements ae.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f23969a;

        public a(Activity activity) {
            this.f23969a = activity;
        }

        @Override // ae.c
        public final void b(Context context, yd.d dVar) {
            String p10 = ea.a.p("IG5wZDpsXmNr", "gAByPOsc");
            l lVar = l.this;
            lVar.a(p10);
            lVar.f23924h = InterstitialAdState.CLOSE;
            FullAdType fullAdType = FullAdType.Interstitial;
            lVar.getClass();
            a.d dVar2 = lVar.f23921e;
            if (dVar2 != null) {
                dVar2.d();
            }
            a.d dVar3 = lVar.f23968j;
            if (dVar3 != null) {
                dVar3.d();
            }
            AppOpenManager.c().f23907g = false;
        }

        @Override // ae.c
        public final void c(yd.a aVar) {
            l lVar = l.this;
            lVar.a(ea.a.p("XG4KZD9vA2Q0YV1sDGQg", "lH62ov53") + aVar);
            lVar.f23924h = InterstitialAdState.FAIL;
            FullAdType fullAdType = FullAdType.Interstitial;
            a.d dVar = lVar.f23921e;
            if (dVar != null) {
                dVar.a0();
            }
            a.d dVar2 = lVar.f23968j;
            if (dVar2 != null) {
                dVar2.a0();
            }
            lVar.b(this.f23969a);
            lVar.i(false);
        }

        @Override // ae.b
        public final void e(yd.d dVar) {
            String p10 = ea.a.p("XG4KZD9vA2Q=", "Fd35rfAG");
            l lVar = l.this;
            lVar.a(p10);
            lVar.f23920d = System.currentTimeMillis();
            lVar.f23924h = InterstitialAdState.SUCCESS;
            String p11 = ea.a.p("SQ==", "qdRLswQv");
            String str = dVar.f32120b;
            if (TextUtils.equals(str, p11)) {
                FullAdType fullAdType = FullAdType.Interstitial;
            } else if (TextUtils.equals(str, ea.a.p("Tw==", "ExYYNv0p"))) {
                FullAdType fullAdType2 = FullAdType.Interstitial;
            } else {
                FullAdType fullAdType3 = FullAdType.Interstitial;
            }
            a.d dVar2 = lVar.f23921e;
            if (dVar2 != null) {
                dVar2.J();
            }
            a.d dVar3 = lVar.f23968j;
            if (dVar3 != null) {
                dVar3.J();
            }
            lVar.i(true);
        }

        @Override // ae.b
        public final void onAdClosed() {
            String p10 = ea.a.p("Om4vZBNsH3MtZA==", "MHUnPpdz");
            l lVar = l.this;
            lVar.a(p10);
            lVar.f23924h = InterstitialAdState.CLOSE;
            FullAdType fullAdType = FullAdType.Interstitial;
            a.d dVar = lVar.f23921e;
            if (dVar != null) {
                dVar.close();
            }
            a.d dVar2 = lVar.f23968j;
            if (dVar2 != null) {
                dVar2.close();
            }
            lVar.b(this.f23969a);
            EngineHelper.f15726a.getClass();
            FlutterAppApi flutterAppApi = EngineHelper.f15727b;
            if (flutterAppApi != null) {
                flutterAppApi.b(ea.a.p("FHAoYRhoB2kmdANyR3Q-dFFhPl8iZXk=", "yrgDkXHe"), new yk.c());
            }
            AppViewModel k10 = ReaderPdfApplication.k();
            k10.f28154k.j(Boolean.TRUE);
        }
    }

    static {
        ea.a.p("PHBdYQpoaGk0dC9yBnQBdFxhAl8uZXk=", "QgpMukQk");
    }

    public l() {
        FullAdType fullAdType = FullAdType.Interstitial;
        this.f23922f = 0;
    }

    public static synchronized l m() {
        l lVar;
        synchronized (l.class) {
            if (f23966k == null) {
                f23966k = new l();
            }
            lVar = f23966k;
        }
        return lVar;
    }

    @Override // pdf.pdfreader.viewer.editor.free.ads.a
    public final ADRequestList c(Activity context) {
        ArrayList b10;
        String str;
        ADRequestList aDRequestList = new ADRequestList(new a(context));
        boolean z10 = wn.b.f31389e;
        if (z10) {
            a(ea.a.p("XWU8IAZzB3I=", "a7yDPpRp"));
        } else {
            a(ea.a.p("XGwvIAZzB3I=", "7q5aw2PX"));
        }
        if (TextUtils.isEmpty(this.f23967i)) {
            String str2 = bp.b.f5499a;
            kotlin.jvm.internal.g.e(context, "context");
            if (TextUtils.isEmpty(bp.b.f5499a)) {
                String str3 = bp.b.f5500b;
                String str4 = "";
                String h10 = de.e.h(str3, "");
                bp.b.f5499a = h10;
                if (TextUtils.isEmpty(h10)) {
                    SharedPreferences sharedPreferences = d1.b(context).f28619a;
                    if (sharedPreferences != null) {
                        str4 = sharedPreferences.getString(str3, "");
                    }
                    bp.b.f5499a = str4;
                    if (TextUtils.isEmpty(str4)) {
                        if (new Random().nextInt(2) == 0) {
                            str = bp.b.c;
                        } else {
                            str = bp.b.f5501d;
                        }
                        SharedPreferences sharedPreferences2 = d1.b(context).f28619a;
                        if (sharedPreferences2 != null) {
                            sharedPreferences2.edit().putString(str3, str).apply();
                        }
                        bp.b.f5499a = str;
                    }
                    ea.a.p("YWUmbwdlIW8cZl1nIWU6cCFy", "UmFDki0z");
                } else {
                    ea.a.p("ZWUpbwFlGm8mZg9nfGU7cF1y", "sV7DuYix");
                }
            }
            String str5 = bp.b.f5499a;
            kotlin.jvm.internal.g.b(str5);
            this.f23967i = str5;
        }
        String str6 = he.a.f18184f1;
        String str7 = he.a.f18162c0;
        if (z10) {
            b10 = he.a.b(context, new yd.a(he.a.Z, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.Q5), new ie.e(he.a.R5), new ie.e(he.a.S5), new ie.b(he.a.f18306x2), new w4.c(str7, he.a.f18271s0), new a2.a(str6, he.a.f18291v1));
        } else {
            b10 = he.a.b(context, new yd.a(he.a.Y, 1), new ie.g(R.mipmap.ic_launcher), new ie.e(he.a.T5), new ie.e(he.a.U5), new ie.e(he.a.V5), new ie.b(he.a.f18299w2), new w4.c(str7, he.a.f18265r0), new a2.a(str6, he.a.f18284u1));
        }
        aDRequestList.addAll(b10);
        a(ea.a.p("P2xQbiA=", "Vvyx3JEy") + this.f23967i);
        return aDRequestList;
    }
}
