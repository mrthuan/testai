package io.noties.markwon.core;

import io.noties.markwon.core.CoreProps;
import jf.j;
import jf.m;
import jf.n;
import jf.o;
import qk.q;
import qk.r;
import qk.s;

/* compiled from: CorePlugin.java */
/* loaded from: classes.dex */
public final class a implements j.c<q> {
    @Override // jf.j.c
    public final void a(j jVar, q qVar) {
        q qVar2 = qVar;
        m mVar = (m) jVar;
        int y10 = mVar.y();
        mVar.B(qVar2);
        qk.a aVar = (qk.a) qVar2.f29377a;
        boolean z10 = aVar instanceof s;
        n<CoreProps.ListItemType> nVar = CoreProps.f18955a;
        boolean z11 = true;
        o oVar = mVar.f19195b;
        if (z10) {
            s sVar = (s) aVar;
            int i10 = sVar.f29381g;
            nVar.b(oVar, CoreProps.ListItemType.ORDERED);
            CoreProps.c.b(oVar, Integer.valueOf(i10));
            sVar.f29381g++;
        } else {
            nVar.b(oVar, CoreProps.ListItemType.BULLET);
            n<Integer> nVar2 = CoreProps.f18956b;
            int i11 = 0;
            for (r c = qVar2.c(); c != null; c = c.c()) {
                if (c instanceof q) {
                    i11++;
                }
            }
            nVar2.b(oVar, Integer.valueOf(i11));
        }
        mVar.z(qVar2, y10);
        if (qVar2.f29380e == null) {
            z11 = false;
        }
        if (z11) {
            mVar.u();
        }
    }
}
