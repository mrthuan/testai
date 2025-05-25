package com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* compiled from: RippleAnimation.java */
/* loaded from: classes.dex */
public class hm extends fl {
    public hm(View view, com.bytedance.sdk.component.adexpress.dynamic.ac.Qhi qhi) {
        super(view, qhi);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.fl
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> Qhi() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f8199ac, "rippleValue", 0.0f, 1.0f).setDuration((int) (this.cJ.WAv() * 1000.0d));
        ((ViewGroup) this.f8199ac.getParent()).setClipChildren(false);
        ((ViewGroup) this.f8199ac.getParent().getParent()).setClipChildren(false);
        ((ViewGroup) this.f8199ac.getParent().getParent().getParent()).setClipChildren(false);
        this.f8199ac.setTag(2097610712, this.cJ.Sf());
        ArrayList arrayList = new ArrayList();
        arrayList.add(Qhi(duration));
        return arrayList;
    }
}
