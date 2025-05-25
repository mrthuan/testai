package com.bytedance.sdk.openadsdk.api.model;

/* loaded from: classes.dex */
public class PAGErrorModel {
    private final int Qhi;
    private final String cJ;

    public PAGErrorModel(int i10, String str) {
        this.Qhi = i10;
        this.cJ = str;
    }

    public int getErrorCode() {
        return this.Qhi;
    }

    public String getErrorMessage() {
        return this.cJ;
    }
}
