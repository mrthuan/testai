package com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.bytedance.sdk.component.adexpress.CJ.tP;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShineAnimation.java */
/* loaded from: classes.dex */
public class ABk extends fl {
    public ABk(View view, com.bytedance.sdk.component.adexpress.dynamic.ac.Qhi qhi) {
        super(view, qhi);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.fl
    @SuppressLint({"ObjectAnimatorBinding"})
    public List<ObjectAnimator> Qhi() {
        int i10;
        int i11;
        this.f8199ac.setTag(2097610711, Integer.valueOf(this.cJ.CJ()));
        View view = this.f8199ac;
        if (view != null && tP.Qhi(view.getContext())) {
            i11 = 0;
            i10 = 1;
        } else {
            i10 = 0;
            i11 = 1;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f8199ac, "shineValue", i10, i11).setDuration((int) (this.cJ.WAv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Qhi(duration));
        return arrayList;
    }
}
