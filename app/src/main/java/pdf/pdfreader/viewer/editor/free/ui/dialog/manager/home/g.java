package pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home;

import android.content.Context;
import android.content.SharedPreferences;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.utils.i1;
import pdf.pdfreader.viewer.editor.free.utils.q0;

/* compiled from: RateDialogChain.kt */
/* loaded from: classes3.dex */
public final class g extends po.a {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f27691d = 0;
    public pdf.pdfreader.viewer.editor.free.ui.dialog.c c;

    @Override // po.a
    public final boolean b() {
        return true;
    }

    @Override // po.a
    public final boolean c(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        if (!q0.e(context) && q0.f(ReaderPdfApplication.m(), "has_permission_preview_pdf", false) && pdf.pdfreader.viewer.editor.free.utils.extension.c.g(context)) {
            long e10 = eo.e.e(context);
            if (!eo.e.l(context) && !i1.a(e10)) {
                pdf.pdfreader.viewer.editor.free.ui.dialog.c cVar = new pdf.pdfreader.viewer.editor.free.ui.dialog.c(context);
                this.c = cVar;
                cVar.f27509z = new a1.e(this, 14);
                cVar.show();
                return true;
            }
        }
        boolean z10 = eo.d.f16828a;
        ea.a.p("PGhedzpoUmMxUit0EFU7OiA=", "F8O1B42E");
        if (!pdf.pdfreader.viewer.editor.free.utils.extension.c.g(context)) {
            return false;
        }
        if (eo.e.l(context)) {
            ea.a.p("qreD58KP36_e5PG3nb_v5I2Ni4bI5eK6DCA=", "LUEE6Kfb");
            return false;
        } else if (eo.e.h(context) > 3) {
            ea.a.p("2q_p5tafsofy5vulAOb7ody43-XPjdOHzjog", "qb2mNWgd");
            return false;
        } else if (i1.a(eo.e.e(context))) {
            ea.a.p("QGgkdzBoB2MZUlV0DFUFOmTmqq-hm_vlpYyjmuvkzoDWpOLl15qErKE=", "5Dovudb9");
            if (eo.e.k(context) == 2) {
                ea.a.p("s5Dn5IGAjKTh6Ni-0Yjn5Zyatrjj5quhkLvH5da6pZrS6MSd1rzl5fO2jr-r5d-w3pjc5e2pDObBj5mn2SA=", "9ZVk9izG");
                eo.e.w(context, Boolean.TRUE);
            }
            if (eo.e.j(context) == 1) {
                ea.a.p("1pDH5MuAh6Tb6Iq-jIjm5eCa1rjs5t6hkbuD5dK63pq36OSdnLzu5cm23L_25d6wopi85eKpeeX9htG6_iA=", "u5U9THmt");
                eo.e.v(context, Boolean.TRUE);
            }
            if (eo.e.c(context) == 2) {
                ea.a.p("1pDH5MuAh6Tb6Iq-jIjm5eCa1rjs5t6hhbv05e-605q36OSdnLzu5cm23L_25d6wopi85eKpeefdlqq--eSLndat0yA=", "aBh4oUkg");
                eo.e.a(context, Boolean.TRUE);
            }
            if (eo.e.g(context) != 5) {
                return false;
            }
            ea.a.p("v5Dk5PWApKTh6Ni-0Yjn5Zyatrjj5quhkLvH5da6pZre6MedorzN5fO2jr-r5d-w3pjc5e2pDOb9k5S80WEycLysyebYsHQg", "U7ZhMA4x");
            eo.e.m(context, Boolean.TRUE);
            return false;
        } else {
            ea.a.p("PGhedzpoUmMxUit0EFU7OhXk1o2jmMogoJvq5ceM1JrL5ImAnKSp", "jlQNGRW3");
            if (eo.e.k(context) == 2) {
                ea.a.p("QWgkdzloUWMjUgd0UVUEIN613ejuiEZkEubdobeV8iAy", "wd2Kz4qz");
                eo.d.c(context, ea.a.p("MQ==", "S9oAvR4y"), null);
                eo.e.w(context, Boolean.FALSE);
                eo.e.s(context, 3);
            } else if (eo.e.j(context) == 1) {
                ea.a.p("q7ix5tWh0ojc5PCr", "LxekuwfW");
                eo.d.c(context, ea.a.p("Mg==", "651KtFC6"), null);
                eo.e.v(context, Boolean.FALSE);
                eo.e.r(context, 2);
            } else if (eo.e.c(context) == 2) {
                ea.a.p("1q7H5vuQUObeodO8_-jokaG5hOT5naat8XBUZg==", "i0IAJGqp");
                eo.d.c(context, ea.a.p("Mw==", "k5JJ8RNd"), null);
                eo.e.a(context, Boolean.FALSE);
                eo.e.n(context, 3);
            } else {
                if (eo.e.g(context) >= 5) {
                    pdf.pdfreader.viewer.editor.free.utils.c cVar2 = pdf.pdfreader.viewer.editor.free.utils.c.f28558a;
                    String p10 = ea.a.p("IHBUbiZ0Xm0_cxVyFHRl", "jf8omdbC");
                    SharedPreferences sharedPreferences = pdf.pdfreader.viewer.editor.free.utils.c.f28559b;
                    if (!sharedPreferences.getBoolean(p10, false)) {
                        ea.a.p("qYmi5cWAAub2oQ==", "pnfAnp4f");
                        eo.d.c(context, ea.a.p("NA==", "BmJpU9S4"), null);
                        a6.h.j("XHAubix0C20Xc2tyCHRl", "CajAkKrU", sharedPreferences.edit(), true);
                        eo.e.m(context, Boolean.FALSE);
                        eo.e.q(context, 6);
                    }
                }
                if (eo.e.w(context, null)) {
                    ea.a.p("pqGL5cK20Jre5ta6kbzyLNCx--fhuoCP0-bAiIuAwTqptb7o3og=", "6uzeYvcV");
                    eo.e.w(context, Boolean.FALSE);
                    eo.d.c(context, ea.a.p("MQ==", "mzdjdd71"), null);
                } else if (eo.e.v(context, null)) {
                    ea.a.p("jKGN5dC235rM5vq60LzNLN2xx-ftutOP_ubHiLmA1TqAiLHk0as=", "6Ke7k8xk");
                    eo.e.v(context, Boolean.FALSE);
                    eo.d.c(context, ea.a.p("Mg==", "b6JFM2ur"), null);
                } else if (eo.e.a(context, null)) {
                    ea.a.p("2qHx5ci2hZr25qi6jbzMLKGxp-fiuqaPxOaCiKeApzrUvN3ozZGGv-_lmZg=", "N4O0AUPI");
                    eo.e.a(context, Boolean.FALSE);
                    eo.d.c(context, ea.a.p("Mw==", "i1wksJCK"), null);
                } else if (!eo.e.m(context, null)) {
                    return false;
                } else {
                    pdf.pdfreader.viewer.editor.free.utils.c.f28559b.edit().putBoolean(ea.a.p("XHAubix0C20Xc2tyCHRl", "CajAkKrU"), true).apply();
                    ea.a.p("2qHx5ci2hZr25qi6jbzMLKGxp-fiuqaP6-b3iJyA9TrVidjlz4ADcHA=", "aAtbtY5o");
                    eo.e.m(context, Boolean.FALSE);
                    eo.d.c(context, ea.a.p("NA==", "nzwpgCSA"), null);
                }
            }
            return true;
        }
    }

    @Override // po.a
    public final boolean d() {
        pdf.pdfreader.viewer.editor.free.ui.dialog.c cVar = this.c;
        if (cVar != null) {
            return cVar.isShowing();
        }
        return false;
    }

    @Override // po.a
    public final void a() {
    }
}
