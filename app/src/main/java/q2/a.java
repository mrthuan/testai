package q2;

import o2.h;
import x2.p;

/* compiled from: DelayedWorkTracker.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f29052a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f29053b;

    public a(b bVar, p pVar) {
        this.f29053b = bVar;
        this.f29052a = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h c = h.c();
        int i10 = b.f29054d;
        p pVar = this.f29052a;
        String.format("Scheduling work %s", pVar.f31558a);
        c.a(new Throwable[0]);
        this.f29053b.f29055a.e(pVar);
    }
}
