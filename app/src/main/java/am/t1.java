package am;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.R;

/* compiled from: ItemOcrPreviewResultBinding.java */
/* loaded from: classes3.dex */
public final class t1 implements i2.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1466a;

    /* renamed from: b  reason: collision with root package name */
    public final ConstraintLayout f1467b;
    public final AppCompatImageView c;

    /* renamed from: d  reason: collision with root package name */
    public final View f1468d;

    /* renamed from: e  reason: collision with root package name */
    public final View f1469e;

    public /* synthetic */ t1(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, View view, View view2, int i10) {
        this.f1466a = i10;
        this.f1467b = constraintLayout;
        this.c = appCompatImageView;
        this.f1468d = view;
        this.f1469e = view2;
    }

    public static t1 a(View view) {
        int i10 = R.id.anim_view;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) com.google.android.play.core.assetpacks.c.u(view, R.id.anim_view);
        if (lottieAnimationView != null) {
            i10 = R.id.center_line;
            Guideline guideline = (Guideline) com.google.android.play.core.assetpacks.c.u(view, R.id.center_line);
            if (guideline != null) {
                i10 = R.id.start_tv;
                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(view, R.id.start_tv);
                if (textView != null) {
                    return new t1((ConstraintLayout) view, lottieAnimationView, guideline, textView, 2);
                }
            }
        }
        throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpQWhYSSo6IA==", "5xnR6UTK").concat(view.getResources().getResourceName(i10)));
    }

    @Override // i2.a
    public final View b() {
        int i10 = this.f1466a;
        ConstraintLayout constraintLayout = this.f1467b;
        switch (i10) {
            case 0:
            case 1:
            default:
                return constraintLayout;
        }
    }

    public final ConstraintLayout c() {
        return this.f1467b;
    }
}
