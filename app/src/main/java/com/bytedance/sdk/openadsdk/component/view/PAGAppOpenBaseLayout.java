package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.DSPAdChoice;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;

/* loaded from: classes.dex */
public abstract class PAGAppOpenBaseLayout extends PAGRelativeLayout {
    PAGLogoView CJ;
    PAGTextView Gm;
    PAGImageView Qhi;
    PAGTextView ROR;
    final PAGAppOpenTopBarView Sf;
    TTRoundRectImageView Tgh;
    PAGTextView WAv;

    /* renamed from: ac  reason: collision with root package name */
    PAGImageView f8895ac;
    PAGFrameLayout cJ;

    /* renamed from: fl  reason: collision with root package name */
    PAGTextView f8896fl;

    /* renamed from: hm  reason: collision with root package name */
    TTRoundRectImageView f8897hm;

    /* renamed from: zc  reason: collision with root package name */
    DSPAdChoice f8898zc;

    public PAGAppOpenBaseLayout(Context context) {
        super(context);
        this.Sf = new PAGAppOpenTopBarView(context);
    }

    public abstract PAGImageView getAdIconView();

    public PAGLogoView getAdLogo() {
        return this.CJ;
    }

    public abstract PAGTextView getAdTitleTextView();

    public PAGImageView getBackImage() {
        return this.Qhi;
    }

    public PAGTextView getClickButton() {
        return this.f8896fl;
    }

    public PAGTextView getContent() {
        return this.Gm;
    }

    public DSPAdChoice getDspAdChoice() {
        return this.f8898zc;
    }

    public TTRoundRectImageView getHostAppIcon() {
        return this.Tgh;
    }

    public PAGTextView getHostAppName() {
        return this.ROR;
    }

    public TTRoundRectImageView getIconOnlyView() {
        return this.f8897hm;
    }

    public PAGImageView getImageView() {
        return this.f8895ac;
    }

    public PAGLinearLayout getOverlayLayout() {
        return null;
    }

    public abstract TTRatingBar2 getScoreBar();

    public PAGTextView getTitle() {
        return this.WAv;
    }

    public View getTopDisLike() {
        PAGAppOpenTopBarView pAGAppOpenTopBarView = this.Sf;
        if (pAGAppOpenTopBarView != null) {
            return pAGAppOpenTopBarView.getTopDislike();
        }
        return null;
    }

    public PAGImageView getTopSkip() {
        PAGAppOpenTopBarView pAGAppOpenTopBarView = this.Sf;
        if (pAGAppOpenTopBarView != null) {
            return pAGAppOpenTopBarView.getTopSkip();
        }
        return null;
    }

    public abstract View getUserInfo();

    public PAGFrameLayout getVideoContainer() {
        return this.cJ;
    }
}
