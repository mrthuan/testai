package com.inmobi.commons.core.configs;

import androidx.annotation.Keep;
import com.inmobi.media.AbstractC1753oa;
import com.inmobi.media.C1630fb;
import com.inmobi.media.C1644gb;
import com.inmobi.media.C1722m5;
import com.inmobi.media.C1766pa;
import com.inmobi.media.C1862x3;
import com.inmobi.media.I8;
import com.inmobi.media.InterfaceC1595d4;
import com.inmobi.media.J3;
import com.inmobi.media.J8;
import com.inmobi.media.M5;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import org.json.JSONObject;

@Keep
/* loaded from: classes2.dex */
public final class TelemetryConfig extends Config {
    public static final C1644gb Companion = new C1644gb();
    public static final long DEFAULT_DEEPLINK_FALLBACK_INTERVAL = 1000;
    public static final boolean DEFAULT_DISABLE_GENERAL_EVENTS = false;
    public static final long DEFAULT_EVENT_TTL_SEC = 604800;
    public static final long DEFAULT_INGESTION_LATENCY_SEC = 86400;
    public static final boolean DEFAULT_IS_ENABLED = true;
    public static final boolean DEFAULT_LOG_ENABLED = false;
    public static final long DEFAULT_LOG_EXPIRY = 86400;
    private static final String DEFAULT_LOG_LEVEL = "ERROR";
    public static final int DEFAULT_LOG_MAX_RETRIES = 3;
    public static final long DEFAULT_LOG_RETRY_INTERVAL = 5000;
    public static final double DEFAULT_LOG_SAMPLING_FACTOR = 0.0d;
    public static final String DEFAULT_LOG_URL = "https://log-activity.templates.inmobi.com/api/v1/ingest";
    public static final int DEFAULT_MAX_BATCH_SIZE = 20;
    public static final int DEFAULT_MAX_ENTRIES = 20;
    public static final int DEFAULT_MAX_EVENTS_TO_PERSIST = 1000;
    public static final int DEFAULT_MAX_RETRIES = 1;
    public static final int DEFAULT_MAX_TEMPLATE_EVENTS = 50;
    public static final int DEFAULT_MIN_BATCH_SIZE = 5;
    public static final long DEFAULT_PROCESSING_INTERVAL_SEC = 30;
    public static final long DEFAULT_REDIRECTION_INTERVAL = 1000;
    public static final long DEFAULT_RETRY_INTERVAL_SEC = 60;
    public static final double DEFAULT_SAMPLING_FACTOR = 0.0d;
    public static final String DEFAULT_URL = "https://telemetry.sdk.inmobi.com/metrics";
    @InterfaceC1595d4
    private final String TAG;
    private AssetReportingConfig assetReporting;
    private Base base;
    private boolean disableAllGeneralEvents;
    private long eventTTL;
    private LoggingConfig loggingConfig;
    private LandingPageConfig lpConfig;
    private int maxEventsToPersist;
    private int maxRetryCount;
    private int maxTemplateEvents;
    private J8 networkType;
    private List<String> priorityEvents;
    private long processingInterval;
    private double samplingFactor;
    private boolean sendCrashEvents;
    private String telemetryUrl;
    private long txLatency;

    @Keep
    /* loaded from: classes2.dex */
    public static final class AdTypeLoggingConfig {

        /* renamed from: ab  reason: collision with root package name */
        private PlacementTypeLoggingConfig f14107ab = new PlacementTypeLoggingConfig();
        private PlacementTypeLoggingConfig nonAb = new PlacementTypeLoggingConfig();

        public final PlacementTypeLoggingConfig getAb() {
            return this.f14107ab;
        }

        public final PlacementTypeLoggingConfig getNonAb() {
            return this.nonAb;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class AssetReportingConfig {
        private boolean gif;
        private boolean image;
        private boolean video;

        public final boolean getGif() {
            return this.gif;
        }

        public final boolean getImage() {
            return this.image;
        }

        public final boolean getVideo() {
            return this.video;
        }

        public final boolean isGifEnabled() {
            return this.gif;
        }

        public final boolean isImageEnabled() {
            return this.image;
        }

        public final boolean isVideoEnabled() {
            return this.video;
        }

        public final void setGif(boolean z10) {
            this.gif = z10;
        }

        public final void setImage(boolean z10) {
            this.image = z10;
        }

        public final void setVideo(boolean z10) {
            this.video = z10;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class Base {
        private boolean enabled = true;

        public final boolean getEnabled() {
            return this.enabled;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class LandingPageConfig {
        private long ebRedirectionInterval = 1000;
        private long ebDeeplinkFallbackInterval = 1000;

        public final long getEbDeeplinkFallbackInterval() {
            return this.ebDeeplinkFallbackInterval;
        }

        public final long getEbRedirectionInterval() {
            return this.ebRedirectionInterval;
        }

        public final void setEbDeeplinkFallbackInterval(long j10) {
            this.ebDeeplinkFallbackInterval = j10;
        }

        public final void setEbRedirectionInterval(long j10) {
            this.ebRedirectionInterval = j10;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class LoggingConfig {
        private boolean enabled;
        private String loggingUrl = TelemetryConfig.DEFAULT_LOG_URL;
        private int maxNoOfEntries = 20;
        private long expiry = 86400;
        private int maxRetries = 3;
        private long retryInterval = TelemetryConfig.DEFAULT_LOG_RETRY_INTERVAL;
        private AdTypeLoggingConfig banner = new AdTypeLoggingConfig();
        private AdTypeLoggingConfig audio = new AdTypeLoggingConfig();
        private AdTypeLoggingConfig int_html = new AdTypeLoggingConfig();
        private AdTypeLoggingConfig int_native = new AdTypeLoggingConfig();

        /* renamed from: native  reason: not valid java name */
        private AdTypeLoggingConfig f1native = new AdTypeLoggingConfig();
        private PlacementTypeLoggingConfig getToken = new PlacementTypeLoggingConfig();

        public final AdTypeLoggingConfig getAudio() {
            return this.audio;
        }

        public final AdTypeLoggingConfig getBanner() {
            return this.banner;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getExpiry() {
            return this.expiry;
        }

        public final PlacementTypeLoggingConfig getGetToken() {
            return this.getToken;
        }

        public final AdTypeLoggingConfig getInt_html() {
            return this.int_html;
        }

        public final AdTypeLoggingConfig getInt_native() {
            return this.int_native;
        }

        public final String getLoggingUrl() {
            return this.loggingUrl;
        }

        public final int getMaxNoOfEntries() {
            return this.maxNoOfEntries;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final AdTypeLoggingConfig getNative() {
            return this.f1native;
        }

        public final long getRetryInterval() {
            return this.retryInterval;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class PlacementTypeLoggingConfig {
        private String logLevel;
        private double samplePercent;

        public PlacementTypeLoggingConfig() {
            TelemetryConfig.Companion.getClass();
            this.logLevel = TelemetryConfig.DEFAULT_LOG_LEVEL;
        }

        public final String getLogLevel() {
            return this.logLevel;
        }

        public final double getSamplePercent() {
            return this.samplePercent;
        }
    }

    public TelemetryConfig(String str) {
        super(str);
        this.telemetryUrl = DEFAULT_URL;
        this.TAG = "TelemetryConfig";
        this.processingInterval = 30L;
        this.maxRetryCount = 1;
        this.maxEventsToPersist = 1000;
        this.eventTTL = DEFAULT_EVENT_TTL_SEC;
        this.maxTemplateEvents = 50;
        this.txLatency = 86400L;
        Companion.getClass();
        this.priorityEvents = ge.a.J("ServerFill", "ServerNoFill", "ServerError", "AdLoadFailed", "AdLoadSuccessful", "BlockAutoRedirection", "AssetDownloaded", "CrashEventOccurred", "InvalidConfig", "ConfigFetched", "SdkInitialized", "AdGetSignalsFailed", "AdGetSignalsSucceeded", "AdShowFailed", "AdLoadCalled", "AdLoadDroppedAtSDK", "AdShowCalled", "AdShowSuccessful", "AdGetSignalsCalled", "UnifiedIdNetworkCallRequested", "UnifiedIdNetworkResponseFailure", "FetchApiInvoked", "FetchCallbackFailure", "AdImpressionSuccessful", "RenderSuccess", "MUTTSuccess", "ParseSuccess", "WebViewLoadCalled", "PageStarted", "WebViewLoadFinished", "FireAdReady", "FireAdFailed", "TemplateEventDropped", "NetworkLoadLimitExceeded", "clickStartCalled", "landingsStartSuccess", "landingsStartFailed", "landingsCompleteSuccess", "landingsCompleteFailed", "userclickClose", "userclickReload");
        this.base = new Base();
        this.networkType = new J8();
        this.loggingConfig = new LoggingConfig();
        this.lpConfig = new LandingPageConfig();
        setDefaultNetworkConfig();
        this.assetReporting = getDefaultAssetReportingConfig();
    }

    private final AssetReportingConfig getDefaultAssetReportingConfig() {
        AssetReportingConfig assetReportingConfig = new AssetReportingConfig();
        assetReportingConfig.setVideo(true);
        assetReportingConfig.setImage(false);
        assetReportingConfig.setGif(false);
        return assetReportingConfig;
    }

    private final void setDefaultNetworkConfig() {
        J8 j82 = this.networkType;
        I8 i82 = new I8();
        i82.a(60L);
        i82.c(5);
        i82.b(20);
        j82.getClass();
        j82.wifi = i82;
        J8 j83 = this.networkType;
        I8 i83 = new I8();
        i83.a(60L);
        i83.c(5);
        i83.b(20);
        j83.getClass();
        j83.others = i83;
    }

    public final AssetReportingConfig getAssetConfig() {
        return this.assetReporting;
    }

    public final boolean getEnabled() {
        return this.base.getEnabled();
    }

    public final C1862x3 getEventConfig() {
        return new C1862x3(this.maxRetryCount, this.eventTTL, this.processingInterval, this.txLatency, getWifiConfig().b(), getWifiConfig().a(), getMobileConfig().b(), getMobileConfig().a(), getWifiConfig().c(), getMobileConfig().c());
    }

    public final LoggingConfig getLoggingConfig() {
        return this.loggingConfig;
    }

    public final LandingPageConfig getLpConfig() {
        return this.lpConfig;
    }

    public final int getMaxEventsToPersist() {
        return this.maxEventsToPersist;
    }

    public final int getMaxRetryCount() {
        return this.maxRetryCount;
    }

    public final int getMaxTemplateEvents() {
        return this.maxTemplateEvents;
    }

    public final I8 getMobileConfig() {
        I8 i82 = this.networkType.others;
        if (i82 != null) {
            return i82;
        }
        g.i("others");
        throw null;
    }

    public final List<String> getPriorityEventsList() {
        return this.priorityEvents;
    }

    public final double getSamplingFactor() {
        return this.samplingFactor;
    }

    public final String getTelemetryUrl() {
        return this.telemetryUrl;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public String getType() {
        return "telemetry";
    }

    public final String getUrl() {
        return this.telemetryUrl;
    }

    public final I8 getWifiConfig() {
        I8 i82 = this.networkType.wifi;
        if (i82 != null) {
            return i82;
        }
        g.i("wifi");
        throw null;
    }

    public final boolean isGeneralEventsDisabled() {
        return this.disableAllGeneralEvents;
    }

    public final boolean isSameAs(TelemetryConfig config) {
        boolean z10;
        g.e(config, "config");
        if ((getAccountId$media_release() == null && config.getAccountId$media_release() == null) || (getAccountId$media_release() != null && j.G(getAccountId$media_release(), config.getAccountId$media_release(), false))) {
            z10 = true;
        } else {
            z10 = false;
        }
        List<String> priorityEventsList = getPriorityEventsList();
        for (String str : config.getPriorityEventsList()) {
            if (!priorityEventsList.contains(str)) {
                return false;
            }
        }
        if (z10 && g.a(config.telemetryUrl, this.telemetryUrl) && config.samplingFactor == this.samplingFactor && config.eventTTL == this.eventTTL && config.maxEventsToPersist == this.maxEventsToPersist && config.maxRetryCount == this.maxRetryCount && config.getAssetConfig().isImageEnabled() == getAssetConfig().isImageEnabled() && config.getAssetConfig().isGifEnabled() == getAssetConfig().isGifEnabled() && config.getAssetConfig().isVideoEnabled() == getAssetConfig().isVideoEnabled()) {
            return true;
        }
        return false;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        if (J3.a(this.telemetryUrl)) {
            return false;
        }
        long j10 = this.txLatency;
        if (j10 < this.processingInterval || j10 > this.eventTTL) {
            return false;
        }
        J8 j82 = this.networkType;
        int i10 = this.maxEventsToPersist;
        I8 i82 = j82.wifi;
        if (i82 != null) {
            if (i82.a(i10)) {
                I8 i83 = j82.others;
                if (i83 != null) {
                    if (!i83.a(i10) || this.processingInterval <= 0 || this.maxRetryCount < 0 || this.txLatency <= 0 || this.eventTTL <= 0 || this.maxEventsToPersist <= 0 || this.samplingFactor < 0.0d) {
                        return false;
                    }
                    return true;
                }
                g.i("others");
                throw null;
            }
            return false;
        }
        g.i("wifi");
        throw null;
    }

    public final void setTelemetryUrl(String str) {
        g.e(str, "<set-?>");
        this.telemetryUrl = str;
    }

    public final boolean shouldSendCrashEvents() {
        return this.sendCrashEvents;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject a10 = new C1722m5().a(new C1766pa("priorityEvents", TelemetryConfig.class), (AbstractC1753oa) new M5(new C1630fb(), String.class)).a(this);
        if (a10 == null) {
            String TAG = this.TAG;
            g.d(TAG, "TAG");
            return new JSONObject();
        }
        return a10;
    }
}
