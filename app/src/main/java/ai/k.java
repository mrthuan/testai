package ai;

import gj.l;
import java.util.ArrayList;

/* compiled from: ViewContainer.java */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f549a = new ArrayList();

    public final synchronized void a(l lVar) {
        if (lVar.f488k < 1152921504606846976L) {
            this.f549a.add(lVar);
        }
    }

    public final synchronized void b() {
        ArrayList arrayList = this.f549a;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final synchronized void c() {
        ArrayList arrayList = this.f549a;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final synchronized e d(long j10) {
        int size = this.f549a.size();
        if (size != 0 && j10 >= 0 && j10 < ((e) this.f549a.get(size - 1)).a()) {
            int i10 = 0;
            while (true) {
                int i11 = (size + i10) / 2;
                e eVar = (e) this.f549a.get(i11);
                long b10 = eVar.b();
                long a10 = eVar.a();
                if (j10 >= b10 && j10 < a10) {
                    return eVar;
                }
                if (b10 > j10) {
                    size = i11 - 1;
                } else if (a10 <= j10) {
                    i10 = i11 + 1;
                }
            }
        }
        return null;
    }
}
