package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.widget.RemoteViews;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: APPWidgetPDFTools2.kt */
/* loaded from: classes3.dex */
public final class APPWidgetPDFTools2 extends BaseAPPWidget {
    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final int a() {
        return R.layout.app_widget_pdf_tools_02;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final int b() {
        return R.layout.app_widget_pdf_tools_02_normal;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final int c() {
        return R.layout.app_widget_pdf_tools_02_small;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final void d(Context context, RemoteViews remoteViews) {
        g.e(context, "context");
        PendingIntent f10 = BaseAPPWidget.f(context, 20, ea.a.p("Q2EsZSxzB2EAY2g=", "s5CIFqbV"));
        PendingIntent f11 = BaseAPPWidget.f(context, 25, ea.a.p("SWEVZTdoNm0tXxJvW2xz", "vO9rhYtt"));
        PendingIntent f12 = BaseAPPWidget.f(context, 21, ea.a.p("Q2EsZSxoDW0XX0RkZg==", "SNtrBEHH"));
        PendingIntent f13 = BaseAPPWidget.f(context, 22, ea.a.p("RmEeZWxoJ20tXxFvRmQ=", "BP6y3HFz"));
        PendingIntent f14 = BaseAPPWidget.f(context, 23, ea.a.p("NmEvZTJoB20tXwN4V2Vs", "Q4FHmhFk"));
        PendingIntent f15 = BaseAPPWidget.f(context, 24, ea.a.p("P2FWZSZoWG0_XzpwdA==", "vPmjcj2c"));
        remoteViews.setOnClickPendingIntent(R.id.widget_tools2_ll_top, f10);
        remoteViews.setOnClickPendingIntent(R.id.widget_tools2_iv_menu, f11);
        remoteViews.setOnClickPendingIntent(R.id.widget_tools2_ll_pdf, f12);
        remoteViews.setOnClickPendingIntent(R.id.widget_tools2_ll_word, f13);
        remoteViews.setOnClickPendingIntent(R.id.widget_tools2_ll_xls, f14);
        remoteViews.setOnClickPendingIntent(R.id.widget_tools2_ll_ppt, f15);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final boolean e() {
        return true;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final void g(Context context, Resources resources, RemoteViews remoteViews) {
        g.e(context, "context");
        String string = resources.getString(R.string.arg_res_0x7f130456);
        g.d(string, ea.a.p("PWVCbwxyVGUpRiVyNHAYbFxjD3QsbwsumoDNaS9neVJhc0VyEG5QLillK3IWaDdoXG4aKQ==", "FMPtxkAQ"));
        remoteViews.setTextViewText(R.id.widget_tools2_tv_search, string);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final boolean i(int i10) {
        if (i10 < 130) {
            return true;
        }
        return false;
    }
}
