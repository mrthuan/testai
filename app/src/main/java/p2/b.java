package p2;

import androidx.lifecycle.w;
import o2.j;

/* compiled from: OperationImpl.java */
/* loaded from: classes.dex */
public final class b implements o2.j {
    public final w<j.a> c = new w<>();

    /* renamed from: d  reason: collision with root package name */
    public final androidx.work.impl.utils.futures.a<j.a.c> f23599d = new androidx.work.impl.utils.futures.a<>();

    public b() {
        a(o2.j.f22688b);
    }

    public final void a(j.a aVar) {
        this.c.k(aVar);
        boolean z10 = aVar instanceof j.a.c;
        androidx.work.impl.utils.futures.a<j.a.c> aVar2 = this.f23599d;
        if (z10) {
            aVar2.h((j.a.c) aVar);
        } else if (aVar instanceof j.a.C0302a) {
            aVar2.i(((j.a.C0302a) aVar).f22689a);
        }
    }
}
