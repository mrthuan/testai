package lib.zj.pdfeditor;

import android.content.DialogInterface;
import lib.zj.pdfeditor.p0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f21547a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f21548b;

    public /* synthetic */ o0(Object obj, int i10) {
        this.f21547a = i10;
        this.f21548b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i10 = this.f21547a;
        Object obj = this.f21548b;
        switch (i10) {
            case 0:
                p0.a aVar = ((p0) obj).f21557f;
                if (aVar != null) {
                    try {
                        aVar.interrupt();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            default:
                pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r rVar = (pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r) obj;
                int i11 = pdf.pdfreader.viewer.editor.free.feature.scan.dialog.r.F;
                kotlin.jvm.internal.g.e(rVar, ea.a.p("R2gic1cw", "SX2A0mYo"));
                cg.l<Boolean, tf.d> lVar = rVar.C;
                if (lVar != null) {
                    lVar.invoke(Boolean.valueOf(rVar.D));
                    return;
                }
                return;
        }
    }
}
