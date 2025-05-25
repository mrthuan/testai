package i4;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: ActivityFragmentLifecycle.java */
/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final Set<g> f18436a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public boolean f18437b;
    public boolean c;

    public final void a() {
        this.c = true;
        Iterator it = p4.j.d(this.f18436a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).onDestroy();
        }
    }

    @Override // i4.f
    public final void b(g gVar) {
        this.f18436a.add(gVar);
        if (this.c) {
            gVar.onDestroy();
        } else if (this.f18437b) {
            gVar.onStart();
        } else {
            gVar.onStop();
        }
    }

    public final void c() {
        this.f18437b = true;
        Iterator it = p4.j.d(this.f18436a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).onStart();
        }
    }

    public final void d() {
        this.f18437b = false;
        Iterator it = p4.j.d(this.f18436a).iterator();
        while (it.hasNext()) {
            ((g) it.next()).onStop();
        }
    }

    @Override // i4.f
    public final void e(g gVar) {
        this.f18436a.remove(gVar);
    }
}
