package lib.zj.pdfeditor;

import ao.i2;
import lib.zj.pdfeditor.text.PDFFreeTextEditView;
import lj.b;
import qb.c1;

/* compiled from: PDFPageView.java */
/* loaded from: classes3.dex */
public final class p implements b.InterfaceC0288b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PDFFreeTextEditView f21549a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ lj.b f21550b;
    public final /* synthetic */ PDFPageView c;

    /* compiled from: PDFPageView.java */
    /* loaded from: classes3.dex */
    public class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PDFFreeTextEditView f21551a;

        public a(PDFFreeTextEditView pDFFreeTextEditView) {
            this.f21551a = pDFFreeTextEditView;
        }

        @Override // lj.b.a
        public final void call() {
            p pVar = p.this;
            lj.b textParamChangedListener = pVar.c.getTextParamChangedListener();
            if (textParamChangedListener != null) {
                ((i2) textParamChangedListener).c();
            }
            pVar.c.l2(this.f21551a);
        }
    }

    public p(PDFPageView pDFPageView, PDFFreeTextEditView pDFFreeTextEditView, lj.b bVar) {
        this.c = pDFPageView;
        this.f21549a = pDFFreeTextEditView;
        this.f21550b = bVar;
    }

    public final void a() {
        PDFFreeTextEditView pDFFreeTextEditView = this.f21549a;
        pDFFreeTextEditView.post(new c1(2, this, pDFFreeTextEditView, this.f21550b));
    }
}
