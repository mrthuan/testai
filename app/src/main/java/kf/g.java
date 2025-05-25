package kf;

import java.util.Iterator;
import jf.j;
import kf.o;
import qk.w;

/* compiled from: CorePlugin.java */
/* loaded from: classes.dex */
public final class g implements j.c<w> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f19733a;

    public g(o oVar) {
        this.f19733a = oVar;
    }

    @Override // jf.j.c
    public final void a(jf.j jVar, w wVar) {
        String str = wVar.f29383f;
        jf.m mVar = (jf.m) jVar;
        mVar.c.f19202a.append(str);
        o oVar = this.f19733a;
        if (!oVar.f19734a.isEmpty()) {
            mVar.y();
            str.length();
            Iterator it = oVar.f19734a.iterator();
            while (it.hasNext()) {
                ((o.a) it.next()).a();
            }
        }
    }
}
