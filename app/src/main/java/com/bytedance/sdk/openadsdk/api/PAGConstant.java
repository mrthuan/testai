package com.bytedance.sdk.openadsdk.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public interface PAGConstant {

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface PAGChildDirectedType {
        public static final int PAG_CHILD_DIRECTED_TYPE_CHILD = 1;
        public static final int PAG_CHILD_DIRECTED_TYPE_DEFAULT = -1;
        public static final int PAG_CHILD_DIRECTED_TYPE_NON_CHILD = 0;
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface PAGDoNotSellType {
        public static final int PAG_DO_NOT_SELL_TYPE_DEFAULT = -1;
        public static final int PAG_DO_NOT_SELL_TYPE_NOT_SELL = 1;
        public static final int PAG_DO_NOT_SELL_TYPE_SELL = 0;
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface PAGGDPRConsentType {
        public static final int PAG_GDPR_CONSENT_TYPE_CONSENT = 1;
        public static final int PAG_GDPR_CONSENT_TYPE_DEFAULT = -1;
        public static final int PAG_GDPR_CONSENT_TYPE_NO_CONSENT = 0;
    }
}
