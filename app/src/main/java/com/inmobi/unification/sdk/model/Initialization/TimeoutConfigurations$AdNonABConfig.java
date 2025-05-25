package com.inmobi.unification.sdk.model.Initialization;

import androidx.annotation.Keep;
import cg.p;
import com.inmobi.media.Cb;
import kotlin.jvm.internal.g;
import org.json.JSONObject;

@Keep
/* loaded from: classes2.dex */
public final class TimeoutConfigurations$AdNonABConfig {
    private JSONObject loadRetryInterval;
    private JSONObject loadTimeout;
    private JSONObject maxLoadRetries;
    private JSONObject muttTimeout;

    public TimeoutConfigurations$AdNonABConfig() {
        this.loadTimeout = new JSONObject();
        this.muttTimeout = new JSONObject();
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

    public final JSONObject getRetryInterval() {
        return this.loadRetryInterval;
    }

    public final boolean isValid() {
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        Cb.Companion.getClass();
        pVar = Cb.validator;
        if (((Boolean) pVar.invoke(this.muttTimeout, 0)).booleanValue()) {
            pVar2 = Cb.validator;
            if (((Boolean) pVar2.invoke(this.loadTimeout, 0)).booleanValue()) {
                pVar3 = Cb.validator;
                if (((Boolean) pVar3.invoke(this.loadRetryInterval, 1)).booleanValue()) {
                    pVar4 = Cb.validator;
                    if (!((Boolean) pVar4.invoke(this.maxLoadRetries, 1)).booleanValue()) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimeoutConfigurations$AdNonABConfig(JSONObject loadTimeout, JSONObject muttTimeout, JSONObject retryInterval, JSONObject maxRetries) {
        this();
        g.e(loadTimeout, "loadTimeout");
        g.e(muttTimeout, "muttTimeout");
        g.e(retryInterval, "retryInterval");
        g.e(maxRetries, "maxRetries");
        this.loadTimeout = loadTimeout;
        this.muttTimeout = muttTimeout;
        this.loadRetryInterval = retryInterval;
        this.maxLoadRetries = maxRetries;
    }
}
