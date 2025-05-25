package lib.zj.pdfeditor;

import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PDFPageView f21510a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f21511b;
    public final /* synthetic */ String c;

    public /* synthetic */ j(PDFPageView pDFPageView, boolean z10, String str) {
        this.f21510a = pDFPageView;
        this.f21511b = z10;
        this.c = str;
    }

    @Override // lib.zj.pdfeditor.x
    public final void f(PDFReaderView pDFReaderView) {
        int i10 = PDFPageView.f21175y1;
        PDFPageView pDFPageView = this.f21510a;
        pDFPageView.getClass();
        qg.a inkTouchListener = pDFReaderView.getInkTouchListener();
        if (inkTouchListener != null) {
            inkTouchListener.h(pDFPageView.f21268b.getResources().getString(R.string.arg_res_0x7f13036a));
        }
        if (this.f21511b) {
            pDFReaderView.x(this.c);
        }
    }
}
