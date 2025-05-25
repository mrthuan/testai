package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui;

import android.content.Context;
import android.content.res.Resources;
import android.widget.RemoteViews;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.extension.c;

/* compiled from: APPWidgetScan2PDFLarge.kt */
/* loaded from: classes3.dex */
public final class APPWidgetScan2PDFLarge extends BaseAPPWidget {
    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final int a() {
        return R.layout.app_widget_scan2pdf_large;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final int c() {
        return R.layout.app_widget_scan2pdf_large;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final void d(Context context, RemoteViews remoteViews) {
        g.e(context, "context");
        remoteViews.setOnClickPendingIntent(R.id.widget_large_scan2pdf, BaseAPPWidget.f(context, 40, ea.a.p("P2FWZSZ3XmQ9ZT5fBmMJbgdwCmY=", "VJkyzXf4")));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final boolean e() {
        return false;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final void g(Context context, Resources resources, RemoteViews remoteViews) {
        g.e(context, "context");
        String string = resources.getString(R.string.arg_res_0x7f13033d);
        g.d(string, ea.a.p("PWVCbwxyVGUpRiVyNHAYbFxjD3Qsbwsuj4DhcztyDG4oLkFkH19EYztuJGUHX1lfUnAaKQ==", "f6KGmGOe"));
        remoteViews.setTextViewText(R.id.widget_large_scan2pdf_tv_title, string);
        if (c.j(context)) {
            remoteViews.setImageViewResource(R.id.widget_large_scan2pdf, R.drawable.ic_widget_single_pdf_scanner_large_rtl);
        } else {
            remoteViews.setImageViewResource(R.id.widget_large_scan2pdf, R.drawable.ic_widget_single_pdf_scanner_large);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final boolean i(int i10) {
        return false;
    }
}
