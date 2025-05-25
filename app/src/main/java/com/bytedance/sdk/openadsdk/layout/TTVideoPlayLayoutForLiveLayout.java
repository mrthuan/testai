package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.utils.hm;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class TTVideoPlayLayoutForLiveLayout extends PAGRelativeLayout {
    public TTVideoPlayLayoutForLiveLayout(Context context) {
        this(context, null);
    }

    private void Qhi(Context context) {
        setBackgroundColor(Color.parseColor("#000000"));
        setId(520093726);
        int cJ = zn.cJ(context, 60.0f);
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        pAGFrameLayout.setId(iMK.SNp);
        pAGFrameLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        pAGFrameLayout.setBackgroundColor(0);
        addView(pAGFrameLayout);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(iMK.YD);
        pAGImageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        pAGImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        pAGFrameLayout.addView(pAGImageView);
        PAGProgressBar pAGProgressBar = new PAGProgressBar(context);
        pAGProgressBar.setId(iMK.eG);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(cJ, cJ);
        layoutParams.gravity = 17;
        pAGProgressBar.setLayoutParams(layoutParams);
        pAGProgressBar.setIndeterminateDrawable(hm.Qhi(context, "tt_video_loading_progress_bar"));
        pAGFrameLayout.addView(pAGProgressBar);
        PAGImageView pAGImageView2 = new PAGImageView(context);
        pAGImageView2.setId(iMK.Ug);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        pAGImageView2.setLayoutParams(layoutParams2);
        pAGImageView2.setScaleType(ImageView.ScaleType.CENTER);
        pAGImageView2.setImageDrawable(hm.Qhi(context, "tt_play_movebar_textpage"));
        pAGImageView2.setVisibility(8);
        addView(pAGImageView2);
        View tTVideoAdCoverLayout = new TTVideoAdCoverLayout(context);
        tTVideoAdCoverLayout.setId(iMK.VV);
        tTVideoAdCoverLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(tTVideoAdCoverLayout);
    }

    public TTVideoPlayLayoutForLiveLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTVideoPlayLayoutForLiveLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Qhi(context);
    }
}
