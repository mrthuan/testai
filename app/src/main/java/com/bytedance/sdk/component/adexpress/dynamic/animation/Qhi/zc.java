package com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ScaleAnimation.java */
/* loaded from: classes.dex */
public class zc extends fl {
    public zc(View view, com.bytedance.sdk.component.adexpress.dynamic.ac.Qhi qhi) {
        super(view, qhi);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null && (viewGroup2 instanceof DynamicBaseWidget)) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
                ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
                if (viewGroup3 != null && (viewGroup3 instanceof DynamicBaseWidget)) {
                    viewGroup3.setClipChildren(false);
                    viewGroup3.setClipToPadding(false);
                }
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.fl
    public List<ObjectAnimator> Qhi() {
        float f10;
        float Gm = (float) this.cJ.Gm();
        float zc2 = (float) this.cJ.zc();
        String hpZ = this.cJ.hpZ();
        float f11 = 1.0f;
        if (!"reverse".equals(hpZ) && !"alternate-reverse".equals(hpZ)) {
            f10 = zc2;
            zc2 = 1.0f;
            f11 = Gm;
            Gm = 1.0f;
        } else {
            f10 = 1.0f;
        }
        this.f8199ac.setTag(2097610710, this.cJ.cJ());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f8199ac, "scaleX", Gm, f11).setDuration((int) (this.cJ.WAv() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f8199ac, "scaleY", zc2, f10).setDuration((int) (this.cJ.WAv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Qhi(duration));
        arrayList.add(Qhi(duration2));
        return arrayList;
    }
}
