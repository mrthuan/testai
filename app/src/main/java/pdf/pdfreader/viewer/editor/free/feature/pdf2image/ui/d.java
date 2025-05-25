package pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui;

import pdf.pdfreader.viewer.editor.free.feature.pdf2image.widget.Pdf2ImageConvertCompletedView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25540a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BasePdf2ImageActivity f25541b;

    public /* synthetic */ d(BasePdf2ImageActivity basePdf2ImageActivity, int i10) {
        this.f25540a = i10;
        this.f25541b = basePdf2ImageActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25540a;
        BasePdf2ImageActivity basePdf2ImageActivity = this.f25541b;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.g.e(basePdf2ImageActivity, ea.a.p("O2hYc10w", "pvAMT4Q6"));
                basePdf2ImageActivity.f25482c0 = System.currentTimeMillis();
                Pdf2ImageConvertCompletedView t22 = basePdf2ImageActivity.t2();
                if (t22 != null) {
                    t22.h();
                    return;
                }
                return;
            default:
                kotlin.jvm.internal.g.e(basePdf2ImageActivity, ea.a.p("O2hYc10w", "l2QWgXEw"));
                basePdf2ImageActivity.L2();
                return;
        }
    }
}
