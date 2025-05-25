package com.bytedance.sdk.openadsdk.multipro.aidl.cJ;

import com.bytedance.sdk.openadsdk.IDislikeClosedListener;
import com.bytedance.sdk.openadsdk.core.bannerexpress.Qhi;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.utils.lG;

/* compiled from: DislikeClosedListenerImpl.java */
/* loaded from: classes.dex */
public class cJ extends IDislikeClosedListener.Stub {
    private final Qhi.InterfaceC0119Qhi Qhi;
    private final String cJ;

    public cJ(String str, Qhi.InterfaceC0119Qhi interfaceC0119Qhi) {
        this.cJ = str;
        this.Qhi = interfaceC0119Qhi;
    }

    @Override // com.bytedance.sdk.openadsdk.IDislikeClosedListener
    public void onItemClickClosed() {
        lG.Qhi(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.cJ.cJ.1
            @Override // java.lang.Runnable
            public void run() {
                if (cJ.this.Qhi != null) {
                    cJ.this.Qhi.Qhi();
                    TTDislikeListView.Qhi(6, cJ.this.cJ);
                }
            }
        });
    }
}
