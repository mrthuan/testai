package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;
import com.bytedance.sdk.component.utils.MQ;

/* loaded from: classes.dex */
public class DynamicSkipCountDownBtn extends DynamicButton implements com.bytedance.sdk.component.adexpress.dynamic.ac {
    private int MQ;
    private int[] Qhi;
    private int cJ;

    public DynamicSkipCountDownBtn(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
        dynamicRootView.setTimeOutListener(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ac
    @SuppressLint({"SetTextI18n"})
    public void Qhi(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        String Qhi = MQ.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), "tt_reward_screen_skip_tx");
        if (i10 == 0) {
            this.pA.setVisibility(0);
            ((TextView) this.pA).setText("| ".concat(String.valueOf(Qhi)));
            this.pA.measure(-2, -2);
            this.Qhi = new int[]{this.pA.getMeasuredWidth() + 1, this.pA.getMeasuredHeight()};
            View view = this.pA;
            int[] iArr = this.Qhi;
            view.setLayoutParams(new FrameLayout.LayoutParams(iArr[0], iArr[1]));
            ((TextView) this.pA).setGravity(17);
            ((TextView) this.pA).setIncludeFontPadding(false);
            Qhi();
            this.pA.setPadding(this.f8210zc.ac(), this.cJ, this.f8210zc.CJ(), this.MQ);
        }
        requestLayout();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void Tgh() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ROR, this.Sf);
        layoutParams.gravity = 8388629;
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fl
    public boolean hm() {
        super.hm();
        ((TextView) this.pA).setText("");
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.pA).getText())) {
            setMeasuredDimension(0, this.Sf);
        } else {
            setMeasuredDimension(this.ROR, this.Sf);
        }
    }

    private void Qhi() {
        this.cJ = ((this.Sf - ((int) CQU.Qhi(this.Gm, this.f8210zc.fl()))) / 2) - this.f8210zc.Qhi();
        this.MQ = 0;
    }
}
