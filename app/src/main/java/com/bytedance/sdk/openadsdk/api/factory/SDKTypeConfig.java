package com.bytedance.sdk.openadsdk.api.factory;

/* loaded from: classes.dex */
public class SDKTypeConfig {
    private static ISDKTypeFactory Qhi;

    public static ISDKTypeFactory getSdkTypeFactory() {
        return Qhi;
    }

    public static void setSdkTypeFactory(ISDKTypeFactory iSDKTypeFactory) {
        Qhi = iSDKTypeFactory;
    }
}
