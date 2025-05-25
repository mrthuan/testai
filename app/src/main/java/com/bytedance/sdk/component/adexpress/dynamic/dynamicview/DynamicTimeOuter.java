package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.CJ.Dww;
import com.bytedance.sdk.component.adexpress.dynamic.CJ.ABk;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;
import com.bytedance.sdk.component.utils.MQ;

/* loaded from: classes.dex */
public class DynamicTimeOuter extends DynamicButton implements com.bytedance.sdk.component.adexpress.dynamic.ac {
    private boolean MQ;
    private boolean Qhi;
    private boolean cJ;

    public DynamicTimeOuter(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
        dynamicRootView.setTimeOutListener(this);
        if ("timedown".equals(hmVar.WAv().cJ())) {
            dynamicRootView.setTimedown(this.Sf);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ac
    public void Qhi(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        String str = "";
        if (!z11 && !this.MQ) {
            try {
                if (Integer.parseInt((String) charSequence) <= 0) {
                    setVisibility(8);
                    return;
                }
            } catch (Exception unused) {
            }
            setVisibility(0);
            if (!z10 && this.iMK.getRenderRequest().Qhi() && Dww.cJ(this.iMK.getRenderRequest().CJ())) {
                if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
                    ((TextView) this.pA).setText(i10 + "s");
                } else {
                    ((TextView) this.pA).setText(String.format(MQ.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), "tt_reward_full_skip"), Integer.valueOf(i10)));
                }
                this.Qhi = true;
                return;
            } else if (com.bytedance.sdk.component.adexpress.fl.cJ() && !"open_ad".equals(this.iMK.getRenderRequest().CJ()) && this.iMK.getRenderRequest().Qhi()) {
                this.MQ = true;
                setVisibility(8);
                return;
            } else if ("timedown".equals(this.ABk.WAv().cJ())) {
                ((TextView) this.pA).setText(charSequence);
                return;
            } else {
                ((TextView) this.pA).setText(((Object) charSequence) + "s");
                this.cJ = true;
                if (this.Qhi) {
                    CharSequence text = ((TextView) this.pA).getText();
                    if (text != null) {
                        str = text.toString();
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.f8210zc.CJ() + this.f8210zc.ac()) + ABk.cJ(str, this.f8210zc.fl(), true)[0]), this.Sf);
                    layoutParams.gravity = 8388629;
                    this.pA.setLayoutParams(layoutParams);
                    this.Qhi = false;
                    requestLayout();
                    return;
                }
                return;
            }
        }
        ((TextView) this.pA).setText("");
        setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void Tgh() {
        if (!TextUtils.equals("skip-with-countdowns-video-countdown", this.ABk.WAv().cJ()) && !TextUtils.equals("skip-with-time-countdown", this.ABk.WAv().cJ())) {
            super.Tgh();
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ROR, this.Sf);
        layoutParams.gravity = 8388627;
        if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
            layoutParams.leftMargin = this.f8209hm;
        }
        layoutParams.setMarginStart(layoutParams.leftMargin);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicButton, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fl
    public boolean hm() {
        super.hm();
        if (Dww.cJ(this.iMK.getRenderRequest().CJ())) {
            setVisibility(8);
        }
        if ("timedown".equals(this.ABk.WAv().cJ())) {
            ((TextView) this.pA).setText(String.valueOf((int) Double.parseDouble(this.f8210zc.WAv())));
            return true;
        }
        ((TextView) this.pA).setText(((int) Double.parseDouble(this.f8210zc.WAv())) + "s");
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (TextUtils.isEmpty(((TextView) this.pA).getText())) {
            setMeasuredDimension(0, this.Sf);
        }
    }
}
