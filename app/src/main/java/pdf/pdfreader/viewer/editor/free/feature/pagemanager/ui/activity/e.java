package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity;

/* compiled from: BaseOpenPdfActivity.kt */
/* loaded from: classes3.dex */
public final class e implements oo.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f25310a;

    public e(f fVar) {
        this.f25310a = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    @Override // oo.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r5 = this;
            pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.f r0 = r5.f25310a
            lib.zj.pdfeditor.ReaderPDFCore r1 = r0.f25317x
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            pdf.pdfreader.viewer.editor.free.ui.dialog.v r4 = r0.A
            if (r4 == 0) goto L11
            java.lang.String r4 = r4.A()
            goto L12
        L11:
            r4 = r2
        L12:
            boolean r1 = r1.authenticatePassword(r4)
            if (r1 != r3) goto L1a
            r1 = r3
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 == 0) goto L4c
            java.lang.String r1 = "H2RXMjBtVmc_UCNjJXINdlxlGUEmdAx2LnR5"
            java.lang.String r4 = "zt1BGdmm"
            ea.a.p(r1, r4)
            java.lang.String r1 = "BWsNIB1hFnM_bxRkFGkkIEppNWh0"
            java.lang.String r4 = "v3j7meAF"
            ea.a.p(r1, r4)
            java.lang.String r1 = pdf.pdfreader.viewer.editor.free.utils.n0.f28727a
            pdf.pdfreader.viewer.editor.free.ui.dialog.v r1 = r0.A
            if (r1 == 0) goto L37
            java.lang.String r2 = r1.A()
        L37:
            if (r2 != 0) goto L3b
            java.lang.String r2 = ""
        L3b:
            r0.f25315v = r2
            pdf.pdfreader.viewer.editor.free.ui.dialog.v r1 = r0.A
            if (r1 != 0) goto L42
            goto L45
        L42:
            r2 = 2
            r1.A = r2
        L45:
            r0.B1(r1)
            r0.b2(r3)
            goto L53
        L4c:
            pdf.pdfreader.viewer.editor.free.ui.dialog.v r0 = r0.A
            if (r0 == 0) goto L53
            r0.g()
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.e.a():void");
    }

    @Override // oo.a
    public final void cancel() {
        f fVar = this.f25310a;
        fVar.f25313t.postDelayed(new c(fVar, 1), 150L);
    }
}
