package k4;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import p4.i;
import v3.e;
import v3.j;

/* compiled from: LoadPathCache.java */
/* loaded from: classes.dex */
public final class b {
    public static final j<?, ?, ?> c = new j<>(Object.class, Object.class, Object.class, Collections.singletonList(new e(Object.class, Object.class, Object.class, Collections.emptyList(), new o9.d(), null)), null);

    /* renamed from: a  reason: collision with root package name */
    public final y.b<i, j<?, ?, ?>> f19576a = new y.b<>();

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<i> f19577b = new AtomicReference<>();

    public final void a(Class<?> cls, Class<?> cls2, Class<?> cls3, j<?, ?, ?> jVar) {
        synchronized (this.f19576a) {
            y.b<i, j<?, ?, ?>> bVar = this.f19576a;
            i iVar = new i(cls, cls2, cls3);
            if (jVar == null) {
                jVar = c;
            }
            bVar.put(iVar, jVar);
        }
    }
}
