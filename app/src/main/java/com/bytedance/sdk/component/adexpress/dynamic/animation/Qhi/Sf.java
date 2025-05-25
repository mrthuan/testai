package com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MarqueeAnimation.java */
/* loaded from: classes.dex */
public class Sf extends fl {
    public Sf(View view, com.bytedance.sdk.component.adexpress.dynamic.ac.Qhi qhi) {
        super(view, qhi);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.fl
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> Qhi() {
        this.f8199ac.setTag(2097610709, Integer.valueOf(this.cJ.ac()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f8199ac, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.cJ.WAv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Qhi(duration));
        return arrayList;
    }
}
