package yn;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.media.session.h;
import android.text.TextUtils;
import de.e;
import java.util.Arrays;
import k0.p;
import k0.q;
import k0.u;
import kotlin.jvm.internal.g;
import no.f;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.ui.act.RecentAddedActivity;
import pdf.pdfreader.viewer.editor.free.utils.c1;

/* compiled from: NotViewNewlyFileNotificationUtils.kt */
/* loaded from: classes3.dex */
public final class c extends ge.a {

    /* renamed from: o  reason: collision with root package name */
    public static final c f32199o;

    /* renamed from: p  reason: collision with root package name */
    public static final String f32200p;

    /* renamed from: q  reason: collision with root package name */
    public static final String f32201q;

    /* renamed from: r  reason: collision with root package name */
    public static final String f32202r;

    /* renamed from: s  reason: collision with root package name */
    public static final String f32203s;

    static {
        ea.a.p("fW8_VhplFU4Xd3pvHWkwaSdhRmkpbg==", "eGR6rkEa");
        f32200p = ea.a.p("BUgOTj5FGl8PUilVZF8eRGdOHVQWVn9FI18_RQZMG18ASQNF", "qKFOpVDl");
        f32201q = ea.a.p("F0gETndFAF8PUilVZF8eRGdOHVQWVn9FI18_RQZMG18SSQlFZlMFTA1OVA==", "eDTE9Lpj");
        f32202r = ea.a.p("XW8_XwVpB3ctblF3BXkJZi1sZQ==", "rDnPK0Sl");
        f32203s = ea.a.p("LW8uXxVpFHcXbgN3WHkIZlFsN186aVplGnQ=", "3PCZcqVM");
        ea.a.p("XW8_XwVpB3ctblF3BXkJZi1sZQ==", "Y6wKLG4a");
        ea.a.p("XW8_XwVpB3ctblF3BXkJZi1sV181aS9lKHQ=", "Fx8zme0H");
        f32199o = new c();
    }

    public c() {
        super(7);
    }

    public final boolean h0(Context context) {
        boolean z10;
        g.e(context, "context");
        if (!f.b(context).f22629b) {
            return true;
        }
        c1 c1Var = c1.f28564a;
        String p10 = ea.a.p("MA==", "hNAdxZXg");
        String h10 = e.h(c1.B, "");
        if (h.b("LG9fZhBn", "BDzLDoms", h10) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            p10 = h10;
        }
        if (!TextUtils.equals(ea.a.p("MQ==", "qOiNHCeV"), p10)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 33 && androidx.core.content.a.checkSelfPermission(context, ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFAJUxdffk83STJJAkFnSQROUw==", "0ctAYhGF")) != 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public final void i0(Context context, int i10) {
        boolean z10;
        boolean z11;
        u uVar;
        p pVar;
        int i11;
        String str;
        String str2;
        int i12;
        if (h0(context)) {
            return;
        }
        c1 c1Var = c1.f28564a;
        String p10 = ea.a.p("MQ==", "umw5uZPk");
        String h10 = e.h(c1.C, "");
        int i13 = 1;
        if (h.b("Wm86Zi9n", "ic9TF3Uy", h10) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            p10 = h10;
        }
        boolean equals = TextUtils.equals(ea.a.p("MQ==", "upHoN2Mu"), p10);
        Context l10 = ReaderPdfApplication.l();
        if (l10 != null) {
            z11 = false;
        } else {
            l10 = context;
            z11 = true;
        }
        try {
            uVar = new u(l10);
        } catch (Exception e10) {
            e10.printStackTrace();
            uVar = null;
        }
        if (uVar == null) {
            return;
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 26) {
            if (equals) {
                str2 = f32203s;
                i12 = 2;
            } else {
                str2 = f32202r;
                i12 = 4;
            }
            c4.h.y();
            NotificationChannel c = bb.g.c(str2, str2, i12);
            c.setShowBadge(true);
            if (i14 >= 29) {
                c.setAllowBubbles(true);
            }
            c.enableVibration(true);
            uVar.c(c);
            pVar = new p(l10, str2);
        } else {
            pVar = new p(l10, null);
        }
        if (i14 >= 31) {
            i11 = 1275068416;
        } else {
            i11 = 1207959552;
        }
        RecentAddedActivity.a aVar = RecentAddedActivity.f26850l0;
        String p11 = ea.a.p("KXJebSZuWHQzZiNjFHQBb24=", "pMRD8XhY");
        aVar.getClass();
        Intent a10 = RecentAddedActivity.a.a(context, 0, p11);
        a10.setPackage(ea.a.p("MWQkLiBkAXItYQJlRi4haV13N3JnZVJpAG8DLjdyJ2U=", "nLABPgyH"));
        if (z11) {
            a10.addFlags(268435456);
        }
        PendingIntent activity = PendingIntent.getActivity(l10, 0, a10, i11);
        String p12 = ea.a.p("w5_TiiA=", "8nsS049m");
        String string = pdf.pdfreader.viewer.editor.free.utils.extension.c.m(l10).getString(R.string.arg_res_0x7f1302d8, Arrays.copyOf(new String[]{String.valueOf(i10)}, 1));
        g.d(string, ea.a.p("R28YeQB0B20-b1dhBUM5bjBlSnRuKW1nK3RndBdpO2cbci5zOmROIFh2VWwcZSk=", "N4eUvCp0"));
        String str3 = ((Object) p12) + string;
        if (equals) {
            str = f32201q;
        } else {
            str = f32200p;
        }
        pVar.f19515y.icon = R.drawable.ic_notice_logo;
        pVar.f19508r = androidx.core.content.a.getColor(l10, R.color.colorAccent);
        pVar.c(true);
        pVar.f19500j = null;
        pVar.k(3);
        pVar.l(2, false);
        pVar.g(str3);
        if (equals) {
            i13 = -1;
        }
        pVar.f19502l = i13;
        pVar.q(new q());
        pVar.f19497g = activity;
        pVar.m();
        pVar.f19505o = str;
        try {
            Notification a11 = pVar.a();
            g.d(a11, ea.a.p("K29CaSJpC2E8aQludnU-bFxlIC4rdV9sECgp", "9JE6DhQN"));
            uVar.b(901);
            uVar.e(901, a11);
            tn.a.b(context, ea.a.p("IW9FaRpl", "nbcOZGCK"), ea.a.p("IW9FaRplaHU0ci9hEV8baFp3", "riEfr4Wl"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
