package pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home;

import android.content.Context;

/* compiled from: OpenWithDialogChain.kt */
/* loaded from: classes3.dex */
public final class e extends po.a {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f27680f = 0;
    public oo.g c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f27681d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27682e;

    @Override // po.a
    public final void a() {
        oo.g gVar = this.c;
        if (gVar != null) {
            gVar.cancel();
        }
    }

    @Override // po.a
    public final boolean b() {
        return true;
    }

    @Override // po.a
    public final boolean c(Context context) {
        kotlin.jvm.internal.g.e(context, "context");
        return e(context, true);
    }

    @Override // po.a
    public final boolean d() {
        oo.g gVar = this.c;
        if (gVar != null) {
            return gVar.isShowing();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
        if (r0 != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(android.content.Context r6, boolean r7) {
        /*
            r5 = this;
            android.app.Activity r6 = pdf.pdfreader.viewer.editor.free.utils.extension.c.l(r6)
            boolean r0 = r6 instanceof androidx.fragment.app.u
            if (r0 == 0) goto Lb
            androidx.fragment.app.u r6 = (androidx.fragment.app.u) r6
            goto Lc
        Lb:
            r6 = 0
        Lc:
            r0 = 0
            if (r6 != 0) goto L10
            return r0
        L10:
            pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog$a r1 = pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog.J
            r2 = r7 ^ 1
            r1.getClass()
            r1 = 1
            int r2 = pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog.a.a(r6, r1, r2)
            java.lang.String r3 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a
            r3 = 2
            if (r2 == r3) goto L7a
            r7 = 3
            if (r2 == r7) goto L77
            r5.f27682e = r1
            oo.g r7 = r5.c
            if (r7 == 0) goto L5b
            boolean r7 = r7.isShowing()
            if (r7 != r1) goto L32
            r7 = r1
            goto L33
        L32:
            r7 = r0
        L33:
            if (r7 == 0) goto L5b
            oo.g r7 = r5.c
            boolean r2 = r7 instanceof pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog
            if (r2 == 0) goto L54
            java.lang.String r2 = "VHUiZGU="
            java.lang.String r3 = "SdbQFxsJ"
            java.lang.String r2 = ea.a.p(r2, r3)
            java.lang.String r3 = "LGxUYQtfRWUpZT5fEW8GZQ=="
            java.lang.String r4 = "XtAnse6G"
            java.lang.String r3 = ea.a.p(r3, r4)
            pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog r7 = (pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog) r7
            java.lang.String r7 = r7.I()
            tn.a.d(r6, r2, r3, r7, r0)
        L54:
            oo.g r7 = r5.c
            if (r7 == 0) goto L5b
            r7.cancel()
        L5b:
            pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog r7 = new pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenDefaultDialog
            java.lang.String r0 = "W28mZQ=="
            java.lang.String r2 = "Dka8uUQ2"
            java.lang.String r0 = ea.a.p(r0, r2)
            androidx.appcompat.libconvert.a r2 = new androidx.appcompat.libconvert.a
            r3 = 17
            r2.<init>(r5, r3)
            r7.<init>(r6, r1, r0, r2)
            r5.c = r7
            r7.show()
            r5.f27681d = r1
            return r1
        L77:
            boolean r6 = r5.f27681d
            return r6
        L7a:
            if (r7 == 0) goto L9e
            oo.g r7 = r5.c
            if (r7 == 0) goto L89
            boolean r7 = r7.isShowing()
            if (r7 != 0) goto L87
            r0 = r1
        L87:
            if (r0 == 0) goto L9e
        L89:
            pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog r7 = new pdf.pdfreader.viewer.editor.free.ui.dialog.PdfReaderOpenClearDialog
            r7.<init>(r6, r1)
            d9.g r6 = new d9.g
            r0 = 19
            r6.<init>(r5, r0)
            r7.K = r6
            r5.c = r7
            r7.show()
            r5.f27681d = r1
        L9e:
            boolean r6 = r5.f27681d
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.e.e(android.content.Context, boolean):boolean");
    }
}
