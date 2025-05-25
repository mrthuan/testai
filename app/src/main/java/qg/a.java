package qg;

import android.view.MotionEvent;
import lib.zj.pdfeditor.PDFReaderView;
import lib.zj.pdfeditor.PageView;
import lib.zj.pdfeditor.a0;
import lib.zj.pdfeditor.model.AnalyticsEvent;

/* compiled from: InkTouchListener.java */
/* loaded from: classes.dex */
public interface a {
    boolean C();

    void E(ij.f fVar);

    void J0(a0 a0Var, float f10, float f11, int i10);

    void Q0();

    void R();

    void W(AnalyticsEvent analyticsEvent);

    void h(String str);

    void j1(PageView pageView, int i10, PDFReaderView.Mode mode, MotionEvent motionEvent, boolean z10);
}
