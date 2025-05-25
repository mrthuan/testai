package com.bytedance.sdk.openadsdk.core.cJ;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.cJ.ac;
import com.bytedance.sdk.openadsdk.core.model.tP;

/* compiled from: RewardBarClickListener.java */
/* loaded from: classes.dex */
public abstract class Tgh extends Qhi {
    public Tgh(Context context, tP tPVar, String str, int i10) {
        super(context, tPVar, str, i10);
    }

    public abstract void Qhi(View view, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, int i10, int i11, int i12, boolean z10);

    @Override // com.bytedance.sdk.openadsdk.core.cJ.Qhi, com.bytedance.sdk.openadsdk.core.cJ.cJ, com.bytedance.sdk.openadsdk.core.cJ.ac
    public void Qhi(View view, float f10, float f11, float f12, float f13, SparseArray<ac.Qhi> sparseArray, boolean z10) {
        if (Qhi(view, z10)) {
            Qhi(view, f10, f11, f12, f13, sparseArray, this.NFd, this.Eh, this.aP, z10);
        }
        super.Qhi(view, f10, f11, f12, f13, sparseArray, z10);
    }
}
