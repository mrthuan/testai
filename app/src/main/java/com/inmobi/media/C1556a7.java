package com.inmobi.media;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.inmobi.media.a7  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1556a7 implements Iterator, dg.a {

    /* renamed from: a  reason: collision with root package name */
    public int f14934a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C1570b7 f14935b;

    public C1556a7(C1570b7 c1570b7) {
        this.f14935b = c1570b7;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f14934a < this.f14935b.B) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        try {
            ArrayList arrayList = this.f14935b.A;
            int i10 = this.f14934a;
            this.f14934a = i10 + 1;
            W6 w62 = (W6) arrayList.get(i10);
            kotlin.jvm.internal.g.b(w62);
            return w62;
        } catch (IndexOutOfBoundsException e10) {
            this.f14934a--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
