package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.component.sdk.annotation.ColorInt;
import com.bytedance.sdk.component.adexpress.dynamic.ac.hm;

/* loaded from: classes.dex */
public class DynamicRoot extends DynamicBaseWidgetImp {
    public cJ Qhi;

    public DynamicRoot(Context context, DynamicRootView dynamicRootView, hm hmVar) {
        super(context, dynamicRootView, hmVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public cJ Qhi(Bitmap bitmap) {
        Qhi qhi = new Qhi(bitmap, this.Qhi);
        this.Qhi = qhi;
        return qhi;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public GradientDrawable getDrawable() {
        cJ cJVar = new cJ();
        this.Qhi = cJVar;
        return cJVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.fl
    public boolean hm() {
        return super.hm();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget
    public GradientDrawable Qhi(GradientDrawable.Orientation orientation, @ColorInt int[] iArr) {
        cJ cJVar = new cJ(orientation, iArr);
        this.Qhi = cJVar;
        return cJVar;
    }
}
