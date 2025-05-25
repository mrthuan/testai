package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGRelativeLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class TTInteractionStyle003002HLayout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle003002HLayout(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public void Qhi(Context context) {
        int cJ = zn.cJ(context, 10.0f);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        pAGLinearLayout.setLayoutParams(layoutParams);
        layoutParams.gravity = 17;
        pAGLinearLayout.setOrientation(1);
        pAGLinearLayout.setPadding(cJ, cJ, cJ, cJ);
        addView(pAGLinearLayout);
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams2.weight = 3.0f;
        pAGFrameLayout.setLayoutParams(layoutParams2);
        pAGLinearLayout.addView(pAGFrameLayout);
        PAGFrameLayout fl2 = fl(context);
        this.Qhi = fl2;
        fl2.setId(iMK.bM);
        this.Qhi.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout.addView(this.Qhi);
        PAGImageView Tgh = Tgh(context);
        this.cJ = Tgh;
        Tgh.setId(iMK.gT);
        this.cJ.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        pAGFrameLayout.addView(this.cJ);
        PAGLogoView Sf = Sf(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        layoutParams3.leftMargin = cJ;
        layoutParams3.topMargin = cJ;
        layoutParams3.bottomMargin = cJ;
        Sf.setLayoutParams(layoutParams3);
        pAGFrameLayout.addView(Sf);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams4.weight = 1.0f;
        pAGRelativeLayout.setLayoutParams(layoutParams4);
        pAGLinearLayout.addView(pAGRelativeLayout);
        TTRoundRectImageView ROR = ROR(context);
        this.f9338ac = ROR;
        int i10 = iMK.XH;
        ROR.setId(i10);
        int cJ2 = zn.cJ(context, 40.0f);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(cJ2, cJ2);
        layoutParams5.addRule(15);
        this.f9338ac.setLayoutParams(layoutParams5);
        pAGRelativeLayout.addView(this.f9338ac);
        PAGTextView cJ3 = cJ(context);
        this.CJ = cJ3;
        cJ3.setId(iMK.IC);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(15);
        layoutParams6.leftMargin = cJ;
        layoutParams6.setMarginStart(cJ);
        layoutParams6.addRule(1, i10);
        layoutParams6.addRule(17, i10);
        this.CJ.setLayoutParams(layoutParams6);
        pAGRelativeLayout.addView(this.CJ);
        PAGTextView CJ = CJ(context);
        this.Tgh = CJ;
        CJ.setId(iMK.HUk);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(zn.cJ(context, 100.0f), zn.cJ(context, 32.0f));
        layoutParams7.addRule(11);
        layoutParams7.addRule(21);
        layoutParams7.addRule(15);
        this.Tgh.setLayoutParams(layoutParams7);
        pAGRelativeLayout.addView(this.Tgh);
    }

    public TTInteractionStyle003002HLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle003002HLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
