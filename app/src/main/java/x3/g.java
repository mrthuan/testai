package x3;

import v3.l;
import x3.h;

/* compiled from: LruResourceCache.java */
/* loaded from: classes.dex */
public final class g extends p4.g<t3.b, l<?>> implements h {

    /* renamed from: d  reason: collision with root package name */
    public h.a f31605d;

    @Override // p4.g
    public final int b(l<?> lVar) {
        l<?> lVar2 = lVar;
        if (lVar2 == null) {
            return 1;
        }
        return lVar2.getSize();
    }

    @Override // p4.g
    public final void c(t3.b bVar, l<?> lVar) {
        l<?> lVar2 = lVar;
        h.a aVar = this.f31605d;
        if (aVar != null && lVar2 != null) {
            ((com.bumptech.glide.load.engine.e) aVar).f6966e.a(lVar2, true);
        }
    }
}
