package pdf.pdfreader.viewer.editor.free.office;

import android.widget.FrameLayout;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderLoadingView;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26112a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Word2PDFConvertActivity f26113b;

    public /* synthetic */ j0(Word2PDFConvertActivity word2PDFConvertActivity, int i10) {
        this.f26112a = i10;
        this.f26113b = word2PDFConvertActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10 = this.f26112a;
        Word2PDFConvertActivity word2PDFConvertActivity = this.f26113b;
        switch (i10) {
            case 0:
                Word2PDFConvertActivity.a aVar = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("R2gic1cw", "c8e50ahz"));
                ReaderLoadingView readerLoadingView = word2PDFConvertActivity.f26027f0;
                if (readerLoadingView != null) {
                    FrameLayout frameLayout = word2PDFConvertActivity.U;
                    if (frameLayout != null) {
                        if (frameLayout.indexOfChild(readerLoadingView) != -1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            FrameLayout frameLayout2 = word2PDFConvertActivity.U;
                            if (frameLayout2 != null) {
                                frameLayout2.removeView(word2PDFConvertActivity.f26027f0);
                                if (word2PDFConvertActivity.I0 != 0) {
                                    ea.a.p("Y2E5cxZGC2wXVF1tZQ==", "SbDv6lzE");
                                    System.currentTimeMillis();
                                }
                                if (word2PDFConvertActivity.I0 != 0) {
                                    ea.a.p("Y2E5cxZGC2wXVF1tZQ==", "tWatVa9F");
                                    System.currentTimeMillis();
                                    return;
                                }
                                return;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("I29QZBBuUEM1bj5hHG4Ncg==", "PYLB12TF"));
                            throw null;
                        }
                        return;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("X28qZBpuBUMdbkBhAG4zcg==", "uZPaMmyw"));
                    throw null;
                }
                return;
            case 1:
                Word2PDFConvertActivity.a aVar2 = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("O2hYc10w", "CenhCi3x"));
                word2PDFConvertActivity.r2();
                return;
            default:
                Word2PDFConvertActivity.a aVar3 = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("R2gic1cw", "09WlJCPg"));
                ProgressView progressView = word2PDFConvertActivity.Q;
                if (progressView != null) {
                    progressView.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("RG85ZEFQBmYicltnG2Ulcw==", "agIbriVQ"));
                    throw null;
                }
        }
    }
}
