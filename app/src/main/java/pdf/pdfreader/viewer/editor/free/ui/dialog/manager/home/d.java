package pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home;

import pdf.pdfreader.viewer.editor.free.ui.dialog.x;

/* compiled from: MemoryLowDialogChain.kt */
/* loaded from: classes3.dex */
public final class d extends po.a {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f27679d = 0;
    public x c;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r0 != false) goto L11;
     */
    @Override // po.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g.e(r4, r0)
            java.lang.Boolean r0 = r3.f28987b
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.g.a(r0, r1)
            r1 = 0
            if (r0 == 0) goto L39
            pdf.pdfreader.viewer.editor.free.ui.dialog.x r0 = r3.c
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 == 0) goto L1f
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L1f
            r0 = r2
            goto L20
        L1f:
            r0 = r1
        L20:
            if (r0 == 0) goto L39
        L22:
            pdf.pdfreader.viewer.editor.free.ui.dialog.x r0 = new pdf.pdfreader.viewer.editor.free.ui.dialog.x
            r0.<init>(r4)
            r3.c = r0
            pdf.pdfreader.viewer.editor.free.feature.scan.dialog.e r4 = new pdf.pdfreader.viewer.editor.free.feature.scan.dialog.e
            r4.<init>(r3, r2)
            r0.setOnCancelListener(r4)
            pdf.pdfreader.viewer.editor.free.ui.dialog.x r4 = r3.c
            if (r4 == 0) goto L38
            r4.show()
        L38:
            return r2
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.d.c(android.content.Context):boolean");
    }

    @Override // po.a
    public final boolean d() {
        x xVar = this.c;
        if (xVar != null) {
            return xVar.isShowing();
        }
        return false;
    }

    @Override // po.a
    public final void a() {
    }
}
