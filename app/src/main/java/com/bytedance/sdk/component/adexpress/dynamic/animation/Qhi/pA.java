package com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import lib.zj.office.fc.ss.util.CellUtil;

/* compiled from: SwingAnimation.java */
/* loaded from: classes.dex */
public class pA extends fl {
    public pA(View view, com.bytedance.sdk.component.adexpress.dynamic.ac.Qhi qhi) {
        super(view, qhi);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.Qhi.fl
    public List<ObjectAnimator> Qhi() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f8199ac, CellUtil.ROTATION, 0.0f, this.cJ.fl(), 0.0f, this.cJ.fl(), 0.0f).setDuration((int) (this.cJ.WAv() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(Qhi(duration));
        return arrayList;
    }
}
