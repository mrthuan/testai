package lib.zj.pdfeditor;

import ao.i2;
import lib.zj.pdfeditor.text.PDFFreeTextEditView;
import lj.b;

/* compiled from: PDFPageView.java */
/* loaded from: classes3.dex */
public final class q implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PDFFreeTextEditView f21565a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PDFPageView f21566b;

    public q(PDFPageView pDFPageView, PDFFreeTextEditView pDFFreeTextEditView) {
        this.f21566b = pDFPageView;
        this.f21565a = pDFFreeTextEditView;
    }

    @Override // lj.b.a
    public final void call() {
        PDFPageView pDFPageView = this.f21566b;
        lj.b textParamChangedListener = pDFPageView.getTextParamChangedListener();
        if (textParamChangedListener != null) {
            ((i2) textParamChangedListener).c();
        }
        pDFPageView.l2(this.f21565a);
    }
}
