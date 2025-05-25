package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.component.utils.ABk;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.activity.cJ;
import com.bytedance.sdk.openadsdk.core.model.tP;
import com.bytedance.sdk.openadsdk.utils.lG;

/* compiled from: Scene.java */
/* loaded from: classes.dex */
public abstract class ROR {
    protected IListenerManager Gm;
    private final cJ Qhi;
    protected final tP Sf;
    public boolean WAv;

    /* renamed from: hm  reason: collision with root package name */
    public int f8522hm;

    /* renamed from: zc  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.WAv.Tgh f8523zc = new com.bytedance.sdk.openadsdk.WAv.Tgh() { // from class: com.bytedance.sdk.openadsdk.activity.ROR.1
        @Override // com.bytedance.sdk.openadsdk.WAv.Tgh
        public void Qhi() {
            ROR.this.iMK();
        }
    };

    public ROR(cJ cJVar, tP tPVar, int i10) {
        this.Qhi = cJVar;
        this.Sf = tPVar;
        this.f8522hm = i10;
    }

    public void CQU() {
        this.Qhi.Qhi(this);
    }

    public Activity Dww() {
        return this.Qhi.ac();
    }

    public void Eh() {
        if (this.Qhi.pA()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            Qhi("onAdShow");
        } else {
            this.Qhi.zc();
        }
        this.Qhi.hpZ();
    }

    public abstract String MQ();

    public abstract View Qhi();

    public void Qhi(Activity activity) {
    }

    public final void aP() {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            Qhi("onAdVideoBarClick");
        } else {
            this.Qhi.WAv();
        }
    }

    public abstract boolean a_();

    public void ac(Activity activity) {
    }

    public abstract String b_();

    public cJ bxS() {
        return this.Qhi;
    }

    public void cJ(Activity activity) {
    }

    public void pM() {
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            Qhi("onAdClose");
        } else {
            this.Qhi.Gm();
        }
    }

    public abstract boolean tP();

    private void cJ(final String str) {
        lG.ac(new hm("FullScreen_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.ROR.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ROR.this.ac(1).executeFullVideoCallback(ROR.this.MQ(), str);
                } catch (Throwable th2) {
                    ABk.Qhi("Scene", "fullscreen_interstitial_ad", "executeFullVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    public void Qhi(Activity activity, Bundle bundle) {
    }

    public final IListenerManager ac(int i10) {
        if (this.Gm == null) {
            this.Gm = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.Qhi.Qhi().Qhi(i10));
        }
        return this.Gm;
    }

    public void Qhi(Activity activity, cJ.fl flVar) {
    }

    public void Qhi(ROR ror, ROR ror2, cJ.fl flVar) {
    }

    public void Qhi(boolean z10, boolean z11, boolean z12, int i10) {
        this.Qhi.Qhi(this, z10, z11, z12, i10);
    }

    public void Qhi(String str) {
        if (a_()) {
            Qhi(str, false, 0, "", 0, "");
        } else {
            cJ(str);
        }
    }

    private void Qhi(final String str, final boolean z10, final int i10, final String str2, final int i11, final String str3) {
        lG.ac(new hm("Reward_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.ROR.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ROR.this.ac(0).executeRewardVideoCallback(ROR.this.MQ(), str, z10, i10, str2, i11, str3);
                } catch (Throwable th2) {
                    ABk.Qhi("Scene", "rewarded_video", "executeRewardVideoCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    public final void Qhi(boolean z10, int i10, String str, int i11, String str2) {
        if (this.Qhi.ABk()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.cJ.ac()) {
            Qhi("onRewardVerify", z10, i10, str, i11, str2);
        } else {
            this.Qhi.Qhi(this, z10, i10, str, i11, str2);
        }
        this.Qhi.iMK();
    }

    public void HzH() {
    }

    public void iMK() {
    }

    public void pA() {
    }

    public void CJ(Activity activity) {
    }

    public void fl(Activity activity) {
    }
}
