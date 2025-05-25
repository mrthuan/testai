package com.bytedance.sdk.openadsdk.component.reward.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.customview.PAGFrameLayout;

/* loaded from: classes.dex */
public class RewardFullBaseLayout extends PAGFrameLayout {
    private final com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi Qhi;

    public RewardFullBaseLayout(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        super(qhi.f8800ip);
        this.Qhi = qhi;
        if (qhi.Ura == null) {
            setFitsSystemWindows(true);
        }
    }

    public void Qhi(com.bytedance.sdk.openadsdk.component.reward.cJ.cJ cJVar) {
        RFEndCardBackUpLayout Sf;
        cJVar.Qhi(this);
        if (this.Qhi.Qhi != 1 && (Sf = cJVar.Sf()) != null) {
            addView(Sf, new FrameLayout.LayoutParams(-1, -1));
        }
        Qhi(cJVar.hm(), this);
        Qhi(cJVar.WAv(), this);
    }

    private void Qhi(View view, ViewGroup viewGroup) {
        if (view != null) {
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
    }
}
