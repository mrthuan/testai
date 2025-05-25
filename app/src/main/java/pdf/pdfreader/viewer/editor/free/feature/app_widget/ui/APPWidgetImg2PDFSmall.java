package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui;

import android.content.Context;
import android.content.res.Resources;
import android.widget.RemoteViews;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: APPWidgetImg2PDFSmall.kt */
/* loaded from: classes3.dex */
public final class APPWidgetImg2PDFSmall extends BaseAPPWidget {
    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final int a() {
        return R.layout.app_widget_img2pdf_small;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final int c() {
        return R.layout.app_widget_img2pdf_small;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final void d(Context context, RemoteViews remoteViews) {
        g.e(context, "context");
        remoteViews.setOnClickPendingIntent(R.id.widget_small_img2pdf_iv, BaseAPPWidget.f(context, 31, ea.a.p("P2FWZSZ3XmQ9ZT5fHG0PMkVkZg==", "jhPGOrXE")));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final boolean e() {
        return false;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final void g(Context context, Resources resources, RemoteViews remoteViews) {
        g.e(context, "context");
        String string = resources.getString(R.string.arg_res_0x7f13019b);
        g.d(string, ea.a.p("QWU4bwZyAWUBRltyKHAmbC1jU3Qvby0uhIDkbh8oZy5AdDlpHWdMaR9hU2U2dDlfNGRUKQ==", "fBx5QTgV"));
        remoteViews.setTextViewText(R.id.widget_small_img2pdf_tv_title, string);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final boolean i(int i10) {
        return false;
    }
}
