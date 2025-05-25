package pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.ai.ui.activity.AISelfInfoActivity;

/* compiled from: AISelfInfoActivity.kt */
/* loaded from: classes3.dex */
public final class j0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AISelfInfoActivity f24607a;

    public j0(AISelfInfoActivity aISelfInfoActivity) {
        this.f24607a = aISelfInfoActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        AISelfInfoActivity.a aVar = AISelfInfoActivity.G;
        AISelfInfoActivity aISelfInfoActivity = this.f24607a;
        if (aISelfInfoActivity.b2().f888s.getHeight() > 0 && aISelfInfoActivity.b2().f872b.getHeight() > 0 && aISelfInfoActivity.b2().f879j.getHeight() > 0) {
            int width = aISelfInfoActivity.b2().f873d.getWidth();
            int height = aISelfInfoActivity.b2().f873d.getHeight();
            int[] iArr = new int[2];
            aISelfInfoActivity.b2().f873d.getLocationInWindow(iArr);
            int height2 = ((iArr[1] - aISelfInfoActivity.b2().f888s.getHeight()) - aISelfInfoActivity.b2().f872b.getHeight()) - ((int) (aISelfInfoActivity.b2().f879j.getHeight() * 0.035d));
            if (height2 < 0) {
                height2 = 0;
            }
            LottieAnimationView lottieAnimationView = aISelfInfoActivity.b2().f873d;
            kotlin.jvm.internal.g.d(lottieAnimationView, ea.a.p("LWlfZBBuUC4zdgtpJ28Kb3Q=", "rvLIVRJY"));
            ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
                ((ViewGroup.MarginLayoutParams) bVar).width = (int) (width * 0.73f);
                ((ViewGroup.MarginLayoutParams) bVar).height = (int) (height * 0.73f);
                ((ViewGroup.MarginLayoutParams) bVar).topMargin = -height2;
                lottieAnimationView.setLayoutParams(bVar);
                aISelfInfoActivity.b2().f872b.setVisibility(0);
                aISelfInfoActivity.b2().f887r.setVisibility(0);
                aISelfInfoActivity.b2().f882m.setVisibility(0);
                aISelfInfoActivity.b2().f882m.setText(R.string.arg_res_0x7f130077);
                aISelfInfoActivity.b2().c.setVisibility(0);
                aISelfInfoActivity.b2().f880k.setText(R.string.arg_res_0x7f13005b);
                aISelfInfoActivity.b2().f874e.setVisibility(0);
                aISelfInfoActivity.b2().f884o.setText(R.string.arg_res_0x7f1304a5);
                aISelfInfoActivity.b2().f876g.setVisibility(0);
                aISelfInfoActivity.b2().f886q.setText(R.string.arg_res_0x7f13018e);
                aISelfInfoActivity.b2().f875f.setVisibility(0);
                aISelfInfoActivity.b2().f885p.setText(R.string.arg_res_0x7f1304dd);
                aISelfInfoActivity.b2().f883n.setVisibility(0);
                aISelfInfoActivity.b2().f883n.setText(ea.a.p("YS4u", "xOrcrZWX"));
                aISelfInfoActivity.b2().f878i.setVisibility(0);
                aISelfInfoActivity.b2().f878i.setAlpha(1.0f);
                AISelfInfoActivity.a2(aISelfInfoActivity);
                aISelfInfoActivity.b2().f879j.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
            throw new NullPointerException(ea.a.p("XXUnbFNjA24cb0AgC2V2YyVzRiAyb2NuDW5qbgFsDiBHeTtlU2EMZABvXWQRLjVvKnNGcidpLXQOYT5vAXRMd1pkLGUHLiFvHHNAcghpOHQIYUtvM3RtTAN5KHUAUANyUm1z", "bGtbFWCS"));
        }
    }
}
