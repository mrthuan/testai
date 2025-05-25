package com.bytedance.sdk.openadsdk.multipro.aidl.cJ;

import com.bytedance.sdk.openadsdk.IRewardAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.lG;

/* compiled from: RewardVideoListenerImpl.java */
/* loaded from: classes.dex */
public class fl extends IRewardAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.apiImpl.CJ.ac Qhi;

    public fl(com.bytedance.sdk.openadsdk.apiImpl.CJ.ac acVar) {
        this.Qhi = acVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdClose() {
        if (this.Qhi == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.cJ.fl.3
            @Override // java.lang.Runnable
            public void run() {
                if (fl.this.Qhi != null) {
                    fl.this.Qhi.cJ();
                }
                fl.this.Qhi();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdShow() {
        if (this.Qhi == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.cJ.fl.1
            @Override // java.lang.Runnable
            public void run() {
                if (fl.this.Qhi != null) {
                    fl.this.Qhi.Qhi();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onAdVideoBarClick() {
        if (this.Qhi == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.cJ.fl.2
            @Override // java.lang.Runnable
            public void run() {
                if (fl.this.Qhi != null) {
                    fl.this.Qhi.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onRewardVerify(final boolean z10, final int i10, final String str, final int i11, final String str2) {
        if (this.Qhi == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.cJ.fl.4
            @Override // java.lang.Runnable
            public void run() {
                if (fl.this.Qhi != null) {
                    fl.this.Qhi.Qhi(z10, i10, str, i11, str2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi() {
        this.Qhi = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IRewardAdInteractionListener
    public void onDestroy() {
    }
}
