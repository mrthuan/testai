package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.HzH;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;

/* compiled from: RewardFullNativeVideoLayout.java */
/* loaded from: classes.dex */
public class fl extends Tgh {
    public fl(com.bytedance.sdk.openadsdk.component.reward.Qhi.Qhi qhi) {
        super(qhi);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.Tgh
    public boolean Qhi() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.Tgh
    public void Qhi(int i10, int i11) {
        super.Qhi(i10, i11);
        if (tP.fl(this.CJ) && this.CJ.aP() == 3 && this.CJ.NFd() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.f8880ac.yN.findViewById(iMK.WAv);
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.CJ.SL() == 1) {
                    int cJ = zn.cJ(HzH.Qhi(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = cJ;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
