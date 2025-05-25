package lib.zj.pdfeditor;

import android.graphics.Bitmap;
import lib.zj.pdfeditor.Annotation;
import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: PDFPageView.java */
/* loaded from: classes3.dex */
public final class m extends h<Void, Boolean> {
    public final /* synthetic */ Bitmap c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f21522d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f21523e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f21524f = 0;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f21525g = 0;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f21526h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f21527i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ PDFPageView f21528j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(PDFPageView pDFPageView, ReaderPDFCore readerPDFCore, int i10, Bitmap bitmap, int i11, int i12, int i13, int i14) {
        super(i10, readerPDFCore);
        this.f21528j = pDFPageView;
        this.c = bitmap;
        this.f21522d = i11;
        this.f21523e = i12;
        this.f21526h = i13;
        this.f21527i = i14;
    }

    @Override // lib.zj.pdfeditor.h
    public final Boolean a(ReaderPDFCore.Cookie cookie, Void[] voidArr) {
        Bitmap bitmap;
        if (cookie == null || (bitmap = this.c) == null || bitmap.isRecycled()) {
            return null;
        }
        PDFPageView pDFPageView = this.f21528j;
        pDFPageView.M1(null);
        pg.a.c().a().getClass();
        aj.b.K("PDFPageView getDrawPageTaskAndLoadAnnotations :" + pDFPageView.c);
        if (pDFPageView.r1()) {
            pDFPageView.G0.drawPage(this.c, pDFPageView.c, this.f21522d, this.f21523e, this.f21524f, this.f21525g, this.f21526h, this.f21527i, ~pDFPageView.G0.makeAnnotsFlag(Annotation.Type.FREETEXT, Annotation.Type.STAMP), cookie);
        } else {
            pDFPageView.G0.drawPage(this.c, pDFPageView.c, this.f21522d, this.f21523e, this.f21524f, this.f21525g, this.f21526h, this.f21527i, cookie);
        }
        PDFPageView.e2(pDFPageView);
        return Boolean.TRUE;
    }
}
