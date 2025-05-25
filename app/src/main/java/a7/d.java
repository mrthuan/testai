package a7;

import b7.i;
import c7.p;
import c7.v;
import java.util.concurrent.Executor;

/* compiled from: DefaultScheduler_Factory.java */
/* loaded from: classes.dex */
public final class d implements x6.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f96a;

    /* renamed from: b  reason: collision with root package name */
    public final pf.a f97b;
    public final pf.a c;

    /* renamed from: d  reason: collision with root package name */
    public final pf.a f98d;

    /* renamed from: e  reason: collision with root package name */
    public final pf.a f99e;

    /* renamed from: f  reason: collision with root package name */
    public final pf.a f100f;

    public /* synthetic */ d(pf.a aVar, pf.a aVar2, x6.b bVar, pf.a aVar3, pf.a aVar4, int i10) {
        this.f96a = i10;
        this.f97b = aVar;
        this.c = aVar2;
        this.f98d = bVar;
        this.f99e = aVar3;
        this.f100f = aVar4;
    }

    @Override // pf.a
    public final Object get() {
        int i10 = this.f96a;
        pf.a aVar = this.f99e;
        pf.a aVar2 = this.f98d;
        pf.a aVar3 = this.c;
        pf.a aVar4 = this.f97b;
        switch (i10) {
            case 0:
                return new c((Executor) aVar4.get(), (w6.d) aVar3.get(), (i) aVar2.get(), (c7.d) aVar.get(), (d7.a) this.f100f.get());
            default:
                e7.a aVar5 = (e7.a) aVar4.get();
                e7.a aVar6 = (e7.a) aVar3.get();
                Object obj = aVar2.get();
                return new p(aVar5, aVar6, (c7.e) obj, (v) aVar.get(), this.f100f);
        }
    }
}
