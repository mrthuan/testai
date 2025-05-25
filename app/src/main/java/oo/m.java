package oo;

import am.d0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import i2.a;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: BaseVMDialog.kt */
/* loaded from: classes3.dex */
public abstract class m<VB extends i2.a> extends androidx.activity.l {

    /* renamed from: d  reason: collision with root package name */
    public d0 f23551d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context) {
        super(context, R.style.BaseCenterDialog);
        kotlin.jvm.internal.g.e(context, ea.a.p("LG9fdBx4dA==", "6rl6CNPF"));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // androidx.activity.l, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        kotlin.jvm.internal.g.d(layoutInflater, ea.a.p("X2EybwZ0K24UbFV0DHI=", "lIYgpSRb"));
        View inflate = layoutInflater.inflate(R.layout.dialog_ocr_loading, (ViewGroup) null, false);
        int i10 = R.id.animation_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.animation_view);
        if (lottieAnimationView != null) {
            i10 = R.id.closeImg;
            AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.closeImg);
            if (appCompatImageView != null) {
                i10 = R.id.loadingText;
                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.loadingText);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    d0 d0Var = new d0(constraintLayout, lottieAnimationView, appCompatImageView, textView);
                    ea.a.p("Wm4tbBJ0BygbblJsCHQzcik=", "xYTS09yY");
                    this.f23551d = d0Var;
                    kotlin.jvm.internal.g.d(constraintLayout, ea.a.p("UWklZBpuBS4Ab1t0", "yVB2ohSo"));
                    setContentView(constraintLayout);
                    return;
                }
            }
        }
        throw new NullPointerException(ea.a.p("ImlFcy1uJiA6ZRd1XXIyZBh2O2U-IEFpAGhRSRU6IA==", "Y8o6DAHd").concat(inflate.getResources().getResourceName(i10)));
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
