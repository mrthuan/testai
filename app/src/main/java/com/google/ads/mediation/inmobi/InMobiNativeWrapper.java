package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.listeners.VideoEventListener;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class InMobiNativeWrapper {
    private final InMobiNative inMobiNative;

    public InMobiNativeWrapper(InMobiNative inMobiNative) {
        this.inMobiNative = inMobiNative;
    }

    public String getAdCtaText() {
        return this.inMobiNative.getAdCtaText();
    }

    public String getAdDescription() {
        return this.inMobiNative.getAdDescription();
    }

    public String getAdIconUrl() {
        return this.inMobiNative.getAdIconUrl();
    }

    public String getAdLandingPageUrl() {
        return this.inMobiNative.getAdLandingPageUrl();
    }

    public String getAdTitle() {
        return this.inMobiNative.getAdTitle();
    }

    public JSONObject getCustomAdContent() {
        return this.inMobiNative.getCustomAdContent();
    }

    public InMobiNative getInMobiNative() {
        return this.inMobiNative;
    }

    public View getPrimaryViewOfWidth(Context context, View view, ViewGroup viewGroup, Integer num) {
        return this.inMobiNative.getPrimaryViewOfWidth(context, view, viewGroup, num.intValue());
    }

    public Boolean isVideo() {
        return this.inMobiNative.isVideo();
    }

    public void load() {
        this.inMobiNative.load();
    }

    public void pause() {
        this.inMobiNative.pause();
    }

    public void reportAdClickAndOpenLandingPage() {
        this.inMobiNative.reportAdClickAndOpenLandingPage();
    }

    public void resume() {
        this.inMobiNative.resume();
    }

    public void setExtras(Map<String, String> map) {
        this.inMobiNative.setExtras(map);
    }

    public void setKeywords(String str) {
        this.inMobiNative.setKeywords(str);
    }

    public void setVideoEventListener(VideoEventListener videoEventListener) {
        this.inMobiNative.setVideoEventListener(videoEventListener);
    }

    public void load(byte[] bArr) {
        this.inMobiNative.load(bArr);
    }
}
