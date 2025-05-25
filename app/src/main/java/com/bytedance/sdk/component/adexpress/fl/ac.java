package com.bytedance.sdk.component.adexpress.fl;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* compiled from: TTAndroidObjectProxy.java */
/* loaded from: classes.dex */
public class ac {
    private WeakReference<cJ> Qhi;

    public ac(cJ cJVar) {
        this.Qhi = new WeakReference<>(cJVar);
    }

    public void Qhi(cJ cJVar) {
        this.Qhi = new WeakReference<>(cJVar);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<cJ> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            this.Qhi.get();
        }
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<cJ> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            return this.Qhi.get().adInfo();
        }
        return "";
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<cJ> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            return this.Qhi.get().appInfo();
        }
        return "";
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<cJ> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            this.Qhi.get().changeVideoState(str);
        }
    }

    @JavascriptInterface
    public void chooseAdResult(String str) {
        WeakReference<cJ> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            this.Qhi.get().chooseAdResult(str);
        }
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<cJ> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            this.Qhi.get().clickEvent(str);
        }
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<cJ> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            this.Qhi.get().dynamicTrack(str);
        }
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<cJ> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            return this.Qhi.get().getCurrentVideoState();
        }
        return "";
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<cJ> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            return this.Qhi.get().getTemplateInfo();
        }
        return "";
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<cJ> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            this.Qhi.get().initRenderFinish();
        }
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<cJ> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            this.Qhi.get().muteVideo(str);
        }
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<cJ> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            this.Qhi.get().renderDidFinish(str);
        }
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<cJ> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            this.Qhi.get().Qhi(str);
        }
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<cJ> weakReference = this.Qhi;
        if (weakReference != null && weakReference.get() != null) {
            this.Qhi.get().skipVideo();
        }
    }
}
