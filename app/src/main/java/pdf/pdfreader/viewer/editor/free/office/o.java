package pdf.pdfreader.viewer.editor.free.office;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import java.io.File;
import lib.zj.office.fc.ss.usermodel.ShapeTypes;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.ui.myview.ReaderLoadingView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26128a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OfficeReaderActivity f26129b;

    public /* synthetic */ o(OfficeReaderActivity officeReaderActivity, int i10) {
        this.f26128a = i10;
        this.f26129b = officeReaderActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f26128a;
        OfficeReaderActivity officeReaderActivity = this.f26129b;
        switch (i10) {
            case 0:
                String str = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("Q2ghc28w", "El7HKzYt"));
                View view = officeReaderActivity.f25930h0;
                if (view != null) {
                    view.setVisibility(8);
                    return;
                }
                return;
            case 1:
                String str2 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("R2gic1cw", "KTzS45cn"));
                officeReaderActivity.s2();
                return;
            case 2:
                String str3 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("R2gic1cw", "fAGaCG1P"));
                AppCompatImageView appCompatImageView = officeReaderActivity.Q;
                if (appCompatImageView != null) {
                    appCompatImageView.setVisibility(8);
                    officeReaderActivity.I2();
                    if (officeReaderActivity.f25969u0 == null) {
                        officeReaderActivity.f25969u0 = new ReaderLoadingView((jl.a) officeReaderActivity);
                    }
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    FrameLayout frameLayout = officeReaderActivity.W;
                    if (frameLayout != null) {
                        frameLayout.addView(officeReaderActivity.f25969u0, layoutParams);
                        return;
                    } else {
                        kotlin.jvm.internal.g.i(ea.a.p("Wm8WZDtuDkMnbhJhXW4ycg==", "2H6wRiHj"));
                        throw null;
                    }
                }
                kotlin.jvm.internal.g.i(ea.a.p("QGgqchZJdg==", "8ye5ObSw"));
                throw null;
            case 3:
                String str4 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("IGgAcxUw", "wsTi1FH8"));
                LottieAnimationView lottieAnimationView = officeReaderActivity.f25973v0;
                if (lottieAnimationView != null) {
                    lottieAnimationView.k(0, 30);
                    lottieAnimationView.j();
                    lottieAnimationView.c(new v(lottieAnimationView));
                }
                officeReaderActivity.f25979w2 = true;
                officeReaderActivity.B2 = System.currentTimeMillis();
                FrameLayout frameLayout2 = officeReaderActivity.E0;
                if (frameLayout2 != null) {
                    frameLayout2.setVisibility(0);
                }
                officeReaderActivity.Z2(0.0f);
                try {
                    sp.h hVar = officeReaderActivity.J1;
                    if (hVar != null) {
                        hVar.e(true);
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                sn.d.d().getClass();
                sp.h hVar2 = new sp.h(officeReaderActivity, androidx.activity.f.m(sn.d.e(), "convert", File.separator), false, officeReaderActivity);
                officeReaderActivity.J1 = hVar2;
                hVar2.h(officeReaderActivity.L0);
                return;
            default:
                String str5 = OfficeReaderActivity.D2;
                kotlin.jvm.internal.g.e(officeReaderActivity, ea.a.p("O2hYc10w", "R1Am8Qil"));
                LottieAnimationView lottieAnimationView2 = officeReaderActivity.f25973v0;
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.f6018h.c.removeAllListeners();
                }
                LottieAnimationView lottieAnimationView3 = officeReaderActivity.f25973v0;
                if (lottieAnimationView3 != null) {
                    lottieAnimationView3.setRepeatCount(0);
                }
                LottieAnimationView lottieAnimationView4 = officeReaderActivity.f25973v0;
                if (lottieAnimationView4 != null) {
                    lottieAnimationView4.k(ShapeTypes.MATH_EQUAL, 240);
                }
                LottieAnimationView lottieAnimationView5 = officeReaderActivity.f25973v0;
                if (lottieAnimationView5 != null) {
                    lottieAnimationView5.j();
                }
                officeReaderActivity.f25979w2 = false;
                TextView textView = officeReaderActivity.B0;
                if (textView != null) {
                    textView.setText(R.string.arg_res_0x7f1301a3);
                }
                officeReaderActivity.b3(true);
                return;
        }
    }
}
