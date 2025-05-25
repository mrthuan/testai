package com.bytedance.sdk.openadsdk.component.reward.cJ;

import com.bytedance.sdk.openadsdk.core.model.MQ;
import com.bytedance.sdk.openadsdk.core.model.bxS;
import com.bytedance.sdk.openadsdk.core.model.tP;

/* compiled from: RewardFullTypeFactory.java */
/* loaded from: classes.dex */
public class ROR {
    public static cJ Qhi(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        tP tPVar = qhi.cJ;
        if ((tPVar instanceof MQ) && ((MQ) tPVar).mvd()) {
            return new Tgh(qhi);
        }
        if (bxS.Gm(tPVar)) {
            return new WAv(qhi);
        }
        if (Sf.Qhi(tPVar)) {
            return new Sf(qhi);
        }
        if (hm.Qhi(tPVar)) {
            return new hm(qhi);
        }
        if (WAv.Qhi(tPVar)) {
            return new WAv(qhi);
        }
        if (ac.Qhi(tPVar)) {
            return new ac(qhi);
        }
        return new fl(qhi);
    }
}
