package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.CJ.MQ;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;
import com.bytedance.sdk.component.adexpress.widget.DislikeView;

/* loaded from: classes.dex */
public class DynamicDislike extends DynamicBaseWidgetImp {
    public DynamicDislike(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
        if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
            this.pA = new ImageView(context);
        } else {
            this.pA = new DislikeView(context);
        }
        this.pA.setTag(3);
        addView(this.pA, getWidgetLayoutParams());
        dynamicRootView.setDislikeView(this.pA);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fl
    public boolean hm() {
        super.hm();
        if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
            Drawable Qhi = MQ.Qhi(getContext(), this.f8210zc);
            if (Qhi != null) {
                this.pA.setBackground(Qhi);
            }
            int CJ = com.bytedance.sdk.component.utils.MQ.CJ(getContext(), "tt_close_btn");
            if (CJ > 0) {
                ((ImageView) this.pA).setImageResource(CJ);
            }
            ((ImageView) this.pA).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        int Qhi2 = (int) CQU.Qhi(this.Gm, this.f8210zc.HzH());
        View view = this.pA;
        if (view instanceof DislikeView) {
            ((DislikeView) view).setRadius((int) CQU.Qhi(this.Gm, this.f8210zc.pA()));
            ((DislikeView) this.pA).setStrokeWidth(Qhi2);
            ((DislikeView) this.pA).setStrokeColor(this.f8210zc.hpZ());
            ((DislikeView) this.pA).setBgColor(this.f8210zc.aP());
            ((DislikeView) this.pA).setDislikeColor(this.f8210zc.ROR());
            ((DislikeView) this.pA).setDislikeWidth((int) CQU.Qhi(this.Gm, 1.0f));
        }
        return true;
    }
}
