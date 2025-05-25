package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderLoadingView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24657a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OfficeAIReaderActivity f24658b;

    public /* synthetic */ u0(OfficeAIReaderActivity officeAIReaderActivity, int i10) {
        this.f24657a = i10;
        this.f24658b = officeAIReaderActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f24657a;
        OfficeAIReaderActivity officeAIReaderActivity = this.f24658b;
        switch (i10) {
            case 0:
                String str = OfficeAIReaderActivity.K0;
                kotlin.jvm.internal.g.e(officeAIReaderActivity, ea.a.p("R2gic1cw", "l3KNk5Jl"));
                officeAIReaderActivity.f2();
                return;
            default:
                String str2 = OfficeAIReaderActivity.K0;
                kotlin.jvm.internal.g.e(officeAIReaderActivity, ea.a.p("R2gic1cw", "La2svqea"));
                officeAIReaderActivity.k2();
                if (officeAIReaderActivity.P == null) {
                    officeAIReaderActivity.P = new ReaderLoadingView((jl.a) officeAIReaderActivity);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                FrameLayout frameLayout = officeAIReaderActivity.H;
                if (frameLayout != null) {
                    frameLayout.addView(officeAIReaderActivity.P, layoutParams);
                    return;
                } else {
                    kotlin.jvm.internal.g.i(ea.a.p("X28qZBpuBUMdbkBhAG4zcg==", "J5G5n7Kb"));
                    throw null;
                }
        }
    }
}
