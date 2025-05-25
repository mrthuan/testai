package y2;

import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import java.util.LinkedList;
import o2.j;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public abstract class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final p2.b f31997a = new p2.b();

    public static void a(p2.j jVar, String str) {
        WorkDatabase workDatabase = jVar.c;
        x2.q p10 = workDatabase.p();
        x2.b k10 = workDatabase.k();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            x2.r rVar = (x2.r) p10;
            WorkInfo$State f10 = rVar.f(str2);
            if (f10 != WorkInfo$State.SUCCEEDED && f10 != WorkInfo$State.FAILED) {
                rVar.n(WorkInfo$State.CANCELLED, str2);
            }
            linkedList.addAll(((x2.c) k10).a(str2));
        }
        p2.c cVar = jVar.f23631f;
        synchronized (cVar.f23610k) {
            o2.h c = o2.h.c();
            int i10 = p2.c.f23600l;
            boolean z10 = true;
            String.format("Processor cancelling %s", str);
            c.a(new Throwable[0]);
            cVar.f23608i.add(str);
            p2.m mVar = (p2.m) cVar.f23605f.remove(str);
            if (mVar == null) {
                z10 = false;
            }
            if (mVar == null) {
                mVar = (p2.m) cVar.f23606g.remove(str);
            }
            p2.c.c(str, mVar);
            if (z10) {
                cVar.i();
            }
        }
        for (p2.d dVar : jVar.f23630e) {
            dVar.c(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        p2.b bVar = this.f31997a;
        try {
            b();
            bVar.a(o2.j.f22687a);
        } catch (Throwable th2) {
            bVar.a(new j.a.C0302a(th2));
        }
    }
}
