package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui;

import android.content.Context;
import android.content.res.Resources;
import android.widget.RemoteViews;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.utils.extension.c;

/* compiled from: APPWidgetImg2PDFLarge.kt */
/* loaded from: classes3.dex */
public final class APPWidgetImg2PDFLarge extends BaseAPPWidget {
    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final int a() {
        return R.layout.app_widget_img2pdf_large;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final int c() {
        return R.layout.app_widget_img2pdf_large;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final void d(Context context, RemoteViews remoteViews) {
        g.e(context, "context");
        remoteViews.setOnClickPendingIntent(R.id.widget_large_img2pdf, BaseAPPWidget.f(context, 30, ea.a.p("Q2EsZSx3C2QVZUBfAG0xMjRkZg==", "kQFP0ah8")));
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final boolean e() {
        return false;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final void g(Context context, Resources resources, RemoteViews remoteViews) {
        g.e(context, "context");
        String string = resources.getString(R.string.arg_res_0x7f13019c);
        g.d(string, ea.a.p("PWVCbwxyVGUpRiVyNHAYbFxjD3QsbwsukoDfKBMuN3Q9aV9nV2laYT1lFXQaXxhkU19fKQ==", "ZjzDpyAD"));
        remoteViews.setTextViewText(R.id.widget_large_img2pdf_tv_title, string);
        if (c.j(context)) {
            remoteViews.setImageViewResource(R.id.widget_large_img2pdf, R.drawable.ic_widget_single_img2pdf_large_rtl);
        } else {
            remoteViews.setImageViewResource(R.id.widget_large_img2pdf, R.drawable.ic_widget_single_img2pdf_large);
        }
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final boolean i(int i10) {
        return false;
    }
}
