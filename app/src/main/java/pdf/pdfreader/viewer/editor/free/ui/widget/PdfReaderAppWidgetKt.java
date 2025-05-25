package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.RemoteViews;
import java.util.Locale;
import kotlinx.coroutines.j0;
import kotlinx.coroutines.x;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderSearchActivity;
import pdf.pdfreader.viewer.editor.free.ui.widget.act.ReaderEditChooserActivity;
import pdf.pdfreader.viewer.editor.free.utils.a0;
import pdf.pdfreader.viewer.editor.free.utils.t0;

/* compiled from: PdfReaderAppWidget.kt */
/* loaded from: classes3.dex */
public final class PdfReaderAppWidgetKt {
    public static final <T> PendingIntent a(Context context, Class<T> cls, int i10, cg.l<? super Intent, tf.d> interceptIntent) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(interceptIntent, "interceptIntent");
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.setPackage(ea.a.p("Q2QtLgNkBHIXYVBlGy4gaSF3V3JoZSdpA28hLhJyKGU=", "wStMCkc6"));
        interceptIntent.invoke(intent);
        PendingIntent activity = PendingIntent.getActivity(context, i10, intent, 67108864);
        kotlin.jvm.internal.g.d(activity, ea.a.p("KGVFQRp0XnYzdDMoFm8GdFB4GixlcgBxGGUVdBNvCGVjIFhuDWVZdHYgLGwUZyk=", "eEeYmfPl"));
        return activity;
    }

    public static final void b(Context context, RemoteViews remoteViews, AppWidgetManager appWidgetManager, int i10) {
        PendingIntent a10 = a(context, ReaderSearchActivity.class, 199, new cg.l<Intent, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.PdfReaderAppWidgetKt$refreshRemoteView$searchIntent$1
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Intent intent) {
                invoke2(intent);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Intent it) {
                kotlin.jvm.internal.g.e(it, "it");
                it.putExtra(ea.a.p("WGUyXwBlA3IRaGtmG29t", "420o34d4"), ea.a.p("CVJ-TSZXfkQdRVQ=", "6ibndV3t"));
            }
        });
        PendingIntent a11 = a(context, ReaderHomeActivity.class, 200, new cg.l<Intent, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.PdfReaderAppWidgetKt$refreshRemoteView$mainIntent$1
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Intent intent) {
                invoke2(intent);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Intent it) {
                kotlin.jvm.internal.g.e(it, "it");
                it.putExtra(ea.a.p("JGVIXwplW2U5dBV0FGI3cFpzB3Qsb24=", "JWlnmAkf"), 0);
                it.putExtra(ea.a.p("NmEvZTRmP29t", "txFHkMOZ"), ea.a.p("Q2EsZSx3C2QVZXQ=", "wGY5IBcX"));
            }
        });
        PendingIntent a12 = a(context, ReaderHomeActivity.class, 201, new cg.l<Intent, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.PdfReaderAppWidgetKt$refreshRemoteView$recentIntent$1
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Intent intent) {
                invoke2(intent);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Intent it) {
                kotlin.jvm.internal.g.e(it, "it");
                it.putExtra(ea.a.p("JGVIXwplW2U5dBV0FGI3cFpzB3Qsb24=", "YvfL4NKt"), 1);
                it.putExtra(ea.a.p("Q2EsZSxmEG9t", "SBBza51D"), ea.a.p("P2FWZSZ3XmQ9ZXQ=", "hTxXh2BF"));
            }
        });
        PendingIntent a13 = a(context, ReaderHomeActivity.class, 202, new cg.l<Intent, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.PdfReaderAppWidgetKt$refreshRemoteView$bookmarkIntent$1
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Intent intent) {
                invoke2(intent);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Intent it) {
                kotlin.jvm.internal.g.e(it, "it");
                it.putExtra(ea.a.p("WGUyXwBlDmURdGt0CGIJcCtzW3Qvb24=", "LMWAaSEL"), 2);
                it.putExtra(ea.a.p("P2FWZSZmRW9t", "6yOiNVWQ"), ea.a.p("OGExZRV3WmQvZXQ=", "mDHVJ32D"));
            }
        });
        PendingIntent a14 = a(context, ReaderEditChooserActivity.class, 203, new cg.l<Intent, tf.d>() { // from class: pdf.pdfreader.viewer.editor.free.ui.widget.PdfReaderAppWidgetKt$refreshRemoteView$editPdfIntent$1
            @Override // cg.l
            public /* bridge */ /* synthetic */ tf.d invoke(Intent intent) {
                invoke2(intent);
                return tf.d.f30009a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Intent it) {
                kotlin.jvm.internal.g.e(it, "it");
                String p10 = ea.a.p("OmEWZTtmGW9t", "jPJqdkoo");
                String str = ReaderEditChooserActivity.B;
                it.putExtra(p10, ReaderEditChooserActivity.B);
            }
        });
        if (!TextUtils.isEmpty(a0.f(context))) {
            Locale e10 = a0.e(context);
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(context.getPackageName());
            kotlin.jvm.internal.g.d(resourcesForApplication, ea.a.p("LG9fdBx4Qy4qYSlrFGcNTVRuD2cgcktngIDWdCtvDSgsb190HHhDLiphKWsUZw1OVG0LKQ==", "XPxQbpBc"));
            Configuration configuration = resourcesForApplication.getConfiguration();
            configuration.setLocale(e10);
            resourcesForApplication.updateConfiguration(configuration, null);
            String string = resourcesForApplication.getString(R.string.arg_res_0x7f130456);
            kotlin.jvm.internal.g.d(string, ea.a.p("QWU4bwZyAWUBRltyKHAmbC1jU3Qvby0uhoDuaV9nRFIdcz9yGm4FLgFlVXIKaAloLW5GKQ==", "dH1lqI5J"));
            String string2 = resourcesForApplication.getString(R.string.arg_res_0x7f130192);
            kotlin.jvm.internal.g.d(string2, ea.a.p("PWVCbwxyVGUpRiVyNHAYbFxjD3QsbwsuJmUiUz5yAm4oKGMuCnRFaTRnZGgabQ0p", "Cx8cAVJk"));
            String string3 = resourcesForApplication.getString(R.string.arg_res_0x7f130418);
            kotlin.jvm.internal.g.d(string3, ea.a.p("MGUHb0FyCGU7RglydXAnbFFjM3Qgb1guE2UFUyVyK24lKCYuR3QZaSZnSHJRYzJuTCk=", "x9Bt4kpM"));
            String string4 = resourcesForApplication.getString(R.string.arg_res_0x7f130021);
            kotlin.jvm.internal.g.d(string4, ea.a.p("RWUFb0JyMWU7RglydXAnbFFjM3Qgb1guloDXLiJ0MGlZZ1hhVHQ7byZfBG9bazphSmshKQ==", "IA7v7RDB"));
            String string5 = resourcesForApplication.getString(R.string.arg_res_0x7f13005a);
            kotlin.jvm.internal.g.d(string5, ea.a.p("PWVCbwxyVGUpRiVyNHAYbFxjD3Qsbwsu1oDMbj4oYC48dENpF2cZYTRuJXQUdA1fUnAaKQ==", "YnXz4jY2"));
            remoteViews.setTextViewText(R.id.tv_widget_search, string);
            remoteViews.setTextViewText(R.id.tv_widget_home, string2);
            remoteViews.setTextViewText(R.id.tv_widget_recent, string3);
            remoteViews.setTextViewText(R.id.tv_widget_bookmark, string4);
            remoteViews.setTextViewText(R.id.tv_widget_edit_pdf, string5);
        }
        remoteViews.setOnClickPendingIntent(R.id.ll_widget_search, a10);
        remoteViews.setOnClickPendingIntent(R.id.ll_widget_home, a11);
        remoteViews.setOnClickPendingIntent(R.id.ll_widget_recent, a12);
        remoteViews.setOnClickPendingIntent(R.id.ll_widget_bookmark, a13);
        remoteViews.setOnClickPendingIntent(R.id.ll_widget_edit_pdf, a14);
        t0.d0(x.a(j0.f20206a), null, null, new PdfReaderAppWidgetKt$refreshRemoteView$1(appWidgetManager, i10, remoteViews, null), 3);
    }
}
