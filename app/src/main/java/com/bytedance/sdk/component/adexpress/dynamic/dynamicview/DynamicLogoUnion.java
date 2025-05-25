package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;
import com.bytedance.sdk.component.utils.MQ;

/* loaded from: classes.dex */
public class DynamicLogoUnion extends DynamicBaseWidgetImp {
    public DynamicLogoUnion(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
        ImageView imageView = new ImageView(context);
        this.pA = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
            this.Sf = Math.max(dynamicRootView.getLogoUnionHeight(), this.Sf);
        }
        addView(this.pA, getWidgetLayoutParams());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fl
    public boolean hm() {
        super.hm();
        if (com.bytedance.sdk.component.adexpress.fl.cJ()) {
            ((ImageView) this.pA).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        }
        ((ImageView) this.pA).setImageResource(MQ.CJ(getContext(), "tt_ad_logo"));
        ((ImageView) this.pA).setColorFilter(this.f8210zc.ROR(), PorterDuff.Mode.SRC_IN);
        return true;
    }
}
