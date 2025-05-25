package i0;

import android.util.SparseArray;
import com.android.billingclient.api.b0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import y.f;
import y.i;

/* compiled from: DirectedAcyclicGraph.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f18402a;

    /* renamed from: b  reason: collision with root package name */
    public Object f18403b;
    public Object c;

    /* renamed from: d  reason: collision with root package name */
    public Object f18404d;

    public a(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                this.f18402a = new b0(10);
                this.f18403b = new i();
                this.c = new ArrayList();
                this.f18404d = new HashSet();
                return;
            }
            this.f18402a = new AtomicBoolean(false);
            return;
        }
        this.f18402a = new y.b();
        this.f18403b = new SparseArray();
        this.c = new f();
        this.f18404d = new y.b();
    }

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((i) this.f18403b).getOrDefault(obj, null);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    a(arrayList2.get(i10), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }
}
