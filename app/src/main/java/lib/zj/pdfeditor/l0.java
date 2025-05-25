package lib.zj.pdfeditor;

import lib.zj.pdfeditor.ReaderView;

/* compiled from: ReaderView.java */
/* loaded from: classes3.dex */
public final class l0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ReaderView.d f21521a;

    public l0(ReaderView.d dVar) {
        this.f21521a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ReaderView.d dVar = this.f21521a;
        ReaderView readerView = ReaderView.this;
        boolean z10 = ReaderView.f21377y0;
        readerView.j0();
        ReaderView.this.h0();
        ReaderView.this.requestLayout();
    }
}
