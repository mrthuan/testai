package p2;

import androidx.work.ListenableWorker;

/* compiled from: WorkerWrapper.java */
/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y9.a f23635a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ androidx.work.impl.utils.futures.a f23636b;
    public final /* synthetic */ m c;

    public k(m mVar, androidx.work.impl.utils.futures.a aVar, androidx.work.impl.utils.futures.a aVar2) {
        this.c = mVar;
        this.f23635a = aVar;
        this.f23636b = aVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.work.impl.utils.futures.a aVar = this.f23636b;
        m mVar = this.c;
        try {
            this.f23635a.get();
            o2.h c = o2.h.c();
            int i10 = m.f23639t;
            String.format("Starting work for %s", mVar.f23643e.c);
            c.a(new Throwable[0]);
            y9.a<ListenableWorker.a> startWork = mVar.f23644f.startWork();
            mVar.f23656r = startWork;
            aVar.j(startWork);
        } catch (Throwable th2) {
            aVar.i(th2);
        }
    }
}
