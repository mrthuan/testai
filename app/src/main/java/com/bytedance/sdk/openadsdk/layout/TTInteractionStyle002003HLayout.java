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
public class TTInteractionStyle002003HLayout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle002003HLayout(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public void Qhi(Context context) {
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        pAGLinearLayout.setOrientation(1);
        addView(pAGLinearLayout);
        PAGFrameLayout pAGFrameLayout = new PAGFrameLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 2.0f;
        pAGFrameLayout.setLayoutParams(layoutParams);
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
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 80;
        int cJ = zn.cJ(context, 10.0f);
        layoutParams2.leftMargin = cJ;
        layoutParams2.topMargin = cJ;
        layoutParams2.bottomMargin = cJ;
        Sf.setLayoutParams(layoutParams2);
        pAGFrameLayout.addView(Sf);
        PAGLinearLayout pAGLinearLayout2 = new PAGLinearLayout(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 1.0f;
        pAGLinearLayout2.setLayoutParams(layoutParams3);
        pAGLinearLayout2.setOrientation(1);
        pAGLinearLayout2.setGravity(81);
        int cJ2 = zn.cJ(context, 16.0f);
        pAGLinearLayout2.setPadding(cJ2, cJ2, cJ2, cJ2);
        pAGLinearLayout.addView(pAGLinearLayout2);
        PAGRelativeLayout pAGRelativeLayout = new PAGRelativeLayout(context);
        pAGRelativeLayout.setId(iMK.Wrw);
        pAGRelativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, zn.cJ(context, 40.0f)));
        pAGRelativeLayout.setGravity(17);
        pAGLinearLayout2.addView(pAGRelativeLayout);
        TTRoundRectImageView ROR = ROR(context);
        this.f9338ac = ROR;
        ROR.setId(iMK.XH);
        int cJ3 = zn.cJ(context, 35.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(cJ3, cJ3);
        layoutParams4.addRule(20);
        layoutParams4.addRule(9);
        layoutParams4.addRule(15);
        this.f9338ac.setLayoutParams(layoutParams4);
        pAGRelativeLayout.addView(this.f9338ac);
        PAGTextView cJ4 = cJ(context);
        this.CJ = cJ4;
        cJ4.setId(iMK.IC);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, cJ * 2);
        int cJ5 = zn.cJ(context, 6.0f);
        layoutParams5.leftMargin = cJ5;
        layoutParams5.setMarginStart(cJ5);
        layoutParams5.addRule(1, this.f9338ac.getId());
        layoutParams5.addRule(17, this.f9338ac.getId());
        this.CJ.setLayoutParams(layoutParams5);
        pAGRelativeLayout.addView(this.CJ);
        PAGTextView ac2 = ac(context);
        this.f9339fl = ac2;
        ac2.setId(iMK.cJP);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, zn.cJ(context, 20.0f));
        layoutParams6.addRule(3, this.CJ.getId());
        layoutParams6.addRule(8, this.f9338ac.getId());
        layoutParams6.addRule(17, this.f9338ac.getId());
        layoutParams6.addRule(1, this.f9338ac.getId());
        layoutParams6.leftMargin = cJ5;
        layoutParams6.setMarginStart(cJ5);
        this.f9339fl.setLayoutParams(layoutParams6);
        pAGRelativeLayout.addView(this.f9339fl);
        PAGTextView CJ = CJ(context);
        this.Tgh = CJ;
        CJ.setId(iMK.HUk);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, zn.cJ(context, 22.0f));
        layoutParams7.topMargin = cJ2;
        this.Tgh.setLayoutParams(layoutParams7);
        pAGLinearLayout2.addView(this.Tgh);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public PAGTextView ac(Context context) {
        PAGTextView ac2 = super.ac(context);
        ac2.setTextColor(-1);
        return ac2;
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public PAGTextView cJ(Context context) {
        PAGTextView cJ = super.cJ(context);
        cJ.setTextColor(-1);
        cJ.setTextSize(2, 13.0f);
        cJ.setText("Pangle");
        return cJ;
    }

    public TTInteractionStyle002003HLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle002003HLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
