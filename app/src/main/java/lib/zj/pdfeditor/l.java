package lib.zj.pdfeditor;

import android.graphics.Bitmap;
import lib.zj.pdfeditor.Annotation;
import lib.zj.pdfeditor.ReaderPDFCore;

/* compiled from: PDFPageView.java */
/* loaded from: classes3.dex */
public final class l extends h<Void, Boolean> {
    public final /* synthetic */ Bitmap c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f21514d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f21515e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f21516f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f21517g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f21518h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f21519i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ PDFPageView f21520j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(PDFPageView pDFPageView, ReaderPDFCore readerPDFCore, int i10, Bitmap bitmap, int i11, int i12, int i13, int i14, int i15, int i16) {
        super(i10, readerPDFCore);
        this.f21520j = pDFPageView;
        this.c = bitmap;
        this.f21514d = i11;
        this.f21515e = i12;
        this.f21516f = i13;
        this.f21517g = i14;
        this.f21518h = i15;
        this.f21519i = i16;
    }

    @Override // lib.zj.pdfeditor.h
    public final Boolean a(ReaderPDFCore.Cookie cookie, Void[] voidArr) {
        Bitmap bitmap;
        if (cookie == null || (bitmap = this.c) == null || bitmap.isRecycled()) {
            return null;
        }
        PDFPageView pDFPageView = this.f21520j;
        pDFPageView.M1(null);
        pg.a.c().a().getClass();
        aj.b.K("PDFPageView getDrawPageTask" + pDFPageView.c);
        if (pDFPageView.r1()) {
            pDFPageView.G0.drawPage(this.c, pDFPageView.c, this.f21514d, this.f21515e, this.f21516f, this.f21517g, this.f21518h, this.f21519i, ~pDFPageView.G0.makeAnnotsFlag(Annotation.Type.FREETEXT, Annotation.Type.STAMP), cookie);
        } else {
            pDFPageView.G0.drawPage(this.c, pDFPageView.c, this.f21514d, this.f21515e, this.f21516f, this.f21517g, this.f21518h, this.f21519i, cookie);
        }
        return Boolean.TRUE;
    }
}
