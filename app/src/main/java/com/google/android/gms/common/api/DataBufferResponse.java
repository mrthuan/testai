package com.google.android.gms.common.api;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class DataBufferResponse<T, R extends AbstractDataBuffer<T> & Result> extends Response<R> implements DataBuffer<T> {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final T get(int i10) {
        throw null;
    }

    @Override // com.google.android.gms.common.data.DataBuffer
    public final int getCount() {
        throw null;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        throw null;
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
        throw null;
    }
}
