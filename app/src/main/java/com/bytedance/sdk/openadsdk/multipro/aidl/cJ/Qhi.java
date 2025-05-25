package com.bytedance.sdk.openadsdk.multipro.aidl.cJ;

import com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.lG;

/* compiled from: AppOpenAdListenerImpl.java */
/* loaded from: classes.dex */
public class Qhi extends IAppOpenAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.apiImpl.ac.cJ Qhi;

    public Qhi(com.bytedance.sdk.openadsdk.apiImpl.ac.cJ cJVar) {
        this.Qhi = cJVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdClicked() {
        if (this.Qhi == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.cJ.Qhi.2
            @Override // java.lang.Runnable
            public void run() {
                if (Qhi.this.Qhi != null) {
                    Qhi.this.Qhi.onAdClicked();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdShow() {
        if (this.Qhi == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.cJ.Qhi.1
            @Override // java.lang.Runnable
            public void run() {
                if (Qhi.this.Qhi != null) {
                    Qhi.this.Qhi.Qhi();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdSkip() {
        if (this.Qhi == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.cJ.Qhi.3
            @Override // java.lang.Runnable
            public void run() {
                if (Qhi.this.Qhi != null) {
                    Qhi.this.Qhi.cJ();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onAdTimeOver() {
        if (this.Qhi == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.cJ.Qhi.4
            @Override // java.lang.Runnable
            public void run() {
                if (Qhi.this.Qhi != null) {
                    Qhi.this.Qhi.ac();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IAppOpenAdInteractionListener
    public void onDestroy() {
        Qhi();
    }

    private void Qhi() {
        this.Qhi = null;
    }
}
