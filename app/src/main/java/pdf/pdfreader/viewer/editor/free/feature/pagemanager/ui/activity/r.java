package pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity;

import lib.zj.pdfeditor.ReaderPDFCore;
import pdf.pdfreader.viewer.editor.free.feature.pagemanager.ui.activity.PDFPageManagerActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25342a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PDFPageManagerActivity f25343b;

    public /* synthetic */ r(PDFPageManagerActivity pDFPageManagerActivity, int i10) {
        this.f25342a = i10;
        this.f25343b = pDFPageManagerActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ij.e eVar;
        int i10 = this.f25342a;
        PDFPageManagerActivity pDFPageManagerActivity = this.f25343b;
        switch (i10) {
            case 0:
                PDFPageManagerActivity.a aVar = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("R2gic1cw", "v7SwEIlt"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(pDFPageManagerActivity)) {
                    pDFPageManagerActivity.f25273l0 = System.currentTimeMillis();
                    pDFPageManagerActivity.o2().f1264d.f1510b.setVisibility(0);
                    return;
                }
                return;
            default:
                PDFPageManagerActivity.a aVar2 = PDFPageManagerActivity.H0;
                kotlin.jvm.internal.g.e(pDFPageManagerActivity, ea.a.p("O2hYc10w", "dxvbCsQu"));
                ReaderPDFCore readerPDFCore = pDFPageManagerActivity.f25317x;
                if (readerPDFCore != null) {
                    eVar = readerPDFCore.undoPageManageAction();
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    pDFPageManagerActivity.f25313t.post(new l.r(23, eVar, pDFPageManagerActivity));
                    return;
                }
                return;
        }
    }
}
