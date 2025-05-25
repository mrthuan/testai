package com.inmobi.media;

import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.commons.core.configs.Config;
import com.inmobi.commons.core.configs.CrashConfig;
import com.inmobi.commons.core.configs.RootConfig;
import com.inmobi.commons.core.configs.SignalsConfig;
import com.inmobi.commons.core.configs.TelemetryConfig;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.f2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1621f2 {
    public static Config a(String configType, String str) {
        kotlin.jvm.internal.g.e(configType, "configType");
        switch (configType.hashCode()) {
            case -60641721:
                if (configType.equals("crashReporting")) {
                    return new CrashConfig(str);
                }
                break;
            case 96432:
                if (configType.equals("ads")) {
                    return new AdConfig(str);
                }
                break;
            case 3506402:
                if (configType.equals("root")) {
                    return new RootConfig(str);
                }
                break;
            case 780346297:
                if (configType.equals("telemetry")) {
                    return new TelemetryConfig(str);
                }
                break;
            case 2088265419:
                if (configType.equals("signals")) {
                    return new SignalsConfig(str);
                }
                break;
        }
        return new AdConfig(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Config a(String configType, JSONObject jsonObject, String str, long j10) {
        Config config;
        kotlin.jvm.internal.g.e(configType, "configType");
        kotlin.jvm.internal.g.e(jsonObject, "jsonObject");
        switch (configType.hashCode()) {
            case -60641721:
                if (configType.equals("crashReporting")) {
                    CrashConfig.Companion.getClass();
                    config = (Config) new C1722m5().a(jsonObject, CrashConfig.class);
                    break;
                }
                AdConfig.Companion.getClass();
                config = (Config) com.inmobi.commons.core.configs.b.a().a(jsonObject, AdConfig.class);
                break;
            case 96432:
                if (configType.equals("ads")) {
                    AdConfig.Companion.getClass();
                    config = (Config) com.inmobi.commons.core.configs.b.a().a(jsonObject, AdConfig.class);
                    break;
                }
                AdConfig.Companion.getClass();
                config = (Config) com.inmobi.commons.core.configs.b.a().a(jsonObject, AdConfig.class);
                break;
            case 3506402:
                if (configType.equals("root")) {
                    RootConfig.Companion.getClass();
                    config = (Config) new C1722m5().a(new C1766pa("components", RootConfig.class), (AbstractC1753oa) new M5(new com.inmobi.commons.core.configs.d(), RootConfig.ComponentConfig.class)).a(jsonObject, RootConfig.class);
                    break;
                }
                AdConfig.Companion.getClass();
                config = (Config) com.inmobi.commons.core.configs.b.a().a(jsonObject, AdConfig.class);
                break;
            case 780346297:
                if (configType.equals("telemetry")) {
                    TelemetryConfig.Companion.getClass();
                    config = (Config) new C1722m5().a(new C1766pa("priorityEvents", TelemetryConfig.class), (AbstractC1753oa) new M5(new C1630fb(), String.class)).a(jsonObject, TelemetryConfig.class);
                    break;
                }
                AdConfig.Companion.getClass();
                config = (Config) com.inmobi.commons.core.configs.b.a().a(jsonObject, AdConfig.class);
                break;
            case 2088265419:
                if (configType.equals("signals")) {
                    SignalsConfig.Companion.getClass();
                    config = (Config) com.inmobi.commons.core.configs.f.a().a(jsonObject, SignalsConfig.class);
                    break;
                }
                AdConfig.Companion.getClass();
                config = (Config) com.inmobi.commons.core.configs.b.a().a(jsonObject, AdConfig.class);
                break;
            default:
                AdConfig.Companion.getClass();
                config = (Config) com.inmobi.commons.core.configs.b.a().a(jsonObject, AdConfig.class);
                break;
        }
        if (config != null) {
            config.setAccountId$media_release(str);
            config.setLastUpdateTimeStamp(j10);
        }
        return config;
    }
}
