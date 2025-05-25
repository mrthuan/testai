package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public final class ApiKey<O extends Api.ApiOptions> {

    /* renamed from: a  reason: collision with root package name */
    public final int f10929a;

    /* renamed from: b  reason: collision with root package name */
    public final Api f10930b;
    public final Api.ApiOptions c;

    /* renamed from: d  reason: collision with root package name */
    public final String f10931d;

    public ApiKey(Api api, Api.ApiOptions apiOptions, String str) {
        this.f10930b = api;
        this.c = apiOptions;
        this.f10931d = str;
        this.f10929a = Arrays.hashCode(new Object[]{api, apiOptions, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        if (!Objects.a(this.f10930b, apiKey.f10930b) || !Objects.a(this.c, apiKey.c) || !Objects.a(this.f10931d, apiKey.f10931d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10929a;
    }
}
