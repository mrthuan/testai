package com.bytedance.sdk.openadsdk.MQ.Qhi;

import android.view.View;
import com.bytedance.sdk.openadsdk.MQ.Qhi.Tgh;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.facebook.ads.AdError;

/* compiled from: PAGVideoMrcTracker.java */
/* loaded from: classes.dex */
public class hm extends cJ {
    private int CJ;

    public hm(Integer num, View view, tP tPVar, Tgh.Qhi qhi) {
        super(num, view, tPVar, AdError.SERVER_ERROR_CODE, qhi);
        this.CJ = 0;
    }

    @Override // com.bytedance.sdk.openadsdk.MQ.Qhi.cJ
    public void CJ() {
        super.CJ();
    }

    @Override // com.bytedance.sdk.openadsdk.MQ.Qhi.cJ
    public void Qhi() {
        if (this.CJ != 1) {
            return;
        }
        super.Qhi();
    }

    @Override // com.bytedance.sdk.openadsdk.MQ.Qhi.cJ
    public int Tgh() {
        return 200;
    }

    @Override // com.bytedance.sdk.openadsdk.MQ.Qhi.cJ
    public boolean ac() {
        if (ROR.Qhi(this.Qhi.get(), this.cJ.eN()) && this.CJ == 1) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.MQ.Qhi.cJ
    public void cJ(int i10) {
        if (hm()) {
            return;
        }
        if (i10 == 6 || i10 == 5) {
            this.CJ = 0;
            Sf();
        }
        if (i10 == 3 || i10 == 2) {
            this.CJ = 2;
            Sf();
        }
        if (this.CJ != 1 && i10 == 0) {
            this.CJ = 1;
            Qhi();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.MQ.Qhi.cJ
    public boolean zc() {
        boolean z10;
        int i10 = this.CJ;
        if (i10 != 2 && i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f8500ac.set(false);
        }
        if (!z10 || super.zc()) {
            return true;
        }
        return false;
    }
}
