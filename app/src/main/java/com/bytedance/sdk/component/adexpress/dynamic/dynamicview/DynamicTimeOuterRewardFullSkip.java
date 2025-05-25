package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.CJ.MQ;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;

/* loaded from: classes.dex */
public class DynamicTimeOuterRewardFullSkip extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.ac {
    private boolean Qhi;

    public DynamicTimeOuterRewardFullSkip(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
        if (dynamicRootView.getRenderRequest() != null) {
            this.Qhi = dynamicRootView.getRenderRequest().ABk();
        }
        this.ROR = this.Sf;
        ImageView imageView = new ImageView(context);
        this.pA = imageView;
        imageView.setTag(Integer.valueOf(getClickArea()));
        addView(this.pA, getWidgetLayoutParams());
        dynamicRootView.setTimeOutListener(this);
        if (dynamicRootView.getRenderRequest() != null && !dynamicRootView.getRenderRequest().CQU()) {
            this.pA.setVisibility(8);
            setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.ac
    public void Qhi(CharSequence charSequence, boolean z10, int i10, boolean z11) {
        int i11 = 0;
        if (!z10 && !z11) {
            i11 = 8;
        }
        setVisibility(i11);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fl
    public boolean hm() {
        Drawable ac2;
        super.hm();
        ((ImageView) this.pA).setScaleType(ImageView.ScaleType.CENTER_CROP);
        Drawable Qhi = MQ.Qhi(getContext(), this.f8210zc);
        if (Qhi != null) {
            ((ImageView) this.pA).setBackground(Qhi);
        }
        if (this.Qhi) {
            ac2 = com.bytedance.sdk.component.utils.MQ.ac(getContext(), "tt_close_btn");
        } else {
            ac2 = com.bytedance.sdk.component.utils.MQ.ac(getContext(), "tt_skip_btn");
            if (ac2 != null) {
                ac2.setAutoMirrored(true);
            }
        }
        if (ac2 != null) {
            ((ImageView) this.pA).setImageDrawable(ac2);
        }
        setVisibility(8);
        return true;
    }
}
