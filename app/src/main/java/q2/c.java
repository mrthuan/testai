package q2;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.core.content.e;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o2.h;
import p2.d;
import p2.j;
import x2.p;
import y2.i;

/* compiled from: GreedyScheduler.java */
/* loaded from: classes.dex */
public final class c implements d, t2.c, p2.a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f29057a;

    /* renamed from: b  reason: collision with root package name */
    public final j f29058b;
    public final t2.d c;

    /* renamed from: e  reason: collision with root package name */
    public final b f29060e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f29061f;

    /* renamed from: h  reason: collision with root package name */
    public Boolean f29063h;

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f29059d = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    public final Object f29062g = new Object();

    static {
        h.e("GreedyScheduler");
    }

    public c(Context context, androidx.work.a aVar, z2.b bVar, j jVar) {
        this.f29057a = context;
        this.f29058b = jVar;
        this.c = new t2.d(context, bVar, this);
        this.f29060e = new b(this, aVar.f4905e);
    }

    @Override // p2.d
    public final boolean a() {
        return false;
    }

    @Override // p2.a
    public final void b(String str, boolean z10) {
        synchronized (this.f29062g) {
            Iterator it = this.f29059d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                p pVar = (p) it.next();
                if (pVar.f31558a.equals(str)) {
                    h c = h.c();
                    String.format("Stopping tracking for %s", str);
                    c.a(new Throwable[0]);
                    this.f29059d.remove(pVar);
                    this.c.c(this.f29059d);
                    break;
                }
            }
        }
    }

    @Override // p2.d
    public final void c(String str) {
        Runnable runnable;
        Boolean bool = this.f29063h;
        j jVar = this.f29058b;
        if (bool == null) {
            this.f29063h = Boolean.valueOf(i.a(this.f29057a, jVar.f23628b));
        }
        if (!this.f29063h.booleanValue()) {
            h.c().d(new Throwable[0]);
            return;
        }
        if (!this.f29061f) {
            jVar.f23631f.a(this);
            this.f29061f = true;
        }
        h c = h.c();
        String.format("Cancelling work ID %s", str);
        c.a(new Throwable[0]);
        b bVar = this.f29060e;
        if (bVar != null && (runnable = (Runnable) bVar.c.remove(str)) != null) {
            ((Handler) bVar.f29056b.f3529a).removeCallbacks(runnable);
        }
        jVar.j(str);
    }

    @Override // t2.c
    public final void d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            h c = h.c();
            String.format("Constraints not met: Cancelling work ID %s", str);
            c.a(new Throwable[0]);
            this.f29058b.j(str);
        }
    }

    @Override // p2.d
    public final void e(p... pVarArr) {
        boolean z10;
        if (this.f29063h == null) {
            this.f29063h = Boolean.valueOf(i.a(this.f29057a, this.f29058b.f23628b));
        }
        if (!this.f29063h.booleanValue()) {
            h.c().d(new Throwable[0]);
            return;
        }
        if (!this.f29061f) {
            this.f29058b.f23631f.a(this);
            this.f29061f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (p pVar : pVarArr) {
            long a10 = pVar.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f31559b == WorkInfo$State.ENQUEUED) {
                if (currentTimeMillis < a10) {
                    b bVar = this.f29060e;
                    if (bVar != null) {
                        HashMap hashMap = bVar.c;
                        Runnable runnable = (Runnable) hashMap.remove(pVar.f31558a);
                        e eVar = bVar.f29056b;
                        if (runnable != null) {
                            ((Handler) eVar.f3529a).removeCallbacks(runnable);
                        }
                        a aVar = new a(bVar, pVar);
                        hashMap.put(pVar.f31558a, aVar);
                        ((Handler) eVar.f3529a).postDelayed(aVar, pVar.a() - System.currentTimeMillis());
                    }
                } else if (pVar.b()) {
                    int i10 = Build.VERSION.SDK_INT;
                    o2.b bVar2 = pVar.f31566j;
                    if (bVar2.c) {
                        h c = h.c();
                        String.format("Ignoring WorkSpec %s, Requires device idle.", pVar);
                        c.a(new Throwable[0]);
                    } else {
                        if (i10 >= 24) {
                            if (bVar2.f22675h.f22679a.size() > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                h c10 = h.c();
                                String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", pVar);
                                c10.a(new Throwable[0]);
                            }
                        }
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f31558a);
                    }
                } else {
                    h c11 = h.c();
                    String.format("Starting work for %s", pVar.f31558a);
                    c11.a(new Throwable[0]);
                    this.f29058b.i(pVar.f31558a, null);
                }
            }
        }
        synchronized (this.f29062g) {
            if (!hashSet.isEmpty()) {
                h c12 = h.c();
                String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2));
                c12.a(new Throwable[0]);
                this.f29059d.addAll(hashSet);
                this.c.c(this.f29059d);
            }
        }
    }

    @Override // t2.c
    public final void f(List<String> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            h c = h.c();
            String.format("Constraints met: Scheduling work ID %s", str);
            c.a(new Throwable[0]);
            this.f29058b.i(str, null);
        }
    }
}
