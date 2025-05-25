package w2;

import androidx.work.impl.WorkDatabase;
import x2.p;
import x2.r;

/* compiled from: SystemForegroundDispatcher.java */
/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f30934a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f30935b;
    public final /* synthetic */ androidx.work.impl.foreground.a c;

    public b(androidx.work.impl.foreground.a aVar, WorkDatabase workDatabase, String str) {
        this.c = aVar;
        this.f30934a = workDatabase;
        this.f30935b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p i10 = ((r) this.f30934a.p()).i(this.f30935b);
        if (i10 != null && i10.b()) {
            synchronized (this.c.f4970d) {
                this.c.f4973g.put(this.f30935b, i10);
                this.c.f4974h.add(i10);
                androidx.work.impl.foreground.a aVar = this.c;
                aVar.f4975i.c(aVar.f4974h);
            }
        }
    }
}
