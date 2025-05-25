package com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AlphaAnimation.java */
/* loaded from: classes.dex */
public class Qhi extends fl {
    public Qhi(View view, com.bytedance.sdk.component.adexpress.dynamic.ac.Qhi qhi) {
        super(view, qhi);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.fl
    public List<ObjectAnimator> Qhi() {
        float kYc = this.cJ.kYc() / 100.0f;
        float tP = this.cJ.tP() / 100.0f;
        if ("reverse".equals(this.cJ.hpZ()) && this.cJ.iMK() <= 0.0d) {
            tP = kYc;
            kYc = tP;
        }
        this.f8199ac.setAlpha(kYc);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f8199ac, "alpha", kYc, tP).setDuration((int) (this.cJ.WAv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Qhi(duration));
        return arrayList;
    }
}
