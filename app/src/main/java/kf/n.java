package kf;

import androidx.fragment.app.w;
import jf.j;
import of.a;

/* compiled from: CorePlugin.java */
/* loaded from: classes.dex */
public final class n implements j.c<qk.l> {
    @Override // jf.j.c
    public final void a(jf.j jVar, qk.l lVar) {
        boolean z10;
        qk.l lVar2 = lVar;
        jf.m mVar = (jf.m) jVar;
        jf.p pVar = ((jf.i) mVar.f19194a.f19179e).f19190a.get(qk.l.class);
        if (pVar == null) {
            mVar.B(lVar2);
            return;
        }
        int y10 = mVar.y();
        mVar.B(lVar2);
        int y11 = mVar.y();
        jf.q qVar = mVar.c;
        if (y10 == y11) {
            qVar.a((char) 65532);
        }
        jf.e eVar = mVar.f19194a;
        ((a.C0317a) eVar.f19178d).getClass();
        jf.n nVar = w.f3952a;
        jf.o oVar = mVar.f19195b;
        nVar.b(oVar, lVar2.f29368f);
        w.f3953b.b(oVar, Boolean.valueOf(lVar2.f29377a instanceof qk.n));
        w.c.b(oVar, null);
        Object a10 = pVar.a(eVar, oVar);
        int length = qVar.length();
        if (a10 != null) {
            int length2 = qVar.length();
            if (length > y10 && y10 >= 0 && length <= length2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                jf.q.c(qVar, a10, y10, length);
            }
        }
    }
}
