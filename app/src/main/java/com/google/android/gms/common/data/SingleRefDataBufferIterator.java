package com.google.android.gms.common.data;

import a6.h;
import b.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    public Object c;

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            int i10 = this.f11163b + 1;
            this.f11163b = i10;
            if (i10 == 0) {
                Object obj = this.f11162a.get(0);
                Preconditions.j(obj);
                this.c = obj;
                if (obj instanceof DataBufferRef) {
                    return obj;
                }
                throw new IllegalStateException(h.d("DataBuffer reference of type ", String.valueOf(obj.getClass()), " is not movable"));
            }
            Object obj2 = this.c;
            Preconditions.j(obj2);
            DataBufferRef dataBufferRef = (DataBufferRef) obj2;
            int i11 = this.f11163b;
            if (i11 >= 0) {
                throw null;
            }
            Preconditions.m(false);
            dataBufferRef.f11164a = i11;
            throw null;
        }
        throw new NoSuchElementException(a.c("Cannot advance the iterator beyond ", this.f11163b));
    }
}
