package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.widget.cJ;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class PAGAppOpenTopBarView extends PAGRelativeLayout {
    private final PAGImageView Qhi;
    private final PAGImageView cJ;

    public PAGAppOpenTopBarView(Context context) {
        super(context);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        zn.cJ(context, 12.0f);
        int cJ = zn.cJ(context, 16.0f);
        int cJ2 = zn.cJ(context, 20.0f);
        zn.cJ(context, 24.0f);
        int cJ3 = zn.cJ(context, 28.0f);
        PAGImageView pAGImageView = new PAGImageView(context);
        this.Qhi = pAGImageView;
        pAGImageView.setId(520093713);
        int cJ4 = zn.cJ(getContext(), 5.0f);
        pAGImageView.setPadding(cJ4, cJ4, cJ4, cJ4);
        pAGImageView.setScaleType(ImageView.ScaleType.CENTER);
        pAGImageView.setBackground(cJ.Qhi());
        pAGImageView.setImageResource(MQ.CJ(HzH.Qhi(), "tt_reward_full_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(cJ3, cJ3);
        layoutParams.topMargin = cJ2;
        layoutParams.leftMargin = cJ;
        layoutParams.setMarginStart(cJ);
        pAGImageView.setLayoutParams(layoutParams);
        PAGImageView pAGImageView2 = new PAGImageView(context);
        this.cJ = pAGImageView2;
        pAGImageView2.setId(520093714);
        pAGImageView2.setPadding(cJ4, cJ4, cJ4, cJ4);
        pAGImageView2.setScaleType(ImageView.ScaleType.CENTER);
        pAGImageView2.setBackground(cJ.Qhi());
        pAGImageView2.setImageResource(MQ.CJ(HzH.Qhi(), "tt_skip_btn"));
        if (pAGImageView2.getDrawable() != null) {
            pAGImageView2.getDrawable().setAutoMirrored(true);
        }
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(cJ3, cJ3);
        layoutParams2.topMargin = cJ2;
        layoutParams2.rightMargin = cJ;
        layoutParams2.setMarginEnd(cJ);
        layoutParams2.addRule(11);
        layoutParams2.addRule(21);
        pAGImageView2.setLayoutParams(layoutParams2);
        addView(pAGImageView);
        addView(pAGImageView2);
    }

    public View getTopDislike() {
        return this.Qhi;
    }

    public PAGImageView getTopSkip() {
        return this.cJ;
    }
}
