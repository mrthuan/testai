package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import am.o2;
import am.t1;
import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.billing.ui.i;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;
import pdf.pdfreader.viewer.editor.free.ui.dialog.m2;
import pdf.pdfreader.viewer.editor.free.ui.feature.debug.ReaderDebugActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements ViewStub.OnInflateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25789a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.c f25790b;

    public /* synthetic */ a0(androidx.appcompat.app.c cVar, int i10) {
        this.f25789a = i10;
        this.f25790b = cVar;
    }

    @Override // android.view.ViewStub.OnInflateListener
    public final void onInflate(ViewStub viewStub, View view) {
        int i10 = this.f25789a;
        androidx.appcompat.app.c cVar = this.f25790b;
        switch (i10) {
            case 0:
                ImageAdjustActivity imageAdjustActivity = (ImageAdjustActivity) cVar;
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("O2hYc10w", "PZAmTfdQ"));
                int i11 = R.id.crop_line;
                View u7 = com.google.android.play.core.assetpacks.c.u(view, R.id.crop_line);
                if (u7 != null) {
                    i11 = R.id.crop_tools_auto_iv;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(view, R.id.crop_tools_auto_iv);
                    if (appCompatImageView != null) {
                        i11 = R.id.crop_tools_auto_layout;
                        LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(view, R.id.crop_tools_auto_layout);
                        if (linearLayout != null) {
                            i11 = R.id.crop_tools_auto_tv;
                            TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(view, R.id.crop_tools_auto_tv);
                            if (textView != null) {
                                i11 = R.id.crop_tools_close_iv;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(view, R.id.crop_tools_close_iv);
                                if (appCompatImageView2 != null) {
                                    i11 = R.id.crop_tools_confirm_iv;
                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(view, R.id.crop_tools_confirm_iv);
                                    if (appCompatImageView3 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        int i12 = R.id.crop_tools_left_layout;
                                        LinearLayout linearLayout2 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(view, R.id.crop_tools_left_layout);
                                        if (linearLayout2 != null) {
                                            i12 = R.id.crop_tools_right_layout;
                                            LinearLayout linearLayout3 = (LinearLayout) com.google.android.play.core.assetpacks.c.u(view, R.id.crop_tools_right_layout);
                                            if (linearLayout3 != null) {
                                                o2 o2Var = new o2(constraintLayout, u7, appCompatImageView, linearLayout, textView, appCompatImageView2, appCompatImageView3, constraintLayout, linearLayout2, linearLayout3);
                                                constraintLayout.setOnClickListener(new pdf.pdfreader.viewer.editor.free.feature.billing.ui.h(2));
                                                appCompatImageView2.setOnClickListener(new q(imageAdjustActivity, 1));
                                                appCompatImageView3.setOnClickListener(new u(imageAdjustActivity, 2));
                                                linearLayout2.setOnClickListener(new v(imageAdjustActivity, 2));
                                                linearLayout3.setOnClickListener(new d9.f(imageAdjustActivity, 12));
                                                linearLayout.setOnClickListener(new t(imageAdjustActivity, o2Var, 1));
                                                imageAdjustActivity.J = o2Var;
                                                imageAdjustActivity.C2().f();
                                                return;
                                            }
                                        }
                                        i11 = i12;
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException(ea.a.p("AmlCcxBuUCAoZTt1HHINZBV2B2UyIBJpM2hmSTw6IA==", "hgeQGFxE").concat(view.getResources().getResourceName(i11)));
            default:
                ReaderDebugActivity readerDebugActivity = (ReaderDebugActivity) cVar;
                boolean z10 = ReaderDebugActivity.f27826e;
                kotlin.jvm.internal.g.e(readerDebugActivity, ea.a.p("MWggc2ww", "DMEIHM7q"));
                t1 a10 = t1.a(view);
                m2 m2Var = new m2(1);
                ConstraintLayout constraintLayout2 = a10.f1467b;
                constraintLayout2.setOnClickListener(m2Var);
                constraintLayout2.setElevation(constraintLayout2.getContext().getResources().getDisplayMetrics().density * 3.0f);
                TextView textView2 = (TextView) a10.f1469e;
                i.a aVar2 = pdf.pdfreader.viewer.editor.free.feature.billing.ui.i.f24934a;
                Context context = textView2.getContext();
                kotlin.jvm.internal.g.d(context, ea.a.p("WnRlcwdhEHQmdhpjBm4iZTx0", "NVeYyW5w"));
                String string = readerDebugActivity.getString(R.string.arg_res_0x7f13049c, ea.a.p("Mw==", "b7fu1tF5"));
                kotlin.jvm.internal.g.d(string, ea.a.p("VGU_UwdyC24VKGYuGnQkaSpnHHMyYTF0EXkMdTtfAXJWZRR0AWkDbC0xGCBLM3Qp", "NcIg5qkv"));
                TextPaint paint = textView2.getPaint();
                kotlin.jvm.internal.g.d(paint, ea.a.p("WnRlcwdhEHQmdhpwCGk4dA==", "OUKdOESq"));
                aVar2.getClass();
                textView2.setText(i.a.c(context, string, paint));
                ((LottieAnimationView) a10.c).j();
                readerDebugActivity.c = a10;
                return;
        }
    }
}
