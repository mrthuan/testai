package lib.zj.pdfeditor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import lib.zj.pdfeditor.Annotation;
import lib.zj.pdfeditor.PDFReaderView;

/* loaded from: classes3.dex */
public class PDFReflowView extends WebView implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final ReaderPDFCore f21260a;

    /* renamed from: b  reason: collision with root package name */
    public final Point f21261b;
    public int c;

    /* renamed from: d  reason: collision with root package name */
    public float f21262d;

    /* renamed from: e  reason: collision with root package name */
    public final int f21263e;

    /* renamed from: f  reason: collision with root package name */
    public y f21264f;

    /* loaded from: classes3.dex */
    public class a {
    }

    /* loaded from: classes3.dex */
    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            PDFReflowView pDFReflowView = PDFReflowView.this;
            pDFReflowView.setScale(pDFReflowView.f21262d);
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public PDFReflowView(Context context, ReaderPDFCore readerPDFCore, Point point) {
        super(context);
        new Handler();
        this.f21260a = readerPDFCore;
        this.f21261b = point;
        this.f21262d = 1.0f;
        this.f21263e = point.y;
        getSettings().setJavaScriptEnabled(true);
        addJavascriptInterface(new a(), "HTMLOUT");
        setWebViewClient(new b());
    }

    @Override // lib.zj.pdfeditor.a0
    public final boolean H(PDFReaderView.Mode mode) {
        return false;
    }

    public int getAddTextCount() {
        return 0;
    }

    public int getPage() {
        return this.c;
    }

    @Override // lib.zj.pdfeditor.a0
    public final LinkInfo l(float f10, float f11) {
        return null;
    }

    @Override // lib.zj.pdfeditor.a0
    public final boolean o(Annotation.Type type) {
        return false;
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        if (View.MeasureSpec.getMode(i10) != 0) {
            i12 = View.MeasureSpec.getSize(i10);
        } else {
            i12 = this.f21261b.x;
        }
        if (View.MeasureSpec.getMode(i11) != 0) {
            i13 = View.MeasureSpec.getSize(i11);
        } else {
            i13 = this.f21263e;
        }
        setMeasuredDimension(i12, i13);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // lib.zj.pdfeditor.a0
    public final Hit p(PDFReaderView.Mode mode, float f10, float f11) {
        return null;
    }

    @Override // lib.zj.pdfeditor.a0
    public void setScale(float f10) {
        this.f21262d = f10;
        loadUrl("javascript:document.getElementById('content').style.zoom=\"" + ((int) (this.f21262d * 100.0f)) + "%\"");
        loadUrl("javascript:elem=document.getElementById('content');window.HTMLOUT.reportContentHeight(" + this.f21261b.x + "*elem.offsetHeight/elem.offsetWidth)");
    }

    @Override // lib.zj.pdfeditor.a0
    public final void D() {
    }

    @Override // lib.zj.pdfeditor.a0
    public final void E() {
    }

    @Override // lib.zj.pdfeditor.a0
    public final void G() {
    }

    @Override // lib.zj.pdfeditor.a0
    public final void b() {
    }

    @Override // lib.zj.pdfeditor.a0
    public final void e() {
    }

    @Override // lib.zj.pdfeditor.a0
    public final void g() {
    }

    @Override // lib.zj.pdfeditor.a0
    public final void m() {
    }

    @Override // lib.zj.pdfeditor.a0
    public final void j(boolean z10) {
    }

    @Override // lib.zj.pdfeditor.a0
    public void setChangeReporter(Runnable runnable) {
    }

    @Override // lib.zj.pdfeditor.a0
    public void setFreeTextColor(int i10) {
    }

    @Override // lib.zj.pdfeditor.a0
    public void setLinkHighlighting(boolean z10) {
    }

    public void setMode(PDFReaderView.Mode mode) {
    }

    @Override // lib.zj.pdfeditor.a0
    public void setSearchBoxes(RectF[] rectFArr) {
    }

    @Override // lib.zj.pdfeditor.a0
    public final void y(long j10) {
    }

    @Override // lib.zj.pdfeditor.a0
    public final void f(int i10, boolean z10) {
    }

    @Override // lib.zj.pdfeditor.a0
    public final void A(String str, int i10, int i11, lj.c cVar, long j10, float f10, float f11) {
    }
}
