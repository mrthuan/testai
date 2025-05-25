package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.widget.FrameLayout;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderLoadingView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class s0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24650a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OfficeAIReaderActivity f24651b;

    public /* synthetic */ s0(OfficeAIReaderActivity officeAIReaderActivity, int i10) {
        this.f24650a = i10;
        this.f24651b = officeAIReaderActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10 = this.f24650a;
        OfficeAIReaderActivity officeAIReaderActivity = this.f24651b;
        switch (i10) {
            case 0:
                String str = OfficeAIReaderActivity.K0;
                kotlin.jvm.internal.g.e(officeAIReaderActivity, ea.a.p("O2hYc10w", "AKBibRUo"));
                officeAIReaderActivity.j2();
                return;
            default:
                String str2 = OfficeAIReaderActivity.K0;
                kotlin.jvm.internal.g.e(officeAIReaderActivity, ea.a.p("R2gic1cw", "IFaEtWRo"));
                ReaderLoadingView readerLoadingView = officeAIReaderActivity.P;
                if (readerLoadingView != null) {
                    FrameLayout frameLayout = officeAIReaderActivity.H;
                    if (frameLayout != null) {
                        if (frameLayout.indexOfChild(readerLoadingView) != -1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            FrameLayout frameLayout2 = officeAIReaderActivity.H;
                            if (frameLayout2 != null) {
                                frameLayout2.removeView(officeAIReaderActivity.P);
                                if (officeAIReaderActivity.f24458w0 != 0) {
                                    ea.a.p("Y2E5cxZGC2wXVF1tZQ==", "Df1Ntr2a");
                                    System.currentTimeMillis();
                                }
                                if (officeAIReaderActivity.f24458w0 != 0) {
                                    ea.a.p("H2FDcxxGXmw_VCNtZQ==", "gnseRfOO");
                                    System.currentTimeMillis();
                                    return;
                                }
                                return;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("X28qZBpuBUMdbkBhAG4zcg==", "a3x1Eupd"));
                            throw null;
                        }
                        return;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("X28qZBpuBUMdbkBhAG4zcg==", "K9rS6Etl"));
                    throw null;
                }
                return;
        }
    }
}
