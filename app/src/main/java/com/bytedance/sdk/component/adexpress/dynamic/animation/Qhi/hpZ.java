package com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.sdk.component.adexpress.CJ.CQU;
import com.bytedance.sdk.component.adexpress.CJ.tP;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TranslateAnimation.java */
/* loaded from: classes.dex */
public class hpZ extends fl {
    public hpZ(View view, com.bytedance.sdk.component.adexpress.dynamic.ac.Qhi qhi) {
        super(view, qhi);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.fl
    public List<ObjectAnimator> Qhi() {
        float f10;
        float Qhi = CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.cJ.Tgh());
        float Qhi2 = CQU.Qhi(com.bytedance.sdk.component.adexpress.fl.Qhi(), this.cJ.ROR());
        float f11 = 0.0f;
        if ("reverse".equals(this.cJ.hpZ())) {
            f10 = Qhi2;
            Qhi2 = 0.0f;
            f11 = Qhi;
            Qhi = 0.0f;
        } else {
            f10 = 0.0f;
        }
        if (tP.Qhi(this.f8199ac.getContext())) {
            Qhi = -Qhi;
            f11 = -f11;
        }
        this.f8199ac.setTranslationX(Qhi);
        this.f8199ac.setTranslationY(Qhi2);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f8199ac, "translationX", Qhi, f11).setDuration((int) (this.cJ.WAv() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f8199ac, "translationY", Qhi2, f10).setDuration((int) (this.cJ.WAv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Qhi(duration));
        arrayList.add(Qhi(duration2));
        return arrayList;
    }
}
