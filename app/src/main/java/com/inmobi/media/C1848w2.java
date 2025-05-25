package com.inmobi.media;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.inmobi.commons.core.configs.Config;
import com.tom_roush.fontbox.ttf.OS2WindowsMetricsTable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.w2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1848w2 {

    /* renamed from: a  reason: collision with root package name */
    public final Config f15550a;

    /* renamed from: b  reason: collision with root package name */
    public final int f15551b;
    public C1771q2 c;

    public C1848w2(JSONObject jSONObject, Config config) {
        kotlin.jvm.internal.g.e(config, "config");
        this.f15550a = config;
        int i10 = -1;
        this.f15551b = -1;
        if (jSONObject != null) {
            try {
                int i11 = jSONObject.getInt("status");
                if (i11 != 200) {
                    if (i11 != 304) {
                        int i12 = TTAdConstant.DEEPLINK_FALLBACK_CODE;
                        if (i11 != 404) {
                            i12 = OS2WindowsMetricsTable.WEIGHT_CLASS_MEDIUM;
                            if (i11 != 500) {
                            }
                        }
                        i10 = i12;
                    } else {
                        i10 = 304;
                    }
                } else {
                    i10 = 200;
                }
                this.f15551b = i10;
                if (i10 == 200) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("content");
                    C1621f2 c1621f2 = Config.Companion;
                    String type = config.getType();
                    kotlin.jvm.internal.g.b(jSONObject2);
                    String accountId$media_release = config.getAccountId$media_release();
                    long currentTimeMillis = System.currentTimeMillis();
                    c1621f2.getClass();
                    Config a10 = C1621f2.a(type, jSONObject2, accountId$media_release, currentTimeMillis);
                    if (a10 == null) {
                        this.c = new C1771q2((byte) 3, "The received config has failed backend contract.");
                    } else {
                        this.f15550a = a10;
                    }
                    this.f15550a.getType();
                    this.f15550a.isValid();
                    if (!this.f15550a.isValid()) {
                        C1771q2 c1771q2 = new C1771q2((byte) 2, "The received config has failed validation.");
                        this.f15550a.getType();
                        this.c = c1771q2;
                    }
                } else if (i10 == 304) {
                    config.getType();
                } else {
                    C1771q2 c1771q22 = new C1771q2((byte) 1, "Internal error");
                    config.getType();
                    this.c = c1771q22;
                }
            } catch (JSONException e10) {
                String localizedMessage = e10.getLocalizedMessage();
                C1771q2 c1771q23 = new C1771q2((byte) 2, localizedMessage == null ? "Exception in config validation" : localizedMessage);
                this.f15550a.getType();
                this.c = c1771q23;
            }
        }
    }
}
