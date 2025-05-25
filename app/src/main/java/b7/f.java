package b7;

import android.content.Context;
import e7.b;
import e7.c;
import java.util.concurrent.Executor;
import k3.j;

/* compiled from: Uploader_Factory.java */
/* loaded from: classes.dex */
public final class f implements x6.b<e> {

    /* renamed from: a  reason: collision with root package name */
    public final pf.a<Context> f5360a;

    /* renamed from: b  reason: collision with root package name */
    public final pf.a<w6.d> f5361b;
    public final pf.a<c7.d> c;

    /* renamed from: d  reason: collision with root package name */
    public final pf.a<i> f5362d;

    /* renamed from: e  reason: collision with root package name */
    public final pf.a<Executor> f5363e;

    /* renamed from: f  reason: collision with root package name */
    public final pf.a<d7.a> f5364f;

    /* renamed from: g  reason: collision with root package name */
    public final pf.a<e7.a> f5365g;

    /* renamed from: h  reason: collision with root package name */
    public final pf.a<e7.a> f5366h;

    /* renamed from: i  reason: collision with root package name */
    public final pf.a<c7.c> f5367i;

    public f(pf.a aVar, pf.a aVar2, pf.a aVar3, j jVar, pf.a aVar4, pf.a aVar5, pf.a aVar6) {
        e7.b bVar = b.a.f16471a;
        e7.c cVar = c.a.f16472a;
        this.f5360a = aVar;
        this.f5361b = aVar2;
        this.c = aVar3;
        this.f5362d = jVar;
        this.f5363e = aVar4;
        this.f5364f = aVar5;
        this.f5365g = bVar;
        this.f5366h = cVar;
        this.f5367i = aVar6;
    }

    @Override // pf.a
    public final Object get() {
        return new e(this.f5360a.get(), this.f5361b.get(), this.c.get(), this.f5362d.get(), this.f5363e.get(), this.f5364f.get(), this.f5365g.get(), this.f5366h.get(), this.f5367i.get());
    }
}
