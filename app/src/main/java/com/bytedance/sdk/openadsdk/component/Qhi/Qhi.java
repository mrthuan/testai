package com.bytedance.sdk.openadsdk.component.Qhi;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.core.cJ.ac;
import com.bytedance.sdk.openadsdk.core.model.tP;
import java.util.HashMap;

/* compiled from: TTAppOpenAdClickListener.java */
/* loaded from: classes.dex */
public class Qhi extends com.bytedance.sdk.openadsdk.core.cJ.Qhi {
    private final com.bytedance.sdk.openadsdk.component.Sf.Qhi Qhi;

    public Qhi(Context context, tP tPVar, String str, int i10, com.bytedance.sdk.openadsdk.component.Sf.Qhi qhi) {
        super(context, tPVar, str, i10);
        this.Qhi = qhi;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cJ.Qhi, com.bytedance.sdk.openadsdk.core.cJ.cJ, com.bytedance.sdk.openadsdk.core.cJ.ac
    public void Qhi(View view, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, boolean z10) {
        if (view.getTag() == "open_ad_click_button_tag") {
            Qhi("click_bar");
        } else {
            Qhi("click_material");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(this.Qhi.cJ()));
        Qhi(hashMap);
        super.Qhi(view, f10, f11, f12, f13, sparseArray, z10);
        Tgh.Qhi(((com.bytedance.sdk.openadsdk.core.cJ.cJ) this).Tgh, 9);
    }
}
