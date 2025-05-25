package pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui;

import android.widget.LinearLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25538a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BasePdf2ImageActivity f25539b;

    public /* synthetic */ c(BasePdf2ImageActivity basePdf2ImageActivity, int i10) {
        this.f25538a = i10;
        this.f25539b = basePdf2ImageActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinearLayout x22;
        int i10 = this.f25538a;
        BasePdf2ImageActivity basePdf2ImageActivity = this.f25539b;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.g.e(basePdf2ImageActivity, ea.a.p("R2gic1cw", "QUHsm07k"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(basePdf2ImageActivity) && (x22 = basePdf2ImageActivity.x2()) != null) {
                    x22.setVisibility(0);
                    return;
                }
                return;
            default:
                BasePdf2ImageActivity.l2(basePdf2ImageActivity);
                return;
        }
    }
}
