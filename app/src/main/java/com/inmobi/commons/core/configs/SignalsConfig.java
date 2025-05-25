package com.inmobi.commons.core.configs;

import android.webkit.URLUtil;
import androidx.annotation.Keep;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.media.InterfaceC1595d4;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.g;
import org.json.JSONObject;

@Keep
/* loaded from: classes2.dex */
public final class SignalsConfig extends Config {
    public static final f Companion = new f();
    @InterfaceC1595d4
    private final String TAG;
    private JSONObject ext;
    private IceConfig ice;
    private String kA;
    private NovatiqConfig novatiqConfig;
    private PublisherConfig publisher;
    private SessionConfig session;
    private UnifiedIdServiceConfig unifiedIdServiceConfig;
    private int vAK;

    @Keep
    /* loaded from: classes2.dex */
    public static final class CellIceConfig {
        private boolean cce;
        private int cof;
        private boolean vce;

        public final boolean getCce() {
            return this.cce;
        }

        public final int getCof() {
            return this.cof;
        }

        public final boolean getVce() {
            return this.vce;
        }

        public final void setCce(boolean z10) {
            this.cce = z10;
        }

        public final void setCof(int i10) {
            this.cof = i10;
        }

        public final void setVce(boolean z10) {
            this.vce = z10;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class IceConfig {
        private boolean locationEnabled;
        private boolean sessionEnabled;
        private int sampleInterval = OS2WindowsMetricsTable.WEIGHT_CLASS_LIGHT;
        private int stopRequestTimeout = 3;

        /* renamed from: w  reason: collision with root package name */
        private WifiIceConfig f14105w = new WifiIceConfig();
        private CellIceConfig c = new CellIceConfig();

        public final int getCellOperatorFlag() {
            return this.c.getCof();
        }

        public final int getSampleInterval() {
            return this.sampleInterval;
        }

        public final int getStopRequestTimeout() {
            return this.stopRequestTimeout;
        }

        public final int getWifiFlag() {
            return this.f14105w.getWf();
        }

        public final boolean isConnectedCellTowerEnabled() {
            return this.c.getCce();
        }

        public final boolean isConnectedWifiEnabled() {
            return this.f14105w.getCwe();
        }

        public final boolean isLocationEnabled() {
            return this.locationEnabled;
        }

        public final boolean isSessionEnabled() {
            return this.sessionEnabled;
        }

        public final boolean isValid() {
            if (getSampleInterval() >= 0 && getStopRequestTimeout() >= 0 && getWifiFlag() >= 0 && getCellOperatorFlag() >= 0) {
                return true;
            }
            return false;
        }

        public final boolean isVisibleCellTowerEnabled() {
            return this.c.getVce();
        }

        public final boolean isVisibleWifiEnabled() {
            return this.f14105w.getVwe();
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class NovatiqConfig {
        private boolean isNovatiqEnabled = true;
        private List<String> carrierNames = EmptyList.INSTANCE;
        private String beaconUrl = "https://spadsync.com/sync";

        public final String getBeaconUrl() {
            return this.beaconUrl;
        }

        public final List<String> getCarrierNames() {
            return this.carrierNames;
        }

        public final boolean isNovatiqEnabled() {
            return this.isNovatiqEnabled;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class PublisherConfig {
        private final boolean enableAB;
        private final boolean enableMCO;
        private final Map<String, String> generalKeys = new LinkedHashMap();
        private final Map<String, String> adSpecificKeys = new LinkedHashMap();
        private final int payloadSize = TTAdConstant.STYLE_SIZE_RADIO_3_2;

        public final Map<String, String> getAdSpecificKeys() {
            return this.adSpecificKeys;
        }

        public final boolean getEnableAB() {
            return this.enableAB;
        }

        public final boolean getEnableMCO() {
            return this.enableMCO;
        }

        public final Map<String, String> getGeneralKeys() {
            return this.generalKeys;
        }

        public final int getPayloadSize() {
            return this.payloadSize;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class SessionConfig {
        private List<Integer> control = ge.a.I(0, 1, 2, 3, 4, 5, 6);

        public final List<Integer> getSigControlList() {
            return this.control;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class UnifiedIdServiceConfig {
        private boolean enabled;
        private int maxRetries;
        private int retryInterval;
        private String url = "https://unif-id.ssp.inmobi.com/fetch";
        private int timeout = 10;

        public final int getMaxRetries() {
            return this.maxRetries;
        }

        public final int getRetryInterval() {
            return this.retryInterval;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        public final String getUrl() {
            return this.url;
        }

        public final boolean isEnabled() {
            return this.enabled;
        }

        public final boolean isValid() {
            if (URLUtil.isValidUrl(this.url) && this.maxRetries >= 0 && this.timeout >= 0 && this.retryInterval >= 0) {
                return true;
            }
            return false;
        }

        public final void setMaxRetries(int i10) {
            this.maxRetries = i10;
        }

        public final void setRetryInterval(int i10) {
            this.retryInterval = i10;
        }

        public final void setTimeout(int i10) {
            this.timeout = i10;
        }

        public final void setUrl(String str) {
            g.e(str, "<set-?>");
            this.url = str;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class WifiIceConfig {
        private boolean cwe;
        private boolean vwe;

        /* renamed from: wf  reason: collision with root package name */
        private int f14106wf;

        public final boolean getCwe() {
            return this.cwe;
        }

        public final boolean getVwe() {
            return this.vwe;
        }

        public final int getWf() {
            return this.f14106wf;
        }

        public final void setCwe(boolean z10) {
            this.cwe = z10;
        }

        public final void setVwe(boolean z10) {
            this.vwe = z10;
        }

        public final void setWf(int i10) {
            this.f14106wf = i10;
        }
    }

    public SignalsConfig(String str) {
        super(str);
        this.TAG = "SignalsConfig";
        this.ice = new IceConfig();
        this.unifiedIdServiceConfig = new UnifiedIdServiceConfig();
        this.novatiqConfig = new NovatiqConfig();
        this.session = new SessionConfig();
        this.publisher = new PublisherConfig();
        this.kA = "wWFMAWbSEtvl5VxZbQGMK7";
        this.vAK = 1;
    }

    public final String getAK() {
        return this.kA;
    }

    public final int getAKV() {
        return this.vAK;
    }

    public final JSONObject getExt() {
        return this.ext;
    }

    public final IceConfig getIceConfig() {
        return this.ice;
    }

    public final NovatiqConfig getNovatiqConfig() {
        return this.novatiqConfig;
    }

    public final PublisherConfig getPublisherConfig() {
        return this.publisher;
    }

    public final SessionConfig getSessionConfig() {
        return this.session;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public String getType() {
        return "signals";
    }

    public final UnifiedIdServiceConfig getUnifiedIdServiceConfig() {
        return this.unifiedIdServiceConfig;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        if (this.ice.isValid() && this.unifiedIdServiceConfig.isValid()) {
            return true;
        }
        return false;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject a10 = f.a().a(this);
        if (a10 == null) {
            String TAG = this.TAG;
            g.d(TAG, "TAG");
            return new JSONObject();
        }
        return a10;
    }
}
