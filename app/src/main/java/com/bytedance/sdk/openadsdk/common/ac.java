package com.bytedance.sdk.openadsdk.common;

import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.bytedance.sdk.openadsdk.api.PAGLoadListener;
import com.bytedance.sdk.openadsdk.api.factory.ISDKTypeFactory;
import com.bytedance.sdk.openadsdk.api.factory.SDKTypeConfig;

/* compiled from: CommonHelper.java */
/* loaded from: classes.dex */
public class ac {
    private static boolean Qhi = false;

    public static void Qhi(boolean z10) {
        Qhi = z10;
    }

    public static ISDKTypeFactory Qhi(PAGLoadListener pAGLoadListener) {
        if (Qhi) {
            if (pAGLoadListener != null) {
                pAGLoadListener.onError(-1, PAGErrorCode.LOAD_SDK_DISABLE_MSG);
            }
            return null;
        }
        ISDKTypeFactory sdkTypeFactory = SDKTypeConfig.getSdkTypeFactory();
        if (sdkTypeFactory == null) {
            if (pAGLoadListener != null) {
                pAGLoadListener.onError(5000, PAGErrorCode.LOAD_FACTORY_NULL_MSG);
            }
            return null;
        }
        return sdkTypeFactory;
    }

    public static boolean Qhi() {
        return Qhi;
    }
}
