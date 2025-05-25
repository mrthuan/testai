package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class TTVideoTrafficTipsLayout extends PAGRelativeLayout {
    public TTVideoTrafficTipsLayout(Context context) {
        this(context, null);
    }

    private void Qhi(Context context) {
        setId(iMK.cfS);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        PAGTextView pAGTextView = new PAGTextView(context);
        int i10 = iMK.Hy;
        pAGTextView.setId(i10);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        pAGTextView.setLayoutParams(layoutParams);
        pAGTextView.setIncludeFontPadding(false);
        pAGTextView.setText(MQ.cJ(context, "tt_video_without_wifi_tips"));
        pAGTextView.setTextColor(Color.parseColor("#cacaca"));
        pAGTextView.setTextSize(2, 14.0f);
        addView(pAGTextView);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setId(iMK.yBk);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, i10);
        layoutParams2.addRule(13);
        pAGRelativeLayout.setLayoutParams(layoutParams2);
        addView(pAGRelativeLayout);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(iMK.bIO);
        int cJ = zn.cJ(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(cJ, cJ);
        layoutParams3.addRule(15);
        pAGImageView.setLayoutParams(layoutParams3);
        pAGImageView.setImageDrawable(MQ.ac(context, "tt_new_play_video"));
        pAGImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        pAGRelativeLayout.addView(pAGImageView);
    }

    public TTVideoTrafficTipsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTVideoTrafficTipsLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Qhi(context);
    }
}
