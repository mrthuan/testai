package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLoadingBar;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.zn;

/* compiled from: LandingPageLoadingDefaultStyle.java */
/* loaded from: classes.dex */
public class Tgh {
    private TTRoundRectImageView CJ;
    protected View Qhi = fl();

    /* renamed from: ac  reason: collision with root package name */
    private PAGLoadingBar f8729ac;
    protected Context cJ;

    /* renamed from: fl  reason: collision with root package name */
    private PAGTextView f8730fl;

    public Tgh(Context context) {
        this.cJ = context;
    }

    private View fl() {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(this.cJ);
        pAGLinearLayout.setGravity(1);
        pAGLinearLayout.setOrientation(1);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(this.cJ);
        this.CJ = tTRoundRectImageView;
        tTRoundRectImageView.setId(520093745);
        int cJ = zn.cJ(this.cJ, 64.0f);
        pAGLinearLayout.addView(this.CJ, new LinearLayout.LayoutParams(cJ, cJ));
        PAGTextView pAGTextView = new PAGTextView(this.cJ);
        this.f8730fl = pAGTextView;
        pAGTextView.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(zn.cJ(this.cJ, 219.0f), -2);
        layoutParams.topMargin = zn.cJ(this.cJ, 16.0f);
        this.f8730fl.setLayoutParams(layoutParams);
        this.f8730fl.setEllipsize(TextUtils.TruncateAt.END);
        this.f8730fl.setGravity(17);
        this.f8730fl.setMaxWidth(zn.cJ(this.cJ, 150.0f));
        this.f8730fl.setMaxLines(2);
        this.f8730fl.setTextColor(-1);
        this.f8730fl.setTextSize(1, 16.0f);
        pAGLinearLayout.addView(this.f8730fl);
        this.f8729ac = new PAGLoadingBar(this.cJ);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(zn.cJ(this.cJ, 219.0f), zn.cJ(this.cJ, 6.0f));
        layoutParams2.topMargin = zn.cJ(this.cJ, 32.0f);
        pAGLinearLayout.addView(this.f8729ac, layoutParams2);
        return pAGLinearLayout;
    }

    public void CJ() {
        this.Qhi = null;
        this.cJ = null;
    }

    public View Qhi() {
        return this.Qhi;
    }

    public PAGTextView ac() {
        return this.f8730fl;
    }

    public TTRoundRectImageView cJ() {
        return this.CJ;
    }

    public void Qhi(int i10) {
        this.f8729ac.setProgress(i10);
    }
}
