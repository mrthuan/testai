package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;
import com.bytedance.sdk.component.adexpress.widget.TTRatingBar2;

/* loaded from: classes.dex */
public class DynamicStarView extends DynamicBaseWidgetImp {
    private int Qhi;

    public DynamicStarView(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
        this.Qhi = 0;
        TTRatingBar2 tTRatingBar2 = new TTRatingBar2(context, null);
        this.pA = tTRatingBar2;
        tTRatingBar2.setTag(Integer.valueOf(getClickArea()));
        addView(this.pA, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void Tgh() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.ROR, this.Sf);
        layoutParams.topMargin = this.WAv;
        int i10 = this.f8209hm + this.Qhi;
        layoutParams.leftMargin = i10;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        int Qhi = (int) (CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.f8210zc.CJ()) + this.f8210zc.ac()) + (CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.f8210zc.fl()) * 5.0f));
        if (this.ROR > Qhi && 4 == this.f8210zc.Sf()) {
            this.Qhi = (this.ROR - Qhi) / 2;
        }
        this.ROR = Qhi;
        return new FrameLayout.LayoutParams(this.ROR, this.Sf);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fl
    public boolean hm() {
        double d10;
        DynamicRootView dynamicRootView;
        super.hm();
        double ABk = this.f8210zc.ABk();
        if (com.bytedance.sdk.component.adexpress.fl.cJ() && (ABk < 0.0d || ABk > 5.0d || ((dynamicRootView = this.iMK) != null && dynamicRootView.getRenderRequest() != null && this.iMK.getRenderRequest().WAv() != 4))) {
            this.pA.setVisibility(8);
            return true;
        }
        if (ABk >= 0.0d && ABk <= 5.0d) {
            d10 = ABk;
        } else {
            d10 = 5.0d;
        }
        this.pA.setVisibility(0);
        ((TTRatingBar2) this.pA).Qhi(d10, this.f8210zc.ROR(), (int) this.f8210zc.fl(), ((int) CQU.Qhi(this.Gm, this.f8210zc.cJ())) + ((int) CQU.Qhi(this.Gm, this.f8210zc.Qhi())) + ((int) CQU.Qhi(this.Gm, this.f8210zc.fl())));
        return true;
    }
}
