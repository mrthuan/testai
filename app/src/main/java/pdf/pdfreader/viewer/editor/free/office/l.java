package pdf.pdfreader.viewer.editor.free.office;

import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderLoadingView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26117a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OfficeReaderActivity f26118b;

    public /* synthetic */ l(OfficeReaderActivity officeReaderActivity, int i10) {
        this.f26117a = i10;
        this.f26118b = officeReaderActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26117a;
        boolean z10 = false;
        OfficeReaderActivity officeReaderActivity = this.f26118b;
        switch (i10) {
            case 0:
                String str = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("I2g-c1Qw", "KEWWpZ39"));
                LottieAnimationView lottieAnimationView = officeReaderActivity.f25973v0;
                if (lottieAnimationView != null) {
                    lottieAnimationView.f6018h.c.removeAllListeners();
                }
                LottieAnimationView lottieAnimationView2 = officeReaderActivity.f25973v0;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setRepeatCount(0);
                }
                LottieAnimationView lottieAnimationView3 = officeReaderActivity.f25973v0;
                if (lottieAnimationView3 != null) {
                    lottieAnimationView3.k(ShapeTypes.MATH_EQUAL, 240);
                }
                LottieAnimationView lottieAnimationView4 = officeReaderActivity.f25973v0;
                if (lottieAnimationView4 != null) {
                    lottieAnimationView4.j();
                }
                officeReaderActivity.f25979w2 = false;
                return;
            case 1:
                String str2 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("O2hYc10w", "n2CVM4zu"));
                ReaderLoadingView readerLoadingView = officeReaderActivity.f25969u0;
                if (readerLoadingView != null) {
                    FrameLayout frameLayout = officeReaderActivity.W;
                    if (frameLayout != null) {
                        if (frameLayout.indexOfChild(readerLoadingView) != -1) {
                            z10 = true;
                        }
                        if (z10) {
                            FrameLayout frameLayout2 = officeReaderActivity.W;
                            if (frameLayout2 != null) {
                                frameLayout2.removeView(officeReaderActivity.f25969u0);
                                if (officeReaderActivity.S1 != 0) {
                                    ea.a.p("Y2E5cxZGC2wXVF1tZQ==", "QJ2R6tkS");
                                    System.currentTimeMillis();
                                }
                                if (officeReaderActivity.S1 != 0) {
                                    ea.a.p("H2FDcxxGXmw_VCNtZQ==", "hf4Pfbdm");
                                    System.currentTimeMillis();
                                    return;
                                }
                                return;
                            }
                            kotlin.jvm.internal.g.i(ea.a.p("CG8mZBhuLEMnbhJhXW4ycg==", "xWdGqKKD"));
                            throw null;
                        }
                        return;
                    }
                    kotlin.jvm.internal.g.i(ea.a.p("I29QZBBuUEM1bj5hHG4Ncg==", "Ldpzg2YX"));
                    throw null;
                }
                return;
            default:
                String str3 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("O2hYc10w", "D6pOzDkA"));
                new pdf.pdfreader.viewer.editor.free.ui.dialog.x(officeReaderActivity, officeReaderActivity.getString(R.string.arg_res_0x7f1302ad), officeReaderActivity.getString(R.string.arg_res_0x7f1304da), officeReaderActivity.getString(R.string.arg_res_0x7f130421)).show();
                officeReaderActivity.f25979w2 = false;
                return;
        }
    }
}
