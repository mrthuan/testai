package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.CJ.MQ;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;

/* loaded from: classes.dex */
public class DynamicTimeOuterSkip extends DynamicBaseWidgetImp implements com.bytedance.sdk.component.adexpress.dynamic.ac {
    public DynamicTimeOuterSkip(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
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
        super.hm();
        View view = this.pA;
        if (view != null) {
            ((ImageView) view).setScaleType(ImageView.ScaleType.CENTER_CROP);
            Drawable Qhi = MQ.Qhi(getContext(), this.f8210zc);
            if (Qhi != null) {
                ((ImageView) this.pA).setBackground(Qhi);
            }
            Drawable ac2 = com.bytedance.sdk.component.utils.MQ.ac(getContext(), "tt_skip_btn");
            if (ac2 != null) {
                ac2.setAutoMirrored(true);
                ((ImageView) this.pA).setImageDrawable(ac2);
            }
            int Qhi2 = (int) CQU.Qhi(this.Gm, this.f8210zc.cJ());
            this.pA.setPadding(Qhi2, Qhi2, Qhi2, Qhi2);
        }
        setVisibility(8);
        return true;
    }
}
