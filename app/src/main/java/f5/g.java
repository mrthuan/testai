package f5;

import android.content.DialogInterface;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements DialogInterface.OnDismissListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17104a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f17105b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f17104a = i10;
        this.f17105b = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.c cVar;
        int i10 = this.f17104a;
        Object obj = this.f17105b;
        switch (i10) {
            case 0:
                i this$0 = (i) obj;
                kotlin.jvm.internal.g.e(this$0, "this$0");
                c5.a b10 = c5.a.b();
                b10.a();
                d5.b b11 = b10.c.f5583e.b();
                if (b11 != null) {
                    b11.onDismiss();
                }
                c cVar2 = this$0.f17110u;
                if (cVar2 != null && (cVar = ReaderHomeActivity.this.E0) != null) {
                    Boolean bool = Boolean.FALSE;
                    pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.i iVar = cVar.f27673g;
                    iVar.f28987b = bool;
                    iVar.c = false;
                    return;
                }
                return;
            default:
                pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.h hVar = (pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.h) obj;
                boolean z10 = pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.h.f27692d;
                kotlin.jvm.internal.g.e(hVar, ea.a.p("O2hYc10w", "NUPrDoxR"));
                hVar.f28987b = Boolean.FALSE;
                pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.h.f27692d = false;
                hVar.c = null;
                return;
        }
    }
}
