package y2;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public final class c extends d {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p2.j f31995b;
    public final /* synthetic */ String c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f31996d = false;

    public c(p2.j jVar, String str) {
        this.f31995b = jVar;
        this.c = str;
    }

    @Override // y2.d
    public final void b() {
        p2.j jVar = this.f31995b;
        WorkDatabase workDatabase = jVar.c;
        workDatabase.c();
        try {
            Iterator it = ((x2.r) workDatabase.p()).g(this.c).iterator();
            while (it.hasNext()) {
                d.a(jVar, (String) it.next());
            }
            workDatabase.j();
            workDatabase.g();
            if (this.f31996d) {
                p2.e.a(jVar.f23628b, jVar.c, jVar.f23630e);
            }
        } catch (Throwable th2) {
            workDatabase.g();
            throw th2;
        }
    }
}
