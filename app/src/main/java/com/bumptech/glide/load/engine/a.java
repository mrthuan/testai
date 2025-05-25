package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.g;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import v3.l;

/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6931a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f6932b;
    public final HashMap c;

    /* renamed from: d  reason: collision with root package name */
    public final ReferenceQueue<g<?>> f6933d;

    /* renamed from: e  reason: collision with root package name */
    public g.a f6934e;

    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.engine.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0053a extends WeakReference<g<?>> {

        /* renamed from: a  reason: collision with root package name */
        public final t3.b f6935a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6936b;
        public l<?> c;

        public C0053a(t3.b bVar, g<?> gVar, ReferenceQueue<? super g<?>> referenceQueue, boolean z10) {
            super(gVar, referenceQueue);
            l<?> lVar;
            com.google.android.play.core.assetpacks.c.l(bVar);
            this.f6935a = bVar;
            if (gVar.f7014a && z10) {
                lVar = gVar.c;
                com.google.android.play.core.assetpacks.c.l(lVar);
            } else {
                lVar = null;
            }
            this.c = lVar;
            this.f6936b = gVar.f7014a;
        }
    }

    public a() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new v3.a());
        this.c = new HashMap();
        this.f6933d = new ReferenceQueue<>();
        this.f6931a = false;
        this.f6932b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new v3.b(this));
    }

    public final synchronized void a(t3.b bVar, g<?> gVar) {
        C0053a c0053a = (C0053a) this.c.put(bVar, new C0053a(bVar, gVar, this.f6933d, this.f6931a));
        if (c0053a != null) {
            c0053a.c = null;
            c0053a.clear();
        }
    }

    public final void b(C0053a c0053a) {
        l<?> lVar;
        synchronized (this) {
            this.c.remove(c0053a.f6935a);
            if (c0053a.f6936b && (lVar = c0053a.c) != null) {
                this.f6934e.a(c0053a.f6935a, new g<>(lVar, true, false, c0053a.f6935a, this.f6934e));
            }
        }
    }
}
