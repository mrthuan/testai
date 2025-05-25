package com.bytedance.sdk.openadsdk.apiImpl;

import android.text.TextUtils;
import com.bytedance.sdk.component.Sf.hm;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.bytedance.sdk.openadsdk.core.iMK;
import com.bytedance.sdk.openadsdk.core.settings.ABk;
import com.bytedance.sdk.openadsdk.utils.lG;
import java.util.Map;
import lib.zj.office.fc.hpsf.Constants;

/* compiled from: AdLoadUtils.java */
/* loaded from: classes.dex */
public class Qhi {
    public static boolean Qhi(PAGLoadListener pAGLoadListener) {
        if (ABk.Qhi()) {
            return false;
        }
        if (pAGLoadListener != null) {
            pAGLoadListener.onError(1000, "Ad request is temporarily paused, Please contact your Pangle AM");
            return true;
        }
        return true;
    }

    public static void Qhi(final hm hmVar, final PAGLoadListener pAGLoadListener, AdSlot adSlot) {
        Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.openadsdk.apiImpl.Qhi.1
            @Override // java.lang.Runnable
            public void run() {
                if (!iMK.fl()) {
                    com.bytedance.sdk.component.utils.ABk.Qhi("AdLoadBaseManager", "please exec TTAdSdk.init before load ad");
                    PAGLoadListener pAGLoadListener2 = PAGLoadListener.this;
                    if (pAGLoadListener2 != null) {
                        pAGLoadListener2.onError(Constants.CP_MAC_ROMAN, "Please exec TTAdSdk.init before load ad");
                        return;
                    }
                    return;
                }
                lG.CJ(hmVar);
            }
        };
        if (iMK.fl()) {
            runnable.run();
        } else {
            iMK.cJ().post(runnable);
        }
    }

    public static void Qhi(AdSlot.Builder builder, PAGRequest pAGRequest) {
        Map<String, Object> extraInfo;
        if (!iMK.fl() || pAGRequest == null || builder == null || (extraInfo = pAGRequest.getExtraInfo()) == null) {
            return;
        }
        if (extraInfo.containsKey("ad_id") && extraInfo.get("ad_id") != null) {
            builder.setAdId(extraInfo.get("ad_id").toString());
        }
        if (extraInfo.containsKey("creative_id") && extraInfo.get("creative_id") != null) {
            builder.setCreativeId(extraInfo.get("creative_id").toString());
        }
        if (extraInfo.containsKey("ext") && extraInfo.get("ext") != null) {
            builder.setExt(extraInfo.get("ext").toString());
        }
        if (!extraInfo.containsKey("media_extra") || extraInfo.get("media_extra") == null) {
            return;
        }
        builder.setMediaExtra(extraInfo.get("media_extra").toString());
    }

    public static boolean Qhi(String str, PAGRequest pAGRequest, PAGLoadListener pAGLoadListener) {
        if (TextUtils.isEmpty(str) && pAGLoadListener != null) {
            pAGLoadListener.onError(1, PAGErrorCode.PAGAdErrorCodeSlotIdNULLMsg);
            return true;
        } else if (pAGRequest != null || pAGLoadListener == null) {
            return false;
        } else {
            pAGLoadListener.onError(2, PAGErrorCode.PAGAdErrorCodeRequestNULLMsg);
            return true;
        }
    }
}
