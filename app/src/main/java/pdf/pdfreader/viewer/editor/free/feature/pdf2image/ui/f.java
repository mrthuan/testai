package pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25544a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BasePdf2ImageActivity f25545b;

    public /* synthetic */ f(BasePdf2ImageActivity basePdf2ImageActivity, int i10) {
        this.f25544a = i10;
        this.f25545b = basePdf2ImageActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25544a;
        BasePdf2ImageActivity basePdf2ImageActivity = this.f25545b;
        switch (i10) {
            case 0:
                BasePdf2ImageActivity.l2(basePdf2ImageActivity);
                return;
            default:
                kotlin.jvm.internal.g.e(basePdf2ImageActivity, ea.a.p("O2hYc10w", "fPD3WWto"));
                basePdf2ImageActivity.P2();
                return;
        }
    }
}
