package y2;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* compiled from: CancelWorkRunnable.java */
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p2.j f31993b;
    public final /* synthetic */ UUID c;

    public a(p2.j jVar, UUID uuid) {
        this.f31993b = jVar;
        this.c = uuid;
    }

    @Override // y2.d
    public final void b() {
        p2.j jVar = this.f31993b;
        WorkDatabase workDatabase = jVar.c;
        workDatabase.c();
        try {
            d.a(jVar, this.c.toString());
            workDatabase.j();
            workDatabase.g();
            p2.e.a(jVar.f23628b, jVar.c, jVar.f23630e);
        } catch (Throwable th2) {
            workDatabase.g();
            throw th2;
        }
    }
}
