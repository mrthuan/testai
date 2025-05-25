package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class TTInteractionStyle002003Layout extends TTInteractionStyleBaseFrameLayout {
    public TTInteractionStyle002003Layout(Context context) {
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
        layoutParams.weight = 337.0f;
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
        layoutParams3.weight = 263.0f;
        pAGLinearLayout2.setLayoutParams(layoutParams3);
        pAGLinearLayout2.setOrientation(1);
        pAGLinearLayout2.setGravity(81);
        int cJ2 = zn.cJ(context, 16.0f);
        pAGLinearLayout2.setPadding(cJ2, cJ2, cJ2, cJ2);
        pAGLinearLayout.addView(pAGLinearLayout2);
        TTRoundRectImageView ROR = ROR(context);
        this.f9338ac = ROR;
        ROR.setId(iMK.XH);
        int cJ3 = zn.cJ(context, 45.0f);
        this.f9338ac.setLayoutParams(new LinearLayout.LayoutParams(cJ3, cJ3));
        pAGLinearLayout2.addView(this.f9338ac);
        PAGTextView cJ4 = cJ(context);
        this.CJ = cJ4;
        cJ4.setId(iMK.IC);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = zn.cJ(context, 4.0f);
        this.CJ.setLayoutParams(layoutParams4);
        pAGLinearLayout2.addView(this.CJ);
        PAGTextView ac2 = ac(context);
        this.f9339fl = ac2;
        ac2.setId(iMK.cJP);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.topMargin = cJ;
        layoutParams5.bottomMargin = zn.cJ(context, 25.0f);
        this.f9339fl.setLayoutParams(layoutParams5);
        pAGLinearLayout2.addView(this.f9339fl);
        PAGTextView CJ = CJ(context);
        this.Tgh = CJ;
        CJ.setId(iMK.HUk);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, zn.cJ(context, 32.0f));
        layoutParams6.topMargin = cJ2;
        this.Tgh.setLayoutParams(layoutParams6);
        pAGLinearLayout2.addView(this.Tgh);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public PAGTextView cJ(Context context) {
        PAGTextView cJ = super.cJ(context);
        cJ.setTextColor(-1);
        return cJ;
    }

    public TTInteractionStyle002003Layout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle002003Layout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
