package com.google.android.gms.common.data;

import b.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class DataBufferIterator<T> implements Iterator<T> {

    /* renamed from: a  reason: collision with root package name */
    public final DataBuffer f11162a;

    /* renamed from: b  reason: collision with root package name */
    public int f11163b;

    public DataBufferIterator(DataBuffer dataBuffer) {
        Preconditions.j(dataBuffer);
        this.f11162a = dataBuffer;
        this.f11163b = -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f11163b < this.f11162a.getCount() - 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (hasNext()) {
            int i10 = this.f11163b + 1;
            this.f11163b = i10;
            return this.f11162a.get(i10);
        }
        throw new NoSuchElementException(a.c("Cannot advance the iterator beyond ", this.f11163b));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
