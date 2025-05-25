package lib.zj.pdfeditor;

import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: PDFPageView.java */
/* loaded from: classes3.dex */
public final class o extends h<Void, oj.b> {
    public final /* synthetic */ int c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f21542d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f21543e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ float f21544f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ float f21545g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ PDFPageView f21546h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(PDFPageView pDFPageView, ReaderPDFCore readerPDFCore, int i10, int i11, int i12, int i13, float f10, float f11) {
        super(i10, readerPDFCore);
        this.f21546h = pDFPageView;
        this.c = i11;
        this.f21542d = i12;
        this.f21543e = i13;
        this.f21544f = f10;
        this.f21545g = f11;
    }

    @Override // lib.zj.pdfeditor.h
    public final oj.b a(ReaderPDFCore.Cookie cookie, Void[] voidArr) {
        if (cookie == null) {
            return null;
        }
        aj.b a10 = pg.a.c().a();
        StringBuilder sb2 = new StringBuilder("PDFPageView getReflowPage:");
        PDFPageView pDFPageView = this.f21546h;
        sb2.append(pDFPageView.c);
        sb2.append(" x ");
        sb2.append(this.c);
        sb2.append(" y ");
        sb2.append(this.f21542d);
        String sb3 = sb2.toString();
        a10.getClass();
        aj.b.K(sb3);
        return pDFPageView.G0.drawReflow(this.f21499b, this.c, this.f21542d, this.f21543e, this.f21544f, this.f21545g, cookie);
    }
}
