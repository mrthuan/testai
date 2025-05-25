package com.inmobi.commons.core.configs;

import androidx.annotation.Keep;
import com.inmobi.media.C1621f2;
import com.inmobi.media.InterfaceC1595d4;
import com.inmobi.media.T4;
import kotlin.jvm.internal.g;
import kotlin.text.j;
import org.json.JSONObject;

@Keep
/* loaded from: classes2.dex */
public abstract class Config {
    public static final C1621f2 Companion = new C1621f2();
    @InterfaceC1595d4
    private String accountId;
    private T4 includeIds = new T4(false, 1, null);
    @InterfaceC1595d4
    private long lastUpdateTimeStamp;

    public Config(String str) {
        this.accountId = str;
    }

    public static final Config fromJSON(String str, JSONObject jSONObject, String str2, long j10) {
        Companion.getClass();
        return C1621f2.a(str, jSONObject, str2, j10);
    }

    public static final Config newInstance(String str, String str2) {
        Companion.getClass();
        return C1621f2.a(str, str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Config)) {
            return false;
        }
        Config config = (Config) obj;
        if (!g.a(config.getType(), getType())) {
            return false;
        }
        String str = this.accountId;
        if ((str != null || config.accountId != null) && (str == null || !j.G(str, config.accountId, false))) {
            return false;
        }
        return true;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getAccountId$media_release() {
        return this.accountId;
    }

    public final T4 getIncludeIdParams() {
        return this.includeIds;
    }

    public final long getLastUpdateTimeStamp() {
        return this.lastUpdateTimeStamp;
    }

    public abstract String getType();

    public int hashCode() {
        int hashCode;
        int hashCode2 = getType().hashCode();
        String str = this.accountId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public abstract boolean isValid();

    public final void setAccountId$media_release(String str) {
        this.accountId = str;
    }

    public final void setLastUpdateTimeStamp(long j10) {
        this.lastUpdateTimeStamp = j10;
    }

    public abstract JSONObject toJson();
}
