package yn;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.RemoteViews;
import c4.h;
import de.e;
import k0.p;
import k0.q;
import k0.u;
import kotlin.jvm.internal.g;
import no.f;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.utils.c1;

/* compiled from: OpenAppPermanentNotificationUtils.kt */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f32204a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f32205b;
    public static final String c;

    static {
        ea.a.p("fHAubjJwElAXcllhB2U4dApvRmkgaSBhEmlWbiV0Xmxz", "f9p7ajut");
        f32205b = ea.a.p("cEgKTj1FLl81UntVOV8fRBtPYkUIXwJQaF8oRQZNC052TlQ=", "8xTJaADk");
        c = ea.a.p("IHBUbiZhR3AFcC9yGGEGZVt0", "2igz8MhG");
        ea.a.p("IHBUbiZhR3AFcC9yGGEGZVt0", "BiOtDyoV");
        f32204a = new d();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.app.PendingIntent a(android.content.Context r5, int r6, int r7, boolean r8) {
        /*
            java.lang.String r0 = "WGUyXwBlDmURdGt0CGIJcCtzW3Qvb24="
            r1 = 1
            java.lang.Class<pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity> r2 = pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity.class
            if (r6 == r1) goto L5f
            java.lang.String r3 = "JGVIXwplW2U5dBV0FGI3cFpzB3Qsb24="
            r4 = 2
            if (r6 == r4) goto L50
            r1 = 3
            if (r6 == r1) goto L41
            r0 = 4
            if (r6 == r0) goto L32
            r0 = 5
            if (r6 == r0) goto L17
            r5 = 0
            return r5
        L17:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<pdf.pdfreader.viewer.editor.free.ui.act.ReaderSearchActivity> r1 = pdf.pdfreader.viewer.editor.free.ui.act.ReaderSearchActivity.class
            r0.<init>(r5, r1)
            java.lang.String r1 = "WGUyXwBlA3IRaGtmG29t"
            java.lang.String r2 = "igJSyFks"
            java.lang.String r1 = ea.a.p(r1, r2)
            java.lang.String r2 = "CVJ-TSZOeFQTRgNDNFQhT04="
            java.lang.String r3 = "oTUGoELO"
            java.lang.String r2 = ea.a.p(r2, r3)
            r0.putExtra(r1, r2)
            goto L6f
        L32:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5, r2)
            java.lang.String r2 = "kp2VAP83"
            java.lang.String r2 = ea.a.p(r3, r2)
            r0.putExtra(r2, r1)
            goto L6f
        L41:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r5, r2)
            java.lang.String r2 = "0MN6OhRO"
            java.lang.String r0 = ea.a.p(r0, r2)
            r1.putExtra(r0, r4)
            goto L6e
        L50:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r5, r2)
            java.lang.String r2 = "FhIlnRzb"
            java.lang.String r2 = ea.a.p(r3, r2)
            r0.putExtra(r2, r1)
            goto L6f
        L5f:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r5, r2)
            java.lang.String r2 = "N1zmfj5c"
            java.lang.String r0 = ea.a.p(r0, r2)
            r2 = 0
            r1.putExtra(r0, r2)
        L6e:
            r0 = r1
        L6f:
            java.lang.String r1 = "Q2EsZSxmEG9t"
            java.lang.String r2 = "RQBdEf0t"
            java.lang.String r1 = ea.a.p(r1, r2)
            java.lang.String r2 = "dVIETSxQJ1I_QXpFJ1QJTgtUe0YPQwJUHU9O"
            java.lang.String r3 = "TSBpFhAv"
            java.lang.String r2 = ea.a.p(r2, r3)
            r0.putExtra(r1, r2)
            java.lang.String r1 = "P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpBG84LlByLGU="
            java.lang.String r2 = "Q1AIpJ6I"
            java.lang.String r1 = ea.a.p(r1, r2)
            r0.setPackage(r1)
            if (r8 == 0) goto L94
            r8 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r8)
        L94:
            android.app.PendingIntent r5 = android.app.PendingIntent.getActivity(r5, r6, r0, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yn.d.a(android.content.Context, int, int, boolean):android.app.PendingIntent");
    }

    public static final Notification b(Context context) {
        Activity activity;
        boolean z10;
        u uVar;
        p pVar;
        int i10;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33) {
            activity = context;
            if (androidx.core.content.a.checkSelfPermission(activity, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFAKUzFfCU8QSStJAUEbSX5OUw==", "hMMNGDmB")) != 0) {
                return null;
            }
        } else {
            activity = context;
        }
        Activity l10 = ReaderPdfApplication.l();
        if (l10 != null) {
            activity = l10;
            z10 = false;
        } else {
            z10 = true;
        }
        f32204a.getClass();
        try {
            uVar = new u(activity);
        } catch (Exception e10) {
            e10.printStackTrace();
            uVar = null;
        }
        if (uVar == null) {
            return null;
        }
        if (i11 >= 26) {
            h.y();
            String str = c;
            NotificationChannel b10 = bb.h.b(str, str);
            b10.setShowBadge(true);
            if (i11 >= 29) {
                b10.setAllowBubbles(true);
            }
            b10.enableVibration(true);
            uVar.c(b10);
            pVar = new p(activity, str);
        } else {
            pVar = new p(activity, null);
        }
        if (i11 >= 31) {
            i10 = 201326592;
        } else {
            i10 = 134217728;
        }
        Context m10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.m(activity);
        RemoteViews remoteViews = new RemoteViews(activity.getPackageName(), (int) R.layout.notify_open_app_permanent_collapse);
        remoteViews.setTextViewText(R.id.tv_notify_all_files, m10.getText(R.string.arg_res_0x7f130367));
        remoteViews.setTextViewText(R.id.tv_notify_recent, m10.getText(R.string.arg_res_0x7f130418));
        remoteViews.setTextViewText(R.id.tv_notify_bookmark, m10.getText(R.string.arg_res_0x7f13036f));
        remoteViews.setTextViewText(R.id.tv_notify_tools, m10.getText(R.string.arg_res_0x7f1304d7));
        remoteViews.setTextViewText(R.id.tv_notify_search, m10.getText(R.string.arg_res_0x7f1303e6));
        remoteViews.setOnClickPendingIntent(R.id.ll_notify_all_files, a(activity, 1, i10, z10));
        remoteViews.setOnClickPendingIntent(R.id.ll_notify_recent, a(activity, 2, i10, z10));
        remoteViews.setOnClickPendingIntent(R.id.ll_notify_bookmark, a(activity, 3, i10, z10));
        remoteViews.setOnClickPendingIntent(R.id.ll_notify_tools, a(activity, 4, i10, z10));
        remoteViews.setOnClickPendingIntent(R.id.ll_notify_search, a(activity, 5, i10, z10));
        RemoteViews remoteViews2 = new RemoteViews(activity.getPackageName(), (int) R.layout.notify_open_app_permanent);
        remoteViews2.setTextViewText(R.id.tv_notify_all_files, m10.getText(R.string.arg_res_0x7f130367));
        remoteViews2.setTextViewText(R.id.tv_notify_recent, m10.getText(R.string.arg_res_0x7f130418));
        remoteViews2.setTextViewText(R.id.tv_notify_bookmark, m10.getText(R.string.arg_res_0x7f13036f));
        remoteViews2.setTextViewText(R.id.tv_notify_tools, m10.getText(R.string.arg_res_0x7f1304d7));
        remoteViews2.setTextViewText(R.id.tv_notify_search, m10.getText(R.string.arg_res_0x7f1303e6));
        remoteViews2.setOnClickPendingIntent(R.id.ll_notify_all_files, a(activity, 1, i10, z10));
        remoteViews2.setOnClickPendingIntent(R.id.ll_notify_recent, a(activity, 2, i10, z10));
        remoteViews2.setOnClickPendingIntent(R.id.ll_notify_bookmark, a(activity, 3, i10, z10));
        remoteViews2.setOnClickPendingIntent(R.id.ll_notify_tools, a(activity, 4, i10, z10));
        remoteViews2.setOnClickPendingIntent(R.id.ll_notify_search, a(activity, 5, i10, z10));
        pVar.f19515y.icon = R.drawable.ic_notice_logo;
        pVar.f19508r = androidx.core.content.a.getColor(activity, R.color.colorAccent);
        pVar.c(false);
        pVar.f19500j = null;
        pVar.k(3);
        pVar.l(2, true);
        pVar.g(activity.getString(R.string.arg_res_0x7f13036c));
        pVar.q(new q());
        pVar.m();
        pVar.f19510t = remoteViews;
        if (i11 < 31) {
            remoteViews2 = remoteViews;
        }
        pVar.f19511u = remoteViews2;
        pVar.f19512v = remoteViews;
        pVar.f19505o = f32205b;
        Notification a10 = pVar.a();
        g.d(a10, ea.a.p("IW9FaR9pVGEuaSVuN3UBbFFlHC4ndQxsFygp", "X4kBsQUA"));
        return a10;
    }

    public static final void c(Context context) {
        Notification notification;
        if (Build.VERSION.SDK_INT >= 33 && androidx.core.content.a.checkSelfPermission(context, ea.a.p("Lm5VchZpUy4qZThtHHMbaVpuQFAKUzFfNE8_SRNJN0EbSX5OUw==", "AoAezkUt")) != 0) {
            return;
        }
        u uVar = null;
        if (f.b(context).f22629b && c1.h(context)) {
            notification = b(context);
        } else {
            notification = null;
        }
        f32204a.getClass();
        try {
            uVar = new u(context);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (uVar != null && notification != null) {
            try {
                uVar.e(902, notification);
                tn.a.b(context, ea.a.p("IW9FaRpl", "QLQwFcks"), ea.a.p("IW9FaRplaHI_cyNkEG4cX0ZoAXc=", "zpfOVolx"));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public static final void d(Context context) {
        boolean z10;
        u uVar;
        g.e(context, "context");
        if (f.b(context).f22629b) {
            c1 c1Var = c1.f28564a;
            String p10 = ea.a.p("MA==", "61yCz0pM");
            String h10 = e.h(c1.F, "");
            if (android.support.v4.media.session.h.b("LG9fZhBn", "CVrduVOo", h10) == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                p10 = h10;
            }
            if (TextUtils.equals(ea.a.p("MQ==", "46pIHZJr"), p10)) {
                if (Build.VERSION.SDK_INT >= 33 && androidx.core.content.a.checkSelfPermission(context, ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFAJUxdfHU9kSRdJcEFnSQROUw==", "S0Q3saWP")) != 0) {
                    return;
                }
                Notification b10 = b(context);
                f32204a.getClass();
                try {
                    uVar = new u(context);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    uVar = null;
                }
                if (uVar != null && b10 != null) {
                    try {
                        uVar.e(902, b10);
                        tn.a.b(context, ea.a.p("XW8_aRBl", "Hp0raJT3"), ea.a.p("XW8_aRBlPXIXc11kDG4iXzdoXXc=", "XF5eN5nr"));
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                }
            }
        }
    }
}
