package pdf.pdfreader.viewer.editor.free.feature.scan.dialog;

import android.content.DialogInterface;
import pdf.pdfreader.viewer.editor.free.ui.act.ReaderHomeActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25681a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f25682b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f25681a = i10;
        this.f25682b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f25681a;
        Object obj = this.f25682b;
        switch (i10) {
            case 0:
                c cVar = (c) obj;
                kotlin.jvm.internal.g.e(cVar, ea.a.p("R2gic1cw", "RwxPaHVk"));
                cg.l<Boolean, tf.d> lVar = cVar.A;
                if (lVar != null) {
                    lVar.invoke(Boolean.valueOf(cVar.B));
                    return;
                }
                return;
            case 1:
                pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.f fVar = (pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.f) obj;
                int i11 = pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.f.f27683g;
                kotlin.jvm.internal.g.e(fVar, ea.a.p("O2hYc10w", "64MNJFvv"));
                fVar.f28987b = Boolean.FALSE;
                fVar.c = null;
                return;
            default:
                ap.d dVar = (ap.d) obj;
                int i12 = ap.d.G;
                kotlin.jvm.internal.g.e(dVar, ea.a.p("O2hYc10w", "M2vw3XQQ"));
                f5.c cVar2 = dVar.f5160u;
                if (cVar2 != null) {
                    ((ReaderHomeActivity.k0) cVar2).X();
                }
                ap.d.x();
                return;
        }
    }
}
