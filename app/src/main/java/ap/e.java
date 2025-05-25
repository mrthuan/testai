package ap;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import bb.k;
import c4.h;
import industries.deepthought.core.activity.NotificationActivity;
import java.util.Locale;
import k0.p;
import k0.q;
import k0.u;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ReaderPdfApplication;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import v0.f;

/* compiled from: ReaderUpgradeNotificationManager.kt */
/* loaded from: classes3.dex */
public final class e extends ge.a implements i5.a {

    /* renamed from: o  reason: collision with root package name */
    public static final a f5166o;

    /* renamed from: p  reason: collision with root package name */
    public static final String f5167p = ea.a.p("IXA1YQRl", "uJTQp9s6");

    /* renamed from: q  reason: collision with root package name */
    public static boolean f5168q;

    /* compiled from: ReaderUpgradeNotificationManager.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    static {
        ea.a.p("J3AnYR1l", "FpRCi9lR");
        ea.a.p("OnBVYQ1l", "VFG4lh46");
        f5166o = new a();
    }

    public e() {
        super(7);
    }

    @Override // i5.a
    @SuppressLint({"RemoteViewLayout"})
    public final void e(Context context) {
        Activity activity;
        boolean z10;
        u uVar;
        p pVar;
        int i10;
        boolean z11;
        String str;
        String str2;
        g.e(context, "context");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 33 && androidx.core.content.a.checkSelfPermission(context, ea.a.p("Um4vchxpBi4CZUZtAHMlaStuHFAJUxdfdk8lSXBJEEFnSQROUw==", "8q6SB4A8")) != 0) {
            return;
        }
        Activity l10 = ReaderPdfApplication.l();
        if (l10 != null) {
            activity = l10;
            z10 = false;
        } else {
            activity = context;
            z10 = true;
        }
        try {
            uVar = new u(activity);
        } catch (Exception e10) {
            ea.a.p("Rm4mZx1t", "3L6Wc9a9");
            e10.printStackTrace();
            uVar = null;
        }
        if (uVar == null) {
            return;
        }
        String str3 = f5167p;
        if (i11 >= 26) {
            h.y();
            NotificationChannel e11 = k.e(str3, str3);
            e11.setShowBadge(true);
            if (i11 >= 29) {
                e11.setAllowBubbles(true);
            }
            e11.enableVibration(true);
            uVar.c(e11);
            pVar = new p(activity, str3);
        } else {
            pVar = new p(activity, null);
        }
        if (i11 >= 31) {
            i10 = 1275068416;
        } else {
            i10 = 1207959552;
        }
        Intent intent = new Intent(context, NotificationActivity.class);
        intent.putExtra("es_ia", "install");
        intent.setPackage(ea.a.p("E2RRLhZkX3ItYQJlRi4haV13N3JnZVJpAG8DLjdyJ2U=", "Kkc7f9Oy"));
        if (z10) {
            intent.addFlags(268435456);
        }
        PendingIntent activity2 = PendingIntent.getActivity(activity, 0, intent, i10);
        Context m10 = pdf.pdfreader.viewer.editor.free.utils.extension.c.m(activity);
        RemoteViews remoteViews = new RemoteViews(activity.getPackageName(), (int) R.layout.reader_upgrade_layout_update_notification_one_line);
        remoteViews.setTextViewText(R.id.readyTv, m10.getString(R.string.arg_res_0x7f1301e0));
        Locale g10 = a0.g();
        int i12 = f.f30479a;
        if (f.a.a(g10) == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            str = "w5_aiA==";
            str2 = "4nU0dH8n";
        } else {
            str = "v5-giQ==";
            str2 = "kPiCMf8z";
        }
        remoteViews.setTextViewText(R.id.arrowTv, ea.a.p(str, str2));
        RemoteViews remoteViews2 = new RemoteViews(activity.getPackageName(), (int) R.layout.reader_upgrade_layout_update_notification_expend);
        remoteViews2.setTextViewText(R.id.readyTv, m10.getString(R.string.arg_res_0x7f1301e0) + "👇");
        String string = m10.getString(R.string.arg_res_0x7f1301d7);
        g.d(string, ea.a.p("PHlCdBxte285YSZDGm4cZU10QGcgdDZ0gYCVcixuCC4jaVNfDHBQcjtkL18cbht0VGwCKQ==", "Z31yc3Eo"));
        Locale locale = Locale.ROOT;
        String upperCase = string.toUpperCase(locale);
        g.d(upperCase, ea.a.p("GWg_c0hhQSAiYRBhGmw2bl8uAXQ7aVhnXS4FbwRwMmUfQzdzDSh-bythCmUaUhhPbCk=", "lbmVh2t7"));
        remoteViews2.setTextViewText(R.id.installTv, upperCase);
        RemoteViews remoteViews3 = new RemoteViews(activity.getPackageName(), (int) R.layout.reader_upgrade_layout_update_notification_head_up);
        remoteViews3.setTextViewText(R.id.readyTv, m10.getString(R.string.arg_res_0x7f1301e0) + "👇");
        String string2 = m10.getString(R.string.arg_res_0x7f1301d7);
        g.d(string2, ea.a.p("PHlCdBxte285YSZDGm4cZU10QGcgdDZ0pYDJch5uAi4jaVNfDHBQcjtkL18cbht0VGwCKQ==", "2ZyoGowe"));
        String upperCase2 = string2.toUpperCase(locale);
        g.d(upperCase2, ea.a.p("O2hYc1lhRCAwYTxhW2wJblIuPXQ3aQtnXC4Zb2ZwQmU9Q1BzHCh7bzlhJmVbUidPYSk=", "NKj6um32"));
        remoteViews3.setTextViewText(R.id.installTv, upperCase2);
        pVar.f19515y.icon = R.drawable.ic_notice_logo;
        pVar.f19508r = androidx.core.content.a.getColor(context, R.color.colorAccent);
        pVar.c(true);
        pVar.f19500j = null;
        pVar.k(3);
        pVar.l(2, false);
        pVar.g(context.getString(R.string.arg_res_0x7f13036c));
        pVar.f19502l = 1;
        pVar.q(new q());
        pVar.f19497g = activity2;
        pVar.m();
        pVar.f19510t = remoteViews;
        pVar.f19511u = remoteViews2;
        if (ea.a.f()) {
            remoteViews2 = remoteViews3;
        }
        pVar.f19512v = remoteViews2;
        pVar.f19505o = str3;
        Notification a10 = pVar.a();
        g.d(a10, ea.a.p("XW8_aRVpAWEGaVtuK3U_bCBlQC4kdSpsJigp", "BKCvCFSO"));
        g(activity);
        uVar.e(100, a10);
    }

    @Override // i5.a
    public final void g(Context context) {
        u uVar;
        if (f5168q) {
            f5168q = false;
            return;
        }
        try {
            try {
                uVar = new u(context);
            } catch (Exception e10) {
                ea.a.p("Rm4mZx1t", "3L6Wc9a9");
                e10.printStackTrace();
                uVar = null;
            }
            if (uVar == null) {
                return;
            }
            uVar.b(100);
        } catch (Throwable th2) {
            ea.a.p("Om5cY24=", "6klQr4Kl");
            th2.printStackTrace();
        }
    }
}
