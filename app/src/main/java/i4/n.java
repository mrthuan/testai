package i4;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: TargetTracker.java */
/* loaded from: classes.dex */
public final class n implements g {

    /* renamed from: a  reason: collision with root package name */
    public final Set<m4.g<?>> f18464a = Collections.newSetFromMap(new WeakHashMap());

    @Override // i4.g
    public final void onDestroy() {
        Iterator it = p4.j.d(this.f18464a).iterator();
        while (it.hasNext()) {
            ((m4.g) it.next()).onDestroy();
        }
    }

    @Override // i4.g
    public final void onStart() {
        Iterator it = p4.j.d(this.f18464a).iterator();
        while (it.hasNext()) {
            ((m4.g) it.next()).onStart();
        }
    }

    @Override // i4.g
    public final void onStop() {
        Iterator it = p4.j.d(this.f18464a).iterator();
        while (it.hasNext()) {
            ((m4.g) it.next()).onStop();
        }
    }
}
