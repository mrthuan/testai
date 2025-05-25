package com.inmobi.unification.sdk;

import androidx.annotation.Keep;
import com.inmobi.media.C1568b5;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Keep
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface InitializationStatus {
    public static final C1568b5 Companion = C1568b5.f14963a;
    public static final String INVALID_ACCOUNT_ID = "Account id cannot be empty. Please provide a valid account id.";
    public static final String INVALID_SITE_ID = "SiteId cannot be empty. Please provide a valid SiteId.";
    public static final String MISSING_REQUIRED_DEPENDENCIES = "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";
    public static final String SUCCESS = "Success";
    public static final String UNKNOWN_ERROR = "SDK could not be initialized; an unexpected error was encountered.";
}
