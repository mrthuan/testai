package pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home;

import pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog;

/* compiled from: WidgetDialogChain.kt */
/* loaded from: classes3.dex */
public final class j extends po.a {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f27694f = 0;
    public final pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.f c;

    /* renamed from: d  reason: collision with root package name */
    public final pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b f27695d;

    /* renamed from: e  reason: collision with root package name */
    public PdfReaderAppWidgetNewDialog f27696e;

    public j(pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.f fVar, pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b bVar) {
        kotlin.jvm.internal.g.e(fVar, ea.a.p("JWgMcgBjN3QaYRJpW242bF1IN2w5ZXI=", "7gVctBfF"));
        kotlin.jvm.internal.g.e(bVar, ea.a.p("WHAbUzR0DGkmZzZlRm0-c0tpPW4AbkJyG2QEYzRy", "UL9kQxEp"));
        this.c = fVar;
        this.f27695d = bVar;
    }

    @Override // po.a
    public final void a() {
        PdfReaderAppWidgetNewDialog pdfReaderAppWidgetNewDialog = this.f27696e;
        if (pdfReaderAppWidgetNewDialog != null) {
            pdfReaderAppWidgetNewDialog.cancel();
        }
    }

    @Override // po.a
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r0 != false) goto L19;
     */
    @Override // po.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g.e(r7, r0)
            java.lang.String r0 = "C2lQbBZndGg7aW4="
            java.lang.String r1 = "1gbg8QiP"
            ea.a.p(r0, r1)
            java.lang.Boolean r0 = r6.f28987b
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.g.a(r0, r1)
            r1 = 0
            if (r0 == 0) goto L6a
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r0 < r2) goto L6a
            int r0 = eo.e.f(r7)
            r2 = 3
            if (r0 < r2) goto L25
            return r1
        L25:
            android.appwidget.AppWidgetManager r0 = android.appwidget.AppWidgetManager.getInstance(r7)
            boolean r0 = c4.h.u(r0)
            if (r0 != 0) goto L30
            return r1
        L30:
            pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog r0 = r6.f27696e
            r3 = 1
            if (r0 == 0) goto L40
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L3d
            r0 = r3
            goto L3e
        L3d:
            r0 = r1
        L3e:
            if (r0 == 0) goto L6a
        L40:
            pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog r0 = new pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.PdfReaderAppWidgetNewDialog
            pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.WidgetFromType r1 = pdf.pdfreader.viewer.editor.free.feature.app_widget.ui.dialog.WidgetFromType.Guide
            pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.f r4 = r6.c
            pdf.pdfreader.viewer.editor.free.feature.app_widget.helper.b r5 = r6.f27695d
            r0.<init>(r7, r1, r4, r5)
            r6.f27696e = r0
            com.google.android.tools.d r1 = new com.google.android.tools.d
            r4 = 18
            r1.<init>(r6, r4)
            r0.K = r1
            r0.show()
            pdf.pdfreader.viewer.editor.free.utils.event.AppOpenSource r0 = pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent.f28650a
            java.lang.String r0 = "RGkvZxZ0EV8VdV1kZQ=="
            java.lang.String r1 = "idwdSTGg"
            java.lang.String r0 = ea.a.p(r0, r1)
            pdf.pdfreader.viewer.editor.free.utils.event.AppCoreFilterEvent.g(r0)
            eo.e.p(r7, r2)
            return r3
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.j.c(android.content.Context):boolean");
    }

    @Override // po.a
    public final boolean d() {
        PdfReaderAppWidgetNewDialog pdfReaderAppWidgetNewDialog = this.f27696e;
        if (pdfReaderAppWidgetNewDialog != null) {
            return pdfReaderAppWidgetNewDialog.isShowing();
        }
        return false;
    }
}
