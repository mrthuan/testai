package com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CutInAnimation.java */
/* loaded from: classes.dex */
public class ROR extends fl {
    public ROR(View view, com.bytedance.sdk.component.adexpress.dynamic.ac.Qhi qhi) {
        super(view, qhi);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.fl
    public List<ObjectAnimator> Qhi() {
        float f10 = this.f8199ac.getLayoutParams().width;
        this.f8199ac.setTranslationX(f10);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f8199ac, "translationX", f10, 0.0f).setDuration((int) (this.cJ.WAv() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f8199ac, "alpha", 0.0f, 1.0f).setDuration((int) (this.cJ.WAv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Qhi(duration));
        arrayList.add(Qhi(duration2));
        return arrayList;
    }
}
