package com.bytedance.sdk.openadsdk.hm.Qhi;

import com.bytedance.sdk.component.Qhi.kYc;
import com.bytedance.sdk.openadsdk.core.NFd;
import org.json.JSONObject;

/* compiled from: OldBridgeSyncMethod.java */
/* loaded from: classes.dex */
public class Tgh extends com.bytedance.sdk.component.Qhi.Tgh<JSONObject, JSONObject> {
    private final String Qhi;
    private final NFd cJ;

    public Tgh(String str, NFd nFd) {
        this.cJ = nFd;
        this.Qhi = str;
    }

    public static void Qhi(kYc kyc, NFd nFd) {
        kyc.Qhi("appInfo", new Tgh("appInfo", nFd));
        kyc.Qhi("adInfo", new Tgh("adInfo", nFd));
        kyc.Qhi("sendLog", new Tgh("sendLog", nFd));
        kyc.Qhi("playable_style", new Tgh("playable_style", nFd));
        kyc.Qhi("getTemplateInfo", new Tgh("getTemplateInfo", nFd));
        kyc.Qhi("getTeMaiAds", new Tgh("getTeMaiAds", nFd));
        kyc.Qhi("isViewable", new Tgh("isViewable", nFd));
        kyc.Qhi("getScreenSize", new Tgh("getScreenSize", nFd));
        kyc.Qhi("getCloseButtonInfo", new Tgh("getCloseButtonInfo", nFd));
        kyc.Qhi("getVolume", new Tgh("getVolume", nFd));
        kyc.Qhi("removeLoading", new Tgh("removeLoading", nFd));
        kyc.Qhi("sendReward", new Tgh("sendReward", nFd));
        kyc.Qhi("subscribe_app_ad", new Tgh("subscribe_app_ad", nFd));
        kyc.Qhi("download_app_ad", new Tgh("download_app_ad", nFd));
        kyc.Qhi("cancel_download_app_ad", new Tgh("cancel_download_app_ad", nFd));
        kyc.Qhi("unsubscribe_app_ad", new Tgh("unsubscribe_app_ad", nFd));
        kyc.Qhi("landscape_click", new Tgh("landscape_click", nFd));
        kyc.Qhi("clickEvent", new Tgh("clickEvent", nFd));
        kyc.Qhi("renderDidFinish", new Tgh("renderDidFinish", nFd));
        kyc.Qhi("dynamicTrack", new Tgh("dynamicTrack", nFd));
        kyc.Qhi("skipVideo", new Tgh("skipVideo", nFd));
        kyc.Qhi("muteVideo", new Tgh("muteVideo", nFd));
        kyc.Qhi("changeVideoState", new Tgh("changeVideoState", nFd));
        kyc.Qhi("getCurrentVideoState", new Tgh("getCurrentVideoState", nFd));
        kyc.Qhi("send_temai_product_ids", new Tgh("send_temai_product_ids", nFd));
        kyc.Qhi("getMaterialMeta", new Tgh("getMaterialMeta", nFd));
        kyc.Qhi("endcard_load", new Tgh("endcard_load", nFd));
        kyc.Qhi("pauseWebView", new Tgh("pauseWebView", nFd));
        kyc.Qhi("pauseWebViewTimers", new Tgh("pauseWebViewTimers", nFd));
        kyc.Qhi("webview_time_track", new Tgh("webview_time_track", nFd));
        kyc.Qhi("openPrivacy", new Tgh("openPrivacy", nFd));
        kyc.Qhi("openAdLandPageLinks", new Tgh("openAdLandPageLinks", nFd));
        kyc.Qhi("getNativeSiteCustomData", new Tgh("getNativeSiteCustomData", nFd));
        kyc.Qhi("close", new Tgh("close", nFd));
    }

    @Override // com.bytedance.sdk.component.Qhi.Tgh
    public JSONObject Qhi(JSONObject jSONObject, com.bytedance.sdk.component.Qhi.ROR ror) {
        NFd.cJ cJVar = new NFd.cJ();
        cJVar.Qhi = "call";
        cJVar.f8935ac = this.Qhi;
        cJVar.CJ = jSONObject;
        return this.cJ.Qhi(cJVar, 3);
    }
}
