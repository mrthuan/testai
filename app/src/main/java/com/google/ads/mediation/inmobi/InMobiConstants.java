package com.google.ads.mediation.inmobi;

import com.google.android.gms.ads.AdError;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class InMobiConstants {
    public static final int ERROR_AD_DISPLAY_FAILED = 106;
    public static final int ERROR_AD_NOT_READY = 105;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.inmobi";
    public static final int ERROR_INMOBI_FAILED_INITIALIZATION = 101;
    public static final int ERROR_INMOBI_NOT_INITIALIZED = 104;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 100;
    public static final int ERROR_MALFORMED_IMAGE_URL = 108;
    public static final int ERROR_MISSING_NATIVE_ASSETS = 107;
    public static final int ERROR_NATIVE_ASSET_DOWNLOAD_FAILED = 109;
    public static final int ERROR_NON_UNIFIED_NATIVE_REQUEST = 103;
    public static final String INMOBI_SDK_ERROR_DOMAIN = "com.inmobi.sdk";
    public static final float WATERMARK_ALPHA = 0.3f;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AdapterError {
    }

    private InMobiConstants() {
    }

    public static AdError createAdapterError(int i10, String str) {
        return new AdError(i10, str, "com.google.ads.mediation.inmobi", null);
    }

    public static AdError createSdkError(int i10, String str) {
        return new AdError(i10, str, INMOBI_SDK_ERROR_DOMAIN, null);
    }
}
