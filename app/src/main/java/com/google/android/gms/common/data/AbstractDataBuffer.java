package com.google.android.gms.common.data;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes.dex */
public abstract class AbstractDataBuffer<T> implements DataBuffer<T> {
    @Override // com.google.android.gms.common.data.DataBuffer
    public int getCount() {
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return new DataBufferIterator(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.common.api.Releasable
    public final void release() {
    }
}
