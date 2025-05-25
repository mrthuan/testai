package pdf.pdfreader.viewer.editor.free.feature.app_widget.ui;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.widget.RemoteViews;
import kotlin.jvm.internal.g;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: APPWidgetPDFTools1.kt */
/* loaded from: classes3.dex */
public final class APPWidgetPDFTools1 extends BaseAPPWidget {
    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final int a() {
        return R.layout.app_widget_pdf_tools_01;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final int b() {
        return R.layout.app_widget_pdf_tools_01_normal;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final int c() {
        return R.layout.app_widget_pdf_tools_01_small;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final void d(Context context, RemoteViews remoteViews) {
        g.e(context, "context");
        PendingIntent f10 = BaseAPPWidget.f(context, 10, ea.a.p("Q2EsZSxzB2EAY2g=", "Zfe2KF9a"));
        PendingIntent f11 = BaseAPPWidget.f(context, 11, ea.a.p("Q2EsZSxoDW0XX1VsBV8waShl", "5r8oEUyp"));
        PendingIntent f12 = BaseAPPWidget.f(context, 12, ea.a.p("R2EjZRdoF20tXxRlV2U5dA==", "Lr7DHx4l"));
        PendingIntent f13 = BaseAPPWidget.f(context, 13, ea.a.p("Q2EsZSxoDW0XX1ZvBms7YTZr", "tNWYl10G"));
        PendingIntent f14 = BaseAPPWidget.f(context, 14, ea.a.p("BWEVZWx3W2QvZRJfUWQ-dA==", "rBur32Bq"));
        remoteViews.setOnClickPendingIntent(R.id.widget_tools1_ll_top, f10);
        remoteViews.setOnClickPendingIntent(R.id.widget_tools1_ll_home, f11);
        remoteViews.setOnClickPendingIntent(R.id.widget_tools1_ll_recent, f12);
        remoteViews.setOnClickPendingIntent(R.id.widget_tools1_ll_bookmarks, f13);
        remoteViews.setOnClickPendingIntent(R.id.widget_tools1_ll_edit, f14);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final boolean e() {
        return true;
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final void g(Context context, Resources resources, RemoteViews remoteViews) {
        g.e(context, "context");
        String string = resources.getString(R.string.arg_res_0x7f130456);
        g.d(string, ea.a.p("PWVCbwxyVGUpRiVyNHAYbFxjD3Qsbwsu0YD3aRZnfVJhc0VyEG5QLillK3IWaDdoXG4aKQ==", "Bjyd3QxU"));
        String string2 = resources.getString(R.string.arg_res_0x7f130192);
        g.d(string2, ea.a.p("O2UZbwZyN2U7RglydXAnbFFjM3Qgb1guE2UFUyVyK24uKDguAHQmaSZnSGhbbTIp", "H2IjsTnu"));
        String string3 = resources.getString(R.string.arg_res_0x7f130418);
        g.d(string3, ea.a.p("QWU4bwZyAWUBRltyKHAmbC1jU3Qvby0uIWUtUxVyPG5UKBkuAHQQaRxnGnIMYzNuMCk=", "FYaUKhrN"));
        String string4 = resources.getString(R.string.arg_res_0x7f130021);
        g.d(string4, ea.a.p("QWU4bwZyAWUBRltyKHAmbC1jU3Qvby0ug4DFLgJ0HGldZ2VhEHQLbxxfVm8GazthNmtBKQ==", "acqnggeY"));
        String string5 = resources.getString(R.string.arg_res_0x7f13010f);
        g.d(string5, ea.a.p("RmVKbwNyO2U7RglydXAnbFFjM3Qgb1guloDXUyVyK25TKGsuBXQqaSZnSGVQaSNfSGQ0KQ==", "vk49vXEB"));
        remoteViews.setTextViewText(R.id.widget_tools1_tv_search, string);
        remoteViews.setTextViewText(R.id.widget_tools1_tv_home, string2);
        remoteViews.setTextViewText(R.id.widget_tools1_tv_recent, string3);
        remoteViews.setTextViewText(R.id.widget_tools1_tv_bookmarks, string4);
        remoteViews.setTextViewText(R.id.widget_tools1_tv_edit_pdf, string5);
    }

    @Override // pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.BaseAPPWidget
    public final boolean i(int i10) {
        if (i10 < 130) {
            return true;
        }
        return false;
    }
}
