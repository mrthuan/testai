package com.facebook;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: GraphRequestBatch.kt */
/* loaded from: classes.dex */
public final class h extends AbstractList<e> {

    /* renamed from: e  reason: collision with root package name */
    public static final AtomicInteger f9722e = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    public Handler f9723a;
    public final ArrayList c;

    /* renamed from: b  reason: collision with root package name */
    public final String f9724b = String.valueOf(Integer.valueOf(f9722e.incrementAndGet()));

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f9725d = new ArrayList();

    /* compiled from: GraphRequestBatch.kt */
    /* loaded from: classes.dex */
    public interface a {
        void b(h hVar);
    }

    /* compiled from: GraphRequestBatch.kt */
    /* loaded from: classes.dex */
    public interface b extends a {
        void a();
    }

    public h(Collection<e> collection) {
        this.c = new ArrayList(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        e element = (e) obj;
        kotlin.jvm.internal.g.e(element, "element");
        this.c.add(i10, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof e;
        }
        if (!z10) {
            return false;
        }
        return super.contains((e) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (e) this.c.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof e;
        }
        if (!z10) {
            return -1;
        }
        return super.indexOf((e) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        boolean z10;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = obj instanceof e;
        }
        if (!z10) {
            return -1;
        }
        return super.lastIndexOf((e) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof e) {
            return super.remove((e) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        e element = (e) obj;
        kotlin.jvm.internal.g.e(element, "element");
        return (e) this.c.set(i10, element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        return (e) this.c.remove(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e element = (e) obj;
        kotlin.jvm.internal.g.e(element, "element");
        return this.c.add(element);
    }

    public h(e... eVarArr) {
        this.c = new ArrayList(kotlin.collections.f.v(eVarArr));
    }
}
