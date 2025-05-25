package com.inmobi.commons.core.configs;

import androidx.annotation.Keep;
import com.inmobi.media.AbstractC1753oa;
import com.inmobi.media.C1722m5;
import com.inmobi.media.C1766pa;
import com.inmobi.media.InterfaceC1595d4;
import com.inmobi.media.J3;
import com.inmobi.media.L8;
import com.inmobi.media.M5;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import kotlin.text.k;
import org.json.JSONObject;

@Keep
/* loaded from: classes2.dex */
public final class RootConfig extends Config {
    public static final long DEFAULT_EXPIRY = 86400;
    public static final String DEFAULT_FALLBACK_URL = "https://config.inmobi.com/config-server/v1/config/secure.cfg";
    public static final int DEFAULT_MAX_RETRIES = 3;
    public static final int DEFAULT_RETRY_INTERVAL = 60;
    public static final String DEFAULT_URL = "";
    public static final int DEFAULT_WAIT_TIME = 3;
    @InterfaceC1595d4
    private final String TAG;
    private List<ComponentConfig> components;
    @L8
    private GDPR gdpr;
    private int maxRetries;
    private boolean monetizationDisabled;
    private int retryInterval;
    private int waitTime;
    public static final e Companion = new e();
    private static final Object sAcquisitionLock = new Object();

    @Keep
    /* loaded from: classes2.dex */
    public static final class ComponentConfig {
        private String type = "";
        private long expiry = Long.MAX_VALUE;
        private String url = "";
        private String fallbackUrl = RootConfig.DEFAULT_FALLBACK_URL;

        public final long getExpiry() {
            return this.expiry;
        }

        public final String getFallbackUrl() {
            return this.fallbackUrl;
        }

        public final String getType() {
            return this.type;
        }

        public final String getUrl() {
            return this.url;
        }

        public final boolean isValid() {
            if (k.n0(getType()).toString().length() == 0 || getExpiry() < 0 || getExpiry() > 864000 || J3.a(this.url)) {
                return false;
            }
            if (g.a("root", getType()) && J3.a(this.fallbackUrl)) {
                return false;
            }
            return true;
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public static final class GDPR {
        @L8
        private Boolean transmitRequest = Boolean.TRUE;

        public final Boolean getTransmitRequest() {
            return this.transmitRequest;
        }

        public final boolean isValid() {
            if (this.transmitRequest != null) {
                return true;
            }
            return false;
        }
    }

    public RootConfig(String str) {
        super(str);
        this.TAG = "RootConfig";
        this.maxRetries = 3;
        this.retryInterval = 60;
        this.waitTime = 3;
        this.gdpr = new GDPR();
        this.components = EmptyList.INSTANCE;
    }

    public final long getExpiryForType(String type) {
        g.e(type, "type");
        synchronized (sAcquisitionLock) {
            List<ComponentConfig> list = this.components;
            if (list != null) {
                for (ComponentConfig componentConfig : list) {
                    if (g.a(type, componentConfig.getType())) {
                        return componentConfig.getExpiry();
                    }
                }
            }
            return 86400L;
        }
    }

    public final String getFallbackUrlForRootType() {
        synchronized (sAcquisitionLock) {
            List<ComponentConfig> list = this.components;
            if (list != null) {
                for (ComponentConfig componentConfig : list) {
                    if (g.a("root", componentConfig.getType())) {
                        return componentConfig.getFallbackUrl();
                    }
                }
            }
            return DEFAULT_FALLBACK_URL;
        }
    }

    public final int getMaxRetries() {
        return this.maxRetries;
    }

    public final int getRetryInterval() {
        return this.retryInterval;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public String getType() {
        return "root";
    }

    public final String getUrlForType(String type) {
        g.e(type, "type");
        synchronized (sAcquisitionLock) {
            List<ComponentConfig> list = this.components;
            if (list != null) {
                for (ComponentConfig componentConfig : list) {
                    if (g.a(type, componentConfig.getType())) {
                        return componentConfig.getUrl();
                    }
                }
            }
            return "";
        }
    }

    public final int getWaitTime() {
        return this.waitTime;
    }

    public final boolean isMonetizationDisabled() {
        return this.monetizationDisabled;
    }

    public final boolean isSameAs(RootConfig config) {
        g.e(config, "config");
        if (((getAccountId$media_release() != null || config.getAccountId$media_release() != null) && (getAccountId$media_release() == null || !j.G(getAccountId$media_release(), config.getAccountId$media_release(), false))) || config.maxRetries != this.maxRetries || config.retryInterval != this.retryInterval || config.waitTime != this.waitTime || config.monetizationDisabled != this.monetizationDisabled) {
            return false;
        }
        return true;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public boolean isValid() {
        tf.d dVar;
        String TAG = this.TAG;
        g.d(TAG, "TAG");
        Objects.toString(this.gdpr);
        if (this.maxRetries < 0 || this.retryInterval < 0 || this.waitTime < 0) {
            return false;
        }
        synchronized (sAcquisitionLock) {
            List<ComponentConfig> list = this.components;
            if (list != null) {
                for (ComponentConfig componentConfig : list) {
                    if (!componentConfig.isValid()) {
                        return false;
                    }
                }
                dVar = tf.d.f30009a;
            } else {
                dVar = null;
            }
            if (dVar == null) {
                return false;
            }
            tf.d dVar2 = tf.d.f30009a;
            GDPR gdpr = this.gdpr;
            if (gdpr == null || !gdpr.isValid()) {
                return false;
            }
            return true;
        }
    }

    public final boolean shouldTransmitRequest() {
        Boolean transmitRequest;
        GDPR gdpr = this.gdpr;
        if (gdpr != null && (transmitRequest = gdpr.getTransmitRequest()) != null) {
            return transmitRequest.booleanValue();
        }
        return true;
    }

    @Override // com.inmobi.commons.core.configs.Config
    public JSONObject toJson() {
        Companion.getClass();
        JSONObject a10 = new C1722m5().a(new C1766pa("components", RootConfig.class), (AbstractC1753oa) new M5(new d(), ComponentConfig.class)).a(this);
        if (a10 == null) {
            String TAG = this.TAG;
            g.d(TAG, "TAG");
            return new JSONObject();
        }
        return a10;
    }
}
