package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final ApiKey f11041a;

    /* renamed from: b  reason: collision with root package name */
    public final Feature f11042b;

    public /* synthetic */ y(ApiKey apiKey, Feature feature) {
        this.f11041a = apiKey;
        this.f11042b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof y)) {
            y yVar = (y) obj;
            if (Objects.a(this.f11041a, yVar.f11041a) && Objects.a(this.f11042b, yVar.f11042b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11041a, this.f11042b});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.f11041a, "key");
        toStringHelper.a(this.f11042b, "feature");
        return toStringHelper.toString();
    }
}
