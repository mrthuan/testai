package pdf.pdfreader.viewer.editor.free.utils;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: GetPDFPasswordProcess.kt */
/* loaded from: classes3.dex */
public final class GetPDFPasswordProcess {

    /* renamed from: a  reason: collision with root package name */
    public final Context f28521a;

    /* renamed from: b  reason: collision with root package name */
    public final tf.c f28522b;
    public final tf.c c;

    /* renamed from: d  reason: collision with root package name */
    public ReaderPDFCore f28523d;

    /* renamed from: e  reason: collision with root package name */
    public String f28524e;

    public GetPDFPasswordProcess(Context context) {
        kotlin.jvm.internal.g.e(context, ea.a.p("UG8ldBZ4dA==", "hCtSwmUQ"));
        this.f28521a = context;
        this.f28522b = kotlin.a.a(new cg.a<pdf.pdfreader.viewer.editor.free.ui.dialog.v>() { // from class: pdf.pdfreader.viewer.editor.free.utils.GetPDFPasswordProcess$inputPwdDialog$2
            {
                super(0);
            }

            @Override // cg.a
            public final pdf.pdfreader.viewer.editor.free.ui.dialog.v invoke() {
                return new pdf.pdfreader.viewer.editor.free.ui.dialog.v(GetPDFPasswordProcess.this.f28521a);
            }
        });
        this.c = kotlin.a.a(new cg.a<Handler>() { // from class: pdf.pdfreader.viewer.editor.free.utils.GetPDFPasswordProcess$mainHandler$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // cg.a
            public final Handler invoke() {
                return new Handler(Looper.getMainLooper());
            }
        });
        this.f28524e = "";
    }

    public final pdf.pdfreader.viewer.editor.free.ui.dialog.v a() {
        return (pdf.pdfreader.viewer.editor.free.ui.dialog.v) this.f28522b.getValue();
    }

    public final void b(String path, x xVar) {
        kotlin.jvm.internal.g.e(path, "path");
        w0.a().c.execute(new qb.c1(8, this, path, xVar));
    }
}
