package pdf.pdfreader.viewer.editor.free.feature.scan.ui;

import am.b3;
import am.p2;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.inmobi.commons.core.configs.TelemetryConfig;
import pdf.pdfreader.viewer.editor.free.R;
import pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f25859a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ImageAdjustActivity f25860b;

    public /* synthetic */ y(ImageAdjustActivity imageAdjustActivity, int i10) {
        this.f25859a = i10;
        this.f25860b = imageAdjustActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f25859a;
        final ImageAdjustActivity imageAdjustActivity = this.f25860b;
        switch (i10) {
            case 0:
                ImageAdjustActivity.a aVar = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("O2hYc10w", "FkEwZcCe"));
                if (!pdf.pdfreader.viewer.editor.free.utils.extension.a.b(imageAdjustActivity) && imageAdjustActivity.K != null) {
                    jn.a.c.getClass();
                    ig.h<Object>[] hVarArr = jn.a.f19323d;
                    ig.h<Object> hVar = hVarArr[12];
                    pdf.pdfreader.viewer.editor.free.datasource.sp.a aVar2 = jn.a.f19335p;
                    if (((Boolean) aVar2.b(hVar)).booleanValue() || jn.a.f19336q) {
                        int[] iArr = new int[2];
                        final p2 p2Var = imageAdjustActivity.K;
                        if (p2Var != null) {
                            p2Var.f1307e.getLocationOnScreen(iArr);
                            View inflate = LayoutInflater.from(imageAdjustActivity).inflate(R.layout.pop_filter_apply_all_guide, (ViewGroup) null, false);
                            int i11 = R.id.iv_arrow_up_start;
                            AppCompatImageView appCompatImageView = (AppCompatImageView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.iv_arrow_up_start);
                            if (appCompatImageView != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                int i12 = R.id.tv_content_title;
                                TextView textView = (TextView) com.google.android.play.core.assetpacks.c.u(inflate, R.id.tv_content_title);
                                if (textView != null) {
                                    i12 = R.id.v_content_bg;
                                    LinearLayout linearLayout = (LinearLayout) com.google.android.play.core.assetpacks.c.u(inflate, R.id.v_content_bg);
                                    if (linearLayout != null) {
                                        i12 = R.id.viewPlaceHolder;
                                        View u7 = com.google.android.play.core.assetpacks.c.u(inflate, R.id.viewPlaceHolder);
                                        if (u7 != null) {
                                            b3 b3Var = new b3(constraintLayout, appCompatImageView, constraintLayout, textView, linearLayout, u7);
                                            ea.a.p("Jm5XbBh0UihQIGogVSBIIBUgTiBlIEUgloD_bh5sOyxvZlBsCmU9IHogaiBVIEggFSBOKQ==", "ZzC3tYkW");
                                            PopupWindow popupWindow = new PopupWindow(constraintLayout, -2, -2);
                                            imageAdjustActivity.f25756o0 = popupWindow;
                                            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: pdf.pdfreader.viewer.editor.free.feature.scan.ui.r
                                                /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
                                                    if (r0.isRunning() == true) goto L5;
                                                 */
                                                @Override // android.widget.PopupWindow.OnDismissListener
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                                */
                                                public final void onDismiss() {
                                                    /*
                                                        r3 = this;
                                                        pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity$a r0 = pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity.f25741u0
                                                        java.lang.String r0 = "F2YibAdlEEIbblBpB2c="
                                                        java.lang.String r1 = "SQniHwaC"
                                                        java.lang.String r0 = ea.a.p(r0, r1)
                                                        am.p2 r1 = am.p2.this
                                                        kotlin.jvm.internal.g.e(r1, r0)
                                                        java.lang.String r0 = "PWghc34w"
                                                        java.lang.String r2 = "6bIHZQBB"
                                                        java.lang.String r0 = ea.a.p(r0, r2)
                                                        pdf.pdfreader.viewer.editor.free.feature.scan.ui.ImageAdjustActivity r2 = r2
                                                        kotlin.jvm.internal.g.e(r2, r0)
                                                        com.airbnb.lottie.LottieAnimationView r0 = r1.f1309g
                                                        r0.d()
                                                        r1 = 8
                                                        r0.setVisibility(r1)
                                                        android.animation.ObjectAnimator r0 = r2.f25757p0
                                                        if (r0 == 0) goto L32
                                                        boolean r0 = r0.isRunning()
                                                        r1 = 1
                                                        if (r0 != r1) goto L32
                                                        goto L33
                                                    L32:
                                                        r1 = 0
                                                    L33:
                                                        if (r1 == 0) goto L3c
                                                        android.animation.ObjectAnimator r0 = r2.f25757p0
                                                        if (r0 == 0) goto L3c
                                                        r0.cancel()
                                                    L3c:
                                                        return
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: pdf.pdfreader.viewer.editor.free.feature.scan.ui.r.onDismiss():void");
                                                }
                                            });
                                            PopupWindow popupWindow2 = imageAdjustActivity.f25756o0;
                                            if (popupWindow2 != null) {
                                                popupWindow2.setBackgroundDrawable(new ColorDrawable(0));
                                            }
                                            PopupWindow popupWindow3 = imageAdjustActivity.f25756o0;
                                            if (popupWindow3 != null) {
                                                popupWindow3.setOutsideTouchable(false);
                                            }
                                            PopupWindow popupWindow4 = imageAdjustActivity.f25756o0;
                                            if (popupWindow4 != null) {
                                                popupWindow4.setFocusable(false);
                                            }
                                            constraintLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                                            u7.setOnClickListener(new f5.d(p2Var, 15));
                                            int measuredHeight = constraintLayout.getMeasuredHeight();
                                            PopupWindow popupWindow5 = imageAdjustActivity.f25756o0;
                                            if (popupWindow5 != null) {
                                                popupWindow5.showAtLocation(imageAdjustActivity.y2().f671a, 48, 0, imageAdjustActivity.getResources().getDimensionPixelSize(R.dimen.dp_46) + (iArr[1] - measuredHeight));
                                            }
                                            constraintLayout.post(new v4.o(measuredHeight, b3Var, imageAdjustActivity, p2Var));
                                            aVar2.c(hVarArr[12], Boolean.FALSE);
                                            imageAdjustActivity.H.postDelayed(imageAdjustActivity.f25758q0, TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL);
                                            return;
                                        }
                                    }
                                }
                                i11 = i12;
                            }
                            throw new NullPointerException(ea.a.p("fmk4cxpuBSAAZUV1AHIzZGR2W2UxIDRpB2hISR46IA==", "shZfaRHj").concat(inflate.getResources().getResourceName(i11)));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                ImageAdjustActivity.a aVar3 = ImageAdjustActivity.f25741u0;
                kotlin.jvm.internal.g.e(imageAdjustActivity, ea.a.p("R2gic1cw", "V85z4bPO"));
                imageAdjustActivity.Y.notifyDataSetChanged();
                return;
        }
    }
}
