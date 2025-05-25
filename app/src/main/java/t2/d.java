package t2;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import o2.h;
import u2.c;
import u2.e;
import u2.f;
import u2.g;

/* compiled from: WorkConstraintsTracker.java */
/* loaded from: classes.dex */
public final class d implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final c f29915a;

    /* renamed from: b  reason: collision with root package name */
    public final u2.c<?>[] f29916b;
    public final Object c;

    static {
        h.e("WorkConstraintsTracker");
    }

    public d(Context context, z2.a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f29915a = cVar;
        this.f29916b = new u2.c[]{new u2.a(applicationContext, aVar), new u2.b(applicationContext, aVar), new u2.h(applicationContext, aVar), new u2.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
        this.c = new Object();
    }

    public final boolean a(String str) {
        u2.c<?>[] cVarArr;
        boolean z10;
        synchronized (this.c) {
            for (u2.c<?> cVar : this.f29916b) {
                Object obj = cVar.f30142b;
                if (obj != null && cVar.c(obj) && cVar.f30141a.contains(str)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    h c = h.c();
                    String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName());
                    c.a(new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public final void b(ArrayList arrayList) {
        synchronized (this.c) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (a(str)) {
                    h c = h.c();
                    String.format("Constraints met for %s", str);
                    c.a(new Throwable[0]);
                    arrayList2.add(str);
                }
            }
            c cVar = this.f29915a;
            if (cVar != null) {
                cVar.f(arrayList2);
            }
        }
    }

    public final void c(Collection collection) {
        u2.c<?>[] cVarArr;
        u2.c<?>[] cVarArr2;
        synchronized (this.c) {
            for (u2.c<?> cVar : this.f29916b) {
                if (cVar.f30143d != null) {
                    cVar.f30143d = null;
                    cVar.e(null, cVar.f30142b);
                }
            }
            for (u2.c<?> cVar2 : this.f29916b) {
                cVar2.d(collection);
            }
            for (u2.c<?> cVar3 : this.f29916b) {
                if (cVar3.f30143d != this) {
                    cVar3.f30143d = this;
                    cVar3.e(this, cVar3.f30142b);
                }
            }
        }
    }

    public final void d() {
        u2.c<?>[] cVarArr;
        synchronized (this.c) {
            for (u2.c<?> cVar : this.f29916b) {
                ArrayList arrayList = cVar.f30141a;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    cVar.c.b(cVar);
                }
            }
        }
    }
}
