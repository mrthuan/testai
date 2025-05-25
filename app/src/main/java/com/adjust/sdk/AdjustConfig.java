package com.adjust.sdk;

import android.content.Context;
import com.adjust.sdk.AdjustInstance;

/* loaded from: classes.dex */
public class AdjustConfig {
    public static final String AD_REVENUE_ADMOB = "admob_sdk";
    public static final String AD_REVENUE_ADMOST = "admost_sdk";
    public static final String AD_REVENUE_ADX = "adx_sdk";
    public static final String AD_REVENUE_APPLOVIN_MAX = "applovin_max_sdk";
    public static final String AD_REVENUE_HELIUM_CHARTBOOST = "helium_chartboost_sdk";
    public static final String AD_REVENUE_IRONSOURCE = "ironsource_sdk";
    public static final String AD_REVENUE_MOPUB = "mopub";
    public static final String AD_REVENUE_SOURCE_PUBLISHER = "publisher_sdk";
    public static final String AD_REVENUE_TOPON = "topon_sdk";
    public static final String AD_REVENUE_TRADPLUS = "tradplus_sdk";
    public static final String AD_REVENUE_UNITY = "unity_sdk";
    public static final String DATA_RESIDENCY_EU = "data_residency_eu";
    public static final String DATA_RESIDENCY_TR = "data_residency_tr";
    public static final String DATA_RESIDENCY_US = "data_residency_us";
    public static final String ENVIRONMENT_PRODUCTION = "production";
    public static final String ENVIRONMENT_SANDBOX = "sandbox";
    public static final String URL_STRATEGY_CHINA = "url_strategy_china";
    public static final String URL_STRATEGY_CN = "url_strategy_cn";
    public static final String URL_STRATEGY_CN_ONLY = "url_strategy_cn_only";
    public static final String URL_STRATEGY_INDIA = "url_strategy_india";
    String appSecret;
    String appToken;
    String basePath;
    OnDeeplinkResolvedListener cachedDeeplinkResolutionCallback;
    Context context;
    boolean coppaCompliantEnabled;
    Class deepLinkComponent;
    String defaultTracker;
    Double delayStart;
    Boolean deviceKnown;
    String environment;
    boolean eventBufferingEnabled;
    String externalDeviceId;
    String fbAppId;
    boolean finalAttributionEnabled;
    String gdprPath;
    ILogger logger;
    Boolean needsCost;
    OnAttributionChangedListener onAttributionChangedListener;
    OnDeeplinkResponseListener onDeeplinkResponseListener;
    OnEventTrackingFailedListener onEventTrackingFailedListener;
    OnEventTrackingSucceededListener onEventTrackingSucceededListener;
    OnSessionTrackingFailedListener onSessionTrackingFailedListener;
    OnSessionTrackingSucceededListener onSessionTrackingSucceededListener;
    boolean playStoreKidsAppEnabled;
    AdjustInstance.PreLaunchActions preLaunchActions;
    String preinstallFilePath;
    boolean preinstallTrackingEnabled;
    String processName;
    String purchaseVerificationPath;
    String pushToken;
    boolean readDeviceInfoOnceEnabled;
    String sdkPrefix;
    String secretId;
    boolean sendInBackground;
    Boolean startEnabled;
    boolean startOffline;
    String subscriptionPath;
    String urlStrategy;
    String userAgent;

    public AdjustConfig(Context context, String str, String str2) {
        init(context, str, str2, false);
    }

    private boolean checkAppToken(String str) {
        if (str == null) {
            this.logger.error("Missing App Token", new Object[0]);
            return false;
        } else if (str.length() == 12) {
            return true;
        } else {
            this.logger.error("Malformed App Token '%s'", str);
            return false;
        }
    }

    private boolean checkContext(Context context) {
        if (context == null) {
            this.logger.error("Missing context", new Object[0]);
            return false;
        } else if (!Util.checkPermission(context, "android.permission.INTERNET")) {
            this.logger.error("Missing permission: INTERNET", new Object[0]);
            return false;
        } else {
            return true;
        }
    }

    private boolean checkEnvironment(String str) {
        if (str == null) {
            this.logger.error("Missing environment", new Object[0]);
            return false;
        } else if (str.equals(ENVIRONMENT_SANDBOX)) {
            this.logger.warnInProduction("SANDBOX: Adjust is running in Sandbox mode. Use this setting for testing. Don't forget to set the environment to `production` before publishing!", new Object[0]);
            return true;
        } else if (str.equals(ENVIRONMENT_PRODUCTION)) {
            this.logger.warnInProduction("PRODUCTION: Adjust is running in Production mode. Use this setting only for the build that you want to publish. Set the environment to `sandbox` if you want to test your app!", new Object[0]);
            return true;
        } else {
            this.logger.error("Unknown environment '%s'", str);
            return false;
        }
    }

    private void init(Context context, String str, String str2, boolean z10) {
        LogLevel logLevel;
        this.logger = AdjustFactory.getLogger();
        if (z10 && ENVIRONMENT_PRODUCTION.equals(str2)) {
            logLevel = LogLevel.SUPRESS;
        } else {
            logLevel = LogLevel.INFO;
        }
        setLogLevel(logLevel, str2);
        if (context != null) {
            context = context.getApplicationContext();
        }
        this.context = context;
        this.appToken = str;
        this.environment = str2;
        this.eventBufferingEnabled = false;
        this.sendInBackground = false;
        this.preinstallTrackingEnabled = false;
    }

    public String getAppSecret() {
        return this.appSecret;
    }

    public String getAppToken() {
        return this.appToken;
    }

    public String getBasePath() {
        return this.basePath;
    }

    public Context getContext() {
        return this.context;
    }

    public Class getDeepLinkComponent() {
        return this.deepLinkComponent;
    }

    public String getDefaultTracker() {
        return this.defaultTracker;
    }

    public Double getDelayStart() {
        return this.delayStart;
    }

    public Boolean getDeviceKnown() {
        return this.deviceKnown;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public String getExternalDeviceId() {
        return this.externalDeviceId;
    }

    public String getFbAppId() {
        return this.fbAppId;
    }

    public String getGdprPath() {
        return this.gdprPath;
    }

    public ILogger getLogger() {
        return this.logger;
    }

    public Boolean getNeedsCost() {
        return this.needsCost;
    }

    public OnAttributionChangedListener getOnAttributionChangedListener() {
        return this.onAttributionChangedListener;
    }

    public OnDeeplinkResponseListener getOnDeeplinkResponseListener() {
        return this.onDeeplinkResponseListener;
    }

    public OnEventTrackingFailedListener getOnEventTrackingFailedListener() {
        return this.onEventTrackingFailedListener;
    }

    public OnEventTrackingSucceededListener getOnEventTrackingSucceededListener() {
        return this.onEventTrackingSucceededListener;
    }

    public OnSessionTrackingFailedListener getOnSessionTrackingFailedListener() {
        return this.onSessionTrackingFailedListener;
    }

    public OnSessionTrackingSucceededListener getOnSessionTrackingSucceededListener() {
        return this.onSessionTrackingSucceededListener;
    }

    public AdjustInstance.PreLaunchActions getPreLaunchActions() {
        return this.preLaunchActions;
    }

    public String getPreinstallFilePath() {
        return this.preinstallFilePath;
    }

    public String getProcessName() {
        return this.processName;
    }

    public String getPurchaseVerificationPath() {
        return this.purchaseVerificationPath;
    }

    public String getPushToken() {
        return this.pushToken;
    }

    public String getSdkPrefix() {
        return this.sdkPrefix;
    }

    public String getSecretId() {
        return this.secretId;
    }

    public Boolean getStartEnabled() {
        return this.startEnabled;
    }

    public String getSubscriptionPath() {
        return this.subscriptionPath;
    }

    public String getUrlStrategy() {
        return this.urlStrategy;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public boolean isCoppaCompliantEnabled() {
        return this.coppaCompliantEnabled;
    }

    public boolean isEventBufferingEnabled() {
        return this.eventBufferingEnabled;
    }

    public boolean isFinalAttributionEnabled() {
        return this.finalAttributionEnabled;
    }

    public boolean isPlayStoreKidsAppEnabled() {
        return this.playStoreKidsAppEnabled;
    }

    public boolean isPreinstallTrackingEnabled() {
        return this.preinstallTrackingEnabled;
    }

    public boolean isReadDeviceInfoOnceEnabled() {
        return this.readDeviceInfoOnceEnabled;
    }

    public boolean isSendInBackground() {
        return this.sendInBackground;
    }

    public boolean isStartOffline() {
        return this.startOffline;
    }

    public boolean isValid() {
        if (!checkAppToken(this.appToken) || !checkEnvironment(this.environment) || !checkContext(this.context)) {
            return false;
        }
        return true;
    }

    public void setAppSecret(long j10, long j11, long j12, long j13, long j14) {
        this.secretId = Util.formatString("%d", Long.valueOf(j10));
        this.appSecret = Util.formatString("%d%d%d%d", Long.valueOf(j11), Long.valueOf(j12), Long.valueOf(j13), Long.valueOf(j14));
    }

    public void setCoppaCompliantEnabled(boolean z10) {
        this.coppaCompliantEnabled = z10;
    }

    public void setDeepLinkComponent(Class cls) {
        this.deepLinkComponent = cls;
    }

    public void setDefaultTracker(String str) {
        this.defaultTracker = str;
    }

    public void setDelayStart(double d10) {
        this.delayStart = Double.valueOf(d10);
    }

    public void setDeviceKnown(boolean z10) {
        this.deviceKnown = Boolean.valueOf(z10);
    }

    public void setEventBufferingEnabled(Boolean bool) {
        boolean booleanValue;
        if (bool == null) {
            booleanValue = false;
        } else {
            booleanValue = bool.booleanValue();
        }
        this.eventBufferingEnabled = booleanValue;
    }

    public void setExternalDeviceId(String str) {
        this.externalDeviceId = str;
    }

    public void setFbAppId(String str) {
        this.fbAppId = str;
    }

    public void setFinalAttributionEnabled(boolean z10) {
        this.finalAttributionEnabled = z10;
    }

    public void setLogLevel(LogLevel logLevel) {
        setLogLevel(logLevel, this.environment);
    }

    public void setNeedsCost(boolean z10) {
        this.needsCost = Boolean.valueOf(z10);
    }

    public void setOnAttributionChangedListener(OnAttributionChangedListener onAttributionChangedListener) {
        this.onAttributionChangedListener = onAttributionChangedListener;
    }

    public void setOnDeeplinkResponseListener(OnDeeplinkResponseListener onDeeplinkResponseListener) {
        this.onDeeplinkResponseListener = onDeeplinkResponseListener;
    }

    public void setOnEventTrackingFailedListener(OnEventTrackingFailedListener onEventTrackingFailedListener) {
        this.onEventTrackingFailedListener = onEventTrackingFailedListener;
    }

    public void setOnEventTrackingSucceededListener(OnEventTrackingSucceededListener onEventTrackingSucceededListener) {
        this.onEventTrackingSucceededListener = onEventTrackingSucceededListener;
    }

    public void setOnSessionTrackingFailedListener(OnSessionTrackingFailedListener onSessionTrackingFailedListener) {
        this.onSessionTrackingFailedListener = onSessionTrackingFailedListener;
    }

    public void setOnSessionTrackingSucceededListener(OnSessionTrackingSucceededListener onSessionTrackingSucceededListener) {
        this.onSessionTrackingSucceededListener = onSessionTrackingSucceededListener;
    }

    public void setPlayStoreKidsAppEnabled(boolean z10) {
        this.playStoreKidsAppEnabled = z10;
    }

    public void setPreinstallFilePath(String str) {
        this.preinstallFilePath = str;
    }

    public void setPreinstallTrackingEnabled(boolean z10) {
        this.preinstallTrackingEnabled = z10;
    }

    public void setProcessName(String str) {
        this.processName = str;
    }

    public void setReadDeviceInfoOnceEnabled(boolean z10) {
        this.readDeviceInfoOnceEnabled = z10;
    }

    @Deprecated
    public void setReadMobileEquipmentIdentity(boolean z10) {
        this.logger.warn("This method has been deprecated and shouldn't be used anymore", new Object[0]);
    }

    public void setSdkPrefix(String str) {
        this.sdkPrefix = str;
    }

    public void setSendInBackground(boolean z10) {
        this.sendInBackground = z10;
    }

    public void setUrlStrategy(String str) {
        if (str != null && !str.isEmpty()) {
            if (!str.equals(URL_STRATEGY_INDIA) && !str.equals(URL_STRATEGY_CHINA) && !str.equals(URL_STRATEGY_CN) && !str.equals(URL_STRATEGY_CN_ONLY) && !str.equals(DATA_RESIDENCY_EU) && !str.equals(DATA_RESIDENCY_TR) && !str.equals(DATA_RESIDENCY_US)) {
                this.logger.warn("Unrecognised url strategy %s", str);
            }
            this.urlStrategy = str;
            return;
        }
        this.logger.error("Invalid url strategy", new Object[0]);
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }

    public AdjustConfig(Context context, String str, String str2, boolean z10) {
        init(context, str, str2, z10);
    }

    private void setLogLevel(LogLevel logLevel, String str) {
        this.logger.setLogLevel(logLevel, ENVIRONMENT_PRODUCTION.equals(str));
    }
}
