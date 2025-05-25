package pdf.pdfreader.viewer.editor.free.feature.scan.dialog;

import android.content.DialogInterface;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25684a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f25685b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f25684a = i10;
        this.f25685b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f25684a;
        Object obj = this.f25685b;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                kotlin.jvm.internal.g.e(fVar, ea.a.p("R2gic1cw", "uHv5ZENC"));
                cg.l<? super Boolean, tf.d> lVar = fVar.f25687z;
                if (lVar != null) {
                    lVar.invoke(Boolean.valueOf(fVar.C));
                    return;
                }
                return;
            default:
                pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.d dVar = (pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.d) obj;
                int i11 = pdf.pdfreader.viewer.editor.free.ui.dialog.manager.home.d.f27679d;
                kotlin.jvm.internal.g.e(dVar, ea.a.p("Q2gTc2sw", "TH7zOHw2"));
                dVar.c = null;
                dVar.f28987b = Boolean.FALSE;
                return;
        }
    }
}
