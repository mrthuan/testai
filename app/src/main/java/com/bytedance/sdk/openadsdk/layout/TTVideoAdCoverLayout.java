package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.CornerIV;
import com.bytedance.sdk.openadsdk.utils.hm;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class TTVideoAdCoverLayout extends PAGRelativeLayout {
    public TTVideoAdCoverLayout(Context context) {
        this(context, null);
    }

    private void Qhi(Context context) {
        setId(iMK.VV);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        PAGImageView pAGImageView = new PAGImageView(getContext());
        pAGImageView.setId(iMK.HWc);
        pAGImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        pAGImageView.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        pAGImageView.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        pAGImageView.setBackgroundColor(Color.parseColor("#7f000000"));
        pAGImageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(pAGImageView);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setId(iMK.Px);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        pAGRelativeLayout.setLayoutParams(layoutParams);
        addView(pAGRelativeLayout);
        int cJ = zn.cJ(context, 44.0f);
        CornerIV cornerIV = new CornerIV(context);
        int i10 = iMK.PAe;
        cornerIV.setId(i10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(cJ, cJ);
        layoutParams2.addRule(14);
        cornerIV.setLayoutParams(layoutParams2);
        cornerIV.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        pAGRelativeLayout.addView(cornerIV);
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setId(iMK.f9381ip);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(cJ, cJ);
        layoutParams3.addRule(8, i10);
        layoutParams3.addRule(19, i10);
        layoutParams3.addRule(5, i10);
        layoutParams3.addRule(7, i10);
        layoutParams3.addRule(18, i10);
        layoutParams3.addRule(6, i10);
        layoutParams3.addRule(14);
        pAGTextView.setLayoutParams(layoutParams3);
        pAGTextView.setBackground(hm.Qhi(context, "tt_circle_solid_mian"));
        pAGTextView.setGravity(17);
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 19.0f);
        pAGTextView.setTypeface(Typeface.defaultFromStyle(1));
        pAGTextView.setVisibility(8);
        pAGRelativeLayout.addView(pAGTextView);
        PAGTextView pAGTextView2 = new PAGTextView(context);
        int i11 = iMK.xyz;
        pAGTextView2.setId(i11);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, i10);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = zn.cJ(context, 6.0f);
        pAGTextView2.setLayoutParams(layoutParams4);
        pAGTextView2.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView2.setMaxLines(1);
        pAGTextView2.setTextColor(-1);
        pAGTextView2.setTextSize(2, 12.0f);
        pAGRelativeLayout.addView(pAGTextView2);
        PAGTextView pAGTextView3 = new PAGTextView(context);
        pAGTextView3.setId(iMK.jPH);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(zn.cJ(context, 100.0f), zn.cJ(context, 28.0f));
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, i11);
        layoutParams5.topMargin = zn.cJ(context, 20.0f);
        pAGTextView3.setLayoutParams(layoutParams5);
        pAGTextView3.setMinWidth(zn.cJ(context, 72.0f));
        pAGTextView3.setMaxLines(1);
        pAGTextView3.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView3.setTextColor(-1);
        pAGTextView3.setTextSize(2, 14.0f);
        pAGTextView3.setBackground(hm.Qhi(context, "tt_ad_cover_btn_begin_bg"));
        pAGTextView3.setGravity(17);
        int cJ2 = zn.cJ(context, 10.0f);
        int cJ3 = zn.cJ(context, 2.0f);
        pAGTextView3.setPadding(cJ2, cJ3, cJ2, cJ3);
        pAGTextView3.setVisibility(8);
        pAGRelativeLayout.addView(pAGTextView3);
    }

    public TTVideoAdCoverLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTVideoAdCoverLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Qhi(context);
    }
}
