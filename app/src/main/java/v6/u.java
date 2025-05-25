package v6;

import java.util.HashMap;
import v6.h;

/* compiled from: TransportImpl.java */
/* loaded from: classes.dex */
public final class u<T> implements s6.e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final s f30728a;

    /* renamed from: b  reason: collision with root package name */
    public final String f30729b;
    public final s6.b c;

    /* renamed from: d  reason: collision with root package name */
    public final s6.d<T, byte[]> f30730d;

    /* renamed from: e  reason: collision with root package name */
    public final v f30731e;

    public u(s sVar, String str, s6.b bVar, s6.d<T, byte[]> dVar, v vVar) {
        this.f30728a = sVar;
        this.f30729b = str;
        this.c = bVar;
        this.f30730d = dVar;
        this.f30731e = vVar;
    }

    public final void a(s6.a aVar, s6.g gVar) {
        s sVar = this.f30728a;
        if (sVar != null) {
            String str = this.f30729b;
            if (str != null) {
                s6.d<T, byte[]> dVar = this.f30730d;
                if (dVar != null) {
                    s6.b bVar = this.c;
                    if (bVar != null) {
                        i iVar = new i(sVar, str, aVar, dVar, bVar);
                        w wVar = (w) this.f30731e;
                        wVar.getClass();
                        s6.c<?> cVar = iVar.c;
                        j e10 = iVar.f30707a.e(cVar.c());
                        h.a aVar2 = new h.a();
                        aVar2.f30706f = new HashMap();
                        aVar2.f30704d = Long.valueOf(wVar.f30733a.a());
                        aVar2.f30705e = Long.valueOf(wVar.f30734b.a());
                        aVar2.d(iVar.f30708b);
                        Object b10 = cVar.b();
                        aVar2.c(new m(iVar.f30710e, iVar.f30709d.apply(b10)));
                        aVar2.f30703b = cVar.a();
                        wVar.c.a(gVar, aVar2.b(), e10);
                        return;
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        }
        throw new NullPointerException("Null transportContext");
    }
}
