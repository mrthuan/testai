package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;
import java.util.List;

/* loaded from: classes.dex */
public class DynamicSkipCountDownContainer extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.ac {
    private int MQ;
    private int Qhi;
    private int cJ;

    public DynamicSkipCountDownContainer(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
        setTag(Integer.valueOf(getClickArea()));
        dynamicRootView.setTimeOutListener(this);
        Qhi();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ac
    public void Qhi(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        this.MQ = i10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public void Tgh() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int i10 = this.f8209hm;
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = this.WAv;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp
    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(-2, -2);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fl
    public boolean hm() {
        setBackground(getBackgroundDrawable());
        setPadding((int) CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.f8210zc.ac()), (int) CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.f8210zc.cJ()), (int) CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.f8210zc.CJ()), (int) CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.f8210zc.Qhi()));
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.MQ == 0) {
            setMeasuredDimension(this.cJ, this.Sf);
        } else {
            setMeasuredDimension(this.Qhi, this.Sf);
        }
    }

    private void Qhi() {
        List<hm> Gm = this.ABk.Gm();
        if (Gm == null || Gm.size() <= 0) {
            return;
        }
        for (hm hmVar : Gm) {
            if (hmVar.WAv().Qhi() == 21) {
                this.Qhi = (int) (this.ROR - CQU.Qhi(this.Gm, hmVar.Sf()));
            }
            if (hmVar.WAv().Qhi() == 20) {
                this.cJ = (int) (this.ROR - CQU.Qhi(this.Gm, hmVar.Sf()));
            }
        }
    }
}
