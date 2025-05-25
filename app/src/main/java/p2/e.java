package p2;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x2.p;
import x2.q;
import x2.r;

/* compiled from: Schedulers.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f23613a = 0;

    static {
        o2.h.e("Schedulers");
    }

    public static void a(androidx.work.a aVar, WorkDatabase workDatabase, List<d> list) {
        if (list != null && list.size() != 0) {
            q p10 = workDatabase.p();
            workDatabase.c();
            try {
                int i10 = Build.VERSION.SDK_INT;
                int i11 = aVar.f4908h;
                if (i10 == 23) {
                    i11 /= 2;
                }
                r rVar = (r) p10;
                ArrayList c = rVar.c(i11);
                ArrayList b10 = rVar.b();
                if (c.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = c.iterator();
                    while (it.hasNext()) {
                        rVar.k(currentTimeMillis, ((p) it.next()).f31558a);
                    }
                }
                workDatabase.j();
                workDatabase.g();
                if (c.size() > 0) {
                    p[] pVarArr = (p[]) c.toArray(new p[c.size()]);
                    for (d dVar : list) {
                        if (dVar.a()) {
                            dVar.e(pVarArr);
                        }
                    }
                }
                if (b10.size() > 0) {
                    p[] pVarArr2 = (p[]) b10.toArray(new p[b10.size()]);
                    for (d dVar2 : list) {
                        if (!dVar2.a()) {
                            dVar2.e(pVarArr2);
                        }
                    }
                }
            } catch (Throwable th2) {
                workDatabase.g();
                throw th2;
            }
        }
    }
}
