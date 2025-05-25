package pdf.pdfreader.viewer.editor.free.feature.pdf2image.ui;

import androidx.lifecycle.w;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25552a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BasePdf2ImageActivity f25553b;

    public /* synthetic */ i(BasePdf2ImageActivity basePdf2ImageActivity, int i10) {
        this.f25552a = i10;
        this.f25553b = basePdf2ImageActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25552a;
        BasePdf2ImageActivity basePdf2ImageActivity = this.f25553b;
        switch (i10) {
            case 0:
                kotlin.jvm.internal.g.e(basePdf2ImageActivity, ea.a.p("R2gic1cw", "yMXFZG55"));
                basePdf2ImageActivity.Q2();
                return;
            default:
                kotlin.jvm.internal.g.e(basePdf2ImageActivity, ea.a.p("R2gic1cw", "oShPoh2e"));
                if (pdf.pdfreader.viewer.editor.free.utils.extension.a.b(basePdf2ImageActivity)) {
                    if (!basePdf2ImageActivity.G2()) {
                        basePdf2ImageActivity.f25487h0 = false;
                        w<ArrayList<bn.a>> wVar = en.a.f16815a;
                        en.a.f16820g.j(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                if (!basePdf2ImageActivity.G2()) {
                    basePdf2ImageActivity.f25487h0 = false;
                    w<ArrayList<bn.a>> wVar2 = en.a.f16815a;
                    en.a.f16820g.j(Boolean.TRUE);
                }
                basePdf2ImageActivity.f25482c0 = 0L;
                basePdf2ImageActivity.H.postDelayed(basePdf2ImageActivity.f25483d0, 300L);
                return;
        }
    }
}
