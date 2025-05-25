package pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui;

import android.widget.LinearLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25546a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BasePdf2ImageActivity f25547b;

    public /* synthetic */ g(BasePdf2ImageActivity basePdf2ImageActivity, int i10) {
        this.f25546a = i10;
        this.f25547b = basePdf2ImageActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25546a;
        BasePdf2ImageActivity basePdf2ImageActivity = this.f25547b;
        switch (i10) {
            case 0:
                BasePdf2ImageActivity.l2(basePdf2ImageActivity);
                return;
            default:
                kotlin.jvm.internal.g.e(basePdf2ImageActivity, ea.a.p("R2gic1cw", "0E73lzbn"));
                LinearLayout x22 = basePdf2ImageActivity.x2();
                if (x22 != null) {
                    x22.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
