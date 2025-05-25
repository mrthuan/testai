package b7;

import d7.a;
import ha.h;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import v6.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements a.InterfaceC0194a, h.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f5347a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f5348b;
    public final /* synthetic */ Object c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f5349d;

    public /* synthetic */ c(e eVar, Iterable iterable, s sVar, long j10) {
        this.f5348b = eVar;
        this.c = iterable;
        this.f5349d = sVar;
        this.f5347a = j10;
    }

    @Override // ha.h.c
    public final ScheduledFuture a(h.a aVar) {
        ha.g gVar = (ha.g) this.f5348b;
        gVar.getClass();
        androidx.fragment.app.d dVar = new androidx.fragment.app.d(4, gVar, (Runnable) this.c, aVar);
        return gVar.f18135b.schedule(dVar, this.f5347a, (TimeUnit) this.f5349d);
    }

    @Override // d7.a.InterfaceC0194a
    public final Object l() {
        e eVar = (e) this.f5348b;
        c7.d dVar = eVar.c;
        dVar.f0((Iterable) this.c);
        dVar.l0(eVar.f5357g.a() + this.f5347a, (s) this.f5349d);
        return null;
    }

    public /* synthetic */ c(ha.g gVar, Runnable runnable, long j10, TimeUnit timeUnit) {
        this.f5348b = gVar;
        this.c = runnable;
        this.f5347a = j10;
        this.f5349d = timeUnit;
    }
}
