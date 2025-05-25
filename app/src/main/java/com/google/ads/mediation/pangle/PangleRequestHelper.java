package com.google.ads.mediation.pangle;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.PAGRequest;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class PangleRequestHelper {
    public static final String ADMOB_WATERMARK_KEY = "admob_watermark";

    private PangleRequestHelper() {
    }

    public static void setWatermarkString(PAGRequest pAGRequest, String str, MediationAdConfiguration mediationAdConfiguration) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = mediationAdConfiguration.f10584f;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        Map<String, Object> extraInfo = pAGRequest.getExtraInfo();
        if (extraInfo == null) {
            extraInfo = new HashMap<>();
        }
        extraInfo.put(ADMOB_WATERMARK_KEY, str2);
        pAGRequest.setExtraInfo(extraInfo);
    }
}
