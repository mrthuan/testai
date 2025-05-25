package com.inmobi.commons.core.configs;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.facebook.ads.AdError;
import com.inmobi.media.AbstractC1579c2;
import com.inmobi.media.Cb;
import com.inmobi.media.J3;
import com.inmobi.media.Y;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.q;
import kotlin.jvm.internal.g;
import kotlin.text.k;
import lib.zj.office.fc.openxml4j.opc.ContentTypes;
import org.json.JSONObject;

@Keep
/* loaded from: classes2.dex */
public final class AdConfig extends Config {
    private static final String ALLOWED_CONTENT_TYPE = "allowedContentType";
    public static final long DEFAULT_AD_LOAD_RETRY_INTERVAL = 1000;
    public static final boolean DEFAULT_AD_QUALITY_KILL_SWITCH = true;
    public static final int DEFAULT_AD_QUALITY_MAX_IMAGE_SIZE = 153600;
    public static final int DEFAULT_AD_QUALITY_MAX_RETRIES = 3;
    public static final int DEFAULT_AD_QUALITY_RESIZE_PERCENTAGE = 100;
    public static final int DEFAULT_AD_QUALITY_RETRY_INTERVAL = 5000;
    public static final boolean DEFAULT_AD_REPORT_KILL_SWITCH = true;
    public static final int DEFAULT_AD_REPORT_LIST_SIZE = 10;
    public static final String DEFAULT_AD_SERVER_URL = "https://ads.inmobi.com/sdk";
    public static final boolean DEFAULT_CCT_ENABLED = false;
    public static final int DEFAULT_CONTEXTUAL_DATA_EXPIRY_TIME = 86400;
    public static final int DEFAULT_CONTEXTUAL_DATA_MAX_RECORDS = 1;
    public static final int DEFAULT_MAX_POOL_SIZE = 10;
    public static final int DEFAULT_MINIMUM_AUDIO_REFRESH_INTERVAL = 20;
    public static final int DEFAULT_MINIMUM_REFRESH_INTERVAL = 20;
    public static final int DEFAULT_MIN_VOLUME_AUDIO_REQUEST = 30;
    public static final short DEFAULT_NETWORK_LOAD_LIMIT = 50;
    public static final int DEFAULT_REFRESH_INTERVAL = 60;
    public static final int DEFAULT_TOUCH_RESET_TIME = 4;
    public static final boolean DEFAULT_WATERMARK_KILL_SWITCH = true;
    private static final String GESTURE_LIST = "gestures";
    public static final int MIN_IMPRESSION_POLL_INTERVAL_MILLIS = 50;
    public static final int MIN_VISIBILITY_THROTTLE_INTERVAL_MILLIS = 50;
    public static final byte NETWORK_LOAD_LIMIT_DISABLED = -1;
    private static final String SKIP_FIELDS = "skipFields";
    private AdQualityConfig adQuality;
    private AdReportConfig adReport;
    private Y adReqDeprecateChecker;
    private boolean applyGzipReq;
    private AssetCacheConfig assetCache;
    private AudioConfig audio;
    private Map<String, CacheConfig> cache;
    private boolean cctEnabled;
    private ContextualDataConfig contextualData;
    private int defaultRefreshInterval;
    private String deprecate;
    private ImaiConfig imai;
    private int maxPoolSize;
    private int minimumRefreshInterval;
    private MraidConfig mraid;
    private RenderingConfig rendering;
    private boolean skipNetCheckHB;
    private Cb timeouts;
    private String url;
    private VastVideoConfig vastVideo;
    private ViewabilityConfig viewability;
    private boolean watermarkEnabled;
    private WebAssetCacheConfig webAssetCache;
    public static final b Companion = new b();
    private static final List<String> DEFAULT_CONTEXTUAL_DATA_SKIP_FIELDS = EmptyList.INSTANCE;

    @Keep
    /* loaded from: classes2.dex */
    public static final class AdQualityConfig {
        private boolean enabled = true;
        private int maxRetries = 3;
        private int retryInterval = 5000;
        private int maxImageSize = AdConfig.DEFAULT_AD_QUALITY_MAX_IMAGE_SIZE;
        private final int resizedPercentage = 100;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxImageSize() {
            return this.maxImageSize;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getResizedPercentage() {
            return this.resizedPercentage;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final boolean isValid() {
            if (this.maxRetries >= 0 && this.retryInterval >= 0 && this.maxImageSize >= 1 && this.resizedPercentage <= 100) {
                return true;
            }
            return false;
        }

        public final void setEnableAdQuality(boolean z10) {
            this.enabled = z10;
        }

        public final void setMaxImageSize(int i10) {
            this.maxImageSize = i10;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class AdReportConfig {
        private boolean enabled = true;
        private int cridls = 10;

        public final int getCridls() {
            return this.cridls;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final void setCridls(int i10) {
            this.cridls = i10;
        }

        public final void setEnabled(boolean z10) {
            this.enabled = z10;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class AssetCacheConfig {
        private int maxRetries = 3;
        private int retryInterval = 1;
        private long maxCacheSize = 104857600;
        private long timeToLive = CrashConfig.DEFAULT_EVENT_TTL_SEC;

        public final long getMaxCacheSize() {
            return this.maxCacheSize;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final long getTimeToLive() {
            return this.timeToLive;
        }

        public final boolean isValid() {
            if (getRetryInterval() >= 0 && getTimeToLive() >= 0 && getMaxCacheSize() >= 0 && getMaxRetries() >= 0) {
                return true;
            }
            return false;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class AudioConfig {
        private boolean isAudioEnabled = true;
        private int minDeviceVolume = 30;
        private int minRefreshInterval = 20;

        public final int getMinDeviceVolume() {
            return this.minDeviceVolume;
        }

        public final int getMinRefreshInterval() {
            return this.minRefreshInterval;
        }

        public final boolean isAudioEnabled() {
            return this.isAudioEnabled;
        }

        public final boolean isValid() {
            if (this.minDeviceVolume > 0 && this.minRefreshInterval > 0) {
                return true;
            }
            return false;
        }

        public final void setAudioEnabled(boolean z10) {
            this.isAudioEnabled = z10;
        }

        public final void setMinDeviceVolume(int i10) {
            this.minDeviceVolume = i10;
        }

        public final void setMinRefreshInterval(int i10) {
            this.minRefreshInterval = i10;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class AudioViewabilityConfig {
        private byte impressionType = 1;
        private int impressionMinPercentageViewed = 90;
        private int impressionMinTimeViewed = AdError.SERVER_ERROR_CODE;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionMinPercentageViewed(int i10) {
            this.impressionMinPercentageViewed = i10;
        }

        public final void setImpressionMinTimeViewed(int i10) {
            this.impressionMinTimeViewed = i10;
        }

        public final void setImpressionType(byte b10) {
            this.impressionType = b10;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class BannerImpressionTypeConfig {
        private byte impressionType;

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionType(byte b10) {
            this.impressionType = b10;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class BitRateConfig {
        private boolean bitrate_mandatory;
        private int headerTimeout = AdError.SERVER_ERROR_CODE;

        public final int getHeaderTimeout() {
            return this.headerTimeout;
        }

        public final boolean isBitRateMandatory() {
            return this.bitrate_mandatory;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class CacheConfig {
        private long timeToLive = 3300;

        public final long getTimeToLive() {
            return this.timeToLive;
        }

        public final boolean isValid() {
            if (this.timeToLive >= 0) {
                return true;
            }
            return false;
        }

        public final void setTimeToLive(long j10) {
            this.timeToLive = j10;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class ContextualDataConfig {
        private int expiryTime;
        private int maxAdRecords = 1;
        private List<String> skipFields;

        public ContextualDataConfig() {
            AdConfig.Companion.getClass();
            this.skipFields = AdConfig.DEFAULT_CONTEXTUAL_DATA_SKIP_FIELDS;
            this.expiryTime = AdConfig.DEFAULT_CONTEXTUAL_DATA_EXPIRY_TIME;
        }

        public final int getExpiryTime() {
            return this.expiryTime;
        }

        public final int getMaxAdRecords() {
            return this.maxAdRecords;
        }

        public final List<String> getSkipFields() {
            return this.skipFields;
        }

        public final boolean isValid() {
            if (this.maxAdRecords >= 0 && this.expiryTime >= 0) {
                return true;
            }
            return false;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class ImaiConfig {
        private int maxRetries = 3;
        private int pingInterval = 60;
        private int pingTimeout = 120;
        private int maxDbEvents = OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM;
        private int maxEventBatch = 10;
        private long pingCacheExpiry = 10800;

        public final int getMaxDbEvents() {
            return this.maxDbEvents;
        }

        public final int getMaxEventBatch() {
            return this.maxEventBatch;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final long getPingCacheExpiry() {
            return this.pingCacheExpiry;
        }

        public final int getPingInterval() {
            return this.pingInterval;
        }

        public final int getPingTimeout() {
            return this.pingTimeout;
        }

        public final boolean isValid() {
            if (getMaxDbEvents() >= 0 && getMaxEventBatch() >= 0 && getMaxRetries() >= 0 && getPingInterval() >= 0 && getPingTimeout() > 0 && getPingCacheExpiry() > 0) {
                return true;
            }
            return false;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class InterstitialImpressionTypeConfig {
        private byte impressionType = 1;

        public final byte getImpressionType() {
            return this.impressionType;
        }

        public final void setImpressionType(byte b10) {
            this.impressionType = b10;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class MraidConfig {
        private long expiry = 432000;
        private int maxRetries = 3;
        private int retryInterval = 60;
        private String url = "https://supply.inmobicdn.net/sdk/sdk/1075/android/mraid.js";

        public final long getExpiry() {
            return this.expiry;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final String getUrl() {
            return this.url;
        }

        public final boolean isValid() {
            if (getExpiry() >= 0 && getRetryInterval() >= 0 && getMaxRetries() >= 0 && !J3.a(this.url)) {
                return true;
            }
            return false;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class OmidConfig {
        private long expiry = 432000;
        private int maxRetries = 3;
        private int retryInterval = 60;
        private String partnerKey = "Inmobi";
        private String url = "https://supply.inmobicdn.net/javascript/1.3.37/omsdk-service.js";
        private boolean omidEnabled = true;
        private long webViewRetainTime = 1000;

        public final long getExpiry() {
            return this.expiry;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final boolean getOmidEnabled() {
            return this.omidEnabled;
        }

        public final String getPartnerKey() {
            return this.partnerKey;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final String getUrl() {
            return this.url;
        }

        public final long getWebViewRetainTime() {
            return this.webViewRetainTime;
        }

        public final boolean isOmidEnabled() {
            return this.omidEnabled;
        }

        public final boolean isValid() {
            String url;
            String obj;
            if (getMaxRetries() >= 0 && getRetryInterval() >= 0 && (url = getUrl()) != null && (obj = k.n0(url).toString()) != null && AbstractC1579c2.a(obj) && !TextUtils.isEmpty(getPartnerKey())) {
                return true;
            }
            return false;
        }

        public final void setOmidEnabled(boolean z10) {
            this.omidEnabled = z10;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class RenderingConfig {
        private boolean enableDomStorage;
        private boolean enableImmersive;
        private boolean enablePubMuteControl;
        private boolean shouldRenderPopup;
        private String webviewBackground = "#00000000";
        private boolean autoRedirectionEnforcement = true;
        private long userTouchResetTime = 4;
        private int bannerNetworkLoadsLimit = 50;
        private int audioNetworkLoadsLimit = 50;
        private int otherNetworkLoadsLimit = -1;
        private List<Integer> gestures = ge.a.J(0, 1, 2, 3, 4, 5);

        public final int getAudioNetworkLoadsLimit() {
            return this.audioNetworkLoadsLimit;
        }

        public final boolean getAutoRedirectionEnforcement() {
            return this.autoRedirectionEnforcement;
        }

        public final int getBannerNetworkLoadsLimit() {
            return this.bannerNetworkLoadsLimit;
        }

        public final boolean getEnableDomStorage() {
            return this.enableDomStorage;
        }

        public final boolean getEnableImmersive() {
            return this.enableImmersive;
        }

        public final boolean getEnablePubMuteControl() {
            return this.enablePubMuteControl;
        }

        public final int getOtherNetworkLoadsLimit() {
            return this.otherNetworkLoadsLimit;
        }

        public final List<Integer> getSupportedGestures() {
            return this.gestures;
        }

        public final long getUserTouchResetTime() {
            return this.userTouchResetTime * 1000;
        }

        public final int getWebviewBackgroundColor() {
            try {
                return parseColor();
            } catch (IllegalArgumentException unused) {
                return Color.parseColor("#00000000");
            }
        }

        public final boolean isValid() {
            String obj;
            String str = this.webviewBackground;
            if (str != null && (((obj = k.n0(str).toString()) == null || obj.length() != 0) && getUserTouchResetTime() >= 0 && !getSupportedGestures().isEmpty())) {
                try {
                    parseColor();
                    return true;
                } catch (IllegalArgumentException unused) {
                }
            }
            return false;
        }

        public final int parseColor() {
            return Color.parseColor(this.webviewBackground);
        }

        public final boolean shouldRenderPopup() {
            return this.shouldRenderPopup;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class VastVideoConfig {
        private int maxWrapperLimit = 3;
        private long optimalVastVideoSize = 3145728;
        private long vastMaxAssetSize = 31457280;
        private BitRateConfig bitRate = new BitRateConfig();
        private List<String> allowedContentType = ge.a.J("video/mp4", "video/3gp", "video/3gpp", "video/webm", ContentTypes.IMAGE_JPEG, "image/jpg", ContentTypes.IMAGE_GIF, ContentTypes.IMAGE_PNG);

        public final List<String> getAllowedContentType() {
            return this.allowedContentType;
        }

        public final BitRateConfig getBitRate() {
            return this.bitRate;
        }

        public final int getMaxWrapperLimit() {
            return this.maxWrapperLimit;
        }

        public final long getOptimalVastVideoSize() {
            return this.optimalVastVideoSize;
        }

        public final long getVastMaxAssetSize() {
            return this.vastMaxAssetSize;
        }

        public final boolean isValid() {
            if (getOptimalVastVideoSize() <= 31457280 && getOptimalVastVideoSize() > 0 && getMaxWrapperLimit() >= 0 && getVastMaxAssetSize() > 0 && getVastMaxAssetSize() <= 31457280) {
                return true;
            }
            return false;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class VideoViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = AdError.SERVER_ERROR_CODE;
        private int videoMinPercentagePlay = 50;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getVideoMinPercentagePlay() {
            return this.videoMinPercentagePlay;
        }

        public final void setImpressionMinPercentageViewed(int i10) {
            this.impressionMinPercentageViewed = i10;
        }

        public final void setImpressionMinTimeViewed(int i10) {
            this.impressionMinTimeViewed = i10;
        }

        public final void setVideoMinPercentagePlay(int i10) {
            this.videoMinPercentagePlay = i10;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class ViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 1000;
        private int visibilityThrottleMillis = 100;
        private int impressionPollIntervalMillis = 250;
        private int displayMinPercentageAnimate = 67;
        private VideoViewabilityConfig video = new VideoViewabilityConfig();
        private AudioViewabilityConfig audio = new AudioViewabilityConfig();
        private WebViewabilityConfig web = new WebViewabilityConfig();
        private OmidConfig omidConfig = new OmidConfig();
        private BannerImpressionTypeConfig banner = new BannerImpressionTypeConfig();

        /* renamed from: int  reason: not valid java name */
        private InterstitialImpressionTypeConfig f0int = new InterstitialImpressionTypeConfig();

        public final int getAudioImpressionMinPercentageViewed() {
            return this.audio.getImpressionMinPercentageViewed();
        }

        public final int getAudioImpressionMinTimeViewed() {
            return this.audio.getImpressionMinTimeViewed();
        }

        public final byte getAudioImpressionType() {
            return this.audio.getImpressionType();
        }

        public final byte getBannerImpressionType() {
            return this.banner.getImpressionType();
        }

        public final int getDisplayMinPercentageAnimate() {
            return this.displayMinPercentageAnimate;
        }

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getImpressionPollIntervalMillis() {
            return this.impressionPollIntervalMillis;
        }

        public final byte getInterstitialImpressionType() {
            return this.f0int.getImpressionType();
        }

        public final OmidConfig getOmidConfig() {
            return this.omidConfig;
        }

        public final int getVideoImpressionMinPercentageViewed() {
            return this.video.getImpressionMinPercentageViewed();
        }

        public final int getVideoImpressionMinTimeViewed() {
            return this.video.getImpressionMinTimeViewed();
        }

        public final int getVideoMinPercentagePlay() {
            return this.video.getVideoMinPercentagePlay();
        }

        public final int getVisibilityThrottleMillis() {
            return this.visibilityThrottleMillis;
        }

        public final int getWebImpressionMinPercentageViewed() {
            return this.web.getImpressionMinPercentageViewed();
        }

        public final int getWebImpressionMinTimeViewed() {
            return this.web.getImpressionMinTimeViewed();
        }

        public final int getWebVisibilityThrottleMillis() {
            return this.web.getImpressionPollIntervalMillis();
        }

        public final boolean isValid() {
            if (getImpressionMinPercentageViewed() > 0 && getImpressionMinPercentageViewed() <= 100 && getImpressionMinTimeViewed() >= 0 && getDisplayMinPercentageAnimate() > 0 && getDisplayMinPercentageAnimate() <= 100 && getVideoImpressionMinPercentageViewed() > 0 && getVideoImpressionMinPercentageViewed() <= 100 && getWebImpressionMinPercentageViewed() > 0 && getWebImpressionMinPercentageViewed() <= 100 && getWebVisibilityThrottleMillis() > 0 && getWebImpressionMinTimeViewed() >= 0 && getVideoImpressionMinTimeViewed() >= 0 && getVideoMinPercentagePlay() > 0 && getVideoMinPercentagePlay() <= 100 && getVisibilityThrottleMillis() >= 50 && getVisibilityThrottleMillis() * 5 <= getImpressionMinTimeViewed() && getImpressionPollIntervalMillis() >= 50 && getImpressionPollIntervalMillis() * 4 <= getImpressionMinTimeViewed() && this.omidConfig.isValid()) {
                return true;
            }
            return false;
        }

        public final void setOmidConfig(OmidConfig omidConfig) {
            g.e(omidConfig, "<set-?>");
            this.omidConfig = omidConfig;
        }

        public final void setVideoImpressionMinTimeViewed(int i10) {
            this.video.setImpressionMinTimeViewed(i10);
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class WebAssetCacheConfig {
        public static final c Companion = new c();
        private static final int DEFAULT_CACHE_SIZE_MB = 15;
        private static final int DEFAULT_CACHE_SIZE_TO_DISK_SPACE_PERCENT = 10;
        private static final int DEFAULT_MAX_RETRIES = 1;
        private static final int DEFAULT_MIN_AVAILABLE_DISK_SPACE = 50;
        private static final int DEFAULT_TIMEOUT_MS = 5000;
        private final int cacheSize;
        private final int cacheSizeToDiskSpaceMaxPercent;
        private final int maxRetries;
        private final int minAvailableDiskSpace;
        private final int timeout;

        public WebAssetCacheConfig() {
            this(0, 0, 0, 0, 0, 31, null);
        }

        public static /* synthetic */ WebAssetCacheConfig copy$default(WebAssetCacheConfig webAssetCacheConfig, int i10, int i11, int i12, int i13, int i14, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                i10 = webAssetCacheConfig.cacheSize;
            }
            if ((i15 & 2) != 0) {
                i11 = webAssetCacheConfig.timeout;
            }
            int i16 = i11;
            if ((i15 & 4) != 0) {
                i12 = webAssetCacheConfig.maxRetries;
            }
            int i17 = i12;
            if ((i15 & 8) != 0) {
                i13 = webAssetCacheConfig.minAvailableDiskSpace;
            }
            int i18 = i13;
            if ((i15 & 16) != 0) {
                i14 = webAssetCacheConfig.cacheSizeToDiskSpaceMaxPercent;
            }
            return webAssetCacheConfig.copy(i10, i16, i17, i18, i14);
        }

        public final int component1() {
            return this.cacheSize;
        }

        public final int component2() {
            return this.timeout;
        }

        public final int component3() {
            return this.maxRetries;
        }

        public final int component4() {
            return this.minAvailableDiskSpace;
        }

        public final int component5() {
            return this.cacheSizeToDiskSpaceMaxPercent;
        }

        public final WebAssetCacheConfig copy(int i10, int i11, int i12, int i13, int i14) {
            return new WebAssetCacheConfig(i10, i11, i12, i13, i14);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WebAssetCacheConfig)) {
                return false;
            }
            WebAssetCacheConfig webAssetCacheConfig = (WebAssetCacheConfig) obj;
            if (this.cacheSize == webAssetCacheConfig.cacheSize && this.timeout == webAssetCacheConfig.timeout && this.maxRetries == webAssetCacheConfig.maxRetries && this.minAvailableDiskSpace == webAssetCacheConfig.minAvailableDiskSpace && this.cacheSizeToDiskSpaceMaxPercent == webAssetCacheConfig.cacheSizeToDiskSpaceMaxPercent) {
                return true;
            }
            return false;
        }

        public final int getCacheSize() {
            return this.cacheSize;
        }

        public final int getCacheSizeToDiskSpaceMaxPercent() {
            return this.cacheSizeToDiskSpaceMaxPercent;
        }

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getMinAvailableDiskSpace() {
            return this.minAvailableDiskSpace;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        public int hashCode() {
            int i10 = this.timeout;
            int i11 = this.maxRetries;
            int i12 = this.minAvailableDiskSpace;
            return this.cacheSizeToDiskSpaceMaxPercent + ((i12 + ((i11 + ((i10 + (this.cacheSize * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("WebAssetCacheConfig(cacheSize=");
            sb2.append(this.cacheSize);
            sb2.append(", timeout=");
            sb2.append(this.timeout);
            sb2.append(", maxRetries=");
            sb2.append(this.maxRetries);
            sb2.append(", minAvailableDiskSpace=");
            sb2.append(this.minAvailableDiskSpace);
            sb2.append(", cacheSizeToDiskSpaceMaxPercent=");
            return androidx.activity.f.n(sb2, this.cacheSizeToDiskSpaceMaxPercent, ')');
        }

        public WebAssetCacheConfig(int i10, int i11, int i12, int i13, int i14) {
            this.cacheSize = i10;
            this.timeout = i11;
            this.maxRetries = i12;
            this.minAvailableDiskSpace = i13;
            this.cacheSizeToDiskSpaceMaxPercent = i14;
        }

        public /* synthetic */ WebAssetCacheConfig(int i10, int i11, int i12, int i13, int i14, int i15, kotlin.jvm.internal.d dVar) {
            this((i15 & 1) != 0 ? 15 : i10, (i15 & 2) != 0 ? 5000 : i11, (i15 & 4) != 0 ? 1 : i12, (i15 & 8) != 0 ? 50 : i13, (i15 & 16) != 0 ? 10 : i14);
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class WebViewabilityConfig {
        private int impressionMinPercentageViewed = 50;
        private int impressionMinTimeViewed = 1000;
        private int impressionPollIntervalMillis = 1000;

        public final int getImpressionMinPercentageViewed() {
            return this.impressionMinPercentageViewed;
        }

        public final int getImpressionMinTimeViewed() {
            return this.impressionMinTimeViewed;
        }

        public final int getImpressionPollIntervalMillis() {
            return this.impressionPollIntervalMillis;
        }

        public final void setImpressionMinPercentageViewed(int i10) {
            this.impressionMinPercentageViewed = i10;
        }

        public final void setImpressionMinTimeViewed(int i10) {
            this.impressionMinTimeViewed = i10;
        }

        public final void setImpressionPollIntervalMillis(int i10) {
            this.impressionPollIntervalMillis = i10;
        }
    }

    public AdConfig(String str) {
        super(str);
        this.maxPoolSize = 10;
        this.url = DEFAULT_AD_SERVER_URL;
        this.minimumRefreshInterval = 20;
        this.defaultRefreshInterval = 60;
        this.watermarkEnabled = true;
        Cb.Companion.getClass();
        Cb cb2 = new Cb();
        cb2.a0();
        this.timeouts = cb2;
        this.imai = new ImaiConfig();
        this.rendering = new RenderingConfig();
        this.mraid = new MraidConfig();
        this.viewability = new ViewabilityConfig();
        this.vastVideo = new VastVideoConfig();
        this.assetCache = new AssetCacheConfig();
        this.contextualData = new ContextualDataConfig();
        this.adQuality = new AdQualityConfig();
        this.adReport = new AdReportConfig();
        this.audio = new AudioConfig();
        this.webAssetCache = new WebAssetCacheConfig(0, 0, 0, 0, 0, 31, null);
        this.cache = q.B0(new Pair("base", new CacheConfig()), new Pair("banner", new CacheConfig()), new Pair("audio", new CacheConfig()), new Pair("int", new CacheConfig()), new Pair("native", new CacheConfig()));
    }

    public final AdQualityConfig getAdQuality() {
        return this.adQuality;
    }

    public final AdReportConfig getAdReport() {
        return this.adReport;
    }

    public final Y getAdReqDeprecateChecker() {
        if (this.adReqDeprecateChecker == null) {
            String str = this.deprecate;
            Y y10 = null;
            if (str != null) {
                if (!AbstractC1579c2.a(str)) {
                    str = null;
                }
                if (str != null) {
                    y10 = new Y(str);
                }
            }
            this.adReqDeprecateChecker = y10;
        }
        return this.adReqDeprecateChecker;
    }

    public final boolean getApplyGzipReq() {
        return this.applyGzipReq;
    }

    public final AssetCacheConfig getAssetCacheConfig() {
        return this.assetCache;
    }

    public final AudioConfig getAudio() {
        return this.audio;
    }

    public final CacheConfig getCacheConfig(String adType) {
        g.e(adType, "adType");
        CacheConfig cacheConfig = this.cache.get(adType);
        if (cacheConfig == null) {
            CacheConfig cacheConfig2 = this.cache.get("base");
            if (cacheConfig2 == null) {
                return new CacheConfig();
            }
            return cacheConfig2;
        }
        return cacheConfig;
    }

    public final ContextualDataConfig getContextualData() {
        return this.contextualData;
    }

    public final int getDefaultRefreshInterval() {
        return this.defaultRefreshInterval;
    }

    public final ImaiConfig getImaiConfig() {
        return this.imai;
    }

    public final int getMaxPoolSize() {
        return this.maxPoolSize;
    }

    public final int getMinimumRefreshInterval() {
        return this.minimumRefreshInterval;
    }

    public final MraidConfig getMraidConfig() {
        return this.mraid;
    }

    public final RenderingConfig getRendering() {
        return this.rendering;
    }

    public final boolean getSkipNetCheckHB() {
        return this.skipNetCheckHB;
    }

    public final Cb getTimeouts() {
        return this.timeouts;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public String getType() {
        return "ads";
    }

    public final String getUrl() {
        return this.url;
    }

    public final VastVideoConfig getVastVideo() {
        return this.vastVideo;
    }

    public final ViewabilityConfig getViewability() {
        return this.viewability;
    }

    public final boolean getWatermarkEnabled() {
        return this.watermarkEnabled;
    }

    public final WebAssetCacheConfig getWebAssetCache() {
        return this.webAssetCache;
    }

    public final boolean isCCTEnabled() {
        return this.cctEnabled;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        int i10;
        int i11;
        if (this.maxPoolSize <= 0 || J3.a(this.url) || (i10 = this.minimumRefreshInterval) < 0 || (i11 = this.defaultRefreshInterval) < 0 || i10 > i11) {
            return false;
        }
        for (Map.Entry<String, CacheConfig> entry : this.cache.entrySet()) {
            if (!entry.getValue().isValid()) {
                return false;
            }
        }
        this.timeouts.a0();
        if (!this.contextualData.isValid() || !this.adQuality.isValid() || !this.imai.isValid() || !this.mraid.isValid() || !this.timeouts.Z() || !this.rendering.isValid() || !this.vastVideo.isValid() || !this.assetCache.isValid() || !this.viewability.isValid() || !this.audio.isValid()) {
            return false;
        }
        return true;
    }

    public final void setAdQuality(AdQualityConfig adQualityConfig) {
        g.e(adQualityConfig, "<set-?>");
        this.adQuality = adQualityConfig;
    }

    public final void setAdReport(AdReportConfig adReportConfig) {
        g.e(adReportConfig, "<set-?>");
        this.adReport = adReportConfig;
    }

    public final void setAdReqDeprecateChecker(Y y10) {
        this.adReqDeprecateChecker = y10;
    }

    public final void setApplyGzipReq(boolean z10) {
        this.applyGzipReq = z10;
    }

    public final void setAudio(AudioConfig audioConfig) {
        g.e(audioConfig, "<set-?>");
        this.audio = audioConfig;
    }

    public final void setContextualData(ContextualDataConfig contextualDataConfig) {
        g.e(contextualDataConfig, "<set-?>");
        this.contextualData = contextualDataConfig;
    }

    public final void setDefaultRefreshInterval(int i10) {
        this.defaultRefreshInterval = i10;
    }

    public final void setMinimumRefreshInterval(int i10) {
        this.minimumRefreshInterval = i10;
    }

    public final void setRendering(RenderingConfig renderingConfig) {
        g.e(renderingConfig, "<set-?>");
        this.rendering = renderingConfig;
    }

    public final void setSkipNetCheckHB(boolean z10) {
        this.skipNetCheckHB = z10;
    }

    public final void setTimeouts(Cb cb2) {
        g.e(cb2, "<set-?>");
        this.timeouts = cb2;
    }

    public final void setUrl(String str) {
        g.e(str, "<set-?>");
        this.url = str;
    }

    public final void setVastVideo(VastVideoConfig vastVideoConfig) {
        g.e(vastVideoConfig, "<set-?>");
        this.vastVideo = vastVideoConfig;
    }

    public final void setViewability(ViewabilityConfig viewabilityConfig) {
        g.e(viewabilityConfig, "<set-?>");
        this.viewability = viewabilityConfig;
    }

    public final void setWebAssetCache(WebAssetCacheConfig webAssetCacheConfig) {
        g.e(webAssetCacheConfig, "<set-?>");
        this.webAssetCache = webAssetCacheConfig;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject a10 = b.a().a(this);
        if (a10 == null) {
            return new JSONObject();
        }
        return a10;
    }
}
