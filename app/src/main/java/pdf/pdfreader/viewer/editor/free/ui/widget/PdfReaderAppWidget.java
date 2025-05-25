package pdf.pdfreader.viewer.editor.free.ui.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: PdfReaderAppWidget.kt */
/* loaded from: classes3.dex */
public final class PdfReaderAppWidget extends AppWidgetProvider {
    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i10, Bundle bundle) {
        RemoteViews remoteViews;
        super.onAppWidgetOptionsChanged(context, appWidgetManager, i10, bundle);
        if (bundle != null && context != null) {
            bundle.getInt(ea.a.p("UnA7VxpkBWUGTV1uPmkydGg=", "SNeStHtA"));
            if (bundle.getInt(ea.a.p("LnBBVxBkUGUuTSNuPWUBZ110", "TfEPAvZj")) < 110) {
                remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.pdf_reader_app_widget_small);
            } else {
                remoteViews = new RemoteViews(context.getPackageName(), (int) R.layout.pdf_reader_app_widget);
            }
            if (appWidgetManager != null) {
                PdfReaderAppWidgetKt.b(context, remoteViews, appWidgetManager, i10);
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        kotlin.jvm.internal.g.e(context, "context");
        kotlin.jvm.internal.g.e(appWidgetManager, "appWidgetManager");
        kotlin.jvm.internal.g.e(appWidgetIds, "appWidgetIds");
        for (int i10 : appWidgetIds) {
            PdfReaderAppWidgetKt.b(context, new RemoteViews(context.getPackageName(), (int) R.layout.pdf_reader_app_widget), appWidgetManager, i10);
        }
    }
}
