package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {
    @Override // com.google.android.gms.common.data.DataBuffer
    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public final T get(int i10) {
        synchronized (this) {
            Preconditions.j(null);
            throw null;
        }
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    @KeepForSdk
    public final int getCount() {
        synchronized (this) {
            Preconditions.j(null);
            throw null;
        }
    }
}
