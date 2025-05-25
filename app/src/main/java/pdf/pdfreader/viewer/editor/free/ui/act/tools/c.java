package pdf.pdfreader.viewer.editor.free.ui.act.tools;

import androidx.lifecycle.x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27057a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f27058b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f27057a = i10;
        this.f27058b = obj;
    }

    @Override // androidx.lifecycle.x
    public final void m(Object obj) {
        int i10 = this.f27057a;
        Object obj2 = this.f27058b;
        switch (i10) {
            case 0:
                OperatePDFWatcherActivity operatePDFWatcherActivity = (OperatePDFWatcherActivity) obj2;
                nl.g gVar = (nl.g) obj;
                kotlin.jvm.internal.g.e(operatePDFWatcherActivity, ea.a.p("R2gic1cw", "LF0myZQe"));
                if (gVar != null) {
                    operatePDFWatcherActivity.finish();
                    return;
                }
                return;
            default:
                pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = (pdf.pdfreader.viewer.editor.free.ui.frag.a) obj2;
                Integer num = (Integer) obj;
                ro.c cVar = pdf.pdfreader.viewer.editor.free.ui.frag.a.f27997y0;
                aVar.getClass();
                if (num.intValue() >= 0 && num.intValue() < 5) {
                    aVar.f28000f0.w(num.intValue(), false);
                    return;
                }
                return;
        }
    }
}
