package lf;

import io.noties.markwon.core.CoreProps;
import jf.o;
import jf.p;
import mf.i;

/* compiled from: ListItemSpanFactory.java */
/* loaded from: classes.dex */
public final class g implements p {
    @Override // jf.p
    public final Object a(jf.e eVar, o oVar) {
        if (CoreProps.ListItemType.BULLET == CoreProps.f18955a.a(oVar)) {
            return new mf.b(eVar.f19176a, CoreProps.f18956b.a(oVar).intValue());
        }
        return new i(eVar.f19176a, String.valueOf(CoreProps.c.a(oVar)).concat(". "));
    }
}
