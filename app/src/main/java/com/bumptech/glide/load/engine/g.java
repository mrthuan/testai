package com.bumptech.glide.load.engine;

import v3.l;

/* compiled from: EngineResource.java */
/* loaded from: classes.dex */
public final class g<Z> implements l<Z> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7014a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f7015b;
    public final l<Z> c;

    /* renamed from: d  reason: collision with root package name */
    public final a f7016d;

    /* renamed from: e  reason: collision with root package name */
    public final t3.b f7017e;

    /* renamed from: f  reason: collision with root package name */
    public int f7018f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7019g;

    /* compiled from: EngineResource.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(t3.b bVar, g<?> gVar);
    }

    public g(l<Z> lVar, boolean z10, boolean z11, t3.b bVar, a aVar) {
        com.google.android.play.core.assetpacks.c.l(lVar);
        this.c = lVar;
        this.f7014a = z10;
        this.f7015b = z11;
        this.f7017e = bVar;
        com.google.android.play.core.assetpacks.c.l(aVar);
        this.f7016d = aVar;
    }

    @Override // v3.l
    public final synchronized void a() {
        if (this.f7018f <= 0) {
            if (!this.f7019g) {
                this.f7019g = true;
                if (this.f7015b) {
                    this.c.a();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    public final synchronized void b() {
        if (!this.f7019g) {
            this.f7018f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // v3.l
    public final Class<Z> c() {
        return this.c.c();
    }

    public final void d() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f7018f;
            if (i10 > 0) {
                z10 = true;
                int i11 = i10 - 1;
                this.f7018f = i11;
                if (i11 != 0) {
                    z10 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z10) {
            this.f7016d.a(this.f7017e, this);
        }
    }

    @Override // v3.l
    public final Z get() {
        return this.c.get();
    }

    @Override // v3.l
    public final int getSize() {
        return this.c.getSize();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f7014a + ", listener=" + this.f7016d + ", key=" + this.f7017e + ", acquired=" + this.f7018f + ", isRecycled=" + this.f7019g + ", resource=" + this.c + '}';
    }
}
