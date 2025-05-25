package lib.zj.pdfeditor;

import android.graphics.RectF;

/* compiled from: PDFReaderView.java */
/* loaded from: classes3.dex */
public final class v implements s0 {

    /* renamed from: a  reason: collision with root package name */
    public RectF f21736a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PageView f21737b;
    public final /* synthetic */ float c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ float f21738d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ PDFReaderView f21739e;

    public v(PDFReaderView pDFReaderView, PageView pageView, float f10, float f11) {
        this.f21739e = pDFReaderView;
        this.f21737b = pageView;
        this.c = f10;
        this.f21738d = f11;
    }

    @Override // lib.zj.pdfeditor.s0
    public final void a() {
        if (!this.f21736a.isEmpty()) {
            RectF rectF = this.f21736a;
            float f10 = rectF.left;
            int i10 = PDFReaderView.f21220m2;
            PDFReaderView pDFReaderView = this.f21739e;
            pDFReaderView.getClass();
            PageView pageView = this.f21737b;
            rectF.set(PDFReaderView.x0(f10, pageView), PDFReaderView.y0(this.f21736a.top, pageView), PDFReaderView.x0(this.f21736a.right, pageView), PDFReaderView.y0(this.f21736a.bottom, pageView));
            if (this.f21736a.contains(this.c, this.f21738d)) {
                pDFReaderView.Q1 = true;
            }
        }
    }

    @Override // lib.zj.pdfeditor.s0
    public final void b(TextChar textChar) {
        this.f21736a.union(textChar);
    }

    @Override // lib.zj.pdfeditor.s0
    public final void c() {
        this.f21736a = new RectF();
    }
}
