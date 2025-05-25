package z3;

import java.util.ArrayDeque;
import z3.n;

/* compiled from: ModelCache.java */
/* loaded from: classes.dex */
public final class m extends p4.g<n.a<Object>, Object> {
    public m() {
        super(500L);
    }

    @Override // p4.g
    public final void c(n.a<Object> aVar, Object obj) {
        n.a<Object> aVar2 = aVar;
        aVar2.getClass();
        ArrayDeque arrayDeque = n.a.f32254d;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar2);
        }
    }
}
