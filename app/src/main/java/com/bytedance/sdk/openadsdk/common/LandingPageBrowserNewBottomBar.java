package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class LandingPageBrowserNewBottomBar extends LinearLayout {
    public LandingPageBrowserNewBottomBar(Context context) {
        super(context);
        Qhi();
    }

    private static ImageView Qhi(Context context, float f10, float f11, float f12, float f13) {
        PAGImageView pAGImageView = new PAGImageView(context);
        pAGImageView.setClickable(true);
        pAGImageView.setFocusable(true);
        pAGImageView.setPadding(zn.cJ(context, f12), zn.cJ(context, f13), zn.cJ(context, f12), zn.cJ(context, f13));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(zn.cJ(context, 40.0f), zn.cJ(context, 44.0f));
        if (f10 > 0.0f) {
            layoutParams.leftMargin = zn.cJ(context, f10);
        }
        if (f11 > 0.0f) {
            layoutParams.rightMargin = zn.cJ(context, f11);
        }
        pAGImageView.setLayoutParams(layoutParams);
        return pAGImageView;
    }

    private void Qhi() {
        Context context = getContext();
        setId(iMK.Ri);
        setLayoutParams(new ViewGroup.LayoutParams(-1, zn.cJ(context, 44.5f)));
        setBackgroundColor(-1);
        setClickable(true);
        setFocusable(true);
        setOrientation(1);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        addView(view, new LinearLayout.LayoutParams(-1, zn.cJ(context, 0.5f)));
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setOrientation(0);
        addView(pAGLinearLayout, new LinearLayout.LayoutParams(-1, zn.cJ(context, 44.0f)));
        ImageView Qhi = Qhi(context, 16.0f, 0.0f, 14.75f, 12.5f);
        Qhi.setId(iMK.Ura);
        Qhi.setImageResource(MQ.CJ(context, "tt_ad_arrow_backward"));
        pAGLinearLayout.addView(Qhi);
        View view2 = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        pAGLinearLayout.addView(view2, layoutParams);
        ImageView Qhi2 = Qhi(context, 8.0f, 0.0f, 14.75f, 12.5f);
        Qhi2.setId(iMK.PER);
        Qhi2.setImageResource(MQ.CJ(context, "tt_ad_arrow_forward"));
        pAGLinearLayout.addView(Qhi2);
        View view3 = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, 0);
        layoutParams2.weight = 1.0f;
        pAGLinearLayout.addView(view3, layoutParams2);
        ImageView Qhi3 = Qhi(context, 8.0f, 0.0f, 10.0f, 12.0f);
        Qhi3.setId(iMK.Gy);
        Qhi3.setImageResource(MQ.CJ(context, "tt_ad_refresh"));
        pAGLinearLayout.addView(Qhi3);
        View view4 = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        pAGLinearLayout.addView(view4, layoutParams3);
        ImageView Qhi4 = Qhi(context, 0.0f, 16.0f, 9.0f, 11.0f);
        Qhi4.setId(iMK.et);
        Qhi4.setImageResource(MQ.CJ(context, "tt_ad_link"));
        pAGLinearLayout.addView(Qhi4);
    }
}
