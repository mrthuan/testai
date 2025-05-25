package com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: StretchAnimation.java */
/* loaded from: classes.dex */
public class iMK extends fl {
    public iMK(View view, com.bytedance.sdk.component.adexpress.dynamic.ac.Qhi qhi) {
        super(view, qhi);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.fl
    public List<ObjectAnimator> Qhi() {
        View view = this.f8199ac;
        if ((view instanceof ImageView) && (view.getParent() instanceof DynamicImageView)) {
            View view2 = (View) this.f8199ac.getParent();
            this.f8199ac = view2;
            ((ViewGroup) view2).setClipChildren(true);
            ((ViewGroup) this.f8199ac.getParent()).setClipChildren(true);
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f8199ac, "stretchValue", 0.0f, 1.0f).setDuration((int) (this.cJ.WAv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Qhi(duration));
        return arrayList;
    }
}
