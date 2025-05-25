package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui;

import android.content.Context;
import android.content.res.Resources;
import android.widget.RemoteViews;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: APPWidgetEdit2PDFSmall.kt */
/* loaded from: classes3.dex */
public final class APPWidgetEdit2PDFSmall extends BaseAPPWidget {
    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final int a() {
        return R.layout.app_widget_edit2pdf_small;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final int c() {
        return R.layout.app_widget_edit2pdf_small;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final void d(Context context, RemoteViews remoteViews) {
        g.e(context, "context");
        remoteViews.setOnClickPendingIntent(R.id.widget_small_edit2pdf_iv, BaseAPPWidget.f(context, 51, ea.a.p("Q2EsZSx3C2QVZUBfDGQ_dA==", "xhZR3VS9")));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final boolean e() {
        return false;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final void g(Context context, Resources resources, RemoteViews remoteViews) {
        g.e(context, "context");
        String string = resources.getString(R.string.arg_res_0x7f13010f);
        g.d(string, ea.a.p("FWUVbz9yNWU7RglydXAnbFFjM3Qgb1guloDXUyVyK24AKDQuOXQkaSZnSGVQaSNfSGQ0KQ==", "O9gfJVxM"));
        remoteViews.setTextViewText(R.id.widget_small_edit2pdf_tv_title, string);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final boolean i(int i10) {
        return false;
    }
}
