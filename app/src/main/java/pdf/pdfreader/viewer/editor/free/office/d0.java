package pdf.pdfreader.viewer.editor.free.office;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import pdf.pdfreader.viewer.editor.free.office.Word2PDFConvertActivity;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderLoadingView;
import pdf.pdfreader.viewer.editor.free.ui.widget.ProgressView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26090a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Word2PDFConvertActivity f26091b;

    public /* synthetic */ d0(Word2PDFConvertActivity word2PDFConvertActivity, int i10) {
        this.f26090a = i10;
        this.f26091b = word2PDFConvertActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26090a;
        Word2PDFConvertActivity word2PDFConvertActivity = this.f26091b;
        switch (i10) {
            case 0:
                Word2PDFConvertActivity.a aVar = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("R2gic1cw", "sGdbKSQM"));
                ProgressView progressView = word2PDFConvertActivity.Q;
                if (progressView != null) {
                    progressView.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("RG85ZEFQBmYicltnG2Ulcw==", "TN0ti6TH"));
                    throw null;
                }
            default:
                Word2PDFConvertActivity.a aVar2 = Word2PDFConvertActivity.f26020p1;
                kotlin.jvm.internal.g.e(word2PDFConvertActivity, ea.a.p("O2hYc10w", "wvfRihT3"));
                word2PDFConvertActivity.x2();
                if (word2PDFConvertActivity.f26027f0 == null) {
                    word2PDFConvertActivity.f26027f0 = new ReaderLoadingView((jl.a) word2PDFConvertActivity);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                FrameLayout frameLayout = word2PDFConvertActivity.U;
                if (frameLayout != null) {
                    frameLayout.addView(word2PDFConvertActivity.f26027f0, layoutParams);
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("I29QZBBuUEM1bj5hHG4Ncg==", "kviYRjgy"));
                    throw null;
                }
        }
    }
}
