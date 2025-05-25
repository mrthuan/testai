package pdf.pdfreader.viewer.editor.free.utils;

import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: GetPDFPasswordProcess.kt */
/* loaded from: classes3.dex */
public final class y implements oo.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GetPDFPasswordProcess f28795a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f28796b;

    public y(x xVar, GetPDFPasswordProcess getPDFPasswordProcess) {
        this.f28795a = getPDFPasswordProcess;
        this.f28796b = xVar;
    }

    @Override // oo.a
    public final void a() {
        GetPDFPasswordProcess getPDFPasswordProcess = this.f28795a;
        ReaderPDFCore readerPDFCore = getPDFPasswordProcess.f28523d;
        boolean z10 = false;
        if (readerPDFCore != null && readerPDFCore.authenticatePassword(getPDFPasswordProcess.a().A())) {
            z10 = true;
        }
        x xVar = this.f28796b;
        if (z10) {
            String A = getPDFPasswordProcess.a().A();
            kotlin.jvm.internal.g.d(A, ea.a.p("Wm47dQdQFWQ2aVVsBmd4YytuRmUodA==", "Do0lGWrW"));
            getPDFPasswordProcess.f28524e = A;
            getPDFPasswordProcess.a().A = 2;
            getPDFPasswordProcess.a().dismiss();
            xVar.i(getPDFPasswordProcess.f28524e, true);
            return;
        }
        xVar.g();
        getPDFPasswordProcess.a().g();
    }

    @Override // oo.a
    public final void cancel() {
    }
}
