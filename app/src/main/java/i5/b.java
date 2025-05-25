package i5;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.widget.RemoteViews;
import c4.h;
import c4.i;
import com.adjust.sdk.Constants;
import industries.deepthought.core.activity.NotificationActivity;
import java.util.Locale;
import k0.p;
import k0.q;
import k0.u;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: UpgradeNotificationManager.kt */
/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public u f18465a;

    /* renamed from: b  reason: collision with root package name */
    public int f18466b = 100;
    public int c = 100;

    public static void a(Context context, int i10) {
        String str;
        ComponentName component;
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null && (component = launchIntentForPackage.getComponent()) != null) {
                str = component.getClassName();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
            intent.putExtra("badge_count_package_name", context.getPackageName());
            intent.putExtra("badge_count_class_name", str);
            intent.putExtra("badge_count", i10);
            context.sendBroadcast(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void b(Context context, int i10) {
        String str;
        ComponentName component;
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage != null && (component = launchIntentForPackage.getComponent()) != null) {
                str = component.getClassName();
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
            intent.putExtra("packageName", context.getPackageName());
            intent.putExtra("className", str);
            intent.putExtra("notificationNum", i10);
            context.sendBroadcast(intent);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // i5.a
    @SuppressLint({"RemoteViewLayout"})
    public final void e(Context context) {
        u uVar;
        p pVar;
        int i10;
        Locale locale;
        boolean z10;
        String str;
        LocaleList locales;
        g.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        g.d(applicationContext, "applicationContext");
        try {
            if (this.f18465a == null) {
                this.f18465a = new u(applicationContext);
            }
            uVar = this.f18465a;
        } catch (Exception e10) {
            e10.printStackTrace();
            uVar = null;
        }
        if (uVar == null) {
            return;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            h.y();
            NotificationChannel b10 = i.b();
            b10.setShowBadge(true);
            if (i11 >= 29) {
                b10.setAllowBubbles(true);
            }
            b10.enableVibration(true);
            uVar.c(b10);
            pVar = new p(applicationContext, "update");
        } else {
            pVar = new p(applicationContext, null);
        }
        if (i11 >= 31) {
            i10 = 201326592;
        } else {
            i10 = 134217728;
        }
        Intent intent = new Intent(context, NotificationActivity.class);
        intent.putExtra("es_ia", "install");
        PendingIntent activity = PendingIntent.getActivity(applicationContext, 0, intent, i10);
        RemoteViews remoteViews = new RemoteViews(applicationContext.getPackageName(), (int) R.layout.upgrade_layout_update_notification_one_line);
        remoteViews.setTextViewText(R.id.readyTv, applicationContext.getString(R.string.arg_res_0x7f1301e0));
        Configuration configuration = applicationContext.getResources().getConfiguration();
        if (i11 >= 24) {
            locales = configuration.getLocales();
            locale = locales.get(0);
        } else {
            locale = configuration.locale;
        }
        if (TextUtils.getLayoutDirectionFromLocale(locale) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            str = "👈";
        } else {
            str = "👉";
        }
        remoteViews.setTextViewText(R.id.arrowTv, str);
        RemoteViews remoteViews2 = new RemoteViews(applicationContext.getPackageName(), (int) R.layout.upgrade_layout_update_notification_expend);
        remoteViews2.setTextViewText(R.id.readyTv, applicationContext.getString(R.string.arg_res_0x7f1301e0) + "👇");
        String string = applicationContext.getString(R.string.arg_res_0x7f1301d7);
        g.d(string, "applicationContext.getSt…ring.lib_upgrade_install)");
        Locale locale2 = Locale.ROOT;
        String upperCase = string.toUpperCase(locale2);
        g.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        remoteViews2.setTextViewText(R.id.installTv, upperCase);
        RemoteViews remoteViews3 = new RemoteViews(applicationContext.getPackageName(), (int) R.layout.upgrade_layout_update_notification_head_up);
        remoteViews3.setTextViewText(R.id.readyTv, applicationContext.getString(R.string.arg_res_0x7f1301e0) + "👇");
        String string2 = applicationContext.getString(R.string.arg_res_0x7f1301d7);
        g.d(string2, "applicationContext.getSt…ring.lib_upgrade_install)");
        String upperCase2 = string2.toUpperCase(locale2);
        g.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        remoteViews3.setTextViewText(R.id.installTv, upperCase2);
        c5.a b11 = c5.a.b();
        b11.a();
        pVar.f19515y.icon = b11.c.f5582d;
        pVar.c(true);
        pVar.f19500j = null;
        pVar.k(3);
        pVar.f19501k = 1;
        pVar.l(2, false);
        c5.a b12 = c5.a.b();
        b12.a();
        String str2 = b12.c.c;
        g.d(str2, "getInstance().upgradeConfig.appName");
        pVar.g(str2);
        pVar.f19502l = 1;
        pVar.q(new q());
        pVar.f19497g = activity;
        pVar.m();
        pVar.f19510t = remoteViews;
        pVar.f19511u = remoteViews2;
        if (ea.a.f()) {
            remoteViews2 = remoteViews3;
        }
        pVar.f19512v = remoteViews2;
        pVar.f19505o = "update";
        Notification a10 = pVar.a();
        g.d(a10, "notificationBuilder.build()");
        g(applicationContext);
        int i12 = this.f18466b;
        this.f18466b = i12 + 1;
        this.c = i12;
        uVar.e(i12, a10);
        String MANUFACTURER = Build.MANUFACTURER;
        g.d(MANUFACTURER, "MANUFACTURER");
        String lowerCase = MANUFACTURER.toLowerCase(locale2);
        g.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (g.a(Constants.REFERRER_API_VIVO, lowerCase)) {
            b(context, 1);
            return;
        }
        String lowerCase2 = MANUFACTURER.toLowerCase(locale2);
        g.d(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (g.a(Constants.REFERRER_API_SAMSUNG, lowerCase2)) {
            a(context, 1);
        }
    }

    @Override // i5.a
    public final void g(Context context) {
        u uVar;
        try {
            try {
                if (this.f18465a == null) {
                    this.f18465a = new u(context);
                }
                uVar = this.f18465a;
            } catch (Exception e10) {
                e10.printStackTrace();
                uVar = null;
            }
            if (uVar == null) {
                return;
            }
            uVar.b(this.c);
            String MANUFACTURER = Build.MANUFACTURER;
            g.d(MANUFACTURER, "MANUFACTURER");
            Locale locale = Locale.ROOT;
            String lowerCase = MANUFACTURER.toLowerCase(locale);
            g.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (g.a(Constants.REFERRER_API_VIVO, lowerCase)) {
                b(context, 0);
                return;
            }
            String lowerCase2 = MANUFACTURER.toLowerCase(locale);
            g.d(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (g.a(Constants.REFERRER_API_SAMSUNG, lowerCase2)) {
                a(context, 0);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }
}
