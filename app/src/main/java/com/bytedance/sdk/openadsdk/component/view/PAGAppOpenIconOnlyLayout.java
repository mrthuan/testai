package com.bytedance.sdk.openadsdk.component.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.hm;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class PAGAppOpenIconOnlyLayout extends PAGAppOpenBaseLayout {
    private final PAGLinearLayout ABk;
    private final TTRatingBar2 iMK;

    public PAGAppOpenIconOnlyLayout(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#EDFCFF"), Color.parseColor("#FFF6FD")}));
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        this.ABk = pAGLinearLayout;
        pAGLinearLayout.setId(520093758);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = zn.cJ(context, 24.0f);
        layoutParams.topMargin = zn.cJ(context, 56.0f);
        pAGLinearLayout.setLayoutParams(layoutParams);
        pAGLinearLayout.setClickable(false);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setOrientation(0);
        TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
        this.Tgh = tTRoundRectImageView;
        tTRoundRectImageView.setId(520093759);
        this.Tgh.setLayoutParams(new LinearLayout.LayoutParams(zn.cJ(context, 24.0f), zn.cJ(context, 24.0f)));
        PAGTextView pAGTextView = new PAGTextView(context);
        this.ROR = pAGTextView;
        pAGTextView.setId(520093761);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = zn.cJ(context, 8.0f);
        this.ROR.setLayoutParams(layoutParams2);
        this.ROR.setEllipsize(TextUtils.TruncateAt.END);
        this.ROR.setMaxLines(2);
        this.ROR.setTextColor(Color.parseColor("#161823"));
        this.ROR.setTextSize(12.0f);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(zn.cJ(context, 327.0f), -2);
        layoutParams3.addRule(13);
        layoutParams3.leftMargin = zn.cJ(context, 24.0f);
        layoutParams3.rightMargin = zn.cJ(context, 24.0f);
        pAGRelativeLayout.setLayoutParams(layoutParams3);
        TTRoundRectImageView tTRoundRectImageView2 = new TTRoundRectImageView(context);
        this.f8897hm = tTRoundRectImageView2;
        int i10 = iMK.is;
        tTRoundRectImageView2.setId(i10);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(zn.cJ(context, 80.0f), zn.cJ(context, 80.0f));
        layoutParams4.addRule(14);
        this.f8897hm.setLayoutParams(layoutParams4);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        this.WAv = pAGTextView2;
        int i11 = iMK.Ttc;
        pAGTextView2.setId(i11);
        this.WAv.setTextSize(24.0f);
        this.WAv.setTextColor(Color.parseColor("#161823"));
        this.WAv.setGravity(17);
        this.WAv.setMaxLines(1);
        this.WAv.setEllipsize(TextUtils.TruncateAt.END);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(3, i10);
        layoutParams5.topMargin = zn.cJ(context, 12.0f);
        layoutParams5.addRule(14);
        this.WAv.setLayoutParams(layoutParams5);
        PAGTextView pAGTextView3 = new PAGTextView(context);
        this.Gm = pAGTextView3;
        int i12 = iMK.f9378af;
        pAGTextView3.setId(i12);
        this.Gm.setTextSize(16.0f);
        this.Gm.setTextColor(Color.parseColor("#80161823"));
        this.Gm.setGravity(17);
        this.Gm.setMaxLines(2);
        this.Gm.setEllipsize(TextUtils.TruncateAt.END);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams6.addRule(3, i11);
        layoutParams6.topMargin = zn.cJ(context, 4.0f);
        layoutParams6.addRule(14);
        this.Gm.setLayoutParams(layoutParams6);
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(context);
        this.iMK = tTRatingBar2;
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams7.addRule(14);
        layoutParams7.topMargin = zn.cJ(context, 12.0f);
        tTRatingBar2.setLayoutParams(layoutParams7);
        PAGTextView pAGTextView4 = new PAGTextView(context);
        this.f8896fl = pAGTextView4;
        pAGTextView4.setId(520093717);
        this.f8896fl.setBackground(hm.Qhi(context, "tt_reward_full_video_backup_btn_bg"));
        this.f8896fl.setEllipsize(TextUtils.TruncateAt.END);
        this.f8896fl.setLines(1);
        this.f8896fl.setGravity(17);
        this.f8896fl.setTextColor(-1);
        this.f8896fl.setTextSize(16.0f);
        this.f8896fl.setTag("open_ad_click_button_tag");
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, zn.cJ(context, 44.0f));
        layoutParams8.addRule(3, i12);
        layoutParams8.topMargin = zn.cJ(context, 54.0f);
        layoutParams8.addRule(14);
        this.f8896fl.setLayoutParams(layoutParams8);
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        this.CJ = pAGLogoView;
        pAGLogoView.setId(520093757);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, zn.cJ(context, 14.0f));
        layoutParams9.leftMargin = zn.cJ(context, 16.0f);
        layoutParams9.bottomMargin = zn.cJ(context, 24.0f);
        layoutParams9.addRule(12);
        this.CJ.setLayoutParams(layoutParams9);
        addView(this.Sf);
        pAGLinearLayout.addView(this.Tgh);
        pAGLinearLayout.addView(this.ROR);
        addView(pAGLinearLayout);
        pAGRelativeLayout.addView(this.f8897hm);
        pAGRelativeLayout.addView(this.WAv);
        pAGRelativeLayout.addView(this.Gm);
        pAGRelativeLayout.addView(tTRatingBar2);
        pAGRelativeLayout.addView(this.f8896fl);
        addView(pAGRelativeLayout);
        addView(this.CJ);
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
        return this.iMK;
    }

    @Override // com.bytedance.sdk.openadsdk.component.view.PAGAppOpenBaseLayout
    public View getUserInfo() {
        return this.ABk;
    }
}
