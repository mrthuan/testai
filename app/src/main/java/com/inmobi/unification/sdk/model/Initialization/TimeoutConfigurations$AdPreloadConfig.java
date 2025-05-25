package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import cg.p;
import com.inmobi.media.Cb;
import kotlin.jvm.internal.g;
import org.json.JSONObject;

@Keep
/* loaded from: classes2.dex */
public final class TimeoutConfigurations$AdPreloadConfig {
    private JSONObject loadRetryInterval;
    private JSONObject loadTimeout;
    private JSONObject maxLoadRetries;
    private JSONObject muttTimeout;
    private JSONObject preloadTimeout;

    public TimeoutConfigurations$AdPreloadConfig() {
        this.preloadTimeout = new JSONObject();
        this.muttTimeout = new JSONObject();
        this.loadTimeout = new JSONObject();
        this.loadRetryInterval = new JSONObject();
        this.maxLoadRetries = new JSONObject();
    }

    public final JSONObject getLoadTimeout() {
        return this.loadTimeout;
    }

    public final JSONObject getMaxRetries() {
        return this.maxLoadRetries;
    }

    public final JSONObject getMuttTimeout() {
        return this.muttTimeout;
    }

    public final JSONObject getPreloadTimeout() {
        return this.preloadTimeout;
    }

    public final JSONObject getRetryInterval() {
        return this.loadRetryInterval;
    }

    public final boolean isValid() {
        p pVar;
        p pVar2;
        p pVar3;
        Cb.Companion.getClass();
        pVar = Cb.validator;
        if (((Boolean) pVar.invoke(this.loadTimeout, 0)).booleanValue()) {
            pVar2 = Cb.validator;
            if (((Boolean) pVar2.invoke(this.loadRetryInterval, 1)).booleanValue()) {
                pVar3 = Cb.validator;
                if (!((Boolean) pVar3.invoke(this.maxLoadRetries, 1)).booleanValue()) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeoutConfigurations$AdPreloadConfig(JSONObject preloadTimeout, JSONObject muttTimeout, JSONObject loadTimeout, JSONObject retryInterval, JSONObject maxRetries) {
        this();
        g.e(preloadTimeout, "preloadTimeout");
        g.e(muttTimeout, "muttTimeout");
        g.e(loadTimeout, "loadTimeout");
        g.e(retryInterval, "retryInterval");
        g.e(maxRetries, "maxRetries");
        this.preloadTimeout = preloadTimeout;
        this.muttTimeout = muttTimeout;
        this.loadTimeout = loadTimeout;
        this.loadRetryInterval = retryInterval;
        this.maxLoadRetries = maxRetries;
    }
}
