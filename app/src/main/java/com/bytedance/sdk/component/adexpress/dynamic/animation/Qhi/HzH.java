package com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WaggleAnimation.java */
/* loaded from: classes.dex */
public class HzH extends fl {
    public HzH(View view, com.bytedance.sdk.component.adexpress.dynamic.ac.Qhi qhi) {
        super(view, qhi);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.fl
    public List<ObjectAnimator> Qhi() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f8199ac, "translationX", 0.0f, CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), 20.0f), 0.0f, -CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), 20.0f), 0.0f).setDuration((int) (this.cJ.WAv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Qhi(duration));
        return arrayList;
    }
}
