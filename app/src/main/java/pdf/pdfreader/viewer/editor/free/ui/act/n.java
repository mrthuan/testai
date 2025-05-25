package pdf.pdfreader.viewer.editor.free.ui.act;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26959a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ReaderHomeActivity f26960b;

    public /* synthetic */ n(ReaderHomeActivity readerHomeActivity, int i10) {
        this.f26959a = i10;
        this.f26960b = readerHomeActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pdf.pdfreader.viewer.editor.free.ui.frag.n nVar;
        pdf.pdfreader.viewer.editor.free.ui.adapter.d dVar;
        int i10 = this.f26959a;
        ReaderHomeActivity readerHomeActivity = this.f26960b;
        switch (i10) {
            case 0:
                pdf.pdfreader.viewer.editor.free.ui.frag.a aVar = readerHomeActivity.M;
                if (aVar != null && (nVar = aVar.f28004j0) != null && nVar.f22162k0 != null && (dVar = nVar.E0) != null && nVar.P0 >= 0) {
                    int itemCount = dVar.getItemCount();
                    int i11 = nVar.P0;
                    int i12 = i11 + 2;
                    if (i12 < itemCount) {
                        pdf.pdfreader.viewer.editor.free.utils.extension.g.d(i12, nVar.f22162k0);
                        return;
                    } else if (i11 < itemCount) {
                        pdf.pdfreader.viewer.editor.free.utils.extension.g.d(i11, nVar.f22162k0);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                pdf.pdfreader.viewer.editor.free.ui.frag.a aVar2 = readerHomeActivity.M;
                if (aVar2 != null) {
                    pdf.pdfreader.viewer.editor.free.ui.frag.n nVar2 = aVar2.f28003i0;
                    if (nVar2 != null) {
                        nVar2.Q0();
                    }
                    pdf.pdfreader.viewer.editor.free.ui.frag.n nVar3 = aVar2.f28004j0;
                    if (nVar3 != null) {
                        nVar3.Q0();
                    }
                    pdf.pdfreader.viewer.editor.free.ui.frag.n nVar4 = aVar2.f28005k0;
                    if (nVar4 != null) {
                        nVar4.Q0();
                    }
                    pdf.pdfreader.viewer.editor.free.ui.frag.n nVar5 = aVar2.f28006l0;
                    if (nVar5 != null) {
                        nVar5.Q0();
                    }
                    pdf.pdfreader.viewer.editor.free.ui.frag.n nVar6 = aVar2.f28007m0;
                    if (nVar6 != null) {
                        nVar6.Q0();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
