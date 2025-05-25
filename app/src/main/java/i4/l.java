package i4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: RequestTracker.java */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final Set<l4.b> f18457a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f18458b = new ArrayList();
    public boolean c;

    public final boolean a(l4.b bVar) {
        boolean z10 = true;
        if (bVar == null) {
            return true;
        }
        boolean remove = this.f18457a.remove(bVar);
        if (!this.f18458b.remove(bVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            bVar.clear();
        }
        return z10;
    }

    public final void b() {
        Iterator it = p4.j.d(this.f18457a).iterator();
        while (it.hasNext()) {
            l4.b bVar = (l4.b) it.next();
            if (!bVar.j() && !bVar.g()) {
                bVar.clear();
                if (!this.c) {
                    bVar.h();
                } else {
                    this.f18458b.add(bVar);
                }
            }
        }
    }

    public final String toString() {
        return super.toString() + "{numRequests=" + this.f18457a.size() + ", isPaused=" + this.c + "}";
    }
}
