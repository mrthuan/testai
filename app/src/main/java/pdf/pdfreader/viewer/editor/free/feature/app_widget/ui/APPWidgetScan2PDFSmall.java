package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui;

import android.content.Context;
import android.content.res.Resources;
import android.widget.RemoteViews;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: APPWidgetScan2PDFSmall.kt */
/* loaded from: classes3.dex */
public final class APPWidgetScan2PDFSmall extends BaseAPPWidget {
    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final int a() {
        return R.layout.app_widget_scan2pdf_small;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final int c() {
        return R.layout.app_widget_scan2pdf_small;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final void d(Context context, RemoteViews remoteViews) {
        g.e(context, "context");
        remoteViews.setOnClickPendingIntent(R.id.widget_small_scan2pdf_iv, BaseAPPWidget.f(context, 41, ea.a.p("Q2EDZTl3O2QvZRJfR2M2bgpwNmY=", "qW3dfRfp")));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final boolean e() {
        return false;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final void g(Context context, Resources resources, RemoteViews remoteViews) {
        g.e(context, "context");
        String string = resources.getString(R.string.arg_res_0x7f130453);
        g.d(string, ea.a.p("QWU4bwZyAWUBRltyKHAmbC1jU3Qvby0ug4DgaR5ncVIdcz9yGm4FLgFjVW42dDlfNGRUKQ==", "aFpYDvOG"));
        remoteViews.setTextViewText(R.id.widget_small_scan2pdf_tv_title, string);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final boolean i(int i10) {
        return false;
    }
}
