package pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui;

/* compiled from: BasePdf2ImageActivity.kt */
/* loaded from: classes3.dex */
public final class k implements oo.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BasePdf2ImageActivity f25556a;

    public k(BasePdf2ImageActivity basePdf2ImageActivity) {
        this.f25556a = basePdf2ImageActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    @Override // oo.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r5 = this;
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.BasePdf2ImageActivity r0 = r5.f25556a
            lib.zj.pdfeditor.ReaderPDFCore r1 = r0.M
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1a
            pdf.pdfreader.viewer.editor.free.ui.dialog.v r4 = r0.V
            if (r4 == 0) goto L11
            java.lang.String r4 = r4.A()
            goto L12
        L11:
            r4 = r3
        L12:
            boolean r1 = r1.authenticatePassword(r4)
            if (r1 != r2) goto L1a
            r1 = r2
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 == 0) goto L55
            java.lang.String r1 = "Y2QtMjptA2cXUF1jOXIzdi1lRUEldCp2BXR5"
            java.lang.String r4 = "lWHcO0gn"
            ea.a.p(r1, r4)
            java.lang.String r1 = "XGtxIANhEXMFb0ZkSWklIDZpVWh0"
            java.lang.String r4 = "gCbVGd0F"
            ea.a.p(r1, r4)
            java.lang.String r1 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a
            pdf.pdfreader.viewer.editor.free.ui.dialog.v r1 = r0.V
            if (r1 == 0) goto L35
            java.lang.String r3 = r1.A()
        L35:
            if (r3 != 0) goto L39
            java.lang.String r3 = ""
        L39:
            r0.J = r3
            pdf.pdfreader.viewer.editor.free.ui.dialog.v r1 = r0.V
            if (r1 != 0) goto L40
            goto L43
        L40:
            r3 = 2
            r1.A = r3
        L43:
            r0.B1(r1)
            pdf.pdfreader.viewer.editor.free.utils.w0 r1 = pdf.pdfreader.viewer.editor.free.utils.w0.a()
            java.util.concurrent.ExecutorService r1 = r1.c
            pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.f r3 = new pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.f
            r3.<init>(r0, r2)
            r1.execute(r3)
            goto L5c
        L55:
            pdf.pdfreader.viewer.editor.free.ui.dialog.v r0 = r0.V
            if (r0 == 0) goto L5c
            r0.g()
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui.k.a():void");
    }

    @Override // oo.a
    public final void cancel() {
        BasePdf2ImageActivity basePdf2ImageActivity = this.f25556a;
        basePdf2ImageActivity.H.postDelayed(new d(basePdf2ImageActivity, 1), 150L);
    }
}
