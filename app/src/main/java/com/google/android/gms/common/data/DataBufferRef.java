package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class DataBufferRef {
    @KeepForSdk

    /* renamed from: a  reason: collision with root package name */
    public int f11164a;

    @KeepForSdk
    public final boolean equals(Object obj) {
        if (!(obj instanceof DataBufferRef) || !Objects.a(Integer.valueOf(((DataBufferRef) obj).f11164a), Integer.valueOf(this.f11164a)) || !Objects.a(0, 0)) {
            return false;
        }
        return true;
    }

    @KeepForSdk
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f11164a), 0, null});
    }
}
