package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.hm;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class TTInteractionStyle016009VLayout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle016009VLayout(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public PAGTextView CJ(Context context) {
        PAGTextView CJ = super.CJ(context);
        CJ.setBackground(hm.Qhi(context, "tt_download_corner_bg"));
        CJ.setTextSize(2, 14.0f);
        return CJ;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public void Qhi(Context context) {
        int cJ = zn.cJ(context, 10.0f);
        int cJ2 = zn.cJ(context, 6.0f);
        int cJ3 = zn.cJ(context, 16.0f);
        int cJ4 = zn.cJ(context, 15.0f);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        pAGRelativeLayout.setLayoutParams(layoutParams);
        addView(pAGRelativeLayout);
        PAGFrameLayout fl2 = fl(context);
        this.Qhi = fl2;
        fl2.setId(iMK.bM);
        this.Qhi.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        pAGRelativeLayout.addView(this.Qhi);
        PAGImageView Tgh = Tgh(context);
        this.cJ = Tgh;
        Tgh.setId(iMK.gT);
        this.cJ.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        pAGRelativeLayout.addView(this.cJ);
        PAGRelativeLayout pAGRelativeLayout2 = new PAGRelativeLayout(context);
        int i10 = iMK.SO;
        pAGRelativeLayout2.setId(i10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, zn.cJ(context, 48.0f));
        layoutParams2.addRule(12);
        pAGRelativeLayout2.setLayoutParams(layoutParams2);
        pAGRelativeLayout2.setBackgroundColor(Color.parseColor("#26000000"));
        pAGRelativeLayout2.setGravity(16);
        pAGRelativeLayout2.setPadding(cJ4, 0, 0, 0);
        pAGRelativeLayout.addView(pAGRelativeLayout2);
        TTRoundRectImageView ROR = ROR(context);
        this.f9338ac = ROR;
        int i11 = iMK.XH;
        ROR.setId(i11);
        int cJ5 = zn.cJ(context, 40.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(cJ5, cJ5);
        layoutParams3.addRule(20);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        layoutParams3.leftMargin = cJ;
        layoutParams3.setMarginStart(cJ);
        this.f9338ac.setLayoutParams(layoutParams3);
        pAGRelativeLayout2.addView(this.f9338ac);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams4.addRule(17, i11);
        layoutParams4.addRule(1, i11);
        pAGLinearLayout.setLayoutParams(layoutParams4);
        pAGLinearLayout.setGravity(16);
        pAGLinearLayout.setOrientation(1);
        pAGRelativeLayout2.addView(pAGLinearLayout);
        PAGTextView cJ6 = cJ(context);
        this.CJ = cJ6;
        cJ6.setId(iMK.IC);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(zn.cJ(context, 130.0f), zn.cJ(context, 20.0f));
        layoutParams5.leftMargin = cJ2;
        layoutParams5.setMarginStart(cJ2);
        this.CJ.setLayoutParams(layoutParams5);
        pAGLinearLayout.addView(this.CJ);
        PAGTextView ac2 = ac(context);
        this.f9339fl = ac2;
        ac2.setId(iMK.cJP);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.leftMargin = cJ2;
        layoutParams6.setMarginStart(cJ2);
        this.f9339fl.setLayoutParams(layoutParams6);
        pAGLinearLayout.addView(this.f9339fl);
        PAGTextView CJ = CJ(context);
        this.Tgh = CJ;
        CJ.setId(iMK.HUk);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(zn.cJ(context, 80.0f), zn.cJ(context, 30.0f));
        layoutParams7.addRule(21);
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        layoutParams7.rightMargin = cJ;
        layoutParams7.setMarginEnd(cJ);
        this.Tgh.setLayoutParams(layoutParams7);
        pAGRelativeLayout2.addView(this.Tgh);
        View Sf = Sf(context);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams8.addRule(2, i10);
        layoutParams8.leftMargin = cJ3;
        layoutParams8.bottomMargin = cJ;
        Sf.setLayoutParams(layoutParams8);
        pAGRelativeLayout.addView(Sf);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public PAGTextView ac(Context context) {
        PAGTextView ac2 = super.ac(context);
        ac2.setGravity(16);
        ac2.setMaxWidth(zn.cJ(context, 153.0f));
        ac2.setTextColor(-1);
        ac2.setTextSize(2, 13.0f);
        return ac2;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public PAGTextView cJ(Context context) {
        PAGTextView pAGTextView = new PAGTextView(context);
        pAGTextView.setEllipsize(TextUtils.TruncateAt.END);
        pAGTextView.setGravity(16);
        pAGTextView.setMaxWidth(zn.cJ(context, 153.0f));
        pAGTextView.setSingleLine();
        pAGTextView.setText("Pangle");
        pAGTextView.setTextColor(-1);
        pAGTextView.setTextSize(2, 14.0f);
        return pAGTextView;
    }

    public TTInteractionStyle016009VLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle016009VLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
