package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.MQ;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class PAGLogoView extends LinearLayout {
    public PAGLogoView(Context context) {
        this(context, null);
    }

    private void Qhi(Context context) {
        zn.cJ(context, 1.0f);
        int cJ = zn.cJ(context, 2.0f);
        PAGImageView pAGImageView = new PAGImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(zn.cJ(context, 14.0f), zn.cJ(context, 6.0f));
        layoutParams.leftMargin = cJ;
        pAGImageView.setLayoutParams(layoutParams);
        pAGImageView.setImageDrawable(MQ.ac(context, "tt_ad_logo"));
        PAGTextView pAGTextView = new PAGTextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        layoutParams2.leftMargin = cJ;
        layoutParams2.rightMargin = cJ;
        pAGTextView.setLayoutParams(layoutParams2);
        pAGTextView.setText(MQ.Qhi(context, "tt_logo_en"));
        pAGTextView.setTextSize(1, 8.0f);
        pAGTextView.setGravity(17);
        pAGTextView.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(pAGImageView);
        addView(pAGTextView);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(cJ);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = zn.cJ(getContext(), 12.0f);
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.customview.Qhi.Qhi(this, layoutParams));
    }

    public PAGLogoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Qhi(context);
    }
}
