package com.bytedance.sdk.openadsdk.component.Sf;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.cJ.CJ.cJ.hpZ;
import com.bytedance.sdk.openadsdk.cJ.Sf;
import com.bytedance.sdk.openadsdk.core.model.tP;

/* compiled from: TTAppOpenVideoController.java */
/* loaded from: classes.dex */
public class cJ extends com.bytedance.sdk.openadsdk.core.video.ac.Qhi {
    public cJ(Context context, ViewGroup viewGroup, tP tPVar) {
        super(context, viewGroup, tPVar, null);
    }

    public void Qhi(hpZ.Qhi qhi) {
        com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.Qhi(this.ROR, qhi, (Sf) null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.ac.Qhi
    public void kYc() {
        hpZ.Qhi qhi = new hpZ.Qhi();
        qhi.Qhi(fl());
        qhi.ac(Sf());
        qhi.cJ(Tgh());
        qhi.CJ(ROR());
        com.bytedance.sdk.openadsdk.cJ.CJ.Qhi.Qhi.fl(this.ROR, qhi);
    }
}
