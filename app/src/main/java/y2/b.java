package y2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p2.j f31994b;
    public final /* synthetic */ String c = "offline_ping_sender_work";

    public b(p2.j jVar) {
        this.f31994b = jVar;
    }

    @Override // y2.d
    public final void b() {
        p2.j jVar = this.f31994b;
        WorkDatabase workDatabase = jVar.c;
        workDatabase.c();
        try {
            Iterator it = ((x2.r) workDatabase.p()).h(this.c).iterator();
            while (it.hasNext()) {
                d.a(jVar, (String) it.next());
            }
            workDatabase.j();
            workDatabase.g();
            p2.e.a(jVar.f23628b, jVar.c, jVar.f23630e);
        } catch (Throwable th2) {
            workDatabase.g();
            throw th2;
        }
    }
}
