package com.bytedance.sdk.openadsdk.multipro.aidl.cJ;

import com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener;
import com.bytedance.sdk.openadsdk.utils.lG;

/* compiled from: FullScreenVideoListenerImpl.java */
/* loaded from: classes.dex */
public class ac extends IFullScreenVideoAdInteractionListener.Stub {
    private com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ Qhi;

    public ac(com.bytedance.sdk.openadsdk.apiImpl.cJ.cJ cJVar) {
        this.Qhi = cJVar;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdClose() {
        if (this.Qhi == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.cJ.ac.3
            @Override // java.lang.Runnable
            public void run() {
                if (ac.this.Qhi != null) {
                    ac.this.Qhi.cJ();
                }
                ac.this.Qhi();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdShow() {
        if (this.Qhi == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.cJ.ac.1
            @Override // java.lang.Runnable
            public void run() {
                if (ac.this.Qhi != null) {
                    ac.this.Qhi.Qhi();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onAdVideoBarClick() {
        if (this.Qhi == null) {
            return;
        }
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.cJ.ac.2
            @Override // java.lang.Runnable
            public void run() {
                if (ac.this.Qhi != null) {
                    ac.this.Qhi.onAdClicked();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qhi() {
        this.Qhi = null;
    }

    @Override // com.bytedance.sdk.openadsdk.IFullScreenVideoAdInteractionListener
    public void onDestroy() {
    }
}
