package com.bytedance.sdk.openadsdk.layout;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.customview.PAGLinearLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGTextView;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class TTInteractionStyle003002Layout extends TTInteractionStyleBaseFrameLayout {
    private PAGImageView ROR;
    private PAGTextView Sf;

    public TTInteractionStyle003002Layout(Context context) {
        this(context, null);
    }

    @Override // com.bytedance.sdk.openadsdk.layout.TTInteractionStyleBaseFrameLayout
    public void Qhi(Context context) {
        int cJ = zn.cJ(context, 6.0f);
        setPadding(cJ, cJ, cJ, cJ);
        PAGFrameLayout fl2 = fl(context);
        this.Qhi = fl2;
        fl2.setId(iMK.bM);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int cJ2 = zn.cJ(context, 26.0f);
        layoutParams.topMargin = cJ2;
        this.Qhi.setLayoutParams(layoutParams);
        addView(this.Qhi);
        PAGImageView pAGImageView = new PAGImageView(context);
        this.ROR = pAGImageView;
        pAGImageView.setId(iMK.pF);
        this.ROR.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.topMargin = cJ2;
        this.ROR.setLayoutParams(layoutParams2);
        addView(this.ROR);
        PAGLogoView Sf = Sf(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 80;
        int cJ3 = zn.cJ(context, 10.0f);
        layoutParams3.leftMargin = cJ3;
        layoutParams3.topMargin = cJ3;
        layoutParams3.bottomMargin = cJ3;
        Sf.setLayoutParams(layoutParams3);
        addView(Sf);
        PAGLinearLayout pAGLinearLayout = new PAGLinearLayout(context);
        pAGLinearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        pAGLinearLayout.setOrientation(0);
        pAGLinearLayout.setGravity(17);
        addView(pAGLinearLayout);
        PAGTextView pAGTextView = new PAGTextView(context);
        this.Sf = pAGTextView;
        pAGTextView.setId(iMK.wp);
        this.Sf.setEllipsize(TextUtils.TruncateAt.END);
        this.Sf.setMaxLines(1);
        this.Sf.setTextColor(-1);
        this.Sf.setTextSize(2, 12.0f);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        this.Sf.setLayoutParams(layoutParams4);
        pAGLinearLayout.addView(this.Sf);
    }

    public PAGTextView getTtBuDescTV() {
        return this.Sf;
    }

    public PAGImageView getTtBuImg() {
        return this.ROR;
    }

    public TTInteractionStyle003002Layout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTInteractionStyle003002Layout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
