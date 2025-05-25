package y2;

import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;

/* compiled from: StopWorkRunnable.java */
/* loaded from: classes.dex */
public final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final p2.j f32009a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32010b;
    public final boolean c;

    static {
        o2.h.e("StopWorkRunnable");
    }

    public l(p2.j jVar, String str, boolean z10) {
        this.f32009a = jVar;
        this.f32010b = str;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean k10;
        p2.j jVar = this.f32009a;
        WorkDatabase workDatabase = jVar.c;
        p2.c cVar = jVar.f23631f;
        x2.q p10 = workDatabase.p();
        workDatabase.c();
        try {
            String str = this.f32010b;
            synchronized (cVar.f23610k) {
                containsKey = cVar.f23605f.containsKey(str);
            }
            if (this.c) {
                k10 = this.f32009a.f23631f.j(this.f32010b);
            } else {
                if (!containsKey) {
                    x2.r rVar = (x2.r) p10;
                    if (rVar.f(this.f32010b) == WorkInfo$State.RUNNING) {
                        rVar.n(WorkInfo$State.ENQUEUED, this.f32010b);
                    }
                }
                k10 = this.f32009a.f23631f.k(this.f32010b);
            }
            o2.h c = o2.h.c();
            String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f32010b, Boolean.valueOf(k10));
            c.a(new Throwable[0]);
            workDatabase.j();
        } finally {
            workDatabase.g();
        }
    }
}
