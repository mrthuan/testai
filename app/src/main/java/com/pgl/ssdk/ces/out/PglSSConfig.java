package com.pgl.ssdk.ces.out;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class PglSSConfig {
    public static final int COLLECT_MODE_DEFAULT = 0;
    public static final int COLLECT_MODE_ML_MINIMIZE = 1;
    public static final String CUSTOMINFO_KEY_CHECKCLAZZ = "check_clz";
    public static final int OVREGION_TYPE_CN = 2;
    public static final int OVREGION_TYPE_SG = 0;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* renamed from: a  reason: collision with root package name */
    private String f15812a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15813b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f15814d;

    /* renamed from: e  reason: collision with root package name */
    private Map<String, Object> f15815e;

    /* renamed from: f  reason: collision with root package name */
    private String f15816f;

    /* renamed from: g  reason: collision with root package name */
    private String f15817g;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f15818a;

        /* renamed from: b  reason: collision with root package name */
        private int f15819b = -1;
        private int c = 0;

        /* renamed from: d  reason: collision with root package name */
        private int f15820d;

        public PglSSConfig build() {
            if (!TextUtils.isEmpty(this.f15818a)) {
                int i10 = this.f15819b;
                if (i10 == 2 || i10 == 1 || i10 == 0) {
                    int i11 = this.c;
                    if (i11 == 0 || i11 == 1) {
                        return new PglSSConfig(this.f15818a, i10, i11, this.f15820d);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }

        public Builder setAdsdkVersionCode(int i10) {
            this.f15820d = i10;
            return this;
        }

        public Builder setAppId(String str) {
            this.f15818a = str;
            return this;
        }

        public Builder setCollectMode(int i10) {
            this.c = i10;
            return this;
        }

        public Builder setOVRegionType(int i10) {
            this.f15819b = i10;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getAdSdkVersionCode() {
        return this.f15814d;
    }

    public String getAppId() {
        return this.f15812a;
    }

    public String getCnReportUrl() {
        return this.f15816f;
    }

    public String getCnTokenUrl() {
        return this.f15817g;
    }

    public int getCollectMode() {
        return this.c;
    }

    public Map<String, Object> getCustomInfo() {
        return this.f15815e;
    }

    public int getOVRegionType() {
        return this.f15813b;
    }

    public void setCnReportUrl(String str) {
        this.f15816f = str;
    }

    public void setCnTokenUrl(String str) {
        this.f15817g = str;
    }

    public void setCustomInfo(Map<String, Object> map) {
        this.f15815e = map;
    }

    private PglSSConfig(String str, int i10, int i11, int i12) {
        this.f15812a = str;
        this.f15813b = i10;
        this.c = i11;
        this.f15814d = i12;
    }
}
