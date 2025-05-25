package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import cg.l;
import java.util.Locale;
import kotlin.jvm.internal.g;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.x;
import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.activity.WidgetLandingActivity;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.n0;
import pdf.pdfreader.viewer.editor.free.utils.t0;
import pdf.pdfreader.viewer.editor.free.utils.w0;
import tf.d;

/* compiled from: BaseAPPWidget.kt */
/* loaded from: classes3.dex */
public abstract class BaseAPPWidget extends AppWidgetProvider {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f24823a = 0;

    public static PendingIntent f(Context context, final int i10, final String str) {
        g.e(context, "context");
        l<Intent, d> lVar = new l<Intent, d>() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget$pageToIntent$intent$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cg.l
            public /* bridge */ /* synthetic */ d invoke(Intent intent) {
                invoke2(intent);
                return d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Intent it) {
                g.e(it, "it");
                it.putExtra(ea.a.p("VXIkbQ==", "2016tFyg"), 6);
                it.putExtra(ea.a.p("CmEoZQV0bw==", "9WzOZ91l"), str);
                it.putExtra(ea.a.p("RGkvZxZ0PWlk", "5HZXsBjB"), i10);
            }
        };
        Intent intent = new Intent(context, WidgetLandingActivity.class);
        intent.setPackage(ea.a.p("P2RXLglkUXI_YS5lBy4eaVB3C3JrZQFpTG89LjFyV2U=", "mkmR8OW2"));
        lVar.invoke(intent);
        PendingIntent activity = PendingIntent.getActivity(context, i10, intent, 201326592);
        g.d(activity, ea.a.p("KGVFQRp0XnYzdDMoFm8GdFB4GixlcgBxjYDlaQlnM247ZV90V0Z7QR1fA004VTxBd0wrKQ==", "kFPUoCgz"));
        return activity;
    }

    public abstract int a();

    public int b() {
        return a();
    }

    public abstract int c();

    public abstract void d(Context context, RemoteViews remoteViews);

    public abstract boolean e();

    public abstract void g(Context context, Resources resources, RemoteViews remoteViews);

    public final void h(Context context, RemoteViews remoteViews, AppWidgetManager appWidgetManager, int i10) {
        d(context, remoteViews);
        if (!TextUtils.isEmpty(a0.f(context))) {
            g.e(context, "context");
            Locale e10 = a0.e(context);
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(context.getPackageName());
            g.d(resourcesForApplication, ea.a.p("LG9fdBx4Qy4qYSlrFGcNTVRuD2cgcktnkIDpdD9vDSgsb190HHhDLiphKWsUZw1OVG0LKQ==", "LJuQrOVc"));
            Configuration configuration = resourcesForApplication.getConfiguration();
            configuration.setLocale(e10);
            resourcesForApplication.updateConfiguration(configuration, null);
            g(context, resourcesForApplication, remoteViews);
        }
        t0.d0(x.a(j0.f20206a), null, null, new BaseAPPWidget$refreshWidget$1(appWidgetManager, i10, remoteViews, null), 3);
    }

    public abstract boolean i(int i10);

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i10, Bundle bundle) {
        RemoteViews remoteViews;
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i10, bundle);
        ea.a.p("RGkvZxZ0PXQTZw==", "oE75QS1e");
        ea.a.p("XG4KcANXC2QVZUBPGXQ_bypzcWgnbiRlZA==", "ShjLViw6");
        String str = n0.f28727a;
        if (e() && bundle != null && context != null && appWidgetManager != null) {
            int i11 = bundle.getInt(ea.a.p("LnBBVxBkUGUuTSNuPWUBZ110", "AmldMikx"));
            bundle.getInt(ea.a.p("LnBBVxBkUGUuTSNuImkMdGg=", "NGzDE3vW"));
            float f10 = context.getResources().getDisplayMetrics().density;
            ea.a.p("RGkvZxZ0PXQTZw==", "CbUMJRc0");
            if (i(i11)) {
                ea.a.p("L2kVZwp0M3QpZw==", "CFXqolw2");
                ea.a.p("NmUNUxRhPmwEYR9vQXQeZA==", "gZQyyRqe");
                remoteViews = new RemoteViews(context.getPackageName(), c());
            } else {
                ea.a.p("G2kcZyJ0a3QpZw==", "dblxG4nq");
                ea.a.p("VGU_ThxyD2EeTFV5BnUiSSAx", "0bRS2emU");
                remoteViews = new RemoteViews(context.getPackageName(), b());
            }
            h(context, remoteViews, appWidgetManager, i10);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        g.e(context, "context");
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        g.e(context, "context");
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(final Context context, final AppWidgetManager appWidgetManager, final int[] appWidgetIds) {
        g.e(context, "context");
        g.e(appWidgetManager, "appWidgetManager");
        g.e(appWidgetIds, "appWidgetIds");
        w0.a().f28791b.execute(new Runnable() { // from class: pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.a
            @Override // java.lang.Runnable
            public final void run() {
                int i10 = BaseAPPWidget.f24823a;
                String p10 = ea.a.p("aWFJcAdpK2ctdC9kcw==", "OFM9POto");
                int[] iArr = appWidgetIds;
                g.e(iArr, p10);
                String p11 = ea.a.p("R2gic1cw", "UEizs064");
                BaseAPPWidget baseAPPWidget = this;
                g.e(baseAPPWidget, p11);
                String p12 = ea.a.p("F2MkbgdlGnQ=", "XbOTqX5k");
                Context context2 = context;
                g.e(context2, p12);
                String p13 = ea.a.p("a2FBcC5pU2c_dAdhG2EPZXI=", "2QzFBENT");
                AppWidgetManager appWidgetManager2 = appWidgetManager;
                g.e(appWidgetManager2, p13);
                for (int i11 : iArr) {
                    baseAPPWidget.h(context2, new RemoteViews(context2.getPackageName(), baseAPPWidget.a()), appWidgetManager2, i11);
                }
            }
        });
    }
}
