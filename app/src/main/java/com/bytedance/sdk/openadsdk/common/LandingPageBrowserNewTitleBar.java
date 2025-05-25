package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGProgressBar;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class LandingPageBrowserNewTitleBar extends RelativeLayout {
    public LandingPageBrowserNewTitleBar(Context context) {
        super(context);
        Qhi();
    }

    private void Qhi() {
        setId(iMK.pv);
        setBackgroundColor(-1);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, zn.cJ(context, 44.0f)));
        PAGImageView pAGImageView = new PAGImageView(context);
        int i10 = iMK.ReL;
        pAGImageView.setId(i10);
        pAGImageView.setClickable(true);
        pAGImageView.setFocusable(true);
        pAGImageView.setPadding(zn.cJ(context, 12.0f), zn.cJ(context, 14.0f), zn.cJ(context, 12.0f), zn.cJ(context, 14.0f));
        pAGImageView.setImageResource(MQ.CJ(context, "tt_ad_xmark"));
        addView(pAGImageView, new RelativeLayout.LayoutParams(zn.cJ(context, 40.0f), zn.cJ(context, 44.0f)));
        PAGImageView pAGImageView2 = new PAGImageView(context);
        int i11 = iMK.gga;
        pAGImageView2.setId(i11);
        pAGImageView2.setPadding(zn.cJ(context, 8.0f), zn.cJ(context, 10.0f), zn.cJ(context, 8.0f), zn.cJ(context, 10.0f));
        pAGImageView2.setImageResource(MQ.CJ(context, "tt_ad_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(zn.cJ(context, 40.0f), zn.cJ(context, 44.0f));
        layoutParams.addRule(11);
        addView(pAGImageView2, layoutParams);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setId(iMK.EGK);
        pAGTextView.setSingleLine(true);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setGravity(17);
        pAGTextView.setTextColor(Color.parseColor("#222222"));
        pAGTextView.setTextSize(2, 17.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(zn.cJ(context, 191.0f), zn.cJ(context, 24.0f));
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, i11);
        layoutParams2.addRule(1, i10);
        int cJ = zn.cJ(context, 10.0f);
        layoutParams2.leftMargin = cJ;
        layoutParams2.rightMargin = cJ;
        addView(pAGTextView, layoutParams2);
        PAGProgressBar pAGProgressBar = new PAGProgressBar(context, null, 16973855);
        pAGProgressBar.setId(iMK.VnT);
        pAGProgressBar.setProgress(1);
        pAGProgressBar.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.hm.Qhi(context, "tt_privacy_progress_style"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, zn.cJ(context, 2.0f));
        layoutParams3.addRule(12);
        addView(pAGProgressBar, layoutParams3);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, zn.cJ(context, 0.5f));
        layoutParams4.addRule(12);
        addView(view, layoutParams4);
    }
}
