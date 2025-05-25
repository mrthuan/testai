package lib.zj.pdfeditor;

import android.graphics.RectF;
import lib.zj.pdfeditor.Annotation;
import lib.zj.pdfeditor.PDFReaderView;

/* compiled from: PDFView.java */
/* loaded from: classes3.dex */
public interface a0 {
    void A(String str, int i10, int i11, lj.c cVar, long j10, float f10, float f11);

    void D();

    void E();

    void G();

    boolean H(PDFReaderView.Mode mode);

    void b();

    void e();

    void f(int i10, boolean z10);

    void g();

    void j(boolean z10);

    LinkInfo l(float f10, float f11);

    void m();

    boolean o(Annotation.Type type);

    Hit p(PDFReaderView.Mode mode, float f10, float f11);

    void setChangeReporter(Runnable runnable);

    void setFreeTextColor(int i10);

    void setLinkHighlighting(boolean z10);

    void setScale(float f10);

    void setSearchBoxes(RectF[] rectFArr);

    void y(long j10);
}
