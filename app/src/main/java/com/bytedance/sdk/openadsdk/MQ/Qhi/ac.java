package com.bytedance.sdk.openadsdk.MQ.Qhi;

import android.view.View;
import com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.core.model.tP;
import java.lang.ref.WeakReference;

/* compiled from: PAGDisplayMrcTracker.java */
/* loaded from: classes.dex */
public class ac extends cJ {
    private int CJ;

    public ac(Integer num, View view, tP tPVar, Tgh.Qhi qhi) {
        super(num, view, tPVar, 1000, qhi);
        this.CJ = -1;
        cJ(view);
    }

    @Override // com.bytedance.sdk.openadsdk.MQ.Qhi.cJ
    public void CJ() {
        super.CJ();
    }

    @Override // com.bytedance.sdk.openadsdk.MQ.Qhi.cJ
    public int Tgh() {
        return 100;
    }

    @Override // com.bytedance.sdk.openadsdk.MQ.Qhi.cJ
    public boolean ac() {
        WeakReference<View> weakReference = this.Qhi;
        boolean z10 = false;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        View view = this.Qhi.get();
        if (this.CJ == -1) {
            cJ(view);
        }
        if (this.CJ == 1) {
            z10 = true;
        }
        return ROR.Qhi(view, z10, this.cJ.eN());
    }

    @Override // com.bytedance.sdk.openadsdk.MQ.Qhi.cJ
    public void cJ(int i10) {
    }

    private void cJ(View view) {
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            this.CJ = width * height >= 242500 ? 1 : 0;
        }
    }
}
