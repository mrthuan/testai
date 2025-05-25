package yn;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.h;
import android.text.TextUtils;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import de.e;
import k0.p;
import k0.q;
import k0.u;
import kotlin.jvm.internal.g;
import no.f;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.db.PdfPreviewEntity;
import pdf.pdfreader.viewer.editor.free.pdfview.ReaderPreviewActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.utils.c1;

/* compiled from: NotFinishedReaderNotificationUtils.kt */
/* loaded from: classes3.dex */
public final class b extends ge.a {

    /* renamed from: o  reason: collision with root package name */
    public static final b f32194o;

    /* renamed from: p  reason: collision with root package name */
    public static final String f32195p;

    /* renamed from: q  reason: collision with root package name */
    public static final String f32196q;

    /* renamed from: r  reason: collision with root package name */
    public static final String f32197r;

    /* renamed from: s  reason: collision with root package name */
    public static final String f32198s;

    static {
        ea.a.p("PG9MRipuXnMgZQJOW3Q-ZlFjM3Qgb24=", "sur8C7pi");
        f32195p = ea.a.p("E0g0TjpFFF8PUilVZF8eRGdOHVQWRn9OPVM5RRVfEEURRDBS", "gdPutX7C");
        f32196q = ea.a.p("dEgFThdFNV8PUilVZF8eRGdOHVQWRn9OPVM5RRVfEEV2RAFSBlMwTA1OVA==", "oj7DYyGO");
        f32197r = ea.a.p("XG88X1VpBGk7aANka3IyYVxlcg==", "hd2H3jzK");
        f32198s = ea.a.p("XW8_XxVpDGkBaFFkNnIzYSBlQF81aS9lL3Q=", "A5RFlNPx");
        ea.a.p("IW9FXx9pWWkpaC9kKnINYVFlcg==", "BLLJ8QZG");
        ea.a.p("IW9FXx9pWWkpaC9kKnINYVFlHF82aQllP3Q=", "6GyvQcwD");
        f32194o = new b();
    }

    public b() {
        super(7);
    }

    public final boolean h0(Context context) {
        boolean z10;
        g.e(context, "context");
        if (!f.b(context).f22629b) {
            return true;
        }
        c1 c1Var = c1.f28564a;
        String p10 = ea.a.p("MA==", "vML1yGLh");
        String h10 = e.h(c1.f28609x, "");
        if (h.b("UG8lZhpn", "h2Np6v0O", h10) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            p10 = h10;
        }
        if (!TextUtils.equals(ea.a.p("MQ==", "b1DB8kfH"), p10)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 33 && androidx.core.content.a.checkSelfPermission(context, ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFAJUxdfAE9mSXJJFUFnSQROUw==", "N24VR1LS")) != 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"MissingPermission"})
    public final void i0(Context context, nl.b bVar) {
        boolean z10;
        Activity activity;
        boolean z11;
        u uVar;
        p pVar;
        int i10;
        String str;
        String str2;
        int i11;
        if (h0(context)) {
            return;
        }
        c1 c1Var = c1.f28564a;
        String p10 = ea.a.p("MQ==", "rJoShxSI");
        String h10 = e.h(c1.f28611y, "");
        int i12 = 1;
        if (h.b("UG8lZhpn", "sJ1KqAaf", h10) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            p10 = h10;
        }
        boolean equals = TextUtils.equals(ea.a.p("MQ==", "oJTVZiXh"), p10);
        Activity l10 = ReaderPdfApplication.l();
        if (l10 != null) {
            activity = l10;
            z11 = false;
        } else {
            activity = context;
            z11 = true;
        }
        try {
            uVar = new u(activity);
        } catch (Exception e10) {
            e10.printStackTrace();
            uVar = null;
        }
        if (uVar == null) {
            return;
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26) {
            if (equals) {
                str2 = f32198s;
                i11 = 2;
            } else {
                str2 = f32197r;
                i11 = 4;
            }
            c4.h.y();
            NotificationChannel c = bb.g.c(str2, str2, i11);
            c.setShowBadge(true);
            if (i13 >= 29) {
                c.setAllowBubbles(true);
            }
            c.enableVibration(true);
            uVar.c(c);
            pVar = new p(activity, str2);
        } else {
            pVar = new p(activity, null);
        }
        if (i13 >= 31) {
            i10 = 1275068416;
        } else {
            i10 = 1207959552;
        }
        Intent intent = new Intent(activity, ReaderHomeActivity.class);
        intent.setPackage(ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpBm8KLhRyAGU=", "EXdErxre"));
        if (z11) {
            intent.addFlags(268435456);
        }
        if (bVar != null && bVar.f22581a != 0) {
            bVar.f22593n = OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK;
            bVar.f22592m = true;
            PdfPreviewEntity U = com.google.android.play.core.assetpacks.c.U(bVar);
            intent.setAction(ea.a.p("Um4vchxpBi4bbkBlB3R4YSd0W28oLhVJNVc=", "pfaQ4M69"));
            intent.setData(Uri.fromFile(U.getFile()));
            intent.setClass(activity, ReaderPreviewActivity.class);
            intent.putExtra(ea.a.p("C2gVdzlwUGY=", "HXxzf4bI"), U);
            intent.putExtra(ea.a.p("CmQ-dA==", "ihoWCqQA"), false);
            intent.putExtra(ea.a.p("X3InbQ==", "BR9H37Rr"), ea.a.p("dVIETSxUKkkgRA==", "P5SRYN4F"));
            intent.putExtra(ea.a.p("XW8_aRVpAWEGaVtuNnQvcGU=", "deJBP5bi"), 2);
            bm.c.b(context).i(U);
        }
        PendingIntent activity2 = PendingIntent.getActivity(activity, 0, intent, i10);
        String p11 = ea.a.p("w5_TiiA=", "3lrayO7r");
        String string = pdf.pdfreader.viewer.editor.free.utils.extension.c.m(activity).getString(R.string.arg_res_0x7f1302d6);
        g.d(string, ea.a.p("B28neQl0H20EbwVhWEM4bkxlKnRhKRhnEXQidCNpLGdbchFzM2Qp", "k9stzzXE"));
        String str3 = ((Object) p11) + string;
        if (equals) {
            str = f32196q;
        } else {
            str = f32195p;
        }
        pVar.f19515y.icon = R.drawable.ic_notice_logo;
        pVar.f19508r = androidx.core.content.a.getColor(activity, R.color.colorAccent);
        pVar.c(true);
        pVar.f19500j = null;
        pVar.k(3);
        pVar.l(2, false);
        pVar.g(str3);
        if (equals) {
            i12 = -1;
        }
        pVar.f19502l = i12;
        pVar.q(new q());
        pVar.f19497g = activity2;
        pVar.m();
        pVar.f19505o = str;
        try {
            Notification a10 = pVar.a();
            g.d(a10, ea.a.p("XW8_aRVpAWEGaVtuK3U_bCBlQC4kdSpsMSgp", "UwCk96Oa"));
            uVar.e(OS2WindowsMetricsTable.WEIGHT_CLASS_BLACK, a10);
            tn.a.b(activity, ea.a.p("IW9FaRpl", "mTFxOMiu"), ea.a.p("IW9FaRplaHU0ZCVuEF8baFp3", "FVVdiQWE"));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
