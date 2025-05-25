package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.customview.PAGImageView;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.iMK;
import com.bytedance.sdk.openadsdk.utils.zn;

/* loaded from: classes.dex */
public class DSPAdChoice extends PAGImageView {
    public DSPAdChoice(Context context) {
        super(context);
        Qhi();
    }

    private void Qhi() {
        setVisibility(8);
        setId(iMK.smJ);
    }

    public void Qhi(int i10, tP tPVar) {
        if (tPVar.IC() || (tPVar.gT() && tPVar.Sf())) {
            zn.Qhi((View) this, 0);
            com.bytedance.sdk.openadsdk.iMK.ac.Qhi().Qhi((int) zn.Qhi(getContext(), i10, true), this, tPVar);
        }
    }
}
