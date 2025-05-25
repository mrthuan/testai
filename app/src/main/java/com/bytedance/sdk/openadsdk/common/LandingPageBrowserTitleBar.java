package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class LandingPageBrowserTitleBar extends RelativeLayout {
    public LandingPageBrowserTitleBar(Context context) {
        super(context);
        Qhi();
    }

    private void Qhi() {
        Context context = getContext();
        int cJ = zn.cJ(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, zn.cJ(context, 44.0f)));
        setBackgroundColor(-1);
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setId(520093720);
        pAGImageView.setClickable(true);
        pAGImageView.setFocusable(true);
        pAGImageView.setImageDrawable(com.bytedance.sdk.openadsdk.utils.hm.Qhi(context, "tt_leftbackicon_selector"));
        int cJ2 = zn.cJ(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(cJ2, cJ2);
        layoutParams.leftMargin = cJ;
        layoutParams.addRule(15);
        addView(pAGImageView, layoutParams);
        PAGImageView pAGImageView2 = new PAGImageView(context);
        pAGImageView2.setId(520093716);
        pAGImageView2.setClickable(true);
        pAGImageView2.setFocusable(true);
        pAGImageView2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.hm.Qhi(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(cJ2, cJ2);
        layoutParams2.leftMargin = cJ;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(pAGImageView2, layoutParams2);
        PAGImageView pAGImageView3 = new PAGImageView(context);
        int i10 = iMK.Oy;
        pAGImageView3.setId(i10);
        pAGImageView3.setImageDrawable(MQ.ac(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(cJ2, cJ2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = cJ;
        addView(pAGImageView3, layoutParams3);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setId(iMK.DaO);
        pAGTextView.setSingleLine(true);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        pAGTextView.setGravity(17);
        pAGTextView.setTextColor(-16777216);
        pAGTextView.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(zn.cJ(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, i10);
        int cJ3 = zn.cJ(context, 25.0f);
        layoutParams4.rightMargin = cJ3;
        layoutParams4.leftMargin = cJ3;
        addView(pAGTextView, layoutParams4);
    }
}
