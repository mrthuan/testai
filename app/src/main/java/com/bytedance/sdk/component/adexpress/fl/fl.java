package com.bytedance.sdk.component.adexpress.fl;

import android.webkit.JavascriptInterface;
import com.bytedance.sdk.component.Qhi.pM;
import java.lang.ref.WeakReference;

/* compiled from: WebViewBridgeProxy.java */
/* loaded from: classes.dex */
public class fl {
    private WeakReference<pM> Qhi;

    public fl(pM pMVar) {
        this.Qhi = new WeakReference<>(pMVar);
    }

    public void Qhi(pM pMVar) {
        this.Qhi = new WeakReference<>(pMVar);
    }

    @JavascriptInterface
    public void invokeMethod(String str) {
        WeakReference<pM> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            this.Qhi.get().invokeMethod(str);
        }
    }
}
