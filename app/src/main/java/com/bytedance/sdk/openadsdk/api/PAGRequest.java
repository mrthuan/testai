package com.bytedance.sdk.openadsdk.api;

import android.os.Bundle;
import java.util.Map;

/* loaded from: classes.dex */
public class PAGRequest {
    private String Qhi;

    /* renamed from: ac  reason: collision with root package name */
    private Bundle f8583ac = null;
    private Map<String, Object> cJ;

    public final void addNetworkExtrasBundle(Class<?> cls, Bundle bundle) {
        if (this.f8583ac == null) {
            this.f8583ac = new Bundle();
        }
        this.f8583ac.putBundle(cls.getName(), bundle);
    }

    public String getAdString() {
        return this.Qhi;
    }

    public Map<String, Object> getExtraInfo() {
        return this.cJ;
    }

    public Bundle getNetworkExtrasBundle() {
        return this.f8583ac;
    }

    public void setAdString(String str) {
        this.Qhi = str;
    }

    public void setExtraInfo(Map<String, Object> map) {
        this.cJ = map;
    }
}
