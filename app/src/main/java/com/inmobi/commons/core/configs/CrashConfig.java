package com.inmobi.commons.core.configs;

import androidx.annotation.Keep;
import com.inmobi.media.C1722m5;
import com.inmobi.media.C1862x3;
import com.inmobi.media.G2;
import com.inmobi.media.I8;
import com.inmobi.media.InterfaceC1595d4;
import com.inmobi.media.J3;
import com.inmobi.media.J8;
import kotlin.jvm.internal.g;
import org.json.JSONObject;

@Keep
/* loaded from: classes2.dex */
public final class CrashConfig extends Config {
    public static final G2 Companion = new G2();
    public static final long DEFAULT_ANR_WATCHDOG_INTERVAL = 4500;
    public static final long DEFAULT_APP_EXIT_REASON_WAIT_INTERVAL = 1000;
    public static final double DEFAULT_APP_EXIT_SAMPLING_PERCENT = 0.0d;
    public static final boolean DEFAULT_CATCH_ENABLED = false;
    public static final double DEFAULT_CATCH_SAMPLING_PERCENT = 0.0d;
    public static final boolean DEFAULT_CRASH_ENABLED = true;
    public static final double DEFAULT_CRASH_SAMPLING_PERCENT = 1.0d;
    public static final long DEFAULT_EVENT_TTL_SEC = 259200;
    public static final long DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL = 30000;
    public static final long DEFAULT_INGESTION_LATENCY_SEC = 86400;
    public static final int DEFAULT_MAX_BATCH_SIZE = 2;
    public static final int DEFAULT_MAX_EVENTS_TO_PERSIST = 50;
    public static final int DEFAULT_MAX_NO_OF_LINES = 200;
    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final int DEFAULT_MIN_BATCH_SIZE = 1;
    public static final long DEFAULT_PROCESSING_INTERVAL_SEC = 60;
    public static final long DEFAULT_RETRY_INTERVAL_SEC = 10;
    public static final String DEFAULT_URL = "https://crash-metrics.sdk.inmobi.com/trace";
    public static final double DEFAULT_WATCHDOG_SAMPLING_PERCENT = 0.0d;
    @InterfaceC1595d4
    private final String TAG;
    private ANRConfig anr;
    private CatchConfig catchConfig;
    private boolean catchEnabled;
    private CrashIncidentConfig crashConfig;
    private boolean crashEnabled;
    private long eventTTL;
    private int maxEventsToPersist;
    private int maxRetryCount;
    private J8 networkType;
    private long processingInterval;
    private long txLatency;
    private String url;

    @Keep
    /* loaded from: classes2.dex */
    public static final class ANRConfig {
        private AppExitReasonConfig appExitReason = new AppExitReasonConfig();
        private WatchDogConfig watchdog = new WatchDogConfig();

        public final AppExitReasonConfig getAppExitReason() {
            return this.appExitReason;
        }

        public final WatchDogConfig getWatchdog() {
            return this.watchdog;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class AppExitReasonConfig {
        private boolean enabled;
        private long incidentWaitInterval = 1000;
        private long incompleteLogThresholdTime = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        private int maxNumberOfLines = 200;
        private boolean reportToLogs;
        private double samplingPercent;
        private boolean useForReporting;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getIncidentWaitInterval() {
            return this.incidentWaitInterval;
        }

        public final long getIncompleteLogThresholdTime() {
            return this.incompleteLogThresholdTime;
        }

        public final int getMaxNumberOfLines() {
            return this.maxNumberOfLines;
        }

        public final boolean getReportToLogs() {
            return this.reportToLogs;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }

        public final boolean getUseForReporting() {
            return this.useForReporting;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class CatchConfig {
        private boolean enabled;
        private double samplingPercent;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class CrashIncidentConfig {
        private boolean enabled = true;
        private double samplingPercent = 1.0d;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class WatchDogConfig {
        private boolean enabled;
        private long interval = CrashConfig.DEFAULT_ANR_WATCHDOG_INTERVAL;
        private double samplingPercent;
        private boolean useForReporting;

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final long getInterval() {
            return this.interval;
        }

        public final double getSamplingPercent() {
            return this.samplingPercent;
        }

        public final boolean getUseForReporting() {
            return this.useForReporting;
        }
    }

    public CrashConfig(String str) {
        super(str);
        this.TAG = "CrashConfig";
        this.url = DEFAULT_URL;
        this.processingInterval = 60L;
        this.maxRetryCount = 3;
        this.maxEventsToPersist = 50;
        this.eventTTL = DEFAULT_EVENT_TTL_SEC;
        this.txLatency = 86400L;
        this.crashEnabled = true;
        this.networkType = new J8();
        this.anr = new ANRConfig();
        this.crashConfig = new CrashIncidentConfig();
        this.catchConfig = new CatchConfig();
        setDefaultNetworkConfig();
    }

    private final void setDefaultNetworkConfig() {
        J8 j82 = this.networkType;
        I8 i82 = new I8();
        i82.a(10L);
        i82.c(1);
        i82.b(2);
        j82.getClass();
        j82.wifi = i82;
        J8 j83 = this.networkType;
        I8 i83 = new I8();
        i83.a(10L);
        i83.c(1);
        i83.b(2);
        j83.getClass();
        j83.others = i83;
    }

    public final ANRConfig getANRConfig() {
        return this.anr;
    }

    public final CatchConfig getCatchConfig() {
        return this.catchConfig;
    }

    public final CrashIncidentConfig getCrashConfig() {
        return this.crashConfig;
    }

    public final C1862x3 getEventConfig() {
        return new C1862x3(this.maxRetryCount, this.eventTTL, this.processingInterval, this.txLatency, getWifiConfig().b(), getWifiConfig().a(), getMobileConfig().b(), getMobileConfig().a(), getWifiConfig().c(), getMobileConfig().c());
    }

    public final long getEventTTL() {
        return this.eventTTL;
    }

    public final int getMaxEventsToPersist() {
        return this.maxEventsToPersist;
    }

    public final I8 getMobileConfig() {
        I8 i82 = this.networkType.others;
        if (i82 != null) {
            return i82;
        }
        g.i("others");
        throw null;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public String getType() {
        return "crashReporting";
    }

    public final String getUrl() {
        return this.url;
    }

    public final I8 getWifiConfig() {
        I8 i82 = this.networkType.wifi;
        if (i82 != null) {
            return i82;
        }
        g.i("wifi");
        throw null;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        if (J3.a(this.url)) {
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
                    if (!i83.a(i10) || this.processingInterval <= 0 || this.maxRetryCount < 0 || this.txLatency <= 0 || this.eventTTL <= 0 || this.maxEventsToPersist <= 0) {
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

    @Override // com.inmobi.commons.core.configs.Config
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject a10 = new C1722m5().a(this);
        if (a10 == null) {
            String TAG = this.TAG;
            g.d(TAG, "TAG");
            return new JSONObject();
        }
        return a10;
    }
}
