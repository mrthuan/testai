package pdf.pdfreader.viewer.editor.free.ads;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import be.c;
import com.google.ads.ADRequestList;
import com.lib.flutter.encrypt.EngineHelper;
import com.lib.flutter.encrypt.FlutterAppApi;
import pdf.pdfreader.viewer.editor.free.fnbridge.FlutterEncryptConfig;
import pdf.pdfreader.viewer.editor.free.ui.dialog.k2;
import pdf.pdfreader.viewer.editor.free.ui.dialog.w;
import pdf.pdfreader.viewer.editor.free.utils.c1;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.t1;

/* compiled from: BaseFullAds.java */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public zd.c f23918a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f23919b;
    public long c;

    /* renamed from: d  reason: collision with root package name */
    public long f23920d;

    /* renamed from: e  reason: collision with root package name */
    public d f23921e;

    /* renamed from: f  reason: collision with root package name */
    public int f23922f;

    /* renamed from: g  reason: collision with root package name */
    public k2 f23923g;

    /* renamed from: h  reason: collision with root package name */
    public InterstitialAdState f23924h = InterstitialAdState.DEFAULT;

    /* compiled from: BaseFullAds.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Long f23925a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e f23926b;

        public b(Long l10, e eVar) {
            this.f23925a = l10;
            this.f23926b = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            aVar.a(ea.a.p("X28qZBpuBSAWaVVsBmd2ZC1zX2k1c28gEXM9ZDNpHWU9", "dXgph0lj") + (System.currentTimeMillis() - this.f23925a.longValue()));
            e eVar = this.f23926b;
            if (eVar != null) {
                eVar.d(aVar.f23923g);
            }
        }
    }

    /* compiled from: BaseFullAds.java */
    /* loaded from: classes3.dex */
    public class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c.a f23927a;

        public c(c.a aVar) {
            this.f23927a = aVar;
        }

        @Override // be.c.a
        public final void a(boolean z10) {
            char c;
            a aVar = a.this;
            if (z10) {
                tf.c cVar = FullScreenManage.f23914a;
                aVar.getClass();
                if (aVar instanceof f) {
                    c = 2;
                } else if (aVar instanceof g) {
                    c = 3;
                } else if (aVar instanceof pdf.pdfreader.viewer.editor.free.ads.d) {
                    c = 4;
                } else if (aVar instanceof pdf.pdfreader.viewer.editor.free.ads.e) {
                    c = 5;
                } else if (aVar instanceof l) {
                    c = 1;
                } else {
                    c = 0;
                }
                if (c == 1) {
                    pdf.pdfreader.viewer.editor.free.utils.c cVar2 = (pdf.pdfreader.viewer.editor.free.utils.c) FullScreenManage.f23914a.getValue();
                    androidx.appcompat.view.menu.d.h("A2FEdCdzNGwpcw5fR2g4d2dmJ2wlX1dkK3QYbWU=", "bwo7xDR6", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), System.currentTimeMillis());
                } else {
                    pdf.pdfreader.viewer.editor.free.utils.c cVar3 = (pdf.pdfreader.viewer.editor.free.utils.c) FullScreenManage.f23914a.getValue();
                    androidx.appcompat.view.menu.d.h("I2FCdCZzX28tXyx1GWw3YVFfGmkoZQ==", "jl4cui8Q", pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit(), System.currentTimeMillis());
                }
                aVar.a(ea.a.p("QGgkd1NzF2MRZUdz", "PUsihg15"));
            } else {
                aVar.f23924h = InterstitialAdState.DEFAULT;
                aVar.a(ea.a.p("QGgkd1NmA2keZWQ=", "8e800plR"));
            }
            c.a aVar2 = this.f23927a;
            if (aVar2 != null) {
                aVar2.a(z10);
            }
            aVar.getClass();
            if (aVar instanceof l) {
                EngineHelper.f15726a.getClass();
                FlutterAppApi flutterAppApi = EngineHelper.f15727b;
                if (flutterAppApi != null) {
                    flutterAppApi.d(ea.a.p("NXBVYUtoMWkmdANyR3Q-dFFhPl8iZXk=", "JhF98nM2"), z10, new yk.c());
                }
            }
            k2 k2Var = aVar.f23923g;
            if (k2Var != null && k2Var.isShowing()) {
                aVar.f23923g.dismiss();
            }
            aVar.f23920d = 0L;
        }
    }

    /* compiled from: BaseFullAds.java */
    /* loaded from: classes3.dex */
    public interface d {
        void J();

        void a0();

        void close();

        void d();

        void w(boolean z10);
    }

    /* compiled from: BaseFullAds.java */
    /* loaded from: classes3.dex */
    public interface e {
        void d(Dialog dialog);
    }

    public static w l(Activity context, e eVar) {
        w wVar = new w(context);
        wVar.setOnDismissListener(new pdf.pdfreader.viewer.editor.free.ads.b());
        wVar.show();
        c1 c1Var = c1.f28564a;
        kotlin.jvm.internal.g.e(context, "context");
        Long l10 = n0.f28730e;
        kotlin.jvm.internal.g.d(l10, ea.a.p("f08KRDpOJV8kSXFXNkQTTAVZUw==", "wVGxpq0x"));
        long longValue = l10.longValue();
        String h10 = de.e.h(c1.f28595q, "");
        if (!TextUtils.isEmpty(h10) && TextUtils.isDigitsOnly(h10)) {
            try {
                kotlin.jvm.internal.g.d(h10, ea.a.p("X28qZBpuBUQXbFV5cw==", "UhF5x7MZ"));
                longValue = Long.parseLong(h10);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        new Handler(Looper.getMainLooper()).postDelayed(new pdf.pdfreader.viewer.editor.free.ads.c(eVar, wVar), longValue);
        return wVar;
    }

    public final void a(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (this instanceof f) {
            str2 = ea.a.p("JnRUbTpsXmMxRj9sGUFk", "d1DOnZDl");
        } else if (this instanceof g) {
            str2 = ea.a.p("FHITdi1lNkY9bApBZA==", "OKdvDAkH");
        } else if (this instanceof l) {
            str2 = ea.a.p("PHBdYQpocXU2bAtk", "8kBcMGZz");
        } else if (this instanceof pdf.pdfreader.viewer.editor.free.ads.d) {
            str2 = ea.a.p("B28BdiFyJUY9bApBZA==", "U9doDQIi");
        } else if (this instanceof pdf.pdfreader.viewer.editor.free.ads.e) {
            str2 = ea.a.p("VHUiZBZGF2weQWQ=", "5c2zJPXY");
        } else {
            str2 = "";
        }
        String o10 = androidx.activity.f.o(sb2, str2, " ", str);
        int i10 = zk.a.f32399a;
        t1.b(o10);
    }

    public final void b(Activity activity) {
        if (this.f23918a != null) {
            a(ea.a.p("V2U4dAFvGyATZA==", "feUF2IO5"));
            zd.c cVar = this.f23918a;
            be.c cVar2 = cVar.f32357e;
            if (cVar2 != null) {
                cVar2.a(activity);
            }
            cVar.f32358f = null;
            cVar.f32359g = null;
            this.f23918a = null;
        }
    }

    public abstract ADRequestList c(Activity activity);

    public final boolean d(Activity context) {
        boolean z10;
        zd.c cVar = this.f23918a;
        if (cVar != null) {
            be.c cVar2 = cVar.f32357e;
            if (cVar2 != null) {
                z10 = cVar2.k();
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f23920d != 0) {
                    c1 c1Var = c1.f28564a;
                    kotlin.jvm.internal.g.e(context, "context");
                    if (System.currentTimeMillis() - this.f23920d > de.e.d(context, null, ea.a.p("UmQUbBxhBl8XeERpG2UyXzBpX2U=", "vuR0fiyI"), 30) * 60 * 1000) {
                        a(ea.a.p("WGQZZSFwW3ItZA==", "vc99Y2Ii"));
                        b(context);
                        return false;
                    }
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        if (this.f23924h == InterstitialAdState.LOADING) {
            return true;
        }
        return false;
    }

    public final boolean f(Context context) {
        if (this.c != 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.c;
            c1 c1Var = c1.f28564a;
            kotlin.jvm.internal.g.e(context, "context");
            if (currentTimeMillis > de.e.d(context, null, ea.a.p("LmRuchxxQmUpdBVlDXABclBkMXQsbWU=", "uUwv2bPu"), 30) * 60 * 1000) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        if (this.f23924h == InterstitialAdState.SHOWING) {
            return true;
        }
        return false;
    }

    public final void h(Activity activity) {
        if (d(activity)) {
            a(ea.a.p("W2E4IBJkTiABa11wSWw5YWQ=", "274aAR7L"));
            i(true);
            return;
        }
        if (this.f23919b) {
            b(activity);
            this.f23919b = false;
        }
        if (f(activity)) {
            b(activity);
        }
        if (this.f23918a != null) {
            a(ea.a.p("UmRrchZxF2UBdF1uDix2cy9pQiAqbyJk", "Em35zN6h"));
        } else if (activity == null) {
            i(false);
        } else {
            this.f23924h = InterstitialAdState.LOADING;
            this.f23918a = new zd.c();
            a(ea.a.p("I29QZFlhUyAuaCNyESA=", "UBiTDYlx") + FlutterEncryptConfig.c);
            this.f23918a.e(activity, c(activity), false);
            this.c = System.currentTimeMillis();
        }
    }

    public final void i(boolean z10) {
        if (this instanceof l) {
            EngineHelper.f15726a.getClass();
            FlutterAppApi flutterAppApi = EngineHelper.f15727b;
            if (flutterAppApi != null) {
                flutterAppApi.c(ea.a.p("PHBdYQpoaGk0dC9yBnQBdFxhAl8uZXk=", "Uv1fcNit"), z10, new yk.c());
            }
        }
    }

    public final void j(Activity activity, c.a aVar) {
        if (d(activity)) {
            if (this.f23918a != null) {
                this.f23919b = true;
                this.f23924h = InterstitialAdState.SHOWING;
                if (!(this instanceof l)) {
                    a(ea.a.p("OmkZYy4gX2E7dEZmQWw7IFlkcnMhb0EgAGkcZSA=", "F7IwK3Pf") + (((float) (System.currentTimeMillis() - pdf.pdfreader.viewer.editor.free.utils.c.c())) / 1000.0f) + ea.a.p("cw==", "xyYksSVP"));
                }
                zd.c cVar = this.f23918a;
                c cVar2 = new c(aVar);
                be.c cVar3 = cVar.f32357e;
                if (cVar3 != null && cVar3.k()) {
                    cVar.f32357e.getClass();
                    cVar.f32357e.l(activity, cVar2);
                    return;
                }
                cVar2.a(false);
                return;
            }
            return;
        }
        a(ea.a.p("PGhed1lmVmk2ZS4gG28cIFB4B3MxIARk", "WohO6i2h"));
        aVar.a(false);
    }

    public final void k(Activity context, e eVar) {
        boolean equals;
        int i10 = this.f23922f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            equals = false;
                        } else {
                            equals = c1.j(context);
                        }
                    } else {
                        c1 c1Var = c1.f28564a;
                        kotlin.jvm.internal.g.e(context, "context");
                        String p10 = ea.a.p("SmVz", "uacs5NEW");
                        String h10 = de.e.h(c1.f28587m, ea.a.p("XW8=", "qPRGYS4O"));
                        if (TextUtils.isEmpty(h10)) {
                            h10 = ea.a.p("HG8=", "Jkrq9yET");
                        }
                        equals = TextUtils.equals(p10, h10);
                    }
                } else {
                    c1 c1Var2 = c1.f28564a;
                    kotlin.jvm.internal.g.e(context, "context");
                    String p11 = ea.a.p("NmVz", "VBsQDwme");
                    String h11 = de.e.h(c1.f28585l, ea.a.p("WW8=", "BO79CLIz"));
                    if (TextUtils.isEmpty(h11)) {
                        h11 = ea.a.p("WW8=", "Zq7c3br2");
                    }
                    equals = TextUtils.equals(p11, h11);
                }
            } else {
                c1 c1Var3 = c1.f28564a;
                kotlin.jvm.internal.g.e(context, "context");
                String p12 = ea.a.p("NmVz", "XJxRm1RO");
                String h12 = de.e.h(c1.f28583k, ea.a.p("IW8=", "XfufJUFv"));
                if (TextUtils.isEmpty(h12)) {
                    h12 = ea.a.p("IW8=", "MXRZxVMe");
                }
                equals = TextUtils.equals(p12, h12);
            }
        } else {
            c1 c1Var4 = c1.f28564a;
            kotlin.jvm.internal.g.e(context, "context");
            String p13 = ea.a.p("NmVz", "rvkVlBOz");
            String h13 = de.e.h(c1.f28581j, ea.a.p("OW8=", "tQW6lIgH"));
            if (TextUtils.isEmpty(h13)) {
                h13 = ea.a.p("XW8=", "rs3qwcOU");
            }
            equals = TextUtils.equals(p13, h13);
        }
        Long l10 = n0.f28729d;
        long longValue = l10.longValue();
        k2 k2Var = new k2(context);
        this.f23923g = k2Var;
        if (equals) {
            k2Var.setOnDismissListener(new DialogInterface$OnDismissListenerC0329a());
            this.f23923g.show();
            c1 c1Var5 = c1.f28564a;
            kotlin.jvm.internal.g.e(context, "context");
            ea.a.p("f08KRDpOJV8zRGdfLVUEQRBJfU4=", "yq0j651z");
            long longValue2 = l10.longValue();
            String h14 = de.e.h(c1.f28593p, "");
            if (!TextUtils.isEmpty(h14) && TextUtils.isDigitsOnly(h14)) {
                try {
                    kotlin.jvm.internal.g.d(h14, ea.a.p("Wm4_ZQF2A2whdHI=", "i5vaAO9q"));
                    longValue2 = Long.parseLong(h14);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            longValue = longValue2;
        }
        Long valueOf = Long.valueOf(System.currentTimeMillis());
        Handler handler = new Handler(Looper.getMainLooper());
        b bVar = new b(valueOf, eVar);
        if (!equals) {
            longValue = 0;
        }
        handler.postDelayed(bVar, longValue);
    }

    /* compiled from: BaseFullAds.java */
    /* renamed from: pdf.pdfreader.viewer.editor.free.ads.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class DialogInterface$OnDismissListenerC0329a implements DialogInterface.OnDismissListener {
        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
        }
    }
}
