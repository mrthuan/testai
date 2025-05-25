package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.ac;
import com.bytedance.sdk.openadsdk.core.widget.DSPAdChoice;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class PAGAppOpenHtmlLayout extends PAGAppOpenBaseLayout {
    Qhi ABk;

    /* loaded from: classes.dex */
    public interface Qhi {
        void Qhi(View view, int i10);
    }

    public PAGAppOpenHtmlLayout(Context context, tP tPVar) {
        super(context);
        Qhi(context, tPVar);
    }

    private void Qhi(Context context, tP tPVar) {
        DspHtmlWebView dspHtmlWebView = new DspHtmlWebView(context);
        ac.Qhi().ac(dspHtmlWebView);
        dspHtmlWebView.Qhi(tPVar, new DspHtmlWebView.cJ() { // from class: com.bytedance.sdk.openadsdk.component.view.PAGAppOpenHtmlLayout.1
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.cJ
            public void Qhi(int i10, int i11) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.cJ
            public View cJ() {
                return PAGAppOpenHtmlLayout.this;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.cJ
            public View Qhi() {
                PAGAppOpenTopBarView pAGAppOpenTopBarView = PAGAppOpenHtmlLayout.this.Sf;
                if (pAGAppOpenTopBarView != null) {
                    return pAGAppOpenTopBarView.getTopDislike();
                }
                return null;
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.cJ
            public void Qhi(View view, int i10) {
                Qhi qhi = PAGAppOpenHtmlLayout.this.ABk;
                if (qhi != null) {
                    qhi.Qhi(view, i10);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.DspHtmlWebView.cJ
            public void f_() {
            }
        }, "open_ad");
        addView(dspHtmlWebView, new ViewGroup.LayoutParams(-1, -1));
        dspHtmlWebView.hpZ();
        int cJ = zn.cJ(context, 9.0f);
        int cJ2 = zn.cJ(context, 10.0f);
        this.CJ = new PAGLogoView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, zn.cJ(context, 14.0f));
        layoutParams.leftMargin = cJ2;
        layoutParams.bottomMargin = cJ2;
        layoutParams.addRule(12);
        layoutParams.addRule(9);
        addView(this.CJ, layoutParams);
        DSPAdChoice dSPAdChoice = new DSPAdChoice(context);
        this.f8898zc = dSPAdChoice;
        dSPAdChoice.setPadding(cJ, 0, cJ, 0);
        this.f8898zc.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(zn.cJ(context, 32.0f), zn.cJ(context, 14.0f));
        layoutParams2.addRule(12);
        layoutParams2.addRule(11);
        layoutParams2.setMargins(0, 0, cJ2, cJ2);
        addView(this.f8898zc, layoutParams2);
        View view = this.Sf;
        if (view != null) {
            addView(view);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.view.PAGAppOpenBaseLayout
    public PAGImageView getAdIconView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.view.PAGAppOpenBaseLayout
    public PAGTextView getAdTitleTextView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.view.PAGAppOpenBaseLayout
    public TTRatingBar2 getScoreBar() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.view.PAGAppOpenBaseLayout
    public View getUserInfo() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.ABk = null;
    }

    public void setRenderListener(Qhi qhi) {
        this.ABk = qhi;
    }
}
