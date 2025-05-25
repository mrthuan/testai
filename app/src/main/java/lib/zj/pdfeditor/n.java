package lib.zj.pdfeditor;

import android.graphics.Bitmap;
import lib.zj.pdfeditor.Annotation;
import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: PDFPageView.java */
/* loaded from: classes3.dex */
public final class n extends h<Void, Boolean> {
    public final /* synthetic */ Bitmap c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f21533d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f21534e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f21535f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f21536g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f21537h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f21538i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ PDFPageView f21539j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(PDFPageView pDFPageView, ReaderPDFCore readerPDFCore, int i10, Bitmap bitmap, int i11, int i12, int i13, int i14, int i15, int i16) {
        super(i10, readerPDFCore);
        this.f21539j = pDFPageView;
        this.c = bitmap;
        this.f21533d = i11;
        this.f21534e = i12;
        this.f21535f = i13;
        this.f21536g = i14;
        this.f21537h = i15;
        this.f21538i = i16;
    }

    @Override // lib.zj.pdfeditor.h
    public final Boolean a(ReaderPDFCore.Cookie cookie, Void[] voidArr) {
        Bitmap bitmap;
        if (cookie != null && (bitmap = this.c) != null && !bitmap.isRecycled()) {
            aj.b a10 = pg.a.c().a();
            StringBuilder sb2 = new StringBuilder("PDFPageView getUpdatePageTask");
            PDFPageView pDFPageView = this.f21539j;
            sb2.append(pDFPageView.c);
            String sb3 = sb2.toString();
            a10.getClass();
            aj.b.K(sb3);
            if (pDFPageView.r1()) {
                pDFPageView.G0.updatePage(this.c, pDFPageView.c, this.f21533d, this.f21534e, this.f21535f, this.f21536g, this.f21537h, this.f21538i, ~pDFPageView.G0.makeAnnotsFlag(Annotation.Type.FREETEXT, Annotation.Type.STAMP), cookie);
            } else {
                pDFPageView.G0.updatePage(this.c, pDFPageView.c, this.f21533d, this.f21534e, this.f21535f, this.f21536g, this.f21537h, this.f21538i, cookie);
            }
            PDFPageView.e2(pDFPageView);
            return Boolean.TRUE;
        }
        return null;
    }
}
